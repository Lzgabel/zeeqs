package io.zeebe.zeeqs

import com.shuwen.diamond.spring.client.DiamondPropertySourceFactory
import com.shuwen.ops.shaman.configmap.ShamanPropertySourceFactory
import io.zeebe.zeeqs.importer.hazelcast.HazelcastImporter
import io.zeebe.zeeqs.importer.hazelcast.HazelcastProperties
import org.slf4j.LoggerFactory
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication
import org.springframework.cache.annotation.EnableCaching
import org.springframework.context.annotation.PropertySource
import org.springframework.context.annotation.PropertySources
import javax.annotation.PostConstruct

fun main(args: Array<String>) {
    runApplication<ZeeqlApplication>(*args)
}

@SpringBootApplication
@EnableCaching
@PropertySource(name = "k8s-app", value = ["zeebe-zeeqs"], factory = ShamanPropertySourceFactory::class)
@EnableConfigurationProperties(HazelcastProperties::class)
class ZeeqlApplication(
        val hazelcastProperties: HazelcastProperties,
        val hazelcastImporter: HazelcastImporter
) {
    val logger = LoggerFactory.getLogger(ZeeqlApplication::class.java)

    @PostConstruct
    fun init() {
        logger.info("Connecting to Hazelcast: '$hazelcastProperties'")
        hazelcastImporter.start(hazelcastProperties)
        logger.info("Connected to Hazelcast!")
    }
}

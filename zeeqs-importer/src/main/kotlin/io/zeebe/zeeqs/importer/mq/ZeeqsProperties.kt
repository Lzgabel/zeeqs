package io.zeebe.zeeqs.importer.mq

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.ConstructorBinding
import org.springframework.context.annotation.Configuration

@ConstructorBinding
@ConfigurationProperties("zeebe.client.worker.zeeqs")
class ZeeqsProperties(
        val address: String = "",
        val accessKey: String = "",
        val accessSecret: String = "",
        val groupId: String = "",
        val topic: String = ""
)

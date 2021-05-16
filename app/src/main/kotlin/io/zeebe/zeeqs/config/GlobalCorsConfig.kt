package io.zeebe.zeeqs.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.cors.CorsConfiguration
import org.springframework.web.cors.UrlBasedCorsConfigurationSource
import org.springframework.web.filter.CorsFilter

/**
 * 全局跨域设置
 * @author lizhi
 * @date 2021-05-16
 */

@Configuration
class GlobalCorsConfig {

    @Bean
    fun corsFilter(): CorsFilter? {
        //1.添加CORS配置信息
        val config = CorsConfiguration()
        config.addAllowedOrigin("*")
        config.addAllowedMethod("*")
        config.addAllowedHeader("*")
        config.addExposedHeader("*")

        //2.添加映射路径
        val configSource = UrlBasedCorsConfigurationSource()
        configSource.registerCorsConfiguration("/**", config)

        //3.返回新的CorsFilter.
        return CorsFilter(configSource)
    }
}

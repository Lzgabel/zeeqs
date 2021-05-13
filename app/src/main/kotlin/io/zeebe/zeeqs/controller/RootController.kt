package io.zeebe.zeeqs.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * 健康检查
 * @author lizhi
 * @date 2021-05-13
 * @since 1.0.0
 */
@RequestMapping("/")
@RestController
class RootController {

    @GetMapping("ok")
    fun ok(): String {
        return "ok"
    }
}

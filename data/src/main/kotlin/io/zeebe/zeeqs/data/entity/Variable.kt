package io.zeebe.zeeqs.data.entity

import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Lob
import javax.persistence.Column

@Entity
class Variable(
        @Id @Column(name="`key`") val key: Long,
        val name: String,
        val workflowInstanceKey: Long,
        val scopeKey: Long,
        @Lob var value: String,
        var timestamp: Long
)

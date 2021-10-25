package io.zeebe.zeeqs.data.entity

import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Lob
import javax.persistence.Column

@Entity
data class Process(
        @Id @Column(name="`key`") val key: Long,
        val bpmnProcessId: String,
        val version: Int,
        @Lob val bpmnXML: String,
        val deployTime: Long,
        val resourceName: String,
        val checksum: String)

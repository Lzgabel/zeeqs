package io.zeebe.zeeqs.data.entity

import javax.persistence.Entity
import javax.persistence.Enumerated
import javax.persistence.EnumType
import javax.persistence.Id
import javax.persistence.Column

@Entity
data class ProcessInstance(
        @Id @Column(name="`key`") val key: Long,
        val bpmnProcessId: String,
        val version: Int,
        val processDefinitionKey: Long,
        val parentProcessInstanceKey: Long?,
        val parentElementInstanceKey: Long?) {

    @Enumerated(EnumType.STRING)
    var state: ProcessInstanceState = ProcessInstanceState.ACTIVATED

    var startTime: Long? = null
    var endTime: Long? = null
}

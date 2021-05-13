package io.zeebe.zeeqs.data.entity

import javax.persistence.Entity
import javax.persistence.Enumerated
import javax.persistence.EnumType
import javax.persistence.Id
import javax.persistence.Column

@Entity
data class WorkflowInstance(
        @Id @Column(name="`key`") val key: Long,
        val bpmnProcessId: String,
        val version: Int,
        val workflowKey: Long,
        val parentWorkflowInstanceKey: Long?,
        val parentElementInstanceKey: Long?) {

    @Enumerated(EnumType.STRING)
    var state: WorkflowInstanceState = WorkflowInstanceState.ACTIVATED

    var startTime: Long? = null
    var endTime: Long? = null
}

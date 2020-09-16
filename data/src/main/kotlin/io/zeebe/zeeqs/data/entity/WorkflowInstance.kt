package io.zeebe.zeeqs.data.entity

import javax.persistence.Entity
import javax.persistence.Enumerated
import javax.persistence.EnumType
import javax.persistence.Id

@Entity
data class WorkflowInstance(
        @Id val key: Long,
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

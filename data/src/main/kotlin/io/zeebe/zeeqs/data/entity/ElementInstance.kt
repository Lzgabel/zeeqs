package io.zeebe.zeeqs.data.entity

import javax.persistence.Entity
import javax.persistence.Enumerated
import javax.persistence.EnumType
import javax.persistence.Id
import javax.persistence.Column

@Entity
class ElementInstance(
        @Id @Column(name="`key`") val key: Long,
        val elementId: String,
        @Enumerated(EnumType.STRING)
        val bpmnElementType: BpmnElementType,
        val workflowInstanceKey: Long,
        val workflowKey: Long,
        val scopeKey: Long?
) {


    var state: ElementInstanceState = ElementInstanceState.ACTIVATING

    var startTime: Long? = null
    var endTime: Long? = null

}

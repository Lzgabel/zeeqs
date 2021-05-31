package io.zeebe.zeeqs.data.entity

import javax.persistence.Entity
import javax.persistence.Enumerated
import javax.persistence.EnumType
import javax.persistence.Id
import javax.persistence.Column

@Entity
class Timer(
    @Id @Column(name="`key`") val key: Long,,
    val position: Long,
    val dueDate: Long,
    var repetitions: Int,
    val processInstanceKey: Long?,
    val elementInstanceKey: Long?,
    val processDefinitionKey: Long?
) {

    @Enumerated(EnumType.STRING)
    var state: TimerState = TimerState.CREATED

    var startTime: Long? = null
    var endTime: Long? = null

}

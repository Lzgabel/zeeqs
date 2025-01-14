package io.zeebe.zeeqs.data.entity

import javax.persistence.Entity
import javax.persistence.Enumerated
import javax.persistence.EnumType
import javax.persistence.Id
import javax.persistence.Column

@Entity
class Message(
        @Id @Column(name="`key`") val key: Long,
        val position: Long,
        val name: String,
        val correlationKey: String?,
        val messageId: String?,
        val timeToLive: Long
) {

    @Enumerated(EnumType.STRING)
    var state: MessageState = MessageState.PUBLISHED
    var timestamp: Long = -1
}

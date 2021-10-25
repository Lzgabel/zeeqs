package io.zeebe.zeeqs.data.repository

import io.zeebe.zeeqs.data.entity.ElementInstance
import io.zeebe.zeeqs.data.entity.ElementInstanceState
import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.stereotype.Repository

@Repository
interface ElementInstanceRepository : PagingAndSortingRepository<ElementInstance, Long> {

    fun findByProcessInstanceKey(processInstanceKey: Long): List<ElementInstance>

    fun findByProcessInstanceKeyAndStateIn(processInstanceKey: Long, stateIn: List<ElementInstanceState>): List<ElementInstance>
}

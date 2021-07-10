package io.zeebe.zeeqs.importer.hazelcast

import org.springframework.data.jpa.repository.Modifying
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository
import javax.transaction.Transactional

@Repository
interface HazelcastConfigRepository : CrudRepository<HazelcastConfig, String> {

    @Query(value = "select new HazelcastConfig(id, deployEnv, sequence) from HazelcastConfig " +
            "where id = :#{#config.id} and deployEnv = :#{#config.deployEnv}")
    fun findBy(@Param("config") config: HazelcastConfig): HazelcastConfig?


    @Modifying
    @Transactional
    @Query(value = "update HazelcastConfig set sequence= :#{#config.sequence} " +
            "where id = :#{#config.id} and deployEnv = :#{#config.deployEnv}")
    fun saveBy(@Param("config") config: HazelcastConfig): Int?
}

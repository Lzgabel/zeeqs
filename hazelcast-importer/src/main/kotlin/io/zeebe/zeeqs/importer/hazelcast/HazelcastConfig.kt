package io.zeebe.zeeqs.importer.hazelcast

import javax.persistence.Entity
import javax.persistence.Id

@Entity
data class HazelcastConfig(
        @Id val id: String,
        var deployEnv: String,
        var sequence: Long)

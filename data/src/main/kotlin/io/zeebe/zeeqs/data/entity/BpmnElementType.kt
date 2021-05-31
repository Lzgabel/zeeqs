package io.zeebe.zeeqs.data.entity

enum class BpmnElementType {
    UNSPECIFIED,
    PROCESS,
    SUB_PROCESS,
    EVENT_SUB_PROCESS,
    START_EVENT,
    INTERMEDIATE_CATCH_EVENT,
    BOUNDARY_EVENT,
    END_EVENT,
    SERVICE_TASK,
    RECEIVE_TASK,
    EXCLUSIVE_GATEWAY,
    PARALLEL_GATEWAY,
    EVENT_BASED_GATEWAY,
    SEQUENCE_FLOW,
    MULTI_INSTANCE_BODY,
    CALL_ACTIVITY,
    USER_TASK
}

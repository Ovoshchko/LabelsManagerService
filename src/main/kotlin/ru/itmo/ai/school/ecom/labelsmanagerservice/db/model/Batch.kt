package ru.itmo.ai.school.ecom.labelsmanagerservice.db.model

import jakarta.persistence.*
import java.util.UUID
import java.time.LocalDateTime

@Entity
@Table(name = "batch")
data class Batch(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: UUID = UUID.randomUUID(),

    @Column(nullable = false, length = 255)
    val name: String,

    @Column(nullable = false, length = 255)
    val status: String,

    @Column(nullable = false, length = 255)
    val owner: String,

    @Column(nullable = false)
    val priority: Int = 1,

    @Column(columnDefinition = "jsonb")
    val agreements: String? = null,

    @Column(name = "overlap_coefficient", nullable = false)
    val overlapCoefficient: Int = 1,

    @Column(name = "created_at", nullable = false)
    val createdAt: LocalDateTime,

    @ManyToOne
    @JoinColumn(name = "task_type_id", nullable = false)
    val taskType: TaskType,

    @Column(name = "is_educational", nullable = false)
    val isEducational: Boolean = false
) {
    constructor() : this(
        id = UUID.randomUUID(),
        name = "",
        status = "",
        owner = "",
        priority = 1,
        agreements = null,
        overlapCoefficient = 1,
        createdAt = LocalDateTime.now(),
        taskType = TaskType(),
        isEducational = false
    )
}

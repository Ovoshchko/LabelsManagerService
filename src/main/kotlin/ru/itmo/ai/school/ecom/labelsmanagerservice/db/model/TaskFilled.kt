package ru.itmo.ai.school.ecom.labelsmanagerservice.db.model

import jakarta.persistence.*
import java.util.UUID
import java.time.LocalDateTime

@Entity
@Table(name = "task_filled")
data class TaskFilled(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: UUID = UUID.randomUUID(),

    @ManyToOne
    @JoinColumn(name = "task_id", nullable = false)
    val task: Task,

    @Column(columnDefinition = "jsonb")
    val answer: String? = null,

    @Column(nullable = false, length = 255)
    val filledBy: String,

    @Column(name = "created_at", nullable = false)
    val createdAt: LocalDateTime
) {
    constructor() : this(
        id = UUID.randomUUID(),
        task = Task(),
        answer = null,
        filledBy = "",
        createdAt = LocalDateTime.now()
    )
}

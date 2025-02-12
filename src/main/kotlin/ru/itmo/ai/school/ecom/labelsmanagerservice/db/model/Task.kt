package ru.itmo.ai.school.ecom.labelsmanagerservice.db.model

import jakarta.persistence.*
import java.util.UUID

@Entity
@Table(name = "task")
data class Task(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: UUID = UUID.randomUUID(),

    @Column(nullable = false, length = 255)
    val name: String,

    @Column(nullable = false)
    val s3Path: String,

    @ManyToOne
    @JoinColumn(name = "batch_id", nullable = false)
    val batch: Batch,

    @Column(columnDefinition = "jsonb")
    val metadata: String? = null,

    @Column(name = "is_honeypot", nullable = false)
    val isHoneypot: Boolean = false,

    @Column(nullable = false, length = 255)
    val status: String = "NOT_STARTED",

    @Column(name = "filled_count", nullable = false)
    val filledCount: Int = 0,

    @Column(name = "final_answer", columnDefinition = "jsonb")
    val finalAnswer: String? = null
) {
    constructor() : this(
        id = UUID.randomUUID(),
        name = "",
        s3Path = "",
        batch = Batch(),
        metadata = null,
        isHoneypot = false,
        status = "NOT_STARTED",
        filledCount = 0,
        finalAnswer = null
    )
}

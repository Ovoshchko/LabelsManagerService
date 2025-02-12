package ru.itmo.ai.school.ecom.labelsmanagerservice.db.model

import jakarta.persistence.*
import java.util.UUID

@Entity
@Table(name = "task_type")
data class TaskType(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: UUID = UUID.randomUUID(),

    @Column(nullable = false, length = 255)
    val name: String,

    @Column(name = "annotation_metadata", columnDefinition = "jsonb")
    val annotationMetadata: String? = null,

    @Column(length = 255)
    val description: String? = null
) {
    constructor() : this(
        id = UUID.randomUUID(),
        name = "",
        annotationMetadata = null,
        description = null
    )
}


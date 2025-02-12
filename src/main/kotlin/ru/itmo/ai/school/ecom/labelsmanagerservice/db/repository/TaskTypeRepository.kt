package ru.itmo.ai.school.ecom.labelsmanagerservice.db.repository

import org.springframework.data.jpa.repository.JpaRepository
import ru.itmo.ai.school.ecom.labelsmanagerservice.db.model.TaskType
import java.util.UUID

interface TaskTypeRepository : JpaRepository<TaskType, UUID>
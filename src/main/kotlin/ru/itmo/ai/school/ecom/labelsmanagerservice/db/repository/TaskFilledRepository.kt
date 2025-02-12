package ru.itmo.ai.school.ecom.labelsmanagerservice.db.repository

import org.springframework.data.jpa.repository.JpaRepository
import ru.itmo.ai.school.ecom.labelsmanagerservice.db.model.TaskFilled
import java.util.UUID

interface TaskFilledRepository : JpaRepository<TaskFilled, UUID>
package ru.itmo.ai.school.ecom.labelsmanagerservice.db.repository

import org.springframework.data.jpa.repository.JpaRepository
import ru.itmo.ai.school.ecom.labelsmanagerservice.db.model.Task
import java.util.*

interface TaskRepository : JpaRepository<Task, UUID>
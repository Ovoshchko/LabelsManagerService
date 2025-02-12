package ru.itmo.ai.school.ecom.labelsmanagerservice.db.repository

import org.springframework.data.jpa.repository.JpaRepository
import ru.itmo.ai.school.ecom.labelsmanagerservice.db.model.Batch
import java.util.*

interface BatchRepository : JpaRepository<Batch, UUID>
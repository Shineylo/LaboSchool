package technobel.bart.laboschool.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import technobel.bart.laboschool.models.entity.Equipment;

public interface EquipmentRepository extends JpaRepository<Equipment,Long> {
}

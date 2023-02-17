package technobel.bart.laboschool.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import technobel.bart.laboschool.models.entity.Classroom;

public interface ClassroomRepository extends JpaRepository<Classroom,Long> {
}

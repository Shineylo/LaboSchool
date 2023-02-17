package technobel.bart.laboschool.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import technobel.bart.laboschool.models.entity.Request;

public interface RequestRepository extends JpaRepository<Request,Long> {
}

package technobel.bart.laboschool.utils;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;
import technobel.bart.laboschool.models.entity.Classroom;
import technobel.bart.laboschool.models.entity.Equipment;
import technobel.bart.laboschool.repository.ClassroomRepository;
import technobel.bart.laboschool.repository.EquipmentRepository;

import java.util.Set;

@Component
@Log4j2
public class DataInit implements InitializingBean {
    private final ClassroomRepository classroomRepository;
    private final EquipmentRepository equipmentRepository;

    public DataInit(ClassroomRepository classroomRepository, EquipmentRepository equipmentRepository) {
        this.classroomRepository = classroomRepository;
        this.equipmentRepository = equipmentRepository;
    }

    @Override
    public void afterPropertiesSet() throws Exception {

        log.info("-- INITIALIZING DB DATA --");

        Equipment e1 = new Equipment();
        e1.setName("Interactive board");


        Equipment e2 = new Equipment();
        e2.setName("Tv");


        Equipment e3 = new Equipment();
        e3.setName("Audio");

        e1 = equipmentRepository.save(e1);
        e2 = equipmentRepository.save(e2);
        e3 = equipmentRepository.save(e3);

        Classroom c1 = new Classroom();
        c1.setName("100");
        c1.setCapacity(50);
        c1.setTeacherOnly(false);
        c1.setEquipments(
                Set.of(
                        e1
                )
        );

        Classroom c2 = new Classroom();
        c2.setName("101");
        c2.setCapacity(100);
        c2.setTeacherOnly(true);
        c2.setEquipments(
                Set.of(
                        e1,
                        e2,
                        e3
                )
        );

        Classroom c3 = new Classroom();
        c3.setName("103");
        c3.setCapacity(35);
        c3.setTeacherOnly(false);
        c3.setEquipments(
                Set.of(
                        e2,
                        e3
                )
        );

        c1 = classroomRepository.save(c1);
        c2 = classroomRepository.save(c2);
        c3 = classroomRepository.save(c3);

        log.info("-- DATA INIT FINISHED --");
    }
}

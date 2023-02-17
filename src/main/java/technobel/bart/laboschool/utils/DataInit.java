package technobel.bart.laboschool.utils;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;
import technobel.bart.laboschool.models.entity.Classroom;
import technobel.bart.laboschool.models.entity.Equipment;
import technobel.bart.laboschool.repository.ClassroomRepository;
import technobel.bart.laboschool.repository.EquipmentRepository;

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

        Classroom c1 = new Classroom();
        c1.setName("100");
        c1.setCapacity(50);
        c1.setTeacherOnly(false);

        Classroom c2 = new Classroom();
        c2.setName("101");
        c2.setCapacity(100);
        c2.setTeacherOnly(true);

        Classroom c3 = new Classroom();
        c3.setName("103");
        c3.setCapacity(35);
        c3.setTeacherOnly(false);

        c1 = classroomRepository.save(c1);
        c2 = classroomRepository.save(c2);
        c3 = classroomRepository.save(c3);

        Equipment e1 = new Equipment();
        e1.setName("100");


        Equipment e2 = new Equipment();
        e2.setName("101");


        Equipment e3 = new Equipment();
        e3.setName("103");


        e1 = equipmentRepository.save(e1);
        e2 = equipmentRepository.save(e2);
        e3 = equipmentRepository.save(e3);

        log.info("-- DATA INIT FINISHED --");
    }
}

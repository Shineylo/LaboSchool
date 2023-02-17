package technobel.bart.laboschool.utils;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;
import technobel.bart.laboschool.models.entity.Classroom;
import technobel.bart.laboschool.repository.ClassroomRepository;

import java.util.Set;

@Component
@Log4j2
public class DataInit implements InitializingBean {
    private final ClassroomRepository classroomRepository;

    public DataInit(ClassroomRepository classroomRepository) {
        this.classroomRepository = classroomRepository;
    }

    @Override
    public void afterPropertiesSet() throws Exception {

        log.info("-- INITIALIZING DB DATA --");

        Classroom s1 = new Classroom();
        s1.setName("100");
        s1.setCapacity(50);
        s1.setTeacherOnly(false);

        Classroom s2 = new Classroom();
        s2.setName("101");
        s2.setCapacity(100);
        s2.setTeacherOnly(true);

        Classroom s3 = new Classroom();
        s3.setName("103");
        s3.setCapacity(35);
        s3.setTeacherOnly(false);

        s1 = classroomRepository.save(s1);
        s2 = classroomRepository.save(s2);
        s3 = classroomRepository.save(s3);

        log.info("-- DATA INIT FINISHED --");
    }
}

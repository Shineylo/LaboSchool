package technobel.bart.laboschool.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import technobel.bart.laboschool.service.ClassroomService;
import technobel.bart.laboschool.service.EquipmentService;

@Controller
@RequestMapping("/classroom")
public class ClassroomController {
    private final ClassroomService classroomService;



    public ClassroomController(ClassroomService classroomService, EquipmentService equipmentService) {
        this.classroomService = classroomService;
    }

    //GET - /classroom
    @GetMapping("/all")
    public String getAll(Model model){
        model.addAttribute("list", classroomService.getAll());
        return "classroom/display-all";
    }
}

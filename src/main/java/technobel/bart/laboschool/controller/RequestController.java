package technobel.bart.laboschool.controller;

import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import technobel.bart.laboschool.models.form.request.RequestNewForm;
import technobel.bart.laboschool.service.EquipmentService;
import technobel.bart.laboschool.service.RequestService;

@Controller
@RequestMapping("/request")
public class RequestController {
    private final RequestService requestService;
    private final EquipmentService equipmentService;

    public RequestController(RequestService requestService, EquipmentService equipmentService) {
        this.requestService = requestService;
        this.equipmentService = equipmentService;
    }

    //GET - /request/all
    @GetMapping("/all")
    public String getAll(Model model){
        model.addAttribute("list", requestService.getAll());
        return "request/display-waiting";
    }

    //GET - /request/add
    @GetMapping("/add")
    public String insertForm(Model model){
        model.addAttribute("form", new RequestNewForm());
        model.addAttribute("equipments", equipmentService.getAll());
        return "request/new-form";
    }

    //POST - /request/add
    @PostMapping("/add")
    public String processInsertForm(@ModelAttribute("form") @Valid RequestNewForm form, BindingResult bindingResult){
        if(bindingResult.hasErrors() ) {
            return "request/new-form";
        }

        requestService.insert(form);
        return "redirect:/";
    }
}

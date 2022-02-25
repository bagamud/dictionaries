package peter.ic.dictionaries.controller;

import org.apache.coyote.Request;
import org.springframework.web.bind.annotation.*;
import peter.ic.dictionaries.entity.Department;
import peter.ic.dictionaries.reposiory.DepartmentRepository;

@RestController
@RequestMapping("/department")
public class DepartmentController {

    final DepartmentRepository departmentRepository;

    public DepartmentController(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    @RequestMapping(value = "", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public Iterable<Department> getAll() {
        return departmentRepository.findAll();
    }

    @GetMapping(value = "/{code}",produces = "application/json")
    @ResponseBody
    public Department get(@PathVariable(name = "code") int code) {
        return departmentRepository.findByDepartmentCode(code);
    }
}
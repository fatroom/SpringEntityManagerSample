package org.noisyteam.samples.spring.entitymanager.controller;

import org.noisyteam.samples.spring.entitymanager.model.Person;
import org.noisyteam.samples.spring.entitymanager.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Roman Romanchuk (fatroom@gmail.com)
 */
@Controller("/person")
public class PersonController {
    @Autowired
    private PersonService personService;

    public String list(Model model) {
        model.addAttribute("persons", personService.findAllPersons());
        return "WEB-INF/view/person/list.jsp";
    }

    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public String showCreateForm() {
        return "WEB-INF/view/person/create.jsp";
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public String create(Person person) {
        personService.merge(person);
        return "WEB-INF/view/person/list.jsp";
    }
}

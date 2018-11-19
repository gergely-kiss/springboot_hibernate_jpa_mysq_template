package uk.gergely.kiss.app;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping
public class RestHelloAPI {
	@Autowired
	private UserVORepository userVORepository;

	@GetMapping()
	public @ResponseBody String respondImAlive() {
		return new String("I'm alive!");
	}

	@GetMapping(path = "/db")
	public @ResponseBody List<UserVO> getAllUserNamesFromDB() {
		return (List<UserVO>) userVORepository.findAll();
	}
}

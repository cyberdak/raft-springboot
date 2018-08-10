package q.q;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HeartBeatController {
	public void requestVotes() {

	}

	public void appendEntries() {

	}
	
	@GetMapping("/test")
	public String test() {
		return "success";
	}
}

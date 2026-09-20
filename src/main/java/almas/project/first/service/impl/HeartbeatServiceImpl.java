package almas.project.first.service.impl;

import almas.project.first.service.HeartbeatService;
import org.springframework.stereotype.Service;

@Service
public class HeartbeatServiceImpl implements HeartbeatService {

	@Override
	public void logHeartbeat() {
		System.out.println("sh_every_10_sec");
	}
}
package almas.project.first.scheduler;

import almas.project.first.service.HeartbeatService;
import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class HeartbeatScheduler {

	private final HeartbeatService heartbeatService;

	@Scheduled(fixedRate = 10000)
	public void runEvery10Seconds() {
		heartbeatService.logHeartbeat();
	}
}
package xvia.cloud.xvia_cloud_interface;

import java.util.ArrayList;
import java.util.List;

public class TrackViaCloudLogger {
	protected List<String> logs = new ArrayList<>();
	
	public TrackViaCloudLogger() {}
	
	public void log(String message) {
		logs.add(message);
	}

	public List<String> getLogs() {
		return logs;
	}

	public void setLogs(List<String> logs) {
		this.logs = logs;
	}
}

package xvia.cloud.xvia_cloud_interface;

public class TrackViaCloudResponse {
	Boolean status;
	String data;

	TrackViaCloudLogger logger;
	
	String errorMessage;
	
	public TrackViaCloudResponse() {}
	
	public TrackViaCloudResponse(Boolean status, String data) {
		this.status = status;
		this.data = data;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public TrackViaCloudLogger getLogger() {
		return logger;
	}

	public void setLogger(TrackViaCloudLogger logger) {
		this.logger = logger;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
}

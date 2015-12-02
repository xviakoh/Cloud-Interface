package xvia.cloud.xvia_cloud_interface;

import com.amazonaws.services.lambda.runtime.Context;

public interface TrackViaCloudInterface {
	public TrackViaCloudResponse handleRequest(TrackViaCloudRequest request, Context context);
}







package hk.edu.vtc.it.cloudservices.client;

import retrofit.RestAdapter;

public class Run {
	private static final String API_URL = "http://localhost:8080/";

	public static void main(String[] args) {

		RestAdapter restAdapter = new RestAdapter.Builder()
				.setLogLevel(RestAdapter.LogLevel.FULL).setEndpoint(API_URL)
				.build();

		MemberServices service = restAdapter.create(MemberServices.class);
		MemberResponse memberResponse = service.memberList();

		for (Member member : memberResponse.get_embedded().getMembers()) {
			System.out.println(member);
		}
		System.out.println(memberResponse.getPage());

	}

}

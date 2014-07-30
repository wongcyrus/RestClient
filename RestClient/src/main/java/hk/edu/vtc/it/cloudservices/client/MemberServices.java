package hk.edu.vtc.it.cloudservices.client;

import retrofit.http.GET;

public interface MemberServices {

	//	public Member findByUsername(@Param("username") String username);
	
	@GET("/members/")
	MemberResponse memberList();

}

package com.pantau.util;

import com.pantau.dto.DtoResponse;

public class ResponseUtil {

	public static DtoResponse response(int status, String message) {

		DtoResponse res = new DtoResponse();
		res.setStatus(status);
		res.setMessage(message);

		return res;
	}

}

package com.example.server.util;


import com.example.server.VO.ResultVO;

/**
 * @author Yifan Chen
 * @version 1.0.0
 * @since 6/15/2020
 */
public class ResultVOUtil {

	public static ResultVO success(Object object) {
		ResultVO resultVO = new ResultVO();
		resultVO.setData(object);
		resultVO.setMessage("success");
		resultVO.setCode(100);

		return resultVO;
	}

	public static ResultVO success() {
		return success(null);
	}

	public static ResultVO error(Integer code, String msg) {
		ResultVO resultVO = new ResultVO();
		resultVO.setCode(code);
		resultVO.setMessage(msg);
		return resultVO;
	}
}

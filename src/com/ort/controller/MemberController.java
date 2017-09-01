//package com.ort.controller;
//
//import java.util.Map;
//
//import com.ort.entity.TMember;
//import com.ort.entity.frame.Result;
//import com.ort.service.MemberService;
//
//public class MemberController extends MyController {
//	
//	private static final MemberService memberService = new MemberService();
//	
//	public void updateMemberInfo(){
//		TMember member = getEntity(TMember.class);
//		
//		memberService.updateMember(member);
//		Result result = new Result();
//		
//		renderJson(result);
//	}
//	
//}

package com.finance.finance.controller;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.finance.finance.entity.Member;
import com.finance.finance.exception.ValidationException;
import com.finance.finance.repository.MemberRepository;

@RestController
public class MemberController {
	@Autowired
	MemberRepository memberRepo;
	
	@PostMapping("/member")
	Member dataStore(@RequestBody Member member ) throws ValidationException {
		validateMember(member);
		return memberRepo.save(member);
		
	}

	private void validateMember(Member member) throws ValidationException {
		/*if(StringUtils.isEmpty(member.getName())||
				StringUtils.isEmpty(member.getMob())||
				member.getMob().length()!=10||
				!member.getMob().matches("-?\\d+")){
			throw new ValidationException("Request values are not correct");
			
		}*/
		if(StringUtils.isEmpty(member.getName())){
			throw new ValidationException("Name should not be empty");
			
		}
		if(
				StringUtils.isEmpty(member.getMob())){
			throw new ValidationException("Mobile number should not be empty");
			
		}
		if(member.getMob().length()!=10||
				!member.getMob().matches("-?\\d+")){
			throw new ValidationException("Please enter valid mobile number");
			
		}
	}

}

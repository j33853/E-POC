package com.wellcare.rules;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Helper {

	public static boolean isValidMBI( String mbi ) {

		if(mbi==null || mbi.isEmpty()){
			return false;
		}
		
		mbi = mbi.replace("-", "");
	    if(mbi.length()!=11) {
	    	return false;
	    }


	    final String regex = "^\\d(?![SLOIBZ])[A-Z][A-Z0-9]\\d(?![SLOIBZ])[A-Z][A-Z0-9]\\d(?![SLOIBZ])[A-Z](?![SLOIBZ])[A-Z]\\d\\d$";
	    
	    final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
	    final Matcher matcher = pattern.matcher(mbi);

	    if(!matcher.find()) {
	    	return false;
	    }


	    return true;
	}
	
	public static void main(String args[]) {
		System.out.println(Helper.isValidMBI("1EG4-TE5-MK73"));
	}
}

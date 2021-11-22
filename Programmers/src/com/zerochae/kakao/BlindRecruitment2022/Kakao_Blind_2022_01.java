package com.zerochae.kakao.BlindRecruitment2022;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Kakao_Blind_2022_01 {
	
	public static void main(String[] args) {
		
		String id_list[] = {"muzi","apeach","frodo","neo"};
		//String id_list[] = {"con", "ryan"};
		String report[] = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
		//String report[] = {"ryan con", "ryan con", "ryan con", "ryan con"};
		int k = 2;
		
		System.out.println(Arrays.toString(solution(id_list,report,k)));
		
	}
	
	public static int[] solution(String[] id_list, String[] report, int k) {
		
       	HashMap<String,Integer > badUserMap = new HashMap<String ,Integer>();
		HashMap<String,Integer > goodUserMap = new HashMap<String ,Integer>();
		HashSet<String> set = new HashSet<String>();
		int result[] = new int[id_list.length];
		
		for(int i =0; i<report.length; i++) {
			set.add(report[i]);
		}
		
		Iterator<String> it = set.iterator();
		
		while(it.hasNext()) {
			
			String input[] = it.next().split(" ");
			String goodUser = input[0];
			String badUser = input[1];
			
			if(!badUserMap.containsKey(badUser)) badUserMap.put(badUser, 1);
			else badUserMap.put(badUser, badUserMap.get(badUser)+1);
			
			if(badUserMap.get(badUser) == k) {
				Iterator<String> it2 = set.iterator();
				while(it2.hasNext()) {
						String user[] = it2.next().split(" ");
					if(user[1].equals(badUser)) {
						goodUser = user[0];
						if(!goodUserMap.containsKey(goodUser)) goodUserMap.put(goodUser, 1);
						else goodUserMap.put(goodUser, goodUserMap.get(goodUser) + 1);
					}
				}
			}
		}
		
		for(int i =0; i<id_list.length; i++) {
			if(goodUserMap.get(id_list[i]) == null) result[i] = 0;
			else result[i] = goodUserMap.get(id_list[i]);
		}
		
        return result;
    }
}

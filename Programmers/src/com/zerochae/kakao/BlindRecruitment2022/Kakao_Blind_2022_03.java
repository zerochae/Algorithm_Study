package com.zerochae.kakao.BlindRecruitment2022;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Kakao_Blind_2022_03 {

	public static void main(String[] args) {

		int fees[] = { 180, 5000, 10, 600 };
		String records[] = { "05:34 5961 IN", "06:00 0000 IN", "06:34 0000 OUT", "07:59 5961 OUT", "07:59 0148 IN",
				"18:59 0000 IN", "19:09 0148 OUT", "22:59 5961 IN", "23:00 5961 OUT" };

		Kakao_Blind_2022_03 q3 = new Kakao_Blind_2022_03();
		System.out.println(Arrays.toString(q3.solution(fees, records)));
	}

	public int[] solution(int[] fees, String[] records) {
		 
		HashMap<String, String> parkingInMap = new HashMap<String, String>();
		HashMap<String, Integer> parkingOutMap = new HashMap<String, Integer>();
		Set<String> keySet = parkingInMap.keySet();
		for (int i = 0; i < records.length; i++) {
			String input[] = records[i].split(" ");

			String time = input[0];
			String car = input[1];
			String doing = input[2];

			// 입차
			if (doing.equals("IN")) {
				parkingInMap.put(car, time);
			}
			// 출차
			else if (doing.equals("OUT")) {

				String inTime[] = parkingInMap.get(car).split(":");
				int inHour = Integer.parseInt(inTime[0]);
				int inMin = Integer.parseInt(inTime[1]);

				String outTime[] = time.split(":");
				int outHour = Integer.parseInt(outTime[0]);
				int outMin = Integer.parseInt(outTime[1]);

				int totalTime = ((outHour - inHour) * 60) + (outMin - inMin);

				if(parkingOutMap.containsKey(car)) parkingOutMap.put(car, parkingOutMap.get(car) + totalTime);
				else parkingOutMap.put(car, totalTime);
				parkingInMap.put(car, "goOut");
			}
		}
		
			// 12시 까지 안나간차
			Iterator<String> it = keySet.iterator();

			while (it.hasNext()) {
			  String car = it.next();
				if (!parkingInMap.get(car).equals("goOut")) {

					String inTime[] = parkingInMap.get(car).split(":");
					int inHour = Integer.parseInt(inTime[0]);
					int inMin = Integer.parseInt(inTime[1]);

					int outHour = 23;
					int outMin = 59;

					int totalTime = ((outHour - inHour) * 60) + (outMin - inMin);


					if (parkingOutMap.containsKey(car))
						parkingOutMap.put(car, parkingOutMap.get(car) + totalTime);
					else
						parkingOutMap.put(car, totalTime);
					
					parkingInMap.put(car, "goOut");
				}
			}
			
		// 계산
		int result[] = new int[parkingOutMap.size()];
		Set<String> keySet2 = parkingOutMap.keySet();
		Iterator<String> it2 = keySet2.iterator();
		int index =0;
		while(it2.hasNext()) {
			
			String car = it2.next();
			int totalFee = fees[1] + ((parkingOutMap.get(car) - fees[0]) / fees[2] * fees[3]);
			if(totalFee < 5001) {
				totalFee = 5000;
			}
			parkingOutMap.put(car, totalFee);
			result[index] = parkingOutMap.get(car);
			index++;
		}
		return result;
	}
}

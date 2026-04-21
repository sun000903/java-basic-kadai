package kadai_028;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {
	
	

	HashMap<String,String> jyanken = new HashMap<String,String>();
	
	public Jyanken_Chapter28() {
		
		jyanken.put("r","グー");
		jyanken.put("s","チョキ");
		jyanken.put("p","パー");
		
	}
	
	
	public String getMyChoice() {
		
		//String input = "";
		
		//while(input != "r" || input != "s" || input !="p") {
		Scanner scanner = new Scanner(System.in);
		
		String input = "";
		
		while(true) {	
		
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");
		
		
		input= scanner.next();
		
		
		//System.out.println(input);
		scanner.close();
		
		if (input.equals("r") || input.equals("s") || input.equals("p")) {
            break; // ループを抜ける
        } else {
            System.out.println("【エラー】r, s, pのいずれかを入力してください。");
        }
	
		}
	
	return input;
	
		
		
		
	}
	
	
	public String getRandom() {
		
		
		int numbers =(int) Math.floor(Math.random() * 3);
		//System.out.println(numbers);
		
		if(numbers == 1) {
			return"r";
		} else if(numbers == 2) {
			return"s";
		} else {
			return"p";
		}
		
		
		
	}
	
	public void playGame() {
		
		String m = getMyChoice();
		String a = getRandom();
		
		System.out.println("自分の手は" + jyanken.get(m) + ", 対戦相手の手は" + jyanken.get(a));
		
		
		if(m.equals(a)) {
			System.out.println("あいこです");
		} else if((m.equals("r")&& a.equals("s"))||
				(m.equals("s")&&a.equals("p"))||
				(m.equals("p")&&a.equals("r"))){
			System.out.println("自分の勝ちです");
		} else {
			System.out.println("自分の負けです");
		}
	
	}
	
	}
	




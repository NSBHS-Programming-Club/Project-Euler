/*
This is my solution to Problem 1 on projecteuler.net.

By the way, NSBHS Programming club,
I will join NSBHS next year, and am definately very excited about joining the club and meeting you guys.

Check out my LAN-server based chat project at https://github.com/8itMiner/Coffee-Chat.
*/

import java.util.ArrayList;
public class Problem1 {
	static ArrayList<String> solutions = new ArrayList<String>();
	public static void main(String[] args) {
		for(int i = 0;i < 1000;i++) {
			if(i % 3 == 0 || i % 5 == 0) {
				solutions.add(Integer.toString(i));
			}
		}
		System.out.println(solutions);
	}
}

package edu.hw1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;import javax.security.auth.x500.X500Principal;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public final class Main {
    private final static Logger LOGGER = LogManager.getLogger();
    
	private Main() {
	}
	
	@SuppressWarnings(value = "unused")
	private static void helloWorld() {
		 LOGGER.info("Hello world!");
	}
	
	public static int minutesToSeconds(String input) {
		String[] parts = input.split(":");
		
		if( Integer.parseInt(parts[1]) >= 60 || Integer.parseInt(parts[1]) < 0) {
			return -1;
		}
		
		return Integer.parseInt(parts[1]) + Integer.parseInt(parts[0]) * 60;
	}
	
	public static int countDigits(int input) {
		input = Math.abs(input);
		int counter = 0;
		
		if(input == 0) return 1;
		
		while(input > 0) {
			input /= 10;
			counter += 1;
		}
		
		return counter;
	}
	
	public static boolean isNestable(Integer[] first, Integer[] second) {
		
		Integer maxFirst = Integer.MIN_VALUE;
		Integer minFirst = Integer.MAX_VALUE;
		
		Integer maxSecond = Integer.MIN_VALUE;
		Integer minSecond = Integer.MAX_VALUE;
		
		for(int i = 0; i < first.length; ++i) {
			maxFirst = Math.max(maxFirst, first[i]);
			minFirst = Math.min(minFirst, first[i]);
		}
		
		for(int i = 0; i < second.length; ++i) {
			maxSecond = Math.max(maxSecond, second[i]);
			minSecond = Math.min(minSecond, second[i]);
		}
		
		if(first.length == 0) {
			return true;
		}
		
		if(second.length == 0) {
			return false;
		}
		
		if (maxSecond > maxFirst && minSecond < minFirst) {
			return true;
		} else {
			return false;
		}
		
		
	}
	
	public static String fixString(String stringToFix) {
		
		List<Character> fixedString = new ArrayList<>(stringToFix.length());
		
		for(int i = 0; i < stringToFix.length(); ++i) {
			if(i % 2 == 0) {
				fixedString.addLast(stringToFix.charAt(i));
			} else {
				fixedString.add(i-1, stringToFix.charAt(i));
			}
		}
		
		StringBuilder sBuilder = new StringBuilder();
		
		for(Character i : fixedString) {
			sBuilder.append(i);
		}
		
		return sBuilder.toString();
	}

	
	public static boolean isPalindromeDescendant(int input) {

		if(countDigits(input) % 2 == 1) {
			if(isPolindrome(input)) {
				return true;
			}
			return false;
		}
		
		while(input > 9) {
			if(isPolindrome(input)) {
				return true;
			}
			
			if(countDigits(input) % 2 == 1) {
				return false;
			}
			
			input = childPolindrom(input);
		}
		
		return false;
		
	}
	
	private static boolean isPolindrome(Integer input) {
		String st = input.toString();
		boolean flag = true;
		for(int i = 0; i < (st.length()/2); ++i) {
			if(st.charAt(i) != st.charAt(st.length()-i-1)) {
				flag = false;
				break;
			}
		}
		return flag;
	}
	
	private static int childPolindrom(int input) {
		int ans = 0;
		for(int i = 0; i<countDigits(input)/2; ++i) {
			ans += (input % 10) * Math.pow(10, i);
			input /= 10;
			ans += input % 10 * Math.pow(10, i);
			input /= 10;
		}
		
		return ans;
	}
	
	
	public static int countK(int input) {
		int[] num = new int[4];
		for(int i = 0; i < 4; ++i) {
			num[4 - 1 -i] = input % 10;
			input /= 10;
		}
		
		return countK(num, 0);
	}
	
	private static int countK(int[] num, int counter) {
		
		
		if(Arrays.equals(num, new int[] {6,1,7,4})){
			return counter;
		}
		
		counter += 1;
		
		int[] maxNum = num.clone();
		Arrays.sort(maxNum);
		
		int maxX = 0;
		int minN = 0;
		
		for(int i=0; i<4;++i) {
			maxX += maxNum[i] * Math.pow(10, i);
			minN += maxNum[3-i] * Math.pow(10, i);
		}
		
		int newN = maxX - minN;
		
		int[] newNumAns = new int[4];
		
		for(int i = 0; i < 4; ++i) {
			newNumAns[4 - 1 -i] = newN % 10;
			newN /= 10;
		}
		
		return countK(newNumAns, counter);
	}
	
	
	public static int rotateRight(int n, int shift) {
		String st = Integer.toBinaryString(n);
		
		if(st.length() == 1) {
			return n;
		}
		
		for(int i = 0; i < shift; ++i) {
			st = st.charAt(st.length()-1) + st.substring(0, st.length()-1);
		}
		
		return Integer.parseInt(st, 2);
	}
	
	public static int rotateLeft(int n, int shift) {
		String st = Integer.toBinaryString(n);
		
		if(st.length() == 1) {
			return n;
		}
		
		for(int i = 0; i < shift; ++i) {
			st = st.substring(1, st.length()) + st.charAt(0);
		}
		
		return Integer.parseInt(st, 2);
	}
	
	
	public static boolean knightBoardCapture(int[][] field) {
		
		boolean flag = true;
		
		for(int i =0; i<8;++i) {
			for(int j=0; j < 8; ++j) {
				if(field[i][j] == 1) {
					int[] moves = {-1,-2,1,2};
					for(int x : moves) {
						for(int y : moves) {
							if(Math.abs(x) != Math.abs(y)) {
								if(i + x >= 0 && i + x < 8 && j + y >= 0 && j + y < 8) {
									if(field[i+x][j+y] == 1) {
										flag = false;
									}
								}
							}
						}
					}
				}
			}
		}
		
		return flag;
	}
	
	
	
	
	public static void main(String[] args) {
		LOGGER.info(knightBoardCapture(
				new int[][] {
					{0, 0, 0, 1, 0, 0, 0, 0},
					{0, 0, 0, 0, 0, 0, 0, 0},
					{0, 1, 0, 0, 0, 1, 0, 0},
					{0, 0, 0, 0, 1, 0, 1, 0},
					{0, 1, 0, 0, 0, 1, 0, 0},
					{0, 0, 0, 0, 0, 0, 0, 0},
					{0, 1, 0, 0, 0, 0, 0, 1},
					{0, 0, 0, 0, 1, 0, 0, 0}
					}
				
			)
		);
	}
}

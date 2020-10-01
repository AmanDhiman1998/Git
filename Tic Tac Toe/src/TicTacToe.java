import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.List;

public class TicTacToe {
	
	static ArrayList<Integer> playerlist = new ArrayList<Integer>();
	static ArrayList<Integer> cpulist = new ArrayList<Integer>();
	
	
	
public static void main(String args[]) {
	
	
	
	char[][] arr1 = {{ '1','|','2','|','3'},{'-','+','-','+','-'},{'4','|','5','|','6'},{'-','+','-','+','-'},{'7','|','8','|','9'}};
	printgameboard(arr1);
	char[][] arr = {{ ' ','|',' ','|',' '},{'-','+','-','+','-'},{' ','|',' ','|',' '},{'-','+','-','+','-'},{' ','|',' ','|',' '}};
	
	
	
	
	Scanner scn=new Scanner(System.in);
	
	
	while(true) {
	System.out.print("enter yout choice from 1 to 9");
	int choice = scn.nextInt();
	while(playerlist.contains(choice)||cpulist.contains(choice)) {
		System.out.print("POSITION TAKEN");
		choice = scn.nextInt();}
	
	entervalue(arr,choice,1);
	playerlist.add(choice);
	if(checkwinner(playerlist)==1) {
		printgameboard(arr);
		break;}
	
	
	Random rand = new Random();
	
	int num = rand.nextInt(9)+1;
	while(playerlist.contains(num)||cpulist.contains(num))
		num = rand.nextInt(9)+1;
	
	cpulist.add(num);
	entervalue(arr,num,2);
	printgameboard(arr);
	if(checkwinner(cpulist)==1) {
		printgameboard(arr);
		break;}
	}
}
	
public static int checkwinner(ArrayList<Integer> AL) {
	List AL1 = Arrays.asList(1,2,3);
	List AL2 = Arrays.asList(4,5,6);
	List AL3 = Arrays.asList(7,8,9);
	List AL4 = Arrays.asList(1,4,7);
	List AL5 = Arrays.asList(2,5,8);
	List AL6 = Arrays.asList(3,6,9);
	List AL7 = Arrays.asList(1,5,9);
	List AL8 = Arrays.asList(3,5,7);
	
	List<List> Whole = new ArrayList<List>();
Whole.add(AL1);Whole.add(AL2);Whole.add(AL3);
Whole.add(AL4);Whole.add(AL5);Whole.add(AL6);
Whole.add(AL7);Whole.add(AL8);

for(List L : Whole) {
	if(playerlist.containsAll(L)) {
		System.out.println("YOU WON");
	return 1;}
	
		else if(cpulist.containsAll(L)) {
			System.out.println("CPU WON");
			return 1;}
else if(playerlist.size()+ cpulist.size()== 9)
{
	System.out.print("DRAW");
	return 1;
}
	

}
	return 0;
	

}


public static void entervalue(char[][] arr, int val,int player) {
	
	char XO = 'X';
	if(player==1)
		XO = 'X';
	else
		XO ='O';
	
	switch(val) {
	case 1: arr[0][0] = XO;
	break;
	case 2: arr[0][2] = XO;
	break;
	case 3: arr[0][4] = XO;
	break;
	case 4: arr[2][0] = XO;
	break;
	case 5: arr[2][2] = XO;
	break;
	case 6: arr[2][4] = XO;
	break;
	case 7: arr[4][0] = XO;
	break;
	case 8: arr[4][2] = XO;
	break;
	case 9: arr[4][4] = XO;
	break;
	default:
	break;
	}
}


	public static void printgameboard(char[][] arr) {
	for(char[] each : arr) {
		for(char ch : each ) {
			System.out.print(ch);
		}
	System.out.println();}
	System.out.println();
	System.out.println();
	}
	
	
	
}


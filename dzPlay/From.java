package dzPlay;

import java.util.Scanner;

public class From extends DB {
	Scanner input = new Scanner(System.in);

	public void playGame() {
		System.out.println("打字练习：");
		System.out.println("选择游戏场景：");
		System.out.println("1、挑战模式（排位/打擂）");
		System.out.println("2、练习模式（自选难度）");
		System.out.println("3、自定义模式");
		int tmp = input.nextInt();
		switch (tmp) {
		case 1:
			System.out.println("*************");
			System.out.println("*进入挑战模式：*");
			System.out.println("*************");
			System.out.println();
			play1();
			break;
		case 2:
			System.out.println("*************");
			System.out.println("*进入练习模式：*");
			System.out.println("*************");
			System.out.println();

			play2();
			break;
		case 3:
			System.out.println("***************");
			System.out.println("*进入自定义模式: *");
			System.out.println("***************");
			System.out.println();

			play3();
			break;
		default:
			break;
		}
		System.out.println("输入0继续，其他任意键退出");
		if (input.nextInt()==0) {
			playGame() ;
		}
	}

	public void play1() {
			
			new Play(1);
				
			System.out.println("GameOver!!!!");
	}

	public void play2() {
			System.out.println("输入要练习的关卡数：1～6");
			new Play(input.nextInt());
			System.out.println("GameOver!!!!");
	}

	public void play3() {
		Play play=new Play();
		System.out.println("请输入想挑战的级别：1～6");
		int lve=input.nextInt();
		System.out.println("请输入挑战时间(秒)：");
		int time=input.nextInt();
		play.Custom(lve, time);
	}
}

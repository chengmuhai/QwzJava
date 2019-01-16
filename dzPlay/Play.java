package dzPlay;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;


public class Play extends DB{
	Scanner input=new Scanner(System.in);
	//构造加载Timer组件。并且规定终止进程的启动时间。
	int len=0;
	int sum[]={0,0};
	boolean openClose=true,up=true; //关闭时间进程,是否可以升级
	String le[]=null;
	public Play(int lve){
			choole(lve);			
			timer = new Timer();
			timer.schedule(new RemindTask(), super.getTime() * 1000);
			up=game();
//			System.out.println(up);
//			System.out.println(super.getTime());
//			System.out.println(sum[0]);
			if (up&&lve<6) {
				lve++;
				System.out.println("即将进入下一关，按任意键升级至：LV"+lve);
				input.next();
			}else {
				System.out.println(up?"恭喜完成本级别的难度！！":"您并未通过该难度！！");
				System.out.println("__________________________________________");
				System.out.println("关卡级别：【"+lve+"】\t关卡需要速度2.0词/秒");
				System.out.println("分数摘要: 正确输入【"+super.sum[0]+"】字"+"错误输入【"+super.sum[1]+"】字");
				System.out.println("平均速度："+(double)super.getTime()/(double)sum[0]+"词/秒");
				System.out.println("------------------------------------------");
				return;
			}
			new Play(lve);
	}
	//终止进程用于结束时间进程
	public Play(){};
	class RemindTask extends TimerTask {
		public void run() {
			openClose=false;
			timer.cancel(); // Terminate the timer thread
		}
	}
	//自定义游戏模块
	public void Custom(int lve,int time){
		choole(lve);
		super.setTime(time);
		timer = new Timer();
		timer.schedule(new RemindTask(), super.getTime() * 1000);
		up=game();
		System.out.println(up?"恭喜完成本级别的难度！！":"您并未通过该难度！！");
		System.out.println("__________________________________________");
		System.out.println("分数摘要:  正确输入【"+sum[0]+"】字"+"错误输入【"+sum[1]+"】字");
		System.out.println("平均速度："+(double)super.getTime()/(double)sum[0]+"词/秒");
		System.out.println("------------------------------------------");
	}
	public void choole(int lv){
		switch (lv) {
		case 1:
			len=super.T1.length;
			super.setLv(1);
			super.setTime(20);
			le=super.T1;
			break;
		case 2:
			len=super.T2.length;
			super.setLv(2);
			super.setTime(30);
			le=super.T2;
			break;
		case 3:
			len=super.T3.length;
			super.setTime(40);
			super.setLv(3);
			le=super.T3;
			break;
		case 4:
			len=T4.length;
			super.setLv(4);
			super.setTime(50);
			le=super.T4;
			break;
		case 5:
			len=T5.length;
			super.setLv(5);
			super.setTime(60);
			le=super.T5;
			break;
		case 6:
			len=T6.length;
			super.setLv(6);
			super.setTime(70);
			le=super.T6;
			break;
		default:
			System.out.println("输入错误请重新输入:1~6");
			lv=input.nextInt();
			choole(lv);
		}
	}
	public boolean game(){
		this.sum[0]=0;
		this.sum[1]=0;
		do {
			int tmp=(int)(Math.random()*len);			
			System.out.println(le[tmp]);
			if (input.next().equals(le[tmp])) {
				this.sum[0]++;
//				System.out.println("正确"+sum[0]);
			}else{
				this.sum[1]++;
//				System.out.println("错误"+sum[1]);
			}
		} while (openClose);
		super.sum[0]+=this.sum[0];
		super.sum[1]+=this.sum[1];
//		System.out.println((double)super.getTime());
//		System.out.println((double)sum[0]);
		return ((double)super.getTime()/(double)sum[0]<2?true:false);//这个sum[0]<n这个n值是难度几秒钟1个单词浮点型支持小数。
	}
}




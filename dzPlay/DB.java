package dzPlay;

import java.util.Scanner;
import java.util.Timer;



public class DB {
	Timer timer;
	
	private int time,Scores,lv,number;////时间、分数、等级、单词数量、
	public int sum[]={0,0};//正确错误率【0正确/1错误】
	//单词字典，单纯就是为了修改一下看看。
	String a1="hello 看看哈";
	String T1[]={"hot","dog","for","not","lot","fox","joy","boy","box","fog","low"};
	String T2[]={"only","like","very","both","wife","gave","twin","baby","girl","born","park","west","park","milk","pint"};
	String T3[]={"abide","bacon","cargo","daily","extra","fairy","grant","hatch","ideal","jolly","knife","human","proof","quite","raise","scare"};
	String T4[]={"accent","basket","caller","deeply","emding","fellow","horror","insist","jungle","killer","lastly","manage","method","outing","plenty","racket","revise","scared","uneasy"};
	String T5[]={"abactor","bachcha","cadagis","derayed","embales","fannell","galoche","hallion","inqilab","jauntee","kemping","lobolos","madling","nincoms","objured","paterae","quoists","rabbito","scorser"};
	String T6[]={"romantic","feathery","peaceful","raindorop","fantasia","highness","smile","shimmer","dream","dream","freedom","memory","inqilab","outing","objured","rabbito","scared","outing","madling"};
	Scanner input=new Scanner(System.in);
	public void init(){
		setTime(180);//基础级别3分钟（lv1）
		setLv(1);//等级1～5级别
		setScores(0);//0分开始
		setNumber(0);//初始化单词数量
		sum[0]=0;//初始化正确率
		sum[1]=0;//初始化错误率
	}
	
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public int getScores() {
		return Scores;
	}
	public void setScores(int scores) {
		Scores = scores;
	}
	public int getLv() {
		return lv;
	}
	public void setLv(int lv) {
		this.lv = lv;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int[] getSum() {
		return sum;
	}
	public void setSum(int[] sum) {
		this.sum = sum;
	}

}

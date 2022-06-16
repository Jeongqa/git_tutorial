package sample05;

import java.util.Scanner;

import org.springframework.core.style.ToStringCreator;
public class SungJukImpl implements SungJuk {
	private String name;
	private int kor;
	private int eng;
	private int mat;
	private int total;
	private double avg;
	public SungJukImpl() {
		Scanner scan = new Scanner(System.in);
		System.out.print("이름 입력 : ");
		name = scan.next();
		System.out.print("국어 입력 : ");
		kor = scan.nextInt();
		System.out.print("영어 입력 : ");
		eng = scan.nextInt();
		System.out.print("수학 입력 : ");
		mat = scan.nextInt();
	}
	@Override
	public void calc() {
		total = mat + eng + kor;
		avg = (double)total/3;
	}
	
	@Override
	public String toString() {
		return "이름 : " + name + ", 국어 : " + kor + ", 영어 : " + eng + ", 수학 : " + mat + ", 총점 : " + total
				+ ", 평균 : " + String.format("%.3f", avg);
	}
	@Override
	public void display() {
		System.out.println(this);
	}

}

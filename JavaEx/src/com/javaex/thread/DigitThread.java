package com.javaex.thread;

//	Thread 상속
public class DigitThread extends Thread {

	@Override
	public void run() {
		// 쓰레드의 실행 로직
		//	주의: 이 메서드는 직접 호출하지 말것!
		for (int i = 1; i <= 30; i++) {
			System.out.printf("%s: %d%n", 
					getName(),	//	현재 쓰레드 이름
					i);
			
			try {
				Thread.sleep(300);  // 0.3초 대기
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
//		super.run();
	}

}

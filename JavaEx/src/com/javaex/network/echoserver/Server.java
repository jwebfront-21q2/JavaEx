package com.javaex.network.echoserver;

import java.net.*;

public class Server {

	public static void main(String[] args) {
		// 서버 소켓
		ServerSocket serverSocket = null;
		try {
			//	바인드: 주소와 포트 연결
			serverSocket = new ServerSocket();
			//	모든 ip의 10000 포트 허용
			InetSocketAddress ip = new InetSocketAddress("127.0.0.1", 10000);
			serverSocket.bind(ip);
			
			System.out.println("<서버 시작>");
			System.out.println("[연결을 기다립니다.]");
			
			Socket socket = serverSocket.accept();	//	연결 대기
			
			//	접속 성공시: 클라이언트 정보 확인
			InetSocketAddress remote = (InetSocketAddress)socket.getRemoteSocketAddress();
			System.out.println("[클라이언트가 접속되었습니다.]");
			System.out.println(remote.getAddress() + ":" + remote.getPort());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				serverSocket.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}

package com.rcortez.lambdas;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OnOneListener oneListener = new OnOneListener() {
			@Override
			public void onOne(String massage) {
				//TODO Auto-generated method stub
				System.out.println("One:" + massage);
			}
		};
		
		OnOneListener oneListener2 = (String massage) -> {
			System.out.println("One Lambdas :) " + massage);
		};

		
		oneListener.onOne("Sin Lambda:(");
		oneListener2.onOne("Con Lambdas :)");
		
		OnOneListener oneListener3 = message -> System.out.println("Tu mensaje" + message);
	}

}

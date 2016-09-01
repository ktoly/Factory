package com.factory;

public class FactoryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//普通工厂模式
		SendFactory sendFactory = new SendFactory();
		Sender sender = sendFactory.produce("mail");
		sender.send();
		
		
		//多工厂模式
		SendFactory moreSendFactory = new SendFactory();
		Sender moreSender = moreSendFactory.produceMail();
		moreSender.send();
		
		
		//静态工厂方法模式，不需要创建实例，直接调用
		Sender staticSender = SendFactory.staticProduceMail();
		staticSender.send();
		
		
		//抽象工厂模式
		Provider provider = new SendMailFactory();
		Sender abSender = provider.produce();
		abSender.send();
	}

}

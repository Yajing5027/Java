package com.oop.polymorphismAndAbstract;

public class User extends Person {
	public User() {
	}

	public User(String name, String username, String password) {
		super(name, username, password);
	}

	@Override
	public void work() {
		System.out.println("Everybody need work.");		// 抽象类强制子类实现父类中的抽象方法
	}
}

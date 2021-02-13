package com.company.iteratormode;

public class Main {

    public static void main(String[] args) {
	    SchoolAggregate aggregate = new ConcreteSchoolAggregate();
	    aggregate.add("清华大学");
	    aggregate.add("北京大学");
	    aggregate.add("中国科技大学");
	    aggregate.add("国防科技大学");

	    System.out.println("聚合的学校内容有：");
	    Iterator iterator = aggregate.getIterator();

		System.out.println(iterator.first().toString());
		System.out.println("**********************");
		while (iterator.hasNext()){
			System.out.println(iterator.next().toString());
			System.out.println("**********************");
		}
    }
}

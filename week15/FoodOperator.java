package com.HJK.hello;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 菜品操作类:负责上架和浏览功能的实现/
 */
public class FoodOperator {
    private ArrayList<Food> foodList= new ArrayList<>();

    public void addFood(){
        Food f=new Food();

        Scanner sc=new Scanner(System.in);

        System.out.println("请您输入该菜品名称: ");
        String name=sc.next();
        f.setName(name);

        System.out.println("请您输入该菜品价格: ");
        double price=sc.nextDouble();
        f.setPrice(price);

        System.out.println("请您输入该菜品描述: ");
        String desc=sc.next();
        f.setDesc(desc);

        foodList.add(f);
        System.out.println("上架成功!");
    }

    public void showAllFoods(){
        if(foodList.size()==0){
            System.out.println("什么菜品都没有，先去上架!!!");
            return;
        }
        for (int i = 0; i < foodList.size(); i++) {
            Food f=foodList.get(i);
            System.out.println(f.getName());
            System.out.println(f.getPrice());
            System.out.println(f.getDesc());
            System.out.println("---------------------");
        }
    }

    public void start(){
        while (true) {
            System.out.println("请选择功能: ");
            System.out.println("1:上架菜品");
            System.out.println("2:展示菜品");
            System.out.println("3:退出程序");


            Scanner sc=new Scanner(System.in);
            System.out.println("请选择您的操作:");
            String command=sc.next();
            switch(command){
                case "1":
                    addFood();
                    break;
                case "2":
                    showAllFoods();
                    break;
                case "3":
                    System.out.println("下次再来哦!");
                    return;
                default:
                    System.out.println("您输入的命令不存在!");

            }
        }
    }
}

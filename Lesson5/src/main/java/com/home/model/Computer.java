package com.home.model;

import java.util.Random;
import java.util.Scanner;

public class Computer {
   private String processor;
   private int ram;
   private int hardDrive;
   private int resurs;
   private Scanner scanner = new Scanner(System.in);
   private Random random = new Random();
   private boolean burned; // true или false (2 состояния)

   public Computer(String processor, int ram, int hardDrive, int resurs) {
      this.processor = processor;
      this.ram = ram;
      this.hardDrive = hardDrive;
      this.resurs = resurs;
   }

   public String info() {
      return "Процессор: " + processor + " Оперативка: " + ram + " Жёсткий диск: " + hardDrive + " Ресурсы: " + resurs;
   }

   public void info2() {
      System.out.println("Процессор: " + processor + " Оперативка: " + ram + " Жёсткий диск: " + hardDrive + " Ресурсы: " + resurs);
   }

   public void on() {
      if (!burned) {
         System.out.println("Включение компьютера...");
         if (resurs > 0 && scanner.nextInt() == random.nextInt(2)) {
            off();
         } else {
            burned();
         }
      } else {
         burned();
      }
   }

   private void burned() {
      System.out.println("Компьютер сгорел!!!");
      burned = true;
   }

   public void off() {
      if (!burned) {
         System.out.println("Выключение компьютера...");
         resurs--;
         on();
      } else {
         burned();
      }
   }
}

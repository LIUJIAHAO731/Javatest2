package jp.co.aforce.samle;

public class SampleJava {
 public static void main(String[] args) {
	 double myWeight = 69.5;
	 double myHeight = 174.5/100;
	 
	 double bmi = myWeight/(myHeight * myHeight);
	 System.out.println(bmi);
	 
	 
	 int x;
	 
	 x=1;
	 System.out.println(x);
	 x++;
	 /*
	  * x+=3 = x=x+3 
	  * x-=3 = x=x-3
	  * x*=3 = x=x*3
	  * x/=3 = x=x/3
	  * x%=3 = x=x%3
	  * x++ = x+=1
	  * x-- = x-=1
	  */
	 System.out.println(x);
	 
	 int y = (int) 10.12345;
	 System.out.println(y);
	 
	 
	 
	 int value=100;
	 
	 value+=10;
	 value--;
	 System.out.println(value);
	 
	 
	 String hello;
	 hello = "おはよう";
	 System.out.println(hello);
	 
	 String haiku = "古池や"+"蛙飛び込む"+"水の音";
	 System.out.println(haiku);
	 System.out.println("int型:"+1+",float型:"+1.0f);
	 
	 String badHaiku = "振る池や"+"蛙飛び込む"+"水の音";
	 System.out.println(badHaiku);
	 String goodHaiku = badHaiku.replace("振る", "古");
	 System.out.println(goodHaiku);
	 System.out.println("文字列の長さは" + goodHaiku.length());
	 System.out.println(goodHaiku.substring(5,8));
	 
	 
	 String lastName= "jiahao";;
	 String firstName = "Liu";
	 String myName = lastName + firstName;
     System.out.println(myName);
     
     
     String saying="明日は明日の風が吹く";
     boolean result = saying.contains("風");
     System.out.println(result);
	 
	 
 }
 }

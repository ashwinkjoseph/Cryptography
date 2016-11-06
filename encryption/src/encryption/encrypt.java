/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//MY FIRST EDIT
package encryption;
import java.util.*;
import java.time.*;
import java.text.*;
/**
 *
 * @author Ashwin Joseph
 */
public class encrypt {
    private String Key;
    private String Encrypted="";
    private int time;
    public void letsencrypt(String data){
        int length=data.length();
        if(length!=0){
        	char[] dat=data.toCharArray();
        	String times=String.format("%d", time);
        	int[] timesa = new int[17];
        	for(int i=0; i<times.length(); i++)
        		timesa[i]=times.charAt(i);
        	for(int i=0; i<length; i++){
        		int j=0;
        		do{
        			Encrypted+=String.format("%d", dat[i]+timesa[j]);
        			j++;
        			i++;
        		}while(j!=7);
        	}
        	length=Key.length();
        	dat=Key.toCharArray();
        	for(int i=0; i<length; i++){
        		int j=0;
        		do{
        			Encrypted+=String.format("%d", dat[i]+timesa[j]);
        			j++;
        			i++;
        		}while(j!=7);
        	}
        }
    }
    public void getKey(){
    	Scanner data=new Scanner(System.in);
    	Key=data.nextLine();
    	data.close();
    }
  /*  public void getTime(){
    	LocalDate Second=LocalDate.now();
    	SimpleDateFormat sdf=new SimpleDateFormat();
    	for(char x:)
    }*/
    public void getTimeandDate(){
    	LocalDateTime time=LocalDateTime.now();
    	this.time=time.getDayOfMonth()*1000000000000+time.getMonthValue()*10000000000+time.getYear()*100000000+time.getHour()*10000+time.getMinute()*100+time.getSecond();    	
    }
    
}

package ex;

import java.util.ArrayDeque;
import java.util.Queue;

public class Srfg {
	public static class RadixSort {
		
		public int[] radixSort(int[] array){

		//First determine the sorting times;
		int max=array[0];
		for(int i=1;i<array.length;i++){
		if(array[i]>max){
		max=array[i];
		}
		}

		int time=0;
		//Judgment number;
		while(max>0){
		max/=10;
		time++;
		}

		//The establishment of 10 queue;
		Queue<Integer>[] queue=new Queue[10];
		for(int i=0;i<10;i++){
		queue[i]=new ArrayDeque<Integer>();
		}

		//The time distribution and collection;
		for(int i=0;i<time;i++){
		//Distribution of array elements;
		for(int j=0;j<array.length;j++){
		//To get digital time+1 digit;
		queue[array[j]%(int)Math.pow(10, i+1)/(int)Math.pow(10, i)].offer(array[j]);
		}
		int count=0;//The element counter;
		//The collection queue element;
		for(int k=0;k<10;k++){
		while(queue[k].size()>0){
		array[count]=(Integer) queue[k].poll();
		count++;
		}
		}
		}
		return array;
		}
		public static void main(String []args){
		int []arr={278,109,63,930,589,184,505,269,8,83};

		RadixSort rs = new RadixSort();
		int []array = rs.radixSort(arr);
		for(int i = 0 ; i <array.length ; i ++){
		System.out.println(arr[i]);
		}
		}
		}
}

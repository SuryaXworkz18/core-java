import java.util.*;
class Sorting{
public static void main(String args[]){

int array[]={2,3,78,56,34,9,76};
for(int index=0;index<array.length;index++){
for(int anotherIndex=index+1;anotherIndex<array.length;anotherIndex++)
  
  if(array[index]>array[anotherIndex]){
  int temp = array[index];
  array[index]=array[anotherIndex];
  array[anotherIndex]=temp;
  
  }

}
System.out.println(Arrays.toString(array));


}


}
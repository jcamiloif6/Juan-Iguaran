
//recursion 1
public class laboratorio{
public int factorial(int n) {
  if(n<=1 )
  return 1;
  else 
  return n * factorial(n-1);
}

public int bunnyEars(int bunnies) {
  if(bunnies == 0)
  return 0;
  else
  return 2 + bunnyEars(bunnies-1);
}

public int fibonacci(int n) {
  if(n==0)
  return 0;
  else if(n==1) 
  return 1;
  else
  return fibonacci(n-2) + fibonacci(n-1);
}

public int bunnyEars2(int bunnies) {
  if (bunnies == 0)
  return 0;
  else if(bunnies == 1)
  return 2;
  else if(bunnies%2==1)
  return 2 + bunnyEars2(bunnies-1);
  else
  return (3 + bunnyEars2(bunnies-1));
}

public int triangle(int rows) {
  if(rows==0)
  return 0;
  else 
  return rows + triangle(rows-1);
}


//recursion2
//Elentok,O(2012)Recursion-2.java https://github.com/ozelentok/CodingBat-Solutions/blob/master/Java/Recursion-2.java
public boolean groupSum6(int start, int[] nums, int target) {
  if(start==nums.length){
    if (target==0)
  return true;
  else return false;
    
  }
  if (nums[start] == 6)
        return groupSum6(start + 1, nums, target - nums[start]);
  else
  return groupSum6(start+1, nums, target - nums[start]) || groupSum6(start+1,nums,target);
}

public boolean groupNoAdj(int start, int[] nums, int target)
{
	if(target == 0)
  	return true;
  if(start >= nums.length)
  	return false;
  if(groupNoAdj(start + 2, nums, target - nums[start]))
  	return true;
  return groupNoAdj(start + 1, nums, target);
}

public boolean groupSum5(int start, int[] nums, int target) {
  if(start >= nums.length){
		if(target == 0)
  		return true;
  	return false;
 	}
 	if(nums[start] % 5 == 0){
 	  if(start < nums.length - 1 && nums[start+1] == 1)
	 		return groupSum5(start + 2, nums, target - nums[start]);
	 	return groupSum5(start + 1, nums, target - nums[start]);
 	}
 	if(groupSum5(start+1,nums,target-nums[start]))
 	return true;
 	return groupSum5(start+1,nums,target);
}

// Elentok,O(2012)Recursion-2.java https://github.com/ozelentok/CodingBat-Solutions/blob/master/Java/Recursion-2.java
public boolean groupSumClump(int start, int[] nums, int target) {
  if(start >= nums.length){
		if(target == 0)
  		return true;
  	return false;
  
  }
  int i = start + 1;
 	for(;  i < nums.length && nums[start] == nums[i]; i++);
 	if(groupSumClump(i, nums, target - ((i - start) * nums[start])))
 		return true;
 	return groupSumClump(i, nums, target);	

}

//Ulm,G(2013)Codingbat:Java.Recursion-2 http://gregorulm.com/codingbat-java-recursion-2/
public boolean splitArray(int[] nums)
{	return ayuda(nums, 0, 0);	}
public boolean ayuda(int[] nums, int i, int balance)
{
	if(i == nums.length)
		return (balance == 0);
	if(ayuda(nums, i + 1, balance + nums[i]))
		return true;
	return ayuda(nums, i + 1, balance - nums[i]);
}
}

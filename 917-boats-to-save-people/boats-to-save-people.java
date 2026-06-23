class Solution {
    public int numRescueBoats(int[] people, int limit) {
     Arrays.sort(people);
     int left=0,right=people.length-1;
     int count=0;
     while(left<=right)
     {
        int target=people[left]+people[right];
        if(target<=limit)
        {
            left++;
            right--;
        }
        else 
        {
            right--;
        }
        count++;
     }
     return count;
    }
}
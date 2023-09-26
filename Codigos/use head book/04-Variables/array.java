class array{
public static void main(String[] args){
int [] nums;
nums = new int[7];

nums[0] = 6;
nums[1] = 19;
nums[2] = 44;
nums[3] = 42;
nums[4] = 10;
nums[5] = 20;
nums[6] = 1;

RefOBJS [] OBJS = new RefOBJS[3];

OBJS[0] = new RefOBJS();
OBJS[0].name = "Objeto 013";




System.out.println(nums);
System.out.println(OBJS[0].name);
}
}
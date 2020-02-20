public class sequentialSearch {

    public static int search(int[] elements, int target)

         {for (int i = 0; i < elements.length; i++)
            {if (elements[i] == target)
                {return i;}
            }
            return -1;
        }


    public static void main(String[] args){

        int[] arr = {158,207,392,62,315,434,487,268,405,241};

        //Enter your index:
        int target = 0;

            int index = search(arr,target);
            if (index ==-1)
                {System.out.println("The element is not found. The answer is " +index);
                }else System.out.println("The element has index " + index);
        }
    }
public class sequentialSearch {

    public static int search(int[] elements, int target)

         {for (int i = 0; i < elements.length; i++)
            {if (elements[i] == target)
                {return i;}
            }
            return -1;
        }


    public static void main(String[] args){

        int[] arr = {158, //0
                     207, //1
                     392, //2
                     62,  //3
                     315, //4
                     434, //5
                     487, //6
                     268, //7
                     405, //8
                     241  //9
                     };

        //Enter your index:
        int target = 487;

            int index = search(arr,target);

            if (index ==-1) {
                System.out.println("The element is not found. The answer is " + index);
            }else System.out.println("The element has index " + index);
        }
    }

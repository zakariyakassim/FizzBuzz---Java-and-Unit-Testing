public class FizzBuzz {


        public static String run(int N, int M) {
            /*
             * Some work here; return type and arguments should be according to the problem's requirements
             */

            String sequence = "";

            for(int x = N; x <= M; x++){

                if (x % 3 ==0 && x % 5 ==0){

                    sequence = sequence+"FizzBuzz";

                } else if (x % 5 ==0){

                    sequence = sequence+"Buzz";

                } else if (x % 3 ==0){

                    sequence = sequence+"Fizz";

                } else {

                    sequence = sequence+x;

                }

                if (x < M){
                    sequence = sequence+",";
                }

            }


            return sequence;
        }

        public static void main(String args[]) {

            //Buzz,Fizz,7,8,Fizz,Buzz,11,Fizz,13,14,FizzBuzz

            System.out.println(FizzBuzz.run(8,20));



        }





}

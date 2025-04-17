public class BinarySearch2D {

        public static boolean searchMatrix(int[][] matrix, int target) {
            for(int row = 0; row < matrix.length; row++){
                int start = row;
                int end = matrix[row].length - 1;
                while( start <= end){
                    int mid = start + (end - start)/2;
                    if(target < matrix[row][mid]){
                        end = mid - 1;
                    }
                    else if(target > matrix[row][mid]){
                        start = mid + 1;
                    }
                    else{
                        return true;
                    }
                }
            }
            return false;

        }

    public static void main(String[] args) {

        int[][] arr = {{1}, {3}};
        int target = 3;
        searchMatrix(arr, target);
    }
    }



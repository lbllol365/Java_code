public abstract class GenericMatrix<E extends Number>{
    protected abstract E add(E o1,E o2);
    protected abstract E decrease(E o1,E o2);
    protected abstract E multiply(E o1,E o2);
    protected abstract E zero();

    public E[][] addMatrix(E[][] matrix1,E[][] matrix2) throws RuntimeException{
        if((matrix1.length != matrix2.length) || (matrix1.length != matrix2.length))
            throw new RuntimeException("The matrices do not have the same length!!");
        E[][] result = (E[][]) new Number[matrix1.length][matrix1[0].length];
        for(int i = 0;i<result.length;i++){
            for(int j = 0;j < result[i].length;j++ ){
                result[i][j] = add(matrix1[i][j],matrix2[i][j]);
            }
        }
        return result;
    }
    
    public E[][] multiplyMatrix(E[][] matrix1,E[][] matrix2) throws RuntimeException{
        if(matrix1[0].length != matrix2.length)
            throw new RuntimeException("The matrices do not have compatible size");
        E[][] result = (E[][]) new Number[matrix1.length][matrix2[0].length];
        for(int i = 0;i < matrix1.length;i++){
            for(int j = 0;j < matrix2[0].length;j++){
                result[i][j] = zero();
                for(int k = 0;k < matrix1[0].length;k++)
                    result[i][j] = add(result[i][j],multiply(matrix1[i][k],matrix2[k][j]));
            }
        }
        return result;
    }

    public E[][] decreaseMatrix(E[][] matrix1,E[][] matrix2) throws RuntimeException{
        if((matrix1.length != matrix2.length) || (matrix1[0].length != matrix2[0].length))
            throw new RuntimeException("The matrices do not have the same length!!");
        E[][] result = (E[][]) new Number[matrix1.length][matrix1[0].length];
        for(int i = 0;i < matrix1.length;i++){
            for(int j = 0;j < matrix1[i].length;j++){
                result[i][j] = decrease(matrix1[i][j],matrix2[i][j]);
            }
        }

        return result;
    }


}

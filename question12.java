public class question12 {
    public static void main(String[] args){
        try{
            throw new ques12CustomException("Hello");
        }
        catch (ques12CustomException e){
            System.out.println(e.getMessage());
        }
    }
}


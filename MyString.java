public class MyString implements CharSequence{
  private char[] data;
  public MyString(CharSequence s){
    for(int i =0; i < s.length(); i = i + 1 ){
      data[i] = s.charAt(i);
    }

  }

  public char charAt(int index){

  }

  public int length(){

  }

  public CharSequence subSequence(int start, int end){

  }

  public String toString(){

  }

}

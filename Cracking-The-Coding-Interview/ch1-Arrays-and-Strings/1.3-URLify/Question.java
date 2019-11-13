import java.util.*; 

class Main {

public String replaceSpace(String s)
{
    StringBuilder answer = new StringBuilder();
    for(int i = 0; i<s.length(); i++)   
    {
        if(s.CharAt(i) == ' ')
        {
            answer.append("%20");
        }
        else
        {
            answer.append(s.CharAt(i));
        }
    }
    return answer.toString();
}
}
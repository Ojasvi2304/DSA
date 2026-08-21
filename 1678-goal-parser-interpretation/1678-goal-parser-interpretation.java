class Solution 
{
    public String interpret(String command) 
    {
        String s="";
        String ns="";
        for(int i=0;i<command.length();++i)
        {
            if(command.charAt(i)=='G')
            s+='G';
            else
            {
                ns+=command.charAt(i);
                if(ns.equals("()"))
                {
                    s+='o';
                    ns="";
                }
                else if(ns.equals("(al)"))
                {
                    s+="al";
                    ns="";
                }
            }
        }
        return s;
    }
}
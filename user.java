
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class user {
    private final String name;
    private final String IC;
    private final String mobileNumber;
    private final String nationality;
    private final String gender;
    private final String email;
    private final String checkIN;
    private final String roomNo;
    private final String price;
    
    public user (String na, String ic, String mn, String n, String g, String e, String cin, String rn, String p)
    {
        name=na;
        IC=ic;
        mobileNumber=mn;
        nationality=n;
        gender=g;
        email=e;
        checkIN=cin;
        roomNo=rn;
        price=p;
    }
    
    public String writeRecord(){
        try {
            FileWriter fw = new FileWriter("user.txt", true);
            try (PrintWriter outputFile = new PrintWriter(fw)) {
                outputFile.println(name + ", " + IC + ", " + mobileNumber + ", " + nationality + ", " + gender + ", " + email + ", " + checkIN + ", " + roomNo + ", " + price);               
            }
            return "";
        }
        catch (IOException ex){
            return ex.toString();
        }
    }
    
}

#include <string>
#include <cstring>
#include <stdio.h>
#include <iostream>

using namespace std;

class MultiDigitParser{
private:
    int index = 0; 
    string inputString = "";
    string digit = "";
    char singleDigit ;
    char reserveOperator[10] = {'-', '+', '*', '/', '%', '\n', ' '};
public:
    MultiDigitParser(){
        readLine();
    } 

    void expression(){
        readDigit();
        while (true){
            if(singleDigit == '-'){
                readDigit();
                printf("- ");
            }
            else if(singleDigit == '+'){
                readDigit();
                printf("+ ");
            }
            else if(singleDigit == '*'){
                readDigit();
                printf("* ");
            }
            else if(singleDigit == '/'){
                readDigit();
                printf("/ ");
            }
            else if(singleDigit == '%'){
                readDigit();
                cout << "% ";
            }
            else return;
        }
    }  

    void readLine(){
        getline(cin,inputString);
    }

    void readDigit(){
        singleDigit = inputString[index];
        while (singleDigit == ' '){
            index+=1;
            singleDigit = inputString[index];
        }
        if (isdigit(singleDigit)) {
            while (isdigit(singleDigit)) {
                digit += singleDigit;
                index += 1;
                singleDigit = inputString[index];
            }

            while (singleDigit == ' '){
                singleDigit = inputString[index];
                index+=1;
            }
            cout << digit + " ";
            digit = "";

        } else {
            if (!checkOperator(singleDigit)) {
                throw "Syntax Error";
            }
        }
    }

    bool checkOperator(char opr){
        for (int i = 0; i < strlen(reserveOperator); ++i) {
            if (opr == reserveOperator[i]){
                return true;
            }
        }
        return false;
    }

};


int main(int argc, char const *argv[])
{
    MultiDigitParser parser = MultiDigitParser();
    parser.expression();
    return 0;
}

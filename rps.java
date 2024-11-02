package SecondPkg;
import java.util.Scanner;
import java.util.Random;
public class rps {
static int userPoints; 
static int aiPoints;
static int b;
public static void time(int userInput){
	Random r = new Random();
	userInput = 1+r.nextInt(3);
	}
public static void easyDifficulty(int rounds) {
userPoints=0;
aiPoints=0;
int userInput;
Scanner s = new Scanner(System.in);
System.out.println("Remember this ");
System.out.println("1 means rock");
System.out.println("2 means paper");
System.out.println("3 means scissors");
System.out.println("The game starts now ");
System.out.println("Start choosing");
int c= rounds-2;
while(rounds!=0) {
userInput = s.nextInt();
if(userInput==0) {
	time(userInput);
}
switch(userInput) {
case(1):
System.out.println("rock wins aganist scissors user got a point ");
userPoints++;
break;
case(2):
System.out.println("paper wins aganist rock user got a point ");
userPoints++;
break;
case(3):
System.out.println("scissors wins against paper user got a point ");
userPoints++;
break;
default:
System.out.println("no point for anyone");
}
if(c!=0) {
System.out.println("Choose again");
}
c--;
rounds--;
}
int Points = userPoints - aiPoints;
System.out.println("you won "+userPoints+" points where as ai won "+aiPoints+" ,user wins ");
if(userPoints==0 ) {
System.out.println("Your are a loser who can't win a game on easy mode");
}
}
public static void mediumDifficulty(int rounds) {
userPoints=0;
aiPoints=0;
Random number = new Random();
int aiNumber ;
Scanner s = new Scanner(System.in);
System.out.println("Remember this ");
System.out.println("1 means rock");
System.out.println("2 means paper");
System.out.println("3 means scissors");
int userInput;
System.out.println("The game starts now ");
System.out.println("Start choosing");
while(rounds!=0) {
aiNumber = 1+number.nextInt(3);
userInput = s.nextInt();
System.out.println();
int c =rounds -2;
switch(userInput) {
case(1):
	switch(aiNumber) {
	case(1):
	System.out.println("rock vs rock no gain no loss ");
	break;
	case(2):
	System.out.println("rock loses aganist paper ai got a point ");
	aiPoints++;
	break;
	case(3):
	System.out.println("rock wins aganist scissors user got a point ");
	userPoints++;
	break;
	}
break;
case(2):
	switch(aiNumber) {
	case(1):
	System.out.println("paper wins aganist rock user got a point ");
	userPoints++;
	break;
	case(2):
	System.out.println("paper vs paper no gain no loss ");
	break;
	case(3):
	System.out.println("paper loses aganist scissors ai got a point ");
	aiPoints++;
	break;
	}
break;
case(3):
	switch(aiNumber) {
	case(1):
	System.out.println("scissors loses against rock ai got a point ");
	aiPoints++;
	break;
	case(2):
	System.out.println("scissors wins against paper user got a point ");
	userPoints++;
	break;
	case(3):
	System.out.println("scissors vs scissors no gain no loss");
	break;
	}
break;
default:
System.out.println("-1  point for user");
userPoints--;
}
if(c!=0) {
System.out.println("Choose again");
}
c--;
rounds--;
}
if(userPoints>aiPoints) {
int Points = userPoints - aiPoints;
if(Points ==1)
System.out.println("you won against ai you got "+userPoints+" points where as ai got "+aiPoints+" user won with " +Points+" point");
if(Points>1)
System.out.println("you won against ai you got "+userPoints+" points where as ai got "+aiPoints+" user won with " +Points+" points");
}
if(userPoints==aiPoints && userPoints!=0 && aiPoints!=0) {
	System.out.println("it is a tie match, both won equal amount of points and the point/s is/are "+userPoints);
}
if(aiPoints>userPoints) {
int Points = aiPoints - userPoints;
if(Points ==1)
	System.out.println("ai won against you, you got "+userPoints+" points where as ai got "+aiPoints+" ai won with extra" +Points+" point");
if(Points >1) {
System.out.println("ai won against you, you got "+userPoints+" points where as ai got "+aiPoints+" ai won with extra" +Points+" points");
}
}
if(userPoints==0 && aiPoints ==0) {
System.out.println("Your are a loser who don't know neither english or numbers ");
} 
}
public static void hardDifficulty(int rounds) {
userPoints=0;
aiPoints=0;
Scanner s = new Scanner(System.in);
System.out.println("Remember this ");
System.out.println("1 means rock");
System.out.println("2 means paper");
System.out.println("3 means scissors");
int userInput;
int a;
System.out.println("The game starts now ");
System.out.println("Start choosing");
int hardPoints=rounds;
int c = rounds -2;
while(rounds!=0) {
userInput = s.nextInt();
switch(userInput) {
case(1):
System.out.println("rock wins aganist scissors ai got a point ");
aiPoints++;
break;
case(2):
	if(userPoints== 3&& hardPoints >=7) {
	System.out.println("paper wins aganist ai user got a point ");
	aiPoints++;
	}
	else if(userPoints==2 && hardPoints>=5 ) {
		System.out.println("paper wins aganist ai user got a point ");
		aiPoints++;
	}
	else if(userPoints ==0&& hardPoints ==1 ) {
System.out.println("paper wins aganist rock ai got a point ");
aiPoints++;
}else if(userPoints ==2&& hardPoints ==3 ) {
	System.out.println("paper wins aganist rock ai got a point ");
	aiPoints++;}
	else {	System.out.println("paper wins aganist rock user got a point ");
		userPoints++;
		}
break;
case(3):
System.out.println("scissors wins against paper ai got a point ");
aiPoints++;
break;
default:
System.out.println("-1  point for user");
b = userInput;
userPoints--;
}
System.out.println("your chance");
if(c!=0) {
System.out.println("Choose again");
}
c--;
rounds--;
}
a=b;
int Points;
if(aiPoints>userPoints) {
Points = aiPoints- userPoints;
if(Points ==1) {
System.out.println("you lost against ai you got "+userPoints+" points where as ai got "+aiPoints+" Ai won with " +Points+" point");}
else {
System.out.println("you lost against ai you got "+userPoints+" points where as ai got "+aiPoints+" Ai won with " +Points+" points");
}
System.out.println("no need to worry this is hard mode winning is hard ");
}
else if(userPoints>aiPoints) {
	if(aiPoints>0) {
 Points = userPoints- aiPoints;
	if(Points ==1) {
		System.out.println("you won against ai you got "+userPoints+" points where as ai got "+aiPoints+" user won with " +Points+" point");}
		else {
		System.out.println("you won against ai you got "+userPoints+" points where as ai got "+aiPoints+" user won with " +Points+" points");
		}
		System.out.println("congratulation yoou won against ai on hard mode ");}
	else if(aiPoints==0 && a > 4 ) {
		System.out.println("You dont know how to play you lost");
		}
}
}
public static void impossibleDifficulty(int rounds) {
userPoints=0;
aiPoints=0;
Scanner s = new Scanner(System.in);
System.out.println("Remember this ");
System.out.println("1 means rock");
System.out.println("2 means paper");
System.out.println("3 means scissors");
int userInput;
System.out.println("The game starts now ");
System.out.println("Start choosing");
int c = rounds -2;
while(rounds!=0) {
userInput = s.nextInt();	
switch(userInput) {
case(3):
System.out.println("rock wins aganist scissors ai got a point ");
System.out.println("your chance");
aiPoints++;
break;
case(1):
System.out.println("paper wins aganist rock ai got a point ");
System.out.println("your chance");
aiPoints++;
break;
case(2):
System.out.println("scissors wins against paper ai got a point ");
System.out.println("your chance");
aiPoints++;
break;
default:
System.out.println("-1  point for user");
}
if(c!=0) {
System.out.println("Choose again");
}
c--;
rounds--;
}
int Points =aiPoints - userPoints; ;
System.out.println("you lost against ai you got "+userPoints+" points where as ai got "+aiPoints+" Ai won with points "+Points);
System.out.println("no need to worry this is imposible mode winning is impossible ");
if(aiPoints==0) {
System.out.println("You dont know how to play you lost");
}
		}
public static void main(String[] args) {
System.out.println("Hi welcome to r.p.s(rock paper scissors) game ");
 Scanner s = new Scanner(System.in);
 System.out.println("Enter");
 System.out.println("1------> start");
 System.out.println("anything other 1------> quit");
 int n = s.nextInt();
 int difficulty;
 int rounds;
 int game=1;
 if (n == 1) {
 while(game==1) {
 System.out.println("Enter");
 System.out.println("1 for easy (always win for the user)difficulty ");
 System.out.println("2 for medium(a normal match) difficulty ");
 System.out.println("3 for Hard(it's harder to win)difficulty ");
 System.out.println("4 for impossible(user never wins a point)difficulty ");
 difficulty = s.nextInt();
	switch(difficulty) {
	case(1):
 System.out.println("How many rounds you want to play with ai");
 rounds = s.nextInt();
 easyDifficulty(rounds);
	break;
	case(2):
  System.out.println("How many rounds you want to play with ai");
  rounds = s.nextInt();
mediumDifficulty(rounds); 
	break;
	case(3):
 System.out.println("How many rounds you want to play with ai");
 rounds = s.nextInt();
 hardDifficulty(rounds);
	break;
	case(4):
System.out.println("How many rounds you want to play with ai");
rounds = s.nextInt();
impossibleDifficulty(rounds);
	break;
	default:
	 System.out.println("Exiting the game ");
	 System.out.println("Hope you enjoyed the game come back again ");
	 break;
	}
 System.out.println("Enter 1 to play again or any number to quit (exit game)");
 game = s.nextInt();
 if(game!=1) {
	 System.out.print("Exiting the game ");	
	 System.out.println("Hope you enjoyed the game come back again ");

 }
	}
 }
	}
}

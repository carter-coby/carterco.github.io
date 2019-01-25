public static double calcDepth( int month, int previousRiverDepth)
throws RiverControlException{

if (month < 0 || month > 11){
   throw new RiverControlException("The month is invalid.");
}

if (previousRiverDepth < 0 || previousRiverDepth > 2){
    throw new RiverControlException("The previousRiverDepth is invalid.");
}
/*case 1-4 months with moderate snow melt, case 5-6 are months with heavy snow melt and any other are no snow melt */
int snowMelt;

switch (month){
   case 1:
   case 2:
   case 3:
   case 4:
       snowMelt = 3;
       break;
   case 5:
   case 6:
       snowMelt = 10;
       break;
   default: snowMelt= 1;
   break;          
}
int randomNumber = rand.nextInt(50); 

int riverDepth = snowMelt + previousRiverDepth + (10/10);

return riverDepth;
}
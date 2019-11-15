package familiarity.review.code;

public class FrontController {
    private Dispatcher dispatcher;
    public FrontController()
    {
        dispatcher = new Dispatcher();
    }
    private boolean determineView(String request)
    {
        /*
        A simple if-else statement that will allow me to control
        which view is selected. Obviously I would have much more robust code
        than this, but this is a simple demonstration, not the full
        blown application. You could make this start making calls to
        a database of usernames and passwords for authentication to a server.
        Or you could use it to determine if the user is authorized to view
        a portion of whatever server or program they are in.
        */
        if (request == "League of Legends" || request == "Overwatch")
        {
            System.out.println("Credentials accepted.");
            System.out.println("Logging in... ");
            return true;
        }
        //Error message if you are not "authenticated"
        else
        {
            System.out.println("Application not supported. Unable to log in.\n");
            return true;
        }
    }
    
    //Notifies when the change begins to be made.
    private void trackRequest(String request)
    {
        System.out.println("You are attempting to log in to: " + request);
    }
    //Invokes the sendRequest method in the dispatcher class.
    public void dispatchRequest(String request)
    {
        trackRequest(request);
        if (determineView(request))
        {
            dispatcher.sendRequest(request);
        }
    }
}
/*
I can adjust this really simply. If I want to support another application,
all I need to do is copy + paste the views and if statements from
the dispatcher and I can immediately make it supported by my application.
*/
class FrontControllerPattern
{
    public static void main(String[] args)
    {
        FrontController frontController = new FrontController();
        frontController.dispatchRequest("World of Warcraft");//Not supported. Fails.
        frontController.dispatchRequest("League of Legends");
        frontController.dispatchRequest("Overwatch");
        frontController.dispatchRequest("Mario Kart Online"); //Not supported. Fails.
    }
}
/*
The code below contains the various views and the dispatcher.
The dispatcher is an object that has a sendRequest() method inside.
I have the dispatcher dispatch the request by invoking this method.
Once the dispatcher sends the request, it then changes the view
based on what is in the request variable that is passed to
the method.
*/
class Dispatcher
{
    private LeagueView leagueView;
    private OverwatchView overwatchView;
    private ErrorView errorView;
    String checker = null;//A variable to see if I'm logged in already.
    public Dispatcher()
    {
        leagueView = new LeagueView();
        overwatchView = new OverwatchView();
        errorView = new ErrorView();
    }
    public void sendRequest(String request)
    {
        if(request.equalsIgnoreCase("League of Legends"))
        {
            leagueView.display();
            checker = "League of Legends";
        }
        else if (request.equalsIgnoreCase("Overwatch"))
        {
            overwatchView.display();
            checker = "Overwatch";
        }
        else
        {
            errorView.alreadyLoggedIn(request,checker);
        }
    }
}

class LeagueView
{
    public void display()
    {
        System.out.println("You are now logged in.");
        System.out.println("Welcome to League of Legends.\n");
    }
}

class OverwatchView
{
    public void display()
    {
        System.out.println("You are now logged in.");
        System.out.println("Welcome to Overwatch.\n");
    }
}

class ErrorView
{
    public void alreadyLoggedIn(String view, String checker)
    {
        if (checker == null)//This was initialized as null.
        {
            System.out.println("Please try logging in to a different game.\n");
        }
        else
        {
            System.out.println("You are already logged in.");
        }
        if (view == "League of Legends")
        {
            System.out.println("Welcome to League of Legends.\n");
        }
        else if (view == "Overwatch")
        {
            System.out.println("Welcome to Overwatch.\n");
        }
        else
        {
            System.out.println("Welcome to " + checker + ".\n");
        }
    }
}
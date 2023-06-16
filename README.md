nstructions
A thread can be in one of the following states:

State	Description
NEW	A thread that has not yet started is in this state.
RUNNABLE	A thread executing in the Java virtual machine is in this state.
BLOCKED	A thread that is blocked waiting for a monitor lock is in this state.
WAITING	A thread that is waiting indefinitely for another thread to perform a particular action is in this state.
TIMED_WAITING	A thread that is waiting for another thread to perform an action for up to a specified waiting time is in this state.
TERMINATED	A thread that has exited is in this state.
Create two (2) threads named by the user. Display their various states using getState( ).

In the main method:

Enable user input.
Create two (2) threads.
Ask the user to enter a name for each thread.
Show the names and states of the threads.
Start the threads.
Have the threads sleep for half a second. 
Show the names and states of the threads.
In the run( ) method, show the name and state of the current thread.

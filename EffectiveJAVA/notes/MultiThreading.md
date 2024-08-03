# Multithreading

Multithreading threw out single threads out of the way.

## Process

A process is an instance of a program that is being executed. When a program runs, the OS creates a process to manage
its execution.

## Threads

A thread is the smallest unit of execution within a process. A process can have multiple threads, which share the same
resources but can run independently.

## Multitasking

Multitasking allows an OS to run multiple process simultaneously. On single-core CPU's, this is done through 
time-sharing, rapidly switching between tasks. On multi-core CPU's, true parallel execution occurs, with tasks 
distributed across cores. The OS scheduler balances the load, ensuring efficient and responsive system performance.

## Multithreading

Multithreading refers to the ability to execute multiple threads within a single process concurrently.
Multitasking operates at the level of processes, which are the OS primary units of execution.
Multithreading operates at the level of threads, which are smaller units within a process.

## Time slicing

Time slicing divides CPU time into small intervals called time slices or quanta.
The OS scheduler allocates theses time slices to different processes and threads, ensuring each gets a fair share of 
CPU time.
This prevents any single process or thread from monopolizing the CPU, improving responsiveness and enabling concurrent
execution.

## Context Switching

Context switching is the process of saving the state of a currently running process and loading the state of the next 
one to be executed.
When a process or thread's time slice expires, the OS scheduler performs a context switch to move the CPU's focus to
another process or thread.
This allows multiple processes and threads to share the CPU, giving the appearance of simultaneous execution on a 
single core CPU or improving parallelism on multi-core CPUs.

## Thread Lifecycle

The lifecycle of a thread in Java consists of several states, which a thread can move through during its execution.
- New : A thread is in this state when it is created but not yet started.
- Runnable : After the start method is called, the thread becomes runnable. It's ready to run and is waiting for CPU 
             time.
- Running : The thread is in this state when it is executing.
- Blocked/Waiting : A thread is in this state when it is waiting for a resource or for another thread to perform an
                    action.
- Terminated : A thread is in this state when it has finished executing.

## Daemon Threads

Background threads. JVM won't wait for it to stop executing. Once user thread work is done. JVM will close this thread
too.

## Locks

- Intrinsic Locks : These are built into every object in Java. When you use synchronized keyword, you are using these
                    automatic locks.
  - Explicit Locks : These are more advanced locks you can control yourself using the lock class from 
                     java.util.concurrent.locks. You explicitly say when to lock and unlock, giving you more control
                     over how and when people can write in the notebook.
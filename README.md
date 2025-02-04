# Garage_java_project
A Java Project of Vehicles

This Java project is a Garage of motorcycles and cars which are an extension of the vehicle class, each vehicle type gets different attributes and methods but extends the attributes and methods of the vehicle class

I implemented a kilometer count, which can be increased by the drive method in my program which simulates a drive of various kilometres.
The vehicles are added in the garage via arraylist and vehicles can be added in the main method with the *name of garage*.addVehicle(*name of vehicle*); command. Vehicles can also be removed with the *name of garage*.removeVehicle(*name of vehicle*) command.
I also added a getVehicle method which can print out the details of a vehicle with the license Plate you want to get.
With the attributes of the year oft the car and the booleans isAWD, hasSidecar and the integer numberOfAxles the Service Costs of the vehicle can be calculated with the calculateService method.
The number of vehicles ca be printed out with the numberOfVehicles method.
With the toString method of the Garage a list of the vehicles can be printed out.

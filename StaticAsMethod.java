package com.keyword;


import java.util.Scanner;

class RailwayReservationTicket
{
    static int ticket_available=10;
    static int counter=0;
    String Name;
    int Age;
    public RailwayReservationTicket(String name,int age)
    {
        Name=name;
        Age=age;
    }
    static
    {
        counter++;
    }
    public void Available()
    {
        System.out.println(Name+" "+Age+" Ticket Confirmed");
    }
    public void NotAvailable()
    {
        System.out.println(Name+" "+Age+" Ticket Not Confirmed");
    }

}
public class StaticAsMethod {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the total number of ticket ");
        int total = in.nextInt();
        for (int i = 1; i <= total; i++)
        {
            if (RailwayReservationTicket.counter <= RailwayReservationTicket.ticket_available) {
                System.out.print("Enter the Name ");
                String name = in.next().trim();
                System.out.print("Enter the Age ");
                int age = in.nextInt();
                RailwayReservationTicket ticket = new RailwayReservationTicket(name, age);
                ticket.Available();
                RailwayReservationTicket.counter++;
                System.out.println("-----------------------------------------");
            }
            else
            {
                System.out.print("Enter the Name ");
                String name = in.next();
                System.out.print("Enter the Age ");
                int age = in.nextInt();
                RailwayReservationTicket ticket = new RailwayReservationTicket(name, age);
                ticket.NotAvailable();
                System.out.println("-----------------------------------------");
            }

        }
    }
}

package lesson9.problem4;

import java.util.LinkedList;
import java.util.Queue;

public class TicketingSystem {
    Queue<Ticket> tickets = new LinkedList<>();
    int nextId = 1;

    void addTicket(String description) {
        if (description == null) return;

        int id = this.nextId++;
        Ticket ticket = new Ticket(id, description);
        this.tickets.add(ticket);
    }

    Ticket processTicket() {
        if (this.tickets.isEmpty()) return null;
        return this.tickets.remove();
    }

    Ticket viewNextTicket() {
        if (this.tickets.isEmpty()) return null;
        return this.tickets.peek();
    }

    public static void main(String[] args) {
        TicketingSystem ticketSys = new TicketingSystem();
        System.out.println("ADDED 3 TICKETS:");
        ticketSys.addTicket("fix apply button size");
        ticketSys.addTicket("change view button to blue");
        ticketSys.addTicket("Add padding on landing page");
        System.out.println(ticketSys.tickets);

        System.out.println();
        System.out.println("NEXT TICKET (viewNext): " + ticketSys.viewNextTicket());

        System.out.println();
        System.out.println("PROCESSED (processTicket): " + ticketSys.processTicket());

        System.out.println();
        System.out.println("CURRENT TICKETS:");
        System.out.println(ticketSys.tickets);

        System.out.println();
        System.out.println("ADD NEW TICKET:");
        ticketSys.addTicket("fix modal crash issue");
        System.out.println(ticketSys.tickets);

        System.out.println();
        System.out.println("PROCESSED (processTicket): " + ticketSys.processTicket());
        System.out.println("PROCESSED (processTicket): " + ticketSys.processTicket());
        System.out.println("PROCESSED (processTicket): " + ticketSys.processTicket());
        System.out.println(ticketSys.tickets);

        System.out.println();
        System.out.println("PROCESSED (processTicket): " + ticketSys.processTicket());
        System.out.println(ticketSys.tickets);
    }
}


import java.net.InetAddress;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

public class NetworkAttendance {

    // Change this to match your college/local network
    static String ALLOWED_NETWORK = "192.168.";

    public static void main(String[] args) {
        try {
            InetAddress localHost = InetAddress.getLocalHost();
            String ipAddress = localHost.getHostAddress();
            String hostName = localHost.getHostName();

            System.out.println("Hostname : " + hostName);
            System.out.println("IP Address : " + ipAddress);

            if (ipAddress.startsWith(ALLOWED_NETWORK)) {
                markAttendance(ipAddress, hostName);
            } else {
                System.out.println("❌ Attendance not allowed (Not on college network)");
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    static void markAttendance(String ip, String host) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Roll Number: ");
        String roll = sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        try (FileWriter fw = new FileWriter("attendance.txt", true)) {
            fw.write("Roll: " + roll +
                     ", Name: " + name +
                     ", IP: " + ip +
                     ", Host: " + host +
                     ", Date: " + new Date() + "\n");

            System.out.println("✅ Attendance marked successfully");

        } catch (IOException e) {
            System.out.println("File error!");
        }
    }
}

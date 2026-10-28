 public class JavaInfo {

    public static void main(String[] args) {

        // This program prints information about the Java runtime.

        // Get the Java version.
        String version = System.getProperty("java.version");

        // Get the Java installation directory.
        String javaHome = System.getProperty("java.home");

        // Get the operating system name.
        String osName = System.getProperty("os.name");

        // Print the collected information.
        System.out.println("Java Version: " + version);
        System.out.println("Java Home: " + javaHome);
        System.out.println("Operating System: " + osName);
    }
}

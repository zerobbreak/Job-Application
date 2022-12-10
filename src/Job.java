public class Job {

    String name;
    String surname;
    String jobTitle;

    public Job(String name, String surname, String jobTitle) {

        this.name = name;
        this.surname = surname;
        this.jobTitle = jobTitle;

    }

    public String getJobTitle(String input) {
        switch (input) {
            case "CEH" -> {
                return "CEH";
            }
            case "Bug Bounty" -> {
                return "Bug Bounty Hunter";
            }
            case "Forensics" -> {
                return "Forensics analyst";
            }
            default -> {
                return "NO SUCH JOBS Available";
            }
        }
    }

    public String GenerateEmail(){
        String first = name;
        String last = surname;
        String job = getJobTitle(jobTitle);

        String email = "";
        email = first + last.charAt(0) +  "@" + job + ".com";

        return email;
    }

    public String toString() {
        String temp = "";
        String job = getJobTitle(jobTitle);
        String jobs[] = {"CEH", "Bug Bounty", "Forensics"};
        if (job.equals(jobs[0])) {
            temp = "Name: " + name + "\nSurname: " + surname + "\nPosition: " + job
                   + "\n" + GenerateEmail();
        } else if (job.equals(jobs[1])) {
            temp = "Name: " + name + "\nSurname: " + surname + "\nPosition: " + job
                    + "\n" + GenerateEmail();
        } else if (job.equals(jobs[2])) {
            temp = "Name: " + name + "\nSurname: " + surname + "\nPosition: " + job
                    + "\n" + GenerateEmail();
        } else {
            temp = "NO";
        }

        return temp;
    }

}
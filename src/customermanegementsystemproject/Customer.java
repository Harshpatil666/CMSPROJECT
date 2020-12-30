package customermanegementsystemproject;


public class Customer {
    
    private int queueNumber = 0;
    private long Id = 0;
    private String name;
    private String address;
    private String issue;
    private boolean status;

    public Customer(long Id, String name,
            String address, String issue,
            boolean status,int queueNumber) {
        this.Id = Id;
        this.name = name;
        this.address = address;
        this.issue = issue;
        this.status = status;
        this.queueNumber = queueNumber;
    }
    
    
    public Customer(int queueNumber) {
        this.queueNumber = queueNumber;
    }
    
    
    public long getId() {
        return Id;
    }

    public void setId(long Id) {
        this.Id = Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getIssue() {
        return issue;
    }

    public void setIssue(String issue) {
        this.issue = issue;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getQueueNumber() {
        return queueNumber;
    }

    public void setQueueNumber(int queueNumber) {
        this.queueNumber = queueNumber;
    }
    
}

package _10_oop;

public class Student {
    private String name;
    private String address;
    private String email;
    private String tel;
    private String id;

    public Student() {
    }

    public Student(String name, String address, String email, String tel, String id) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.tel = tel;
        this.id = id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void goToSchool() {
        System.out.println(name + " go to school");
    }

    public void doHomework() {
        System.out.println(name + " do homework");
    }

    public void payTuition(int money) {
        System.out.println(name + " pay tuition with " + money);
    }

    public void doAssginment() {
        System.out.println(name + " do assignment");
    }

    public void showInfo() {
        System.out.println("===========================");
        System.out.println("Họ và tên:" + name +
                "\nĐịa chỉ: " + address +
                "\nEmail: " + email +
                "\nSố điện thoại: " + tel +
                "\nMã sinh viên: " + id);
        System.out.println("===========================");
    }

    public static void main(String[] args) {
        Student st1 = new Student("Nguyễn Văn A", "Đà Nẵng", "nva@gmail.com", "0912345678", "B22DCCN175");
        st1.goToSchool();
        st1.doHomework();
        st1.payTuition(100);
        st1.doAssginment();
        st1.showInfo();
    }
}

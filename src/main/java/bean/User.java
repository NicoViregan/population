package bean;

import org.joda.time.DateTime;

import java.io.Serializable;


public class User implements Serializable {

    private DateTime registration_dttm;
    private int id;
    private String first_name;
    private String last_name;
    private String email;
    private String gender;
    private String ip_address;
    private int cc;
    private String country;
    private String birthdate;
    private Double salary;
    private String title;
    private String comments;

    public User() {
    }


    public User(DateTime registration_dttm, int id, String first_name, String last_name, String email, String gender,
            String ip_address, int cc, String country, String birthdate, Double salary, String title, String comments) {
        this.registration_dttm = registration_dttm;
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.gender = gender;
        this.ip_address = ip_address;
        this.cc = cc;
        this.country = country;
        this.birthdate = birthdate;
        this.salary = salary;
        this.title = title;
        this.comments = comments;
    }

    public DateTime getRegistration_dttm() {
        return registration_dttm;
    }

    public void setRegistration_dttm(DateTime registration_dttm) {
        this.registration_dttm = registration_dttm;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIp_address() {
        return ip_address;
    }

    public void setIp_address(String ip_address) {
        this.ip_address = ip_address;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}

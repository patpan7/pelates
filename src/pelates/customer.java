/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pelates;


/**
 *
 * @author Panos
 */
public class customer {
    String kwd;
    String company;
    String afm;
    String business;
    String tel_1;
    String tel_2;
    String mobile;
    String address;
    String city;
    String mail;
    String taxisuser;
    String taxispass;
    String afmuser;
    String afmpass;
    String myposuser;
    String mypospass;
    String simplyuser;
    String simplypass;

    public customer(String kwd, String company, String afm, String business, String tel_1, String tel_2, String mobile, String address, String city, String mail, String taxisuser, String taxispass, String afmuser, String afmpass, String myposuser, String mypospass, String simplyuser, String simplypass) {

        this.kwd = kwd;
        this.company = company;
        this.afm = afm;
        this.business = business;
        this.tel_1 = tel_1;
        this.tel_2 = tel_2;
        this.mobile = mobile;
        this.address = address;
        this.city = city;
        this.mail = mail;
        this.taxisuser = taxisuser;
        this.taxispass = taxispass;
        this.afmuser = afmuser;
        this.afmpass = afmpass;
        this.myposuser = myposuser;
        this.mypospass = mypospass;
        this.simplyuser = simplyuser;
        this.simplypass = simplypass;
    }

    public String getKwd() {
        return kwd;
    }

    public void setKwd(String kwd) {
        this.kwd = kwd;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getAfm() {
        return afm;
    }

    public void setAfm(String afm) {
        this.afm = afm;
    }

    public String getBusiness() {
        return business;
    }

    public void setBusiness(String business) {
        this.business = business;
    }

    public String getTel_1() {
        return tel_1;
    }

    public void setTel_1(String tel_1) {
        this.tel_1 = tel_1;
    }

    public String getTel_2() {
        return tel_2;
    }

    public void setTel_2(String tel_2) {
        this.tel_2 = tel_2;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getTaxisuser() {
        return taxisuser;
    }

    public void setTaxisuser(String taxisuser) {
        this.taxisuser = taxisuser;
    }

    public String getTaxispass() {
        return taxispass;
    }

    public void setTaxispass(String taxispass) {
        this.taxispass = taxispass;
    }

    public String getAfmuser() {
        return afmuser;
    }

    public void setAfmuser(String afmuser) {
        this.afmuser = afmuser;
    }

    public String getAfmpass() {
        return afmpass;
    }

    public void setAfmpass(String afmpass) {
        this.afmpass = afmpass;
    }

    public String getMyposuser() {
        return myposuser;
    }

    public void setMyposuser(String myposuser) {
        this.myposuser = myposuser;
    }

    public String getMypospass() {
        return mypospass;
    }

    public void setMypospass(String mypospass) {
        this.mypospass = mypospass;
    }

    public String getSimplyuser() {
        return simplyuser;
    }

    public void setSimplyuser(String simplyuser) {
        this.simplyuser = simplyuser;
    }

    public String getSimplypass() {
        return simplypass;
    }

    public void setSimplypass(String simplypass) {
        this.simplypass = simplypass;
    }
    
    public void print() {
        System.out.println(kwd);
        System.out.println(company);
        System.out.println(afm);
        System.out.println(business);
        System.out.println(tel_1);
        System.out.println(tel_2);
        System.out.println(mobile);
        System.out.println(address);
        System.out.println(city);
        System.out.println(mail);
        System.out.println(taxisuser);
        System.out.println(taxispass);
        System.out.println(afmuser);
        System.out.println(afmpass);
        System.out.println(myposuser);
        System.out.println(mypospass);
        System.out.println(simplyuser);
        System.out.println(simplypass);
    }
}

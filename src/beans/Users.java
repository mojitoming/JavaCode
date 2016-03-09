package beans;

/**
 * Created by Hao_Ming on 2016/3/9.
 */
public class Users {
    private int userId; // 买家ID
    private String name; // 买家姓名
    private int age; // 买家年龄
    private String sex; // 买家性别
    private String area; // 买家所在地区
    private String tel; // 买家电话

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
}

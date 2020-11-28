package ProxyPattern.bean;

public interface PersonBean {
    String getName();
    String getGender();
    String getInterests();

    void setName(String name);
    void setGender(String gender);
    void setInterests(String interests);

    int getHotOrNotRating();
    void setHotOrNotRating(int rating);
}

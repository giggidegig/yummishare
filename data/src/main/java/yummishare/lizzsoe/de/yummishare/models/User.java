package yummishare.lizzsoe.de.yummishare.models;

import org.apache.commons.lang3.builder.EqualsBuilder;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Giggi on 18.07.2016.
 */
public class User {

    private final String nickname;
    private final String email;
    private final String password;
    private String picture = "";

    private Set<NoGoAttribute> noGoAttibuteCollection = new HashSet<>();
    private LifeStyle lifestyle = LifeStyle.FLEISCH;

    public User(String nickname){
        this(nickname, "", "");
    }

    public User(String nickname, String email, String password) {
        this.nickname = nickname;
        this.email = email;
        this.password = password;
    }

    public String getName() { return this.nickname; }
    public String getEmail() { return email;}
    public String getPicture() { return picture; }
    public Collection<NoGoAttribute> getNoGoAttibuteCollection() { return noGoAttibuteCollection; }
    public NoGoAttribute getLifestyle() { return lifestyle; }

    public void addNoGoAttribute(NoGoAttribute noGoAttribute){
        this.noGoAttibuteCollection.add(noGoAttribute);
    }

    public void setLifeStyle(LifeStyle lifestyle){
        this.lifestyle = lifestyle;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this) return true;
        if(obj == null || !(obj instanceof User)) return false;

        User other = (User) obj;
        EqualsBuilder builder = new EqualsBuilder();
        builder.append(email, other.email);

        return builder.build();
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        builder.append("**********User**********\n");
        builder.append("Nickname: " + nickname + "\n");
        builder.append("E-Mail: " + email + "\n\n");

        return builder.toString();
    }
}

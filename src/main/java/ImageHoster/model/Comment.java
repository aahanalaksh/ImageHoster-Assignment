/*
 * Comment Model which has a relationship with image and the user
 */
package ImageHoster.model;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "comments")
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @Column(name = "text", columnDefinition = "TEXT")
    private String text;

    @Column(name = "createdDate")
    private LocalDate createdDate;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "image_id")
    private Image image;

    /**
     * Get the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * Set id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Get the text
     */
    public String getText() {
        return text;
    }

    /**
     * Set text the text to set
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * Get the createdDate
     */
    public LocalDate getCreatedDate() {
        return createdDate;
    }

    /**
     * Set createdDate the createdDate to set
     */
    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * Get the user
     */
    public User getUser() {
        return user;
    }

    /**
     * Set user
     */
    public void setUser(User user) {
        this.user = user;
    }

    /**
     * Get the image
     */
    public Image getImage() {
        return image;
    }

    /**
     *Set image
     */
    public void setImage(Image image) {
        this.image = image;
    }


}

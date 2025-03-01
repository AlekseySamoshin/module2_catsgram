package ru.yandex.practicum.catsgram.model;

import java.time.Instant;

public class Post {

    private final Integer postId;
    private final String author; // автор
    private final Instant creationDate = Instant.now(); // дата создания
    private String description; // описание
    private String photoUrl; // url-адрес фотографии

    public Post(Integer postId, String author, String description, String photoUrl) {
        this.postId = postId;
        this.author = author;
        this.description = description;
        this.photoUrl = photoUrl;
    }

    public Integer getPostId() {
        return postId;
    }

    public String getAuthor() {
        return author;
    }

    public Instant getCreationDate() {
        return creationDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }
}
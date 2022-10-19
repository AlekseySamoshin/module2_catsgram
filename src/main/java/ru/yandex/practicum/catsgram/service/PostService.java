package ru.yandex.practicum.catsgram.service;

import org.springframework.stereotype.Service;
import ru.yandex.practicum.catsgram.exceptions.PostNotFoundException;
import ru.yandex.practicum.catsgram.model.Post;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {
    private final List<Post> posts = new ArrayList<>();

    public Post getPostById(Integer postId) {
        return posts.stream()
                .filter(post -> post.getPostId().equals(postId))
                .findFirst()
                .orElseThrow(() -> new PostNotFoundException(new String("Пост " +  postId + " не найден!")));
    }

    public List<Post> findAll() {
        return posts;
    }

    public Post create(Post post) {
        posts.add(post);
        return post;
    }
}
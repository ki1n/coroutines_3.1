package ru.netology.coroutines.dto

data class CommentWithAuthor(
    val comments: Comment,
    val author: Author
)
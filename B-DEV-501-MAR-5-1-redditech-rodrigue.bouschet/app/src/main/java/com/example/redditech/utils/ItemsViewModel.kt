package com.example.redditech.utils

data class ItemsViewModel(
    var cardType: CardTypeEnum = CardTypeEnum.EMPTY,
    var title: String = "",
    var link: String = "",
    var text: String = "",
    var Username: String = "",
    var subreddit: String = "",
    var postedSince: Int = 0,
    var awardsNumber: Int = 0,
    var commentsNumber: Int = 0,
    var likeNumber: Int = 0
)

enum class CardTypeEnum {
    EMPTY, TEXT, IMAGE, GIF, LINK
}
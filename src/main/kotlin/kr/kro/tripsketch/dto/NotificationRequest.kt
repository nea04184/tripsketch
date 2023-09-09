package kr.kro.tripsketch.dto

data class NotificationRequest(
    val userId: String,
    val title: String,
    val body: String,
    val commentId: String? = null,
    val parentId: String? = null,
    val tripId: String? = null,
    val nickname: String? = null
)

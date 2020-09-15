data class Video(val id: Int, val title: String, val speaker: String, val videoUrl: String)

val initialUnwatchedVideos = listOf(
    Video(2, "Opening Keynote", "Andrey Breslav", "https://www.youtube.com/watch?v=0xKTM0A8gdI"),
    Video(1, "The Power of Types", "Danny Preussler", "https://www.youtube.com/watch?v=t3DBzaeid74"),
    Video(3, "The Ultimate Optimizer", "Erik Meijer", "https://www.youtube.com/watch?v=13eYMhuvmXE")
)
val initialWatchedVideos = listOf(
    Video(4, "Using Kotlin for Data Science", "Roman Belov", "https://www.youtube.com/watch?v=APnyDVye4JA")
)
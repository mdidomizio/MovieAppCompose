package com.example.composesixmovieapptheme.model

data class Movie(val id: String,
                 val title: String,
                 val year: String,
                 val genre: String,
                 val director: String,
                 val actors: String,
                 val plot: String,
                 val poster: String,
                 val images: List<String>,
                 val rating: String)

fun getMovies (): List<Movie>{
    return listOf(
        Movie(
            "tt0144999",
            "Isaia, horeve",
            "1966",
            "Comedy",
            "Kostas Asimakopoulos",
            "Vasilis Avlonitis, Takis Miliadis, etc",
            "A spirited wife tries to keep her husband's matchmaking and introduction agency afloat--while in the meantime--her daughter is ready to walk down the aisle with an affluent young heir. Have they struck gold or is this a beautiful dream?",
            "https://m.media-amazon.com/images/M/MV5BZTE2YTU1ZjAtM2RlNy00ZTJlLTg3ZjEtNmQwZDE0MTBjYzNlXkEyXkFqcGdeQXVyNDE5MTU2MDE@.",
            listOf("xxxximmages","xxxximmages"),
            "4.9"),

        Movie(
            "tt0127981",
            "On lautalla pienoinen kahvila",
            "1952",
            "Comedy, Musical, Romance",
            "Thure Bahne",
            "Tuija Halonen, Siiri Angerkoski, Kalle Viherpuu",
            "Add a Plot",
            "https://m.media-amazon.com/images/M/MV5BNDMxYzVlMWQtMmFkOC00NmNmLTg5MGQtOTNkOTRkMWRiOTdlXkEyXkFqcGdeQXVyMTIxMzMzMzE@.",
            listOf("xxxximmages","xxxximmages"),
            "5.9"
        ),
                Movie(
                "tt0144999",
        "Isaia, horeve",
        "1966",
        "Comedy",
        "Kostas Asimakopoulos",
        "Vasilis Avlonitis, Takis Miliadis, etc",
        "A spirited wife tries to keep her husband's matchmaking and introduction agency afloat--while in the meantime--her daughter is ready to walk down the aisle with an affluent young heir. Have they struck gold or is this a beautiful dream?",
        "https://m.media-amazon.com/images/M/MV5BZTE2YTU1ZjAtM2RlNy00ZTJlLTg3ZjEtNmQwZDE0MTBjYzNlXkEyXkFqcGdeQXVyNDE5MTU2MDE@.",
        listOf("xxxximmages","xxxximmages"),
        "4.9"),

    Movie(
        "tt0127981",
        "On lautalla pienoinen kahvila",
        "1952",
        "Comedy, Musical, Romance",
        "Thure Bahne",
        "Tuija Halonen, Siiri Angerkoski, Kalle Viherpuu",
        "Add a Plot",
        "https://m.media-amazon.com/images/M/MV5BNDMxYzVlMWQtMmFkOC00NmNmLTg5MGQtOTNkOTRkMWRiOTdlXkEyXkFqcGdeQXVyMTIxMzMzMzE@.",
        listOf("xxxximmages","xxxximmages"),
        "5.9"
    ),
        Movie(
            "tt0144999",
            "Isaia, horeve",
            "1966",
            "Comedy",
            "Kostas Asimakopoulos",
            "Vasilis Avlonitis, Takis Miliadis, etc",
            "A spirited wife tries to keep her husband's matchmaking and introduction agency afloat--while in the meantime--her daughter is ready to walk down the aisle with an affluent young heir. Have they struck gold or is this a beautiful dream?",
            "https://m.media-amazon.com/images/M/MV5BZTE2YTU1ZjAtM2RlNy00ZTJlLTg3ZjEtNmQwZDE0MTBjYzNlXkEyXkFqcGdeQXVyNDE5MTU2MDE@.",
            listOf("xxxximmages","xxxximmages"),
            "4.9"),

        Movie(
            "tt0127981",
            "On lautalla pienoinen kahvila",
            "1952",
            "Comedy, Musical, Romance",
            "Thure Bahne",
            "Tuija Halonen, Siiri Angerkoski, Kalle Viherpuu",
            "Add a Plot",
            "https://m.media-amazon.com/images/M/MV5BNDMxYzVlMWQtMmFkOC00NmNmLTg5MGQtOTNkOTRkMWRiOTdlXkEyXkFqcGdeQXVyMTIxMzMzMzE@.",
            listOf("xxxximmages","xxxximmages"),
            "5.9"
        ),
        Movie(
            "tt0144999",
            "Isaia, horeve",
            "1966",
            "Comedy",
            "Kostas Asimakopoulos",
            "Vasilis Avlonitis, Takis Miliadis, etc",
            "A spirited wife tries to keep her husband's matchmaking and introduction agency afloat--while in the meantime--her daughter is ready to walk down the aisle with an affluent young heir. Have they struck gold or is this a beautiful dream?",
            "https://m.media-amazon.com/images/M/MV5BZTE2YTU1ZjAtM2RlNy00ZTJlLTg3ZjEtNmQwZDE0MTBjYzNlXkEyXkFqcGdeQXVyNDE5MTU2MDE@.",
            listOf("xxxximmages","xxxximmages"),
            "4.9"),

        Movie(
            "tt0127981",
            "On lautalla pienoinen kahvila",
            "1952",
            "Comedy, Musical, Romance",
            "Thure Bahne",
            "Tuija Halonen, Siiri Angerkoski, Kalle Viherpuu",
            "Add a Plot",
            "https://m.media-amazon.com/images/M/MV5BNDMxYzVlMWQtMmFkOC00NmNmLTg5MGQtOTNkOTRkMWRiOTdlXkEyXkFqcGdeQXVyMTIxMzMzMzE@.",
            listOf("xxxximmages","xxxximmages"),
            "5.9"
        )
    )

}
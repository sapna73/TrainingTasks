package com.example.kotlintraining_cc.ModelClasses

class ItemsModel {
        var title: String = ""
        var genre: String = ""
        var year: String = ""

        constructor() {}

        constructor(title: String, genre: String, year: String) {
            this.title = title
            this.genre = genre
            this.year = year
        }
}
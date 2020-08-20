package com.kachi.wishlist.demo

import com.kachi.wishlist.model.Wish

/**
 *   Created by OLABODE WILSON on 8/20/20.
 */

object DummyData {

    // this method returns a static list of wishes to be used before
    // the database is implemented
    fun getListOfWishes(): List<Wish> {
        return listOf(
            Wish("games", "1/06/2020"),
            Wish("music player", "1/06/2020"),
            Wish("car", "8/06/2020"),
            Wish("playstation", "1/06/2020"),
            Wish("macbook pro", "12/07/2020"),
            Wish("visa", "1/09/2020")
        )
    }


}

//fun main() {
//
//    println(DummyData.getListOfWishes())
//}
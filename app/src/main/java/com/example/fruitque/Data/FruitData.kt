package com.example.fruitque.Data

import android.net.Uri

object FruitData {

    fun getDataFruit(): List<Fruit>{
        val listFruit = mutableListOf<Fruit>()

        listFruit.add(
            Fruit(
                "Anggur",
                "Rp 15.000/kg - Rp.20.000/kg",
                "Anggur adalah buah yang berbentuk bulat atau oval kecil dengan daging yang semi-tembus cahaya dan terbungkus oleh kulit yang halus tipis. Buah yang bahasa Inggris disebut dengan Grape ini ada yang memiliki biji ada yang tidak berbiji dan memiliki berbagai warna yang berbeda seperti warna merah, warna hijau dan warna ungu.",
                "${Uri.parse("android.resource://com.example.fruitque/drawable/anggur")}"
            )
        )
        listFruit.add(
            Fruit(
                "Apel",
                "Rp 10.000/kg - Rp.15.000/kg",
                "Apel merupakan salah satu jenis buah-buahan yang sangat populer di dunia. Buah pada awalnya berasal dari Asia Tengah kini telah banyak dibudidayakan oleh berbagai negara dan telah menjadi salah satu makanan sehat bagi hampir semua penduduk di dunia. Buah Apel yang biasanya dikonsumsi langsung ataupun dijadikan Jus minuman.",
                "${Uri.parse("android.resource://com.example.fruitque/drawable/apel")}"
            )
        )
        listFruit.add(
            Fruit(
                "Ceri",
                "Rp 20.000/kg - Rp.25.000/kg",
                "Buah cherry (ceri) merupakan bagian dari famili Rosaceae yang juga mencakup buah persik, plum, dan nektarin. Buah mungil berwarna merah menggoda ini sudah dinikmati sebagai salah satu sajian sehat sejak zaman bangsa Romawi kuno dulu.",
                "${Uri.parse("android.resource://com.example.fruitque/drawable/ceri")}"
            )
        )

        listFruit.add(
            Fruit(
                "Delima",
                "Rp 10.000/kg - Rp.15.000/kg",
                "Buah Delima adalah buah bulat dengan kulit keras yang berwarna merah kuning mengkilap. Buah yang dalam bahasa Inggris disebut dengan Pomegranate ini memiliki biji yang berbentuk seperti permata yang dikenal dengan sebutan Arils. Biji-biji Delima dapat dimakan mentah maupun diolah menjadi Jus Delima.",
                "${Uri.parse("android.resource://com.example.fruitque/drawable/delima")}"
            )
        )

        listFruit.add(
            Fruit(
                "Jeruk",
                "Rp 24.000/kg - Rp.25.000/kg",
                "Buah Jeruk Lemon atau dalam bahasa ilmiahnya disebut dengan Citrus limon adalah salah satu jenis buah-buahan yang paling populer di dunia. Rasa buah jeruk lemon sangat asam sehingga sangat jarang ada yang memakan isi buah lemon secara utuh seperti memakan buah jeruk atau buah apel. Namun banyak cara untuk mengkonsumsi buah yang asam dan banyak bermanfaat ini yaitu dengan.",
                "${Uri.parse("android.resource://com.example.fruitque/drawable/jeruk")}"
            )
        )

        listFruit.add(
            Fruit(
                "Kiwi",
                "Rp 12.000/kg - Rp.15.000/kg",
                "Kiwi adalah sejenis buah beri yang dapat dimakan dari tanaman merambat berkayu dalam genus Actinidia. Actinidia asli berasal dari Shaanxi, Tiongkok.Buah kiwi yang normal berbentuk oval, kira-kira sebesar telur ayam (5–8 cm / 2–3 in dan diameter 4.5–5.5 cm / 1¾–2 ).",
                "${Uri.parse("android.resource://com.example.fruitque/drawable/kiwi")}"
            )
        )

        listFruit.add(
            Fruit(
                "Kurma",
                "Rp 30.000/kg - Rp.35.000/kg",
                "Kurma adalah jenis buah yang bisa tumbuh kapan saja sepanjang tahun. Namun umumnya, buah ini sering dipanen pada musim gugur atau awal musim dingin di negara asalnya. Alasannya, karena di musim dingin buah ini berada dalam kondisi paling segar.",
                "${Uri.parse("android.resource://com.example.fruitque/drawable/kurma")}"
            )
        )

        listFruit.add(
            Fruit(
                "Melon",
                "Rp 14.000/kg - Rp.18.000/kg",
                "Buah melon memiliki banyak manfaat serta kaya kandungan zat dan vitamin yang terdapat di dalamnya. Pada satu buah melon, terkandung 60 kalori dan 14 gram kandungan gula alami. Selain itu, manfaat buah melon juga dapat memberikan energi, serta kadar lemak yang renda.",
                "${Uri.parse("android.resource://com.example.fruitque/drawable/melon")}"
            )
        )

        listFruit.add(
            Fruit(
                "Nanas",
                "Rp 10.000/kg - Rp.15.000/kg",
                "Nanas adalah  salah satu jenis buah-buahan Tropis yang terpopuler di dunia ini. Buah Nenas mengandung banyak gizi atau nutrisi yang sangat bermanfaat bagi kesehatan manusia. Nutrisi atau Gizi yang terkandung di dalam buah nenas diantaranya seperti Vitamin C, Manganese dan Asam Folat. Buah Nenas juga merupakan satu-satunya buah-buahan yang mengandung senyawa Bromelain.",
                "${Uri.parse("android.resource://com.example.fruitque/drawable/nanas")}"
            )
        )

        listFruit.add(
            Fruit(
                "Persik",
                "Rp 20.000/kg - Rp.28.000/kg",
                " adalah tanaman tanaman berbuah dari famili Rosaceae. Buah ini disebut juga sebagai buah táo dalam bahasa Mandarin dan momo dalam bahasa Jepang. Buah persik, kadang disebut nektarina, memiliki daging berwarna kuning dengan aroma harum dan memiliki satu biji yang keras.",
                "${Uri.parse("android.resource://com.example.fruitque/drawable/persik")}"
            )
        )

        listFruit.add(
            Fruit(
                "Pisang",
                "Rp 25.000/kg - Rp.27.000/kg",
                "Buah Pisang adalah salah satu tanaman yang banyak dibudidayakan di kawasan yang memiliki iklim panas dan lembab seperti Asia Tenggara, Kepulauan Pasifik, Papua, Amerika Selatan dan Afrika. Tanaman Pisang yang berdaun besar dan memanjang ini menghasilkan buah yang tersusun tandan dengan kelompok-kelompok tersusun menjari yang disebut dengan sisir.",
                "${Uri.parse("android.resource://com.example.fruitque/drawable/pisang")}"
            )
        )

        listFruit.add(
            Fruit(
                "Raspberry",
                "Rp 17.000/kg - Rp.20.000/kg",
                "Raspberry Pi, sering disingkat dengan nama Raspi, adalah komputer papan tunggal (single-board circuit; SBC) yang seukuran dengan kartu kredit yang dapat digunakan untuk menjalankan program perkantoran, permainan komputer, dan sebagai pemutar media hingga video beresolusi tinggi.",
                "${Uri.parse("android.resource://com.example.fruitque/drawable/raspberry")}"
            )
        )

        listFruit.add(
            Fruit(
                "Semangka",
                "Rp 23.000/kg - Rp.25.000/kg",
                "Semangka adalah salah satu jenis buah yang berukuran besar dengan nama ilmiah Citrullus lanatus. Dalam bahasa Inggris, buah Semangka disebut dengan Watermelon. Buah yang pada awalnya berasal dari benua Afrika bagian Selatan ini merupakan keluarga suku timun-timunan (Cucurbitaceae) seperti buah labu, buah melon dan ketimun. Buah Semangka pada umumnya dapat dimakan segar atau diproses menjadi jus semangka.",
                "${Uri.parse("android.resource://com.example.fruitque/drawable/semangka")}"
            )
        )

        return listFruit
    }


}
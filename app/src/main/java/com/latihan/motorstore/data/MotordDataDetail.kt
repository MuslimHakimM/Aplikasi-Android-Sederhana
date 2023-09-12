package com.latihan.motorstore.data

import android.net.Uri

object MotordDataDetail {
    fun getMotorDataDetail(): List<MotorData> {
        val listMotordata = mutableListOf<MotorData>()

        listMotordata.add(
            MotorData(
                "Honda Beat",
                "Rp 15.000.000",
                "Putih",
                "110 CC",
                "4.8",
                "Honda Beat tersedia dalam pilihan mesin Petrol di Indonesia Scooter baru dari Honda hadir dalam 6 varian. " +
                        "Bicara soal spesifikasi mesin Honda Beat, ini ditenagai dua pilihan mesin Petrol berkapasitas 110 cc. " +
                        "Beat tersedia dengan transmisi CVT tergantung variannya. Beat adalah Scooter 2 seater dengan panjang 1877 mm, lebar 669 mm, wheelbase 1256 mm. " +
                        "serta ground clearance 147 mm.",
                "${Uri.parse("android.resource://com.latihan.motorstore/drawable/beat_2020")}"
            )
        )

        listMotordata.add(
            MotorData(
                "Honda Beat Street",
                "Rp 15.000.000",
                "Hitam",
                "110 CC",
                "4.9",
                "Honda Beat Street tersedia dalam pilihan mesin Petrol di Indonesia Scooter baru dari Honda hadir dalam 2 varian. " +
                        "Bicara soal spesifikasi mesin Honda Beat Street, ini ditenagai dua pilihan mesin Petrol berkapasitas 110 cc. Beat Street tersedia dengan transmisi CVT tergantung variannya. " +
                        "Beat Street adalah Scooter 2 seater dengan panjang 1877 mm, lebar 742 mm, wheelbase 1256 mm. serta ground clearance 147 mm.",
                "${Uri.parse("android.resource://com.latihan.motorstore/drawable/beat_street")}"
            )
        )

        listMotordata.add(
            MotorData(
                "CBR",
                "Rp 30.000.000",
                "Merah",
                "150 CC",
                "4.8",
                "Honda CBR150R tersedia dalam pilihan mesin Petrol di Indonesia Sport baru dari Honda hadir dalam 10 varian. " +
                        "Bicara soal spesifikasi mesin Honda CBR150R, ini ditenagai dua pilihan mesin Petrol berkapasitas 149.16 cc. " +
                        "CBR150R tersedia dengan transmisi Manual tergantung variannya. CBR150R adalah Sport 2 seater dengan panjang 1983 mm, lebar 700 mm, wheelbase 1310 mm. " +
                        "serta ground clearance 160 mm.",
                "${Uri.parse("android.resource://com.latihan.motorstore/drawable/cbr")}"
            )
        )

        listMotordata.add(
            MotorData(
                "CRF",
                "Rp 40.000.000",
                "Hitam",
                "150 CC",
                "5.0",
                "Honda CRF150L tersedia dalam pilihan mesin Petrol di Indonesia Off Road baru dari Honda hadir dalam 2 varian. " +
                        "Bicara soal spesifikasi mesin Honda CRF150L, ini ditenagai dua pilihan mesin Petrol berkapasitas 149.15 cc. " +
                        "CRF150L tersedia dengan transmisi Manual tergantung variannya. CRF150L adalah Off Road 2 seater dengan panjang 2119 mm, lebar 793 mm, wheelbase 1375 mm. " +
                        "serta ground clearance 285 mm.",
                "${Uri.parse("android.resource://com.latihan.motorstore/drawable/crf")}"
            )
        )

        listMotordata.add(
            MotorData(
                "NMAX",
                "Rp 25.000.000",
                "Hitam",
                "155 CC",
                "5.0",
                "Yamaha Nmax tersedia dalam pilihan mesin Petrol di Indonesia Scooter baru dari Yamaha hadir dalam 2 varian. " +
                        "Bicara soal spesifikasi mesin Yamaha Nmax, ini ditenagai dua pilihan mesin Petrol berkapasitas 155 cc. Nmax tersedia dengan transmisi CVT tergantung variannya. " +
                        "Nmax adalah Scooter 2 seater dengan panjang 1955 mm, lebar 740 mm, wheelbase 1350 mm. serta ground clearance 124 mm.",
                "${Uri.parse("android.resource://com.latihan.motorstore/drawable/nmax")}"
            )
        )

        listMotordata.add(
            MotorData(
                "PCX",
                "Rp 26.000.000",
                "Silver",
                "160 CC",
                "4.5",
                "Honda PCX160 tersedia dalam pilihan mesin Petrol di Indonesia Scooter baru dari Honda hadir dalam 4 varian. " +
                        "Bicara soal spesifikasi mesin Honda PCX160, ini ditenagai dua pilihan mesin Petrol berkapasitas 156.9 cc. PCX160 tersedia dengan transmisi CVT tergantung variannya. " +
                        "PCX160 adalah Scooter 2 seater dengan panjang 1936 mm, lebar 742 mm, wheelbase 1313 mm. serta ground clearance 135 mm.",
                "${Uri.parse("android.resource://com.latihan.motorstore/drawable/pcx_155")}"
            )
        )

        listMotordata.add(
            MotorData(
                "Honda Scoppy",
                "Rp 15.000.000",
                "Coklat",
                "110 CC",
                "4.7",
                "Honda Scoopy tersedia dalam pilihan mesin Petrol di Indonesia Scooter baru dari Honda hadir dalam 8 varian. " +
                        "Bicara soal spesifikasi mesin Honda Scoopy, ini ditenagai dua pilihan mesin Petrol berkapasitas 109.5 cc. " +
                        "Scoopy tersedia dengan transmisi CVT tergantung variannya. Scoopy adalah Scooter 2 seater dengan panjang 1864 mm, lebar 683 mm, wheelbase 1251 mm. " +
                        "serta ground clearance 145 mm.",
                "${Uri.parse("android.resource://com.latihan.motorstore/drawable/scoppy")}"
            )
        )

        listMotordata.add(
            MotorData(
                "Honda Vario 125 CC",
                "Rp 17.000.000",
                "Biru-Kuning",
                "125 CC",
                "4.9",
                "Honda Vario 125 tersedia dalam pilihan mesin Petrol di Indonesia Scooter baru dari Honda hadir dalam 6 varian. " +
                        "Bicara soal spesifikasi mesin Honda Vario 125, ini ditenagai dua pilihan mesin Petrol berkapasitas 124.8 cc. " +
                        "Vario 125 tersedia dengan transmisi CVT tergantung variannya. Vario 125 adalah Scooter 2 seater dengan panjang 1918 mm, lebar 679 mm, wheelbase 1280 mm. " +
                        "serta ground clearance 131 mm.",
                "${Uri.parse("android.resource://com.latihan.motorstore/drawable/vario_125")}"
            )
        )

        listMotordata.add(
            MotorData(
                "Honda Vario 150 CC",
                "Rp 24.000.000",
                "Hitam",
                "150 CC",
                "4.9",
                "Vario 150 ditenagai oleh Pendingin Cairan PGM-FI 150 cc 1 Cylinder Mesin yang menghasilkan Tenaga 13 hp pada 8500 rpm dan Torsi 13.4 Nm pada 5000 rpm. " +
                        "Vario 150 memilik ketinggian kursi 769 mm. Ukuran ban depan adalah (front-tyre-size} sedangkan belakang 100/80 R14.",
                "${Uri.parse("android.resource://com.latihan.motorstore/drawable/vario_150")}"
            )
        )

        listMotordata.add(
            MotorData(
                "Honda Vario 160 CC",
                "Rp 27.000.000",
                "Putih",
                "160 CC",
                "5.0",
                "Honda Vario 160 tersedia dalam pilihan mesin Petrol di Indonesia Scooter baru dari Honda hadir dalam 4 varian. " +
                        "Bicara soal spesifikasi mesin Honda Vario 160, ini ditenagai dua pilihan mesin Petrol berkapasitas 156.9 cc. " +
                        "Vario 160 tersedia dengan transmisi CVT tergantung variannya. Vario 160 adalah Scooter 2 seater dengan panjang 1929 mm, lebar 679 mm, wheelbase 1277 mm. " +
                        "serta ground clearance 140 mm.",
                "${Uri.parse("android.resource://com.latihan.motorstore/drawable/vario_160")}"
            )
        )

        return listMotordata
    }
}
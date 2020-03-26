package com.example.submission;

import java.util.ArrayList;

public class BlogData
{
    private static String[] blogJudul = {
            "Python",
            "Java",
            "Ruby",
            "Lua",
            "Haskel",
            "PHP",
            "Java Script",
            "Dart",
            "Perl",
            "Kotlin",
    };

    private static String[] blogDetail = {
            "Python adalah bahasa pemrograman interpretatif multiguna dengan filosofi perancangan yang berfokus pada tingkat keterbacaan kode. Python diklaim sebagai bahasa yang menggabungkan kapabilitas, kemampuan, dengan sintaksis kode yang sangat jelas, dan dilengkapi dengan fungsionalitas pustaka standar yang besar serta komprehensif. Python juga didukung oleh komunitas yang besar.\n" +
                    "Python mendukung multi paradigma pemrograman, utamanya; namun tidak dibatasi; pada pemrograman berorientasi objek, pemrograman imperatif, dan pemrograman fungsional. Salah satu fitur yang tersedia pada python adalah sebagai bahasa pemrograman dinamis yang dilengkapi dengan manajemen memori otomatis. Seperti halnya pada bahasa pemrograman dinamis lainnya, python umumnya digunakan sebagai bahasa skrip meski pada praktiknya penggunaan bahasa ini lebih luas mencakup konteks pemanfaatan yang umumnya tidak dilakukan dengan menggunakan bahasa skrip. Python dapat digunakan untuk berbagai keperluan pengembangan perangkat lunak dan dapat berjalan di berbagai platform sistem operasi.\n" +
                    "Saat ini kode python dapat dijalankan di berbagai platform sistem operasi.",
            "Java adalah bahasa pemrograman yang dapat dijalankan di berbagai komputer termasuk telepon genggam. Bahasa ini awalnya dibuat oleh James Gosling saat masih bergabung di Sun Microsystems saat ini merupakan bagian dari Oracle dan dirilis tahun 1995. Bahasa ini banyak mengadopsi sintaksis yang terdapat pada C dan C++ namun dengan sintaksis model objek yang lebih sederhana serta dukungan rutin-rutin aras bawah yang minimal. " +
                    "Aplikasi-aplikasi berbasis java umumnya dikompilasi ke dalam p-code (bytecode) dan dapat dijalankan pada berbagai Mesin Virtual Java (JVM). Java merupakan bahasa pemrograman yang bersifat umum/non-spesifik (general purpose), dan secara khusus didisain untuk memanfaatkan dependensi implementasi seminimal mungkin. Karena fungsionalitasnya yang memungkinkan aplikasi java mampu berjalan di beberapa platform sistem operasi yang berbeda, java dikenal pula dengan slogannya, \"Tulis sekali, jalankan di mana pun\". " +
                    "Saat ini java merupakan bahasa pemrograman yang paling populer digunakan, dan secara luas dimanfaatkan dalam pengembangan berbagai jenis perangkat lunak aplikasi ataupun aplikasi ",
            "Ruby adalah bahasa pemrograman dinamis berbasis skrip yang berorientasi objek. Tujuan dari ruby adalah menggabungkan kelebihan dari semua bahasa-bahasa pemrograman skrip yang ada di dunia. Ruby ditulis dengan bahasa pemrograman C dengan kemampuan dasar seperti Perl dan Python. ",
            "Lua (Dari bahasa Portugis: lua yang berarti \"bulan\") merupakan bahasa pemrograman ringkas yang dirancang sebagai bahasa pemrograman dinamis berbasis skrip dengan semantik yang dapat dikembangkan atau ditambahkan. Sebagai bahasa skrip, Lua memiliki API dalam bahasa C yang relatif lebih sederhana dibandingkan bahasa skrip lainnya. ",
            "Haskell adalah bahasa pemrograman fungsional murni. Nama bahasa pemrograman Haskell diambil dari nama seseorang matematikawan Haskell Curry, yang terkenal akan karyanya di bidang combinatory logic. Haskell hanya mengenal expression dan equation. ",
            "PHP: Hypertext Preprocessor adalah bahasa skrip yang dapat ditanamkan atau disisipkan ke dalam HTML. PHP banyak dipakai untuk memprogram situs web dinamis. PHP dapat digunakan untuk membangun sebuah CMS, maupun aplikasi ",
            "JavaScript adalah bahasa pemrograman tingkat tinggi dan dinamis. JavaScript populer di internet dan dapat bekerja di sebagian besar penjelajah web populer seperti Google Chrome, Internet Explorer (IE), Mozilla Firefox, Netscape dan Opera. Kode JavaScript dapat disisipkan dalam halaman web menggunakan tag SCRIPT. JavaScript merupakan salah satu teknologi inti World Wide Web selain HTML dan CSS. JavaScript membantu membuat halaman web interaktif dan merupakan bagian aplikasi web yang esensial.\n" +
                    "Awalnya hanya diimplementasi sebagai client-side dalam penjelajah web, kini engine JavaScript disisipkan ke dalam perangkat lunak lain seperti dalam server-side dalam server web dan basis data, dalam program non web seperti perangkat lunak pengolah kata dan pembaca PDF, dan sebagai runtime environment yang memungkinkan penggunaan JavaScript untuk membuat aplikasi desktop maupun mobile. ",
            "Dart adalah bahasa pemrograman yang dioptimalkan klien untuk aplikasi pada berbagai platform. Ini dikembangkan oleh Google dan digunakan untuk membangun aplikasi mobile, desktop, server, dan web. ",
            "Perl adalah bahasa pemrograman untuk segala keperluan, dikembangkan pertama kali oleh Larry Wall di mesin Unix. Perl dirilis pertama kali pada tanggal 18 Desember 1987 ditandai dengan keluarnya Perl 1. Pada versi-versi selanjutnya, Perl tersedia pula untuk berbagai sistem operasi varian Unix (SunOS, Linux, BSD, HP-UX), juga tersedia untuk sistem operasi seperti DOS, Windows, PowerPC, BeOS, VMS, EBCDIC, dan PocketPC. Dukungan terhadap pemrograman berbasis objek (object oriented programming/OOP) ditambahkan pada Perl 5, yang pertama kali dirilis pada tanggal 31 Juli 1993. Proyek pengembangan Perl 6 dimulai pada tahun 2000, dan masih berlangsung hingga kini tanpa tanggal yang jelas kapan mau dirilis." +
                    "Ini dikatakan sendiri oleh Larry Wall dalam satu pidatonya yang dikenal dengan seri The State of the Onion. ",
            "Kotlin adalah sebuah bahasa pemrograman dengan pengetikan statis yang berjalan pada Mesin Virtual Java ataupun menggunakan kompiler LLVM yang dapat pula dikompilasikan kedalam bentuk kode sumber JavaScript. Pengembang utamanya berasal dari tim programer dari JetBrains yang bermarkas di Rusia.[2] Meskipun sintaksisnya tidak kompatibel dengan bahasa Java, Kotlin didesain untuk dapat bekerja sama dengan kode bahasa Java dan bergantung kepada kode bahasa Java dari Kelas Pustaka Java yang ada, seperti berbagai framework Java yang ada. Tim Pengembang memutuskan menamakannya Kotlin dengan mengambil nama dari sebuah pulau di Rusia, sebagaimana Java yang mengambil nama dari pulau Jawa di Indonesia. " +
                    "Setelah Google mengumumkan bahwa Kotlin menjadi bahasa kelas satu bagi Android, maka bersama Java dan C++, Kotlin menjadi bahasa resmi untuk pengembangan aplikasi-aplikasi Android.",
    };

    private static int[] blogImage = {
            R.drawable.python,
            R.drawable.java,
            R.drawable.ruby,
            R.drawable.lua,
            R.drawable.haskel,
            R.drawable.php,
            R.drawable.js,
            R.drawable.dart,
            R.drawable.perl,
            R.drawable.kotlin,
    };

    static ArrayList<Blog> getListData()
    {
        ArrayList<Blog> list = new ArrayList<>();
        for (int counter = 0; counter < blogJudul.length; counter++)
        {
            Blog blog = new Blog();
            blog.setJudul(blogJudul[counter]);
            blog.setDetail(blogDetail[counter]);
            blog.setImage(blogImage[counter]);
            list.add(blog);
        }

        return list;
    }
}

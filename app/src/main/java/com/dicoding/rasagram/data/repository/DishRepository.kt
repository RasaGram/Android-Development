package com.dicoding.rasagram.data.repository

import com.dicoding.rasagram.R
import com.dicoding.rasagram.data.model.Dish

class DishRepository {
    fun getAllData(): List<Dish>{
        return listOf(
            Dish(
                id = 0,
                dish_name = "Ayam Bakar",
                ingredients = "Ayam\n" + "Bumbu Ayam Bakar\n" + "Minyak, Jeruk Nipis\n",
                description = "1. Cuci bersih ayam. Kemudian rebus sebentar pake jahe geprek.\n" +
                        "\n" +
                        "2. Haluskan semua bumbu ungkep kecuali gula, garam, kecap, dan daun salam. Kemudian tumis dengan sedikit minyak sampai harum. Masukkan gula garam & daun salam nya. Beri air sedikit agar gula cepet larut.\n" +
                        "\n" +
                        "3. Masukkan ayam nya. Aduk rata & masak sebentar sampai bumbu agak meresap. Kemudian beri air kira2 2 gelas. Beri kecap dan aduk rata. Oya saya rekomendasikan pake kecap cap bango ya biar warna nya lebih cantik :)\n" +
                        "\n" +
                        "4. Biarkan sampai air menyusut sambil sesekali diaduk2. Angkat.\n" +
                        "\n" +
                        "5. Panaskan teflon. Bakar ayam pake api kecil saja. Bakar sampai permukaan ayam terlihat mengkaramel & kecoklatan. Angkat.\n" +
                        "\n" +
                        "6. Ayam bakar siap disajikan. Makan bersama sambel goreng dan lalapan. Ma syaa allaah nikmattt\n",
                image = R.drawable.ayambakar
            ),
            Dish(
                id = 1,
                dish_name = "Ayam Goreng",
                ingredients = "1/2 kg ayam\n" +
                        "300 ml air\n" +
                        "1 sdt garam\n" +
                        "1 sdt kaldu bubuk\n" +
                        "Bumbu halus\n" +
                        "2 siung bawang putih\n" +
                        "5 butir bawang merah\n" +
                        "2 butir kemiri\n" +
                        "2 cm kunyit\n" +
                        "1 cm jahe (tambahan dari saya)\n" +
                        "1 sdm ketumbar\n" +
                        "1 sdt merica\n" +
                        "35 gram lengkuas muda\n" +
                        "Bumbu aromatik:\n" +
                        "2 batang serai\n" +
                        "2 lembar daun salam\n" +
                        "3 lembar daun jeruk",
                description = "1. Cuci ayam, tiriskan\n" +
                        "\n" +
                        "2. Haluskan bumbu\n" +
                        "\n" +
                        "3. Masukkan ayam,air, bumbu dan bumbu aromatik dalam panci, tambahkan garam dan kaldu bubuk, ungkep hingga matang dan bumbu meresap\n" +
                        "\n" +
                        "4. Angkat ayam lalu goreng hingga kecoklatan, hemm...nikmatnya..\n",
                image = R.drawable.ayamgoreng
            ),
            Dish(
                id = 2,
                dish_name = "Bakso",
                ingredients = "500 gr daging giling sapi\n" +
                        "1 butir putih telur\n" +
                        "3 sdm bawang goreng\n" +
                        "1 sdm baput goreng\n" +
                        "1 sdt baking powder\n" +
                        "6-7 biji es batu\n" +
                        "secukupnya Garam merica, gulpas\n" +
                        "secukupnya Kaldu sapi royco\n" +
                        "100 gr tapioka\n" +
                        "Air untuk merebus",
                description = "1. Dengan food processor mixer semua bahan2 sampai halus Setelah nya kita masukkan tapioka, mixer kembali sampai rata tercampur\n" +
                        "\n" +
                        "2. Panaskan air sampai mendidih, matikan apinya\n" +
                        "\n" +
                        "3. Dengan tangan ambil adonan, bulatkan ambil dgn sendok (sendok basahi dgn air berkala)\n" +
                        "\n" +
                        "4. Baso bulatan siap di cemplungin\n" +
                        "\n" +
                        "5. Sampai semua baso mengapung, nyalakan apinya sedang saja, masak baso sampai matang, biarkan boiling airnya. Aduk2 sesekali.\n" +
                        "\n" +
                        "6. Setelah matang...tiriskan baso. Masukkan ke wadah dgn air dingin dan es batu. Biarkan 7-10 menit, angkat tiriskan, siap di freezer.\n",
                image = R.drawable.bakso
            ),
            Dish(
                id = 3,
                dish_name = "Bakwan",
                ingredients = "3 buah jagung manis\n" +
                        "120 gr tepung bakwan jagung\n" +
                        "120 gr tepung terigu serbaguna\n" +
                        "3 batang daun bawang\n" +
                        "3 siung bawang putih uleg\n" +
                        "1 sdm garam (selera)\n" +
                        "3 blok kaldu udang\n" +
                        "secukupnya Air",
                description = "1. Serut jagung, lalu masukkan daun bawang, tepung bakwan, tepung terigu, kaldu udang, garam, dan bawang putih uleg\n" +
                        "\n" +
                        "2. Lalu tambahkan air sedikit demi sedikit sampai kekentalan yang diinginkan. Aku lebih suka sedikit encer biar rada krispy.\n" +
                        "\n" +
                        "3. Lalu goreng dalam minyak panas sampai kedua sisinya golden brown, lalu angkat dan tiriskan.\n" +
                        "\n" +
                        "Enjoy❤\uFE0F❤\uFE0F.",
                image = R.drawable.bakwan
            ),
            Dish(
                id = 4,
                dish_name = "Batagor",
                ingredients = "70 gram kulit ayam\n" +
                        "100 ml air\n" +
                        "2 sdm minyak sayur\n" +
                        "7 siung bamer\n" +
                        "350 ml gram ikan tenggiri giling\n" +
                        "50 gram Daging paha ayam giling\n" +
                        "5 siung bawang putih\n" +
                        "1 buah daun bawang\n" +
                        "1,5 sdt garam\n" +
                        "2 sdm gula pasir\n" +
                        "1/2 sdt merica\n" +
                        "2 sdt kaldu\n" +
                        "1 sdm kecap ikan\n" +
                        "1 butir telur\n" +
                        "135 ml air es\n" +
                        "150 gram tepung sagu/tapioka\n" +
                        "25 gram gram tepung protein sedang\n" +
                        "100 gram kacang tanah\n" +
                        "5 siung bawang putih\n" +
                        "7 siung bawang merah\n" +
                        "10 buah cabe keriting merah\n" +
                        "3 butir kemiri sangrai\n" +
                        "160 ml minyak ngoreng\n" +
                        "60 ml air\n" +
                        "80 gr gula jawa\n" +
                        "2 sdm air asam jawa\n" +
                        "3 lembae daun jeruk\n" +
                        "1 sdt garam\n" +
                        "1 sdm tepung beras\n" +
                        "1 wadah kulit pangsit\n" +
                        "2 buah jeruk limau\n" +
                        "5-6 buah tahu\n" +
                        "1 botol Kecap manis",
                description = "1. Bumbu kacang :\n" +
                        "Goreng kacang sampai setengah matang lalu masukan cabai, daun jeruk,duo bawang.\n" +
                        "Lalaju haluskan dengan bahan lain. Lalu masak koreksi rasa. Sisihkan.\n" +
                        "\n" +
                        "2. Minyak kulit:\n" +
                        "Goreng kulit ayam tanpa minyak smpe kering. Lalu masukan bamer yg sudah di iris tipis smpai layu\n" +
                        "\n" +
                        "3. Lalu haluskan,\n" +
                        "Masukan ikan tenggiri ayam dan bahan lain haluskan.(Kecuali tepung) Lalu sisihkan di wadah campur dengan tepung2.\n" +
                        "\n" +
                        "4. Siapkan kulit pangsit dan tahu.\n" +
                        "Isi isian batagor tadi sesuai selera\n" +
                        "\n" +
                        "5. Goreng di minyak panas dengan api kecil sedang.\n" +
                        "\n" +
                        "6. Lalu sisihkan siap disajikan. Dengan kuah atau sambal kacang\n" +
                        "\n" +
                        "7. Selamat mencoba \n",
                image = R.drawable.batagor
            ),
            Dish(
                id = 5,
                dish_name = "Bihun",
                ingredients = "Bihun\n" +
                        "Bawang Putih & Bawang Merah\n" +
                        "Wortel\n" +
                        "KoL\n" +
                        "Udang\n" +
                        "Sosis Fiesta\n" +
                        "Bakso Fiesta\n" +
                        "Telur\n" +
                        "Kaldu Jamur\n" +
                        "Garam\n" +
                        "Kecap Asin\n" +
                        "Kecap Pekat",
                description = "1. Rendam Bihun dengan air bersih kurang lebih 1 jam (Sampai bihunnya lembek)\n" +
                        "\n" +
                        "2. Tiriskan bihun yang sudah lembek\n" +
                        "\n" +
                        "3. Panaskan wajan, masukin sedikit minyak\n" +
                        "\n" +
                        "4. Tumis Baput dan Bamer\n" +
                        "\n" +
                        "5. Masukin telur\n" +
                        "\n" +
                        "6. Masukin Bakso dan Sosis\n" +
                        "\n" +
                        "7. Masukin udang\n" +
                        "\n" +
                        "8. Masukin Kol dan Wortel\n" +
                        "\n" +
                        "9. Masukin kaldu Jamur, kecap asin, garam, kecap pekat. Tumis semua sampai tercampur rata dan mateng\n" +
                        "\n" +
                        "10. Lalu masukin sedikit air hinggah air mendidih, setelah itu cicip rasa\n" +
                        "\n" +
                        "11. Setelah rasa sudah oke, masukin bihun yang sudah di tiriskan, Oseng hinggah mateng dan tercampur rata\n" +
                        "\n" +
                        "12 .Bihun Goreng Siap Di Saji\uD83E\uDD24\uD83E\uDD24\uD83E\uDD24",
                image = R.drawable.bihun
            ),
            Dish(
                id = 6,
                dish_name = "Capcay",
                ingredients = "10 butir bakso sapi potong tipis, opsional boleh ayam/sosis dll\n" +
                        "1/4 buah kembang kol\n" +
                        "1/4 kol/kubis\n" +
                        "2 buah wortel\n" +
                        "3 buah sawi pakcoy\n" +
                        "5 buah jagung muda/ putren\n" +
                        "secukupnya jamur kuping kering, rendam hingga empuk\n" +
                        "2 batang daun bawang iris memanjang\n" +
                        "3 siung bawang putih cincang halus\n" +
                        "2 siung bawang merah cincang halus\n" +
                        "250 ml air\n" +
                        "3 sdm saus tiram\n" +
                        "1 sdm kecap asin\n" +
                        "1 sdm kaldu jamur bubuk\n" +
                        "1/2 sdt lada bubuk\n" +
                        "secukupnya garam/penyedap\n" +
                        "1 sdm tepung maizena larutkan dgn sedikit air\n" +
                        "secukupnya minyak\n" +
                        "1 sdm ebi haluskan",
                description = "1. Potong- potong sayuran sesuai selera.\n" +
                        "\n" +
                        "2. Tumis bawang putih hingga harum, masukkan daun bawang dan ebi.\n" +
                        "\n" +
                        "3. Tambahkan air, lalu masukkan bakso dan sayuran mulai dari yang keras.\n" +
                        "\n" +
                        "4. Seasoning dgn saus tiram, kecap asin, kaldu jamur, lada dan garam. koreksi rasa, didihkan sebentar.\n" +
                        "\n" +
                        "5. Tuangkan larutan maizena, aduk hingga mengental. lalu angkat, sajikan selagi hangat.",
                image = R.drawable.capcay
            ),
            Dish(
                id = 7,
                dish_name = "Gado-Gado",
                ingredients = "350 g kentang yang sudah d kupas,kukus,lalu di potong sesuai selera\n" +
                        "6 buah tahu putih (bumbuin lalu goreng sampai matang,lalu di potong2)\n" +
                        "1 papan tempe (di bumbuin lalu di goreng sampe matang,lalu di potong2)\n" +
                        "8 lembar daun selada di potong2\n" +
                        "2 buah timun di potong sesuai selera\n" +
                        "200 gr toge, rebus\n" +
                        "250 gr kol iris tipis,rebus\n" +
                        "6 buah telur rebus,kupas,potong2 sesuai selera\n" +
                        "2 buah tomat potong sesuai selera\n" +
                        "secukupnya Bawang merah goreng\n" +
                        "secukupnya Kerupuk goreng\n" +
                        "200 gr kacang tanah,goreng dan haluskan\n" +
                        "4 buah daun jeruk buang tulangnya\n" +
                        "2 sdt kecap manis\n" +
                        "1 sdt garam\n" +
                        "3 sdt gula merah\n" +
                        "300 ml santan (pakai santan peras)\n" +
                        "300 ml air\n" +
                        "1 sdt asam jawa di larutkan dengan 2 sdm air\n" +
                        "5 buah cabe merah besar buang bijinya\n" +
                        "3 buah cabe merah keriting\n" +
                        "5 cm kencur\n" +
                        "4 siung bawang putih\n" +
                        "secukupnya Minyak goreng",
                description = "1. Kukus kentang yg sudah di kupas dan di potong2. Rebus toge. Rebus telur. Sisihkan\n" +
                        "\n" +
                        "2. Bumbuin tempe dan tahu lalu di goreng.\n" +
                        "\n" +
                        "3. Goreng kacang tanah sampai kecoklatan lalu haluskan pake blender.\n" +
                        "\n" +
                        "4. Haluskan cabe merah besar yg sudah di buang bijinya,cabe merah keriting, kencur dan bawang putih.\n" +
                        "\n" +
                        "5. Setelah itu tuang minyak secukupnya di wajan,tumis bumbu halus dan daun jeruk hingga harum. Lalu masukkan kacang tanah halus dan kecap manis,aduk rata. Setelah rata masukkan air,santan,gula jawa,garam dan air asam jawa. Aduk rata dan masak hingga matang. Setelah matang tunggu agak dingin.\n" +
                        "\n" +
                        "6. Tata kentang,tahu,tempe,timun,toge,selada,tomat,kol,telur di atas piring saji. Lalu siram dengan bumbu kacang dan beri taburan bawang goreng atasnya. Dan kasih kerupuk goreng d sampingnya. Selamat mencoba",
                image = R.drawable.gado
            ),
            Dish(
                id = 8,
                dish_name = "Ikan Goreng",
                ingredients = "1 ekor ikan nila berat 500gr\n" +
                        "Bumbu marinasi:\n" +
                        "1 sdt kunyit bubuk\n" +
                        "1/2 sdt kaldu jamur bubuk\n" +
                        "1 sdt ketumbar bubuk\n" +
                        "Secukupnya garam\n" +
                        "Secukupnya kremesan",
                description = "1. Cuci bersih ikan lalu Lumuri ikan dengan bahan marinasi, diamkan 15 menit\n" +
                        "\n" +
                        "2. Goreng ikan di minyak panas sampai kering\n" +
                        "\n" +
                        "3. Sajikan ikan goreng dengan kremesan, lalap dan sambal bawang",
                image = R.drawable.ikangoreng
            ),
            Dish(
                id = 9,
                dish_name = "Kerupuk",
                ingredients = "500 gram tepung tapioka\n" +
                        "50 gram tepung terigu\n" +
                        "1 sdt soda kue (skip boleh)\n" +
                        "1/2 sdt baking powder (skip boleh)\n" +
                        "10 bawang putih\n" +
                        "125 ml air\n" +
                        "Garam\n" +
                        "Lada\n" +
                        "Penyedap rasa\n" +
                        "Gula pasir\n" +
                        "Minyak goreng",
                description = "1. Haluskan bawang putih kemudian goreng. Dinginkan kemudian campur dgn garam, lada, penyedap rasa, gula pasir\n" +
                        "\n" +
                        "2. Masukan tepung tapioka dan tepung terigu, beri air dikit demi sedikit sambil d uleni hingga kalis\n" +
                        "\n" +
                        "3. Ambil sedikit adonan, tipiskan kemudian Cetak berbentuk bulat keriting (uyel-uyel) menggunakan cetakan berlubang kecil2. (me pake asbak stainles yg q lubang2in sendiri, atau bisa pake saringan santan)\n" +
                        "\n" +
                        "4. Kukus skitar 15-25 menit hingga matang\n" +
                        "\n" +
                        "5. Kemudian jemur d bawah sinar matahari hingga benar2 kering ya. (me : 3 hari krn udh mulai musim hujan)\n" +
                        "\n" +
                        "6. Kemudian panaskan minyak lalu goreng dgn api kecil",
                image = R.drawable.kerupuk
            ),
            Dish(
                id = 10,
                dish_name = "Martabak Telur",
                ingredients = "22 lembar kulit lumpia\n" +
                        "3 batang daun bawang\n" +
                        "3 butir telur\n" +
                        "1 sdt kaldu bubuk\n" +
                        "Sejumput garam\n" +
                        "2 sdm terigu + 3 sdm air",
                description = "1. Iris tipis daun bawang. Campurkan daun bawang, telur, dan kaldu bubuk. Aduk hingga semuanya tercampur rata.\n" +
                        "\n" +
                        "2. Siapkan kulit lumpia, masukan adonan telur. Lipat lalu rekatkan dengan cairan terigu.\n" +
                        "\n" +
                        "3. Martabak Telur Kulit Lumpia langkah memasak 2 foto\n" +
                        "3\n" +
                        "4. Goreng di minyak yang panas dengan api kecil hingga kecoklatan. Angkat lalu tiriskan. Siap disantap.",
                image = R.drawable.martabak
            ),

            Dish(
                id = 11,
                dish_name = "Mie",
                ingredients = "1 bungkus mie burung dara\n" +
                        "4 siung bawang merah\n" +
                        "4 siung bawang putih\n" +
                        "2/3 butir kemiri\n" +
                        "daun bawang\n" +
                        "garam lada penyedap\n" +
                        "cabe rawit / cabe keriting (sesuai keinginan)\n" +
                        "sayur sawi dan wortel (bisa disesuaikan)\n" +
                        "telur\n" +
                        "kecap manis",
                description = "1. Mie burung dara, di rendam dengan air panas, sekitar 5 menit aja lalu sisihkan. kalo suka lebih lembek lamakan waktu rendamnya\n" +
                        "\n" +
                        "2. Potong sayur sesuai selera\n" +
                        "\n" +
                        "3. Bawang merah bawang putih kemiri + lada + garam secukupnya diulek sampai halus\n" +
                        "\n" +
                        "4. Orak arik telur, kemudian sisihkan.\n" +
                        "\n" +
                        "5. Tumis bumbu sampai wangi, kemudian masukan wortel sampai agak matang, kemudian beri air sedikit. tunggu sampai wortel matang, masukan sayur sawi / sayur hijau lainnya. masukan daun bawang dan potongan cabe setan. kemudian masukan kecap manis secukupnya. koreksi rasa dengan garam penyedap dan lada. aduk merata sampai matang. kecilkan api, lalu masukan mie (pakai api kecil aja) aduk rata lalu masukan telor yang sudah di orak arik. selesai",
                image = R.drawable.mie
            ),

            Dish(
                id = 12,
                dish_name = "Nasi Goreng",
                ingredients = "2 porsi nasi\n" +
                        "1 potong ayam goreng (suwir)\n" +
                        "1 lenjer sosis (iris)\n" +
                        "1 batang daun bawang (iris)\n" +
                        "3 siung bawang putih (cincang)\n" +
                        "3-4 sdm kecap manis\n" +
                        "1 sdt saus tiram\n" +
                        "Secukupnya garam\n" +
                        "1/2 sdt kaldu jamur\n" +
                        "1/4 sdt kaldu bubuk",
                description = "1. Tumis bawang putih cincang sampai layu, masukkan nasi, ayam suwir, dan sosis aduk rata\n" +
                        "\n" +
                        "2. Tambahkan garam, kecap manis, saos tiram, pada bubuk dan kaldu jamur, aduk rata, masukan daun bawang, aduk rata masak sampai tanak, koreksi rasa\n" +
                        "\n" +
                        "Sajikan selagi hangat",
                image = R.drawable.nasigoreng
            ),
            Dish(
                id = 13,
                dish_name = "Nasi Putih",
                ingredients = "1,5 liter Beras\n" +
                        "1 gayung Air",
                description = "1. Cuci beras dengan air sampai bersih\n" +
                        "\n" +
                        "2. Masukan beras ke dalam citel isi air, kemudian nyalakan api, masak beras sampai jadi gigih, kemudian angkat gigihnya dan aduk-aduk\n" +
                        "\n" +
                        "3. Siapkan langseng diatas kompor gas, isi air sampai mendidih, kemudian masukin kain ke dalam langseng dan isi dengan gigih jika ada nasi sisa kemari nasinya simpan di atas gigih, nasi tertutup semua kain, dan jika mau kukus cabe rawit untuk sambal cabenya bungkus dengan plastik simpan di atas kain, kemudian tutup dengan tutup langseng\n" +
                        "\n" +
                        "4. Angkat nasi dan kipas sambil di aduk-aduk, masukan nasi ke dalam wadah\n" +
                        "\n" +
                        "5. Nasi siap disajikan",
                image = R.drawable.nasiputih
            ),
            Dish(
                id = 14,
                dish_name = "Nugget",
                ingredients = "1/2 kg ikan senangin\n" +
                        "20 sdm tepung terigu\n" +
                        "15 sdm tepung kanji\n" +
                        "1 buah wortel\n" +
                        "7 siung bawang putih\n" +
                        "2 butir telur\n" +
                        "Secukupnya merica\n" +
                        "Secukupnya garam\n" +
                        "Secukupnya tepung panir\n" +
                        "Secukupnya mentega",
                description = "1. Ikan tenggiri dicuci bersih dan dihaluskan menggunakan blender.\n" +
                        "\n" +
                        "2. Dihaluskan bawang putih, merica, dan garam.\n" +
                        "\n" +
                        "3. Dimasukkan tepung terigu, tepung kanji, ikan, dan bumbu halus ke dalam wadah.\n" +
                        "\n" +
                        "4. Ditambahkan penyedap rasa dan campur hingga merata.\n" +
                        "\n" +
                        "5. Wortel diparut dan ditambahkan ke dalam adonan.\n" +
                        "\n" +
                        "6. Telur dikocok kemudian ditambahkan ke dalam adonan dan dicampur hingga merata.\n" +
                        "\n" +
                        "7. Adonan dimasukkan ke dalam cetakan yang telah diolesi mentega dan dikukus hingga matang.\n" +
                        "\n" +
                        "8. Didinginkan sebentar lalu dipotong sesuai keinginan.\n" +
                        "\n" +
                        "9. Disiapkan tepung terigu yang diberi air dan tepung panir.\n" +
                        "\n" +
                        "10. Dicelupkan nugget ke dalam tepung basah dan tutup dengan tepung panir. Ulangi langkah ini ke semua nugget.\n" +
                        "\n" +
                        "11. Dinginkan di dalam kulkas selama semalam. Kemudian goreng hingga menguning.",
                image = R.drawable.nugget
            ),
            Dish(
                id = 15,
                dish_name = "Opor Ayam",
                ingredients = "1 ekor ayam kampung utuh ukuran sedang\n" +
                        "2 bungkus santan kara ukuran kecil\n" +
                        "Secukupnya minyak goreng\n" +
                        "Secukupnya air\n" +
                        "Bumbu halus :\n" +
                        "10 siung Bawang merah\n" +
                        "7 siung Bawang putih\n" +
                        "4 butir kemiri\n" +
                        "Seruas jahe\n" +
                        "2 ruas kunyit\n" +
                        "1/2 sendok teh lada kasar\n" +
                        "1/2 sendok teh ketumbar\n" +
                        "Bumbu tabur :\n" +
                        "secukupnya Garam\n" +
                        "secukupnya Gula\n" +
                        "secukupnya Kaldu jamur\n" +
                        "Bumbu aromatik :\n" +
                        "3 lembar daun salam\n" +
                        "2 lembar daun jeruk\n" +
                        "2 batang sereh memarkan",
                description = "1. Potong ayam menjadi beberapa bagian, cuci bersih lalu masukkan ke dalam air yang sudah mendidih, rebus kurang lebih 10 menit, matikan api. Buang airnya lalu cuci kembali.\n" +
                        "\n" +
                        "2. Di wajan yang panas, Tumis bawang merah, bawang putih, kemiri, lada, ketumbar, kunyit dan jahe yang sudah dihaluskan. Setelah bumbu mulai layu masukkan bumbu aromatik yaitu daun salam, daun jeruk dan sereh. Aduk-aduk kembali sampai bumbu berubah warna menjadi kuning kecoklatan.\n" +
                        "\n" +
                        "3. Setelah bumbu dipastikan sudah matang, angkat lalu masukkan ke dalam panci bersamaan dengan ayam dan rebus kembali selama kurang lebih 20 menit. Jangan lupa tambahkan gula, garam dan kaldu jamur. Setelah ayam empuk dan matang, lanjut tuang santan kara. Aduk-aduk kembali untuk beberapa menit. lalu koreksi rasa.\n" +
                        "\n" +
                        "4. Jika rasanya sudah pas, matikan api. Opor ayam kampung siap disajikan dengan taburan bawang goreng.\n" +
                        "\n" +
                        "5. Selamat mencoba ☺\uFE0F",
                image = R.drawable.opor
            ),
            Dish(
                id = 16,
                dish_name = "Pempek",
                ingredients = "500 gr ikan tenggiri\n" +
                        "500 gr tepung sagu tani/ tapioka\n" +
                        "4 siung bawang putih\n" +
                        "1 1/2 sdm garam\n" +
                        "1 bungkus kaldu bubuk\n" +
                        "1 sdt gula\n" +
                        "1 butir telur\n" +
                        "250 ml air\n" +
                        "Isian\n" +
                        "2 butir telur dikocok",
                description = "1. Blender/ haluskan ikan dan bawang putih. Tambahkan garam, kaldu, gula, tambahkan air. Aduk dengan tangan hingga semua tercampur dengan baik\n" +
                        "\n" +
                        "2. Masukkan tepung sedikit demi sedikit. Uleni hingga tercampur rata licin kalis. Aku karena bikin sudah larut malam, adonan ga sampai kalis. Note: Adonan memang masih lengket.\n" +
                        "\n" +
                        "3. Tambahkan ke papan tepung sagu dan ditangan,, agar nanti tidak lengket. Bentuk adonan memanjang untuk lenjer.\n" +
                        "\n" +
                        "4. Didihkan air, masukkan pempek. Masak hingga mengapung. Angkat. Sajikan dengan kuah cuko Resep cuko ada di lampiran",
                image = R.drawable.pempek
            ),
            Dish(
                id = 17,
                dish_name = "Rendang",
                ingredients = "1,5 kg Daging Sapi\n" +
                        "250 gr Cabe Merah Besar\n" +
                        "100 gr Cabe Keriting\n" +
                        "10 siung Bawang Merah\n" +
                        "15 Siung Bawang Putih\n" +
                        "4 ruas jari Lengkuas\n" +
                        "2 Ruas jari Jahe\n" +
                        "3 lembar Daun Salam\n" +
                        "3 Lembar Daun Jeruk\n" +
                        "3 Lembar Daun Kunyit\n" +
                        "2 sdt Ketumbar\n" +
                        "3 lembar sereh\n" +
                        "3 cm Kayu manis\n" +
                        "secukupnya Garam\n" +
                        "secukupnya Penyedap rasa\n" +
                        "secukupnya Gula\n" +
                        "1 liter santan Kental\n" +
                        "1 liter santan Encer",
                description = "1. Potong daging sesuai selera\n" +
                        "\n" +
                        "2. Haluskan bumbu, cabe merah, cabe keriting, bawang merah, bawang putih, lengkuas, jahe..\n" +
                        "\n" +
                        "3. Masukan irisan daging kedalam wajan, beserta bumbu yg sudah di haluskan, tambahkan ketumbar, daun salam, daun jeruk, daun kunyit, sereh, lengkuas geprek, jahe geprek, dan kayu manis aduk rata\n" +
                        "\n" +
                        "Masukan Santan encer ke dalam daging yg sudah di bumbui, masak sampai air setengah surut, tambahkan santan kental, beri garam gula, penyedap rasa.. aduk2 sambil tes rasa.. biar kan santan surut.. daging siap di sajikan",
                image = R.drawable.rendang
            ),
            Dish(
                id = 18,
                dish_name = "Roti",
                ingredients = "150 g tepung terigu (aku pakai terigu pro sedang)\n" +
                        "1/4 sdt garam\n" +
                        "15 g gula pasir\n" +
                        "1/2 sdt ragi\n" +
                        "1/2 sdt SP (optional)\n" +
                        "15 g Butter Oil Substitute (aku pakai merk ButterSub milky) kalo ga ada pakai margarin aja\n" +
                        "70 g air dingin",
                description = "1. Di dalam mangkok campurkan tepung terigu, garam dan gula, aduk rata, lalu tambahkan ragi, aduk rata kembali\n" +
                        "\n" +
                        "2. Selanjutnya tambahkan SP, BOS dan air dingin Note: Kalo mau pakai real Butter \uD83E\uDDC8 sebaiknya dimasukan setelah adonan diulen hingga setengah kalis\n" +
                        "\n" +
                        "3. Ulen adonan sampai menyatu dan homogen pakai mikser dengan kecepatan rendah atau kecepatan 1\n" +
                        "\n" +
                        "4. Naikan kecepatan mikser ke sedang lalu ulen adonan sampai kalis elastis dan lembut\n" +
                        "\n" +
                        "5. Kurang lebih sampai seperti ini. Kemudian bulatkan adonan dan istirahatkan selama 10-20 menit saja\n" +
                        "\n" +
                        "6. Setelah itu bagi-bagi adonan menjadi 10 bagian masing-masing beratnya sekitar 29g\n" +
                        "\n" +
                        "7. Rounding adonan\n" +
                        "\n" +
                        "8. Lalu pipihkan adonan dengan rolling pin kemudian lipat dua sehingga membentuk setengah lingkaran\n" +
                        "\n" +
                        "9. Beri olesan BOS\n" +
                        "\n" +
                        "10. Kemudian susun di loyang. Aku pakai loyang ukuran 16x12x5cm\n" +
                        "\n" +
                        "11. Adonannya aku proofing selama 50menit, 10menit terakhir panaskan oven ya\n" +
                        "\n" +
                        "12. Adonan yg telah di-proofing\n" +
                        "\n" +
                        "13. Kemudian dipanggang dengan suhu 180°C selama 10menit pakai api atas bawah\n" +
                        "\n" +
                        "14. Beginilah roti sisir yang telah matang, setelah roti sisir matang olesi permukaan atasnya dengan margarin, lalu dinginkan di cooling rak\n" +
                        "\n" +
                        "15. Setelah roti gak panas lagi, kemudian roti bisa di belah saja dengan tangan gak mesti dipotong pakai pisau dan siap disantap \uD83D\uDC4D",
                image = R.drawable.roti
            ),
            Dish(
                id = 19,
                dish_name = "Sate",
                ingredients = "1/2 kg ayam fillet\n" +
                        "Secukupnya tusuk sate\n" +
                        "\n" +
                        "Bahan Bumbu Marinasi\n" +
                        "1/2 sdt garam\n" +
                        "1/2 sdt merica bubuk\n" +
                        "1/2 sdt kaldu bubuk rasa ayam\n" +
                        "1/2 sdt ketumbar bubuk\n" +
                        "1/4 sdt kunyit bubuk\n" +
                        "1/2 sdt bawang putih bubuk\n" +
                        "2 sdm kecap manis\n" +
                        "\n" +
                        "Bahan Saus Kacang: \n" +
                        "4 sdm selai kacang\n" +
                        "200 ml air panas\n" +
                        "2 sdm kecap manis\n" +
                        "4 sdm orange juice\n" +
                        "Secukupnya bawang goreng",
                description = "1. Siapkan ayam fillet, ayam bisa dada atau paha, kemudian potong kotak atau potong sesuai selera. Sisihkan dalam wadah.\n" +
                        "\n" +
                        "2. Kemudian campur semua bahan bumbu marinasi lecuali kecap manis, lalu masukan bahan bumbu marinasi kedalam potongan ayam, kemudian tambahkan kecap manis aduk hingga tercampur rata, lalu diamkan selama 15-20 menit agar bumbu meresap.\n" +
                        "\n" +
                        "3. Kemudian Siapkan selai kacang, ambil 4 sdm atau sesuai selera, taruh dalam wadah, kemudian tambahkan air panas aduk hingga tercampur rata dan mengental. Untuk tingkat kekentalan saus kacang sesuai selera, air panas bisa di tambah jika tidak suka kental.\n" +
                        "\n" +
                        "4. Kemudian tambahkan orange juice, kecap manis lalu aduk hingga tercampur rata, kemudian tambahkan bawang goreng sesuai selera lalu sisihkan. Kemudian Siapkan tusukan sate lalu rendam dengan air panas.\n" +
                        "\n" +
                        "5. Kemudian tusuk in ayam yang sudah di marinasi, isi per tusuk nya sesuai selera, lakukan sampai semua ayam tertusuk. Kemudian panaskan teplon beri secukupnya minyak, setelah panas masukan sate ayam dan masak sampai berubah warna dan matang.\n" +
                        "\n" +
                        "6. Setelah matang angkat dan taruh dalam wadah, siram dengan saus kacang, tambahkan sedikit kecap atau bawang goreng Kemudian sajikan.",
                image = R.drawable.sate
            ),
            Dish(
                id = 20,
                dish_name = "Sosis",
                ingredients = "3 buah sosis Besarnya sedang(merk bebas)\n" +
                        "1 btg daun bawang\n" +
                        "1 buah baput\n" +
                        "1/2 sdt saos tiram\n" +
                        "1 sdt saos tomat\n" +
                        "1 sdm kecap manis\n" +
                        "1/2 sdt kecap Inggris\n" +
                        "1/8 sdt garam\n" +
                        "1/4 sdt gula pasir\n" +
                        "100 ml air",
                description = "1. Siapkan bahan. Belah menjadi 2 sosis, kerat-kerat di salah satu bagian. Iris halus baput\n" +
                        "\n" +
                        "2. Tumis baput sampai harum. Tambahkan air, garam,gula pasir, saos tomat,kecap Inggris, kecap manis dan saos tiram. Biarkan mendidih\n" +
                        "\n" +
                        "3. Masukkan sosisnya, masak dg api kecil sekitar 7 menit hingga kuah menyusut. Cek rasa. Tambahkan irisan daun bawang. Matikan kompor. Pindahkan ke piring,sajikan. Terimakasih \uD83D\uDE4F",
                image = R.drawable.sosis
            ),
            Dish(
                id = 21,
                dish_name = "Soto",
                ingredients = "1/2 ekor ayam, resep aslinya dada utuh dan paha atas\n" +
                        "200 ml santan instan+800 ml air\n" +
                        "300 ml susu cair\n" +
                        "1 batang serai (geprek)\n" +
                        "1 ruas lengkuas (geprek)\n" +
                        "4 lembar daun salam\n" +
                        "4 lembar daun jeruk) sobek -sobek)\n" +
                        "3 buah bunga lawang\n" +
                        "5 butir cengkeh\n" +
                        "secukupnya Garam, gula pasir dan kaldu ayam\n" +
                        "\n" +
                        "☀\uFE0FBumbu halus\n" +
                        "5 siung bawang merah\n" +
                        "3 siung bawang putih\n" +
                        "3 butir kemiri (sangrai)\n" +
                        "1 ruas jahe\n" +
                        "1 ruas kunyit\n" +
                        "1 sdt merica bubuk\n" +
                        "1/4 sdt pala bubuk, tambahan saya\n" +
                        "\n" +
                        "☀\uFE0F Bahan Pelengkap\n" +
                        "2 buah kentang (potong dadu, goreng)\n" +
                        "2 buah tomat (potong dadu)\n" +
                        "2 batang daun bawang (iris)\n" +
                        "2 butir telur (rebus) tambahan saya\n" +
                        "Daun seledri (iris)tambahan saya\n" +
                        "Irisan jeruk nipis, sesuai selera\n" +
                        "secukupnya Bawang goreng\n" +
                        "sesuai selera Sambal,",
                description = "1. Siapkan bumbu, blender hingga halus bersama minyak goreng\n" +
                        "\n" +
                        "2. Tumis bumbu halus, bersama daun salam, daun jeruk, serai, lengkuas, bunga lawang dan cengkeh, masak bumbu hingga matang dan harum\n" +
                        "\n" +
                        "3. Masukkan santan terlebih dahulu, kemudian ayam masak hingga santan mendidih, hingga ayam bumbu pas Note:saya pindah ke panci, agar mudah mengaduknya dan enak di hangatkan kembali\n" +
                        "\n" +
                        "4. Bumbui dengan garam, gula pasir dan kaldu ayam,lalu tuang susu cair masak sampai ayam meresap bumbu dan rasanya pas, angkat Ayam lalu goreng setelah dingin baru Suir-suir Inilah bahan pelengkap bersama sambal sesuai selera\n" +
                        "\n" +
                        "5. Siapkan nasi hangat,beri semua bahan pelengkap,lalu tuang kuah sotonya dan bawang goreng,baru siap di nikmati",
                image = R.drawable.soto
            ),
            Dish(
                id = 22,
                dish_name = "Steak",
                ingredients = "secukupnya daging\n" +
                        "secukupnya wortel, buncis, brokoli (sayuran bebas)\n" +
                        "\n" +
                        "Bumbu Daging\n" +
                        "secukupnya garam, lada bubuk, tepung teigu, tepung maizena\n" +
                        "4 butir bawang putih geprek\n" +
                        "secukupnya mentega\n" +
                        "\n" +
                        "Brown Sauce\n" +
                        "secukupnya bawang putih\n" +
                        "secukupnya air\n" +
                        "secukupnya saus barbeque lamonte\n" +
                        "secukupnya saus tomat\n" +
                        "secukupnya saus sambal (skip kalo gamau pedas)",
                description = "1. Potong sayur lalu rebus\n" +
                        "\n" +
                        "2. Potong daging sesuai selera, gunakan pisau potong menyilang 2 arah\n" +
                        "\n" +
                        "3. Balurkan secukupnyabgaram, lada bubuk, tepung terigu tepung maizena ke 2 sisi\n" +
                        "\n" +
                        "4. Panaskan teflon, lalu masukkan daging. masak hingga medium\n" +
                        "\n" +
                        "5. Tambahkan margarin dan bawang putih geprek\n" +
                        "\n" +
                        "6. Jika sekiranya sudah matang, tiriskan dan potong daging agar lebih mudah untuk makan.\n" +
                        "\n" +
                        "7. Menggunakan teflon sisa panggan tadi, masukkan bawang putih cincang, beri air, dan masukkan saus barbeque, saus tomat, saus sambal. koreksi rasa. jika sudah pas tinggu air surut dan mengental.",
                image = R.drawable.steak
            ),
            Dish(
                id = 23,
                dish_name = "Tahu",
                ingredients = "300 gr tahu putih, potong segitiga lalu goreng hingga berkulit, sisihkan\n" +
                        "\n" +
                        "Bumbu Halus :\n" +
                        "5 buah cabe merah keriting\n" +
                        "15 buah cabe rawit merah\n" +
                        "3 buah bawang merah\n" +
                        "3 siung bawang putih\n" +
                        "\n" +
                        "Bumbu Lainnya :\n" +
                        "3 lembar daun jeruk\n" +
                        "1 batang daun bawang, iris\n" +
                        "1/2 buah bawang bombay, iris kasar\n" +
                        "2 buah cabe merah keriting, iris serong\n" +
                        "\n" +
                        "Bumbu Say :\n" +
                        "1 sdm saus sambal\n" +
                        "1/2 sdm saus tomat\n" +
                        "1 sdm saus tiram\n" +
                        "2 sdt kecap manis\n" +
                        "1/2 sdm kecap ikan/kecap asin\n" +
                        "1 sdm margarin\n" +
                        "secukupnya Garam\n" +
                        "250 ml air",
                description = "1. Tumis bumbu halus bersama daun jeruk, bombay, cabe iris hingga wangi dan matang\n" +
                        "\n" +
                        "2. Tambahkan air dan juga bahan saus. Masak hingga mendidih.\n" +
                        "\n" +
                        "3. Masukkan tahu, masak hingga bumbu meresap dan tes rasa. Terakhir masukkan daun bawang. Aduk rata dan matikan api",
                image = R.drawable.tahu
            ),
            Dish(
                id = 24,
                dish_name = "Telur",
                ingredients = "6 butir telur\n" +
                        "Secukup y kaldu jamur\n" +
                        "Secukup y kaldu bubuk\n" +
                        "Secukup y gula pasir\n" +
                        "\n" +
                        "Bumbu halus\n" +
                        "4 siung bawang putih\n" +
                        "5 siung bawang merah\n" +
                        "1 buah kemiri\n" +
                        "2 lembar daun jeruk\n" +
                        "1 shacet bumbu balado (desaku)",
                description = "1. Pertama rebus dulu telur laku kupas kulit y lanjut goreng telur setenga matang, coper bumbu halus bawang putih bawang merah tomat lalu siapkn mangkok kecil tuang 1 shacet bumbu balado beri air secukup y aduk” sisikan\n" +
                        "\n" +
                        "2. Panaskn minyak goreng bumbu halus onseng” sampai susut lalu tmbhkn 1 shacet bumbu balado tambahkan telur saya tmbhkn tahu bisa di skip aduk” damai merata icip rasa tmbhkn kaldu bubuk secukup y kaldu jmur secukup y gula pasir secukup y\n" +
                        "Bila sudah pas angkat dan sajikan\n" +
                        "Selamat mencoba \uD83E\uDD0F\uD83E\uDEF6",
                image = R.drawable.telur
            ),
            Dish(
                id = 25,
                dish_name = "Tempe",
                ingredients = "1/4 cecek (beli dimlijo)\n" +
                        "1 buah tempe (2 ribuan)\n" +
                        "4 siung Bawang merah\n" +
                        "2 siung bawang putih\n" +
                        "1 buah cabe merah besar\n" +
                        "1 helai Daun bawang\n" +
                        "1 sdt garam\n" +
                        "1 sdt gula\n" +
                        "1 sdm saos tiram\n" +
                        "3 sdm kecap\n" +
                        "1 sdt kaldu bubuk\n" +
                        "secukupnya Micin",
                description = "1. Rebus cecek terlebih dahulu dan siapkan bahan-bahannya\n" +
                        "\n" +
                        "2. Goreng tempe setengah matang\n" +
                        "\n" +
                        "3. Tumis bawang merah bawang putih dan cabe kemudian masukkan semua bahan-bahan tadi dioseng-oseng hingga matang dan koreksi rasa",
                image = R.drawable.tempe
            ),
            Dish(
                id = 26,
                dish_name = "Terong Balado",
                ingredients = "2 Buah Terong (potong sesuai selera)\n" +
                        "1 Papan Tempe (potong kotak2 kecil)\n" +
                        "1 Batang Daun Pre (dirajang pisahkan batang & Daunnya)\n" +
                        "3 Siung Bawang Merah (di rajang)\n" +
                        "2 Lembar Daun Jeruk\n" +
                        "1 sdt Terasi matang\n" +
                        "Secukupnya Gula, Garam, Kaldu Jamur & Kecap Manis\n" +
                        "\n" +
                        "Bumbu Halus :\n" +
                        "1 Siung Bawang Putih Besar\n" +
                        "5 Siung Bawang Merah\n" +
                        "10 Buah Cabe Kriting Merah\n" +
                        "1 Buah Tomat Kecil",
                description = "1. Goreng tempe setengah matang. Tiriskan.\n" +
                        "\n" +
                        "2. Siapkan minyak panas, kemudian masukkan bamer rajang & batang daun pre. Tumis hingga harum.\n" +
                        "\n" +
                        "3. Selanjutnya masukkan bumbu halus & daun jeruk serta terasi tumis hingga matang. tanda jika sudah matang bumbu halus akan menyusut dan baunya menyengat hingga ingin bersin..\n" +
                        "\n" +
                        "4. Setelah bumbu halus matang, masukkan terong & tempe yg sudah di goreng tumis hingga meresap. Saya lebih suka klo terongnya masih agak keras.\n" +
                        "\n" +
                        "5. Yg terakhir seasoning, masukkan gula, garam, kaldu jamur & kecap manis secukupnya. Aduk hingga rata, cek rasa. Jgn lupa Masukkan Daun Pre.nya yg sudah di rajang ya.. \uD83D\uDE01\n" +
                        "\n" +
                        "6. Terong Balado Siap Di Sajikan \uD83E\uDD70",
                image = R.drawable.terongbalado
            ),
            Dish(
                id = 27,
                dish_name = "Tumis Kangkung",
                ingredients = "2 ikat kangkung\n" +
                        "4 siung bawang putih\n" +
                        "1 siung bawang merah\n" +
                        "1 buah tomat\n" +
                        "Bumbu penyedap\n" +
                        "2 sdm saos tiram\n" +
                        "Minyak\n" +
                        "Air\n" +
                        "Cabe merah besar",
                description = "1. Petik kangkung lalu cuci hingga bersih\n" +
                        "\n" +
                        "Potong Bawang merah, Bawang putih, Tomat dan Cabe merah"+
                        "\n" +
                        "3. Panaskan minyak lalu masukan bawang merah bawang putih,cabe merah,Tumis hingga wangi lalu masukan kangkung aduk hingga sedikit layu\n" +
                        "\n" +
                        "4. Lalu masukan bumbu penyedap (garam,micin,kaldu ayam,gula pasir)dan saos tiram lalu tambahkan air sedikit aduk hingga merata supaya bumbu tercampur,terakhir masukan tomat dirasa bumbu sudah pas angkat lalu sajikan\n" +
                        "\n" +
                        "5. Tumis kangkung simpel pun jadi untuk di hidangkan",
                image = R.drawable.tumiskangkung
            ),
            Dish(
                id = 28,
                dish_name = "Udang",
                ingredients = "250 gr udang, buang kepalanya (boleh dikupas, aku enggak)\n" +
                        "1 bawang bombay\n" +
                        "3 siung bawang putih, haluskan\n" +
                        "4 siung bawang merah, haluskan\n" +
                        "6 cabe rawit\n" +
                        "1 batang daun bawang\n" +
                        "1 ruas jahe, geprek\n" +
                        "1 buah tomat\n" +
                        "3 sdm kecap manis\n" +
                        "1 sdm kecap asin\n" +
                        "1 sdm saus tomat\n" +
                        "1 sdm kecap inggris\n" +
                        "1 sdm saus tiram\n" +
                        "1 sdt minyak wijen\n" +
                        "4 sdm Margarin",
                description = "1. Cuci udang buang kepalanya (boleh dikupas, aku enggak).\n" +
                        "\n" +
                        "2. Ulek halus bawang putih dan bawang merah.\n" +
                        "\n" +
                        "3. Iris² bawang bombay, cabe rawit dan daun bawang.\n" +
                        "\n" +
                        "4. Untuk tomat buang bijinya agar tidak berair, lalu potong kotak².\n" +
                        "\n" +
                        "5. Lelehkan margarin di pan, masak udang setengah matang dengan api besar, lalu angkat dan sisihkan.\n" +
                        "\n" +
                        "6. Tunggu hingga kandungan air udang di margarin habis, lalu masukkan bumbu halus, bawang bombay, cabe rawit, jahe, tomat dan bagian putih daun bawang, tumis hingga wangi.\n" +
                        "\n" +
                        "7. Setelah wangi, masukkan kecap manis, kecap asin, saus tiram, kecap inggris\n" +
                        "\n" +
                        "8. Koreksi rasa dulu jika kurang asin atau kurang apa, baru masukkan udangnya terakhir masukkan daun bawang bagian hijau.\n" +
                        "\n" +
                        "9. Udang saus mentega siap disajikan, happy cooking☺\n" +
                        "\n" +
                        "Untuk masakan ini harus langsung habis ya, kalo enggak tekstur saus dari margarinnya bakalan ngegumpal!",
                image = R.drawable.udang
            ),
        )
    }

    fun getDishById(dishId: Int): Dish? {
        val allDishes = getAllData()
        return allDishes.find { it.id == dishId }
    }
}
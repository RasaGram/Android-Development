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
                dish_name = "Cumi Saus Padang",
                ingredients = "300 gram cumi ring frozen\n" +
                        "1 sdm baking soda\n" +
                        "1/2 sdt garam\n" +
                        "1 batang serai, geprek\n" +
                        "3 daun jeruk\n" +
                        "1 ruas jahe\n" +
                        "2 sdm saus tomat\n" +
                        "2 sdm saus Sambal\n" +
                        "2 sdm saus tiram\n" +
                        "100 ml air\n" +
                        "1 cabai merah, iris\n" +
                        "1 batang daun bawang, iris\n" +
                        "1 buah bawang bombai, iris\n" +
                        "1 sdt garam\n" +
                        "1 sdt gula\n" +
                        "1/2 sdt merica",
                description = "1. Pisahkan kepala dan badan cumi, buang kotoran dan tulangnya. Cuci bersih, lalu potong 1-2 cm tergantung ukuran cumi.\n" +
                        "\n" +
                        "2. Rendam cumi dengan baking soda, garam, dan air selama 15-20 menit.\n" +
                        "\n" +
                        "3. Buang air rendaman dan cuci bersih cumi kemudian saring.\n" +
                        "\n" +
                        "4. Siapkan bumbu halus, blender/ulek cabai keriting, bawang merah, bawang putih, dan minyak hingga halus.\n" +
                        "\n" +
                        "5. Tumis bumbu halus masukkan bawang bombai, cabai merah, serai geprek (ikat), daun jeruk, dan jahe geprek.\n" +
                        "\n" +
                        "6. Tambahkan air, saus tomat, saus tiram, air asam jawa, dan saus sambal. Aduk rata. Masukkan cumi ke saus, lalu bumbui dengan garam, gula, dan merica. Tambahkan daun bawang, masak sebentar.\n" +
                        "\n" +
                        "7. Cumi Saus Padang siap disajikan!",
                image = R.drawable.cumisauspadang
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
                dish_name = "Sayur Sop",
                ingredients = "10 butir Telur Puyuh Rebus\n" +
                        "3 buah Tahu Putih, potong dadu\n" +
                        "2 buah Wortel, iris\n" +
                        "1 buah Kentang, potong²\n" +
                        "1/4 buah Kubis, potong²\n" +
                        "1 batang Daun Bawang, iris serong\n" +
                        "1 batang Seledri, iris\n" +
                        "3 siung Bawang Putih, iris\n" +
                        "1/2 buah Bawang Bombay, iris\n" +
                        "1,2 liter Air\n" +
                        "3 sdm Minyak Goreng\n" +
                        "\n" +
                        "Seasoning:\n" +
                        "1 1/4 sdt Garam\n" +
                        "1/2 sdt Kaldu Jamur\n" +
                        "1/2 sdt Lada",
                description = "1. Panaskan 1 sdm minyak goreng untuk menumis bawang putih dan bawang bombay hingga harum. Panaskan 2 sdm minyak goreng untuk menggoreng tahu hingga kecoklatan, angkat.\n" +
                        "\n" +
                        "2. Didihkan air lalu masukkan tumisan bawang, wortel, dan kentang. Setelah mendidih kembali, masukkan tahu dan semua seasoning, aduk rata.\n" +
                        "\n" +
                        "3. Terakhir, masukkan kubis dan seledri. Aduk rata, tes rasa lalu angkat.\n" +
                        "\n" +
                        "4. Sop Bening Tahu Sayuran siap disajikan ♥\uFE0F♥\uFE0F.",
                image = R.drawable.sayursop
            ),
            Dish(
                id = 19,
                dish_name = "Sate Ayam",
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
        )
    }

    fun getDishById(dishId: Int): Dish? {
        val allDishes = getAllData()
        return allDishes.find { it.id == dishId }
    }
}
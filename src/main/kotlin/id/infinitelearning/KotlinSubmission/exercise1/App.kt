package id.infinitelearning.KotlinSubmission.exercise1

/**
Latihan 1
Lengkapi fungsi myProfile di bawah ini dengan membuat variabel dengan ketentuan dibawah ini:
- Variable bertipe data string yang menyimpan nilai nama depan Anda.
- Variable bertipe data string yang menyimpan nilai nama belakang Anda.
- Variable bertipe data number yang menyimpan nilai umur Anda.
- Variable bertipe data boolean yang menyimpan nilai status Anda (single atau tidak)
Dan cetak setiap variabel ke layar saat variable myProfile di panggil
 */
fun myProfile(namaDepan: String, namaBelakang: String, umur: Int, status: Boolean): String {
    return "Nama Depan : $namaDepan, Nama Belakang : $namaBelakang, Umur : $umur, Status single? : $status"
}


/**
 *  Latihan 2
 *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */
fun groupDetail(groupId: String, groupMember: List<Any>, session: String): Any {
    return listOf(groupId, groupMember, session)
}

/**
 * Latihan 3
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myName ini
 *
 */
fun myName(): String {
    var daftarAnggota = arrayOf("Anggi", "Aqil", "Clinton", "Wisnu", "Alifian", "Bryan")
    val anda = daftarAnggota[0]
    return anda
}

/**
 * Latihan 4
 * Ubah nilai kembalian untuk fungsi totalMember ini dengan rumus:
 *
 *      total mentor + jumlah anggota group
 *
 */
fun totalMember(): Int {
    val mentor = arrayOf("Kak Dian", "Kak Sani", "Kak Ardy", "Kak Reza")
    val totalMember = 5
    var hasil = mentor.size + totalMember
    return hasil
}
fun main() {
    val showMyProfile = myProfile("Anggi", "Aprilia", 20, true)
    println("$showMyProfile")

    val myName = myName()
    println("Hai, nama saya $myName")

    val totalAnggota = totalMember()
    println("Total Member group + Mentor adalah $totalAnggota")

    /**
     *  Latihan 5
     *  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
     *
     */
    val showGroupDetail = groupDetail("Coge", listOf("Anggi", "Aqil", "Clinton", "Wisnu", "Alifian", "Bryan"), "Morning")
    println(showGroupDetail)
}

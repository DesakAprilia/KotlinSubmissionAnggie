package id.infinitelearning.KotlinSubmission.exercise4

import java.lang.Exception

fun main() {

    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    try {
        println("PENGUMUMAN")
        println(50/2)
        println(50/0)
    } catch (e: Exception) {

        println("Error : $e")
    }
}
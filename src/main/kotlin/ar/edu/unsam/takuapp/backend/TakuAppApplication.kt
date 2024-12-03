package ar.edu.unsam.takuapp.backend

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TakuAppApplication

fun main(args: Array<String>) {
	runApplication<TakuAppApplication>(*args)
}

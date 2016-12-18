package com.glavo.oj

import java.io.{BufferedWriter, FileWriter, PrintWriter}
import java.nio.file._

import com.glavo.html.HtmlHelper

import scala.io.Source

/**
  * Created by glavo on 16-12-17.
  */
class OJ(
        val name: String,
        val urlStrat: String,
        val urlEnd: String,
        val description: String,
        val inputDescription: String,
        val outputDescription: String,
        val sampleInput: String,
        val sampleOutput: String,
        val dataHint: String,
        val startIndex: Int = 1000,
        val maxFailed: Int = OJ.MaxFailed
        ) {

    class Page(val url: String) {
        lazy val htmlString: String = Source.fromURL(url).mkString
        lazy val parser: (String, String, String, String, String, String) = {
            var description: String = _
            var inputDescription: String = _
            var outputDescription: String = _
            var sampleInput: String = _
            var sampleOutput: String = _
            var dataHint: String = _



            htmlString.lines.foreach{s =>

            }
        }
    }
}

object OJ {
    def check(path: Path): Path = {
        if(Files.exists(path)){
            if(!Files.isDirectory(path)){
                Files.deleteIfExists(path)
                Files.createDirectories(path)
            }
        } else Files.createDirectories(path)
        path
    }
    val MaxFailed: Int = 5


}


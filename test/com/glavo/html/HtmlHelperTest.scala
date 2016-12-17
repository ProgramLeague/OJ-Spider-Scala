package com.glavo.html

import scala.io.Source
/**
  * Created by glavo on 16-12-17.
  */
object HtmlHelperTest extends App{
    try println({
        val s = HtmlHelper.parserHtml("http://codevs.cn/problem/4097/")
        if(s.length < 100) null
        else s
    })
    catch {
        case _: Exception => println("error")
    }
}

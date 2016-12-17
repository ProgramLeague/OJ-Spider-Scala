package com.glavo.html

import java.util.List

import org.htmlparser.Parser
import org.htmlparser.beans.StringBean
import org.htmlparser.visitors.TextExtractingVisitor

/**
  * Created by glavo on 16-12-17.
  */
object HtmlHelper {
    def parserHtml(url: String): String = {
        val sb = new StringBean()

        sb.setLinks(false)
        sb.setReplaceNonBreakingSpaces(true)
        sb.setCollapse(true)
        sb.setURL(url)

        sb.getStrings
    }
}

package com.glavo.gui


import javax.swing._
import java.awt._
import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper

/**
  * Created by glavo on 16-12-17.
  */
class SpiderGUI(x: Int = 700, y: Int = 500) extends JFrame("OJ Spider"){

    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)
    setSize(x, y)
    setLayout(new GridLayout(1, 2))

    val text1 = new JTextArea
    val text2 = new JTextArea

    text1.setEditable(false)
    text2.setEditable(false)

    val scrooll1 = new JScrollPane(text1)
    val scrooll2 = new JScrollPane(text2)


    add(scrooll1)
    add(scrooll2)

    text1.setLineWrap(true)
    text2.setLineWrap(true)

    text1.setWrapStyleWord(true)
    text2.setWrapStyleWord(true)

    def print1(str: String): Unit = text1.append(str)
    def print2(str: String): Unit = text2.append(str)
    def print(i: Int, str: String): Unit = i match {
        case SpiderGUI.TextArea1 => print1(str)
        case SpiderGUI.TextArea2 => print2(str)
    }

    def println1(str: String): Unit = text1.append(str + '\n')
    def println2(str: String): Unit = text2.append(str + '\n')
    def println(i: Int, str: String): Unit = i match {
        case SpiderGUI.TextArea1 => println1(str)
        case SpiderGUI.TextArea2 => println2(str)
    }
}

object SpiderGUI{
    val TextArea1: Int = 1
    val TextArea2: Int = 2
}



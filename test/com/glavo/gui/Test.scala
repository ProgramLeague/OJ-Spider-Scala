package com.glavo.gui

import java.awt.EventQueue
import javax.swing.UIManager

import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper

/**
  * Created by glavo on 16-12-17.
  */
object Test extends App{


    BeautyEyeLNFHelper.launchBeautyEyeLNF()
    BeautyEyeLNFHelper.frameBorderStyle = BeautyEyeLNFHelper.FrameBorderStyle.translucencyAppleLike
    UIManager.put("RootPane.setupButtonVisible", false)

    EventQueue.invokeLater{ () => {
        val a = new SpiderGUI
        a.setVisible(true)

        0 to 100 foreach {i => if(i % 2 == 0)a.println2(i.toString) else a.println1(i.toString)}
    }}
}

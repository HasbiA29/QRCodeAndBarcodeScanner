package com.ridwanharts.barcodescannerpns

import android.view.View

interface RecylerViewClickListener {

    fun onRecylerViewItemClick(view: View, result: ResultScan, position: Int)

}
package com.farhanfarkaann.belajarmvp

import com.farhanfarkaann.belajarmvp.model.ModelMVP

interface FirstView {


    fun berhasil(hasil : ModelMVP)
    fun error()
}
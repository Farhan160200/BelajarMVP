package com.farhanfarkaann.belajarmvp


import com.farhanfarkaann.belajarmvp.model.ModelMVP


class FirstPresenterImp (model : FirstView) : FirstPresenter {


    var viewmodel : FirstView? = null

    init {

        viewmodel = model
    }

    override fun tambahData(msg: String) {
        //TODO 1 check inputan
        if(msg.isNotEmpty()){

            //TODO 2
            var model = ModelMVP(msg)


            //TODO 3 add ke view
            viewmodel?.berhasil(model)

        }else{
            //TODO 4 kalau seandainya kosong
            viewmodel?.error()
        }



    }
}




package getar.uts18090023.NmusikStore.activity.data_barang._add

import getar.uts18090023.NmusikStore.model.Barang
import getar.uts18090023.NmusikStore.network.NetworkConfig
import getar.uts18090023.NmusikStore.response.ResultSimple
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class AddBarangPresenter(val addBarangView: AddBarangView) {
    fun addBarang(dataBarang: Barang) {
        NetworkConfig.service()
            .addBarang(Integer.parseInt(dataBarang.idUser), dataBarang.barcode, dataBarang.namaBarang, dataBarang.kategori, dataBarang.hargaBeli, dataBarang.hargaJual)
            .enqueue(object : Callback<ResultSimple> {
                override fun onFailure(call: Call<ResultSimple>, t: Throwable) {
                    addBarangView.onErrorAddBarang(t.localizedMessage)
                }

                override fun onResponse(
                    call: Call<ResultSimple>,
                    response: Response<ResultSimple>
                ) {
                    val body = response.body()
                    if (body?.status == 200) {
                        addBarangView.onSuccessAddBarang(body?.message)
                    } else {
                        addBarangView.onErrorAddBarang(body?.message)
                    }
                }

            })

    }

    fun updateBarang(dataBarang: Barang) {
        NetworkConfig.service()
            .updateBarang(Integer.parseInt(dataBarang.idUser), Integer.parseInt(dataBarang.idBarang),
                dataBarang.barcode, dataBarang.namaBarang, dataBarang.kategori, dataBarang.hargaBeli, dataBarang.hargaJual)
            .enqueue(object : Callback<ResultSimple> {
                override fun onFailure(call: Call<ResultSimple>, t: Throwable) {
                    addBarangView.onErrorAddBarang(t.localizedMessage)
                }

                override fun onResponse(
                    call: Call<ResultSimple>,
                    response: Response<ResultSimple>
                ) {
                    val body = response.body()
                    if (body?.status == 200) {
                        addBarangView.onSuccessAddBarang(body?.message)
                    } else {
                        addBarangView.onErrorAddBarang(body?.message)
                    }
                }

            })

    }
}
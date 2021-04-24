package getar.uts18090023.NmusikStore.activity.penjualan.data

import javax.annotation.Generated
import com.google.gson.annotations.SerializedName
import getar.uts18090023.NmusikStore.model.Keranjang

@Generated("com.robohorse.robopojogenerator")
data class ResultKeranjang(

    @field:SerializedName("keranjang")
	val keranjang: List<Keranjang?>? = null,

    @field:SerializedName("message")
	val message: String? = null,

    @field:SerializedName("status")
	val status: Int? = null
)
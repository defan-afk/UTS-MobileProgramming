package getar.uts18090023.NmusikStore.activity.data_barang.data

import javax.annotation.Generated
import com.google.gson.annotations.SerializedName
import getar.uts18090023.NmusikStore.model.Barang

@Generated("com.robohorse.robopojogenerator")
data class ResultDataBarang(

    @field:SerializedName("barang")
	val barang: List<Barang?>? = null,

    @field:SerializedName("message")
	val message: String? = null,

    @field:SerializedName("status")
	val status: Int? = null
)
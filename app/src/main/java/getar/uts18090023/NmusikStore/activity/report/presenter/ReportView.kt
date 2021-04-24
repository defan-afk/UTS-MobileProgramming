package getar.uts18090023.NmusikStore.activity.report.presenter

import getar.uts18090023.NmusikStore.model.Keranjang

interface ReportView {
    fun onSuccessReport(keranjang: List<Keranjang?>?)
    fun onFailedReport(localizedMessage: String?)

    fun onSuccessRestore(msg: String?)
    fun onFailedRestore(msg: String?)
}
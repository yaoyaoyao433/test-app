package com.sankuai.waimai.bussiness.order.crossconfirm.model.preview.param;

import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.sankuai.waimai.bussiness.order.crossconfirm.model.preview.result.PoiOrderPreviewInvoiceResult;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class PoiOrderInvoiceParam implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("invoice_title")
    public String invoiceTitle;
    @SerializedName("invoice_type")
    public int invoiceType;
    @SerializedName("mt_invoice")
    public int mtInvoice;
    @SerializedName("taxpayer_id_number")
    public String taxpayerIdNumber;

    public PoiOrderInvoiceParam() {
    }

    public PoiOrderInvoiceParam(@NonNull PoiOrderPreviewInvoiceResult poiOrderPreviewInvoiceResult) {
        this.invoiceTitle = poiOrderPreviewInvoiceResult.invoiceTitle;
        this.invoiceType = poiOrderPreviewInvoiceResult.invoiceType;
        this.mtInvoice = 0;
        this.taxpayerIdNumber = poiOrderPreviewInvoiceResult.taxpayerIdNumber;
    }
}

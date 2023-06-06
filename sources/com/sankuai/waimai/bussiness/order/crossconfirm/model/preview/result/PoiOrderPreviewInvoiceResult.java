package com.sankuai.waimai.bussiness.order.crossconfirm.model.preview.result;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class PoiOrderPreviewInvoiceResult implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("has_invoice")
    public int hasInvoice;
    @SerializedName("invoice_link")
    public String invoiceLink;
    @SerializedName("invoice_make_type")
    public int invoiceMakeType;
    @SerializedName("invoice_show")
    public boolean invoiceShow;
    @SerializedName("invoice_support")
    public int invoiceSupport;
    @SerializedName("invoice_text")
    public String invoiceText;
    @SerializedName("invoice_title")
    public String invoiceTitle;
    @SerializedName("invoice_type")
    public int invoiceType;
    @SerializedName("min_invoice_price")
    public double minInvoicePrice;
    @SerializedName("taxpayer_id_number")
    public String taxpayerIdNumber;
}

package com.sankuai.waimai.business.order.api.submit.model;

import android.content.Context;
import android.support.annotation.Keep;
import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class Invoice implements Serializable {
    public static final int INVOICE_ADD = 1;
    public static final long INVOICE_DEF_ID = -1;
    public static final String INVOICE_DEF_PTID = "";
    public static final int INVOICE_DELETE = 2;
    public static final int INVOICE_EDIT = 3;
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("id")
    private long mId;
    @SerializedName("invoice_type")
    private int mInvoiceType;
    @SerializedName("pt_id")
    private String mPtId;
    @SerializedName("taxpayer_id_number")
    private String mTaxpayerId;
    @SerializedName("title")
    private String mTitle;

    public Invoice() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5c5278dcea98f9b8e802043177d11d18", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5c5278dcea98f9b8e802043177d11d18");
            return;
        }
        this.mId = 0L;
        this.mPtId = "";
        this.mTitle = "";
        this.mTaxpayerId = "";
        this.mInvoiceType = 0;
    }

    public Invoice(String str, String str2, int i) {
        Object[] objArr = {str, str2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "683949048c3364fb3b5d1163c1b57023", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "683949048c3364fb3b5d1163c1b57023");
            return;
        }
        this.mTitle = str;
        this.mTaxpayerId = str2;
        this.mInvoiceType = i;
    }

    public Invoice(long j, String str, String str2, String str3, int i) {
        Object[] objArr = {new Long(j), str, str2, str3, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fa1ae70faabecf2089db7f582dff16d0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fa1ae70faabecf2089db7f582dff16d0");
            return;
        }
        this.mId = j;
        this.mPtId = str;
        this.mTitle = str2;
        this.mTaxpayerId = str3;
        this.mInvoiceType = i;
    }

    public String getTitle() {
        return this.mTitle == null ? "" : this.mTitle;
    }

    public long getId() {
        return this.mId;
    }

    public String getTaxpayerId() {
        return this.mTaxpayerId == null ? "" : this.mTaxpayerId;
    }

    public int getInvoiceType() {
        return this.mInvoiceType;
    }

    public String getPtId() {
        return this.mPtId;
    }

    public void setId(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8aa678ecf9b25174fa9c3e89ea7c1cee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8aa678ecf9b25174fa9c3e89ea7c1cee");
        } else {
            this.mId = j;
        }
    }

    public void setTitle(String str) {
        this.mTitle = str;
    }

    public void setPtId(String str) {
        this.mPtId = str;
    }

    public void setTaxpayerId(String str) {
        this.mTaxpayerId = str;
    }

    public void setInvoiceType(int i) {
        this.mInvoiceType = i;
    }

    public static void saveCheckedInvoice(Context context, Invoice invoice) {
        Object[] objArr = {context, invoice};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e666ea4e8ded80d24802666492c82b9b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e666ea4e8ded80d24802666492c82b9b");
        } else if (invoice == null) {
            com.sankuai.waimai.platform.capacity.persistent.sp.a.a(context, "ceres_invoice_default_invoice", -1L);
            com.sankuai.waimai.platform.capacity.persistent.sp.a.a(context, "ceres_invoice_default_pt_invoice");
            com.sankuai.waimai.platform.capacity.persistent.sp.a.a(context, "ceres_invoice_default_invoice_title");
            com.sankuai.waimai.platform.capacity.persistent.sp.a.a(context, "ceres_invoice_default_invoice_taxpayer_id");
            com.sankuai.waimai.platform.capacity.persistent.sp.a.a(context, "ceres_invoice_default_invoice_type");
        } else {
            com.sankuai.waimai.platform.capacity.persistent.sp.a.a(context, "ceres_invoice_default_invoice", invoice.getId());
            com.sankuai.waimai.platform.capacity.persistent.sp.a.a(context, "ceres_invoice_default_pt_invoice", invoice.getPtId());
            com.sankuai.waimai.platform.capacity.persistent.sp.a.a(context, "ceres_invoice_default_invoice_title", invoice.getTitle());
            com.sankuai.waimai.platform.capacity.persistent.sp.a.a(context, "ceres_invoice_default_invoice_taxpayer_id", invoice.getTaxpayerId());
            com.sankuai.waimai.platform.capacity.persistent.sp.a.a(context, "ceres_invoice_default_invoice_type", invoice.getInvoiceType());
        }
    }

    public static Invoice getCheckedInvoice(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6e2c1341a423239d8473c4c4838aaded", RobustBitConfig.DEFAULT_VALUE)) {
            return (Invoice) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6e2c1341a423239d8473c4c4838aaded");
        }
        long b = com.sankuai.waimai.platform.capacity.persistent.sp.a.b(context, "ceres_invoice_default_invoice", -1L);
        String b2 = com.sankuai.waimai.platform.capacity.persistent.sp.a.b(context, "ceres_invoice_default_pt_invoice", "");
        String b3 = com.sankuai.waimai.platform.capacity.persistent.sp.a.b(context, "ceres_invoice_default_invoice_title", "");
        String b4 = com.sankuai.waimai.platform.capacity.persistent.sp.a.b(context, "ceres_invoice_default_invoice_taxpayer_id", "");
        int b5 = com.sankuai.waimai.platform.capacity.persistent.sp.a.b(context, "ceres_invoice_default_invoice_type", 1);
        if (TextUtils.isEmpty(b3)) {
            return null;
        }
        return new Invoice(b, b2, b3, b4, b5);
    }

    public static Invoice fromJson(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5d1eb4edd34016dbbb558746513193b5", RobustBitConfig.DEFAULT_VALUE)) {
            return (Invoice) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5d1eb4edd34016dbbb558746513193b5");
        }
        if (jSONObject == null) {
            return null;
        }
        Invoice invoice = new Invoice();
        invoice.mId = jSONObject.optLong("id");
        invoice.mTitle = jSONObject.optString("title");
        invoice.mPtId = jSONObject.optString("pt_id");
        invoice.mTaxpayerId = jSONObject.optString("taxpayer_id_number");
        invoice.mInvoiceType = jSONObject.optInt("invoice_type");
        return invoice;
    }

    public static String toJson(Invoice invoice) {
        Object[] objArr = {invoice};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "fa26bce9fca897b662d0b16bb02fbf5b", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "fa26bce9fca897b662d0b16bb02fbf5b");
        }
        JSONObject jSONObject = new JSONObject();
        if (invoice != null) {
            try {
                jSONObject.put("id", invoice.getId());
                jSONObject.put("title", invoice.getTitle());
                jSONObject.put("pt_id", invoice.getPtId());
                jSONObject.put("taxpayer_id_number", invoice.getTaxpayerId());
                jSONObject.put("invoice_type", invoice.getInvoiceType());
            } catch (JSONException e) {
                com.sankuai.waimai.foundation.utils.log.a.a(e);
            }
        }
        return jSONObject.toString();
    }
}

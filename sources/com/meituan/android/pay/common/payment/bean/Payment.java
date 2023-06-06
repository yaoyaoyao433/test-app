package com.meituan.android.pay.common.payment.bean;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.meituan.android.pay.common.payment.data.a;
import com.meituan.android.pay.common.promotion.bean.CardInfo;
import com.meituan.android.pay.common.promotion.bean.CombineLabel;
import com.meituan.android.pay.common.promotion.bean.HangAd;
import com.meituan.android.pay.common.promotion.bean.Icon;
import com.meituan.android.pay.common.promotion.bean.Material;
import com.meituan.android.pay.common.promotion.bean.PaymentReduce;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.android.paybase.utils.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.repository.model.ConfigInfo;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class Payment implements a, Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 5496114523009795946L;
    @SerializedName("bank_type")
    private String bankType;
    @SerializedName("bank_type_id")
    private String bankTypeId;
    @SerializedName("card_info")
    private CardInfo cardInfo;
    @SerializedName("card_type")
    private String cardType;
    @SerializedName("exceed_desc")
    private String exceedDesc;
    @SerializedName("float_infos")
    private ArrayList<FloatingLayer> floatingLayers;
    @SerializedName(ConfigInfo.MODULE_BANNER)
    private List<HangAd> hangCardAds;
    private Icon icon;
    @SerializedName("labels")
    private List<CombineLabel> labels;
    private Material material;
    private String name;
    @SerializedName("pay_type")
    private String payType;
    @SerializedName("paytype_id")
    private String payTypeId;
    @SerializedName("pay_type_unique_key")
    private String payTypeUniqueKey;
    @SerializedName("discounts")
    private PaymentReduce paymentReduce;
    private boolean selected;
    private int status;
    @SerializedName("status_info")
    private String statusInfo;
    @SerializedName("submit_url")
    private String submitUrl;
    @SerializedName("pay_transparent_attributes")
    private String transparentAttributes;

    @Override // com.meituan.android.pay.common.payment.data.a
    public List<CombineLabel> getLabels() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3577eddab96fa42f7d8508864272c185", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3577eddab96fa42f7d8508864272c185");
        }
        i.a((List) this.labels);
        return this.labels;
    }

    public boolean hasLabels() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b1cce7be54152142a78bbe948da7b015", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b1cce7be54152142a78bbe948da7b015")).booleanValue() : !i.a((Collection) getLabels());
    }

    public void setLabels(List<CombineLabel> list) {
        this.labels = list;
    }

    @Override // com.meituan.android.pay.common.payment.data.e
    public String getPayType() {
        return this.payType;
    }

    public void setPayType(String str) {
        this.payType = str;
    }

    @Override // com.meituan.android.pay.common.payment.data.e
    public String getName() {
        return this.name;
    }

    public void setName(String str) {
        this.name = str;
    }

    @Override // com.meituan.android.pay.common.payment.data.e
    public int getStatus() {
        return this.status;
    }

    public void setStatus(int i) {
        this.status = i;
    }

    @Override // com.meituan.android.pay.common.payment.data.e
    public String getStatusInfo() {
        return this.statusInfo;
    }

    public void setStatusInfo(String str) {
        this.statusInfo = str;
    }

    @Override // com.meituan.android.pay.common.payment.data.a
    public CardInfo getCardInfo() {
        return this.cardInfo;
    }

    public void setCardInfo(CardInfo cardInfo) {
        this.cardInfo = cardInfo;
    }

    @Override // com.meituan.android.pay.common.payment.data.e
    public String getExceedDesc() {
        return this.exceedDesc;
    }

    public void setExceedDesc(String str) {
        this.exceedDesc = str;
    }

    @Override // com.meituan.android.pay.common.payment.data.a
    public String getBankType() {
        return this.bankType;
    }

    public void setBankType(String str) {
        this.bankType = str;
    }

    @Override // com.meituan.android.pay.common.payment.data.e
    public Icon getIcon() {
        return this.icon;
    }

    public void setIcon(Icon icon) {
        this.icon = icon;
    }

    @Override // com.meituan.android.pay.common.payment.data.a
    public String getCardType() {
        return this.cardType;
    }

    public void setCardType(String str) {
        this.cardType = str;
    }

    @Override // com.meituan.android.pay.common.payment.data.a
    public String getSubmitUrl() {
        return this.submitUrl;
    }

    public void setSubmitUrl(String str) {
        this.submitUrl = str;
    }

    @Override // com.meituan.android.pay.common.payment.data.e
    public PaymentReduce getPaymentReduce() {
        return this.paymentReduce;
    }

    @Override // com.meituan.android.pay.common.payment.data.a
    public String getPayTypeId() {
        return this.payTypeId;
    }

    public void setPayTypeId(String str) {
        this.payTypeId = str;
    }

    public void setPaymentReduce(PaymentReduce paymentReduce) {
        this.paymentReduce = paymentReduce;
    }

    public List<HangAd> getHangCardAds() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "51ee0f2fbd251fd6d339a4ec0aaef6f3", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "51ee0f2fbd251fd6d339a4ec0aaef6f3");
        }
        i.a((List) this.hangCardAds);
        return this.hangCardAds;
    }

    public void setHangCardAds(List<HangAd> list) {
        this.hangCardAds = list;
    }

    @Override // com.meituan.android.pay.common.payment.data.e
    public boolean isSelected() {
        return this.selected;
    }

    public void setSelected(Boolean bool) {
        Object[] objArr = {bool};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1786903cb2c124d641fba6df13e4eba3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1786903cb2c124d641fba6df13e4eba3");
        } else {
            this.selected = bool.booleanValue();
        }
    }

    @Override // com.meituan.android.pay.common.payment.data.a
    public String getBankTypeId() {
        return this.bankTypeId;
    }

    public void setBankTypeId(String str) {
        this.bankTypeId = str;
    }

    public ArrayList<FloatingLayer> getFloatingLayers() {
        return this.floatingLayers;
    }

    public void setFloatingLayers(ArrayList<FloatingLayer> arrayList) {
        this.floatingLayers = arrayList;
    }

    public Material getMaterial() {
        return this.material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    @Override // com.meituan.android.pay.common.payment.data.a
    public String getTransparentAttributes() {
        return this.transparentAttributes;
    }

    public void setTransparentAttributes(String str) {
        this.transparentAttributes = str;
    }

    @Override // com.meituan.android.pay.common.payment.data.a
    public String getPayTypeUniqueKey() {
        return this.payTypeUniqueKey;
    }

    public void setPayTypeUniqueKey(String str) {
        this.payTypeUniqueKey = str;
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "da26c377d8653e0c623108c929b28421", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "da26c377d8653e0c623108c929b28421") : new Gson().toJson(this);
    }
}

package com.meituan.android.cashier.model.bean;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class RetainWindow implements Serializable {
    private static final String RETAIN_TYPE_ALIPAY = "alipay";
    private static final String RETAIN_TYPE_BANKSELECTPAY = "bankselectpay";
    private static final String RETAIN_TYPE_BASIC = "basic";
    private static final String RETAIN_TYPE_CARDPAY = "cardpay";
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -2853684455282222857L;
    private String detail;
    @SerializedName("lbtn")
    private String leftButton;
    private String retainType;
    @SerializedName("rbtn")
    private String rightButton;
    private SubmitData submitData;
    private String title;

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public String getDetail() {
        return this.detail;
    }

    public void setDetail(String str) {
        this.detail = str;
    }

    public String getRightButton() {
        return this.rightButton;
    }

    public void setRightButton(String str) {
        this.rightButton = str;
    }

    public String getLeftButton() {
        return this.leftButton;
    }

    public void setLeftButton(String str) {
        this.leftButton = str;
    }

    public SubmitData getSubmitData() {
        return this.submitData;
    }

    public void setSubmitData(SubmitData submitData) {
        this.submitData = submitData;
    }

    public String getRetainType() {
        return this.retainType;
    }

    public void setRetainType(String str) {
        this.retainType = str;
    }

    public boolean isAlipayRetainType() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4cbbe34adf0effad08030361a3d69f81", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4cbbe34adf0effad08030361a3d69f81")).booleanValue() : TextUtils.equals(getRetainType(), RETAIN_TYPE_ALIPAY);
    }

    public boolean isBankselectpayRetainType() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5fcc84fbd08b081f38a031b383bb0866", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5fcc84fbd08b081f38a031b383bb0866")).booleanValue() : TextUtils.equals(getRetainType(), RETAIN_TYPE_BANKSELECTPAY);
    }

    public boolean isCardpayRetainType() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cbb88a06dcf6bb6522838af98ef7b744", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cbb88a06dcf6bb6522838af98ef7b744")).booleanValue() : TextUtils.equals(getRetainType(), RETAIN_TYPE_CARDPAY);
    }

    public boolean isDefaultRetainType() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f73af6f4a0136498f45abe08b9021d83", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f73af6f4a0136498f45abe08b9021d83")).booleanValue() : TextUtils.equals(getRetainType(), "basic");
    }

    public String getStaticsRetainType() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7ddf0543fe4da53f12122bf283d76340", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7ddf0543fe4da53f12122bf283d76340") : isDefaultRetainType() ? "basic" : isAlipayRetainType() ? RETAIN_TYPE_ALIPAY : isCardpayRetainType() ? RETAIN_TYPE_CARDPAY : isBankselectpayRetainType() ? RETAIN_TYPE_BANKSELECTPAY : "";
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "457b2e4886cb60afb52ccb19d55c7018", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "457b2e4886cb60afb52ccb19d55c7018") : new Gson().toJson(this);
    }
}

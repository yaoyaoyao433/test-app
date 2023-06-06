package com.meituan.android.elderly.bean;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import java.util.HashMap;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class RetainWindow implements Serializable {
    private static final String RETAIN_TYPE_BASIC = "basic";
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -2853684455282222857L;
    private String detail;
    @SerializedName("lbtn")
    private String leftButton;
    private String retainType;
    @SerializedName("rbtn")
    private String rightButton;
    private HashMap<String, String> submitData;
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

    public HashMap<String, String> getSubmitData() {
        return this.submitData;
    }

    public void setSubmitData(HashMap<String, String> hashMap) {
        this.submitData = hashMap;
    }

    public String getRetainType() {
        return this.retainType;
    }

    public void setRetainType(String str) {
        this.retainType = str;
    }

    public boolean isDefaultRetainType() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8c49862403d9070279852c784f21ff47", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8c49862403d9070279852c784f21ff47")).booleanValue() : TextUtils.equals(getRetainType(), "basic");
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f313882a12662ff8609c793eb5a93e84", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f313882a12662ff8609c793eb5a93e84") : new Gson().toJson(this);
    }
}

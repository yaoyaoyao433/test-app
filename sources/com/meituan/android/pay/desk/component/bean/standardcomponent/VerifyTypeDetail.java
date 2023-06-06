package com.meituan.android.pay.desk.component.bean.standardcomponent;

import com.google.gson.annotations.SerializedName;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class VerifyTypeDetail implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -7521297086758465598L;
    private String name;
    @SerializedName("submit_url1")
    private String submitUrl1;
    @SerializedName("submit_url2")
    private String submitUrl2;
    @SerializedName("verify_type")
    private int verifyType;
    @SerializedName("yoda_web_url1")
    private String webUrl1;

    public int getVerifyType() {
        return this.verifyType;
    }

    public void setVerifyType(int i) {
        this.verifyType = i;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String str) {
        this.name = str;
    }

    public String getSubmitUrl1() {
        return this.submitUrl1;
    }

    public void setSubmitUrl1(String str) {
        this.submitUrl1 = str;
    }

    public String getSubmitUrl2() {
        return this.submitUrl2;
    }

    public void setSubmitUrl2(String str) {
        this.submitUrl2 = str;
    }

    public String getWebUrl1() {
        return this.webUrl1;
    }

    public void setWebUrl1(String str) {
        this.webUrl1 = str;
    }
}

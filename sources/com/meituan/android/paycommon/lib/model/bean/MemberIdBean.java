package com.meituan.android.paycommon.lib.model.bean;

import com.google.gson.annotations.SerializedName;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class MemberIdBean implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 1;
    @SerializedName("memberId")
    private String memberId;

    public String getMemberId() {
        return this.memberId;
    }

    public void setMemberId(String str) {
        this.memberId = str;
    }
}

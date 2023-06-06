package com.meituan.android.cashier.model.bean;

import com.google.gson.annotations.SerializedName;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class CardInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 6124346516489133803L;
    @SerializedName("name_ext")
    private String nameExt;
    @SerializedName("token_id")
    private String tokenId;

    public String getTokenId() {
        return this.tokenId;
    }

    public void setTokenId(String str) {
        this.tokenId = str;
    }

    public String getNameExt() {
        return this.nameExt;
    }

    public void setNameExt(String str) {
        this.nameExt = str;
    }
}

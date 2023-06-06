package com.meituan.android.yoda.bean;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes3.dex */
public class AESKeys {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("dk")
    private String dk;
    @SerializedName("edk")
    private String edk;

    public AESKeys(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4a0cee1e854e49c5e164b6e629772d75", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4a0cee1e854e49c5e164b6e629772d75");
            return;
        }
        this.dk = str;
        this.edk = str2;
    }

    public String getDk() {
        return this.dk;
    }

    public void setDk(String str) {
        this.dk = str;
    }

    public String getEdk() {
        return this.edk;
    }

    public void setEdk(String str) {
        this.edk = str;
    }
}

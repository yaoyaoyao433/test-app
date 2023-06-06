package com.sankuai.waimai.contextual.computing.config;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.location.v2.d;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class a {
    public static ChangeQuickRedirect a;
    @SerializedName("addressRecommendSwitch")
    public boolean b;
    @SerializedName("matchFailed")
    public int c;
    @SerializedName("matchSuccess")
    public int d;
    @SerializedName("orderMatchFailed")
    public int e;
    @SerializedName("orderMatchSuccess")
    public int f;
    @SerializedName("validDay")
    public int g;
    @SerializedName("recordCount")
    public int h;

    public static a a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a9d1f4a13a009899b77ae0fb243c878e", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a9d1f4a13a009899b77ae0fb243c878e");
        }
        try {
            return (a) d.a().fromJson(str, (Class<Object>) a.class);
        } catch (Exception unused) {
            return null;
        }
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a094a820352502c81cf216285f1160d2", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a094a820352502c81cf216285f1160d2") : d.a().toJson(this);
    }
}

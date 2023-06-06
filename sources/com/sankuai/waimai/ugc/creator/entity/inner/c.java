package com.sankuai.waimai.ugc.creator.entity.inner;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Objects;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class c {
    public static ChangeQuickRedirect a;
    @SerializedName("filterId")
    public String b;
    @SerializedName("name")
    public String c;
    @SerializedName("url")
    public String d;
    @SerializedName("strength")
    public float e;

    public c(String str, String str2, String str3, float f) {
        Object[] objArr = {str, str2, str3, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d6e88d1079f520dc2be7345f4b2a84c7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d6e88d1079f520dc2be7345f4b2a84c7");
            return;
        }
        this.e = 1.0f;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = f;
    }

    public final boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2bb0305bdff2f076bbb5a5edc42e4c7a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2bb0305bdff2f076bbb5a5edc42e4c7a")).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            return this.b.equals(((c) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd88639aeaf2061d1d0c8e03a3cc5c23", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd88639aeaf2061d1d0c8e03a3cc5c23")).intValue() : Objects.hash(this.b);
    }
}

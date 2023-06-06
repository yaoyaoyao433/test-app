package com.sankuai.waimai.business.search.ui.guide.history;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public long b;
    public String c;
    public String d;
    public boolean e;
    public String f;

    public a(long j, String str, String str2, boolean z, String str3) {
        Object[] objArr = {new Long(j), str, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0), str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b57b2854c45a627f948d3ff324315168", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b57b2854c45a627f948d3ff324315168");
            return;
        }
        this.b = j;
        this.c = str;
        this.d = str2;
        this.e = z;
        this.f = str3;
    }

    public final boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "84485f913dd7677dd9e43842559ae42f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "84485f913dd7677dd9e43842559ae42f")).booleanValue();
        }
        if (obj instanceof a) {
            return TextUtils.equals(this.d, ((a) obj).d);
        }
        return false;
    }
}

package com.sankuai.waimai.store.search.model;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class e {
    public static ChangeQuickRedirect a;
    public long b;
    public String c;
    public String d;
    public boolean e;
    public String f;
    public long g;

    public e(long j, String str, String str2, boolean z, String str3, long j2) {
        Object[] objArr = {new Long(j), str, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0), str3, new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "872619949f1cd294b097bb0b67902404", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "872619949f1cd294b097bb0b67902404");
            return;
        }
        this.b = j;
        this.c = str;
        this.d = str2;
        this.e = z;
        this.f = str3;
        this.g = j2;
    }

    public final boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac10d22e2ed7669320571d2cd92c0dcf", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac10d22e2ed7669320571d2cd92c0dcf")).booleanValue();
        }
        if (obj instanceof e) {
            return TextUtils.equals(this.d, ((e) obj).d);
        }
        return false;
    }

    public final int hashCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d7d86380098cdf3f30a3ca93a43dfd49", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d7d86380098cdf3f30a3ca93a43dfd49")).intValue();
        }
        if (TextUtils.isEmpty(this.d)) {
            return super.hashCode();
        }
        return this.d.hashCode();
    }
}

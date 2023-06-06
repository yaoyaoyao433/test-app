package com.sankuai.meituan.mtliveqos.statistic;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtliveqos.common.c;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;
    public String b;
    public String c;
    public c.f d;
    public c.g e;
    public boolean f;
    public String g;
    public String h;
    public String i;
    public boolean j;
    public String k;
    public String l;
    public c.EnumC0620c m;
    public c.d n;
    public long o;
    public long p;
    public String q;
    public String r;
    public String s;
    public int t;

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f947f834622a5aad69fbc55b65a143f0", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f947f834622a5aad69fbc55b65a143f0");
        }
        return "\nsdkVersion= " + this.h + "projectID" + this.c + "\nplayType= " + this.d + "\nmetricSource= " + this.e;
    }
}

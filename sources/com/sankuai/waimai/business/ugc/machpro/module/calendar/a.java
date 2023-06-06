package com.sankuai.waimai.business.ugc.machpro.module.calendar;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public String b;
    public String c;
    public long d;
    public boolean e;
    public boolean f;
    public String g;
    public String h;
    public long i;
    public boolean j;
    public int k;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "62bf211774cc73edc8d50d995c4e1acc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "62bf211774cc73edc8d50d995c4e1acc");
            return;
        }
        this.e = true;
        this.j = true;
    }

    public static long a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b4d1e784cb853e3020b8168791abd8b7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b4d1e784cb853e3020b8168791abd8b7")).longValue();
        }
        long j = 0;
        try {
            if (obj instanceof Integer) {
                j = ((Integer) obj).intValue();
            } else if (obj instanceof Long) {
                j = ((Long) obj).intValue();
            } else {
                j = (long) Double.parseDouble((String) obj);
            }
        } catch (Exception unused) {
        }
        return j;
    }
}

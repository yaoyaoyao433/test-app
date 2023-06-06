package com.sankuai.xm.base;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.service.m;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class i {
    public static ChangeQuickRedirect a;
    public static volatile int p;
    public int b;
    public int c;
    public String d;
    public int e;
    public String f;
    public long g;
    public long h;
    public long i;
    public int j;
    public String k;
    public String l;
    public short m;
    public long n;
    public long o;

    public boolean a(HashMap<String, Object> hashMap) {
        Object[] objArr = {hashMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3bb27a12a39e15262e13187475e43de4", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3bb27a12a39e15262e13187475e43de4")).booleanValue();
        }
        if (hashMap != null) {
            try {
            } catch (Throwable th) {
                com.sankuai.xm.login.d.a(th);
            }
            if (hashMap.get("result") != null) {
                if (((Integer) hashMap.get("result")).intValue() == 0) {
                    p = 0;
                    return false;
                }
                int i = p + 1;
                p = i;
                if (i > 3) {
                    m.d().a("lvs_repeat_error", hashMap);
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public static void a(long j, short s) {
        Object[] objArr = {new Long(j), Short.valueOf(s)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7e3bb0e3930fc0c674fc9cad0d06fec9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7e3bb0e3930fc0c674fc9cad0d06fec9");
            return;
        }
        com.sankuai.xm.login.d.a("doFallbackHostReport result:" + ((int) s) + " time" + j + " state:" + f.m().f + " net:" + m.a().j());
    }
}

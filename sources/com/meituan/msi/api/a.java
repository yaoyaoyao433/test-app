package com.meituan.msi.api;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public final Object b;
    public final n c;
    public com.meituan.msi.interceptor.a<?> d;
    boolean e;

    public a(Object obj, n nVar, boolean z) {
        Object[] objArr = {obj, nVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2773b99d565eb94cedf27ce3ac128786", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2773b99d565eb94cedf27ce3ac128786");
            return;
        }
        this.b = obj;
        this.c = nVar;
        this.e = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0126, code lost:
        if (r12 == false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.meituan.msi.api.ApiResponse a(com.meituan.msi.interceptor.a r22, com.meituan.msi.api.ApiRequest r23, com.meituan.msi.api.c r24) throws com.meituan.msi.bean.ApiException {
        /*
            Method dump skipped, instructions count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.msi.api.a.a(com.meituan.msi.interceptor.a, com.meituan.msi.api.ApiRequest, com.meituan.msi.api.c):com.meituan.msi.api.ApiResponse");
    }

    public final int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c1f3356a2910c9841dfd5fb5cb8cf791", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c1f3356a2910c9841dfd5fb5cb8cf791")).intValue();
        }
        if (!this.e || this.c == null) {
            return -1;
        }
        String str = this.c.q;
        Object[] objArr2 = {str};
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msi.util.p.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "e56341ba72fcd2494cf3a82533b72979", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "e56341ba72fcd2494cf3a82533b72979")).intValue();
        }
        if (com.meituan.msi.util.p.b != null) {
            Map<String, Object> map = com.meituan.msi.util.p.b;
            Object obj = map.get(str + "_sample");
            if (obj instanceof Number) {
                return ((Number) obj).intValue();
            }
        }
        return -1;
    }
}

package com.sankuai.waimai.touchmatrix.event;

import com.meituan.android.time.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public int b;
    public String c;
    private long d;
    private Map<String, String> e;

    public static a a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a669ada292ba3b2c02138889b17db324", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a669ada292ba3b2c02138889b17db324") : a(i, c.b(), null);
    }

    private static a a(int i, long j, Map<String, String> map) {
        Object[] objArr = {Integer.valueOf(i), new Long(j), null};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cdfd292737b6a0bb0297836504ecf4f9", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cdfd292737b6a0bb0297836504ecf4f9") : new a(i, j, null);
    }

    private a(int i, long j, Map<String, String> map) {
        Object[] objArr = {Integer.valueOf(i), new Long(j), map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8a886b27dd19abf908e67fa778653194", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8a886b27dd19abf908e67fa778653194");
            return;
        }
        this.b = i;
        this.d = j;
        this.e = map == null ? Collections.emptyMap() : new HashMap<>(map);
    }
}

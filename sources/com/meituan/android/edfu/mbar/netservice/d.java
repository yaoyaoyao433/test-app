package com.meituan.android.edfu.mbar.netservice;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.ar;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class d {
    public static ChangeQuickRedirect a;
    private static volatile d d;
    HashMap<String, ar> b;
    com.meituan.android.edfu.cvlog.netservice.a c;

    public d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "98891171ccfcf31ed3d0343b004a0bc2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "98891171ccfcf31ed3d0343b004a0bc2");
            return;
        }
        this.b = new HashMap<>();
        this.c = new com.meituan.android.edfu.cvlog.netservice.a();
    }

    public static d a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2ed000f1fffb70183d51cd4c63ced3ed", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2ed000f1fffb70183d51cd4c63ced3ed");
        }
        if (d == null) {
            synchronized (d.class) {
                if (d == null) {
                    d = new d();
                }
            }
        }
        return d;
    }
}

package com.meituan.mmp.lib.download;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class f {
    public static ChangeQuickRedirect a;
    private static volatile Map<String, d> b = new HashMap();

    public static d a(String str, Context context) {
        Object[] objArr = {str, context};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "22f78155cdff9aad59e9c3a6b8fed42b", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "22f78155cdff9aad59e9c3a6b8fed42b") : a(str, context, null);
    }

    private static synchronized d a(String str, Context context, e eVar) {
        d dVar;
        synchronized (f.class) {
            Object[] objArr = {str, context, null};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0d7a27e9698f053e66ceb05cf3ef38fe", RobustBitConfig.DEFAULT_VALUE)) {
                return (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0d7a27e9698f053e66ceb05cf3ef38fe");
            }
            if (b.containsKey(str)) {
                dVar = b.get(str);
            } else {
                d dVar2 = new d(str, context, null);
                b.put(str, dVar2);
                dVar = dVar2;
            }
            return dVar;
        }
    }
}

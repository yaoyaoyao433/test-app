package com.meituan.android.edfu.mvex.utils;

import android.content.Context;
import com.dianping.monitor.impl.l;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Collections;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class e {
    public static ChangeQuickRedirect a;
    public static Map<String, String> c;
    private static e e;
    public int b;
    public Context d;

    public e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e6e4c69356f5134ee4ea29cebf9a72a4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e6e4c69356f5134ee4ea29cebf9a72a4");
        } else {
            this.b = 10;
        }
    }

    public static e a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "98d048e3465fe392ca6abfe162031e3d", RobustBitConfig.DEFAULT_VALUE)) {
            return (e) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "98d048e3465fe392ca6abfe162031e3d");
        }
        if (e == null) {
            synchronized (e.class) {
                if (e == null) {
                    e = new e();
                }
            }
        }
        return e;
    }

    public void a(l lVar, Map<String, Float> map) {
        Object[] objArr = {lVar, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a1b0a97f943f63f83399afce25d7d222", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a1b0a97f943f63f83399afce25d7d222");
        } else if (map.size() > 0) {
            for (Map.Entry<String, Float> entry : map.entrySet()) {
                lVar.a(entry.getKey(), Collections.singletonList(entry.getValue()));
            }
        }
    }

    public void b(l lVar, Map<String, String> map) {
        Object[] objArr = {lVar, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "65cfba2436acac00ee0579a9cb442615", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "65cfba2436acac00ee0579a9cb442615");
        } else if (map.size() > 0) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                lVar.a(entry.getKey(), entry.getValue());
            }
        }
    }
}

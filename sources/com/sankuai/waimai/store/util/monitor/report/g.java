package com.sankuai.waimai.store.util.monitor.report;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.SystemClock;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class g extends com.dianping.monitor.impl.a {
    public static ChangeQuickRedirect a;
    @SuppressLint({"StaticFieldLeak"})
    private static volatile g b;

    private g(Context context, int i) {
        super(context, 11);
        Object[] objArr = {context, 11};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7aaba12e206f7fd87c0edc327098ceb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7aaba12e206f7fd87c0edc327098ceb");
        }
    }

    public static synchronized g a() {
        synchronized (g.class) {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "52a2b3008aea0e9fa08f2f50d455cb0c", RobustBitConfig.DEFAULT_VALUE)) {
                return (g) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "52a2b3008aea0e9fa08f2f50d455cb0c");
            }
            if (b == null) {
                synchronized (g.class) {
                    if (b == null) {
                        b = new g(com.sankuai.waimai.store.util.b.a(), 11);
                    }
                }
            }
            return b;
        }
    }

    @Override // com.dianping.monitor.impl.a
    public String getUnionid() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e98643bf9f1193403b143ce42d6849bb", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e98643bf9f1193403b143ce42d6849bb") : com.sankuai.waimai.store.manager.appinfo.a.a();
    }

    private void a(int i, String str, long j) {
        Object[] objArr = {Integer.valueOf(i), str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e06104bd766697a39a7e84811d5a6f2a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e06104bd766697a39a7e84811d5a6f2a");
            return;
        }
        try {
            if (t.a(str)) {
                return;
            }
            pv3(com.meituan.android.time.c.b(), str, 0, 0, i, 0, 0, (int) (SystemClock.elapsedRealtime() - j), null);
        } catch (Exception e) {
            com.sankuai.waimai.store.base.log.a.a(e);
        }
    }

    public final void a(int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "47fa9f2985cee41f09cdeead1da8e553", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "47fa9f2985cee41f09cdeead1da8e553");
        } else {
            a(i, str, SystemClock.elapsedRealtime());
        }
    }
}

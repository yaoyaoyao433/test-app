package com.sankuai.waimai.mach.recycler;

import android.os.Handler;
import android.os.HandlerThread;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class d {
    public static ChangeQuickRedirect a;
    private static volatile d d;
    Handler b;
    Handler c;
    private HandlerThread e;
    private HandlerThread f;

    public d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8cc47d8c47f461de0cee4675ef37db03", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8cc47d8c47f461de0cee4675ef37db03");
            return;
        }
        this.e = new HandlerThread("mach-preRender-1");
        this.e.start();
        this.b = new Handler(this.e.getLooper());
        this.f = new HandlerThread("mach-preRender-2");
        this.f.start();
        this.c = new Handler(this.f.getLooper());
    }

    public static d a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fd292ffe5382b624eaa22d2abdb6890d", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fd292ffe5382b624eaa22d2abdb6890d");
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

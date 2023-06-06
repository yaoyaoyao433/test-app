package com.sankuai.waimai.irmo.canvas;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.irmo.canvas.bridge.INFJSContext;
import com.sankuai.waimai.irmo.utils.d;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class a {
    public static ChangeQuickRedirect a;
    private static volatile a b;
    private volatile boolean c;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b0623e62f7660f217b355d6cb1348171", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b0623e62f7660f217b355d6cb1348171");
        } else {
            this.c = false;
        }
    }

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "af3ae45dee23c501b9068f60d16e7456", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "af3ae45dee23c501b9068f60d16e7456");
        }
        if (b == null) {
            synchronized (a.class) {
                if (b == null) {
                    b = new a();
                }
            }
        }
        return b;
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8fce79c7c8bc068121faa5f1b2d5e2d1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8fce79c7c8bc068121faa5f1b2d5e2d1");
            return;
        }
        d.a("Java inf_canvas_log: INF Canvas SDK  init , isInit: " + this.c, new Object[0]);
        if (this.c) {
            return;
        }
        INFJSContext.a();
        this.c = true;
    }
}

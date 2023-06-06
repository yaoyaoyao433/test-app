package com.sankuai.waimai.rocks.view.mach;

import com.alipay.sdk.app.PayTask;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class f {
    public static ChangeQuickRedirect a;
    private static final int b;
    private static final int c;
    private static final int d;
    private static Executor e;

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        b = availableProcessors;
        c = availableProcessors == 1 ? b : Math.max(2, Math.min(b - 1, 4));
        d = (b * 2) + 1;
    }

    public static Executor a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1b4e6c26a4d3126b42db589ce46b4e0e", RobustBitConfig.DEFAULT_VALUE)) {
            return (Executor) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1b4e6c26a4d3126b42db589ce46b4e0e");
        }
        if (e == null) {
            synchronized (f.class) {
                if (e == null) {
                    e = com.sankuai.android.jarvis.c.a("rocks_pre_render_executor", c, d, PayTask.j, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());
                }
            }
        }
        return e;
    }
}

package com.sankuai.waimai.alita.core.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class e {
    public static ChangeQuickRedirect a;
    public static CopyOnWriteArrayList<WeakReference<Thread>> b;

    public static void a() {
        Thread thread;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a9f49033c0760445a11c9e4f373fa122", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a9f49033c0760445a11c9e4f373fa122");
        } else if (!com.sankuai.waimai.alita.platform.init.c.b()) {
            boolean z = false;
            for (int i = 0; i < b.size(); i++) {
                WeakReference<Thread> weakReference = b.get(i);
                if (weakReference != null && (thread = weakReference.get()) != null && thread == Thread.currentThread()) {
                    z = true;
                }
            }
            if (!z) {
                throw new IllegalStateException("不能在非JS线程使用JS操作");
            }
        }
    }
}

package com.meituan.android.common.aidata.ai.utils;

import com.meituan.android.common.aidata.ai.platform.AppEnvironment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class AiThread {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static CopyOnWriteArrayList<WeakReference<Thread>> jsThreadPools;

    public static void checkThread() {
        Thread thread;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "fcca2b5d7eb9efda811065b292e02f8c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "fcca2b5d7eb9efda811065b292e02f8c");
        } else if (!AppEnvironment.release()) {
            boolean z = false;
            for (int i = 0; i < jsThreadPools.size(); i++) {
                WeakReference<Thread> weakReference = jsThreadPools.get(i);
                if (weakReference != null && (thread = weakReference.get()) != null && thread == Thread.currentThread()) {
                    z = true;
                }
            }
            if (!z) {
                throw new IllegalStateException("不能在非JS线程使用JS操作");
            }
        }
    }

    public static void registerJSThread(Thread thread) {
        Object[] objArr = {thread};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ff83275256a85e6ba6da561ad31e9724", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ff83275256a85e6ba6da561ad31e9724");
        } else if (AppEnvironment.release()) {
        } else {
            if (jsThreadPools == null) {
                jsThreadPools = new CopyOnWriteArrayList<>();
            }
            jsThreadPools.add(new WeakReference<>(thread));
        }
    }

    public static void dumpThread() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "892abfd8b3a29abf848871548ef63868", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "892abfd8b3a29abf848871548ef63868");
        } else if (!AppEnvironment.release()) {
            StringBuilder sb = new StringBuilder();
            sb.append("########################### Thread ###########################\n");
            for (int i = 0; i < jsThreadPools.size(); i++) {
                WeakReference<Thread> weakReference = jsThreadPools.get(i);
                if (weakReference != null) {
                    Thread thread = weakReference.get();
                    if (thread == null) {
                        sb.append("\t\t Thread is NULL \n");
                    } else {
                        sb.append("\t\t Name | ");
                        sb.append(thread.getName());
                        sb.append(" | ID | ");
                        sb.append(thread.getId());
                        sb.append(" | Status | ");
                        sb.append(thread.getState().toString());
                        sb.append("\n");
                    }
                }
            }
            sb.append("--------------------------------------------------------------\n");
        }
    }
}

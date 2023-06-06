package com.meituan.android.common.metricx.sliver;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Field;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes2.dex */
public class SliverNative {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static native boolean checkThreadList();

    public static native void jni();

    public static native void sample(int i);

    public static native void sampleFromOther(Thread thread);

    private static native void sampleInitNative(long j);

    public static native void stacktrace(Thread thread);

    private static native void stacktraceSelf(long j);

    public static native void updateCpuUsage();

    public static native void writeToTrace(String str, boolean z);

    public static void stacktraceSelf(Thread thread) {
        Object[] objArr = {thread};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d639afe89eed583257e28002be34790d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d639afe89eed583257e28002be34790d");
            return;
        }
        try {
            Field declaredField = Thread.class.getDeclaredField("nativePeer");
            declaredField.setAccessible(true);
            stacktraceSelf(((Long) declaredField.get(thread)).longValue());
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void sampleInit(Thread thread) {
        Object[] objArr = {thread};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a8de11d3b89142745afa737c31d49fe5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a8de11d3b89142745afa737c31d49fe5");
            return;
        }
        try {
            Field declaredField = Thread.class.getDeclaredField("nativePeer");
            declaredField.setAccessible(true);
            sampleInitNative(((Long) declaredField.get(thread)).longValue());
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}

package com.meituan.android.common.metricx.sliver;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class SliverProxy {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    public static long lastSampleMill = 0;
    public static volatile boolean sampleNow = false;
    public static Thread thread;

    public static void sample() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f98c23a5cb1ec1cb03b7ed6b176f0fd8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f98c23a5cb1ec1cb03b7ed6b176f0fd8");
            return;
        }
        sampleNow = false;
        if (thread != null) {
            SliverNative.sample(0);
        }
    }

    public static void sampleInternal(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6e334395bde3062c17bd5f818944aa6b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6e334395bde3062c17bd5f818944aa6b");
            return;
        }
        sampleNow = false;
        if (thread != null) {
            SliverNative.sample(i);
        }
    }

    public static void sampleFromOther() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "af6f52667fb53097868df926f887401e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "af6f52667fb53097868df926f887401e");
        } else if (thread != null) {
            SliverNative.sampleFromOther(thread);
        }
    }
}

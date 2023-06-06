package com.meituan.msc.jse.bridge;

import com.facebook.jni.HybridData;
import com.meituan.msc.jse.common.annotations.DoNotStrip;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@DoNotStrip
/* loaded from: classes3.dex */
public abstract class JavaScriptExecutor {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final HybridData mHybridData;

    public abstract String getName();

    public JavaScriptExecutor(HybridData hybridData) {
        Object[] objArr = {hybridData};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3b6746e88223fec3e9ba2d1c0563eef7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3b6746e88223fec3e9ba2d1c0563eef7");
        } else {
            this.mHybridData = hybridData;
        }
    }

    public void close() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "980dc36239a3a36126022529baf7347f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "980dc36239a3a36126022529baf7347f");
        } else {
            this.mHybridData.resetNative();
        }
    }
}

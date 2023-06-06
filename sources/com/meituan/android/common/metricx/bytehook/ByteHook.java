package com.meituan.android.common.metricx.bytehook;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class ByteHook {
    public static final int INIT_STATUS_OK = 0;
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static volatile boolean initSuccess = false;
    private static volatile boolean isInit = false;

    private static native int nativeAddIgnore(String str);

    private static native int nativeInit(int i, boolean z);

    private static native void nativeSetDebug(boolean z);

    public boolean init(@NonNull ByteHookConfig byteHookConfig) {
        Object[] objArr = {byteHookConfig};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2dc84832321de616ab0739e592ebac5a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2dc84832321de616ab0739e592ebac5a")).booleanValue();
        }
        if (!isInit) {
            initSuccess = nativeInit(byteHookConfig.getMode().getValue(), byteHookConfig.getDebug()) == 0;
            isInit = true;
            return initSuccess;
        }
        return initSuccess;
    }

    public void addIgnore(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "638f563a447d34e05940e24a481199bc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "638f563a447d34e05940e24a481199bc");
        } else if (initSuccess) {
            nativeAddIgnore(str);
        }
    }

    public void setDebug(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "66e9b4068006e2b44d5a27f9927c8984", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "66e9b4068006e2b44d5a27f9927c8984");
        } else if (initSuccess) {
            nativeSetDebug(z);
        }
    }
}

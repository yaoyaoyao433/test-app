package com.meituan.android.common.metricx;

import android.support.annotation.NonNull;
import com.meituan.android.common.metricx.bytehook.ByteHook;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class NativeTools {
    private static final String SO_NAME = "metricx_nativetools";
    public static final int STEPS_BHOOK_INIT_FAIL = 1003;
    public static final int STEPS_FINISH = 1001;
    public static final int STEPS_LIB_LOAD_FAIL = 1002;
    public static final int STEPS_NOT_INIT = 1000;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final ByteHook byteHook = new ByteHook();
    private static volatile int initSteps = 1000;

    public static int init(Config config, @NonNull ILibLoader iLibLoader) {
        Object[] objArr = {config, iLibLoader};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b7cbdbcf7755f9d06f706ba89529e241", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b7cbdbcf7755f9d06f706ba89529e241")).intValue();
        }
        if (initSteps != 1000) {
            return initSteps;
        }
        try {
            if (!iLibLoader.loadLibrary(SO_NAME)) {
                initSteps = 1002;
                return 1002;
            }
            try {
                byteHook.init(config.getByteHookConfig());
                initSteps = 1001;
                return 1001;
            } catch (Throwable unused) {
                initSteps = 1003;
                return 1003;
            }
        } catch (Throwable unused2) {
            initSteps = 1002;
            return 1002;
        }
    }

    public static ByteHook obtainByteHookInstance() {
        return byteHook;
    }
}

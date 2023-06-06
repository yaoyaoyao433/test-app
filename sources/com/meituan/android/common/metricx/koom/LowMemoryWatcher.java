package com.meituan.android.common.metricx.koom;

import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.jarvis.c;
import java.util.concurrent.ExecutorService;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class LowMemoryWatcher implements ComponentCallbacks2 {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final int mHeapSizeThreshold = 314572800;
    private boolean hasDumped;
    private static final LowMemoryWatcher instance = new LowMemoryWatcher();
    private static final ExecutorService mService = c.a("koom_low_memory");

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(@NonNull Configuration configuration) {
    }

    public LowMemoryWatcher() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bb2b70933d93e8f6ca7cc6a71c15db38", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bb2b70933d93e8f6ca7cc6a71c15db38");
        } else {
            this.hasDumped = false;
        }
    }

    public static LowMemoryWatcher getInstance() {
        return instance;
    }

    public void init(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5ca9851cce37bf3350c12f4e46590b24", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5ca9851cce37bf3350c12f4e46590b24");
        } else {
            ((Application) context.getApplicationContext()).registerComponentCallbacks(this);
        }
    }

    public void dumpHprof() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ec62d7b3db93f7ada8878e6af40b21e8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ec62d7b3db93f7ada8878e6af40b21e8");
        } else if (!this.hasDumped && Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory() > 314572800) {
            mService.execute(new Runnable() { // from class: com.meituan.android.common.metricx.koom.LowMemoryWatcher.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "d4247dfa596957591fcade200a568bb1", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "d4247dfa596957591fcade200a568bb1");
                    } else {
                        Koom.getInstance().dumpHprofData(KoomDebugger.MEMORY_TOUCH_TOP);
                    }
                }
            });
            this.hasDumped = true;
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0f270b64689446676f4d0b9fa20475f9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0f270b64689446676f4d0b9fa20475f9");
        } else {
            dumpHprof();
        }
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4cdd679fe8adee203e25f3e51a3bc439", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4cdd679fe8adee203e25f3e51a3bc439");
        } else {
            dumpHprof();
        }
    }
}

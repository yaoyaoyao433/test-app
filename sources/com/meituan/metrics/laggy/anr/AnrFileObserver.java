package com.meituan.metrics.laggy.anr;

import android.os.FileObserver;
import android.support.annotation.Nullable;
import com.meituan.android.common.metricx.utils.Logger;
import com.meituan.metrics.laggy.anr.AnrCallback;
import com.meituan.metrics.util.TimeUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class AnrFileObserver extends FileObserver {
    public static final String ANR_TRACE_BASE_PATH = "/data/anr/";
    public static ChangeQuickRedirect changeQuickRedirect;
    private AnrCallback anrCallback;

    public AnrFileObserver(String str, AnrCallback anrCallback) {
        super(str, 8);
        Object[] objArr = {str, anrCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "05b7d14d73cf5f5a6c3eacb2d67a0611", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "05b7d14d73cf5f5a6c3eacb2d67a0611");
        } else {
            this.anrCallback = anrCallback;
        }
    }

    @Override // android.os.FileObserver
    public void onEvent(int i, @Nullable String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "32a3f3f5f04c03967e2d2b76d384403e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "32a3f3f5f04c03967e2d2b76d384403e");
            return;
        }
        String resolvePath = resolvePath(str);
        Logger.getMetricsLogger().d(getClass().getSimpleName(), "path:", resolvePath);
        if (this.anrCallback != null) {
            Logger.getMetricsLogger().d("AnrFileObserver onAnrEvent");
            AnrSLA.getInstance().updateAnrCIPS(AnrSLA.CIPS_KEY_ANR_RECORD_COUNT);
            this.anrCallback.onAnrEvent(TimeUtil.currentTimeMillisSNTP(), resolvePath, null, AnrCallback.ANR_DETECT_TYPE.FILE, null);
        }
    }

    private String resolvePath(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fac7237b5729138777ff3571bdef963d", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fac7237b5729138777ff3571bdef963d") : (str == null || "binderinfo".equals(str.toLowerCase())) ? "traces.txt" : str;
    }
}

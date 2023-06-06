package com.meituan.metrics.traffic;

import android.content.Context;
import android.os.Build;
import android.support.annotation.NonNull;
import com.meituan.android.common.babel.Babel;
import com.meituan.android.common.kitefly.Log;
import com.meituan.metrics.util.BasicTrafficUnit;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class SystemTrafficProviderFactory {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class EmptySystemTrafficProvider extends SystemTrafficProvider {
        public static ChangeQuickRedirect changeQuickRedirect;
        private BasicTrafficUnit emptyUnit;

        @Override // com.meituan.metrics.traffic.SystemTrafficProvider
        public void updateTotalTraffic(BasicTrafficUnit basicTrafficUnit) {
        }

        public EmptySystemTrafficProvider() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c877bf8e41b76b3327cd0921eb4b27ee", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c877bf8e41b76b3327cd0921eb4b27ee");
                return;
            }
            this.emptyUnit = new BasicTrafficUnit();
            Babel.log(new Log.Builder("").value(1L).tag("metrics-traffic-file-error").generalChannelStatus(true).build());
        }

        @Override // com.meituan.metrics.traffic.SystemTrafficProvider
        public BasicTrafficUnit getIncreaseTrafficUnit() {
            return this.emptyUnit;
        }
    }

    public static SystemTrafficProvider create(@NonNull Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "22150018e1704e426835516b5fd43fa7", RobustBitConfig.DEFAULT_VALUE)) {
            return (SystemTrafficProvider) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "22150018e1704e426835516b5fd43fa7");
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return new SystemTrafficProviderV28Plus(context);
        }
        if (checkNetFileExistV27()) {
            return new SystemTrafficProviderV27();
        }
        return new EmptySystemTrafficProvider();
    }

    private static boolean checkNetFileExistV27() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e58e40bbf27a89014817a89c07a6b03e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e58e40bbf27a89014817a89c07a6b03e")).booleanValue();
        }
        File file = new File("/proc/net/xt_qtaguid/stats");
        try {
            if (file.exists()) {
                return file.canRead();
            }
            return false;
        } catch (SecurityException unused) {
            return false;
        }
    }
}

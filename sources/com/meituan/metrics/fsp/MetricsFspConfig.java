package com.meituan.metrics.fsp;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class MetricsFspConfig {
    public static ChangeQuickRedirect changeQuickRedirect;

    public List<Class<? extends View>> getFspIgnoreViewList() {
        return null;
    }

    public String getFspViewBridgeClassName() {
        return "";
    }

    public ILifecycleService getILifecycleService() {
        return null;
    }

    public boolean isDebug() {
        return true;
    }

    public boolean isOpenFsp() {
        return false;
    }
}

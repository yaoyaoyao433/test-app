package com.meituan.metrics.fsp;

import android.content.Context;
import android.view.View;
import com.meituan.metrics.util.thread.Task;
import com.meituan.metrics.util.thread.ThreadManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Collections;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class FspIniter {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static Context context = null;
    private static boolean isOpenDebugTools = false;
    private static MetricsFspConfig metricsFspConfig;

    public static void init(Context context2, MetricsFspConfig metricsFspConfig2) {
        Object[] objArr = {context2, metricsFspConfig2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2e704fd10fd113cf0f57935cf202abde", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2e704fd10fd113cf0f57935cf202abde");
            return;
        }
        context = context2;
        metricsFspConfig = metricsFspConfig2;
        initFspDetector();
    }

    public static void setOpenDebugTools(boolean z) {
        isOpenDebugTools = z;
    }

    private static void initFspDetector() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b219b9f7fa2bafb48c9b545b3b52b2f0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b219b9f7fa2bafb48c9b545b3b52b2f0");
        } else if (isOpenFsp()) {
            ThreadManager.getInstance().post(new Task() { // from class: com.meituan.metrics.fsp.FspIniter.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.meituan.metrics.util.thread.Task
                public final void schedule() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "dc909cb36e36d7bd37bf64cb20eb4c33", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "dc909cb36e36d7bd37bf64cb20eb4c33");
                    } else {
                        MetricsFspDetector.getInstance().init();
                    }
                }
            });
        }
    }

    public static List<Class<? extends View>> getFspIgnoreViewList() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4ec90af2acc4aa562eaab0269a97ec56", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4ec90af2acc4aa562eaab0269a97ec56");
        }
        if (metricsFspConfig != null) {
            return metricsFspConfig.getFspIgnoreViewList();
        }
        return Collections.emptyList();
    }

    public static ILifecycleService getILifecycleService() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a775f68d1778b9fd4645a04d54ccf835", RobustBitConfig.DEFAULT_VALUE)) {
            return (ILifecycleService) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a775f68d1778b9fd4645a04d54ccf835");
        }
        if (metricsFspConfig != null) {
            return metricsFspConfig.getILifecycleService();
        }
        return null;
    }

    public static boolean isOpenFsp() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "046d2cd7f7f3bdfef089de0861ad799b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "046d2cd7f7f3bdfef089de0861ad799b")).booleanValue();
        }
        if (metricsFspConfig != null) {
            return metricsFspConfig.isOpenFsp();
        }
        return false;
    }

    public MetricsFspConfig getMetricsFspConfig() {
        return metricsFspConfig;
    }

    public static boolean isDebug() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "bede3750d5e9578f7a4c9d9a050f07fa", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "bede3750d5e9578f7a4c9d9a050f07fa")).booleanValue();
        }
        if (metricsFspConfig != null) {
            return metricsFspConfig.isDebug();
        }
        return true;
    }

    public static Context getContext() {
        return context;
    }

    public static boolean isOpenDebugTools() {
        return isOpenDebugTools;
    }
}

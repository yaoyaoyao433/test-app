package com.sankuai.titans.base;

import android.support.annotation.NonNull;
import com.meituan.android.mrn.containerplugin.stage.IContainerLifeCycleStage;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.protocol.context.ITitansContainerContext;
import com.sankuai.titans.protocol.lifecycle.IContainerLifeCycle;
import com.sankuai.titans.protocol.lifecycle.ITitansPlugin;
import com.sankuai.titans.protocol.lifecycle.annotation.TitansPlugin;
import com.sankuai.titans.protocol.services.IStatisticsService;
import com.sankuai.titans.protocol.services.statisticInfo.LifeCycleInfo;
import com.sankuai.titans.protocol.services.statisticInfo.LifeCycleType;
import com.sankuai.titans.protocol.services.statisticInfo.PluginErrorInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class ContainerObservable {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final ITitansContainerContext mContainerContext;
    private final List<IContainerLifeCycle> mLifeCycleList;
    private final String mScheme;
    private final IStatisticsService statisticsService;
    private final Map<IContainerLifeCycle, TitansPlugin> titansPluginMap;

    /* JADX WARN: Multi-variable type inference failed */
    public ContainerObservable(@NonNull List<ITitansPlugin> list, @NonNull ITitansContainerContext iTitansContainerContext) {
        IContainerLifeCycle containerLifeCycle;
        Object[] objArr = {list, iTitansContainerContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c154682d5a1b6f3687f92d2027199229", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c154682d5a1b6f3687f92d2027199229");
            return;
        }
        this.titansPluginMap = new HashMap();
        this.mContainerContext = iTitansContainerContext;
        this.mScheme = this.mContainerContext.getContainerAdapter().scheme();
        this.statisticsService = this.mContainerContext.getTitansContext().getServiceManager().getStatisticsService();
        this.mLifeCycleList = new ArrayList();
        for (ITitansPlugin iTitansPlugin : list) {
            if (iTitansPlugin != null && (containerLifeCycle = iTitansPlugin.getContainerLifeCycle()) != null) {
                this.mLifeCycleList.add(containerLifeCycle);
                this.titansPluginMap.put(containerLifeCycle, iTitansPlugin.getClass().getAnnotation(TitansPlugin.class));
            }
        }
    }

    public void onContainerCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8c3b8ab701ba47bd0a671047ec1de72c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8c3b8ab701ba47bd0a671047ec1de72c");
            return;
        }
        LifeCycleInfo containerLifeCycleInfo = getContainerLifeCycleInfo(null, "onContainerCreated", System.currentTimeMillis());
        for (IContainerLifeCycle iContainerLifeCycle : this.mLifeCycleList) {
            if (iContainerLifeCycle != null) {
                LifeCycleInfo containerLifeCycleInfo2 = getContainerLifeCycleInfo(iContainerLifeCycle, "onContainerCreated", System.currentTimeMillis());
                try {
                    iContainerLifeCycle.onContainerCreated(this.mContainerContext);
                    reportLifeCycleInfo(containerLifeCycleInfo2);
                } catch (Throwable th) {
                    reportErrorInfo(iContainerLifeCycle, "onContainerCreated", null, th);
                }
            }
        }
        reportLifeCycleInfo(containerLifeCycleInfo);
    }

    public void onContainerDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bf4be57bfd8886876a20c4913ff1eab2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bf4be57bfd8886876a20c4913ff1eab2");
            return;
        }
        LifeCycleInfo containerLifeCycleInfo = getContainerLifeCycleInfo(null, "onContainerDestroy", System.currentTimeMillis());
        for (IContainerLifeCycle iContainerLifeCycle : this.mLifeCycleList) {
            if (iContainerLifeCycle != null) {
                LifeCycleInfo containerLifeCycleInfo2 = getContainerLifeCycleInfo(iContainerLifeCycle, "onContainerDestroy", System.currentTimeMillis());
                try {
                    iContainerLifeCycle.onContainerDestroy(this.mContainerContext);
                    reportLifeCycleInfo(containerLifeCycleInfo2);
                } catch (Throwable th) {
                    reportErrorInfo(iContainerLifeCycle, "onContainerDestroy", null, th);
                }
            }
        }
        reportLifeCycleInfo(containerLifeCycleInfo);
        this.mLifeCycleList.clear();
    }

    public void onContainerPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3cccbfbb8abea47ec3b527a7f2c10cfa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3cccbfbb8abea47ec3b527a7f2c10cfa");
            return;
        }
        LifeCycleInfo containerLifeCycleInfo = getContainerLifeCycleInfo(null, "onContainerPause", System.currentTimeMillis());
        for (IContainerLifeCycle iContainerLifeCycle : this.mLifeCycleList) {
            if (iContainerLifeCycle != null) {
                LifeCycleInfo containerLifeCycleInfo2 = getContainerLifeCycleInfo(iContainerLifeCycle, "onContainerPause", System.currentTimeMillis());
                try {
                    iContainerLifeCycle.onContainerPause(this.mContainerContext);
                    reportLifeCycleInfo(containerLifeCycleInfo2);
                } catch (Throwable th) {
                    reportErrorInfo(iContainerLifeCycle, "onContainerPause", null, th);
                }
            }
        }
        reportLifeCycleInfo(containerLifeCycleInfo);
    }

    public void onContainerResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "805322e9fd462d224615dc7fb253c792", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "805322e9fd462d224615dc7fb253c792");
            return;
        }
        LifeCycleInfo containerLifeCycleInfo = getContainerLifeCycleInfo(null, "onContainerResume", System.currentTimeMillis());
        for (IContainerLifeCycle iContainerLifeCycle : this.mLifeCycleList) {
            if (iContainerLifeCycle != null) {
                LifeCycleInfo containerLifeCycleInfo2 = getContainerLifeCycleInfo(iContainerLifeCycle, "onContainerResume", System.currentTimeMillis());
                try {
                    iContainerLifeCycle.onContainerResume(this.mContainerContext);
                    reportLifeCycleInfo(containerLifeCycleInfo2);
                } catch (Throwable th) {
                    reportErrorInfo(iContainerLifeCycle, "onContainerResume", null, th);
                }
            }
        }
        reportLifeCycleInfo(containerLifeCycleInfo);
    }

    public void onContainerStop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6ac9a1d10ca1de86dd3d67723941e2d7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6ac9a1d10ca1de86dd3d67723941e2d7");
            return;
        }
        LifeCycleInfo containerLifeCycleInfo = getContainerLifeCycleInfo(null, IContainerLifeCycleStage.IContainerStopStage.NAME, System.currentTimeMillis());
        for (IContainerLifeCycle iContainerLifeCycle : this.mLifeCycleList) {
            if (iContainerLifeCycle != null) {
                LifeCycleInfo containerLifeCycleInfo2 = getContainerLifeCycleInfo(iContainerLifeCycle, IContainerLifeCycleStage.IContainerStopStage.NAME, System.currentTimeMillis());
                try {
                    iContainerLifeCycle.onContainerStop(this.mContainerContext);
                    reportLifeCycleInfo(containerLifeCycleInfo2);
                } catch (Throwable th) {
                    reportErrorInfo(iContainerLifeCycle, IContainerLifeCycleStage.IContainerStopStage.NAME, null, th);
                }
            }
        }
        reportLifeCycleInfo(containerLifeCycleInfo);
    }

    public void onContainerStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c2e02efa3daac6ee5dd9a64e578d6fc8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c2e02efa3daac6ee5dd9a64e578d6fc8");
            return;
        }
        LifeCycleInfo containerLifeCycleInfo = getContainerLifeCycleInfo(null, "onContainerStart", System.currentTimeMillis());
        for (IContainerLifeCycle iContainerLifeCycle : this.mLifeCycleList) {
            if (iContainerLifeCycle != null) {
                LifeCycleInfo containerLifeCycleInfo2 = getContainerLifeCycleInfo(iContainerLifeCycle, "onContainerStart", System.currentTimeMillis());
                try {
                    iContainerLifeCycle.onContainerStart(this.mContainerContext);
                    reportLifeCycleInfo(containerLifeCycleInfo2);
                } catch (Throwable th) {
                    reportErrorInfo(iContainerLifeCycle, "onContainerStart", null, th);
                }
            }
        }
        reportLifeCycleInfo(containerLifeCycleInfo);
    }

    private LifeCycleInfo getContainerLifeCycleInfo(IContainerLifeCycle iContainerLifeCycle, String str, long j) {
        LifeCycleInfo lifeCycleInfo;
        Object[] objArr = {iContainerLifeCycle, str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c74c257c552c03112c6de067fbd67bd3", RobustBitConfig.DEFAULT_VALUE)) {
            return (LifeCycleInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c74c257c552c03112c6de067fbd67bd3");
        }
        if (iContainerLifeCycle == null) {
            lifeCycleInfo = new LifeCycleInfo("$all", "20.14.1", "20.14.1", LifeCycleType.Container, str);
        } else {
            TitansPlugin titansPlugin = this.titansPluginMap.get(iContainerLifeCycle);
            lifeCycleInfo = new LifeCycleInfo(titansPlugin.name(), titansPlugin.version(), "20.14.1", LifeCycleType.Container, str);
        }
        lifeCycleInfo.setStartTime(j);
        lifeCycleInfo.setScheme(this.mScheme);
        return lifeCycleInfo;
    }

    private void reportErrorInfo(IContainerLifeCycle iContainerLifeCycle, String str, String str2, Throwable th) {
        Object[] objArr = {iContainerLifeCycle, str, str2, th};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4b38e1474ce0f9d0081042db8d49c3e4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4b38e1474ce0f9d0081042db8d49c3e4");
            return;
        }
        TitansPlugin titansPlugin = this.titansPluginMap.get(iContainerLifeCycle);
        this.statisticsService.reportErrorInfo(new PluginErrorInfo(LifeCycleType.Container, str, titansPlugin.name(), titansPlugin.version(), str2, th));
    }

    private void reportLifeCycleInfo(LifeCycleInfo lifeCycleInfo) {
        Object[] objArr = {lifeCycleInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "73e0c1104ee829ec3a0985f56606bd01", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "73e0c1104ee829ec3a0985f56606bd01");
            return;
        }
        lifeCycleInfo.setEndTime(System.currentTimeMillis());
        this.statisticsService.reportLifeCycleInfo(lifeCycleInfo);
    }
}

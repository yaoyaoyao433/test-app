package com.meituan.metrics.laggy.respond;

import android.app.Activity;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.NonNull;
import com.meituan.android.common.metricx.helpers.AppBus;
import com.meituan.metrics.laggy.respond.config.RespondLaggyConfigManager;
import com.meituan.metrics.laggy.respond.config.RespondLaggyRemoteConfig;
import com.meituan.metrics.laggy.respond.model.PageRespondLaggyModel;
import com.meituan.metrics.lifecycle.MetricsActivityLifecycleCallback;
import com.meituan.metrics.lifecycle.MetricsActivityLifecycleManager;
import com.meituan.metrics.util.thread.ThreadManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class RespondLaggyManager implements AppBus.OnBackgroundUIListener, MetricsActivityLifecycleCallback {
    private static final int EVENT_TIME_TO_MESSAGE_WHAT = 1073741823;
    private static final int WHAT_LAGGY_REPORT = 2;
    private static final int WHAT_MRN_LAGGY_OFFSET = 3;
    public static final int WHAT_NATIVE_LAGGY = 1;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static volatile RespondLaggyManager sInstance;
    private int curActivityToken;
    private final boolean isSamplerEnable;
    private final NativeLaggyManager nativeLaggyManager;
    private final ConcurrentHashMap<Integer, PageRespondLaggyModel> pageLaggyRecordMap;
    private final RespondLaggyRemoteConfig respondLaggyRemoteConfig;
    private final Handler workHandler;

    @Override // com.meituan.metrics.lifecycle.MetricsActivityLifecycleCallback
    public final void onActivityCreated(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "efb3f2ef13594db29f3847f2e7d45f17", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "efb3f2ef13594db29f3847f2e7d45f17");
        }
    }

    @Override // com.meituan.metrics.lifecycle.MetricsActivityLifecycleCallback
    public final void onActivityPaused(Activity activity) {
    }

    @Override // com.meituan.metrics.lifecycle.MetricsActivityLifecycleCallback
    public final void onActivityStopped(Activity activity) {
    }

    public RespondLaggyManager() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "101ad5b7c8117609370db70f7bca8ec6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "101ad5b7c8117609370db70f7bca8ec6");
            return;
        }
        this.workHandler = new Handler(ThreadManager.getInstance().getMetricsBgLooper()) { // from class: com.meituan.metrics.laggy.respond.RespondLaggyManager.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.os.Handler
            public void handleMessage(@NonNull Message message) {
                Object[] objArr2 = {message};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "4c22717dbafebb5c9c3d6aa2309a50e4", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "4c22717dbafebb5c9c3d6aa2309a50e4");
                    return;
                }
                super.handleMessage(message);
                if (message.what != 2) {
                    PageRespondLaggyModel pageRespondLaggyModel = (PageRespondLaggyModel) RespondLaggyManager.this.pageLaggyRecordMap.get(Integer.valueOf(message.arg1));
                    if (pageRespondLaggyModel == null) {
                        return;
                    }
                    RespondLaggyManager.this.pageLaggyRecordMap.remove(Integer.valueOf(message.arg1));
                    if (message.what == 1) {
                        pageRespondLaggyModel.putNativeLaggyTime(RespondLaggyManager.this.respondLaggyRemoteConfig.getTimeout());
                    } else {
                        pageRespondLaggyModel.putMRNLaggyTime(RespondLaggyManager.this.respondLaggyRemoteConfig.getTimeout());
                    }
                    pageRespondLaggyModel.report(true);
                } else if (message.obj instanceof PageRespondLaggyModel) {
                    ((PageRespondLaggyModel) message.obj).report(false);
                }
            }
        };
        this.pageLaggyRecordMap = new ConcurrentHashMap<>();
        this.curActivityToken = -1;
        this.respondLaggyRemoteConfig = RespondLaggyConfigManager.getInstance().getRespondLaggyRemoteConfig();
        this.isSamplerEnable = this.respondLaggyRemoteConfig.isEnable();
        if (this.isSamplerEnable) {
            this.nativeLaggyManager = new NativeLaggyManager(this.workHandler, this.respondLaggyRemoteConfig, this.pageLaggyRecordMap);
            MetricsActivityLifecycleManager.getInstance().register(this);
            AppBus.getInstance().register((AppBus.OnBackgroundListener) this, false);
            return;
        }
        this.nativeLaggyManager = null;
    }

    public static RespondLaggyManager getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d6fa078605a89938066e91e7e459848c", RobustBitConfig.DEFAULT_VALUE)) {
            return (RespondLaggyManager) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d6fa078605a89938066e91e7e459848c");
        }
        if (sInstance == null) {
            synchronized (RespondLaggyManager.class) {
                if (sInstance == null) {
                    sInstance = new RespondLaggyManager();
                }
            }
        }
        return sInstance;
    }

    @NonNull
    private PageRespondLaggyModel initPageLaggyModel(int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bdfda24a29bb7d2933350a9f3e7f19f3", RobustBitConfig.DEFAULT_VALUE)) {
            return (PageRespondLaggyModel) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bdfda24a29bb7d2933350a9f3e7f19f3");
        }
        PageRespondLaggyModel pageRespondLaggyModel = this.pageLaggyRecordMap.get(Integer.valueOf(i));
        if (pageRespondLaggyModel == null) {
            PageRespondLaggyModel pageRespondLaggyModel2 = new PageRespondLaggyModel(str);
            this.pageLaggyRecordMap.put(Integer.valueOf(i), pageRespondLaggyModel2);
            return pageRespondLaggyModel2;
        }
        return pageRespondLaggyModel;
    }

    public final void initJSLaggyModel(int i, String str, String str2, String str3, String str4, String str5) {
        Object[] objArr = {Integer.valueOf(i), str, str2, str3, str4, str5};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "20098a443d0eeec8fe142e5b04fe6b17", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "20098a443d0eeec8fe142e5b04fe6b17");
        } else if (!this.isSamplerEnable || this.respondLaggyRemoteConfig.inWhiteList(str)) {
        } else {
            initPageLaggyModel(i, str).initJSRespondLaggyModel(str2, str3, str4, str5);
        }
    }

    public final boolean isLaggySamplerEnable() {
        return this.isSamplerEnable;
    }

    public final void putJSDelayRunnable(int i, long j) {
        PageRespondLaggyModel pageRespondLaggyModel;
        Object[] objArr = {Integer.valueOf(i), new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0b00dfd3e9008146df26b8cc43a0c8b6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0b00dfd3e9008146df26b8cc43a0c8b6");
        } else if (this.isSamplerEnable && (pageRespondLaggyModel = this.pageLaggyRecordMap.get(Integer.valueOf(i))) != null) {
            pageRespondLaggyModel.addOnesMRNRespond();
            Message obtain = Message.obtain();
            obtain.what = ((int) (j & 1073741823)) + 3;
            obtain.arg1 = i;
            this.workHandler.sendMessageDelayed(obtain, this.respondLaggyRemoteConfig.getTimeout());
        }
    }

    public final void cancelJSDelayRunnable(int i, long j) {
        PageRespondLaggyModel pageRespondLaggyModel;
        Object[] objArr = {Integer.valueOf(i), new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "98365bf76fbcbdbd7d253fc0e89b9525", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "98365bf76fbcbdbd7d253fc0e89b9525");
        } else if (this.isSamplerEnable) {
            this.workHandler.removeMessages(((int) (1073741823 & j)) + 3);
            long reportLaggyTimeByStartTime = this.respondLaggyRemoteConfig.getReportLaggyTimeByStartTime(j);
            if (reportLaggyTimeByStartTime <= 0 || (pageRespondLaggyModel = this.pageLaggyRecordMap.get(Integer.valueOf(i))) == null) {
                return;
            }
            pageRespondLaggyModel.putMRNLaggyTime(reportLaggyTimeByStartTime);
        }
    }

    @Override // com.meituan.metrics.lifecycle.MetricsActivityLifecycleCallback
    public final void onActivityResumed(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9f001040e1459d026c0b9bb770f3d2b2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9f001040e1459d026c0b9bb770f3d2b2");
            return;
        }
        triggerReport();
        if (activity == null || this.respondLaggyRemoteConfig.inWhiteList(activity.getClass().getName())) {
            return;
        }
        this.curActivityToken = activity.hashCode();
        initPageLaggyModel(activity.hashCode(), activity.getClass().getName());
        if (this.nativeLaggyManager != null) {
            this.nativeLaggyManager.onActivityResumed(activity);
        }
    }

    @Override // com.meituan.android.common.metricx.helpers.AppBus.OnBackgroundListener
    public final void onBackground() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ce6798be1ead77b45adcbd33db9cc7fa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ce6798be1ead77b45adcbd33db9cc7fa");
        } else {
            triggerReport();
        }
    }

    private void triggerReport() {
        PageRespondLaggyModel pageRespondLaggyModel;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "383c0c0d0f0227ab5c8e4149cf16e4e8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "383c0c0d0f0227ab5c8e4149cf16e4e8");
            return;
        }
        if (this.curActivityToken > 0 && (pageRespondLaggyModel = this.pageLaggyRecordMap.get(Integer.valueOf(this.curActivityToken))) != null) {
            this.pageLaggyRecordMap.remove(Integer.valueOf(this.curActivityToken));
            Message obtain = Message.obtain();
            obtain.what = 2;
            obtain.obj = pageRespondLaggyModel;
            this.workHandler.sendMessage(obtain);
        }
        this.curActivityToken = -1;
    }
}

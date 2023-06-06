package com.dianping.shield.dynamic.protocols;

import com.dianping.agentsdk.agent.HoloAgent;
import com.dianping.shield.lifecycle.PageLifecycleCallbacks;
import rx.k;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public interface DynamicHostInterface extends DynamicChassisInterface, ICommonHost, IDynamicPaintingCallback, PageLifecycleCallbacks {
    void addHostDestroyHook(HostDestroyCallback hostDestroyCallback);

    @Deprecated
    void addSubscription(k kVar);

    DynamicChassisInterface getDynamicChassis();

    @Deprecated
    HoloAgent getHoloAgent();

    void onAppear(Object... objArr);

    void onChassisAppear();

    void onChassisDisappear();

    void onDestroy();

    void onDisappear(Object... objArr);

    void onLoad();

    void onNeedLoadMore();

    void onPaintingSucess();

    boolean onRefresh(Object... objArr);

    void onRetryForLoadingFail();
}

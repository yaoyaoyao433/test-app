package com.meituan.metrics.traffic.okhttp3.eventlistener;

import com.meituan.metrics.traffic.okhttp3.eventlistener.OkHttp3EventListener;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import okhttp3.Call;
import okhttp3.EventListener;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class FactoryDispatcher implements EventListener.Factory {
    public static ChangeQuickRedirect changeQuickRedirect;
    public EventListener.Factory metricxFactory;
    public EventListener.Factory userFactory;

    @Override // okhttp3.EventListener.Factory
    public EventListener create(Call call) {
        Object[] objArr = {call};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1348d5da4927de5ee9f907cbca01d000", RobustBitConfig.DEFAULT_VALUE)) {
            return (EventListener) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1348d5da4927de5ee9f907cbca01d000");
        }
        ArrayList arrayList = new ArrayList();
        if (this.metricxFactory != null) {
            arrayList.add(this.metricxFactory.create(call));
        }
        if (this.userFactory != null) {
            arrayList.add(this.userFactory.create(call));
        }
        return new EventListenerDispatcher(arrayList);
    }

    public void setFactory(EventListener.Factory factory) {
        if (factory instanceof OkHttp3EventListener.Factory) {
            this.metricxFactory = factory;
        } else {
            this.userFactory = factory;
        }
    }

    public void setEventListener(final EventListener eventListener) {
        Object[] objArr = {eventListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d5755a0fa745cffeee8050f2d7810c7a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d5755a0fa745cffeee8050f2d7810c7a");
        } else {
            this.userFactory = new EventListener.Factory() { // from class: com.meituan.metrics.traffic.okhttp3.eventlistener.FactoryDispatcher.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // okhttp3.EventListener.Factory
                public EventListener create(Call call) {
                    return eventListener;
                }
            };
        }
    }
}

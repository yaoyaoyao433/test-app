package com.meituan.metrics.traffic.okhttp3.eventlistener;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import okhttp3.EventListener;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class FactoryWrapper {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static EventListener.Factory wrap(EventListener.Factory factory, EventListener eventListener) {
        Object[] objArr = {factory, eventListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7d33b2a3dddb10cd46cc2f97b92e9547", RobustBitConfig.DEFAULT_VALUE)) {
            return (EventListener.Factory) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7d33b2a3dddb10cd46cc2f97b92e9547");
        }
        FactoryDispatcher factory2 = getFactory(factory);
        factory2.setEventListener(eventListener);
        return factory2;
    }

    public static EventListener.Factory wrap(EventListener.Factory factory, EventListener.Factory factory2) {
        Object[] objArr = {factory, factory2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "475a31a500fa3bbfaa872e7d02694d69", RobustBitConfig.DEFAULT_VALUE)) {
            return (EventListener.Factory) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "475a31a500fa3bbfaa872e7d02694d69");
        }
        FactoryDispatcher factory3 = getFactory(factory);
        factory3.setFactory(factory2);
        return factory3;
    }

    private static FactoryDispatcher getFactory(EventListener.Factory factory) {
        Object[] objArr = {factory};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "41143f404d6053b5bdb9e1cac81db12c", RobustBitConfig.DEFAULT_VALUE)) {
            return (FactoryDispatcher) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "41143f404d6053b5bdb9e1cac81db12c");
        }
        FactoryDispatcher factoryDispatcher = factory instanceof FactoryDispatcher ? (FactoryDispatcher) factory : null;
        return factoryDispatcher == null ? new FactoryDispatcher() : factoryDispatcher;
    }
}

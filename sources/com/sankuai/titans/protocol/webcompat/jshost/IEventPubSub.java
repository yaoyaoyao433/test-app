package com.sankuai.titans.protocol.webcompat.jshost;

import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface IEventPubSub {

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static abstract class AbstractEvent<T> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public abstract T getData();

        public abstract String getName();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface OnEventReceiveListener {
        <T> void onReceivedEvent(T t);
    }

    <T extends AbstractEvent> void publishEvent(T t);

    <T extends AbstractEvent> void registerEventListener(Class<T> cls, OnEventReceiveListener onEventReceiveListener);

    <T extends AbstractEvent> void unRegisterEventListener(Class<T> cls);

    <T extends AbstractEvent> void unRegisterEventListener(Class<T> cls, OnEventReceiveListener onEventReceiveListener);
}

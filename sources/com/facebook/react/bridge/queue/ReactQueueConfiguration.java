package com.facebook.react.bridge.queue;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public interface ReactQueueConfiguration {
    void destroy();

    MessageQueueThread getJSQueueThread();

    MessageQueueThread getNativeModulesQueueThread();

    MessageQueueThread getUIQueueThread();
}

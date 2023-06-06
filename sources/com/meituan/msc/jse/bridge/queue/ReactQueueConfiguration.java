package com.meituan.msc.jse.bridge.queue;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public interface ReactQueueConfiguration {
    void destroy();

    MessageQueueThread getJSQueueThread();

    MessageQueueThread getNativeModulesQueueThread();

    MessageQueueThread getUIQueueThread();
}

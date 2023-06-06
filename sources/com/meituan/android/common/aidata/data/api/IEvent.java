package com.meituan.android.common.aidata.data.api;

import com.meituan.robust.ChangeQuickRedirect;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class IEvent<E> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public static AtomicInteger id = new AtomicInteger(0);

    public IEvent() {
        id.incrementAndGet();
    }
}

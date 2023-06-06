package com.meituan.msi.dispather;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public interface IContainerEvent {

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface ContainerEventId {
    }

    void a(String str, Object obj);
}

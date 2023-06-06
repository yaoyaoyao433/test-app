package com.dianping.shield.feature;

import com.dianping.shield.entity.ExposeScope;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public interface ExposedInterface {
    long exposeDuration();

    ExposeScope getExposeScope();

    int maxExposeCount();

    void onExposed(int i);

    long stayDuration();
}

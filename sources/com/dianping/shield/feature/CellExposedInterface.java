package com.dianping.shield.feature;

import com.dianping.shield.entity.ExposeScope;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public interface CellExposedInterface {
    long exposeDuration(int i, int i2);

    ExposeScope getExposeScope(int i, int i2);

    int maxExposeCount(int i, int i2);

    void onExposed(int i, int i2, int i3);

    long stayDuration(int i, int i2);
}

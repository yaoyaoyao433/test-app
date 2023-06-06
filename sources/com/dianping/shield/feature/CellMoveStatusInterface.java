package com.dianping.shield.feature;

import com.dianping.shield.entity.ExposeScope;
import com.dianping.shield.entity.ScrollDirection;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public interface CellMoveStatusInterface {
    void onAppear(ExposeScope exposeScope, ScrollDirection scrollDirection, int i, int i2);

    void onDisappear(ExposeScope exposeScope, ScrollDirection scrollDirection, int i, int i2);
}

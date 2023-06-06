package com.dianping.shield.feature;

import com.dianping.shield.entity.ExposeScope;
import com.dianping.shield.entity.ScrollDirection;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public interface MoveStatusInterface {
    void onAppear(ExposeScope exposeScope, ScrollDirection scrollDirection);

    void onDisappear(ExposeScope exposeScope, ScrollDirection scrollDirection);
}

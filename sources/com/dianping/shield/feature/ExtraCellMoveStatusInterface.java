package com.dianping.shield.feature;

import com.dianping.shield.entity.CellType;
import com.dianping.shield.entity.ExposeScope;
import com.dianping.shield.entity.ScrollDirection;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public interface ExtraCellMoveStatusInterface {
    void onAppear(ExposeScope exposeScope, ScrollDirection scrollDirection, int i, CellType cellType);

    void onDisappear(ExposeScope exposeScope, ScrollDirection scrollDirection, int i, CellType cellType);
}

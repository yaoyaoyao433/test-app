package com.dianping.shield.feature;

import com.dianping.shield.entity.CellType;
import com.dianping.shield.entity.ScrollDirection;
import com.dianping.shield.entity.ScrollReachTopParams;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public interface ScrollReachTopNotifyInterface {
    ScrollReachTopParams getScrollToTopParams(int i, int i2, CellType cellType);

    void scrollOut(ScrollDirection scrollDirection, int i, int i2, CellType cellType);

    void scrollReach(ScrollDirection scrollDirection, int i, int i2, CellType cellType);
}

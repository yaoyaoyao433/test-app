package com.dianping.shield.feature;

import com.dianping.shield.entity.CellInfo;
import com.dianping.shield.entity.HotZoneYRange;
import com.dianping.shield.entity.ScrollDirection;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public interface HotZoneItemListener {
    HotZoneYRange defineHotZone();

    void scrollOut(CellInfo cellInfo, ScrollDirection scrollDirection);

    void scrollReach(CellInfo cellInfo, ScrollDirection scrollDirection);

    ArrayList<CellInfo> targetCells();
}

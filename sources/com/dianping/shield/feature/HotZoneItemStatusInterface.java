package com.dianping.shield.feature;

import com.dianping.shield.entity.CellInfo;
import com.dianping.shield.entity.HotZoneYRange;
import com.dianping.shield.entity.ScrollDirection;
import com.dianping.shield.node.adapter.hotzone.CellHotZoneInfo;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public interface HotZoneItemStatusInterface {
    HotZoneYRange defineHotZone();

    void onHotZoneLocationChanged(ArrayList<CellHotZoneInfo> arrayList, ScrollDirection scrollDirection);

    ArrayList<CellInfo> targetCells();
}

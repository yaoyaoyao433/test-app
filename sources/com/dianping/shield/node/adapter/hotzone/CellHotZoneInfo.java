package com.dianping.shield.node.adapter.hotzone;

import com.dianping.shield.entity.CellInfo;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class CellHotZoneInfo {
    public static ChangeQuickRedirect changeQuickRedirect;
    public CellInfo cellInfo;
    public HotZoneLocation hotZoneLocation;

    public CellHotZoneInfo(CellInfo cellInfo, HotZoneLocation hotZoneLocation) {
        this.cellInfo = cellInfo;
        this.hotZoneLocation = hotZoneLocation;
    }
}

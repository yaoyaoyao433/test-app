package com.dianping.shield.node.adapter.hotzone;

import com.dianping.shield.entity.ScrollDirection;
import com.dianping.shield.node.cellnode.ShieldDisplayNode;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public interface OnHotZoneStateChangeListener {
    void onHotZoneStateChanged(int i, int i2, int i3, ShieldDisplayNode shieldDisplayNode, HotZone hotZone, HotZoneLocation hotZoneLocation, HotZoneLocation hotZoneLocation2, ScrollDirection scrollDirection);
}

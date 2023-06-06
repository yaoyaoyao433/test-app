package com.dianping.shield.node.adapter.hotzone;

import com.dianping.shield.node.cellnode.ShieldDisplayNode;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class HotZoneInfo {
    public static ChangeQuickRedirect changeQuickRedirect;
    public HotZoneLocation hotZoneLocation;
    public ShieldDisplayNode shieldDisplayNode;

    public HotZoneInfo(ShieldDisplayNode shieldDisplayNode, HotZoneLocation hotZoneLocation) {
        this.shieldDisplayNode = shieldDisplayNode;
        this.hotZoneLocation = hotZoneLocation;
    }
}

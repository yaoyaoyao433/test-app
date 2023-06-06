package com.dianping.shield.node.adapter.hotzone;

import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class AgentHotZoneInfo {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String agentHostName;
    public HotZoneLocation hotZoneLocation;

    public AgentHotZoneInfo(String str, HotZoneLocation hotZoneLocation) {
        this.agentHostName = str;
        this.hotZoneLocation = hotZoneLocation;
    }
}

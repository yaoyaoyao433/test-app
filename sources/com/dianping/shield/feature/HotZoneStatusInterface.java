package com.dianping.shield.feature;

import com.dianping.shield.entity.HotZoneYRange;
import com.dianping.shield.entity.ScrollDirection;
import com.dianping.shield.node.adapter.hotzone.AgentHotZoneInfo;
import java.util.ArrayList;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public interface HotZoneStatusInterface {
    HotZoneYRange defineStatusHotZone();

    Set<String> observerAgents();

    void onHotZoneLocationChanged(ArrayList<AgentHotZoneInfo> arrayList, ScrollDirection scrollDirection);
}

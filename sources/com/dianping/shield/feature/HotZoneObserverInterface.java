package com.dianping.shield.feature;

import com.dianping.shield.entity.HotZoneYRange;
import com.dianping.shield.entity.ScrollDirection;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public interface HotZoneObserverInterface {
    HotZoneYRange defineHotZone();

    Set<String> observerAgents();

    void scrollOut(String str, ScrollDirection scrollDirection);

    void scrollReach(String str, ScrollDirection scrollDirection);
}

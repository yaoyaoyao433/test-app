package com.dianping.shield.node.adapter.hotzone;

import com.meituan.robust.ChangeQuickRedirect;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class HotZone {
    public static final int PARENT_BOTTOM = Integer.MAX_VALUE;
    public static final int PARENT_TOP = Integer.MIN_VALUE;
    public static ChangeQuickRedirect changeQuickRedirect;
    public int end;
    public ArrayList<OnHotZoneStateChangeListener> listenerArrayList;
    public int start;

    public HotZone() {
    }

    public HotZone(int i, int i2) {
        this.start = i;
        this.end = i2;
    }
}

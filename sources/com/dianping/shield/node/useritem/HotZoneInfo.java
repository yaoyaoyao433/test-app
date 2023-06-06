package com.dianping.shield.node.useritem;

import com.dianping.shield.node.itemcallbacks.HotZoneStateChangeCallBack;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class HotZoneInfo {
    public static final int PARENT_BOTTOM = Integer.MAX_VALUE;
    public static final int PARENT_TOP = Integer.MIN_VALUE;
    public static ChangeQuickRedirect changeQuickRedirect;
    public ArrayList<HotZoneStateChangeCallBack> callBackList;
    public int end;
    public int start;
}

package com.dianping.titans.offline;

import com.dianping.titans.offline.entity.OfflineDebugItem;
import com.dianping.titans.offline.entity.OfflineGlobalDebugItem;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class OfflineDebugInfo {
    public static ChangeQuickRedirect changeQuickRedirect;
    public static final List<OfflineGlobalDebugItem> presetList = new ArrayList();
    public static final List<OfflineGlobalDebugItem> globalOfflineList = new ArrayList();
    public static final List<OfflineDebugItem> pageOfflineList = new ArrayList();
}

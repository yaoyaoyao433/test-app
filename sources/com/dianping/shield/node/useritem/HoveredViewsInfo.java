package com.dianping.shield.node.useritem;

import com.dianping.shield.node.cellnode.ShieldDisplayNode;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class HoveredViewsInfo {
    public static ChangeQuickRedirect changeQuickRedirect;
    public int maxTopViewY;
    public int minBottomViewY;
    public List<ViewInfo> topViewListInfo = new ArrayList();
    public List<ViewInfo> bottomViewListInfo = new ArrayList();
    public List<ShieldDisplayNode> nodeList = new ArrayList();

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class ViewInfo {
        public static ChangeQuickRedirect changeQuickRedirect;
        public int bottom;
        public int locationWindowBottom;
        public int locationWindowTop;
        public int top;
        public int zIndex;
    }
}

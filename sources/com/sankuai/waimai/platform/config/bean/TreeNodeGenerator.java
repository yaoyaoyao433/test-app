package com.sankuai.waimai.platform.config.bean;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class TreeNodeGenerator {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static AtomicInteger mSequenceGenerator = new AtomicInteger();

    public static TreeNode getTreeNode(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "45fa4954e7f937d1d3f77bcb64c15b49", RobustBitConfig.DEFAULT_VALUE) ? (TreeNode) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "45fa4954e7f937d1d3f77bcb64c15b49") : new TreeNode(str).setId(mSequenceGenerator.getAndIncrement());
    }
}

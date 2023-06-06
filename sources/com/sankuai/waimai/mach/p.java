package com.sankuai.waimai.mach;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class p implements b {
    public static ChangeQuickRedirect c;

    @Override // com.sankuai.waimai.mach.b
    public boolean b(String str, View view, com.sankuai.waimai.mach.node.a aVar) {
        Object[] objArr = {str, view, aVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d751265faca4a73c0988758f30fee74", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d751265faca4a73c0988758f30fee74")).booleanValue();
        }
        return false;
    }
}

package com.sankuai.waimai.store.mach.clickhandler;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class b implements com.sankuai.waimai.mach.b {
    public static ChangeQuickRedirect b;

    @Override // com.sankuai.waimai.mach.b
    public boolean a(String str, View view, com.sankuai.waimai.mach.node.a aVar) {
        Object[] objArr = {str, view, aVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "023f47165c310d27c8065d787b6ca991", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "023f47165c310d27c8065d787b6ca991")).booleanValue();
        }
        return false;
    }

    @Override // com.sankuai.waimai.mach.b
    public final boolean b(String str, View view, com.sankuai.waimai.mach.node.a aVar) {
        Object[] objArr = {str, view, aVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "531d83c7dcef1ba3fc5ee7dc93aefc72", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "531d83c7dcef1ba3fc5ee7dc93aefc72")).booleanValue();
        }
        return false;
    }
}

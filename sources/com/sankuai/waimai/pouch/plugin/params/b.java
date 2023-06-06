package com.sankuai.waimai.pouch.plugin.params;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.pouch.model.PouchDynamicAd;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class b {
    public static ChangeQuickRedirect a;
    public com.sankuai.waimai.pouch.a b;
    public com.sankuai.waimai.pouch.model.c c;
    public PouchDynamicAd d;

    public final String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3915865fdc53c559de0477726ad43ac8", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3915865fdc53c559de0477726ad43ac8") : this.c == null ? "" : this.c.a;
    }

    public final String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "89658fad4f1c495fb024c20f1fe67c35", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "89658fad4f1c495fb024c20f1fe67c35") : this.c == null ? "" : this.c.b;
    }
}

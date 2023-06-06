package com.sankuai.waimai.config;

import android.support.constraint.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d implements b {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.config.b
    public final String a() {
        return "538183952";
    }

    @Override // com.sankuai.waimai.config.b
    public final String b() {
        return "e7DHqN4tsOAfS9U9rPZv9pPVRbsMU7kO";
    }

    @Override // com.sankuai.waimai.config.c
    public final String f() {
        return "10320";
    }

    @Override // com.sankuai.waimai.config.b
    public final String c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "45a47806792174a9fb800946b00c7736", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "45a47806792174a9fb800946b00c7736") : com.meituan.android.singleton.b.a.getString(R.string.wm_maf_regeo_key);
    }

    @Override // com.sankuai.waimai.config.b
    public final String d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a1df74c0188c6ff39de883ab9980cdf", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a1df74c0188c6ff39de883ab9980cdf") : com.meituan.android.singleton.b.a.getString(R.string.mt_map_key);
    }

    @Override // com.sankuai.waimai.config.b
    public final int e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a29f7d400c7698c0b73dab5d12f91800", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a29f7d400c7698c0b73dab5d12f91800")).intValue() : com.meituan.android.singleton.b.a.getResources().getInteger(R.integer.wm_app_id);
    }
}

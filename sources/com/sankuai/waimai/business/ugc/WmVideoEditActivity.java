package com.sankuai.waimai.business.ugc;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.ugc.creator.ability.videofilter.d;
import com.sankuai.waimai.ugc.creator.framework.BaseActivity;
import com.sankuai.waimai.ugc.creator.framework.b;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class WmVideoEditActivity extends BaseActivity {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.ugc.creator.framework.BaseActivity
    public final b a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "adb386b5e9c41f6298e27490db343e6b", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "adb386b5e9c41f6298e27490db343e6b") : new d();
    }
}

package com.sankuai.meituan.riverrunplayer.engine;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtlive.core.a;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class RiverRunPlayerEngine extends a {
    public static ChangeQuickRedirect f;

    @Override // com.sankuai.meituan.mtlive.core.a, com.sankuai.meituan.mtlive.core.h, com.sankuai.meituan.mtlive.core.d
    public final synchronized boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d6a16209d77ee781eb442c98c4f871ae", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d6a16209d77ee781eb442c98c4f871ae")).booleanValue();
        }
        com.sankuai.meituan.riverrunplayer.util.a.a();
        return super.a();
    }

    @Override // com.sankuai.meituan.mtlive.core.a
    public final String[] c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "58aa05da3023021a058693c697f6e62e", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "58aa05da3023021a058693c697f6e62e") : new String[]{"ijkffmpeg", "xplayer"};
    }
}

package com.meituan.msc.modules.api.msi.navigation;

import com.meituan.msc.common.utils.k;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements k.a {
    public static ChangeQuickRedirect a;
    private static final a b = new a();

    public static k.a b() {
        return b;
    }

    @Override // com.meituan.msc.common.utils.k.a
    public final Class a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff8d246b11add28fc960f02fd0f2498d", RobustBitConfig.DEFAULT_VALUE) ? (Class) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff8d246b11add28fc960f02fd0f2498d") : MiniProgramApi.b();
    }
}

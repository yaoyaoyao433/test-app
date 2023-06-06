package com.meituan.android.legwork.ui.fragment;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class a implements com.sankuai.xm.base.callback.c {
    public static ChangeQuickRedirect a;
    private final IMSessionFragment b;

    public a(IMSessionFragment iMSessionFragment) {
        this.b = iMSessionFragment;
    }

    @Override // com.sankuai.xm.base.callback.c
    public final boolean a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b178d2491cdc44f996b599c1fa3e21da", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b178d2491cdc44f996b599c1fa3e21da")).booleanValue() : IMSessionFragment.a(this.b, (com.sankuai.xm.imui.session.event.a) obj);
    }
}

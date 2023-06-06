package com.sankuai.waimai.store.im.base;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.xm.imui.session.SessionFragment;
import com.sankuai.xm.imui.session.SessionProvider;
import com.sankuai.xm.imui.session.entity.SessionParams;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class f extends SessionProvider {
    public static ChangeQuickRedirect a;
    public SessionParams b;

    @Override // com.sankuai.xm.imui.session.SessionProvider
    public final SessionFragment createSessionFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "073d31fa3630f2969342ad24d453a3ab", RobustBitConfig.DEFAULT_VALUE) ? (SessionFragment) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "073d31fa3630f2969342ad24d453a3ab") : new SGIMSessionFragment();
    }
}

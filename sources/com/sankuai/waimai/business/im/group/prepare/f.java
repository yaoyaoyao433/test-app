package com.sankuai.waimai.business.im.group.prepare;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.im.group.chat.WmGroupChatFragment;
import com.sankuai.xm.imui.session.SessionFragment;
import com.sankuai.xm.imui.session.SessionProvider;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class f extends SessionProvider {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.xm.imui.session.SessionProvider
    public final SessionFragment createSessionFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd2661e31b0b9c54294f6c2fdd5f0770", RobustBitConfig.DEFAULT_VALUE) ? (SessionFragment) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd2661e31b0b9c54294f6c2fdd5f0770") : new WmGroupChatFragment();
    }
}

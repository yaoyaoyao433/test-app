package com.sankuai.waimai.business.im.group.prepare;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.im.group.chat.WMFoodSafetyGroupChatFragment;
import com.sankuai.xm.imui.session.SessionFragment;
import com.sankuai.xm.imui.session.SessionProvider;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d extends SessionProvider {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.xm.imui.session.SessionProvider
    public final SessionFragment createSessionFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d2ae511078561950cb39b83aa3f89f4c", RobustBitConfig.DEFAULT_VALUE) ? (SessionFragment) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d2ae511078561950cb39b83aa3f89f4c") : new WMFoodSafetyGroupChatFragment();
    }
}

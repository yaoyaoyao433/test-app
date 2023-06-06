package com.sankuai.waimai.business.im.group.chat;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.router.a;
import com.sankuai.waimai.foundation.router.interfaces.b;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class WmGroupChatFragment extends WmBaseGroupChatFragment {
    public static ChangeQuickRedirect m;

    @Override // com.sankuai.waimai.business.im.common.message.c
    public final void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f71f7755f8553c3d1cb4f87d47c4b32a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f71f7755f8553c3d1cb4f87d47c4b32a");
            return;
        }
        a.a(getActivity(), b.c + "/detail?spuid=" + j + "&wmpoiid=" + this.l.b + "&poi_id_str=" + this.l.c);
    }
}

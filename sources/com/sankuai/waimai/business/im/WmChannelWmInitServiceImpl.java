package com.sankuai.waimai.business.im;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.im.chatpage.BaseChatFragment;
import com.sankuai.waimai.business.im.poi.c;
import com.sankuai.xm.imui.session.entity.SessionParams;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class WmChannelWmInitServiceImpl implements IWmChannelInitService {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.waimai.business.im.IWmChannelInitService
    public com.sankuai.waimai.business.im.chatpage.a createPoiChatDelegate(BaseChatFragment baseChatFragment, SessionParams sessionParams) {
        Object[] objArr = {baseChatFragment, sessionParams};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f7a7b87bb55cac81b3bf5451b8ccea07", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.business.im.chatpage.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f7a7b87bb55cac81b3bf5451b8ccea07") : new c(baseChatFragment, sessionParams);
    }
}

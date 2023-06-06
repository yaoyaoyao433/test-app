package com.sankuai.waimai.store.im.poi;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.im.IWmChannelInitService;
import com.sankuai.waimai.business.im.chatpage.BaseChatFragment;
import com.sankuai.xm.imui.session.entity.SessionParams;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class WmChannelSGInitServiceImpl implements IWmChannelInitService {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.waimai.business.im.IWmChannelInitService
    public com.sankuai.waimai.business.im.chatpage.a createPoiChatDelegate(BaseChatFragment baseChatFragment, SessionParams sessionParams) {
        Object[] objArr = {baseChatFragment, sessionParams};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d0d2988df094a7af35a037030995e654", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.business.im.chatpage.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d0d2988df094a7af35a037030995e654") : new SGWMPoiChatDelegate(baseChatFragment, sessionParams);
    }
}

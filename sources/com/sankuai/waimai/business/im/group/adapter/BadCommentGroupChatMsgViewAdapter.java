package com.sankuai.waimai.business.im.group.adapter;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.im.common.adapter.IMAudioMsgAdapter;
import com.sankuai.waimai.business.im.common.adapter.IMCommonAdapter;
import com.sankuai.waimai.business.im.common.adapter.IMImageMsgAdapter;
import com.sankuai.waimai.business.im.common.contract.a;
import com.sankuai.waimai.business.im.common.message.IMMessageAdapter;
import com.sankuai.waimai.business.im.model.WMCommonDataInfo;
import com.sankuai.waimai.business.im.utils.d;
import com.sankuai.xm.im.message.bean.GeneralMessage;
import com.sankuai.xm.imui.session.entity.b;
import com.sankuai.xm.imui.session.view.adapter.ICommonAdapter;
import com.sankuai.xm.imui.session.view.adapter.IExtraAdapter;
import com.sankuai.xm.imui.session.view.adapter.impl.MsgViewAdapter;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class BadCommentGroupChatMsgViewAdapter extends MsgViewAdapter {
    public static ChangeQuickRedirect a;
    private WMCommonDataInfo b;
    private a c;

    public BadCommentGroupChatMsgViewAdapter(WMCommonDataInfo wMCommonDataInfo, a aVar) {
        Object[] objArr = {wMCommonDataInfo, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "67664e72f49c93a6bd6486c5c5b81dec", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "67664e72f49c93a6bd6486c5c5b81dec");
            return;
        }
        this.b = wMCommonDataInfo;
        this.c = aVar;
    }

    @Override // com.sankuai.xm.imui.session.view.adapter.impl.MsgViewAdapter, com.sankuai.xm.imui.session.view.adapter.IMsgViewAdapter
    public ICommonAdapter getCommonAdapter() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3395cea36c607c10fd2d769102ae599d", RobustBitConfig.DEFAULT_VALUE) ? (ICommonAdapter) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3395cea36c607c10fd2d769102ae599d") : new BadCommentGroupChatCommonAdapter(new IMCommonAdapter() { // from class: com.sankuai.waimai.business.im.group.adapter.BadCommentGroupChatMsgViewAdapter.1
            public static ChangeQuickRedirect b;

            @Override // com.sankuai.waimai.business.im.common.adapter.IMCommonAdapter, com.sankuai.xm.imui.session.view.adapter.impl.CommonAdapter, com.sankuai.xm.imui.session.view.adapter.ICommonStyleAdapter
            public int getStyle(b bVar) {
                Object[] objArr2 = {bVar};
                ChangeQuickRedirect changeQuickRedirect2 = b;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e06ad72e133d15465e72225e68a95da7", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e06ad72e133d15465e72225e68a95da7")).intValue();
                }
                M m = bVar.b;
                if (m instanceof GeneralMessage) {
                    GeneralMessage generalMessage = (GeneralMessage) m;
                    int a2 = IMMessageAdapter.a(generalMessage);
                    if (generalMessage.getData() != null && a2 == 401) {
                        return 1;
                    }
                }
                return super.getStyle(bVar);
            }
        });
    }

    @Override // com.sankuai.xm.imui.session.view.adapter.impl.MsgViewAdapter, com.sankuai.xm.imui.session.view.adapter.IMsgViewAdapter
    public IExtraAdapter getExtraAdapter(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ddb4e8b8c5ce9a91c1bef5293316c3f2", RobustBitConfig.DEFAULT_VALUE)) {
            return (IExtraAdapter) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ddb4e8b8c5ce9a91c1bef5293316c3f2");
        }
        if (i == 16) {
            return new IMMessageAdapter(this.b, this.c, d.a);
        }
        if (i == 1) {
            return new IMAudioMsgAdapter();
        }
        if (i == 3) {
            return new IMImageMsgAdapter();
        }
        return super.getExtraAdapter(i);
    }
}

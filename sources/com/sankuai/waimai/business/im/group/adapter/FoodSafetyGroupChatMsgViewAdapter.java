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
import com.sankuai.xm.imui.session.view.adapter.ICommonAdapter;
import com.sankuai.xm.imui.session.view.adapter.IExtraAdapter;
import com.sankuai.xm.imui.session.view.adapter.impl.MsgViewAdapter;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class FoodSafetyGroupChatMsgViewAdapter extends MsgViewAdapter {
    public static ChangeQuickRedirect a;
    private WMCommonDataInfo b;
    private a c;

    public FoodSafetyGroupChatMsgViewAdapter(WMCommonDataInfo wMCommonDataInfo, a aVar) {
        Object[] objArr = {wMCommonDataInfo, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ccd4d06803b460e1fcdb9012a157806", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ccd4d06803b460e1fcdb9012a157806");
            return;
        }
        this.b = wMCommonDataInfo;
        this.c = aVar;
    }

    @Override // com.sankuai.xm.imui.session.view.adapter.impl.MsgViewAdapter, com.sankuai.xm.imui.session.view.adapter.IMsgViewAdapter
    public ICommonAdapter getCommonAdapter() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7819632c6236cfc140e777d9b1cc9d43", RobustBitConfig.DEFAULT_VALUE) ? (ICommonAdapter) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7819632c6236cfc140e777d9b1cc9d43") : new FoodSafetyGroupChatCommonAdapter(new IMCommonAdapter());
    }

    @Override // com.sankuai.xm.imui.session.view.adapter.impl.MsgViewAdapter, com.sankuai.xm.imui.session.view.adapter.IMsgViewAdapter
    public IExtraAdapter getExtraAdapter(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "afef667930dd4c7d9edb917d411b1bc2", RobustBitConfig.DEFAULT_VALUE)) {
            return (IExtraAdapter) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "afef667930dd4c7d9edb917d411b1bc2");
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

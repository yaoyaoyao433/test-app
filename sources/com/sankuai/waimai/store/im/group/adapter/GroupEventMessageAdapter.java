package com.sankuai.waimai.store.im.group.adapter;

import com.meituan.android.ptcommonim.message.recall.manager.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.store.im.group.model.GroupEventExtensionInfo;
import com.sankuai.waimai.store.util.i;
import com.sankuai.xm.im.IMClient;
import com.sankuai.xm.im.message.bean.EventMessage;
import com.sankuai.xm.imui.session.entity.b;
import com.sankuai.xm.imui.session.view.adapter.impl.EventMsgAdapter;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class GroupEventMessageAdapter extends EventMsgAdapter {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.xm.imui.session.view.adapter.impl.EventMsgAdapter, com.sankuai.xm.imui.session.view.adapter.IEventMsgAdapter
    public String getShowText(b<EventMessage> bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "05d0cb21f9949d7688dfb6b251f01806", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "05d0cb21f9949d7688dfb6b251f01806");
        }
        if (bVar != null && (bVar.b instanceof EventMessage)) {
            GroupEventExtensionInfo groupEventExtensionInfo = (GroupEventExtensionInfo) i.a(bVar.b.getExtension(), GroupEventExtensionInfo.class);
            if (bVar.b.getFromUid() == IMClient.a().k()) {
                if (groupEventExtensionInfo != null && !t.a(groupEventExtensionInfo.riskNoticeToSender)) {
                    return groupEventExtensionInfo.riskNoticeToSender;
                }
            } else if (groupEventExtensionInfo != null && !t.a(groupEventExtensionInfo.riskNoticeToReceiver)) {
                return groupEventExtensionInfo.riskNoticeToReceiver;
            }
        }
        if (com.meituan.android.ptcommonim.base.manager.b.a().c()) {
            String a2 = a.a(this.e, bVar);
            if (!t.a(a2)) {
                return a2;
            }
        }
        return super.getShowText(bVar);
    }
}

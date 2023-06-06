package com.sankuai.xm.imui.session.view.adapter.impl;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.im.message.bean.EventMessage;
import com.sankuai.xm.imui.session.entity.b;
import com.sankuai.xm.imui.session.view.adapter.IEventMsgAdapter;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class EventMsgAdapter extends BaseMsgAdapter implements IEventMsgAdapter {
    public static ChangeQuickRedirect c;

    public String getShowText(b<EventMessage> bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dcafa1ef2728cd29e1b9e898bd7e513b", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dcafa1ef2728cd29e1b9e898bd7e513b") : (bVar == null || bVar.b == null) ? "" : bVar.b.getText();
    }
}

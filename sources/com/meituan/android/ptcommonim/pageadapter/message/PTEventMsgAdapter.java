package com.meituan.android.ptcommonim.pageadapter.message;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.xm.im.message.bean.EventMessage;
import com.sankuai.xm.imui.session.entity.b;
import com.sankuai.xm.imui.session.view.adapter.impl.EventMsgAdapter;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class PTEventMsgAdapter extends EventMsgAdapter {
    public static ChangeQuickRedirect a;
    public String b;

    @Override // com.sankuai.xm.imui.session.view.adapter.impl.EventMsgAdapter, com.sankuai.xm.imui.session.view.adapter.IEventMsgAdapter
    public String getShowText(b<EventMessage> bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd695dae274765fe4c09b945b4f37448", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd695dae274765fe4c09b945b4f37448");
        }
        if (bVar != null && bVar.a() != null && "event_type_lining".equalsIgnoreCase(bVar.a().getType())) {
            return this.b;
        }
        return super.getShowText(bVar);
    }
}

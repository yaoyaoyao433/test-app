package com.sankuai.waimai.store.im.poi;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.xm.im.message.bean.EventMessage;
import com.sankuai.xm.imui.session.entity.b;
import com.sankuai.xm.imui.session.view.adapter.impl.EventMsgAdapter;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SGIMEventMessageAdapter extends EventMsgAdapter {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.xm.imui.session.view.adapter.impl.EventMsgAdapter, com.sankuai.xm.imui.session.view.adapter.IEventMsgAdapter
    public String getShowText(b<EventMessage> bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3dea77abe844585874a649161892142e", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3dea77abe844585874a649161892142e");
        }
        if (com.meituan.android.ptcommonim.base.manager.b.a().c()) {
            String a2 = com.meituan.android.ptcommonim.message.recall.manager.a.a(this.e, bVar);
            return !t.a(a2) ? a2 : super.getShowText(bVar);
        }
        return super.getShowText(bVar);
    }
}

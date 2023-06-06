package com.sankuai.xm.imui.session.view.adapter.impl;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.im.message.bean.MultiLinkMessage;
import com.sankuai.xm.imui.common.util.l;
import com.sankuai.xm.imui.session.entity.b;
import com.sankuai.xm.imui.session.view.adapter.IMultiLinkMsgAdapter;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class MultiLinkMsgAdapter extends BaseMsgAdapter implements IMultiLinkMsgAdapter {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.xm.imui.session.view.adapter.IMultiLinkMsgAdapter
    public int getOtherLinksDescriptionLine() {
        return -1;
    }

    @Override // com.sankuai.xm.imui.session.view.adapter.IMultiLinkMsgAdapter
    public boolean onArticleItemLongClick(View view, b<MultiLinkMessage> bVar, String str, String str2) {
        return false;
    }

    @Override // com.sankuai.xm.imui.session.view.adapter.IMultiLinkMsgAdapter
    public void onArticleItemClick(View view, b<MultiLinkMessage> bVar, String str, String str2) {
        Object[] objArr = {view, bVar, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b4b093862c550d40d12c1e9c6a11c518", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b4b093862c550d40d12c1e9c6a11c518");
        } else {
            l.a(view.getContext(), str);
        }
    }
}

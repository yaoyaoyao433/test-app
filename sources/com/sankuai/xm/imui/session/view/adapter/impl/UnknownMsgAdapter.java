package com.sankuai.xm.imui.session.view.adapter.impl;

import android.support.constraint.R;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.im.message.bean.UNKnownMessage;
import com.sankuai.xm.imui.session.entity.b;
import com.sankuai.xm.imui.session.view.adapter.IUnknownMsgAdapter;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class UnknownMsgAdapter extends BaseMsgAdapter implements IUnknownMsgAdapter {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.xm.imui.session.view.adapter.IUnknownMsgAdapter
    public String getTipMsg(b<UNKnownMessage> bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd50c16e93dbfa54fc3394b715bc951d", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd50c16e93dbfa54fc3394b715bc951d");
        }
        String compatibleContent = bVar.b.getCompatibleContent();
        return !TextUtils.isEmpty(compatibleContent) ? compatibleContent : this.e.getString(R.string.xm_sdk_msg_unknown_tips);
    }
}

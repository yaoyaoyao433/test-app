package com.sankuai.xm.imui.common.view.message;

import android.content.Context;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.imui.common.util.l;
import com.sankuai.xm.imui.session.entity.b;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class DefaultBottomMsgSideView extends AbstractMsgSideView {
    public static ChangeQuickRedirect a;
    private TextView b;

    public DefaultBottomMsgSideView(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "97d14fa2f6828ccb05198687804d3495", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "97d14fa2f6828ccb05198687804d3495");
        }
    }

    public DefaultBottomMsgSideView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "222d3df62c1a71dd2be1fcbbefc2230a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "222d3df62c1a71dd2be1fcbbefc2230a");
        }
    }

    public DefaultBottomMsgSideView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7b4106cd1200fb76d4d490b7a3d1db8e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7b4106cd1200fb76d4d490b7a3d1db8e");
            return;
        }
        inflate(context, R.layout.xm_sdk_chat_msg_status_below, this);
        this.b = (TextView) findViewById(R.id.xm_sdk_chat_message_fail_tip_text);
    }

    @Override // com.sankuai.xm.imui.common.view.message.AbstractMsgSideView, com.sankuai.xm.imui.common.view.message.a
    public final void d(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e5d4d238ba6bb2ffca99254ac1316067", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e5d4d238ba6bb2ffca99254ac1316067");
        } else if (bVar == null || bVar.b == 0) {
        } else {
            if (bVar.b.getMsgStatus() == 1000) {
                l.a(0, this, this.b);
            } else {
                l.a(8, this);
            }
        }
    }
}

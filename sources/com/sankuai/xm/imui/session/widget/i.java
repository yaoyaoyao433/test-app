package com.sankuai.xm.imui.session.widget;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.im.session.SessionId;
import com.sankuai.xm.im.utils.MessageUtils;
import com.sankuai.xm.imui.common.widget.ListViewWidgetPanel;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class i extends com.sankuai.xm.imui.common.widget.a<com.sankuai.xm.imui.session.entity.b> {
    public static ChangeQuickRedirect c;
    private com.sankuai.xm.imui.controller.opposite.b i;

    @Override // com.sankuai.xm.imui.common.widget.b
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd22d13f72e11f8c0f727c2798958a7c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd22d13f72e11f8c0f727c2798958a7c");
        } else {
            this.i = null;
        }
    }

    @Override // com.sankuai.xm.imui.common.widget.b
    public final void b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b49a302703666e449f7ede3db3381bf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b49a302703666e449f7ede3db3381bf");
            return;
        }
        super.b(context);
        SessionId f = com.sankuai.xm.imui.b.a().f();
        if (MessageUtils.isIMPeerService(f.e)) {
            this.i = new com.sankuai.xm.imui.controller.opposite.c();
        } else if (MessageUtils.isPubService(f.e)) {
            this.i = new com.sankuai.xm.imui.controller.opposite.d();
        } else if (f.e == 2) {
            this.i = new com.sankuai.xm.imui.controller.opposite.a();
        } else {
            com.sankuai.xm.imui.common.util.d.d("MsgStatusWidget::onCreate error", new Object[0]);
        }
        if (this.i != null) {
            this.i.a((ListViewWidgetPanel.a) this.h);
        }
    }

    @Override // com.sankuai.xm.imui.common.widget.b
    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b31dbc013ff47a57eeab06e64adf02e1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b31dbc013ff47a57eeab06e64adf02e1");
            return;
        }
        if (this.i != null) {
            this.i.a();
        }
        super.f();
    }

    @Override // com.sankuai.xm.imui.common.widget.a
    public final void a(ListViewWidgetPanel.b<com.sankuai.xm.imui.session.entity.b> bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "16dee9265f6ee380c4205054159e4086", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "16dee9265f6ee380c4205054159e4086");
            return;
        }
        super.a(bVar);
        if (this.i != null) {
            this.i.a(bVar);
        }
    }
}

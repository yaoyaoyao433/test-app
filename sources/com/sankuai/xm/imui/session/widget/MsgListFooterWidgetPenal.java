package com.sankuai.xm.imui.session.widget;

import android.content.Context;
import android.util.AttributeSet;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.imui.common.widget.ListViewWidgetPanel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class MsgListFooterWidgetPenal extends ListViewWidgetPanel<com.sankuai.xm.imui.session.entity.b> {
    public static ChangeQuickRedirect f;

    public MsgListFooterWidgetPenal(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e0bf8684bf43a74ed71c5e8c1b95298b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e0bf8684bf43a74ed71c5e8c1b95298b");
        }
    }

    public MsgListFooterWidgetPenal(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c5d10d7389977cda2d91f242bc1e0846", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c5d10d7389977cda2d91f242bc1e0846");
        }
    }

    public MsgListFooterWidgetPenal(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d15669a425a65363c40f04b3941858a0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d15669a425a65363c40f04b3941858a0");
        }
    }

    public final void a(ListViewWidgetPanel.a<com.sankuai.xm.imui.session.entity.b> aVar) {
        int a;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f66b69f94e827d0bed58666bd9c04f3a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f66b69f94e827d0bed58666bd9c04f3a");
            return;
        }
        com.sankuai.xm.imui.session.b b = com.sankuai.xm.imui.session.b.b(getContext());
        List list = null;
        for (com.sankuai.xm.imui.common.widget.b bVar : b.d()) {
            if ((bVar instanceof d) && ((a = ((d) bVar).a()) == 2 || a == 3)) {
                if (list == null) {
                    list = new ArrayList(2);
                }
                list.add(bVar);
            }
        }
        if (b.c.b().length > 0 && com.sankuai.xm.base.util.b.a((Collection<?>) list)) {
            list = com.sankuai.xm.base.util.b.a(new f());
        }
        if (com.sankuai.xm.base.util.b.a((Collection<?>) list)) {
            return;
        }
        super.a(aVar, list);
    }
}

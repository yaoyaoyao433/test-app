package com.sankuai.xm.imui.session.widget;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.service.n;
import com.sankuai.xm.im.IMClient;
import com.sankuai.xm.imui.IMUIManager;
import com.sankuai.xm.imui.common.adapter.IBannerAdapter;
import com.sankuai.xm.imui.common.widget.ListViewWidgetPanel;
import com.sankuai.xm.imui.session.entity.SessionParams;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class g extends ListViewWidgetPanel<com.sankuai.xm.imui.session.entity.b> {
    public static ChangeQuickRedirect f;
    private int g;

    public g(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc9f8c0142b99302dd2e61e73e7901b0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc9f8c0142b99302dd2e61e73e7901b0");
        } else {
            this.g = 30;
        }
    }

    public final void a(ListViewWidgetPanel.a<com.sankuai.xm.imui.session.entity.b> aVar, com.sankuai.xm.imui.session.a aVar2) {
        Object[] objArr = {aVar, aVar2};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "63024ee685762353b9eec8e820c36d60", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "63024ee685762353b9eec8e820c36d60");
            return;
        }
        com.sankuai.xm.imui.session.b b = com.sankuai.xm.imui.session.b.b(getContext());
        SessionParams sessionParams = b.c;
        ArrayList arrayList = new ArrayList();
        if (aVar2.C_() != null && aVar2.C_().isShowUnreadMessageNotification()) {
            int i = sessionParams == null ? 4 : sessionParams.k;
            if ((i & 2) == 2) {
                c cVar = new c();
                cVar.b = this.g;
                arrayList.add(cVar);
            }
            if ((i & 1) == 1) {
                k kVar = new k();
                kVar.b = this.g;
                arrayList.add(kVar);
            }
            if ((i & 4) == 4) {
                com.sankuai.xm.imui.session.widget.a aVar3 = new com.sankuai.xm.imui.session.widget.a();
                aVar3.b = this.g;
                arrayList.add(aVar3);
            }
        }
        if (IMUIManager.f()) {
            arrayList.add(new i());
        }
        try {
            if (((com.sankuai.xm.im.message.api.a) IMClient.a().a(com.sankuai.xm.im.message.api.a.class)).a(b.c(), b.b(), -1)) {
                arrayList.add(new e());
            }
        } catch (n | NullPointerException e) {
            com.sankuai.xm.imui.common.util.d.b("MsgListWidgetPenal", "onAttach", e.toString(), new Object[0]);
        }
        IBannerAdapter b2 = aVar2.b();
        if (b2 != null && b2.isOverlay()) {
            b bVar = new b();
            bVar.i = b2;
            arrayList.add(bVar);
        }
        for (com.sankuai.xm.imui.common.widget.b bVar2 : b.d()) {
            if ((bVar2 instanceof d) && ((d) bVar2).a() == 0) {
                arrayList.add(bVar2);
            }
        }
        super.a(aVar, arrayList);
    }

    public final void setPullSize(int i) {
        this.g = i;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public class a extends ListViewWidgetPanel.b<com.sankuai.xm.imui.session.entity.b> {
        public static ChangeQuickRedirect e;

        public a(g gVar, int i) {
            this(i, null);
            Object[] objArr = {gVar, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = e;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f66289005d5227e1d0511db0e4727b0a", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f66289005d5227e1d0511db0e4727b0a");
            }
        }

        private a(int i, List<com.sankuai.xm.imui.session.entity.b> list) {
            super(i);
            Object[] objArr = {g.this, Integer.valueOf(i), null};
            ChangeQuickRedirect changeQuickRedirect = e;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a09175f5e2c07d6ef0f1ac75c72f603b", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a09175f5e2c07d6ef0f1ac75c72f603b");
            } else {
                a(null);
            }
        }

        @Override // com.sankuai.xm.imui.common.widget.ListViewWidgetPanel.b
        /* renamed from: b */
        public final a a(List<com.sankuai.xm.imui.session.entity.b> list) {
            Object[] objArr = {list};
            ChangeQuickRedirect changeQuickRedirect = e;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d83d03f7a764b8fd30ad7d12b31449ea", 6917529027641081856L)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d83d03f7a764b8fd30ad7d12b31449ea");
            }
            super.a(list);
            return this;
        }
    }
}

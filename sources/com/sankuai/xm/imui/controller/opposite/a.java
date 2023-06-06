package com.sankuai.xm.imui.controller.opposite;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.im.IMClient;
import com.sankuai.xm.im.message.opposite.GroupOppositeController;
import com.sankuai.xm.im.session.SessionId;
import com.sankuai.xm.imui.IMUIManager;
import com.sankuai.xm.imui.common.widget.ListViewWidgetPanel;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class a extends b implements GroupOppositeController.OnGroupOppositeChangeListener {
    public static ChangeQuickRedirect a;
    private SessionId d;
    private long e;

    @Override // com.sankuai.xm.imui.controller.opposite.b
    public final void a(ListViewWidgetPanel.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e8a238e11403e180622b3a04d1850a15", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e8a238e11403e180622b3a04d1850a15");
            return;
        }
        com.sankuai.xm.imui.common.util.d.b("%s::init", "UIGroupOppositeController");
        super.a(aVar);
        this.d = com.sankuai.xm.imui.b.a().f();
        this.e = IMUIManager.a().e();
        IMClient.a().a(this.d.g, this);
    }

    @Override // com.sankuai.xm.imui.controller.opposite.b
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d9e184fdc615272c9702e64de63b8ecb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d9e184fdc615272c9702e64de63b8ecb");
            return;
        }
        com.sankuai.xm.imui.common.util.d.b("%s::release", "UIGroupOppositeController");
        super.a();
        IMClient.a().b(this.d.g, this);
    }

    @Override // com.sankuai.xm.im.message.opposite.GroupOppositeController.OnGroupOppositeChangeListener
    public final void onReceiveOppositeInfo(List<GroupOppositeController.a> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d990b210fba89dde31b759cd15841a7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d990b210fba89dde31b759cd15841a7");
        } else if (list != null) {
            ArrayList arrayList = new ArrayList();
            com.sankuai.xm.imui.common.util.d.b("%s::onReceiveOppositeInfo size:%d", "UIGroupOppositeController", Integer.valueOf(list.size()));
            for (GroupOppositeController.a aVar : list) {
                com.sankuai.xm.imui.common.util.d.b("%s::onReceiveOppositeInfo info:%s", "UIGroupOppositeController", aVar);
                com.sankuai.xm.imui.session.entity.b a2 = a(aVar.b);
                if (a2 == null) {
                    com.sankuai.xm.imui.common.util.d.b("%s::onReceiveOppositeInfo not found msg", "UIGroupOppositeController");
                } else {
                    a2.j = aVar.c;
                    a2.k = aVar.d;
                    a2.l = aVar.e;
                    arrayList.add(a2);
                }
            }
            a(arrayList);
        }
    }

    @Override // com.sankuai.xm.im.message.opposite.GroupOppositeController.OnGroupOppositeChangeListener
    public final void onSendOppositeRes(int i, List<Long> list) {
        Object[] objArr = {Integer.valueOf(i), list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca35f42fbebf782e26d2a3bd08b1d09f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca35f42fbebf782e26d2a3bd08b1d09f");
        } else if (list != null) {
            com.sankuai.xm.imui.common.util.d.b("%s::onSendOppositeRes size:%d status:%d", "UIGroupOppositeController", Integer.valueOf(list.size()), Integer.valueOf(i));
            ArrayList arrayList = new ArrayList();
            for (Long l : list) {
                com.sankuai.xm.imui.common.util.d.b("%s::onSendOppositeRes info:%d", "UIGroupOppositeController", l);
                com.sankuai.xm.imui.session.entity.b a2 = a(l.longValue());
                if (a2 == null) {
                    com.sankuai.xm.imui.common.util.d.b("%s::onSendOppositeRes not found msg", "UIGroupOppositeController");
                } else {
                    a2.j = i;
                    arrayList.add(a2);
                }
            }
            a(arrayList);
        }
    }

    @Override // com.sankuai.xm.im.message.opposite.GroupOppositeController.OnGroupOppositeChangeListener
    public final void onOppositeConfigChanged() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "97f98184e991d1ca24ac2fe6d3d48d3c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "97f98184e991d1ca24ac2fe6d3d48d3c");
            return;
        }
        com.sankuai.xm.imui.common.util.d.b("%s::onOppositeConfigChanged", "UIGroupOppositeController");
        b();
    }

    @Override // com.sankuai.xm.imui.controller.opposite.b
    public final void a(ListViewWidgetPanel.b<com.sankuai.xm.imui.session.entity.b> bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6835a48812f114257a327e0c1eff6568", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6835a48812f114257a327e0c1eff6568");
            return;
        }
        super.a(bVar);
        int i = bVar.d;
        if (i != 1) {
            switch (i) {
                case 4:
                    b(bVar.b, String.valueOf(bVar.d));
                    return;
                case 5:
                    if (this.c == null || this.c.a() == null) {
                        return;
                    }
                    a(c(), String.valueOf(bVar.d));
                    return;
                default:
                    return;
            }
        } else if (this.c == null || !this.c.a().isShown()) {
        } else {
            a(c(), String.valueOf(bVar.d));
        }
    }

    @Override // com.sankuai.xm.imui.controller.opposite.b, com.sankuai.xm.im.IMClient.d
    public final void a(long j, String str, String str2, String str3) {
        Object[] objArr = {new Long(j), str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6719abb2f1d2436a414fb437c3d5284e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6719abb2f1d2436a414fb437c3d5284e");
            return;
        }
        com.sankuai.xm.imui.common.util.d.b("%s::onConnected uid:%d", "UIGroupOppositeController", Long.valueOf(j));
        super.a(j, str, str2, str3);
        if (this.e != j) {
            com.sankuai.xm.imui.common.util.d.d("%s::onConnected uid error current:%d authUid:%d", "UIGroupOppositeController", Long.valueOf(this.e), Long.valueOf(j));
            this.e = j;
        }
        b(this.c.b(), "onConnected");
    }

    private void a(List<com.sankuai.xm.imui.session.entity.b> list, String str) {
        Object[] objArr = {list, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "111b5c9a2ebe9f5bc826ed7a0a059689", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "111b5c9a2ebe9f5bc826ed7a0a059689");
        } else if (!com.sankuai.xm.base.util.b.a(list)) {
            ArrayList arrayList = new ArrayList();
            for (com.sankuai.xm.imui.session.entity.b bVar : list) {
                M m = bVar.b;
                if (m != 0 && m.getFromUid() != this.e && m.getMsgId() != 0 && m.getMsgType() != 12 && m.getMsgType() != 14 && bVar.j == 0) {
                    arrayList.add(m);
                }
            }
            if (arrayList.size() > 0) {
                com.sankuai.xm.imui.common.util.d.b("%s::sendOpposite reason:%s size:%d info:%s", "UIGroupOppositeController", str, Integer.valueOf(arrayList.size()), arrayList);
                IMClient.a().c(this.d, arrayList);
            }
        }
    }

    private void b(List<com.sankuai.xm.imui.session.entity.b> list, String str) {
        Object[] objArr = {list, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9731b3323c4dcd4b5f7ebec893e35b7a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9731b3323c4dcd4b5f7ebec893e35b7a");
        } else if (!com.sankuai.xm.base.util.b.a(list)) {
            ArrayList arrayList = new ArrayList();
            for (com.sankuai.xm.imui.session.entity.b bVar : list) {
                M m = bVar.b;
                if (m != 0 && m.getFromUid() == this.e && m.getMsgId() != 0 && m.getMsgType() != 12 && m.getMsgType() != 14 && bVar.j != 1) {
                    arrayList.add(m);
                }
            }
            if (arrayList.size() > 0) {
                com.sankuai.xm.imui.common.util.d.b("%s::queryOpposite reason:%s size:%d info:%s", "UIGroupOppositeController", str, Integer.valueOf(arrayList.size()), arrayList);
                IMClient.a().b(this.d, arrayList);
            }
        }
    }

    private com.sankuai.xm.imui.session.entity.b a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1671fc69037526e55e80f8880d316717", 6917529027641081856L)) {
            return (com.sankuai.xm.imui.session.entity.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1671fc69037526e55e80f8880d316717");
        }
        List<com.sankuai.xm.imui.session.entity.b> b = this.c.b();
        if (b == null) {
            return null;
        }
        for (com.sankuai.xm.imui.session.entity.b bVar : b) {
            if (bVar.b.getMsgId() != 0 && bVar.b.getMsgId() == j) {
                return bVar;
            }
        }
        return null;
    }
}

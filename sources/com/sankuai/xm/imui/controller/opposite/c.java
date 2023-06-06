package com.sankuai.xm.imui.controller.opposite;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.util.b;
import com.sankuai.xm.im.IMClient;
import com.sankuai.xm.im.message.opposite.OppositeController;
import com.sankuai.xm.im.session.SessionId;
import com.sankuai.xm.imui.IMUIManager;
import com.sankuai.xm.imui.common.widget.ListViewWidgetPanel;
import com.sankuai.xm.imui.session.view.BaseCommonView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class c extends b implements OppositeController.OnOppositeChangeListener {
    public static ChangeQuickRedirect a;
    private Set<Long> d;
    private Set<Long> e;
    private SessionId f;
    private long g;

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "17ccc9aba46b743b56d1eb02ad3d6f80", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "17ccc9aba46b743b56d1eb02ad3d6f80");
            return;
        }
        this.d = new HashSet();
        this.e = new HashSet();
    }

    @Override // com.sankuai.xm.imui.controller.opposite.b
    public final void a(ListViewWidgetPanel.a<com.sankuai.xm.imui.session.entity.b> aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d10993865547d3d7093bee9885d6fb3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d10993865547d3d7093bee9885d6fb3");
            return;
        }
        super.a(aVar);
        this.f = com.sankuai.xm.imui.b.a().f();
        this.g = IMUIManager.a().e();
        IMClient.a().a(this.f.g, this);
    }

    @Override // com.sankuai.xm.imui.controller.opposite.b
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d74bd6428c4422ee49700e6adc9e8196", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d74bd6428c4422ee49700e6adc9e8196");
            return;
        }
        super.a();
        IMClient.a().b(this.f.g, this);
    }

    @Override // com.sankuai.xm.im.message.opposite.OppositeController.OnOppositeChangeListener
    public final void onOppositeConfigChanged() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4ec04ca713a88abe5f8f42f0e95f7fea", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4ec04ca713a88abe5f8f42f0e95f7fea");
        } else {
            b();
        }
    }

    @Override // com.sankuai.xm.imui.controller.opposite.b
    public final void a(ListViewWidgetPanel.b<com.sankuai.xm.imui.session.entity.b> bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "53c6184e9b2aef82a22bf58945adc7c9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "53c6184e9b2aef82a22bf58945adc7c9");
            return;
        }
        super.a(bVar);
        int i = bVar.d;
        if (i == 1) {
            final ArrayList arrayList = new ArrayList();
            final ArrayList arrayList2 = new ArrayList();
            a(new b.a<BaseCommonView>() { // from class: com.sankuai.xm.imui.controller.opposite.c.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.xm.base.util.b.a
                public final /* synthetic */ boolean a(BaseCommonView baseCommonView) {
                    BaseCommonView baseCommonView2 = baseCommonView;
                    Object[] objArr2 = {baseCommonView2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "46282078cd05a45674d5479c27c03c5d", 6917529027641081856L)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "46282078cd05a45674d5479c27c03c5d")).booleanValue();
                    }
                    com.sankuai.xm.imui.session.entity.b message = baseCommonView2.getMessage();
                    if (message != null && message.b != 0 && message.b.getMsgId() != 0 && message.i > 0) {
                        if (message.b.getFromUid() == c.this.g) {
                            arrayList.add(Long.valueOf(message.b.getMsgId()));
                        } else {
                            arrayList2.add(Long.valueOf(message.b.getMsgId()));
                        }
                    }
                    return false;
                }
            });
            if (arrayList2.size() > 0) {
                com.sankuai.xm.imui.common.util.d.b("%s onEvent SCROLL:start to sendOpposite unreadRecvMsgIds.size = %d", "UIPersonOppositeController", Integer.valueOf(arrayList2.size()));
                IMClient.a().a(this.f, arrayList2);
            }
            this.d.addAll(arrayList);
        } else if (i != 4) {
        } else {
            final ArrayList arrayList3 = new ArrayList();
            final ArrayList arrayList4 = new ArrayList();
            com.sankuai.xm.base.util.b.a(bVar.b, new b.a<com.sankuai.xm.imui.session.entity.b>() { // from class: com.sankuai.xm.imui.controller.opposite.c.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.xm.base.util.b.a
                public final /* synthetic */ boolean a(com.sankuai.xm.imui.session.entity.b bVar2) {
                    com.sankuai.xm.imui.session.entity.b bVar3 = bVar2;
                    Object[] objArr2 = {bVar3};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6928aecbf4bb034ad1e510c5fe49ee6f", 6917529027641081856L)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6928aecbf4bb034ad1e510c5fe49ee6f")).booleanValue();
                    }
                    if (bVar3 != null && bVar3.b != 0 && bVar3.b.getMsgId() != 0 && bVar3.i > 0) {
                        if (bVar3.b.getFromUid() == c.this.g) {
                            arrayList3.add(Long.valueOf(bVar3.b.getMsgId()));
                        } else {
                            arrayList4.add(Long.valueOf(bVar3.b.getMsgId()));
                        }
                    }
                    return false;
                }
            });
            if (com.sankuai.xm.base.util.b.a((Collection<?>) arrayList3) && com.sankuai.xm.base.util.b.a((Collection<?>) arrayList4)) {
                return;
            }
            this.d.addAll(arrayList3);
            this.e.addAll(arrayList4);
            com.sankuai.xm.imui.common.util.d.b("%s onEvent QUERY_DATA:start to queryOpposite sentMsgIds.size = %d, recvMsgId.size = %d", "UIPersonOppositeController", Integer.valueOf(arrayList3.size()), Integer.valueOf(arrayList4.size()));
            IMClient.a().a(this.f, arrayList3, arrayList4);
        }
    }

    @Override // com.sankuai.xm.imui.controller.opposite.b, com.sankuai.xm.im.IMClient.d
    public final void a(long j, String str, String str2, String str3) {
        Object[] objArr = {new Long(j), str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a33379b4904002925b5b13ab85842bd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a33379b4904002925b5b13ab85842bd");
            return;
        }
        super.a(j, str, str2, str3);
        if (this.g != j) {
            com.sankuai.xm.imui.common.util.d.d("%s::onConnected uid error current:%d authUid:%d", "UIPersonOppositeController", Long.valueOf(this.g), Long.valueOf(j));
            this.g = j;
        }
        if (com.sankuai.xm.base.util.b.a(this.d) && com.sankuai.xm.base.util.b.a(this.e)) {
            return;
        }
        com.sankuai.xm.imui.common.util.d.a("%s onConnected: start to queryOpposite ", "UIPersonOppositeController");
        IMClient.a().a(this.f, new ArrayList(this.d), new ArrayList(this.e));
    }

    @Override // com.sankuai.xm.im.message.opposite.OppositeController.OnOppositeChangeListener
    public final void onOppositeChanged(List<Long> list, List<Long> list2) {
        Object[] objArr = {list, list2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b2228307996312434e8d337fca30fdaf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b2228307996312434e8d337fca30fdaf");
            return;
        }
        List<com.sankuai.xm.imui.session.entity.b> b = this.c.b();
        HashSet hashSet = new HashSet();
        if (!com.sankuai.xm.base.util.b.a(list)) {
            hashSet.addAll(list);
        }
        HashSet hashSet2 = new HashSet();
        if (!com.sankuai.xm.base.util.b.a(list2)) {
            hashSet2.addAll(list2);
        }
        this.d.removeAll(hashSet2);
        this.e.removeAll(hashSet2);
        hashSet.removeAll(hashSet2);
        com.sankuai.xm.imui.common.util.d.b("%s onOppositeChanged: readMsgids.size = %d, unreadMsgids.size = %d", "UIPersonOppositeController", Integer.valueOf(com.sankuai.xm.base.util.b.b(list2)), Integer.valueOf(com.sankuai.xm.base.util.b.b(list)));
        ArrayList arrayList = new ArrayList();
        for (com.sankuai.xm.imui.session.entity.b bVar : b) {
            if (bVar != null && bVar.b != 0 && bVar.b.getMsgId() != 0) {
                M m = bVar.b;
                long msgId = m.getMsgId();
                if (hashSet.contains(Long.valueOf(msgId))) {
                    if (m.getFromUid() == this.g) {
                        this.d.add(Long.valueOf(msgId));
                    } else {
                        this.e.add(Long.valueOf(msgId));
                    }
                    bVar.a(1);
                    arrayList.add(bVar);
                } else if (hashSet2.contains(Long.valueOf(msgId))) {
                    bVar.a(0);
                    arrayList.add(bVar);
                }
            }
        }
        a(arrayList);
    }
}

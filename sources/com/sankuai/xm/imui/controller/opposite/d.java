package com.sankuai.xm.imui.controller.opposite;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.im.IMClient;
import com.sankuai.xm.im.message.opposite.PubOppositeController;
import com.sankuai.xm.im.session.SessionId;
import com.sankuai.xm.imui.IMUIManager;
import com.sankuai.xm.imui.common.widget.ListViewWidgetPanel;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class d extends b implements PubOppositeController.PubOppositeChangeListener {
    public static ChangeQuickRedirect a;
    private SessionId d;
    private long e;
    private long f;
    private long g;
    private long h;

    @Override // com.sankuai.xm.imui.controller.opposite.b
    public final void a(ListViewWidgetPanel.a<com.sankuai.xm.imui.session.entity.b> aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be5d62fd4a57912676aadfcce94b7f2a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be5d62fd4a57912676aadfcce94b7f2a");
            return;
        }
        super.a(aVar);
        this.d = com.sankuai.xm.imui.b.a().f();
        this.e = IMUIManager.a().e();
        IMClient.a().a(this.d.g, this);
    }

    @Override // com.sankuai.xm.imui.controller.opposite.b
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "043ea4203836153c056346aef384d2b0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "043ea4203836153c056346aef384d2b0");
            return;
        }
        super.a();
        IMClient.a().b(this.d.g, this);
    }

    @Override // com.sankuai.xm.im.message.opposite.PubOppositeController.PubOppositeChangeListener
    public final void onOppositeChanged(SessionId sessionId, long j, long j2) {
        Object[] objArr = {sessionId, new Long(j), new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa2e14c3983a59ccdfc5f0f312c7ff22", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa2e14c3983a59ccdfc5f0f312c7ff22");
        } else if (sessionId.equals(this.d)) {
            com.sankuai.xm.imui.common.util.d.b("%s::onOppositeChanged: sendOppositeTime = %d, receiveOppositeTime = %d, session = %s", "UIPubOppositeController", Long.valueOf(j), Long.valueOf(j2), this.d);
            List<com.sankuai.xm.imui.session.entity.b> b = this.c.b();
            ArrayList arrayList = new ArrayList();
            for (com.sankuai.xm.imui.session.entity.b bVar : b) {
                if (bVar != null && bVar.b != 0) {
                    M m = bVar.b;
                    if (m.getFromUid() == this.e) {
                        if (m.getSts() <= j2) {
                            bVar.a(0);
                            arrayList.add(bVar);
                        }
                    } else if (m.getSts() <= j) {
                        bVar.a(0);
                        arrayList.add(bVar);
                    }
                }
            }
            a(arrayList);
        }
    }

    @Override // com.sankuai.xm.im.message.opposite.PubOppositeController.PubOppositeChangeListener
    public final void onOppositeConfigChanged() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "370131a620099b7a7f676782438b3de9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "370131a620099b7a7f676782438b3de9");
            return;
        }
        com.sankuai.xm.imui.common.util.d.b("%s::onOppositeConfigChanged", "UIPubOppositeController");
        b();
    }

    @Override // com.sankuai.xm.imui.controller.opposite.b
    public final void a(ListViewWidgetPanel.b<com.sankuai.xm.imui.session.entity.b> bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c5c983c142b48fecc792bfbc2286f58", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c5c983c142b48fecc792bfbc2286f58");
            return;
        }
        super.a(bVar);
        int i = bVar.d;
        if (i == 2) {
            if (this.c.a().isShown()) {
                b(bVar.b);
            }
            g(bVar.b);
            return;
        }
        switch (i) {
            case 4:
                if (this.c.a().isShown()) {
                    b(bVar.b);
                }
                d(bVar.b);
                g(bVar.b);
                return;
            case 5:
                if (this.c == null || this.c.a() == null) {
                    return;
                }
                b(this.c.b());
                return;
            default:
                return;
        }
    }

    @Override // com.sankuai.xm.imui.controller.opposite.b, com.sankuai.xm.im.IMClient.d
    public final void a(long j, String str, String str2, String str3) {
        Object[] objArr = {new Long(j), str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "92573979ef889c882558a37175d4e77d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "92573979ef889c882558a37175d4e77d");
            return;
        }
        super.a(j, str, str2, str3);
        if (this.e != j) {
            com.sankuai.xm.imui.common.util.d.d("%s::onConnected uid error current:%d authUid:%d", "UIPubOppositeController", Long.valueOf(this.e), Long.valueOf(j));
            this.e = j;
        }
        this.f = 0L;
        this.g = 0L;
        this.h = 0L;
        b(this.c.b());
        d(this.c.b());
    }

    private void b(List<com.sankuai.xm.imui.session.entity.b> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "21eec153310987827f852d1a8fbe818a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "21eec153310987827f852d1a8fbe818a");
        } else if (com.sankuai.xm.base.util.b.a(list)) {
        } else {
            long c = c(list);
            if (c <= 0 || c <= this.f) {
                return;
            }
            this.f = c;
            com.sankuai.xm.imui.common.util.d.b("%s::sendOppositeByLastTime sendOpposite time = %d", "UIPubOppositeController", Long.valueOf(this.f));
            IMClient.a().a(this.d, this.f);
        }
    }

    private long c(List<com.sankuai.xm.imui.session.entity.b> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "88d149241046a7535d3cc449070a8b18", 6917529027641081856L)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "88d149241046a7535d3cc449070a8b18")).longValue();
        }
        long j = 0;
        for (com.sankuai.xm.imui.session.entity.b bVar : list) {
            M m = bVar.b;
            if (m != 0 && bVar.i > 0 && m.getFromUid() != this.e && m.getMsgId() != 0 && m.getSts() > j) {
                j = m.getSts();
            }
        }
        return j;
    }

    private void d(List<com.sankuai.xm.imui.session.entity.b> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "86405b1418a4333bfb8da29d574e70ee", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "86405b1418a4333bfb8da29d574e70ee");
        } else if (com.sankuai.xm.base.util.b.a(list)) {
        } else {
            long e = e(list);
            if (e <= 0 || e <= this.g) {
                return;
            }
            this.g = e;
            com.sankuai.xm.imui.common.util.d.b("%s::queryOppositeByLastTime queryOpposite time = %d", "UIPubOppositeController", Long.valueOf(this.g));
            IMClient.a().d(this.d);
        }
    }

    private long e(List<com.sankuai.xm.imui.session.entity.b> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1fa40afb6add3968ec29dcd9d6e37d6e", 6917529027641081856L)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1fa40afb6add3968ec29dcd9d6e37d6e")).longValue();
        }
        long j = 0;
        for (com.sankuai.xm.imui.session.entity.b bVar : list) {
            M m = bVar.b;
            if (m != 0 && bVar.i > 0 && m.getFromUid() == this.e && m.getSts() > j) {
                j = m.getSts();
            }
        }
        return j;
    }

    private long f(List<com.sankuai.xm.imui.session.entity.b> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "efa3a79424c5b6d38922d4da63d23f47", 6917529027641081856L)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "efa3a79424c5b6d38922d4da63d23f47")).longValue();
        }
        long j = 0;
        for (com.sankuai.xm.imui.session.entity.b bVar : list) {
            M m = bVar.b;
            if (m != 0 && m.getMsgId() != 0 && m.getMsgType() != 12 && m.getFromUid() != this.e && m.getSts() > j) {
                j = m.getSts();
            }
        }
        return j;
    }

    private void g(List<com.sankuai.xm.imui.session.entity.b> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "35f84c94470f4f1c5d05b2cbf0fbb951", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "35f84c94470f4f1c5d05b2cbf0fbb951");
        } else if (com.sankuai.xm.base.util.b.a(list)) {
        } else {
            long f = f(list);
            if (f <= 0 || f <= this.h) {
                return;
            }
            this.h = f;
            com.sankuai.xm.imui.common.util.d.b("%s::updateToReadByReceiveMsg msg time = %d", "UIPubOppositeController", Long.valueOf(this.h));
            IMClient.a().b(this.d, this.h);
        }
    }
}

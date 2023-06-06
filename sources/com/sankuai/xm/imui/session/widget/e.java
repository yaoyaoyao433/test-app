package com.sankuai.xm.imui.session.widget;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.service.n;
import com.sankuai.xm.base.trace.annotation.Trace;
import com.sankuai.xm.im.IMClient;
import com.sankuai.xm.im.message.api.a;
import com.sankuai.xm.im.message.bean.MsgAddition;
import com.sankuai.xm.im.session.SessionId;
import com.sankuai.xm.imui.common.widget.ListViewWidgetPanel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class e extends com.sankuai.xm.imui.common.widget.a<com.sankuai.xm.imui.session.entity.b> implements a.InterfaceC1390a {
    public static ChangeQuickRedirect c;
    private com.sankuai.xm.im.message.api.a i;
    private SessionId j;

    @Override // com.sankuai.xm.imui.common.widget.b
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a278e702eab54491fad3e3926f0e292", 6917529027641081856L)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a278e702eab54491fad3e3926f0e292");
        }
        try {
            this.j = com.sankuai.xm.imui.b.a().f();
            this.i = (com.sankuai.xm.im.message.api.a) IMClient.a().a(com.sankuai.xm.im.message.api.a.class);
            this.i.a(this.j.g, this);
            return null;
        } catch (n | NullPointerException unused) {
            com.sankuai.xm.imui.common.util.d.c("MsgAdditionWidget", "onCreateView", "service is null or sessionId is null, %s", this.j);
            return null;
        }
    }

    @Override // com.sankuai.xm.imui.common.widget.b
    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "75c797c22500f56e34b64fa1e9258e06", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "75c797c22500f56e34b64fa1e9258e06");
            return;
        }
        if (this.i != null && this.j != null) {
            this.i.b(this.j.g, this);
        }
        super.f();
    }

    @Override // com.sankuai.xm.imui.common.widget.a
    public final void a(ListViewWidgetPanel.b<com.sankuai.xm.imui.session.entity.b> bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f6399e1ef9c163d99a00f2a266a12834", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f6399e1ef9c163d99a00f2a266a12834");
            return;
        }
        super.a(bVar);
        if (this.i == null || this.j == null) {
            com.sankuai.xm.imui.common.util.d.b("MsgAdditionWidget", "onEvent", "service is null, event=%d", Integer.valueOf(bVar.d));
            return;
        }
        int i = bVar.d;
        if (i != 2) {
            switch (i) {
                case 4:
                    break;
                case 5:
                    if (this.h == 0 || ((ListViewWidgetPanel.a) this.h).a() == null) {
                        return;
                    }
                    a(((ListViewWidgetPanel.a) this.h).b(), bVar.d);
                    return;
                default:
                    return;
            }
        }
        if (((ListViewWidgetPanel.a) this.h).a().isShown()) {
            a(bVar.b, bVar.d);
        }
    }

    @Override // com.sankuai.xm.im.message.api.a.InterfaceC1390a
    @Trace(name = "notify_ui", type = com.sankuai.xm.base.trace.i.end)
    public final void a(int i, List<MsgAddition> list) {
        Object[] objArr = {Integer.valueOf(i), list};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c4c8f2eda1f654206ab6c29f030b4ed3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c4c8f2eda1f654206ab6c29f030b4ed3");
            return;
        }
        try {
            com.sankuai.xm.base.trace.j.a(com.sankuai.xm.base.trace.i.end, "notify_ui", (String[]) null, new Object[]{new Integer(i), list});
            if (i == 0 && !com.sankuai.xm.base.util.b.a(list)) {
                a(list);
                com.sankuai.xm.base.trace.j.a((Object) null);
                return;
            }
            com.sankuai.xm.imui.common.util.d.a("MsgAdditionWidget", "onAdditionChange", "do noting, source=%d, size=%d", Integer.valueOf(i), Integer.valueOf(com.sankuai.xm.base.util.b.b(list)));
            com.sankuai.xm.base.trace.j.a((Object) null);
        } catch (Throwable th) {
            com.sankuai.xm.base.trace.j.a(th);
            throw th;
        }
    }

    private void a(List<com.sankuai.xm.imui.session.entity.b> list, int i) {
        int i2 = 0;
        Object[] objArr = {list, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bfeb6d94a1a3bb9178b87bcfcfa60868", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bfeb6d94a1a3bb9178b87bcfcfa60868");
            return;
        }
        List<Long> b = b(list);
        int b2 = com.sankuai.xm.base.util.b.b(b);
        if (b2 > 30) {
            int i3 = (b2 / 30) + 1;
            while (i2 < i3) {
                int i4 = i2 * 30;
                i2++;
                int min = Math.min(b2, i2 * 30);
                if (i4 < min) {
                    this.i.a(b.subList(i4, min), this.j.g, this.j.e, 0, new a(i));
                }
            }
            return;
        }
        this.i.a(b, this.j.g, this.j.e, 0, new a(i));
    }

    private List<Long> b(List<com.sankuai.xm.imui.session.entity.b> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a7ebbb746cd94cd8deb67cc195a623e", 6917529027641081856L)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a7ebbb746cd94cd8deb67cc195a623e");
        }
        if (com.sankuai.xm.base.util.b.a(list)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (com.sankuai.xm.imui.session.entity.b bVar : list) {
            if (bVar.b != 0 && bVar.b.getMsgId() > 0) {
                arrayList.add(Long.valueOf(bVar.b.getMsgId()));
            }
        }
        Object[] objArr2 = {arrayList};
        Object[] objArr3 = {"MsgAdditionWidget", "getQueryList", "query=%s", objArr2};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.xm.imui.common.util.d.a;
        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect2, true, "8b9dfc37aba3a0a42b7e664af5fef087", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect2, true, "8b9dfc37aba3a0a42b7e664af5fef087");
        } else {
            com.sankuai.xm.imui.common.util.d.a(com.sankuai.xm.log.c.a("MsgAdditionWidget", "getQueryList", "query=%s"), objArr2);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public class a implements com.sankuai.xm.im.a<List<MsgAddition>> {
        public static ChangeQuickRedirect a;
        private int c;

        @Override // com.sankuai.xm.base.callback.Callback
        public final /* synthetic */ void onSuccess(Object obj) {
            List list = (List) obj;
            Object[] objArr = {list};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f863885c69fd92ca36903153ab372a92", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f863885c69fd92ca36903153ab372a92");
            } else if (e.this.h == 0 || com.sankuai.xm.base.util.b.a((Collection<?>) list)) {
                com.sankuai.xm.imui.common.util.d.a("MsgAdditionWidget", "QueryCallback.onSuccess", "event=%d,view is dismiss or res empty, %s", Integer.valueOf(this.c), list);
            } else {
                e.this.a(list);
            }
        }

        public a(int i) {
            Object[] objArr = {e.this, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6431baa961447f282d03507b42644758", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6431baa961447f282d03507b42644758");
            } else {
                this.c = i;
            }
        }

        @Override // com.sankuai.xm.base.callback.Callback
        public final void onFailure(int i, String str) {
            Object[] objArr = {Integer.valueOf(i), str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ccfd707695ed342739f99b315fabea3", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ccfd707695ed342739f99b315fabea3");
            } else {
                com.sankuai.xm.imui.common.util.d.c("MsgAdditionWidget", "QueryCallback.onFailure", "event=%d,code=%d,msg=%s", Integer.valueOf(this.c), Integer.valueOf(i), str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(List<MsgAddition> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "065dc44868011d5537d592319225c688", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "065dc44868011d5537d592319225c688");
            return;
        }
        List<com.sankuai.xm.imui.session.entity.b> b = ((ListViewWidgetPanel.a) this.h).b();
        final ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(list);
        for (com.sankuai.xm.imui.session.entity.b bVar : b) {
            if (bVar != null && bVar.b != 0 && bVar.b.getMsgId() > 0) {
                long msgId = bVar.b.getMsgId();
                short channel = bVar.b.getChannel();
                MsgAddition msgAddition = new MsgAddition();
                msgAddition.setMsgId(msgId);
                msgAddition.setChannel(channel);
                int indexOf = arrayList2.indexOf(msgAddition);
                if (indexOf >= 0) {
                    MsgAddition msgAddition2 = (MsgAddition) arrayList2.remove(indexOf);
                    if (msgAddition2.newThan(bVar.n) && !msgAddition2.neverChange()) {
                        bVar.n = msgAddition2;
                        arrayList.add(bVar);
                    }
                    if (arrayList2.isEmpty()) {
                        break;
                    }
                } else {
                    continue;
                }
            }
        }
        Object[] objArr2 = {arrayList};
        ChangeQuickRedirect changeQuickRedirect2 = c;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "01d802e91152a8dd5b888e1344207166", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "01d802e91152a8dd5b888e1344207166");
        } else if (!com.sankuai.xm.base.util.b.a((Collection<?>) arrayList)) {
            com.sankuai.xm.threadpool.scheduler.a.b().a(com.sankuai.xm.base.trace.j.a(new Runnable() { // from class: com.sankuai.xm.imui.session.widget.e.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "24985d1d51e1ca57835ca1ea57e2a45d", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "24985d1d51e1ca57835ca1ea57e2a45d");
                    } else if (e.this.h == 0) {
                    } else {
                        ListViewWidgetPanel.c cVar = new ListViewWidgetPanel.c(2);
                        cVar.c = arrayList;
                        ((ListViewWidgetPanel.a) e.this.h).a(cVar);
                    }
                }
            }));
        }
    }
}

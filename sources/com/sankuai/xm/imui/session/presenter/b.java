package com.sankuai.xm.imui.session.presenter;

import android.support.constraint.R;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.sankuai.xm.base.db.b;
import com.sankuai.xm.base.db.k;
import com.sankuai.xm.base.service.l;
import com.sankuai.xm.base.service.m;
import com.sankuai.xm.base.trace.annotation.Trace;
import com.sankuai.xm.base.trace.annotation.TraceStatus;
import com.sankuai.xm.base.trace.i;
import com.sankuai.xm.base.trace.j;
import com.sankuai.xm.base.util.ActivityUtils;
import com.sankuai.xm.base.util.ad;
import com.sankuai.xm.im.IMClient;
import com.sankuai.xm.im.cache.DBProxy;
import com.sankuai.xm.im.message.bean.IMMessage;
import com.sankuai.xm.im.message.bean.MediaMessage;
import com.sankuai.xm.im.message.history.HistoryController;
import com.sankuai.xm.im.session.SessionId;
import com.sankuai.xm.im.transfer.download.DownloadManager;
import com.sankuai.xm.im.utils.MessageUtils;
import com.sankuai.xm.imui.IMUIManager;
import com.sankuai.xm.imui.common.util.d;
import com.sankuai.xm.imui.common.util.e;
import com.sankuai.xm.imui.common.util.g;
import com.sankuai.xm.imui.session.SessionFragment;
import com.sankuai.xm.imui.session.c;
import com.sankuai.xm.imui.session.entity.SessionParams;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class b extends com.sankuai.xm.imui.base.a<c.b> implements k, IMClient.o, c.a, com.sankuai.xm.imui.session.listener.a, com.sankuai.xm.imui.session.listener.b {
    public static ChangeQuickRedirect c;
    private SessionId d;
    private String e;
    private long f;
    private long g;
    private List<com.sankuai.xm.imui.session.entity.b> h;
    private boolean i;
    private com.sankuai.xm.im.transfer.download.c j;
    private IMClient.i k;
    private l l;

    public static /* synthetic */ void a(b bVar, IMMessage iMMessage) {
        Object[] objArr = {iMMessage};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "ca97ef93441193a382ca55aaca54e92f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "ca97ef93441193a382ca55aaca54e92f");
        } else if (SessionId.a(iMMessage).equals(com.sankuai.xm.imui.b.a().f())) {
            if (!bVar.d(iMMessage)) {
                d.c("SessionPresenter::onSendMsgAdded, not in show range, %s", iMMessage.getMsgUuid());
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(iMMessage);
            List<com.sankuai.xm.imui.session.entity.b> a2 = bVar.a((List<IMMessage>) arrayList, false);
            if (com.sankuai.xm.base.util.b.b(a2) <= 0 || bVar.b == 0) {
                return;
            }
            ((c.b) bVar.b).b(0, a2.get(0));
        }
    }

    public static /* synthetic */ void a(b bVar, IMMessage iMMessage, int i) {
        Object[] objArr = {iMMessage, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "0a8fdbff8aa082119a3ce2446d0c764f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "0a8fdbff8aa082119a3ce2446d0c764f");
        } else if (iMMessage != null) {
            com.sankuai.xm.imui.session.entity.b b = bVar.b(iMMessage.getMsgUuid());
            if (b != null) {
                if (MessageUtils.shouldMessageStatusChange(b.b, iMMessage)) {
                    iMMessage.copyTo(b.b);
                }
                if (bVar.b != 0) {
                    ((c.b) bVar.b).a(b, i);
                }
            } else if (i == 0 || bVar.b == 0) {
            } else {
                if (bVar.b instanceof SessionFragment) {
                    SessionFragment sessionFragment = (SessionFragment) bVar.b;
                    if (sessionFragment.a(i, bVar.a(iMMessage))) {
                        return;
                    }
                    com.sankuai.xm.imui.common.util.b.a(sessionFragment.getActivity(), i);
                    return;
                }
                com.sankuai.xm.imui.common.util.b.a(ActivityUtils.a(((c.b) bVar.b).getContext()), i);
            }
        }
    }

    @Override // com.sankuai.xm.imui.session.c.a
    public final /* synthetic */ c.b d() {
        return (c.b) super.a();
    }

    public b(c.b bVar) {
        super(bVar);
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "67365c1617b4cffe852b6fac6f2b593d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "67365c1617b4cffe852b6fac6f2b593d");
            return;
        }
        this.f = Long.MAX_VALUE;
        this.g = Long.MAX_VALUE;
        this.i = true;
        this.l = (l) m.a(l.class);
        bVar.a((c.b) this);
        this.h = new ArrayList();
        this.d = com.sankuai.xm.imui.b.a().f();
        this.e = com.sankuai.xm.imui.b.a().h();
        this.j = new com.sankuai.xm.imui.session.listener.c(this);
    }

    @Override // com.sankuai.xm.imui.session.c.a
    public final void ca_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a24d40ff4e3647a74f7fc19d57e2868b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a24d40ff4e3647a74f7fc19d57e2868b");
            return;
        }
        if (this.k == null && this.b != 0 && this.d != null) {
            this.k = new IMClient.i() { // from class: com.sankuai.xm.imui.session.presenter.b.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.xm.im.IMClient.i
                public final void a(List<IMMessage> list, boolean z) {
                    Object[] objArr2 = {list, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cd2d67e465b2f9177f3f2534209bfb1c", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cd2d67e465b2f9177f3f2534209bfb1c");
                    } else {
                        b.this.a(list);
                    }
                }
            };
            this.l.a(IMClient.i.class).a(this.d.g).a(((c.b) this.b).getContext()).a((l.a) this.k);
        }
        com.sankuai.xm.imui.listener.b.a().a(this.e, (com.sankuai.xm.imui.session.listener.a) this);
        com.sankuai.xm.imui.listener.b.a().a(this.d.f(), (com.sankuai.xm.imui.session.listener.b) this);
        IMClient.a().a((short) -1, (IMClient.o) this);
        DownloadManager.getInstance().registerListener(this.j);
        DBProxy.l().a(this);
        a(true);
    }

    @Override // com.sankuai.xm.imui.base.a, com.sankuai.xm.imui.session.c.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df254986b6e432940952d8d3c4f32f6f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df254986b6e432940952d8d3c4f32f6f");
            return;
        }
        com.sankuai.xm.imui.common.report.b.a(this.e, this.d, 0);
        com.sankuai.xm.imui.listener.b.a().b(this.e);
        com.sankuai.xm.imui.listener.b.a().b(this.d.f(), this);
        IMClient a2 = IMClient.a();
        Object[] objArr2 = {(short) -1, this};
        ChangeQuickRedirect changeQuickRedirect2 = IMClient.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "9749b401ffe8ca571d1f0a0af0036df7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "9749b401ffe8ca571d1f0a0af0036df7");
        } else {
            ((l) a2.D().a()).a(IMClient.o.class).a((short) -1).b(this);
        }
        DownloadManager.getInstance().unregisterListener(this.j);
        DBProxy.l().b(this);
        g a3 = g.a();
        String str = this.e;
        Object[] objArr3 = {str};
        ChangeQuickRedirect changeQuickRedirect3 = g.a;
        if (PatchProxy.isSupport(objArr3, a3, changeQuickRedirect3, false, "1483435498663fce42caf6b955a926f8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr3, a3, changeQuickRedirect3, false, "1483435498663fce42caf6b955a926f8");
        } else {
            a3.b.remove(str);
        }
        if (this.k != null && this.d != null) {
            this.l.a(IMClient.i.class).a(this.d.g).b(this.k);
            this.k = null;
        }
        super.b();
    }

    @Override // com.sankuai.xm.imui.session.c.a
    public final void a(int i, com.sankuai.xm.imui.session.entity.a aVar, int i2) {
        Object[] objArr = {Integer.valueOf(i), aVar, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2097d301f144081763a753734c8cd449", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2097d301f144081763a753734c8cd449");
            return;
        }
        d.b("SessionPresenter::obtainMessageList limit = %d, type = %d, ", Integer.valueOf(i), Integer.valueOf(i2));
        int i3 = i <= 0 ? 30 : i;
        if (i2 == 4) {
            b(i3, aVar, i2);
            return;
        }
        com.sankuai.xm.imui.common.report.b.a(this.e, i2);
        a aVar2 = new a();
        aVar2.c = i3;
        aVar2.b = i2;
        aVar2.e = aVar;
        if (aVar != null && aVar.b == 2) {
            IMClient.a().a(this.d, aVar.c, a(aVar), i3, (short) 0, (IMClient.g<List<IMMessage>>) aVar2);
        } else {
            IMClient.a().a(this.d, a((com.sankuai.xm.imui.session.entity.a) null), aVar == null ? 0L : aVar.c, i3, aVar2);
        }
    }

    @Override // com.sankuai.xm.imui.session.listener.a
    public final void a(final List<IMMessage> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5892c2374e91d814dcc33a492cf1dd27", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5892c2374e91d814dcc33a492cf1dd27");
            return;
        }
        d.b("SessionPresenter::onReceiveMsg, messages count = " + com.sankuai.xm.base.util.b.b(list), new Object[0]);
        if (com.sankuai.xm.base.util.b.a(list)) {
            return;
        }
        com.sankuai.xm.threadpool.scheduler.a.b().a(j.a(new Runnable() { // from class: com.sankuai.xm.imui.session.presenter.b.3
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cbd4aefbfd8598f25baae263d84127d5", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cbd4aefbfd8598f25baae263d84127d5");
                    return;
                }
                List<com.sankuai.xm.imui.session.entity.b> a2 = b.this.a((List<IMMessage>) list, false);
                if (b.this.b != null) {
                    ((c.b) b.this.b).a(a2);
                }
            }
        }));
    }

    @Override // com.sankuai.xm.imui.session.listener.a
    public final void a(int i, final String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ddf21d049ecf55da1be9ef5e1354e6f3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ddf21d049ecf55da1be9ef5e1354e6f3");
            return;
        }
        d.b("SessionPresenter::onDeleteMsg, msgUuid = %s, code = %d", str, Integer.valueOf(i));
        com.sankuai.xm.threadpool.scheduler.a.b().a(j.a(new Runnable() { // from class: com.sankuai.xm.imui.session.presenter.b.4
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e1466146c99058dd2ad243d57c3c406e", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e1466146c99058dd2ad243d57c3c406e");
                    return;
                }
                synchronized (b.this.h) {
                    if (b.this.b == null) {
                        return;
                    }
                    int a2 = b.this.a(str);
                    if (a2 >= 0) {
                        ((c.b) b.this.b).b(Arrays.asList((com.sankuai.xm.imui.session.entity.b) b.this.h.remove(a2)));
                    } else {
                        ad.a(((c.b) b.this.b).getContext(), (int) R.string.xm_sdk_session_msg_delete_message_failed);
                    }
                }
            }
        }));
    }

    @Override // com.sankuai.xm.imui.session.c.a
    public final void a(final IMMessage iMMessage, final com.sankuai.xm.im.a<Integer> aVar) {
        Object[] objArr = {iMMessage, aVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b3988d0216f2122425721cb48814fb36", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b3988d0216f2122425721cb48814fb36");
        } else if (iMMessage == null) {
            if (aVar != null) {
                aVar.onFailure(-1, "message is null");
            }
        } else if (b(iMMessage.getMsgUuid()) != null) {
            if (this.b != 0) {
                ((c.b) this.b).a(iMMessage, aVar);
            } else if (aVar != null) {
                aVar.onFailure(-1, "view is null");
            }
        } else {
            long j = Long.MAX_VALUE;
            com.sankuai.xm.imui.session.entity.b a2 = a(0);
            if (a2 != null && a2.b != 0) {
                j = a2.b.getSts();
            }
            IMClient.a().a(this.d, iMMessage.getSts() - 1, j, 1000, (short) 0, (IMClient.g<List<IMMessage>>) new com.sankuai.xm.im.d<List<IMMessage>>() { // from class: com.sankuai.xm.imui.session.presenter.b.5
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.xm.im.d
                public final /* synthetic */ void b_(List<IMMessage> list) {
                    List<IMMessage> list2 = list;
                    Object[] objArr2 = {list2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a4675a2db2939e4d1355a2f038b0ec7c", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a4675a2db2939e4d1355a2f038b0ec7c");
                    } else if (!com.sankuai.xm.base.util.b.a(list2) || aVar == null) {
                        List<com.sankuai.xm.imui.session.entity.b> a3 = b.this.a(list2, true);
                        if (b.this.b != null) {
                            ((c.b) b.this.b).a(0, null, a3, 7, true);
                            ((c.b) b.this.b).a(iMMessage, aVar);
                        } else if (aVar != null) {
                            aVar.onFailure(-1, "view is null");
                        }
                    } else {
                        aVar.onFailure(-1, "not found message");
                    }
                }
            });
        }
    }

    @Override // com.sankuai.xm.imui.session.listener.b
    public final boolean b(IMMessage iMMessage) {
        Object[] objArr = {iMMessage};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa3c62b39a33db6531b386ec3a502d0d", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa3c62b39a33db6531b386ec3a502d0d")).booleanValue();
        }
        if (this.b == 0) {
            return false;
        }
        com.sankuai.xm.imui.session.entity.b a2 = a(iMMessage);
        boolean b = ((c.b) this.b).b(a2);
        if (iMMessage != a2.b && a2.b != 0 && iMMessage != null) {
            a2.b.copyTo(iMMessage);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(b);
        d.b("SessionPresenter::onPrepare, msgUuid = %s, consumed = %s", a2.b(), sb.toString());
        return b;
    }

    @Override // com.sankuai.xm.imui.session.listener.b
    public final void a(final MediaMessage mediaMessage, final double d, final double d2) {
        Object[] objArr = {mediaMessage, Double.valueOf(d), Double.valueOf(d2)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac49b7454e0a7dd31af7b4e6d0a0525d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac49b7454e0a7dd31af7b4e6d0a0525d");
        } else {
            com.sankuai.xm.threadpool.scheduler.a.b().a(j.a(new Runnable() { // from class: com.sankuai.xm.imui.session.presenter.b.6
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f56ce937261a64636872e80af22cf0a9", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f56ce937261a64636872e80af22cf0a9");
                        return;
                    }
                    int i = (int) ((d * 100.0d) / d2);
                    d.a("ysf=======dx=====upload=" + i + " status:" + mediaMessage.getFileStatus(), new Object[0]);
                    if (b.this.b != null) {
                        ((c.b) b.this.b).a(mediaMessage.getMsgUuid(), mediaMessage.getUrl(), mediaMessage.getFileStatus(), i);
                    }
                }
            }));
        }
    }

    @Override // com.sankuai.xm.imui.session.listener.b
    @Trace(name = "update_ui", type = i.end)
    public final void c(final IMMessage iMMessage) {
        Object[] objArr = {iMMessage};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c1cf956cb9096a20469e00969d682ed", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c1cf956cb9096a20469e00969d682ed");
            return;
        }
        try {
            j.a(i.end, "update_ui", (String[]) null, new Object[]{iMMessage});
            d.b("SessionPresenter::onSuccess，Message status:" + iMMessage.getMsgStatus() + ",file status=" + iMMessage.getFileStatus(), new Object[0]);
            if (iMMessage.getMsgType() == -100) {
                a(0, iMMessage.getMsgUuid());
                j.a((Object) null);
                return;
            }
            com.sankuai.xm.threadpool.scheduler.a.b().a(j.a(new Runnable() { // from class: com.sankuai.xm.imui.session.presenter.b.7
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "63fe9a059fffb62786db2e0c5f53352f", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "63fe9a059fffb62786db2e0c5f53352f");
                        return;
                    }
                    if (iMMessage.getMsgType() == 12 && iMMessage.getMsgStatus() == 15) {
                        b.this.a(iMMessage, true);
                    }
                    b.a(b.this, iMMessage, 0);
                }
            }));
            j.a((Object) null);
        } catch (Throwable th) {
            j.a(th);
            throw th;
        }
    }

    @Override // com.sankuai.xm.imui.session.listener.b
    @Trace(name = "update_ui", type = i.end)
    public final void a(final IMMessage iMMessage, @TraceStatus final int i) {
        Object[] objArr = {iMMessage, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d445b4e140c0a0d41318df690030842c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d445b4e140c0a0d41318df690030842c");
            return;
        }
        try {
            j.a(i.end, "update_ui", (String[]) null, new Object[]{iMMessage, new Integer(i)});
            j.a(new Integer(i), (String[]) null, new int[]{0}, (String[]) null, (int[]) null, (int[]) null);
            if (iMMessage == null) {
                j.a((Object) null);
                return;
            }
            d.b("SessionPresenter::onFailure msgUuid = %s, code= %d", iMMessage.getMsgUuid(), Integer.valueOf(i));
            if (iMMessage.getMsgStatus() == 16 && i == 1000) {
                a(true);
            }
            com.sankuai.xm.threadpool.scheduler.a.b().a(j.a(new Runnable() { // from class: com.sankuai.xm.imui.session.presenter.b.8
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7db7975de79391de9a70fffc0ed5b82b", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7db7975de79391de9a70fffc0ed5b82b");
                    } else {
                        b.a(b.this, iMMessage, i);
                    }
                }
            }));
            j.a((Object) null);
        } catch (Throwable th) {
            j.a(th);
            throw th;
        }
    }

    @Override // com.sankuai.xm.imui.session.listener.b
    public final void b(final IMMessage iMMessage, final int i) {
        boolean z = false;
        Object[] objArr = {iMMessage, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b48f5e7d422e5a57d56e50013650ecf0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b48f5e7d422e5a57d56e50013650ecf0");
            return;
        }
        d.b("SessionPresenter::onStatusChanged:: msgUuid = %s status = %s", iMMessage.getMsgUuid(), Integer.valueOf(i));
        switch (i) {
            case 4:
            case 5:
            case 15:
            case 16:
                z = true;
                break;
        }
        if (z) {
            return;
        }
        com.sankuai.xm.threadpool.scheduler.a.b().a(j.a(new Runnable() { // from class: com.sankuai.xm.imui.session.presenter.b.9
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "17de6e38ece03d3c83ecc0ceb71602b3", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "17de6e38ece03d3c83ecc0ceb71602b3");
                    return;
                }
                if (i == 3) {
                    b.a(b.this, iMMessage);
                }
                b.a(b.this, iMMessage, -9999);
            }
        }));
    }

    @Override // com.sankuai.xm.imui.session.c.a
    public final List<com.sankuai.xm.imui.session.entity.b> c() {
        return this.h;
    }

    @Override // com.sankuai.xm.imui.session.c.a
    public final com.sankuai.xm.imui.session.entity.b a(IMMessage iMMessage) {
        Object[] objArr = {iMMessage};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f01784e3fb5503986fa75ec9fe8ffb6c", 6917529027641081856L)) {
            return (com.sankuai.xm.imui.session.entity.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f01784e3fb5503986fa75ec9fe8ffb6c");
        }
        if (iMMessage == null) {
            return null;
        }
        com.sankuai.xm.imui.session.entity.b a2 = e.a(iMMessage);
        if (this.b != 0) {
            a2.g = ((c.b) this.b).u().getCommonAdapter().getStyle(a2);
        }
        return a2;
    }

    @Override // com.sankuai.xm.im.IMClient.o
    public final void c(List<com.sankuai.xm.im.session.entry.b> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "73c944d217ebcdb8ea038720ae10441e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "73c944d217ebcdb8ea038720ae10441e");
        } else if (com.sankuai.xm.base.util.b.a(list) || this.b == 0) {
        } else {
            ((c.b) this.b).x();
        }
    }

    @Override // com.sankuai.xm.base.db.k
    public final void a(String str, final b.a aVar) {
        Object[] objArr = {str, aVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d7dde00cab7cf6b6ddf6905a83b3f08", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d7dde00cab7cf6b6ddf6905a83b3f08");
        } else if (this.b != 0) {
            com.sankuai.xm.threadpool.scheduler.a.b().a(j.a(new Runnable() { // from class: com.sankuai.xm.imui.session.presenter.b.10
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "00f2e1e97817bd9a8151337ac39c4e3e", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "00f2e1e97817bd9a8151337ac39c4e3e");
                    } else if (b.this.b != null) {
                        ((c.b) b.this.b).a(aVar);
                    }
                }
            }));
        }
    }

    private void a(boolean z) {
        final com.sankuai.xm.imui.session.b b;
        Object[] objArr = {(byte) 1};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e79e4b23ffba82f9df740f1cc2ac3e0a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e79e4b23ffba82f9df740f1cc2ac3e0a");
        } else if (this.d == null || this.d.e != 2 || (b = com.sankuai.xm.imui.session.b.b(a().getContext())) == null || b.c == null || !b.c.g) {
        } else {
            ((com.sankuai.xm.group.b) m.a(com.sankuai.xm.group.b.class)).a(this.d, IMUIManager.a().e(), Arrays.asList("administrator", "moderator"), true, new com.sankuai.xm.im.a<Boolean>() { // from class: com.sankuai.xm.imui.session.presenter.b.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.xm.base.callback.Callback
                public final /* synthetic */ void onSuccess(Object obj) {
                    Boolean bool = (Boolean) obj;
                    Object[] objArr2 = {bool};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5cc68498613fefc086b3ed1ece04e353", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5cc68498613fefc086b3ed1ece04e353");
                        return;
                    }
                    d.b("SessionPresenter::updateGroupRole onSuccess: %s.", bool);
                    b.e.putBoolean("key_bool_is_group_admin", bool.booleanValue());
                }

                @Override // com.sankuai.xm.base.callback.Callback
                public final void onFailure(int i, String str) {
                    Object[] objArr2 = {Integer.valueOf(i), str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8cff6b9fdc1e1f0d9c8926c5a424668f", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8cff6b9fdc1e1f0d9c8926c5a424668f");
                    } else {
                        d.d("SessionPresenter::updateGroupRole failed in checking group role, code = %d, info = %s.", Integer.valueOf(i), str);
                    }
                }
            });
        }
    }

    private long a(com.sankuai.xm.imui.session.entity.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ab87151dc15b917755c539b433f08f53", 6917529027641081856L)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ab87151dc15b917755c539b433f08f53")).longValue();
        }
        d.b("SessionPresenter::getEndStamp minTimeStamp = %d", Long.valueOf(this.g));
        long j = this.g;
        if (aVar != null && aVar.b == 2 && aVar.d < j && aVar.d > 0) {
            j = aVar.d;
        }
        if (j <= 0) {
            return Long.MAX_VALUE;
        }
        return j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i, com.sankuai.xm.imui.session.entity.a aVar, int i2) {
        Object[] objArr = {Integer.valueOf(i), aVar, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c9414ae13dd573d142bddf9cc0a171f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c9414ae13dd573d142bddf9cc0a171f");
            return;
        }
        C1401b c1401b = new C1401b();
        c1401b.b = i2;
        c1401b.c = i;
        c1401b.d = aVar;
        if (!this.i) {
            c1401b.onSuccess(this.d, null, false);
        } else if (aVar == null || aVar.b == 1) {
            d.b("SessionPresenter::queryMessageListByMsgId msgId = " + this.f, new Object[0]);
            IMClient.a().a(this.d, this.f, aVar == null ? 0L : aVar.c, i, false, (HistoryController.HistoryMessageCallback) c1401b);
        } else {
            long a2 = a(aVar);
            d.b("SessionPresenter::queryMessagesByTimeRange st = %d, et = %d", Long.valueOf(aVar.c), Long.valueOf(a2));
            IMClient.a().a(this.d, aVar.c, a2, i, c1401b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<com.sankuai.xm.imui.session.entity.b> a(List<IMMessage> list, boolean z) {
        boolean z2 = false;
        Object[] objArr = {list, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "77e58a83b9bddadade148f8d3cdca486", 6917529027641081856L)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "77e58a83b9bddadade148f8d3cdca486");
        }
        int b = com.sankuai.xm.base.util.b.b(list);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList<IMMessage> arrayList3 = new ArrayList();
        int i = 0;
        while (i < b) {
            IMMessage iMMessage = list.get(i);
            if (iMMessage != null && d(iMMessage)) {
                com.sankuai.xm.imui.session.entity.b a2 = a(iMMessage, z2);
                if (a2 == null) {
                    if (SessionId.a(iMMessage).equals(this.d)) {
                        if (iMMessage.getMsgType() != -100) {
                            arrayList.add(a(iMMessage));
                        }
                        long j = (iMMessage.getMsgStatus() == 4 || iMMessage.getMsgId() == 0) ? Long.MAX_VALUE : Long.MAX_VALUE;
                        if (j != 0 && j < this.f) {
                            this.f = j;
                        }
                        if (iMMessage.getSts() != 0 && iMMessage.getSts() < this.g) {
                            this.g = iMMessage.getSts();
                        }
                    }
                } else if (iMMessage.getMsgType() == 12) {
                    arrayList3.add(iMMessage);
                } else if (iMMessage.getMsgType() == -100) {
                    arrayList2.add(a2);
                }
            }
            i++;
            z2 = false;
        }
        synchronized (this.h) {
            if (!com.sankuai.xm.base.util.b.a((Collection<?>) arrayList)) {
                if (z) {
                    this.h.addAll(arrayList);
                    Collections.sort(this.h);
                } else {
                    Collections.sort(arrayList);
                    if (!com.sankuai.xm.base.util.b.a(this.h) && this.h.get(0).compareTo((com.sankuai.xm.imui.session.entity.b) arrayList.get(arrayList.size() - 1)) > 0) {
                        this.h.addAll(0, arrayList);
                    } else {
                        this.h.addAll(arrayList);
                    }
                }
            }
            for (IMMessage iMMessage2 : arrayList3) {
                int a3 = a(iMMessage2.getMsgUuid());
                if (a3 < this.h.size() && a3 >= 0) {
                    this.h.set(a3, a(iMMessage2));
                }
            }
            if (!com.sankuai.xm.base.util.b.a((Collection<?>) arrayList2)) {
                this.h.removeAll(arrayList2);
            }
        }
        if (arrayList.size() - arrayList2.size() != 0) {
            IMUIManager.a();
            this.h.size();
        }
        return arrayList;
    }

    private boolean d(IMMessage iMMessage) {
        com.sankuai.xm.imui.session.entity.a w;
        boolean z = true;
        Object[] objArr = {iMMessage};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0169808b52d06b56dabfedd0a427c9cb", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0169808b52d06b56dabfedd0a427c9cb")).booleanValue();
        }
        if (iMMessage == null) {
            d.c("SessionPresenter::checkMessageStamp msg is null.", new Object[0]);
            return false;
        }
        c.b bVar = (c.b) this.b;
        if (bVar == null || (w = bVar.w()) == null) {
            return true;
        }
        if (w.b == 2 || w.c > 0) {
            long j = w.c;
            if (j == 0) {
                j = Long.MIN_VALUE;
            }
            long j2 = w.d;
            if (j2 == 0) {
                j2 = Long.MAX_VALUE;
            }
            z = (iMMessage.getSts() < j || iMMessage.getSts() > j2) ? false : false;
            if (!z) {
                d.b("SessionPresenter::checkMessageStamp sts = " + iMMessage.getSts() + "param = " + w, new Object[0]);
            }
            return z;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.sankuai.xm.imui.session.entity.b a(IMMessage iMMessage, boolean z) {
        Object[] objArr = {iMMessage, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1394ed36416c3aab94fa90175e6b826a", 6917529027641081856L)) {
            return (com.sankuai.xm.imui.session.entity.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1394ed36416c3aab94fa90175e6b826a");
        }
        synchronized (this.h) {
            int a2 = a(iMMessage.getMsgUuid());
            if (a2 >= 0) {
                com.sankuai.xm.imui.session.entity.b bVar = this.h.get(a2);
                if (iMMessage.getMsgType() != 12) {
                    iMMessage.copyTo(bVar.b);
                } else if (z) {
                    this.h.set(a2, a(iMMessage));
                } else {
                    iMMessage.copyTo(bVar.b);
                }
                return bVar;
            }
            return null;
        }
    }

    @Override // com.sankuai.xm.imui.session.c.a
    public final int a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1af02d1e21266900519f7c2e9ada6b31", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1af02d1e21266900519f7c2e9ada6b31")).intValue();
        }
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        synchronized (this.h) {
            for (int size = this.h.size() - 1; size >= 0; size--) {
                com.sankuai.xm.imui.session.entity.b bVar = this.h.get(size);
                if (bVar != null && TextUtils.equals(bVar.b(), str)) {
                    return size;
                }
            }
            return -1;
        }
    }

    private com.sankuai.xm.imui.session.entity.b a(int i) {
        Object[] objArr = {0};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf7ff49c5ad91d18578549768b1742c0", 6917529027641081856L)) {
            return (com.sankuai.xm.imui.session.entity.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf7ff49c5ad91d18578549768b1742c0");
        }
        synchronized (this.h) {
            if (this.h.size() <= 0) {
                return null;
            }
            return this.h.get(0);
        }
    }

    private com.sankuai.xm.imui.session.entity.b b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8159d3882561c94910aede7ac6f511c8", 6917529027641081856L)) {
            return (com.sankuai.xm.imui.session.entity.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8159d3882561c94910aede7ac6f511c8");
        }
        synchronized (this.h) {
            int a2 = a(str);
            if (a2 < 0 || a2 >= this.h.size()) {
                return null;
            }
            return this.h.get(a2);
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.xm.imui.session.presenter.b$b  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public class C1401b implements HistoryController.HistoryMessageCallback {
        public static ChangeQuickRedirect a;
        public int b;
        public int c;
        public com.sankuai.xm.imui.session.entity.a d;

        private C1401b() {
            Object[] objArr = {b.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7e5056262833be3970715011d2dc68a", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7e5056262833be3970715011d2dc68a");
            } else {
                this.b = 4;
            }
        }

        @Override // com.sankuai.xm.im.message.history.HistoryController.HistoryMessageCallback
        @Trace(name = "load_history_end", type = i.end)
        public final void onFailure(@TraceStatus int i, String str) {
            Object[] objArr = {Integer.valueOf(i), str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e5c6b051b382e464cd0147a3a9150450", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e5c6b051b382e464cd0147a3a9150450");
                return;
            }
            try {
                j.a(i.end, "load_history_end", (String[]) null, new Object[]{new Integer(i), str});
                j.a(new Integer(i), (String[]) null, new int[]{0}, (String[]) null, (int[]) null, (int[]) null);
                d.d("SessionPresenter::QueryOnlineHistoryMessageCallback onFaiure, code = " + i + CommonConstant.Symbol.COMMA + str, new Object[0]);
                a(i, str, null);
                j.a((Object) null);
            } catch (Throwable th) {
                j.a(th);
                throw th;
            }
        }

        @Override // com.sankuai.xm.im.message.history.HistoryController.HistoryMessageCallback
        @Trace(name = "load_history_end", type = i.end)
        public final void onSuccess(SessionId sessionId, List<IMMessage> list, boolean z) {
            Object[] objArr = {sessionId, list, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "515d728664670dfd9a94d096963f9c93", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "515d728664670dfd9a94d096963f9c93");
                return;
            }
            try {
                j.a(i.end, "load_history_end", (String[]) null, new Object[]{sessionId, list, new Boolean(z)});
                b.this.i = z;
                a(0, null, list);
                j.a((Object) null);
            } catch (Throwable th) {
                j.a(th);
                throw th;
            }
        }

        private void a(final int i, final String str, final List<IMMessage> list) {
            Object[] objArr = {Integer.valueOf(i), str, list};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b4f22a1f7fa07ffbbd5c505394e1f015", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b4f22a1f7fa07ffbbd5c505394e1f015");
                return;
            }
            d.b("SessionPresenter::QueryOnlineHistoryMessageCallback size = " + com.sankuai.xm.base.util.b.b(list), new Object[0]);
            a(list);
            com.sankuai.xm.threadpool.scheduler.a.b().a(j.a(new Runnable() { // from class: com.sankuai.xm.imui.session.presenter.b.b.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "347c059eb6ffd7b97130f111f6b247c6", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "347c059eb6ffd7b97130f111f6b247c6");
                        return;
                    }
                    List<com.sankuai.xm.imui.session.entity.b> a2 = b.this.a((List<IMMessage>) list, true);
                    if (b.this.b == null) {
                        return;
                    }
                    if (i != 0 || !b.this.i || com.sankuai.xm.base.util.b.b(a2) != 0 || C1401b.this.b != 4) {
                        ((c.b) b.this.b).a(i, str, a2, C1401b.this.b == 5 ? 4 : C1401b.this.b, b.this.i);
                    } else {
                        b.this.b(C1401b.this.c, C1401b.this.d, 5);
                    }
                }
            }));
        }

        private void a(List<IMMessage> list) {
            int msgType;
            Object[] objArr = {list};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6413933a16ec65336629fabe5dab71f7", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6413933a16ec65336629fabe5dab71f7");
            } else if (com.sankuai.xm.base.util.b.a(list)) {
            } else {
                long e = IMUIManager.a().e();
                Iterator<IMMessage> it = list.iterator();
                while (it.hasNext()) {
                    IMMessage next = it.next();
                    Object[] objArr2 = {next};
                    ChangeQuickRedirect changeQuickRedirect2 = e.a;
                    if ((PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "5fb9be1d89384fd7764994b803e8c348", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "5fb9be1d89384fd7764994b803e8c348")).booleanValue() : next != null && ((msgType = next.getMsgType()) == 2 || msgType == 13)) && next.getMsgStatus() == 9 && next.getFromUid() != e) {
                        next.setMsgStatus(11);
                        IMClient.a().a(next.getMsgUuid(), next.getMsgStatus(), next.getCategory(), (IMClient.g<Boolean>) null);
                    }
                }
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    class a extends IMClient.g<List<IMMessage>> {
        public static ChangeQuickRedirect a;
        public int b;
        public int c;
        public com.sankuai.xm.imui.session.entity.a e;

        private a() {
            Object[] objArr = {b.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fedba84d01b26ce3389757aba570a7f3", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fedba84d01b26ce3389757aba570a7f3");
            }
        }

        @Override // com.sankuai.xm.im.IMClient.g
        @Trace(name = "local_msg_show", type = i.end)
        public final /* synthetic */ void a(List<IMMessage> list) {
            final List<IMMessage> list2 = list;
            Object[] objArr = {list2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7172787b829f93d39ce3d30f330cbe26", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7172787b829f93d39ce3d30f330cbe26");
                return;
            }
            try {
                j.a(i.end, "local_msg_show", (String[]) null, new Object[]{list2});
                d.b("SessionPresenter::QueryLocalHistoryMessageCallback size = " + com.sankuai.xm.base.util.b.b(list2) + ",queryType = " + this.b, new Object[0]);
                com.sankuai.xm.threadpool.scheduler.a.b().a(j.a(new Runnable() { // from class: com.sankuai.xm.imui.session.presenter.b.a.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f57a4c3e2594ed2d5a4475af52b1910a", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f57a4c3e2594ed2d5a4475af52b1910a");
                            return;
                        }
                        List<com.sankuai.xm.imui.session.entity.b> a2 = b.this.a(list2, a.this.b == 6);
                        if (b.this.b != null) {
                            ((c.b) b.this.b).a(0, null, a2, a.this.b, true);
                            int b = com.sankuai.xm.base.util.b.b(a2);
                            com.sankuai.xm.imui.common.report.b.a(b.this.e, b.this.d, a.this.b);
                            SessionParams sessionParams = com.sankuai.xm.imui.session.b.b(((c.b) b.this.b).getContext()).c;
                            if (b <= 0 || a.this.b != 3) {
                                if ((a.this.b != 1 || sessionParams == null || sessionParams.l) && b < a.this.c) {
                                    b.this.b(a.this.c - b, a.this.e, 4);
                                }
                            }
                        }
                    }
                }));
                j.a((Object) null);
            } catch (Throwable th) {
                j.a(th);
                throw th;
            }
        }
    }
}

package com.sankuai.xm.imui;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.xm.base.f;
import com.sankuai.xm.base.g;
import com.sankuai.xm.base.k;
import com.sankuai.xm.base.service.l;
import com.sankuai.xm.base.service.m;
import com.sankuai.xm.base.trace.annotation.Trace;
import com.sankuai.xm.base.trace.annotation.TraceStatus;
import com.sankuai.xm.base.trace.i;
import com.sankuai.xm.base.trace.j;
import com.sankuai.xm.base.util.ab;
import com.sankuai.xm.group.db.PersonalDBProxy;
import com.sankuai.xm.im.IMClient;
import com.sankuai.xm.im.message.bean.IMMessage;
import com.sankuai.xm.im.message.bean.TextMessage;
import com.sankuai.xm.im.message.bean.VideoMessage;
import com.sankuai.xm.im.session.SessionId;
import com.sankuai.xm.im.utils.MessageUtils;
import com.sankuai.xm.im.vcard.h;
import com.sankuai.xm.imui.common.util.d;
import com.sankuai.xm.imui.session.SessionProvider;
import com.sankuai.xm.ui.service.internal.UIServiceRegistry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class IMUIManager extends com.sankuai.xm.login.b implements IMClient.d {
    public static ChangeQuickRedirect a;
    private static volatile IMUIManager p;
    public int b;
    private Context i;
    private volatile long j;
    private IMUIReceiver k;
    private com.sankuai.xm.imui.listener.a m;
    private g n;
    private final HashMap<String, SessionProvider> o;

    @Override // com.sankuai.xm.base.init.a
    public final String c() {
        return "IMUIManager";
    }

    public static /* synthetic */ void a(IMUIManager iMUIManager, com.sankuai.xm.im.vcard.entity.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, iMUIManager, changeQuickRedirect, false, "0ea8d8646583c16be569d1e36b0086a7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, iMUIManager, changeQuickRedirect, false, "0ea8d8646583c16be569d1e36b0086a7");
        } else if (aVar == null) {
            d.d("MessageFragment, onQueryUInfoRes, info is null", new Object[0]);
        } else {
            for (com.sankuai.xm.im.vcard.b bVar : com.sankuai.xm.imui.listener.b.a().d().values()) {
                bVar.a(aVar.e, aVar);
            }
        }
    }

    public IMUIManager() {
        super(5);
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ee734949f85755f5fc5dc71ed08dd0b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ee734949f85755f5fc5dc71ed08dd0b");
            return;
        }
        this.b = 60000;
        this.n = new k();
        this.o = new HashMap<>();
    }

    public static IMUIManager a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1b8eed954272e3e3f44c731b118a7e6c", 6917529027641081856L)) {
            return (IMUIManager) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1b8eed954272e3e3f44c731b118a7e6c");
        }
        if (p == null) {
            synchronized (IMUIManager.class) {
                if (p == null) {
                    p = new IMUIManager();
                }
            }
        }
        p.q();
        return p;
    }

    @Override // com.sankuai.xm.base.init.a
    public final void a(f fVar) {
        Object[] objArr = {fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2273585e7a5365c6a0954668f4a8acc3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2273585e7a5365c6a0954668f4a8acc3");
        } else {
            this.i = fVar.g();
        }
    }

    @Override // com.sankuai.xm.base.init.a
    public final void b(f fVar) {
        Object[] objArr = {fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b852fcb7d0b3b9d8be9523d36bbbf61", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b852fcb7d0b3b9d8be9523d36bbbf61");
            return;
        }
        this.m = new com.sankuai.xm.imui.listener.a(fVar.g());
        IMClient.a().a((IMClient.d) this);
        IMClient.a().a((short) -1, (IMClient.i) this.m);
        IMClient.a().a((short) -1, (IMClient.f) this.m);
        IMClient.a().a((short) -1, (IMClient.o) this.m);
        IMClient a2 = IMClient.a();
        com.sankuai.xm.imui.listener.a aVar = this.m;
        Object[] objArr2 = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = IMClient.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "80e7b5e0c4a0becd97014c8c7aaf1158", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "80e7b5e0c4a0becd97014c8c7aaf1158");
        } else {
            ((l) a2.D().a()).a(IMClient.n.class).a((l.a) aVar);
        }
    }

    @Override // com.sankuai.xm.base.init.a
    public final void c(f fVar) {
        Object[] objArr = {fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c9439f67f0455b353951339521496c7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c9439f67f0455b353951339521496c7");
        } else {
            m.a(PersonalDBProxy.class);
        }
    }

    @Override // com.sankuai.xm.base.init.a
    public final void d(f fVar) {
        Object[] objArr = {fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "346a2ad20803f342e08a0cf8c244e9f7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "346a2ad20803f342e08a0cf8c244e9f7");
            return;
        }
        m.a(new UIServiceRegistry());
        IMClient.a().a(this.m);
        IMClient a2 = IMClient.a();
        Object[] objArr2 = {-1};
        ChangeQuickRedirect changeQuickRedirect2 = IMClient.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "6c77aae7c7550b299d24faa4df0815ee", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "6c77aae7c7550b299d24faa4df0815ee");
        } else if (!a2.A()) {
            a2.j = -1;
        }
        b(60000);
        Context context = this.i;
        Object[] objArr3 = {context};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "508f05b17cda0abd40b4297d00a3dacd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "508f05b17cda0abd40b4297d00a3dacd");
        } else if (context != null) {
            try {
                if (this.k != null) {
                    context.unregisterReceiver(this.k);
                } else {
                    this.k = new IMUIReceiver();
                }
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
                intentFilter.addAction("android.intent.action.TIME_SET");
                context.registerReceiver(this.k, intentFilter);
            } catch (Exception e) {
                d.a(e);
                com.sankuai.xm.monitor.statistics.a.a("imui", "IMUIManager::initIMUIReceiver", e);
            }
        }
        com.sankuai.xm.imui.localconfig.a.c().d();
        if (IMClient.a().k() != 0) {
            com.sankuai.xm.video.f.a().a(IMClient.a().b(3));
        }
        com.meituan.android.clipboard.a.a(this.i);
    }

    @Override // com.sankuai.xm.base.init.a
    public final List<com.sankuai.xm.base.init.a> b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6f415c2b3ef20c2bd1e0d6ef8b51ca23", 6917529027641081856L) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6f415c2b3ef20c2bd1e0d6ef8b51ca23") : com.sankuai.xm.base.util.b.a(IMClient.a());
    }

    public final void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2817db72acab248ee9e1ffdefc02d835", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2817db72acab248ee9e1ffdefc02d835");
        } else if (!p()) {
            d.d("IMUIManager::connect, not init. ", new Object[0]);
        } else {
            IMClient.a().a(str, str2);
        }
    }

    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7cdd093366cb816568c9a4ed84e4ec5b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7cdd093366cb816568c9a4ed84e4ec5b");
        } else if (!p()) {
            d.d("IMUIManager::logoff, not init. ", new Object[0]);
        } else {
            try {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8d1a2e7160ff795dd1195a338231b7db", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8d1a2e7160ff795dd1195a338231b7db");
                } else {
                    this.j = 0L;
                    IMClient.a().z();
                }
                IMClient.a().u();
            } catch (Exception e) {
                d.d("IMUIManager::logoff, ex=" + e.getMessage(), new Object[0]);
            }
        }
    }

    @Trace(name = "biz_prepare_msg", type = i.normal)
    private int d(IMMessage iMMessage) {
        int i;
        Object[] objArr = {iMMessage};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba06d88c374bb9aca0abdbcad719ea4d", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba06d88c374bb9aca0abdbcad719ea4d")).intValue();
        }
        try {
            j.a(i.normal, "biz_prepare_msg", (String[]) null, new Object[]{iMMessage});
            if (!p()) {
                j.a(new Integer(10023));
                return 10023;
            }
            if (iMMessage instanceof TextMessage) {
                TextMessage textMessage = (TextMessage) iMMessage;
                Object[] objArr2 = {textMessage};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fdc42135bd54584696f1a3c3c0337ed3", 6917529027641081856L)) {
                    i = ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fdc42135bd54584696f1a3c3c0337ed3")).intValue();
                } else {
                    if (textMessage != null && !TextUtils.isEmpty(textMessage.getText())) {
                        String b = ab.b(textMessage.getText());
                        textMessage.setText(b);
                        i = b.length() > 500 ? 10002 : 0;
                    }
                    i = 10001;
                }
                if (i != 0) {
                    d.d("IMUIManager::sendMessage handleTextMsg failed: ret = " + i, new Object[0]);
                    j.a(new Integer(i));
                    return i;
                }
            }
            boolean z = false;
            for (com.sankuai.xm.imui.session.listener.b bVar : com.sankuai.xm.imui.listener.b.a().a(SessionId.a(iMMessage).f())) {
                z |= bVar.b(iMMessage);
            }
            if (z) {
                d.d("IMUIManager::sendMessage::unprepared.", new Object[0]);
                j.a(new Integer(-1));
                return -1;
            }
            j.a(new Integer(0));
            return 0;
        } catch (Throwable th) {
            j.a(th);
            throw th;
        }
    }

    @Trace(action = "send", name = "start_ui", traceName = "send_msg")
    @TraceStatus
    private int b(IMMessage iMMessage, boolean z) {
        Object[] objArr = {iMMessage, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b8c8eefafd594b3b7e958699fa1c224", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b8c8eefafd594b3b7e958699fa1c224")).intValue();
        }
        try {
            j.a(i.begin, "start_ui", "send_msg", 0L, "send", new Object[]{iMMessage, new Boolean(z)});
            int d = d(iMMessage);
            if (d != 0) {
                d.d("IMUIManager::checkBeforeSendMsg::res=" + d, new Object[0]);
                j.a(new Integer(d), (String[]) null, new int[]{0}, (String[]) null, (int[]) null, (int[]) null);
                j.a(new Integer(d));
                return d;
            } else if ((iMMessage instanceof VideoMessage) && ((VideoMessage) iMMessage).getOperationType() == 5) {
                int a2 = IMClient.a().a(iMMessage, z, (IMClient.m) new a());
                j.a(new Integer(a2), (String[]) null, new int[]{0}, (String[]) null, (int[]) null, (int[]) null);
                j.a(new Integer(a2));
                return a2;
            } else {
                int a3 = IMClient.a().a(iMMessage, z, (IMClient.SendMessageCallback) new a());
                j.a(new Integer(a3), (String[]) null, new int[]{0}, (String[]) null, (int[]) null, (int[]) null);
                j.a(new Integer(a3));
                return a3;
            }
        } catch (Throwable th) {
            j.a(th);
            throw th;
        }
    }

    public final int a(IMMessage iMMessage, boolean z) {
        Object[] objArr = {iMMessage, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "891669a008705e789e03767b9d433fc9", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "891669a008705e789e03767b9d433fc9")).intValue();
        }
        if (p()) {
            SessionId f = b.a().f();
            if (iMMessage == null || f == null || !f.i()) {
                d.d("IMUIManager::sendSimpleMessage::sessionId or sessionId is null, sid = %s.", f);
                return 10100;
            }
            iMMessage.setToUid(f.b);
            iMMessage.setSessionId(f);
            if (MessageUtils.isPubService(iMMessage.getCategory())) {
                iMMessage.setPeerAppId((short) 0);
                iMMessage.setToAppId((short) 0);
            } else {
                iMMessage.setToAppId(f.d);
            }
            if (iMMessage.getCategory() == 2 && f()) {
                iMMessage.setReceipt(true);
            }
            int b = b(iMMessage, z);
            if (b != 0) {
                d.d("IMUIManager::sendSimpleMessage:: failed code = %d", Integer.valueOf(b));
                for (com.sankuai.xm.imui.session.listener.b bVar : com.sankuai.xm.imui.listener.b.a().a(SessionId.a(iMMessage).f())) {
                    bVar.a(iMMessage, b);
                }
            }
            return b;
        }
        return 10023;
    }

    public final void a(List<IMMessage> list, boolean z) {
        Object[] objArr = {list, (byte) 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d9ef058b801208362a161d469911e92a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d9ef058b801208362a161d469911e92a");
        } else if (!com.sankuai.xm.base.util.b.a(list)) {
            int i = 0;
            for (final IMMessage iMMessage : list) {
                com.sankuai.xm.threadpool.scheduler.a.b().a(j.a(new Runnable() { // from class: com.sankuai.xm.imui.IMUIManager.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7fc341dbac7e2cb186c01816544f9b77", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7fc341dbac7e2cb186c01816544f9b77");
                        } else {
                            IMUIManager.this.a(iMMessage, r3);
                        }
                    }
                }), i);
                i += 600;
            }
        }
    }

    public final void a(final IMMessage iMMessage) {
        Object[] objArr = {iMMessage};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fb48bad56d49b1d1d30a373211be5229", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fb48bad56d49b1d1d30a373211be5229");
        } else {
            IMClient.a().a(iMMessage, new com.sankuai.xm.im.a<IMMessage>() { // from class: com.sankuai.xm.imui.IMUIManager.3
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.xm.base.callback.Callback
                public final /* synthetic */ void onSuccess(Object obj) {
                    final IMMessage iMMessage2 = (IMMessage) obj;
                    Object[] objArr2 = {iMMessage2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "13dc749a81e5b4c453fc0e87b3f7accf", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "13dc749a81e5b4c453fc0e87b3f7accf");
                    } else {
                        com.sankuai.xm.threadpool.scheduler.a.b().a(j.a(new Runnable() { // from class: com.sankuai.xm.imui.IMUIManager.3.1
                            public static ChangeQuickRedirect a;

                            @Override // java.lang.Runnable
                            public final void run() {
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "567128f19a150837c1b063685ab4edb0", 6917529027641081856L)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "567128f19a150837c1b063685ab4edb0");
                                    return;
                                }
                                com.sankuai.xm.imui.session.listener.a c = com.sankuai.xm.imui.listener.b.a().c(b.a().h());
                                if (c != null) {
                                    c.a(0, iMMessage2.getMsgUuid());
                                }
                            }
                        }));
                    }
                }

                @Override // com.sankuai.xm.base.callback.Callback
                public final void onFailure(final int i, String str) {
                    Object[] objArr2 = {Integer.valueOf(i), str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8ff56a519106b7cb76c852ee83f9a74e", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8ff56a519106b7cb76c852ee83f9a74e");
                    } else {
                        com.sankuai.xm.threadpool.scheduler.a.b().a(j.a(new Runnable() { // from class: com.sankuai.xm.imui.IMUIManager.3.2
                            public static ChangeQuickRedirect a;

                            @Override // java.lang.Runnable
                            public final void run() {
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "66b1a90fb357949293378cd1eaf9870f", 6917529027641081856L)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "66b1a90fb357949293378cd1eaf9870f");
                                    return;
                                }
                                com.sankuai.xm.imui.session.listener.a c = com.sankuai.xm.imui.listener.b.a().c(b.a().h());
                                if (c != null) {
                                    c.a(i, iMMessage.getMsgUuid());
                                }
                            }
                        }));
                    }
                }
            });
        }
    }

    public final int b(IMMessage iMMessage) {
        Object[] objArr = {iMMessage};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e449443b0e454a720e9bb2033cb3bf21", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e449443b0e454a720e9bb2033cb3bf21")).intValue() : IMClient.a().a(iMMessage, new a());
    }

    public final void a(@NonNull com.sankuai.xm.im.vcard.d dVar, final com.sankuai.xm.im.a<com.sankuai.xm.im.vcard.entity.a> aVar) {
        Object[] objArr = {dVar, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c488d331544f699f84d2769e3e57c23a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c488d331544f699f84d2769e3e57c23a");
        } else if (!p()) {
            if (aVar != null) {
                aVar.onFailure(10023, "");
            }
            d.d("IMUIManager::getUISessionList, not init. ", new Object[0]);
        } else {
            h.a().a(dVar, new com.sankuai.xm.im.a<com.sankuai.xm.im.vcard.entity.a>() { // from class: com.sankuai.xm.imui.IMUIManager.4
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.xm.base.callback.Callback
                public final /* synthetic */ void onSuccess(Object obj) {
                    com.sankuai.xm.im.vcard.entity.a aVar2 = (com.sankuai.xm.im.vcard.entity.a) obj;
                    Object[] objArr2 = {aVar2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ebe4344e156b2e1de690877bd13b8afb", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ebe4344e156b2e1de690877bd13b8afb");
                        return;
                    }
                    if (aVar != null) {
                        aVar.onSuccess(aVar2);
                    } else {
                        StringBuilder sb = new StringBuilder("IMUIManager=>getVCardByMessage.onSuccess=>callback = null, uiinfo:");
                        sb.append(aVar2 == null ? "" : aVar2.d);
                        d.d(sb.toString(), new Object[0]);
                    }
                    IMUIManager.a(IMUIManager.this, aVar2);
                }

                @Override // com.sankuai.xm.base.callback.Callback
                public final void onFailure(int i, String str) {
                    Object[] objArr2 = {Integer.valueOf(i), str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2bc64f668dd1dbd5a9255b18f1882137", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2bc64f668dd1dbd5a9255b18f1882137");
                        return;
                    }
                    if (aVar != null) {
                        aVar.onFailure(i, str);
                    }
                    d.d("MessageTransferManger=>getVCard=>queryUIInfo=>code:" + i + ", message:" + str, new Object[0]);
                }
            });
        }
    }

    public final void c(IMMessage iMMessage) {
        Object[] objArr = {iMMessage};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "adc9773faa8164849b1275ba26632ac9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "adc9773faa8164849b1275ba26632ac9");
        } else if (iMMessage == null) {
            d.d("IMUIManager::insertMessageOnUI params error", new Object[0]);
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.add(iMMessage);
            a(arrayList);
        }
    }

    public final int a(IMMessage iMMessage, boolean z, IMClient.g<Integer> gVar) {
        Object[] objArr = {iMMessage, Byte.valueOf(z ? (byte) 1 : (byte) 0), gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e03d6436918192afaa0dc698eb34b0f7", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e03d6436918192afaa0dc698eb34b0f7")).intValue();
        }
        if (iMMessage == null) {
            return 10011;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(iMMessage);
        return a((List<IMMessage>) arrayList, z, true, gVar);
    }

    public int a(List<IMMessage> list, boolean z, final boolean z2, final IMClient.g<Integer> gVar) {
        Object[] objArr = {list, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bebd2eff39ab677a7e07c9fad8a6e8fe", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bebd2eff39ab677a7e07c9fad8a6e8fe")).intValue();
        }
        if (p()) {
            if (com.sankuai.xm.base.util.b.a(list)) {
                return 10011;
            }
            for (IMMessage iMMessage : list) {
                if (MessageUtils.isPubService(iMMessage.getCategory())) {
                    if (iMMessage.getPeerUid() == 0) {
                        iMMessage.setPubCategory(4);
                    } else {
                        iMMessage.setPubCategory(5);
                    }
                }
            }
            IMClient.a().a(list, z, new IMClient.g<List<IMMessage>>() { // from class: com.sankuai.xm.imui.IMUIManager.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.xm.im.IMClient.g
                public final /* synthetic */ void a(List<IMMessage> list2) {
                    com.sankuai.xm.imui.session.listener.a c;
                    List<IMMessage> list3 = list2;
                    Object[] objArr2 = {list3};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e7a22ccaac8880bf38c1603ca0717c13", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e7a22ccaac8880bf38c1603ca0717c13");
                        return;
                    }
                    boolean a2 = true ^ com.sankuai.xm.base.util.b.a(list3);
                    if (z2 && a2 && (c = com.sankuai.xm.imui.listener.b.a().c(b.a().h())) != null) {
                        c.a(list3);
                    }
                    if (gVar != null) {
                        gVar.a(Integer.valueOf(a2 ? 0 : 10019));
                    }
                }

                @Override // com.sankuai.xm.im.IMClient.g, com.sankuai.xm.base.callback.Callback
                public final void onFailure(int i, String str) {
                    Object[] objArr2 = {Integer.valueOf(i), str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "faee10ac64b814f15d283def16a4c213", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "faee10ac64b814f15d283def16a4c213");
                    } else if (gVar != null) {
                        gVar.a(Integer.valueOf(i));
                    }
                }
            });
            return 0;
        }
        return 10023;
    }

    public final void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d8d8a95692d34cb95e222c81599a2e3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d8d8a95692d34cb95e222c81599a2e3");
        } else if (i > 0) {
            this.b = i;
            IMClient.a().c(i);
        }
    }

    public final long e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ed9f941fa08f4f9789e812a219ef077", 6917529027641081856L)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ed9f941fa08f4f9789e812a219ef077")).longValue();
        }
        if (this.j == 0) {
            long q = com.sankuai.xm.login.a.a().q();
            this.j = q;
            return q;
        }
        return this.j;
    }

    public final void a(String str, SessionProvider sessionProvider) {
        Object[] objArr = {str, sessionProvider};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd74327c4196a0aa8268a6b5ef196f9b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd74327c4196a0aa8268a6b5ef196f9b");
            return;
        }
        synchronized (this.o) {
            try {
                if (sessionProvider == null) {
                    this.o.remove(str);
                } else {
                    this.o.put(str, sessionProvider);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final SessionProvider a(String str) {
        SessionProvider sessionProvider;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d18a924478b83a6148252c85c33a7593", 6917529027641081856L)) {
            return (SessionProvider) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d18a924478b83a6148252c85c33a7593");
        }
        synchronized (this.o) {
            sessionProvider = this.o.get(str);
        }
        return sessionProvider;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00c8 A[Catch: Throwable -> 0x022d, TryCatch #0 {Throwable -> 0x022d, blocks: (B:6:0x003c, B:8:0x005c, B:12:0x0068, B:17:0x0073, B:19:0x0077, B:21:0x0083, B:23:0x008b, B:24:0x0093, B:26:0x0097, B:28:0x009d, B:30:0x00a5, B:32:0x00c8, B:34:0x00ce, B:35:0x00d1, B:37:0x00ff, B:55:0x01ad, B:38:0x0104, B:40:0x010e, B:41:0x0115, B:42:0x0127, B:44:0x013a, B:45:0x013f, B:47:0x0145, B:50:0x016a, B:51:0x016e, B:53:0x018b, B:57:0x01cd, B:59:0x01e6, B:60:0x01f7, B:62:0x0213), top: B:67:0x003c }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0127 A[Catch: Throwable -> 0x022d, TryCatch #0 {Throwable -> 0x022d, blocks: (B:6:0x003c, B:8:0x005c, B:12:0x0068, B:17:0x0073, B:19:0x0077, B:21:0x0083, B:23:0x008b, B:24:0x0093, B:26:0x0097, B:28:0x009d, B:30:0x00a5, B:32:0x00c8, B:34:0x00ce, B:35:0x00d1, B:37:0x00ff, B:55:0x01ad, B:38:0x0104, B:40:0x010e, B:41:0x0115, B:42:0x0127, B:44:0x013a, B:45:0x013f, B:47:0x0145, B:50:0x016a, B:51:0x016e, B:53:0x018b, B:57:0x01cd, B:59:0x01e6, B:60:0x01f7, B:62:0x0213), top: B:67:0x003c }] */
    @com.sankuai.xm.base.trace.annotation.Trace(name = "start", traceName = "enter_session")
    @com.sankuai.xm.base.trace.annotation.TraceStatus
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(android.content.Context r29, com.sankuai.xm.im.session.SessionId r30, com.sankuai.xm.imui.session.SessionProvider r31, com.sankuai.xm.imui.session.entity.SessionParams r32) {
        /*
            Method dump skipped, instructions count: 562
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.xm.imui.IMUIManager.a(android.content.Context, com.sankuai.xm.im.session.SessionId, com.sankuai.xm.imui.session.SessionProvider, com.sankuai.xm.imui.session.entity.SessionParams):int");
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public class IMUIReceiver extends BroadcastReceiver {
        public static ChangeQuickRedirect a;

        private IMUIReceiver() {
            Object[] objArr = {IMUIManager.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4385172d2f162c110c19984b8b007afd", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4385172d2f162c110c19984b8b007afd");
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Object[] objArr = {context, intent};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e97ef35218400b28c0acaeacbbd124ef", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e97ef35218400b28c0acaeacbbd124ef");
                return;
            }
            String action = intent.getAction();
            if (action == null) {
                return;
            }
            if ((action.equals("android.intent.action.TIMEZONE_CHANGED") || action.equals("android.intent.action.TIME_SET")) && IMClient.a().h() != null) {
                IMClient.a().h().n();
            }
        }
    }

    @Override // com.sankuai.xm.im.IMClient.d
    public final void a(com.sankuai.xm.im.connection.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "786663cc4b4ee1dfba41d48929116b88", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "786663cc4b4ee1dfba41d48929116b88");
            return;
        }
        d.b("IMUIManager::onStatusChanged " + bVar, new Object[0]);
        if (bVar == null || this.i == null) {
            return;
        }
        Intent intent = new Intent("com.sankuai.xm.XM_CONNECT_STATUS");
        intent.setPackage(this.i.getPackageName());
        intent.putExtra("status", bVar);
        com.sankuai.meituan.takeoutnew.util.aop.b.a(this.i, intent);
    }

    @Override // com.sankuai.xm.im.IMClient.d
    public final void a(long j, String str, String str2, String str3) {
        Object[] objArr = {new Long(j), str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d9102869e0b34ce587e1321024a0211", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d9102869e0b34ce587e1321024a0211");
            return;
        }
        d.b("IMUIManager::onConnected " + j, new Object[0]);
        if (this.n.b(0)) {
            Object[] objArr2 = {new Long(j), com.sankuai.xm.login.a.a().h()};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b4e2c8f2ad185d33591dc3f849bddeeb", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b4e2c8f2ad185d33591dc3f849bddeeb");
            } else {
                this.j = j;
            }
            IMClient.a().a(j);
            IMClient.a().a((List<SessionId>) null, (com.sankuai.xm.im.a<String>) null);
        }
    }

    @Override // com.sankuai.xm.im.IMClient.d
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e7cdac0279cd90e46ddffaccaf32601f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e7cdac0279cd90e46ddffaccaf32601f");
            return;
        }
        d.b("IMUIManager.onAuthError, code = " + i, new Object[0]);
    }

    @Override // com.sankuai.xm.im.IMClient.d
    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "07c949ae8e1ced47fe02fa9b3aec0c26", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "07c949ae8e1ced47fe02fa9b3aec0c26");
            return;
        }
        d.b("IMUIManager.onLogoff, offline = " + z, new Object[0]);
    }

    @Override // com.sankuai.xm.im.IMClient.d
    public final void a(long j, int i) {
        Object[] objArr = {new Long(j), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a2409a056bfbe5cde178b338bd24f63", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a2409a056bfbe5cde178b338bd24f63");
            return;
        }
        d.b("IMUIManager.onKickedOut, reason = " + i, new Object[0]);
    }

    public static boolean f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "98dddae7ca22da2244e0cf5fc9c76c00", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "98dddae7ca22da2244e0cf5fc9c76c00")).booleanValue();
        }
        int i = b.a().f().e;
        short s = b.a().f().g;
        return (MessageUtils.isIMPeerService(i) && IMClient.a().b(s)) || (MessageUtils.isPubService(i) && IMClient.a().c(s)) || (i == 2 && IMClient.a().d(s));
    }

    public static boolean g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "842781d998094b0a90f16fb5147d8410", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "842781d998094b0a90f16fb5147d8410")).booleanValue();
        }
        if (b.a().c() != null) {
            return b.a().c().b;
        }
        return false;
    }

    private void a(List<IMMessage> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de2710039f79673c13c6769dd1161c23", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de2710039f79673c13c6769dd1161c23");
            return;
        }
        Object[] objArr2 = {this, list};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.imbase.monitor.a.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "b8588e2224628b9e318a18e021ce6dbc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "b8588e2224628b9e318a18e021ce6dbc");
        } else {
            com.sankuai.waimai.imbase.monitor.a.a(list, true, 0);
        }
        if (!p()) {
            d.d("IMUIManager::insertMessageOnUI, not init. ", new Object[0]);
        } else if (com.sankuai.xm.base.util.b.a(list)) {
            d.d("IMUIManager::insertMessageOnUI params error", new Object[0]);
        } else {
            for (IMMessage iMMessage : list) {
                iMMessage.setMsgUuid(UUID.randomUUID().toString());
                iMMessage.setCts(iMMessage.getCts() <= 0 ? IMClient.a().h().a(System.currentTimeMillis()) : iMMessage.getCts());
                iMMessage.setSts(iMMessage.getSts() <= 0 ? iMMessage.getCts() : iMMessage.getSts());
                iMMessage.setPeerAppId(b.a().g());
            }
            com.sankuai.xm.imui.session.listener.a c = com.sankuai.xm.imui.listener.b.a().c(b.a().h());
            if (c != null) {
                c.a(list);
            }
        }
    }
}

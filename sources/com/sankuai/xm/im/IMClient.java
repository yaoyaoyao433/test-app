package com.sankuai.xm.im;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.xm.base.callback.Callback;
import com.sankuai.xm.base.component.anno.Component;
import com.sankuai.xm.base.db.g;
import com.sankuai.xm.base.service.l;
import com.sankuai.xm.base.trace.annotation.Trace;
import com.sankuai.xm.base.trace.annotation.TraceStatus;
import com.sankuai.xm.base.util.ac;
import com.sankuai.xm.base.util.k;
import com.sankuai.xm.base.util.v;
import com.sankuai.xm.base.util.w;
import com.sankuai.xm.im.IMClient;
import com.sankuai.xm.im.c;
import com.sankuai.xm.im.cache.CommonDBProxy;
import com.sankuai.xm.im.cache.DBProxy;
import com.sankuai.xm.im.cache.bean.DBMessage;
import com.sankuai.xm.im.cache.bean.DBSession;
import com.sankuai.xm.im.cache.bean.DBSyncRead;
import com.sankuai.xm.im.cache.o;
import com.sankuai.xm.im.message.bean.CancelMessage;
import com.sankuai.xm.im.message.bean.DataMessage;
import com.sankuai.xm.im.message.bean.IMMessage;
import com.sankuai.xm.im.message.bean.MediaMessage;
import com.sankuai.xm.im.message.bean.Message;
import com.sankuai.xm.im.message.bean.MessageStatisticsEntry;
import com.sankuai.xm.im.message.bean.SyncRead;
import com.sankuai.xm.im.message.history.HistoryController;
import com.sankuai.xm.im.message.history.e;
import com.sankuai.xm.im.message.opposite.GroupOppositeController;
import com.sankuai.xm.im.message.opposite.OppositeController;
import com.sankuai.xm.im.message.opposite.PubOppositeController;
import com.sankuai.xm.im.message.voice.a;
import com.sankuai.xm.im.notice.bean.IMNotice;
import com.sankuai.xm.im.session.SessionId;
import com.sankuai.xm.im.transfer.download.DownloadManager;
import com.sankuai.xm.im.utils.MessageUtils;
import com.sankuai.xm.integration.crypto.CryptoProxy;
import com.sankuai.xm.login.manager.b;
import com.tencent.open.SocialConstants;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Component
/* loaded from: classes6.dex */
public class IMClient extends com.sankuai.xm.login.b implements com.sankuai.xm.base.component.a, com.sankuai.xm.base.component.d {
    private static volatile IMClient B;
    public static ChangeQuickRedirect a;
    private com.sankuai.xm.base.component.e A;
    private final ConcurrentHashMap<String, Object> C;
    private final Object D;
    public long b;
    public long i;
    public int j;
    public Set<Short> k;
    private Context m;
    private short n;
    private long o;
    private String p;
    private String q;
    private long r;
    private boolean s;
    private boolean t;
    private volatile boolean u;
    private com.sankuai.xm.base.component.e v;
    private com.sankuai.xm.base.component.e w;
    private com.sankuai.xm.base.component.e x;
    private com.sankuai.xm.base.component.e y;
    private com.sankuai.xm.base.component.e z;

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface SendMediaMessageCallback extends SendMessageCallback {
        void a(MediaMessage mediaMessage, int i);

        @Keep
        void onProgress(MediaMessage mediaMessage, double d, double d2);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface SendMessageCallback {
        void a(IMMessage iMMessage);

        void a(IMMessage iMMessage, int i);

        @Keep
        void onFailure(IMMessage iMMessage, int i);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class a {
        public IMMessage a;
        public CancelMessage b;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface b {
        void a(List<a> list);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface c {
        int a(MediaMessage mediaMessage);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface d {
        void a(int i);

        void a(long j, int i);

        void a(long j, String str, String str2, String str3);

        void a(com.sankuai.xm.im.connection.b bVar);

        void a(boolean z);
    }

    /* compiled from: ProGuard */
    @Deprecated
    /* loaded from: classes6.dex */
    public interface e {
        void a(List<DataMessage> list, boolean z);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface f {
        void a(List<com.sankuai.xm.im.session.entry.a> list);

        void b(List<com.sankuai.xm.im.session.entry.a> list);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface h {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface i {
        void a(List<IMMessage> list, boolean z);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface j {
        void a(List<IMNotice> list);
    }

    /* compiled from: ProGuard */
    @Deprecated
    /* loaded from: classes6.dex */
    public interface k {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface l {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface m extends SendMediaMessageCallback {
        void a(IMMessage iMMessage, Callback<IMMessage> callback);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface n {
        void a();

        void a(boolean z);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface o {
        void c(List<com.sankuai.xm.im.session.entry.b> list);
    }

    public final com.sankuai.xm.base.component.e B() {
        if (this.w == null) {
            synchronized (this.D) {
                if (this.w == null) {
                    this.w = new com.sankuai.xm.base.component.e(com.sankuai.xm.im.notice.a.class, "mNoticeProcessor", this);
                }
            }
        }
        return this.w;
    }

    public final com.sankuai.xm.base.component.e C() {
        if (this.v == null) {
            synchronized (this.D) {
                if (this.v == null) {
                    this.v = new com.sankuai.xm.base.component.e(com.sankuai.xm.im.message.d.class, "mMessageProcessor", this);
                }
            }
        }
        return this.v;
    }

    public final com.sankuai.xm.base.component.e D() {
        if (this.A == null) {
            synchronized (this.D) {
                if (this.A == null) {
                    this.A = new com.sankuai.xm.base.component.e(com.sankuai.xm.base.service.l.class, "mListenerService", this);
                }
            }
        }
        return this.A;
    }

    public final com.sankuai.xm.base.component.e E() {
        if (this.y == null) {
            synchronized (this.D) {
                if (this.y == null) {
                    this.y = new com.sankuai.xm.base.component.e(com.sankuai.xm.im.session.c.class, "mSessionProcessor", this);
                }
            }
        }
        return this.y;
    }

    public final com.sankuai.xm.base.component.e F() {
        if (this.x == null) {
            synchronized (this.D) {
                if (this.x == null) {
                    this.x = new com.sankuai.xm.base.component.e(com.sankuai.xm.im.connection.a.class, "mConnectManager", this);
                }
            }
        }
        return this.x;
    }

    public final com.sankuai.xm.base.component.e G() {
        if (this.z == null) {
            synchronized (this.D) {
                if (this.z == null) {
                    this.z = new com.sankuai.xm.base.component.e(com.sankuai.xm.im.datamigrate.a.class, "mDataMigrateProcessor", this);
                }
            }
        }
        return this.z;
    }

    @Override // com.sankuai.xm.base.component.d
    public final <T> T a(String str, Class<T> cls, com.sankuai.xm.base.component.b bVar) {
        Object[] objArr = {str, cls, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "43feb69cfe54cd24866653012c478d66", 6917529027641081856L)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "43feb69cfe54cd24866653012c478d66");
        }
        Object aVar = ("mNoticeProcessor".equals(str) && cls == com.sankuai.xm.im.notice.a.class) ? new com.sankuai.xm.im.notice.a() : ("mMessageProcessor".equals(str) && cls == com.sankuai.xm.im.message.d.class) ? new com.sankuai.xm.im.message.d() : ("mSessionProcessor".equals(str) && cls == com.sankuai.xm.im.session.c.class) ? new com.sankuai.xm.im.session.c() : ("mConnectManager".equals(str) && cls == com.sankuai.xm.im.connection.a.class) ? new com.sankuai.xm.im.connection.a() : ("mDataMigrateProcessor".equals(str) && cls == com.sankuai.xm.im.datamigrate.a.class) ? new com.sankuai.xm.im.datamigrate.a() : null;
        if (aVar instanceof com.sankuai.xm.base.component.a) {
            ((com.sankuai.xm.base.component.a) aVar).a(bVar);
        }
        if (cls.isInstance(aVar)) {
            return cls.cast(aVar);
        }
        return null;
    }

    @Override // com.sankuai.xm.base.component.a
    public final void a(com.sankuai.xm.base.component.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a9ebbaeddefabd77ba25bbc1ec256cb8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a9ebbaeddefabd77ba25bbc1ec256cb8");
        } else if (bVar != null) {
            B().a(bVar);
            C().a(bVar);
            D().a(bVar);
            E().a(bVar);
            F().a(bVar);
            G().a(bVar);
        }
    }

    @Override // com.sankuai.xm.base.init.a
    public final String c() {
        return "IMClient";
    }

    public static /* synthetic */ com.sankuai.xm.im.session.c b(IMClient iMClient) {
        return (com.sankuai.xm.im.session.c) iMClient.E().a();
    }

    public static /* synthetic */ com.sankuai.xm.im.message.d c(IMClient iMClient) {
        return (com.sankuai.xm.im.message.d) iMClient.C().a();
    }

    public static /* synthetic */ com.sankuai.xm.im.connection.a d(IMClient iMClient) {
        return (com.sankuai.xm.im.connection.a) iMClient.F().a();
    }

    public IMClient() {
        super(4);
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dae4d3a96d213dfe3f5fd7e75adf7469", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dae4d3a96d213dfe3f5fd7e75adf7469");
            return;
        }
        this.C = new ConcurrentHashMap<>();
        this.D = new Object();
        this.m = null;
        this.n = (short) 0;
        this.o = 0L;
        this.p = "";
        this.q = "";
        this.r = 0L;
        this.s = true;
        this.i = Long.MAX_VALUE;
        this.j = -1;
        this.k = new HashSet();
        this.u = true;
        this.v = null;
        this.w = null;
        this.x = null;
        this.y = null;
        this.z = null;
        this.k.add((short) -1);
        this.A = null;
    }

    public static IMClient a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "601012ae377e26cfcc0ed3c36692a4b5", 6917529027641081856L)) {
            return (IMClient) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "601012ae377e26cfcc0ed3c36692a4b5");
        }
        if (B == null) {
            synchronized (IMClient.class) {
                if (B == null) {
                    B = new IMClient();
                }
            }
        }
        B.q();
        return B;
    }

    @Override // com.sankuai.xm.base.init.a
    public final void a(com.sankuai.xm.base.f fVar) {
        Object[] objArr = {fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "445846dc36e95a9cc49bdf71f5ecff31", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "445846dc36e95a9cc49bdf71f5ecff31");
            return;
        }
        this.m = fVar.g();
        this.n = fVar.c();
        this.o = fVar.b();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c546a355808873a6e240784975aca377", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c546a355808873a6e240784975aca377");
        } else {
            this.b = 7776000000L;
            if (this.n == 1) {
                this.t = true;
                this.b = 2592000000L;
                this.i = 2592000000L;
            } else {
                this.t = false;
            }
        }
        short d2 = fVar.d();
        Object[] objArr3 = {Short.valueOf(d2)};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e4f5f4c6c9d09db46b33a585ab9e8a21", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e4f5f4c6c9d09db46b33a585ab9e8a21");
        } else if (d2 >= 0) {
            HashSet hashSet = new HashSet();
            hashSet.add(Short.valueOf(d2));
            a(hashSet);
        }
        com.sankuai.xm.im.b bVar = (com.sankuai.xm.im.b) fVar.a(com.sankuai.xm.im.b.class);
        short s = this.n;
        Object[] objArr4 = {bVar, Short.valueOf(s)};
        ChangeQuickRedirect changeQuickRedirect4 = a;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "b548527281987bc6b4a00d16189748eb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "b548527281987bc6b4a00d16189748eb");
        } else if (bVar != null) {
            if (bVar.d != null) {
                g.b bVar2 = bVar.d;
                Object[] objArr5 = {bVar2};
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "5bf2a36d791234ba898dfb4488b107e0", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "5bf2a36d791234ba898dfb4488b107e0");
                } else {
                    com.sankuai.xm.base.db.g.a().a(bVar2);
                }
            }
            if (bVar.e != null) {
                a(bVar.e);
            }
            if (bVar.f != null) {
                a(bVar.f);
            }
            if (bVar.g != null) {
                com.sankuai.xm.base.db.e eVar = bVar.g;
                Object[] objArr6 = {eVar};
                ChangeQuickRedirect changeQuickRedirect6 = a;
                if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "98998c132eb6e52f57707857654f846c", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "98998c132eb6e52f57707857654f846c");
                } else if (!A()) {
                    DBProxy.a(eVar);
                }
            }
            if (bVar.h != null) {
                boolean booleanValue = bVar.h.booleanValue();
                short a2 = com.sankuai.xm.base.j.a(s);
                Object[] objArr7 = {Byte.valueOf(booleanValue ? (byte) 1 : (byte) 0), Integer.valueOf(a2), (byte) 0};
                ChangeQuickRedirect changeQuickRedirect7 = a;
                if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "7472d6873ea9c08cefe033a60033bed4", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "7472d6873ea9c08cefe033a60033bed4");
                } else if (!A()) {
                    com.sankuai.xm.im.utils.a.b("IMClient configShark " + booleanValue + StringUtil.SPACE + ((int) a2) + " false", new Object[0]);
                    if (a2 > 0) {
                        com.sankuai.xm.network.httpurlconnection.g.a();
                    }
                }
            }
            if (bVar.i != null) {
                this.s = bVar.i.booleanValue();
            }
            if (bVar.j > 0) {
                com.sankuai.xm.monitor.report.c b2 = com.sankuai.xm.monitor.report.c.b();
                long j2 = bVar.j;
                Object[] objArr8 = {new Long(j2)};
                ChangeQuickRedirect changeQuickRedirect8 = com.sankuai.xm.monitor.report.c.a;
                if (PatchProxy.isSupport(objArr8, b2, changeQuickRedirect8, false, "dd48a8213e47892a6a92b084ffd709c5", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr8, b2, changeQuickRedirect8, false, "dd48a8213e47892a6a92b084ffd709c5");
                } else {
                    if (j2 < 15000) {
                        j2 = 15000;
                    }
                    b2.b = j2;
                }
            }
            if (bVar.k != null) {
                com.sankuai.xm.base.voicemail.a aVar = bVar.k;
                Object[] objArr9 = {aVar};
                ChangeQuickRedirect changeQuickRedirect9 = a;
                if (PatchProxy.isSupport(objArr9, this, changeQuickRedirect9, false, "c3ec08f02e9f127ed8b7a3d7eff1377e", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr9, this, changeQuickRedirect9, false, "c3ec08f02e9f127ed8b7a3d7eff1377e");
                    return;
                }
                com.sankuai.xm.base.service.b bVar3 = (com.sankuai.xm.base.service.b) com.sankuai.xm.base.service.m.a(com.sankuai.xm.base.service.b.class);
                if (bVar3 != null) {
                    bVar3.a(aVar);
                }
            }
        }
    }

    @Override // com.sankuai.xm.base.init.a
    public final void b(com.sankuai.xm.base.f fVar) {
        Object[] objArr = {fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b783d39f55369bb3ce707d088ec6d369", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b783d39f55369bb3ce707d088ec6d369");
            return;
        }
        com.sankuai.xm.base.service.m.a(com.sankuai.xm.im.message.data.b.class);
        ((com.sankuai.xm.base.service.l) D().a()).a(com.sankuai.xm.base.event.a.class).a(Integer.MAX_VALUE).a((l.a) new com.sankuai.xm.base.event.a() { // from class: com.sankuai.xm.im.IMClient.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.xm.base.event.a
            public final void a(long j2) {
                Object[] objArr2 = {new Long(j2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e0268d74e5e881ce4f638199a108dc1d", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e0268d74e5e881ce4f638199a108dc1d");
                } else {
                    IMClient.this.b(0L);
                }
            }
        });
        ((com.sankuai.xm.base.service.l) D().a()).a(b.InterfaceC1409b.class).a(Integer.MAX_VALUE).a((l.a) new b.InterfaceC1409b() { // from class: com.sankuai.xm.im.IMClient.8
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.xm.login.manager.b.InterfaceC1409b
            public final void a(String str) {
                Object[] objArr2 = {str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1dc6c60d77c18dd2ca429c07fabf9910", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1dc6c60d77c18dd2ca429c07fabf9910");
                } else {
                    com.sankuai.xm.im.transfer.upload.b.a().setUidAndToken(com.sankuai.xm.login.a.a().e(), str, com.sankuai.xm.login.a.a().k(), com.sankuai.xm.login.a.a().i());
                }
            }
        });
        I();
    }

    @Override // com.sankuai.xm.base.init.a
    public final void d(com.sankuai.xm.base.f fVar) {
        Object[] objArr = {fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "95adc3a09fcbc43d8487a0a6d123f6b4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "95adc3a09fcbc43d8487a0a6d123f6b4");
            return;
        }
        com.sankuai.xm.base.service.m.a(new IMLibRegistry());
        I();
        com.sankuai.xm.im.connection.c.b = (com.sankuai.xm.im.connection.a) F().a();
        CommonDBProxy l2 = CommonDBProxy.l();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = CommonDBProxy.j;
        if (PatchProxy.isSupport(objArr2, l2, changeQuickRedirect2, false, "cc84e68fcb5965592d3bbac53de10f90", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, l2, changeQuickRedirect2, false, "cc84e68fcb5965592d3bbac53de10f90");
        } else {
            l2.b("imkit_db.db", (Callback<Boolean>) null);
        }
        com.sankuai.xm.im.connection.a aVar = (com.sankuai.xm.im.connection.a) F().a();
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.xm.im.connection.a.a;
        if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "0ff29a84e0a87213538ed2309b6f24f5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "0ff29a84e0a87213538ed2309b6f24f5");
        } else if (((com.sankuai.xm.login.c) aVar.b().a()).l()) {
            aVar.a(com.sankuai.xm.login.a.a().e(), com.sankuai.xm.login.a.a().i(), com.sankuai.xm.login.a.a().f(), com.sankuai.xm.login.a.a().o());
        }
        com.sankuai.xm.file.proxy.d c2 = com.sankuai.xm.file.proxy.d.c();
        com.sankuai.xm.network.setting.e c3 = com.sankuai.xm.network.setting.f.a().c();
        Object[] objArr4 = {c3};
        ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.xm.file.proxy.d.h;
        if (PatchProxy.isSupport(objArr4, c2, changeQuickRedirect4, false, "4e1c7ab4c8cd252af2a24bc3b18ce5a9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr4, c2, changeQuickRedirect4, false, "4e1c7ab4c8cd252af2a24bc3b18ce5a9");
        } else {
            c2.i = c3;
            com.sankuai.xm.file.proxy.f.a(true);
            com.sankuai.xm.file.proxy.f.b();
            Object[] objArr5 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.xm.file.proxy.d.h;
            if (PatchProxy.isSupport(objArr5, c2, changeQuickRedirect5, false, "a754fb169d1b8bc0b154a5778a4ce62c", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr5, c2, changeQuickRedirect5, false, "a754fb169d1b8bc0b154a5778a4ce62c");
            } else {
                HashSet hashSet = new HashSet();
                com.sankuai.xm.network.setting.e eVar = c2.i;
                Object[] objArr6 = {hashSet, eVar};
                ChangeQuickRedirect changeQuickRedirect6 = com.sankuai.xm.file.proxy.d.h;
                if (PatchProxy.isSupport(objArr6, c2, changeQuickRedirect6, false, "f830f1c2441aca9211526500464a7baa", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr6, c2, changeQuickRedirect6, false, "f830f1c2441aca9211526500464a7baa");
                } else if (eVar == com.sankuai.xm.network.setting.e.ENV_TEST) {
                    hashSet.addAll(com.sankuai.xm.file.proxy.e.c);
                } else if (eVar == com.sankuai.xm.network.setting.e.ENV_STAGING) {
                    hashSet.addAll(com.sankuai.xm.file.proxy.e.b);
                } else {
                    hashSet.addAll(com.sankuai.xm.file.proxy.e.a);
                }
                com.sankuai.xm.file.proxy.f.a(hashSet);
            }
            Object[] objArr7 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect7 = com.sankuai.xm.file.proxy.d.h;
            if (PatchProxy.isSupport(objArr7, c2, changeQuickRedirect7, false, "708db14db031917a264976d8c19b2578", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr7, c2, changeQuickRedirect7, false, "708db14db031917a264976d8c19b2578");
            } else {
                HashSet<String> hashSet2 = new HashSet<>();
                c2.a(hashSet2);
                com.sankuai.xm.file.proxy.f.a(hashSet2);
            }
        }
        com.sankuai.xm.file.proxy.b b2 = com.sankuai.xm.file.proxy.b.b();
        com.sankuai.xm.network.setting.e c4 = com.sankuai.xm.network.setting.f.a().c();
        Object[] objArr8 = {c4};
        ChangeQuickRedirect changeQuickRedirect8 = com.sankuai.xm.file.proxy.b.a;
        if (PatchProxy.isSupport(objArr8, b2, changeQuickRedirect8, false, "d3a2bee6bb93fdcf129c2d4ec626d423", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr8, b2, changeQuickRedirect8, false, "d3a2bee6bb93fdcf129c2d4ec626d423");
        } else {
            Object[] objArr9 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect9 = com.sankuai.xm.file.proxy.b.a;
            if (PatchProxy.isSupport(objArr9, b2, changeQuickRedirect9, false, "5f1ac4ee738c1b92dbb495b6ab941a8e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr9, b2, changeQuickRedirect9, false, "5f1ac4ee738c1b92dbb495b6ab941a8e");
            } else {
                b2.d = com.sankuai.xm.network.setting.e.ENV_RELEASE;
                b2.f = false;
                b2.j = false;
                b2.k = "";
                b2.l = 0L;
                b2.m.clear();
            }
            b2.d = c4;
        }
        if (TextUtils.isEmpty(fVar.e())) {
            fVar.a(w.b(this.m));
        }
        com.sankuai.xm.monitor.c.b(fVar.e());
        com.sankuai.xm.im.notifier.a.a(this.m);
        com.sankuai.xm.im.notifier.a.a(HistoryController.HistoryMessageCallback.class, HistoryController.a.class);
        com.sankuai.xm.im.transfer.upload.b.a().init(this.m, this.n, fVar.e());
        com.sankuai.xm.im.localconfig.a.c().d();
        Context context = this.m;
        Object[] objArr10 = {context};
        ChangeQuickRedirect changeQuickRedirect10 = a;
        if (PatchProxy.isSupport(objArr10, this, changeQuickRedirect10, false, "1bcff2d6e9b01b418f63550e826b1dab", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr10, this, changeQuickRedirect10, false, "1bcff2d6e9b01b418f63550e826b1dab");
            return;
        }
        com.sankuai.xm.base.trace.j.a(w.g(context));
        com.sankuai.xm.base.trace.j.a(Message.class, new com.sankuai.xm.base.trace.b<Message>() { // from class: com.sankuai.xm.im.IMClient.4
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.xm.base.trace.b
            public final /* synthetic */ String a(Message message) {
                Message message2 = message;
                Object[] objArr11 = {message2};
                ChangeQuickRedirect changeQuickRedirect11 = a;
                if (PatchProxy.isSupport(objArr11, this, changeQuickRedirect11, false, "1e262f5c435636417125bbc20fb7c5db", 6917529027641081856L)) {
                    return (String) PatchProxy.accessDispatch(objArr11, this, changeQuickRedirect11, false, "1e262f5c435636417125bbc20fb7c5db");
                }
                return message2.getMsgUuid() + "/" + message2.getMsgId();
            }
        });
        com.sankuai.xm.base.trace.j.a(com.sankuai.xm.im.session.entry.a.class, new com.sankuai.xm.base.trace.b<com.sankuai.xm.im.session.entry.a>() { // from class: com.sankuai.xm.im.IMClient.5
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.xm.base.trace.b
            public final /* synthetic */ String a(com.sankuai.xm.im.session.entry.a aVar2) {
                com.sankuai.xm.im.session.entry.a aVar3 = aVar2;
                Object[] objArr11 = {aVar3};
                ChangeQuickRedirect changeQuickRedirect11 = a;
                if (PatchProxy.isSupport(objArr11, this, changeQuickRedirect11, false, "10977b5d3c9cfa3e2afe47739dc56ff2", 6917529027641081856L)) {
                    return (String) PatchProxy.accessDispatch(objArr11, this, changeQuickRedirect11, false, "10977b5d3c9cfa3e2afe47739dc56ff2");
                }
                return aVar3.c + CommonConstant.Symbol.COLON + aVar3.d + CommonConstant.Symbol.COLON + aVar3.b.getMsgUuid();
            }
        });
        com.sankuai.xm.base.trace.j.a(a.class, new com.sankuai.xm.base.trace.b<a>() { // from class: com.sankuai.xm.im.IMClient.6
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.xm.base.trace.b
            public final /* synthetic */ String a(a aVar2) {
                a aVar3 = aVar2;
                Object[] objArr11 = {aVar3};
                ChangeQuickRedirect changeQuickRedirect11 = a;
                if (PatchProxy.isSupport(objArr11, this, changeQuickRedirect11, false, "7edf78a0453d69181e75af5d2cff44ba", 6917529027641081856L)) {
                    return (String) PatchProxy.accessDispatch(objArr11, this, changeQuickRedirect11, false, "7edf78a0453d69181e75af5d2cff44ba");
                }
                if (aVar3.a == null) {
                    return StringUtil.NULL;
                }
                return aVar3.a.getMsgUuid() + "/" + aVar3.a.getMsgId();
            }
        });
    }

    @Override // com.sankuai.xm.base.init.a
    public final void c(com.sankuai.xm.base.f fVar) {
        Object[] objArr = {fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bebae7d667eac2c1173e164c759350d6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bebae7d667eac2c1173e164c759350d6");
        } else {
            com.sankuai.xm.base.service.m.a(DBProxy.class, CommonDBProxy.class);
        }
    }

    @Override // com.sankuai.xm.base.init.a
    public final List<com.sankuai.xm.base.init.a> b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6efdeab67791dc20144e498b9d5495cc", 6917529027641081856L) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6efdeab67791dc20144e498b9d5495cc") : com.sankuai.xm.base.util.b.a(com.sankuai.xm.d.d());
    }

    @Deprecated
    public final void a(Map<c.b, c.a> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b5b8b6f63013bbea59327724434a314", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b5b8b6f63013bbea59327724434a314");
        } else {
            com.sankuai.xm.im.c.a(map);
        }
    }

    public final boolean d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b7b09fe84f60094106368ee6f6be7614", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b7b09fe84f60094106368ee6f6be7614")).booleanValue();
        }
        A();
        String a2 = com.sankuai.xm.base.hornconfig.a.a().a("db_use_memory");
        if (TextUtils.isEmpty(a2)) {
            return this.t;
        }
        return TextUtils.equals(a2, "1");
    }

    public final boolean e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b4a558bba7f1cb398f3ce38f6af28ff7", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b4a558bba7f1cb398f3ce38f6af28ff7")).booleanValue();
        }
        if (A()) {
            com.sankuai.xm.im.utils.a.d("IMClient::isEnableCleanMsgDBBySession: uninitialized", new Object[0]);
        }
        return this.s;
    }

    public final Context f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a148230430be1ea069f4dba7824dd566", 6917529027641081856L)) {
            return (Context) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a148230430be1ea069f4dba7824dd566");
        }
        A();
        return this.m;
    }

    public final short g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7318c9e63f57016be7f5136577c8bab9", 6917529027641081856L)) {
            return ((Short) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7318c9e63f57016be7f5136577c8bab9")).shortValue();
        }
        A();
        return this.n;
    }

    public final com.sankuai.xm.login.c h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "98bf03ef72d099afdb8c508ac3e3b071", 6917529027641081856L)) {
            return (com.sankuai.xm.login.c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "98bf03ef72d099afdb8c508ac3e3b071");
        }
        if (A()) {
            return null;
        }
        return com.sankuai.xm.login.c.a();
    }

    public final com.sankuai.xm.im.message.d i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "461615a33906f2c143fe5e201e9b763a", 6917529027641081856L) ? (com.sankuai.xm.im.message.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "461615a33906f2c143fe5e201e9b763a") : (com.sankuai.xm.im.message.d) C().a();
    }

    public final com.sankuai.xm.im.session.c j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc2fb41c6e329ff2b8c1761d799e7d98", 6917529027641081856L) ? (com.sankuai.xm.im.session.c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc2fb41c6e329ff2b8c1761d799e7d98") : (com.sankuai.xm.im.session.c) E().a();
    }

    public final long k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b930955a2725802a03bb4911703d519d", 6917529027641081856L) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b930955a2725802a03bb4911703d519d")).longValue() : this.o == 0 ? com.sankuai.xm.login.a.a().e() : this.o;
    }

    public final void a(long j2) {
        Object[] objArr = {new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ef2bde904c83f5c3e50512f22362769", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ef2bde904c83f5c3e50512f22362769");
            return;
        }
        this.o = j2;
        com.sankuai.xm.login.c.a().b(j2);
        CryptoProxy.c().a(c(j2));
        com.sankuai.xm.im.utils.b.a().a(f(), j2, g());
    }

    public final String l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2494f9f33420fe4fa111a1297e9e6aa0", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2494f9f33420fe4fa111a1297e9e6aa0") : TextUtils.isEmpty(this.p) ? com.sankuai.xm.login.a.a().g() : this.p;
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7030db53438fcc69947c5917733c287c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7030db53438fcc69947c5917733c287c");
            return;
        }
        this.p = str;
        com.sankuai.xm.login.a.a().b(str);
    }

    public final void a(int i2) {
        Object[] objArr = {-1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae08c0e2bfb9197a17e92b044daeebaa", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae08c0e2bfb9197a17e92b044daeebaa");
        } else if (A()) {
        } else {
            com.sankuai.xm.im.utils.a.b("IMClient::cleanCache, config = -1", new Object[0]);
            com.sankuai.xm.base.db.g.a().a((Callback<Void>) null);
            ((com.sankuai.xm.im.session.c) E().a()).a(false);
            com.sankuai.xm.im.message.d dVar = (com.sankuai.xm.im.message.d) C().a();
            Object[] objArr2 = {(byte) 0};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.xm.im.message.d.a;
            if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "628b94100261631b4bb84b754fa7d1a5", 6917529027641081856L)) {
                ((Boolean) PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "628b94100261631b4bb84b754fa7d1a5")).booleanValue();
                return;
            }
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.xm.im.message.d.a;
            if (PatchProxy.isSupport(objArr3, dVar, changeQuickRedirect3, false, "0fb7a16de9c075fa7273870b1b32cb19", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr3, dVar, changeQuickRedirect3, false, "0fb7a16de9c075fa7273870b1b32cb19");
                return;
            }
            ((com.sankuai.xm.im.message.syncread.b) dVar.j().a()).b();
            ((HistoryController) dVar.l().a()).b();
            com.sankuai.xm.im.message.newmsg.b bVar = (com.sankuai.xm.im.message.newmsg.b) dVar.k().a();
            Object[] objArr4 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.xm.im.message.newmsg.b.a;
            if (PatchProxy.isSupport(objArr4, bVar, changeQuickRedirect4, false, "805c4e1cdca70d543dd2241d2157b891", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr4, bVar, changeQuickRedirect4, false, "805c4e1cdca70d543dd2241d2157b891");
                return;
            }
            SharedPreferences.Editor edit = com.sankuai.xm.im.utils.b.a().edit();
            if (edit == null) {
                com.sankuai.xm.im.utils.a.d("RecentMsgController::cleanVersion, SharedPreferences.Editor == null", new Object[0]);
                return;
            }
            edit.remove(bVar.a(2));
            edit.remove(bVar.a(1));
            edit.remove(bVar.a(3));
            com.sankuai.xm.im.utils.b.a(edit);
        }
    }

    public final synchronized long m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e463229e429490c9e5530b1548981f33", 6917529027641081856L)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e463229e429490c9e5530b1548981f33")).longValue();
        } else if (A()) {
            return 0L;
        } else {
            long a2 = com.sankuai.xm.c.a().a(System.currentTimeMillis());
            if (this.r != 0 && a2 <= this.r) {
                a2 = this.r + 10;
            }
            b(a2);
            return a2;
        }
    }

    public final synchronized void b(long j2) {
        Object[] objArr = {new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b54ab919e48cf2c711f99ad17d26b24b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b54ab919e48cf2c711f99ad17d26b24b");
        } else {
            this.r = j2;
        }
    }

    public final String n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "82d8d25afb0381c070318d123c0b623f", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "82d8d25afb0381c070318d123c0b623f");
        }
        if (TextUtils.isEmpty(this.q) && this.m != null) {
            this.q = b(this.m);
            CryptoProxy c2 = CryptoProxy.c();
            String str = this.q;
            Object[] objArr2 = {str};
            ChangeQuickRedirect changeQuickRedirect2 = CryptoProxy.a;
            if (PatchProxy.isSupport(objArr2, c2, changeQuickRedirect2, false, "d74ddbec805e86f6bf42271f8b99090b", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr2, c2, changeQuickRedirect2, false, "d74ddbec805e86f6bf42271f8b99090b");
            } else {
                c2.c = str;
                if (str != null && !str.endsWith(File.separator)) {
                    c2.c += File.separator;
                }
                c2.d = c2.c + ".encrypt" + File.separator;
                c2.e = c2.c + ".temp" + File.separator;
                c2.b(c2.d);
            }
        }
        return this.q;
    }

    public final String b(int i2) {
        String str;
        boolean z;
        String str2;
        String str3;
        Object[] objArr = {Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f30aa3bcde83d072763ede1c32db5b7", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f30aa3bcde83d072763ede1c32db5b7");
        }
        String n2 = n();
        if (CryptoProxy.c().a() && (i2 == 4 || i2 == 3 || i2 == 2 || i2 == 8)) {
            str = CryptoProxy.c().d;
            z = true;
        } else {
            str = n2;
            z = false;
        }
        Object[] objArr2 = {str, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3d51d9f8166741bccde8a30af40bcab8", 6917529027641081856L)) {
            str2 = (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3d51d9f8166741bccde8a30af40bcab8");
        } else {
            if (!TextUtils.isEmpty(str) && !str.endsWith(File.separator)) {
                str = str + File.separator;
            }
            if (!TextUtils.isEmpty(str) && this.o > 0) {
                if (i2 == 8) {
                    str3 = "file";
                } else if (i2 != 19) {
                    switch (i2) {
                        case 2:
                            str3 = "audio";
                            break;
                        case 3:
                            str3 = "video";
                            break;
                        case 4:
                            str3 = SocialConstants.PARAM_IMG_URL;
                            break;
                        default:
                            str3 = null;
                            break;
                    }
                } else {
                    str3 = "emotion";
                }
                if (str3 != null) {
                    str2 = str + this.o + File.separator + str3 + File.separator;
                    new File(str2).mkdirs();
                }
            }
            str2 = str;
            new File(str2).mkdirs();
        }
        if (z) {
            CryptoProxy.c().b(str2);
        }
        return str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String d(int i2) {
        String str;
        Object[] objArr = {Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "33b9867b0cb5f70c508d13bad8d9b136", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "33b9867b0cb5f70c508d13bad8d9b136");
        }
        if (A()) {
            return n();
        }
        String str2 = "files" + File.separator;
        if (i2 == 8) {
            str = "file";
        } else if (i2 != 19) {
            switch (i2) {
                case 2:
                    str = "audio";
                    break;
                case 3:
                    str = "video";
                    break;
                case 4:
                    str = SocialConstants.PARAM_IMG_URL;
                    break;
                default:
                    return com.sankuai.xm.base.util.k.k(str2).getAbsolutePath();
            }
        } else {
            str = "emotion";
        }
        return com.sankuai.xm.base.util.k.k(str2 + this.o + File.separator + str + File.separator).getAbsolutePath();
    }

    public final String s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6e77ad29590000a915daf483e4fb7b88", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6e77ad29590000a915daf483e4fb7b88");
        }
        String b2 = b(4);
        if (TextUtils.isEmpty(b2) || !new File(b2).exists()) {
            b2 = d(4);
        }
        return b2 == null ? "" : b2;
    }

    public final void a(long j2, String str) {
        Object[] objArr = {new Long(j2), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7fb66fc049cd891a56a61b549270f713", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7fb66fc049cd891a56a61b549270f713");
        } else if (A() || j2 <= 0 || TextUtils.isEmpty(str)) {
        } else {
            this.o = j2;
            com.sankuai.xm.im.connection.a aVar = (com.sankuai.xm.im.connection.a) F().a();
            Object[] objArr2 = {new Long(j2), str};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.xm.im.connection.a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "324e7474fa808eb8f1752d4b9422625f", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "324e7474fa808eb8f1752d4b9422625f");
                return;
            }
            ((com.sankuai.xm.login.c) aVar.b().a()).a(j2, str);
            aVar.a(j2);
            DBProxy.l().a(j2, false, (Callback<Boolean>) null);
        }
    }

    public final void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d0490cd81caa20445a1daf30e783cfa", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d0490cd81caa20445a1daf30e783cfa");
        } else if (A() || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
        } else {
            com.sankuai.xm.im.connection.a aVar = (com.sankuai.xm.im.connection.a) F().a();
            Object[] objArr2 = {str, str2};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.xm.im.connection.a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "48195eddcd05df080c673f0a42b7679a", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "48195eddcd05df080c673f0a42b7679a");
            } else {
                ((com.sankuai.xm.login.c) aVar.b().a()).a(str, str2);
            }
        }
    }

    public final void t() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b1dd569c06b0d645141fa5e058be5c8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b1dd569c06b0d645141fa5e058be5c8");
        } else if (A()) {
        } else {
            com.sankuai.xm.im.connection.a aVar = (com.sankuai.xm.im.connection.a) F().a();
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.xm.im.connection.a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "5ce0f2d2a382a9ea08264bb8ca06f1aa", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "5ce0f2d2a382a9ea08264bb8ca06f1aa");
            } else {
                ((com.sankuai.xm.login.c) aVar.b().a()).h();
            }
        }
    }

    public final void u() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0909028d4896ca6cb58fda0f4010015d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0909028d4896ca6cb58fda0f4010015d");
        } else if (A()) {
        } else {
            com.sankuai.xm.im.connection.a aVar = (com.sankuai.xm.im.connection.a) F().a();
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.xm.im.connection.a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "67374142b14fcd930493820298dc9455", 6917529027641081856L)) {
                ((Boolean) PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "67374142b14fcd930493820298dc9455")).booleanValue();
            } else {
                ((com.sankuai.xm.login.c) aVar.b().a()).g();
            }
        }
    }

    public final void a(String str, String str2, int i2, boolean z, String str3) {
        Object[] objArr = {str, str2, Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0), null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa28af4f40c73b3d4a7c90f46c815e67", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa28af4f40c73b3d4a7c90f46c815e67");
        } else if (A()) {
        } else {
            DownloadManager.getInstance().addDownload(new com.sankuai.xm.im.transfer.download.d(str, str2, i2, z, null));
        }
    }

    public final void a(MediaMessage mediaMessage, String str, String str2, int i2) {
        Object[] objArr = {mediaMessage, str, str2, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c3467d46bab3c57ed70347461b5e0d68", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c3467d46bab3c57ed70347461b5e0d68");
        } else if (A()) {
        } else {
            DownloadManager.getInstance().addDownload(new com.sankuai.xm.im.transfer.download.d(mediaMessage, str, str2, i2));
        }
    }

    public final void a(d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "434c7bc48794a91f6d0e229058b2fce3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "434c7bc48794a91f6d0e229058b2fce3");
        } else {
            ((com.sankuai.xm.base.service.l) D().a()).a(d.class).a((l.a) dVar);
        }
    }

    public final void b(d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d036233dfc4fd4b81ac5c8a12757229", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d036233dfc4fd4b81ac5c8a12757229");
        } else {
            ((com.sankuai.xm.base.service.l) D().a()).a(d.class).b(dVar);
        }
    }

    public final void a(short s, f fVar) {
        Object[] objArr = {Short.valueOf(s), fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be61aa3a2737ef3f6df7a8b992292d4c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be61aa3a2737ef3f6df7a8b992292d4c");
        } else {
            ((com.sankuai.xm.base.service.l) D().a()).a(f.class).a(s).a((l.a) fVar);
        }
    }

    public final void a(short s, o oVar) {
        Object[] objArr = {(short) -1, oVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8712e7451a23feb7ab1e72112262d9f1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8712e7451a23feb7ab1e72112262d9f1");
        } else {
            ((com.sankuai.xm.base.service.l) D().a()).a(o.class).a((short) -1).a((l.a) oVar);
        }
    }

    public final void a(short s, i iVar) {
        Object[] objArr = {Short.valueOf(s), iVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a4973bd447b591e0c3534c14cba8c09b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a4973bd447b591e0c3534c14cba8c09b");
        } else {
            ((com.sankuai.xm.base.service.l) D().a()).a(i.class).a(s).a((l.a) iVar);
        }
    }

    public final void b(short s, i iVar) {
        Object[] objArr = {Short.valueOf(s), iVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb5fe573014339beaad573379de58081", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb5fe573014339beaad573379de58081");
        } else {
            ((com.sankuai.xm.base.service.l) D().a()).a(i.class).a(s).b(iVar);
        }
    }

    public final void a(com.sankuai.xm.im.transfer.download.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a21e6ac87db436f683e0d54741549ae5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a21e6ac87db436f683e0d54741549ae5");
        } else {
            ((com.sankuai.xm.base.service.l) D().a()).a(com.sankuai.xm.im.transfer.download.c.class).a((l.a) cVar);
        }
    }

    @Trace(action = "send", name = "start_im", traceName = "send_msg", type = com.sankuai.xm.base.trace.i.beginNormal)
    @TraceStatus
    public final int a(IMMessage iMMessage, boolean z, SendMessageCallback sendMessageCallback) {
        Object[] objArr = {iMMessage, Byte.valueOf(z ? (byte) 1 : (byte) 0), sendMessageCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c11f48833b6fc17fbb371b54b0dc4c19", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c11f48833b6fc17fbb371b54b0dc4c19")).intValue();
        }
        try {
            com.sankuai.xm.base.trace.j.a(com.sankuai.xm.base.trace.i.beginNormal, "start_im", "send_msg", 0L, "send", new Object[]{iMMessage, new Boolean(z), sendMessageCallback});
            if (A()) {
                com.sankuai.xm.base.trace.j.a(new Integer(10023), (String[]) null, new int[]{0}, (String[]) null, (int[]) null, (int[]) null);
                com.sankuai.xm.base.trace.j.a(new Integer(10023));
                return 10023;
            }
            com.sankuai.xm.base.trace.j.a("inSession", Boolean.valueOf(((com.sankuai.xm.im.session.c) E().a()).b(SessionId.a(iMMessage))));
            int a2 = ((com.sankuai.xm.im.message.d) C().a()).a(iMMessage, z, sendMessageCallback);
            com.sankuai.xm.base.trace.j.a(new Integer(a2), (String[]) null, new int[]{0}, (String[]) null, (int[]) null, (int[]) null);
            com.sankuai.xm.base.trace.j.a(new Integer(a2));
            return a2;
        } catch (Throwable th) {
            com.sankuai.xm.base.trace.j.a(th);
            throw th;
        }
    }

    public final int a(final IMMessage iMMessage, final boolean z, m mVar) {
        Object[] objArr = {iMMessage, Byte.valueOf(z ? (byte) 1 : (byte) 0), mVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "789f1e264e9fdcb941d6d68b6b03229b", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "789f1e264e9fdcb941d6d68b6b03229b")).intValue();
        }
        if (A()) {
            return 10023;
        }
        final m mVar2 = (m) com.sankuai.xm.im.notifier.a.a(mVar, m.class, 0);
        final com.sankuai.xm.im.message.d dVar = (com.sankuai.xm.im.message.d) C().a();
        Object[] objArr2 = {iMMessage, Byte.valueOf(z ? (byte) 1 : (byte) 0), mVar2};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.xm.im.message.d.a;
        if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "48198a459720de1ea124949f354866f7", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "48198a459720de1ea124949f354866f7")).intValue();
        }
        if (mVar2 == null) {
            return dVar.a(iMMessage, z, (SendMessageCallback) null);
        }
        int a2 = dVar.a(iMMessage, z, true);
        if (a2 != 0) {
            return a2;
        }
        long currentTimeMillis = System.currentTimeMillis();
        com.sankuai.xm.threadpool.scheduler.a.b().b(com.sankuai.xm.base.trace.j.a(new Runnable() { // from class: com.sankuai.xm.im.message.d.10
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "08d05b9eaa62167c1a2eb7a851e61046", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "08d05b9eaa62167c1a2eb7a851e61046");
                    return;
                }
                iMMessage.setMsgStatus(3);
                if (!d.this.d(iMMessage)) {
                    d.this.a(iMMessage, 10019, 1, mVar2);
                    return;
                }
                mVar2.a(iMMessage, iMMessage.getMsgStatus());
                mVar2.a(iMMessage, new Callback<IMMessage>() { // from class: com.sankuai.xm.im.message.d.10.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.xm.base.callback.Callback
                    public final /* synthetic */ void onSuccess(IMMessage iMMessage2) {
                        IMMessage iMMessage3 = iMMessage2;
                        Object[] objArr4 = {iMMessage3};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "ecc3866a57beb54e16d42332949c1e2f", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "ecc3866a57beb54e16d42332949c1e2f");
                            return;
                        }
                        long cts = iMMessage3.getCts();
                        int a3 = d.this.a(iMMessage3, z, false);
                        if (a3 != 0) {
                            onFailure(a3, null);
                            return;
                        }
                        if (cts > 0) {
                            iMMessage3.setCts(cts);
                            iMMessage3.setSts(cts);
                        }
                        d.this.b(iMMessage3, mVar2);
                        d.this.b(iMMessage3, false, mVar2);
                    }

                    @Override // com.sankuai.xm.base.callback.Callback
                    public final void onFailure(int i2, String str) {
                        Object[] objArr4 = {Integer.valueOf(i2), str};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "d8dcc8a2000f72e6832b1c7fe08849b4", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "d8dcc8a2000f72e6832b1c7fe08849b4");
                        } else {
                            d.this.a(iMMessage, i2, 4, mVar2);
                        }
                    }
                });
            }
        }));
        dVar.a(currentTimeMillis);
        return a2;
    }

    @Deprecated
    public final int a(DataMessage dataMessage, SendMessageCallback sendMessageCallback) {
        Object[] objArr = {dataMessage, sendMessageCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "842d6f3f007a1516db93d51bdb11ad01", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "842d6f3f007a1516db93d51bdb11ad01")).intValue();
        }
        if (A()) {
            return 10023;
        }
        SendMessageCallback sendMessageCallback2 = (SendMessageCallback) com.sankuai.xm.im.notifier.a.a(sendMessageCallback, SendMessageCallback.class, 0);
        com.sankuai.xm.im.message.data.a d2 = ((com.sankuai.xm.im.message.d) C().a()).d();
        Object[] objArr2 = {dataMessage, sendMessageCallback2};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.xm.im.message.data.a.a;
        if (PatchProxy.isSupport(objArr2, d2, changeQuickRedirect2, false, "f9af9baf2b711445233b5d60487d77bb", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr2, d2, changeQuickRedirect2, false, "f9af9baf2b711445233b5d60487d77bb")).intValue();
        }
        Object[] objArr3 = {dataMessage, sendMessageCallback2};
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.xm.im.message.data.a.a;
        if (PatchProxy.isSupport(objArr3, d2, changeQuickRedirect3, false, "3087e797434a3b86c4300c9d8aa7bbcf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr3, d2, changeQuickRedirect3, false, "3087e797434a3b86c4300c9d8aa7bbcf");
        } else if (sendMessageCallback2 != null) {
            d2.b.b(dataMessage, sendMessageCallback2);
            sendMessageCallback2.a(dataMessage, 3);
        }
        return com.sankuai.xm.d.d().a(com.sankuai.xm.im.message.data.a.a(dataMessage));
    }

    @Trace(action = "send", name = "start", traceName = "recall_msg")
    @TraceStatus
    public final int a(IMMessage iMMessage, SendMessageCallback sendMessageCallback) {
        Object[] objArr = {iMMessage, sendMessageCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c5c20019dccce2a95e98cf503898a1e", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c5c20019dccce2a95e98cf503898a1e")).intValue();
        }
        try {
            com.sankuai.xm.base.trace.j.a(com.sankuai.xm.base.trace.i.begin, "start", "recall_msg", 0L, "send", new Object[]{iMMessage, sendMessageCallback});
            if (A()) {
                com.sankuai.xm.base.trace.j.a(new Integer(10023), (String[]) null, new int[]{0}, (String[]) null, (int[]) null, (int[]) null);
                com.sankuai.xm.base.trace.j.a(new Integer(10023));
                return 10023;
            } else if (iMMessage == null) {
                com.sankuai.xm.base.trace.j.a(new Integer(10011), (String[]) null, new int[]{0}, (String[]) null, (int[]) null, (int[]) null);
                com.sankuai.xm.base.trace.j.a(new Integer(10011));
                return 10011;
            } else {
                com.sankuai.xm.base.trace.j.a("inSession", Boolean.valueOf(((com.sankuai.xm.im.session.c) E().a()).b(SessionId.a(iMMessage))));
                int a2 = ((com.sankuai.xm.im.message.d) C().a()).a(iMMessage, (SendMessageCallback) com.sankuai.xm.im.notifier.a.a(sendMessageCallback, SendMessageCallback.class, 0));
                com.sankuai.xm.base.trace.j.a(new Integer(a2), (String[]) null, new int[]{0}, (String[]) null, (int[]) null, (int[]) null);
                com.sankuai.xm.base.trace.j.a(new Integer(a2));
                return a2;
            }
        } catch (Throwable th) {
            com.sankuai.xm.base.trace.j.a(th);
            throw th;
        }
    }

    public final void a(final IMMessage iMMessage, com.sankuai.xm.im.a<IMMessage> aVar) {
        Object[] objArr = {iMMessage, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a180f2749f47bc41fab81b51899b4de1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a180f2749f47bc41fab81b51899b4de1");
        } else if (a(aVar)) {
        } else {
            final com.sankuai.xm.im.a a2 = com.sankuai.xm.im.notifier.a.a(aVar, new IMMessage(), 1);
            final com.sankuai.xm.im.message.d dVar = (com.sankuai.xm.im.message.d) C().a();
            final com.sankuai.xm.im.a<DBMessage> aVar2 = new com.sankuai.xm.im.a<DBMessage>() { // from class: com.sankuai.xm.im.IMClient.10
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.xm.base.callback.Callback
                public final /* synthetic */ void onSuccess(Object obj) {
                    final DBMessage dBMessage = (DBMessage) obj;
                    Object[] objArr2 = {dBMessage};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7cb7880580e047f3e56f15515b647f07", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7cb7880580e047f3e56f15515b647f07");
                        return;
                    }
                    final com.sankuai.xm.im.session.c b2 = IMClient.b(IMClient.this);
                    Object[] objArr3 = {dBMessage, (byte) 0};
                    ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.xm.im.session.c.a;
                    if (PatchProxy.isSupport(objArr3, b2, changeQuickRedirect3, false, "564be61b38f48c66a0efdc4c1ce21586", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr3, b2, changeQuickRedirect3, false, "564be61b38f48c66a0efdc4c1ce21586");
                    } else if (dBMessage != null) {
                        DBProxy.l().a(com.sankuai.xm.base.trace.j.a(new Runnable() { // from class: com.sankuai.xm.im.session.c.2
                            public static ChangeQuickRedirect a;

                            @Override // java.lang.Runnable
                            public final void run() {
                                int i2 = 0;
                                Object[] objArr4 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "a965af6d978d5d72cebbd5b3a93cbe30", 6917529027641081856L)) {
                                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "a965af6d978d5d72cebbd5b3a93cbe30");
                                    return;
                                }
                                DBSession a3 = DBProxy.l().m.a(SessionId.a(dBMessage).f());
                                if (a3 != null) {
                                    if (r3 || ac.a(a3.getMsgUuid(), dBMessage.getMsgUuid())) {
                                        SessionId a4 = SessionId.a(dBMessage);
                                        c.this.d(a4);
                                        DBMessage c2 = DBProxy.l().k.c(a4);
                                        if (c2 == null) {
                                            DBProxy.l().m.a(a4);
                                            a3.setFlag(-1);
                                            c.this.f(com.sankuai.xm.im.utils.c.a(MessageUtils.dbSessionToSession(a3)));
                                            return;
                                        }
                                        if (!c.this.b(a4) && r3) {
                                            i2 = o.b.a.a(a4, 0, true);
                                        }
                                        DBSession dBSession = new DBSession(c2);
                                        dBSession.setUnRead(i2);
                                        dBSession.setFlag(-1);
                                        DBProxy.l().m.a(dBSession, (Callback<DBSession>) null);
                                        c.this.e(com.sankuai.xm.im.utils.c.a(MessageUtils.dbSessionToSession(dBSession)));
                                    }
                                }
                            }
                        }), (Callback) null);
                    }
                    if (a2 != null) {
                        a2.onSuccess(MessageUtils.dbMessageToIMMessage(dBMessage));
                    }
                }

                @Override // com.sankuai.xm.base.callback.Callback
                public final void onFailure(int i2, String str) {
                    Object[] objArr2 = {Integer.valueOf(i2), str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f09d41af92442e1f8ff8c36cb313d5e0", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f09d41af92442e1f8ff8c36cb313d5e0");
                    } else if (a2 != null) {
                        a2.onFailure(i2, str);
                    }
                }
            };
            Object[] objArr2 = {iMMessage, aVar2};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.xm.im.message.d.a;
            if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "e0e2e362b1cd136f66cbbdc4e5c4859a", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "e0e2e362b1cd136f66cbbdc4e5c4859a");
                return;
            }
            com.sankuai.xm.im.utils.a.b("MessageProcessor::deleteMessage: msg = " + iMMessage.keyParamToString(), new Object[0]);
            iMMessage.setMsgStatus(13);
            DBProxy.l().k.a(MessageUtils.imMessageToDBMessage(iMMessage), new String[]{Message.MSG_STATUS}, new Callback<DBMessage>() { // from class: com.sankuai.xm.im.message.d.3
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.xm.base.callback.Callback
                public final /* synthetic */ void onSuccess(DBMessage dBMessage) {
                    DBMessage dBMessage2 = dBMessage;
                    Object[] objArr3 = {dBMessage2};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a5a917907f1fe274c8ff2db70bdb1cac", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a5a917907f1fe274c8ff2db70bdb1cac");
                        return;
                    }
                    d.a(d.this, iMMessage, 0);
                    com.sankuai.xm.base.callback.a.a(aVar2, dBMessage2);
                }

                @Override // com.sankuai.xm.base.callback.Callback
                public final void onFailure(int i2, String str) {
                    Object[] objArr3 = {Integer.valueOf(i2), str};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "8dd9963b4b1f051fb3ea2a9d14b1a75f", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "8dd9963b4b1f051fb3ea2a9d14b1a75f");
                        return;
                    }
                    d.a(d.this, iMMessage, i2);
                    com.sankuai.xm.base.callback.a.a(aVar2, i2, str);
                }
            });
        }
    }

    @Trace(name = "load_history_start", type = com.sankuai.xm.base.trace.i.normal)
    public final void a(SessionId sessionId, long j2, long j3, int i2, @NonNull HistoryController.HistoryMessageCallback historyMessageCallback) {
        long j4 = j3;
        Object[] objArr = {sessionId, new Long(j2), new Long(j4), Integer.valueOf(i2), historyMessageCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c73e93447fd3f28fac98c0212093c80", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c73e93447fd3f28fac98c0212093c80");
            return;
        }
        try {
            com.sankuai.xm.base.trace.j.a(com.sankuai.xm.base.trace.i.normal, "load_history_start", (String[]) null, new Object[]{sessionId, new Long(j2), new Long(j4), new Integer(i2), historyMessageCallback});
            if (A()) {
                historyMessageCallback.onFailure(10023, "IMLib uninitialized");
                com.sankuai.xm.base.trace.j.a((Object) null);
                return;
            }
            if (sessionId != null && sessionId.i()) {
                HistoryController.HistoryMessageCallback historyMessageCallback2 = (HistoryController.HistoryMessageCallback) com.sankuai.xm.im.notifier.a.a(historyMessageCallback, HistoryController.HistoryMessageCallback.class, 1);
                HistoryController b2 = ((com.sankuai.xm.im.message.d) C().a()).b();
                Object[] objArr2 = {sessionId, new Long(j2), new Long(j4), Integer.valueOf(i2), historyMessageCallback2};
                ChangeQuickRedirect changeQuickRedirect2 = HistoryController.a;
                if (PatchProxy.isSupport(objArr2, b2, changeQuickRedirect2, false, "dba12b8ec50a63f34a3c246bd5285003", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, b2, changeQuickRedirect2, false, "dba12b8ec50a63f34a3c246bd5285003");
                } else {
                    int i3 = 100;
                    if (i2 > 100) {
                        com.sankuai.xm.im.utils.a.c("HistoryController::pullHistoryMsgsByTimeRange => query too much messages, limit=" + i2, new Object[0]);
                    } else {
                        i3 = i2;
                    }
                    j4 = (j4 < j2 || j4 <= 0) ? Long.MAX_VALUE : Long.MAX_VALUE;
                    long max = Math.max(0L, j2);
                    e.a aVar = new e.a();
                    aVar.b = b2.a("st-et", sessionId);
                    long a2 = a().j().a(sessionId);
                    int i4 = (a2 > 0L ? 1 : (a2 == 0L ? 0 : -1));
                    if (i4 < 0) {
                        aVar.b("fields", Collections.singletonList("chatTs"));
                        com.sankuai.xm.im.utils.a.b("HistoryController::queryMessageHistoryByTimeRange: request for chatTs.", new Object[0]);
                    } else if (i4 > 0) {
                        max = Math.max(max, a2 + 1);
                        com.sankuai.xm.im.utils.a.b("HistoryController::queryMessageHistoryByTimeRange: request is not need, url: %s, st: %s, et: %s, earliest: %s.", aVar.b, Long.valueOf(j2), Long.valueOf(j4), Long.valueOf(a2));
                        if (j4 <= a2 || j4 < max) {
                            historyMessageCallback2.onSuccess(sessionId, Collections.emptyList(), false);
                        }
                    }
                    aVar.a("st-et", new long[]{max, j4});
                    aVar.d = i3;
                    aVar.c = sessionId;
                    if (b2.a(sessionId, j4, "st-et")) {
                        aVar.g = (short) 3;
                        aVar.h = 1;
                    }
                    b2.a(aVar, sessionId, historyMessageCallback2);
                }
                com.sankuai.xm.base.trace.j.a((Object) null);
                return;
            }
            com.sankuai.xm.im.utils.a.d("IMClient is queryMessagesByTimeRange", new Object[0]);
            historyMessageCallback.onFailure(10011, "sessionId == null");
            com.sankuai.xm.base.trace.j.a((Object) null);
        } catch (Throwable th) {
            com.sankuai.xm.base.trace.j.a(th);
            throw th;
        }
    }

    @Trace(name = "load_history_start", type = com.sankuai.xm.base.trace.i.normal)
    public final void a(SessionId sessionId, long j2, long j3, int i2, boolean z, @NonNull HistoryController.HistoryMessageCallback historyMessageCallback) {
        Object[] objArr = {sessionId, new Long(j2), new Long(j3), Integer.valueOf(i2), (byte) 0, historyMessageCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f2f4a7a2e2cb3767ab87c880626da827", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f2f4a7a2e2cb3767ab87c880626da827");
            return;
        }
        try {
            com.sankuai.xm.base.trace.j.a(com.sankuai.xm.base.trace.i.normal, "load_history_start", (String[]) null, new Object[]{sessionId, new Long(j2), new Long(j3), new Integer(i2), new Boolean(false), historyMessageCallback});
            if (A()) {
                historyMessageCallback.onFailure(10023, "IMLib uninitialized");
                com.sankuai.xm.base.trace.j.a((Object) null);
                return;
            }
            if (sessionId != null && sessionId.i()) {
                if (j2 != 0 && j2 != Long.MAX_VALUE && j3 > MessageUtils.msgIdToStamp(j2)) {
                    historyMessageCallback.onFailure(10011, "allowedEarliestStamp = " + j3 + " should < time of msgId = " + j2);
                    com.sankuai.xm.base.trace.j.a((Object) null);
                    return;
                }
                ((com.sankuai.xm.im.message.d) C().a()).b().a(sessionId, j2, j3, i2, false, (HistoryController.HistoryMessageCallback) com.sankuai.xm.im.notifier.a.a(historyMessageCallback, HistoryController.HistoryMessageCallback.class, 1));
                com.sankuai.xm.base.trace.j.a((Object) null);
                return;
            }
            historyMessageCallback.onFailure(10011, "sessionId == null");
            com.sankuai.xm.base.trace.j.a((Object) null);
        } catch (Throwable th) {
            com.sankuai.xm.base.trace.j.a(th);
            throw th;
        }
    }

    public final void a(SessionId sessionId, long j2, int i2, int i3, @NonNull HistoryController.HistoryMessageCallback historyMessageCallback) {
        long j3 = j2;
        Object[] objArr = {sessionId, new Long(j3), Integer.valueOf(i2), 1, historyMessageCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf0c67eab6faf479ac4b2a08a8ef4225", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf0c67eab6faf479ac4b2a08a8ef4225");
        } else if (A()) {
            historyMessageCallback.onFailure(10023, "IMLib uninitialized");
        } else if (sessionId == null || !sessionId.i()) {
            historyMessageCallback.onFailure(10011, "sessionId is invalid");
        } else if (sessionId.e == 3 && sessionId.e() != 4) {
            historyMessageCallback.onFailure(10011, "会话不支持该操作");
        } else {
            HistoryController.HistoryMessageCallback historyMessageCallback2 = (HistoryController.HistoryMessageCallback) com.sankuai.xm.im.notifier.a.a(historyMessageCallback, HistoryController.HistoryMessageCallback.class, 1);
            HistoryController b2 = ((com.sankuai.xm.im.message.d) C().a()).b();
            Object[] objArr2 = {sessionId, new Long(j3), Integer.valueOf(i2), 1, historyMessageCallback2, (byte) 0};
            ChangeQuickRedirect changeQuickRedirect2 = HistoryController.a;
            if (PatchProxy.isSupport(objArr2, b2, changeQuickRedirect2, false, "a7f4675f2d001147b5d31361d0f8e63f", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr2, b2, changeQuickRedirect2, false, "a7f4675f2d001147b5d31361d0f8e63f");
                return;
            }
            if (j3 == 0) {
                j3 = Long.MAX_VALUE;
            }
            e.a aVar = new e.a();
            aVar.a("id", Long.valueOf(j3));
            aVar.b = b2.a("id_reverse", sessionId);
            aVar.d = i2;
            aVar.c = sessionId;
            b2.a(aVar, sessionId, new com.sankuai.xm.im.message.history.b(historyMessageCallback2, false, false));
        }
    }

    public final void a(final int i2, final String str, @NonNull g<IMMessage> gVar) {
        Object[] objArr = {Integer.valueOf(i2), str, gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "73f3c00470a39bd57ae40c1417b73a1c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "73f3c00470a39bd57ae40c1417b73a1c");
        } else if (a(gVar)) {
        } else {
            if (TextUtils.isEmpty(str)) {
                gVar.onFailure(10011, "msgUuid is null");
                return;
            }
            final com.sankuai.xm.im.a a2 = com.sankuai.xm.im.notifier.a.a(gVar, new IMMessage(), 1);
            final com.sankuai.xm.im.message.d dVar = (com.sankuai.xm.im.message.d) C().a();
            Object[] objArr2 = {Integer.valueOf(i2), str, a2};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.xm.im.message.d.a;
            if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "04b4db115c9af8257db83a2842f8d22b", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "04b4db115c9af8257db83a2842f8d22b");
            } else {
                DBProxy.l().b(com.sankuai.xm.base.trace.j.a(new Runnable() { // from class: com.sankuai.xm.im.message.d.13
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b68ed4975a1e3c60a2b5281a6426b4b2", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b68ed4975a1e3c60a2b5281a6426b4b2");
                            return;
                        }
                        DBMessage a3 = DBProxy.l().k.a(i2, str, true);
                        a2.onSuccess(a3 == null ? null : MessageUtils.dbMessageToIMMessage(a3));
                    }
                }), a2);
            }
        }
    }

    public final IMMessage a(int i2, String str, boolean z) {
        DBMessage a2;
        Object[] objArr = {Integer.valueOf(i2), str, (byte) 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "492a6a467f1a2051574d4702b57410ef", 6917529027641081856L)) {
            return (IMMessage) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "492a6a467f1a2051574d4702b57410ef");
        }
        if (A() || TextUtils.isEmpty(str) || (a2 = DBProxy.l().k.a(i2, str, true)) == null) {
            return null;
        }
        return MessageUtils.dbMessageToIMMessage(a2);
    }

    public final void a(SessionId sessionId, long j2, int i2, @NonNull g<List<IMMessage>> gVar) {
        Object[] objArr = {sessionId, new Long(j2), Integer.valueOf(i2), gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a86ef26b562546cb98710109baba4c0e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a86ef26b562546cb98710109baba4c0e");
        } else {
            a(sessionId, j2, 0L, i2, gVar);
        }
    }

    @Trace(name = "load_local_start", type = com.sankuai.xm.base.trace.i.normal)
    public final void a(SessionId sessionId, long j2, long j3, int i2, @NonNull g<List<IMMessage>> gVar) {
        Object[] objArr = {sessionId, new Long(j2), new Long(j3), Integer.valueOf(i2), gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7fa3935a5bd98495eff72c758eb5e432", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7fa3935a5bd98495eff72c758eb5e432");
            return;
        }
        try {
            com.sankuai.xm.base.trace.j.a(com.sankuai.xm.base.trace.i.normal, "load_local_start", (String[]) null, new Object[]{sessionId, new Long(j2), new Long(j3), new Integer(i2), gVar});
            if (a(gVar)) {
                com.sankuai.xm.base.trace.j.a((Object) null);
                return;
            }
            if (sessionId != null && sessionId.i()) {
                if (j2 != 0 && j2 < j3) {
                    com.sankuai.xm.base.callback.a.a(gVar, 10011, "allowedEarliest = " + j3 + " should < ts = " + j2);
                    com.sankuai.xm.base.trace.j.a((Object) null);
                    return;
                }
                ((com.sankuai.xm.im.message.d) C().a()).a(sessionId, j2, j3, i2, false, (Callback<List<IMMessage>>) com.sankuai.xm.im.notifier.a.a(gVar, Collections.emptyList(), 1));
                com.sankuai.xm.base.trace.j.a((Object) null);
                return;
            }
            com.sankuai.xm.base.callback.a.a(gVar, 10011, "sessionId is invalid");
            com.sankuai.xm.base.trace.j.a((Object) null);
        } catch (Throwable th) {
            com.sankuai.xm.base.trace.j.a(th);
            throw th;
        }
    }

    @Trace(name = "load_local_start", type = com.sankuai.xm.base.trace.i.normal)
    public final void a(SessionId sessionId, long j2, long j3, int i2, short s, @NonNull g<List<IMMessage>> gVar) {
        Object[] objArr = {sessionId, new Long(j2), new Long(j3), Integer.valueOf(i2), (short) 0, gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc708c5903952c1cd15d5d0f0728e6d5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc708c5903952c1cd15d5d0f0728e6d5");
            return;
        }
        try {
            com.sankuai.xm.base.trace.j.a(com.sankuai.xm.base.trace.i.normal, "load_local_start", (String[]) null, new Object[]{sessionId, new Long(j2), new Long(j3), new Integer(i2), new Short((short) 0), gVar});
            if (a(gVar)) {
                com.sankuai.xm.base.trace.j.a((Object) null);
                return;
            }
            if (sessionId != null && sessionId.i()) {
                if (j3 < j2 && j3 != 0) {
                    gVar.onFailure(10011, "start = " + j2 + " should < end = " + j3);
                    com.sankuai.xm.base.trace.j.a((Object) null);
                    return;
                }
                ((com.sankuai.xm.im.message.d) C().a()).a(sessionId, j2, j3, i2, (short) 0, (Callback<List<IMMessage>>) com.sankuai.xm.im.notifier.a.a(gVar, Collections.emptyList(), 1));
                com.sankuai.xm.base.trace.j.a((Object) null);
                return;
            }
            gVar.onFailure(10011, "sessionId is null");
            com.sankuai.xm.base.trace.j.a((Object) null);
        } catch (Throwable th) {
            com.sankuai.xm.base.trace.j.a(th);
            throw th;
        }
    }

    public final void a(final List<IMMessage> list, final boolean z, g<List<IMMessage>> gVar) {
        Object[] objArr = {list, Byte.valueOf(z ? (byte) 1 : (byte) 0), gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4bb9f06a51bfa4970bf30b33706cd758", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4bb9f06a51bfa4970bf30b33706cd758");
        } else if (a(gVar)) {
        } else {
            if (com.sankuai.xm.base.util.b.a(list)) {
                gVar.onFailure(10011, "messages is null");
                return;
            }
            final com.sankuai.xm.im.a a2 = com.sankuai.xm.im.notifier.a.a(gVar, Collections.emptyList(), 1);
            final com.sankuai.xm.im.message.d dVar = (com.sankuai.xm.im.message.d) C().a();
            Object[] objArr2 = {list, Byte.valueOf(z ? (byte) 1 : (byte) 0), a2};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.xm.im.message.d.a;
            if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "e230716b1ecc972d97e0e5dd11295fd9", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "e230716b1ecc972d97e0e5dd11295fd9");
                return;
            }
            Object[] objArr3 = {dVar, list, Byte.valueOf(z ? (byte) 1 : (byte) 0), a2};
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.imbase.monitor.a.a;
            if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "45c6cfe917d032c4f4d6fe321ac73c98", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "45c6cfe917d032c4f4d6fe321ac73c98");
            } else {
                com.sankuai.waimai.imbase.monitor.a.a(list, true, 1);
            }
            DBProxy.l().a(com.sankuai.xm.base.trace.j.a(new Runnable() { // from class: com.sankuai.xm.im.message.d.16
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "82003fdd3eb14630a270d4b865265c88", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "82003fdd3eb14630a270d4b865265c88");
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (IMMessage iMMessage : list) {
                        if (d.this.b(iMMessage.getMsgType()) != null) {
                            if (TextUtils.isEmpty(iMMessage.getMsgUuid())) {
                                iMMessage.setMsgUuid(UUID.randomUUID().toString());
                            } else if (DBProxy.l().k.a(iMMessage.getCategory(), SessionId.a(iMMessage), iMMessage.getMsgUuid())) {
                                com.sankuai.xm.im.utils.a.d("MessageProcessor::insertLocalMessages, insert duplicate msg, msgUuid = " + iMMessage.getMsgUuid(), new Object[0]);
                                if (a2 != null) {
                                    a2.onFailure(10030, "duplicate msg");
                                    return;
                                }
                                return;
                            }
                            long m2 = iMMessage.getCts() <= 0 ? IMClient.a().m() : iMMessage.getCts();
                            iMMessage.setMsgId(0L);
                            iMMessage.setCts(m2);
                            iMMessage.setSts(m2);
                            iMMessage.setMsgSeqid(0L);
                            iMMessage.setMsgFlag(1L);
                            if (iMMessage.getFromUid() == IMClient.a().k() || iMMessage.getFromUid() == 0) {
                                if (com.sankuai.xm.network.setting.f.a().d() != 1) {
                                    iMMessage.setMsgStatus(5);
                                    iMMessage.setMsgOppositeStatus(1);
                                }
                                com.sankuai.xm.im.message.handler.a.d(iMMessage);
                            } else if (!MessageUtils.isFinalMsgStatus(iMMessage)) {
                                iMMessage.setMsgStatus(9);
                            }
                            d dVar2 = d.this;
                            Object[] objArr5 = {iMMessage};
                            ChangeQuickRedirect changeQuickRedirect5 = d.a;
                            if (PatchProxy.isSupport(objArr5, dVar2, changeQuickRedirect5, false, "e64f5899d33e5480273dbb254a1394c2", 6917529027641081856L)) {
                                PatchProxy.accessDispatch(objArr5, dVar2, changeQuickRedirect5, false, "e64f5899d33e5480273dbb254a1394c2");
                            } else if (iMMessage.getMsgType() == 12) {
                                iMMessage.setMsgStatus(9);
                                com.sankuai.xm.im.utils.a.b("MessageProcessor::checkMsgStatus, msgUuid=" + iMMessage.getMsgUuid() + ", event msg, set read", new Object[0]);
                            } else if (iMMessage.getFromUid() != IMClient.a().k()) {
                                if (IMClient.a().j().b(SessionId.a(iMMessage)) && iMMessage.getMsgStatus() == 7) {
                                    iMMessage.setMsgStatus(9);
                                    com.sankuai.xm.im.utils.a.b("MessageProcessor::checkMsgStatus, msgUuid=" + iMMessage.getMsgUuid() + ", in session, set read", new Object[0]);
                                } else {
                                    try {
                                        DBSyncRead a3 = DBProxy.l().l.a(SessionId.a(iMMessage).f());
                                        if (a3 != null && a3.getRsts() >= iMMessage.getSts()) {
                                            if (iMMessage.getMsgStatus() == 7) {
                                                iMMessage.setMsgStatus(9);
                                            }
                                        } else if (a3 == null && dVar2.a(iMMessage.getCategory(), iMMessage.getSts()) && iMMessage.getMsgStatus() == 7) {
                                            iMMessage.setMsgStatus(9);
                                            com.sankuai.xm.im.utils.a.c("MessageProcessor::checkMsgStatus => 1个月前消息且没有获取到已读同步信息，设置已读。msg: " + iMMessage.getMsgUuid() + "/" + iMMessage.getMsgId(), new Object[0]);
                                        }
                                    } catch (Exception e2) {
                                        com.sankuai.xm.im.utils.a.d("MessageProcessor::checkMsgStatus => exception: " + e2.getMessage(), new Object[0]);
                                    }
                                }
                            }
                            o.b.a.a((Message) iMMessage);
                            arrayList.add(MessageUtils.imMessageToDBMessage(iMMessage));
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        boolean a4 = DBProxy.l().k.a(arrayList, 7);
                        IMClient.a().j().c(list);
                        d.this.c(list);
                        if (a4 && z) {
                            d.this.a((List<IMMessage>) new ArrayList(list), false);
                        }
                    }
                    com.sankuai.xm.im.utils.a.b("MessageProcessor::insertLocalMessages success size:" + arrayList.size(), new Object[0]);
                    if (a2 != null) {
                        a2.onSuccess(list);
                    }
                }
            }), a2);
        }
    }

    public final void a(String str, int i2, int i3, g<Boolean> gVar) {
        Object[] objArr = {str, Integer.valueOf(i2), Integer.valueOf(i3), null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a97b212f9dc29b9300791283ccfd5eee", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a97b212f9dc29b9300791283ccfd5eee");
        } else if (a((com.sankuai.xm.im.a) null) || TextUtils.isEmpty(str) || !MessageUtils.isValidMessageStatus(i2)) {
        } else {
            final com.sankuai.xm.im.a a2 = com.sankuai.xm.im.notifier.a.a((com.sankuai.xm.im.a<Boolean>) null, Boolean.TRUE, 1);
            final com.sankuai.xm.im.message.d dVar = (com.sankuai.xm.im.message.d) C().a();
            Object[] objArr2 = {str, Integer.valueOf(i2), Integer.valueOf(i3), a2};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.xm.im.message.d.a;
            if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "63a91d4dc20975ab342f4d85e8b6fc6e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "63a91d4dc20975ab342f4d85e8b6fc6e");
                return;
            }
            DBMessage a3 = DBProxy.l().k.a(i3, str, true);
            if (a3 == null) {
                if (a2 != null) {
                    a2.onSuccess(Boolean.FALSE);
                }
            } else if (a3.getMsgStatus() != i2) {
                a3.setMsgStatus(i2);
                DBProxy.l().k.a(a3, new String[]{Message.MSG_STATUS}, new Callback<DBMessage>() { // from class: com.sankuai.xm.im.message.d.17
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.xm.base.callback.Callback
                    public final /* synthetic */ void onSuccess(DBMessage dBMessage) {
                        DBMessage dBMessage2 = dBMessage;
                        Object[] objArr3 = {dBMessage2};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "1362b8a3beea55b217bbd567e24bd7c5", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "1362b8a3beea55b217bbd567e24bd7c5");
                            return;
                        }
                        d.a(d.this, dBMessage2);
                        if (a2 != null) {
                            a2.onSuccess(Boolean.TRUE);
                        }
                    }

                    @Override // com.sankuai.xm.base.callback.Callback
                    public final void onFailure(int i4, String str2) {
                        Object[] objArr3 = {Integer.valueOf(i4), str2};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "bf479c58c5f2768ea92ef87a3b7dfb10", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "bf479c58c5f2768ea92ef87a3b7dfb10");
                            return;
                        }
                        com.sankuai.xm.im.utils.a.c("MessageProcessor::modifyMessageStatus, code = " + i4 + ",message = " + str2, new Object[0]);
                        if (a2 != null) {
                            a2.onSuccess(Boolean.FALSE);
                        }
                    }
                });
            } else if (a2 != null) {
                a2.onSuccess(Boolean.TRUE);
            }
        }
    }

    public final void a(IMMessage iMMessage, boolean z, g<IMMessage> gVar) {
        Object[] objArr = {iMMessage, Byte.valueOf(z ? (byte) 1 : (byte) 0), gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b6dedf0735680baa183468541691d17b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b6dedf0735680baa183468541691d17b");
        } else if (a(gVar)) {
        } else {
            if (iMMessage != null) {
                com.sankuai.xm.im.utils.a.b("IMClient::updateMessage, msg=%s, received=%s", iMMessage.keyParamToString(), Boolean.valueOf(z));
                ((com.sankuai.xm.im.message.d) C().a()).a(iMMessage, z, com.sankuai.xm.im.notifier.a.a(gVar, new IMMessage(), 1));
            } else if (gVar != null) {
                gVar.onFailure(10011, "更新消息体为空");
            }
        }
    }

    public final void a(short s, @NonNull g<List<com.sankuai.xm.im.session.entry.a>> gVar) {
        Object[] objArr = {Short.valueOf(s), gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a526b64e873f4762fe01fa5002148916", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a526b64e873f4762fe01fa5002148916");
        } else if (a(gVar)) {
        } else {
            ((com.sankuai.xm.im.session.c) E().a()).a(s, s == -1, com.sankuai.xm.im.notifier.a.a(gVar, Collections.emptyList(), 1));
        }
    }

    public final void a(SessionId sessionId, @NonNull g<com.sankuai.xm.im.session.entry.a> gVar) {
        Object[] objArr = {sessionId, gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4573e1becc2ae34ac0c15fef217987b0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4573e1becc2ae34ac0c15fef217987b0");
        } else if (a(gVar)) {
        } else {
            if (sessionId == null || !sessionId.i()) {
                gVar.onFailure(10011, "SessionId is invalid");
            } else {
                ((com.sankuai.xm.im.session.c) E().a()).a(sessionId.f(), com.sankuai.xm.im.notifier.a.a(gVar, new com.sankuai.xm.im.session.entry.a(), 1));
            }
        }
    }

    public final com.sankuai.xm.im.session.entry.a a(SessionId sessionId, boolean z) {
        Object[] objArr = {sessionId, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f544f2b9f7168f9fab8e684c39c7883c", 6917529027641081856L)) {
            return (com.sankuai.xm.im.session.entry.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f544f2b9f7168f9fab8e684c39c7883c");
        }
        if (A() || !sessionId.i()) {
            return null;
        }
        return ((com.sankuai.xm.im.session.c) E().a()).a(sessionId.f(), z);
    }

    public final void a(final short s, @NonNull com.sankuai.xm.im.a<Integer> aVar) {
        Object[] objArr = {Short.valueOf(s), aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d15e7323eeb0d109243923dd85987daf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d15e7323eeb0d109243923dd85987daf");
        } else if (a(aVar)) {
        } else {
            final com.sankuai.xm.im.a a2 = com.sankuai.xm.im.notifier.a.a((com.sankuai.xm.im.a<int>) aVar, 0, 1);
            DBProxy.l().b(com.sankuai.xm.base.trace.j.a(new Runnable() { // from class: com.sankuai.xm.im.IMClient.11
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    int a3;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9615eeb7ba1eee337b3cff6c1040a0da", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9615eeb7ba1eee337b3cff6c1040a0da");
                        return;
                    }
                    if (s == -1) {
                        com.sankuai.xm.im.session.c b2 = IMClient.b(IMClient.this);
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.xm.im.session.c.a;
                        if (PatchProxy.isSupport(objArr3, b2, changeQuickRedirect3, false, "2e39f807a957d8ce4f17900d1b610d3b", 6917529027641081856L)) {
                            a3 = ((Integer) PatchProxy.accessDispatch(objArr3, b2, changeQuickRedirect3, false, "2e39f807a957d8ce4f17900d1b610d3b")).intValue();
                        } else if (IMClient.a().a((short) -1)) {
                            a3 = DBProxy.l().m.a((short) -1);
                        } else {
                            int i2 = 0;
                            for (Short sh : IMClient.a().k) {
                                i2 += b2.a(sh.shortValue());
                            }
                            a3 = i2;
                        }
                    } else {
                        a3 = IMClient.b(IMClient.this).a(s);
                    }
                    com.sankuai.xm.im.utils.a.b("IMClient::getUnreadByChannel:: count = " + a3 + ", channel = " + ((int) s), new Object[0]);
                    a2.onSuccess(Integer.valueOf(a3));
                }
            }), a2);
        }
    }

    @Trace(action = "send", name = "start", traceName = "sync_read")
    public final void a(final SessionId sessionId) {
        Object[] objArr = {sessionId};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be1a8892cb672e41d4b7a059ad088815", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be1a8892cb672e41d4b7a059ad088815");
            return;
        }
        try {
            com.sankuai.xm.base.trace.j.a(com.sankuai.xm.base.trace.i.begin, "start", "sync_read", 0L, "send", new Object[]{sessionId});
            if (A()) {
                com.sankuai.xm.base.trace.j.a((Object) null);
                return;
            }
            if (sessionId != null && sessionId.i()) {
                com.sankuai.xm.im.session.c cVar = (com.sankuai.xm.im.session.c) E().a();
                Object[] objArr2 = {sessionId};
                ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.xm.im.session.c.a;
                if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "f94b9e3af41214ddea34b07c8a14549e", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "f94b9e3af41214ddea34b07c8a14549e");
                } else {
                    com.sankuai.xm.im.utils.a.b("SessionProcessor::joinSession info:%s", sessionId);
                    com.sankuai.xm.monitor.c.a("ilc", sessionId.f());
                    cVar.b.set(sessionId);
                    cVar.c(sessionId);
                    cVar.a(com.sankuai.xm.im.session.listener.a.a(sessionId));
                }
                ((com.sankuai.xm.im.session.c) E().a()).a(Collections.singletonList(sessionId), new com.sankuai.xm.im.a<Integer>() { // from class: com.sankuai.xm.im.IMClient.2
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.xm.base.callback.Callback
                    public final /* synthetic */ void onSuccess(Object obj) {
                        Integer num = (Integer) obj;
                        Object[] objArr3 = {num};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ade96d02be0e72193f88040e631a447c", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "ade96d02be0e72193f88040e631a447c");
                            return;
                        }
                        com.sankuai.xm.im.utils.a.b("joinSession, update unread count = " + num, new Object[0]);
                        IMClient.c(IMClient.this).a(Collections.singletonList(sessionId), (Callback<String>) null);
                        IMClient.b(IMClient.this).a(sessionId, num != null ? num.intValue() : 0);
                    }

                    @Override // com.sankuai.xm.base.callback.Callback
                    public final void onFailure(int i2, String str) {
                        Object[] objArr3 = {Integer.valueOf(i2), str};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "fd55fead412b8c70a67bbefe0337cab2", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "fd55fead412b8c70a67bbefe0337cab2");
                            return;
                        }
                        com.sankuai.xm.im.utils.a.d("joinSession,code=%d,msg=%s", Integer.valueOf(i2), str);
                        IMClient.b(IMClient.this).a(sessionId, 0);
                    }
                });
                com.sankuai.xm.base.trace.j.a((Object) null);
                return;
            }
            com.sankuai.xm.im.utils.a.d("IMClient::joinSession::error," + sessionId, new Object[0]);
            com.sankuai.xm.base.trace.j.a((Object) null);
        } catch (Throwable th) {
            com.sankuai.xm.base.trace.j.a(th);
            throw th;
        }
    }

    @Trace(action = "send", name = "start", traceName = "sync_read")
    public final void b(SessionId sessionId) {
        Object[] objArr = {sessionId};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7391114179c61959f7c08d5c388a203b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7391114179c61959f7c08d5c388a203b");
            return;
        }
        try {
            com.sankuai.xm.base.trace.j.a(com.sankuai.xm.base.trace.i.begin, "start", "sync_read", 0L, "send", new Object[]{sessionId});
            if (A()) {
                com.sankuai.xm.base.trace.j.a((Object) null);
            } else if (sessionId == null) {
                com.sankuai.xm.im.utils.a.d("IMClient::leaveSession, sessionid is null", new Object[0]);
                com.sankuai.xm.base.trace.j.a((Object) null);
            } else {
                ((com.sankuai.xm.im.message.d) C().a()).a(Collections.singletonList(sessionId), (Callback<String>) null);
                com.sankuai.xm.im.session.c cVar = (com.sankuai.xm.im.session.c) E().a();
                Object[] objArr2 = {sessionId};
                ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.xm.im.session.c.a;
                if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "0107b6b9494960732ccb53ee4117796a", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "0107b6b9494960732ccb53ee4117796a");
                } else {
                    com.sankuai.xm.im.utils.a.b("SessionProcessor::leaveSession info:%s", sessionId);
                    if (sessionId.equals(cVar.b.get())) {
                        cVar.b.set(null);
                    }
                    cVar.c(sessionId);
                    int a2 = DBProxy.l().k.a(sessionId);
                    Object[] objArr3 = {sessionId, Integer.valueOf(a2)};
                    ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.xm.im.session.c.a;
                    if (PatchProxy.isSupport(objArr3, cVar, changeQuickRedirect3, false, "8aaa0d035209568586c967c96f8a16ac", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr3, cVar, changeQuickRedirect3, false, "8aaa0d035209568586c967c96f8a16ac");
                    } else {
                        HashMap hashMap = new HashMap();
                        hashMap.put(MessageStatisticsEntry.PARAM_CHAT, sessionId.b + CommonConstant.Symbol.UNDERLINE + sessionId.c);
                        hashMap.put(MessageStatisticsEntry.PARAM_CHANNEL, Short.valueOf(sessionId.g));
                        hashMap.put(MessageStatisticsEntry.PARAM_MSG_CATEGORY, Integer.valueOf(sessionId.e));
                        hashMap.put("msg_num", Integer.valueOf(a2));
                        long b2 = DBProxy.l().k.b(sessionId);
                        long a3 = com.sankuai.xm.login.c.a().a(System.currentTimeMillis());
                        long j2 = 0;
                        if (b2 != 0 && b2 != Long.MAX_VALUE) {
                            j2 = a3 - b2;
                        }
                        com.sankuai.xm.im.utils.a.a("SessionProcessor::reportLeaveChat now = %s, minSts = %s, interval = %s", Long.valueOf(a3), Long.valueOf(b2), Long.valueOf(j2));
                        hashMap.put("interval", Long.valueOf(j2));
                        com.sankuai.xm.monitor.c.a("ilc", sessionId.f(), (Map<String, Object>) hashMap);
                    }
                    DBProxy.l().k.d(sessionId);
                    a().i().b().a(sessionId);
                    cVar.a(com.sankuai.xm.im.session.listener.a.b(sessionId));
                }
                com.sankuai.xm.base.trace.j.a((Object) null);
            }
        } catch (Throwable th) {
            com.sankuai.xm.base.trace.j.a(th);
            throw th;
        }
    }

    public final void a(@NonNull SessionId sessionId, boolean z, com.sankuai.xm.im.a<Void> aVar) {
        Object[] objArr = {sessionId, Byte.valueOf(z ? (byte) 1 : (byte) 0), aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "280f82c50f293d74e9710830f1dd6b2c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "280f82c50f293d74e9710830f1dd6b2c");
        } else if (a(aVar)) {
        } else {
            ((com.sankuai.xm.im.session.c) E().a()).a(sessionId, z, com.sankuai.xm.im.notifier.a.a(aVar, (Object) null, 1));
        }
    }

    @Trace(action = "send", name = "start", traceName = "sync_read")
    public final void a(List<SessionId> list, final com.sankuai.xm.im.a<String> aVar) {
        final List<SessionId> arrayList;
        Object[] objArr = {list, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "61cb3bda772e432c42241e5dcabb460b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "61cb3bda772e432c42241e5dcabb460b");
            return;
        }
        try {
            com.sankuai.xm.base.trace.j.a(com.sankuai.xm.base.trace.i.begin, "start", "sync_read", 0L, "send", new Object[]{list, aVar});
            if (a(aVar)) {
                com.sankuai.xm.base.trace.j.a((Object) null);
                return;
            }
            if (list != null && !list.isEmpty()) {
                arrayList = list;
                final com.sankuai.xm.im.a a2 = com.sankuai.xm.im.notifier.a.a(aVar, "", 1);
                ((com.sankuai.xm.im.session.c) E().a()).a(arrayList, new com.sankuai.xm.im.a<Integer>() { // from class: com.sankuai.xm.im.IMClient.3
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.xm.base.callback.Callback
                    public final /* synthetic */ void onSuccess(Object obj) {
                        Object[] objArr2 = {(Integer) obj};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ee63a387307ad0bf1cc6c7e360ef9ce5", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ee63a387307ad0bf1cc6c7e360ef9ce5");
                        } else {
                            IMClient.c(IMClient.this).a(arrayList, a2);
                        }
                    }

                    @Override // com.sankuai.xm.base.callback.Callback
                    public final void onFailure(int i2, String str) {
                        Object[] objArr2 = {Integer.valueOf(i2), str};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "726cbf2f3660e835db63874e1a492624", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "726cbf2f3660e835db63874e1a492624");
                        } else {
                            com.sankuai.xm.base.callback.a.a(aVar, i2, str);
                        }
                    }
                });
                com.sankuai.xm.base.trace.j.a((Object) null);
            }
            arrayList = new ArrayList<>();
            SessionId c2 = ((com.sankuai.xm.im.session.c) E().a()).c();
            if (c2 != null) {
                arrayList.add(c2);
            }
            final com.sankuai.xm.im.a a22 = com.sankuai.xm.im.notifier.a.a(aVar, "", 1);
            ((com.sankuai.xm.im.session.c) E().a()).a(arrayList, new com.sankuai.xm.im.a<Integer>() { // from class: com.sankuai.xm.im.IMClient.3
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.xm.base.callback.Callback
                public final /* synthetic */ void onSuccess(Object obj) {
                    Object[] objArr2 = {(Integer) obj};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ee63a387307ad0bf1cc6c7e360ef9ce5", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ee63a387307ad0bf1cc6c7e360ef9ce5");
                    } else {
                        IMClient.c(IMClient.this).a(arrayList, a22);
                    }
                }

                @Override // com.sankuai.xm.base.callback.Callback
                public final void onFailure(int i2, String str) {
                    Object[] objArr2 = {Integer.valueOf(i2), str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "726cbf2f3660e835db63874e1a492624", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "726cbf2f3660e835db63874e1a492624");
                    } else {
                        com.sankuai.xm.base.callback.a.a(aVar, i2, str);
                    }
                }
            });
            com.sankuai.xm.base.trace.j.a((Object) null);
        } catch (Throwable th) {
            com.sankuai.xm.base.trace.j.a(th);
            throw th;
        }
    }

    public final SyncRead c(SessionId sessionId) {
        Object[] objArr = {sessionId};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "61f4e8f8fea0f2db7842bfd51055836a", 6917529027641081856L)) {
            return (SyncRead) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "61f4e8f8fea0f2db7842bfd51055836a");
        }
        if (A()) {
            return null;
        }
        com.sankuai.xm.im.message.d dVar = (com.sankuai.xm.im.message.d) C().a();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.xm.im.message.d.a;
        com.sankuai.xm.im.message.syncread.b bVar = PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "379d4c4595c50d962d298c624ea8b99c", 6917529027641081856L) ? (com.sankuai.xm.im.message.syncread.b) PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "379d4c4595c50d962d298c624ea8b99c") : (com.sankuai.xm.im.message.syncread.b) dVar.j().a();
        Object[] objArr3 = {sessionId};
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.xm.im.message.syncread.b.a;
        if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "aba88e5dec291510917abcfbca2b2a33", 6917529027641081856L)) {
            return (SyncRead) PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "aba88e5dec291510917abcfbca2b2a33");
        }
        if (sessionId == null) {
            return null;
        }
        return DBProxy.l().l.a(sessionId.f());
    }

    public final void a(SessionId sessionId, long j2, HistoryController.HistoryMessageCallback historyMessageCallback) {
        Object[] objArr = {sessionId, new Long(j2), null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fde5caaf004da63999969b0ada293e23", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fde5caaf004da63999969b0ada293e23");
        } else if (!A() && sessionId != null && sessionId.i() && j2 > 0) {
            ((com.sankuai.xm.im.message.d) C().a()).b().a(sessionId, j2, (HistoryController.HistoryMessageCallback) com.sankuai.xm.im.notifier.a.a((Object) null, HistoryController.HistoryMessageCallback.class, 1));
        }
    }

    public final void a(j jVar) {
        Object[] objArr = {jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ddb577e712c99cf21300f01ebaa305ce", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ddb577e712c99cf21300f01ebaa305ce");
        } else {
            ((com.sankuai.xm.base.service.l) D().a()).a(j.class).a((l.a) jVar);
        }
    }

    public final int a(com.sankuai.xm.base.voicemail.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9252ee3e97018c9168b065b18e7d523a", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9252ee3e97018c9168b065b18e7d523a")).intValue();
        }
        if (A()) {
            return 10023;
        }
        com.sankuai.xm.im.message.voice.a i2 = ((com.sankuai.xm.im.message.d) C().a()).i();
        Object[] objArr2 = {cVar};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.xm.im.message.voice.a.a;
        if (PatchProxy.isSupport(objArr2, i2, changeQuickRedirect2, false, "67e06e6526c25712b3477dc0a2ca0e8e", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr2, i2, changeQuickRedirect2, false, "67e06e6526c25712b3477dc0a2ca0e8e")).intValue();
        }
        if (v.a(a().f(), false)) {
            if (i2.b != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(a().b(2));
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.xm.im.message.voice.a.a;
                sb.append(PatchProxy.isSupport(objArr3, i2, changeQuickRedirect3, false, "e145d3894eeacc72160309a78ca61fbe", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr3, i2, changeQuickRedirect3, false, "e145d3894eeacc72160309a78ca61fbe") : UUID.randomUUID().toString());
                sb.append(".amr");
                String sb2 = sb.toString();
                if (CryptoProxy.c().c(sb2)) {
                    cVar = new a.b(cVar);
                }
                i2.b.a(sb2, cVar);
                return 0;
            }
            return 10100;
        }
        return 10017;
    }

    public final void v() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5fbc86c7b85af6ae7820d8b08fd69d88", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5fbc86c7b85af6ae7820d8b08fd69d88");
        } else if (A()) {
        } else {
            com.sankuai.xm.im.message.voice.a i2 = ((com.sankuai.xm.im.message.d) C().a()).i();
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.xm.im.message.voice.a.a;
            if (PatchProxy.isSupport(objArr2, i2, changeQuickRedirect2, false, "b370097d9e88fdc0d43b048b66e9f628", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr2, i2, changeQuickRedirect2, false, "b370097d9e88fdc0d43b048b66e9f628");
            } else if (i2.b != null) {
                i2.b.b();
            }
        }
    }

    public final void w() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4eb2a62b604d24eeb0ea8160503386a0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4eb2a62b604d24eeb0ea8160503386a0");
        } else if (A()) {
        } else {
            com.sankuai.xm.im.message.voice.a i2 = ((com.sankuai.xm.im.message.d) C().a()).i();
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.xm.im.message.voice.a.a;
            if (PatchProxy.isSupport(objArr2, i2, changeQuickRedirect2, false, "9477a719628beb3ea0200815b3835d6d", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr2, i2, changeQuickRedirect2, false, "9477a719628beb3ea0200815b3835d6d");
            } else if (i2.b != null) {
                i2.b.c();
            }
        }
    }

    public final void x() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "530340f659ecec210592f2ef869ad971", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "530340f659ecec210592f2ef869ad971");
        } else if (A()) {
        } else {
            com.sankuai.xm.im.message.voice.a i2 = ((com.sankuai.xm.im.message.d) C().a()).i();
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.xm.im.message.voice.a.a;
            if (PatchProxy.isSupport(objArr2, i2, changeQuickRedirect2, false, "b473a037f55883dbfef7692e455d942b", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr2, i2, changeQuickRedirect2, false, "b473a037f55883dbfef7692e455d942b");
            } else if (i2.b != null) {
                i2.b.d();
                i2.a(i2.d);
                i2.d = null;
                i2.c = null;
            }
        }
    }

    public final void a(String str, final String str2, com.sankuai.xm.base.voicemail.b bVar) {
        Object[] objArr = {str, str2, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "457ea7d40239c2030ba813afbfb4451a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "457ea7d40239c2030ba813afbfb4451a");
        } else if (A()) {
        } else {
            final com.sankuai.xm.im.message.voice.a i2 = ((com.sankuai.xm.im.message.d) C().a()).i();
            Object[] objArr2 = {str, str2, bVar};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.xm.im.message.voice.a.a;
            if (PatchProxy.isSupport(objArr2, i2, changeQuickRedirect2, false, "6193e2dc0973bb9a503721f9133aa33e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr2, i2, changeQuickRedirect2, false, "6193e2dc0973bb9a503721f9133aa33e");
            } else if (i2.b != null) {
                com.sankuai.xm.im.utils.a.b("IMMgr.playVoiceMail, msguuid=%s, file=%s", str, str2);
                if (CryptoProxy.c().d(str2)) {
                    final String a2 = CryptoProxy.c().a(str2);
                    i2.c = new a.C1393a(bVar, a2);
                    i2.d = a2;
                    com.sankuai.xm.threadpool.scheduler.a.b().a(24, 3, com.sankuai.xm.base.trace.j.a(new Runnable() { // from class: com.sankuai.xm.im.message.voice.a.1
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "928e768e848b126e0b5e208eebbeac60", 6917529027641081856L)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "928e768e848b126e0b5e208eebbeac60");
                            } else if (i2.d == null) {
                            } else {
                                if (CryptoProxy.c().a(str2, a2, 1) != 0) {
                                    k.t(str2);
                                    if (i2.c != null) {
                                        i2.c.onError(null, -1004, 10006);
                                        return;
                                    }
                                    return;
                                }
                                i2.b.a(a2, i2.c, 0);
                            }
                        }
                    }));
                    return;
                }
                i2.d = str2;
                i2.b.a(str2, bVar, 0);
            }
        }
    }

    public final void b(boolean z, boolean z2) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), (byte) 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "412d78185576fdda4f999a55958d2915", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "412d78185576fdda4f999a55958d2915");
        } else if (A()) {
        } else {
            com.sankuai.xm.im.message.voice.a i2 = ((com.sankuai.xm.im.message.d) C().a()).i();
            Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), (byte) 0};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.xm.im.message.voice.a.a;
            if (PatchProxy.isSupport(objArr2, i2, changeQuickRedirect2, false, "313b7088addfe8a6fa53ec4c157d1bf3", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr2, i2, changeQuickRedirect2, false, "313b7088addfe8a6fa53ec4c157d1bf3");
            } else if (i2.b != null) {
                i2.b.a(z, false);
            }
        }
    }

    public final double y() {
        int i2 = 0;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5170397a6704e8192fc34d9813860625", 6917529027641081856L)) {
            return ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5170397a6704e8192fc34d9813860625")).doubleValue();
        }
        if (A()) {
            return 0.0d;
        }
        com.sankuai.xm.im.message.voice.a i3 = ((com.sankuai.xm.im.message.d) C().a()).i();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.xm.im.message.voice.a.a;
        if (PatchProxy.isSupport(objArr2, i3, changeQuickRedirect2, false, "b88949ed90a4b15c97737565b6da0fda", 6917529027641081856L)) {
            i2 = ((Integer) PatchProxy.accessDispatch(objArr2, i3, changeQuickRedirect2, false, "b88949ed90a4b15c97737565b6da0fda")).intValue();
        } else if (i3.b != null) {
            i2 = i3.b.e();
        }
        return i2;
    }

    public final void c(int i2) {
        boolean z = true;
        Object[] objArr = {Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5dfafa72ff0c1769be287db6a246cd65", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5dfafa72ff0c1769be287db6a246cd65");
            return;
        }
        com.sankuai.xm.base.service.b bVar = (com.sankuai.xm.base.service.b) com.sankuai.xm.base.service.m.a(com.sankuai.xm.base.service.b.class);
        if (bVar != null) {
            com.sankuai.xm.base.voicemail.a aVar = new com.sankuai.xm.base.voicemail.a();
            aVar.a = i2;
            com.sankuai.xm.base.voicemail.a bT_ = bVar.bT_();
            aVar.b = (bT_ == null || !bT_.b) ? false : false;
            bVar.a(aVar);
        }
    }

    public final void z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f322bab5811ad827ca393d6ebb8705b0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f322bab5811ad827ca393d6ebb8705b0");
        } else if (A()) {
        } else {
            this.o = 0L;
            ((com.sankuai.xm.im.message.d) C().a()).a();
            ((com.sankuai.xm.im.session.c) E().a()).b();
            DBProxy l2 = DBProxy.l();
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = DBProxy.j;
            if (PatchProxy.isSupport(objArr2, l2, changeQuickRedirect2, false, "8bc096ab4a8572a96e9d66e8d8514155", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr2, l2, changeQuickRedirect2, false, "8bc096ab4a8572a96e9d66e8d8514155");
            } else {
                l2.a("0_message_db.db", (Callback<Boolean>) null);
            }
        }
    }

    public final synchronized void a(Set<Short> set) {
        Object[] objArr = {set};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "faf170962db0c5909b4df969feeaccf0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "faf170962db0c5909b4df969feeaccf0");
            return;
        }
        this.k.clear();
        if (set != null && !set.isEmpty()) {
            this.k.addAll(set);
            com.sankuai.xm.im.utils.a.b("IMClient::setSupportChannels," + this.k.toString(), new Object[0]);
        }
        this.k.add((short) -1);
        com.sankuai.xm.im.utils.a.b("IMClient::setSupportChannels," + this.k.toString(), new Object[0]);
    }

    public final boolean a(short s) {
        Object[] objArr = {Short.valueOf(s)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "edbfa3ff35f9c12c1dff2d11ce02f4d5", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "edbfa3ff35f9c12c1dff2d11ce02f4d5")).booleanValue() : this.k.contains(Short.valueOf(s)) || this.k.contains((short) -1);
    }

    public final boolean b(short s) {
        Object[] objArr = {Short.valueOf(s)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e55bead2075a81fb72a781d9f1ec356d", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e55bead2075a81fb72a781d9f1ec356d")).booleanValue();
        }
        if (A()) {
            return false;
        }
        return ((com.sankuai.xm.im.message.d) C().a()).e().a(s);
    }

    public final void a(short s, OppositeController.OnOppositeChangeListener onOppositeChangeListener) {
        Object[] objArr = {Short.valueOf(s), onOppositeChangeListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fefa52f64085fd3c7cfd5f011c33d8a0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fefa52f64085fd3c7cfd5f011c33d8a0");
        } else {
            ((com.sankuai.xm.base.service.l) D().a()).a(OppositeController.OnOppositeChangeListener.class).a(s).a((l.a) onOppositeChangeListener);
        }
    }

    public final void b(short s, OppositeController.OnOppositeChangeListener onOppositeChangeListener) {
        Object[] objArr = {Short.valueOf(s), onOppositeChangeListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9da1208121350861461f3122db9794c9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9da1208121350861461f3122db9794c9");
        } else {
            ((com.sankuai.xm.base.service.l) D().a()).a(OppositeController.OnOppositeChangeListener.class).a(s).b(onOppositeChangeListener);
        }
    }

    public final void a(@NonNull SessionId sessionId, List<Long> list, List<Long> list2) {
        Object[] objArr = {sessionId, list, list2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c60b1c5b435494cff039a7eea3332f8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c60b1c5b435494cff039a7eea3332f8");
        } else if (A()) {
        } else {
            OppositeController e2 = ((com.sankuai.xm.im.message.d) C().a()).e();
            Object[] objArr2 = {sessionId, list, list2};
            ChangeQuickRedirect changeQuickRedirect2 = OppositeController.b;
            if (PatchProxy.isSupport(objArr2, e2, changeQuickRedirect2, false, "4691c16ccdc7fb1d7e56ea3f8d5149d7", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr2, e2, changeQuickRedirect2, false, "4691c16ccdc7fb1d7e56ea3f8d5149d7");
            } else if (!e2.a(sessionId.g) || a().k() <= 0) {
            } else {
                if (!sessionId.i()) {
                    com.sankuai.xm.im.utils.a.c("OppositeController::queryOpposite session invalid, sessionId = " + sessionId, new Object[0]);
                    return;
                }
                OppositeController.d dVar = e2.d;
                Object[] objArr3 = {sessionId, list, list2};
                ChangeQuickRedirect changeQuickRedirect3 = OppositeController.d.a;
                if (PatchProxy.isSupport(objArr3, dVar, changeQuickRedirect3, false, "8127e7ce2330394fb2fdd2dc75f181e3", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr3, dVar, changeQuickRedirect3, false, "8127e7ce2330394fb2fdd2dc75f181e3");
                    return;
                }
                dVar.a(sessionId, list, list2);
                dVar.a();
            }
        }
    }

    @Trace(action = "send", name = "start", traceName = "opposite_msg")
    public final void a(@NonNull SessionId sessionId, @NonNull List<Long> list) {
        Object[] objArr = {sessionId, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe9bf4f54d47d18b4c4cb7f374d8c660", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe9bf4f54d47d18b4c4cb7f374d8c660");
            return;
        }
        try {
            com.sankuai.xm.base.trace.j.a(com.sankuai.xm.base.trace.i.begin, "start", "opposite_msg", 0L, "send", new Object[]{sessionId, list});
            if (A()) {
                com.sankuai.xm.base.trace.j.a((Object) null);
                return;
            }
            ((com.sankuai.xm.im.message.d) C().a()).e().a(sessionId, list);
            com.sankuai.xm.base.trace.j.a((Object) null);
        } catch (Throwable th) {
            com.sankuai.xm.base.trace.j.a(th);
            throw th;
        }
    }

    public final boolean c(short s) {
        Object[] objArr = {Short.valueOf(s)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f27cf3af330eacbe5d6764d5a9cfaeaf", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f27cf3af330eacbe5d6764d5a9cfaeaf")).booleanValue();
        }
        if (A()) {
            return false;
        }
        return ((com.sankuai.xm.im.message.d) C().a()).f().a(s);
    }

    public final void a(short s, PubOppositeController.PubOppositeChangeListener pubOppositeChangeListener) {
        Object[] objArr = {Short.valueOf(s), pubOppositeChangeListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7009fdf6a2f21a23ff62a4bef7fde527", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7009fdf6a2f21a23ff62a4bef7fde527");
        } else {
            ((com.sankuai.xm.base.service.l) D().a()).a(PubOppositeController.PubOppositeChangeListener.class).a(s).a((l.a) pubOppositeChangeListener);
        }
    }

    public final void b(short s, PubOppositeController.PubOppositeChangeListener pubOppositeChangeListener) {
        Object[] objArr = {Short.valueOf(s), pubOppositeChangeListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a910dd869b3450c4d8d68c2578d9f615", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a910dd869b3450c4d8d68c2578d9f615");
        } else {
            ((com.sankuai.xm.base.service.l) D().a()).a(PubOppositeController.PubOppositeChangeListener.class).a(s).b(pubOppositeChangeListener);
        }
    }

    public final void d(SessionId sessionId) {
        Object[] objArr = {sessionId};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be872e95576d8deb0fae6dbc53d3a5a2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be872e95576d8deb0fae6dbc53d3a5a2");
        } else if (A()) {
        } else {
            PubOppositeController f2 = ((com.sankuai.xm.im.message.d) C().a()).f();
            Object[] objArr2 = {sessionId};
            ChangeQuickRedirect changeQuickRedirect2 = PubOppositeController.b;
            if (PatchProxy.isSupport(objArr2, f2, changeQuickRedirect2, false, "5cf11ac59f7827a8929d9783453db9a4", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr2, f2, changeQuickRedirect2, false, "5cf11ac59f7827a8929d9783453db9a4");
            } else if (sessionId == null || !sessionId.i() || !f2.b(sessionId.g)) {
                com.sankuai.xm.im.utils.a.d("PubOppositeController::opposite param error," + sessionId, new Object[0]);
            } else {
                String a2 = com.sankuai.xm.im.http.a.a("/pubread/v1/user/chat/opposite/getReadList");
                HashMap hashMap = new HashMap();
                hashMap.put("svid", (short) 410);
                hashMap.put("channel", Short.valueOf(sessionId.g));
                try {
                    JSONArray jSONArray = new JSONArray();
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(Message.CHAT_ID, String.valueOf(sessionId.b));
                    jSONObject.put(Message.PEER_UID, String.valueOf(sessionId.c));
                    jSONObject.put(Message.SID, sessionId.g());
                    jSONArray.put(jSONObject);
                    hashMap.put("chatIds", jSONArray);
                    com.sankuai.xm.im.utils.a.b("PubOppositeController::queryOpposite by session=%s", sessionId);
                    com.sankuai.xm.base.d dVar = new com.sankuai.xm.base.d(a2, hashMap, new PubOppositeController.e());
                    dVar.a(new com.sankuai.xm.network.httpurlconnection.retry.a());
                    com.sankuai.xm.network.httpurlconnection.g.a().a((com.sankuai.xm.network.httpurlconnection.e) dVar, 0L);
                } catch (Exception e2) {
                    com.sankuai.xm.im.utils.a.a(e2, "PubOppositeController::queryOpposite", new Object[0]);
                }
            }
        }
    }

    @Trace(action = "send", name = "start", traceName = "opposite_msg")
    public final void a(@NonNull SessionId sessionId, long j2) {
        Object[] objArr = {sessionId, new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5579c687fc739078ee36d6793d7b3006", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5579c687fc739078ee36d6793d7b3006");
            return;
        }
        try {
            com.sankuai.xm.base.trace.j.a(com.sankuai.xm.base.trace.i.begin, "start", "opposite_msg", 0L, "send", new Object[]{sessionId, new Long(j2)});
            if (A()) {
                com.sankuai.xm.base.trace.j.a((Object) null);
                return;
            }
            ((com.sankuai.xm.im.message.d) C().a()).f().a(sessionId, j2);
            com.sankuai.xm.base.trace.j.a((Object) null);
        } catch (Throwable th) {
            com.sankuai.xm.base.trace.j.a(th);
            throw th;
        }
    }

    public final void b(@NonNull SessionId sessionId, long j2) {
        Object[] objArr = {sessionId, new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e932d095317f73ed4ecd87a71bc3cc1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e932d095317f73ed4ecd87a71bc3cc1");
        } else if (A()) {
        } else {
            PubOppositeController f2 = ((com.sankuai.xm.im.message.d) C().a()).f();
            Object[] objArr2 = {sessionId, new Long(j2)};
            ChangeQuickRedirect changeQuickRedirect2 = PubOppositeController.b;
            if (PatchProxy.isSupport(objArr2, f2, changeQuickRedirect2, false, "185fc3e897e6fce34d26962b8764842c", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr2, f2, changeQuickRedirect2, false, "185fc3e897e6fce34d26962b8764842c");
            } else {
                f2.b(sessionId, j2);
            }
        }
    }

    public final boolean d(short s) {
        Object[] objArr = {Short.valueOf(s)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c9d2c2b0f788bd6f49aac03125d2d540", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c9d2c2b0f788bd6f49aac03125d2d540")).booleanValue();
        }
        if (A()) {
            return false;
        }
        return ((com.sankuai.xm.im.message.d) C().a()).g().a(s);
    }

    public final void a(short s, GroupOppositeController.OnGroupOppositeChangeListener onGroupOppositeChangeListener) {
        Object[] objArr = {Short.valueOf(s), onGroupOppositeChangeListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "95b09ba839c38ec6f09f327e56eac426", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "95b09ba839c38ec6f09f327e56eac426");
        } else {
            ((com.sankuai.xm.base.service.l) D().a()).a(GroupOppositeController.OnGroupOppositeChangeListener.class).a(s).a((l.a) onGroupOppositeChangeListener);
        }
    }

    public final void b(short s, GroupOppositeController.OnGroupOppositeChangeListener onGroupOppositeChangeListener) {
        Object[] objArr = {Short.valueOf(s), onGroupOppositeChangeListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "99e50a564eaf0a2861eddb1b6289ab38", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "99e50a564eaf0a2861eddb1b6289ab38");
        } else {
            ((com.sankuai.xm.base.service.l) D().a()).a(GroupOppositeController.OnGroupOppositeChangeListener.class).a(s).b(onGroupOppositeChangeListener);
        }
    }

    public final void b(@NonNull SessionId sessionId, @NonNull List<Message> list) {
        Object[] objArr = {sessionId, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ffbe594809b7fddd95c44ab2a62c4ae", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ffbe594809b7fddd95c44ab2a62c4ae");
        } else if (A()) {
        } else {
            GroupOppositeController g2 = ((com.sankuai.xm.im.message.d) C().a()).g();
            Object[] objArr2 = {sessionId, list};
            ChangeQuickRedirect changeQuickRedirect2 = GroupOppositeController.b;
            if (PatchProxy.isSupport(objArr2, g2, changeQuickRedirect2, false, "b4e123ab6eec166300d55a9f29639100", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr2, g2, changeQuickRedirect2, false, "b4e123ab6eec166300d55a9f29639100");
            } else {
                g2.a(sessionId, list, true);
            }
        }
    }

    @Trace(action = "send", name = "start", traceName = "opposite_msg")
    public final void c(@NonNull SessionId sessionId, @NonNull List<Message> list) {
        Object[] objArr = {sessionId, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c0d467e739e1deb37fcd3a7eb483ecda", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c0d467e739e1deb37fcd3a7eb483ecda");
            return;
        }
        try {
            com.sankuai.xm.base.trace.j.a(com.sankuai.xm.base.trace.i.begin, "start", "opposite_msg", 0L, "send", new Object[]{sessionId, list});
            if (A()) {
                com.sankuai.xm.base.trace.j.a((Object) null);
                return;
            }
            ((com.sankuai.xm.im.message.d) C().a()).g().a(sessionId, list);
            com.sankuai.xm.base.trace.j.a((Object) null);
        } catch (Throwable th) {
            com.sankuai.xm.base.trace.j.a(th);
            throw th;
        }
    }

    @Nullable
    public final <T> T a(Class<T> cls) throws com.sankuai.xm.base.service.n {
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c3cf274af4b81b1540c08be2ec6c38da", 6917529027641081856L) ? (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c3cf274af4b81b1540c08be2ec6c38da") : (T) com.sankuai.xm.base.service.m.b(cls);
    }

    private void I() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3203cf51d6d90acd040fd5806d4e2fbf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3203cf51d6d90acd040fd5806d4e2fbf");
            return;
        }
        final long q = com.sankuai.xm.login.a.a().q();
        if (q == 0) {
            com.sankuai.xm.im.utils.a.b("IMClient::initDBAndRemoteDataForLaunch no cache uid available", new Object[0]);
            return;
        }
        synchronized (this) {
            if (this.u) {
                this.u = false;
                com.sankuai.xm.im.utils.a.b("IMClient::initDBAndRemoteDataForLaunch with uid: %s", Long.valueOf(q));
                a(q);
                DBProxy.l().a(com.sankuai.xm.login.a.a().d() ? 0L : q, false, (Callback<Boolean>) new com.sankuai.xm.im.a<Boolean>() { // from class: com.sankuai.xm.im.IMClient.7
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.xm.base.callback.Callback
                    public final /* synthetic */ void onSuccess(Object obj) {
                        Object[] objArr2 = {(Boolean) obj};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ef13ac2216b4a6fd7ca1f3768db386f2", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ef13ac2216b4a6fd7ca1f3768db386f2");
                        } else if (!TextUtils.equals(com.sankuai.xm.base.service.m.c().a("enable_pre_remote_sync"), "true")) {
                            com.sankuai.xm.im.utils.a.b("IMClient::initDBAndRemoteDataForLaunch no enable.", new Object[0]);
                        } else if (TextUtils.isEmpty(com.sankuai.xm.login.a.a().d(q))) {
                            com.sankuai.xm.im.utils.a.b("IMClient::initDBAndRemoteDataForLaunch no cache alToken available", new Object[0]);
                        } else {
                            com.sankuai.xm.im.utils.a.b("IMClient::initDBAndRemoteDataForLaunch: remoteSync with cache alToken for " + q, new Object[0]);
                            boolean a2 = com.sankuai.xm.im.cache.a.c().a(q);
                            if (!a2) {
                                com.sankuai.xm.im.cache.a.c().d();
                            }
                            IMClient.d(IMClient.this).a(a2, true, q);
                        }
                    }

                    @Override // com.sankuai.xm.base.callback.Callback
                    public final void onFailure(@TraceStatus int i2, String str) {
                        Object[] objArr2 = {Integer.valueOf(i2), str};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e501aec25fb6d1a6be8ebaf4ced3353c", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e501aec25fb6d1a6be8ebaf4ced3353c");
                            return;
                        }
                        com.sankuai.xm.base.trace.j.a(new Integer(i2), (String[]) null, new int[]{0}, (String[]) null, (int[]) null, (int[]) null);
                        com.sankuai.xm.im.utils.a.d("IMClient::initDBAndRemoteDataForLaunch, open db failure, resCode:%s,  err: %s" + str, new Object[0]);
                    }
                });
            }
        }
    }

    @TraceStatus
    public final boolean A() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a25f7aba541c5ff041f5528d7862ef98", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a25f7aba541c5ff041f5528d7862ef98")).booleanValue();
        }
        boolean z = !p();
        if (z) {
            com.sankuai.xm.im.utils.a.d("IMLib is uninitialized", new Object[0]);
        }
        com.sankuai.xm.base.trace.j.a(new Boolean(z), (String[]) null, new int[]{0}, new String[]{"true"}, new int[]{10023}, (int[]) null);
        return z;
    }

    public boolean a(com.sankuai.xm.im.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a92783752961d4e2b0bd66f1cca08384", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a92783752961d4e2b0bd66f1cca08384")).booleanValue();
        }
        if (A()) {
            if (aVar != null) {
                aVar.onFailure(10023, "IMLib uninitialized");
            }
            return true;
        }
        return false;
    }

    private String b(Context context) {
        String absolutePath;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "173a7dfebe626297858d2a3bb8b148d0", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "173a7dfebe626297858d2a3bb8b148d0");
        }
        String str = "";
        if (context == null) {
            return "";
        }
        File file = null;
        try {
            if (com.sankuai.xm.base.util.k.a(context)) {
                file = com.sankuai.xm.base.util.k.l("elephant" + File.separator + "im" + File.separator);
            }
            if (file == null) {
                file = com.sankuai.xm.base.util.k.k("elephant" + File.separator + "im" + File.separator);
            }
            com.sankuai.xm.base.util.k.g(file.getAbsolutePath());
            absolutePath = file.getAbsolutePath();
        } catch (Exception e2) {
            e = e2;
        }
        try {
            file.mkdirs();
            com.sankuai.xm.im.utils.a.b("initMediaFolderPath, imFolder=" + absolutePath, new Object[0]);
            return absolutePath;
        } catch (Exception e3) {
            str = absolutePath;
            e = e3;
            com.sankuai.xm.im.utils.a.a(e);
            return str;
        }
    }

    public byte[] c(long j2) {
        Object[] objArr = {new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a1872febef3d7ea114f5372d6bea0f45", 6917529027641081856L)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a1872febef3d7ea114f5372d6bea0f45");
        }
        String a2 = w.a(f());
        return com.sankuai.xm.base.util.l.b(a2 + j2).getBytes();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static abstract class g<T> implements com.sankuai.xm.im.a<T> {
        public static ChangeQuickRedirect d;

        public abstract void a(T t);

        @Override // com.sankuai.xm.base.callback.Callback
        public void onSuccess(T t) {
            Object[] objArr = {t};
            ChangeQuickRedirect changeQuickRedirect = d;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c0e5a8e3c6de50f50d4bbdeac393fc7", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c0e5a8e3c6de50f50d4bbdeac393fc7");
            } else {
                a(t);
            }
        }

        @Override // com.sankuai.xm.base.callback.Callback
        public void onFailure(int i, String str) {
            Object[] objArr = {Integer.valueOf(i), str};
            ChangeQuickRedirect changeQuickRedirect = d;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "49cca7099781c2202ad2983fac786bba", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "49cca7099781c2202ad2983fac786bba");
            } else {
                a(null);
            }
        }
    }
}

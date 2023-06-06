package com.meituan.android.customerservice.floating;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Build;
import android.support.constraint.R;
import android.support.v4.content.LocalBroadcastManager;
import android.text.TextUtils;
import com.alipay.sdk.app.PayTask;
import com.dianping.nvnetwork.g;
import com.dianping.sharkpush.b;
import com.dianping.sharkpush.d;
import com.google.gson.Gson;
import com.meituan.android.cipstorage.q;
import com.meituan.android.customerservice.floating.FloatingView;
import com.meituan.android.customerservice.floating.UploadFloatingView;
import com.meituan.android.customerservice.kit.floating.FloatingDialogActivity;
import com.meituan.android.customerservice.kit.utils.d;
import com.meituan.android.customerservice.kit.utils.h;
import com.meituan.android.customerservice.retrofit.bean.FloatingInfoBean;
import com.meituan.android.customerservice.retrofit.bean.HttpResult;
import com.meituan.android.customerservice.utils.NetworkConnectChangedManager;
import com.meituan.android.customerservice.utils.TimerManager;
import com.meituan.android.customerservice.utils.c;
import com.meituan.android.customerservice.utils.e;
import com.meituan.android.customerservice.utils.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.mapsdk.internal.y;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import rx.j;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public static a b;
    final Context c;
    Integer d;
    HashMap<String, String> e;
    String f;
    String g;
    public volatile int h;
    volatile Runnable i;
    public volatile int j;
    boolean k;
    boolean l;
    public String m;
    d.a n;
    private FloatingView o;
    private UploadFloatingView p;
    private HashMap<String, Boolean> q;
    private CopyOnWriteArraySet<Object> r;
    private b s;
    private d.b t;
    private NetworkConnectChangedManager.a u;
    private BroadcastReceiver v;
    private b.a w;
    private BroadcastReceiver x;
    private long y;

    public static /* synthetic */ void a(a aVar, final String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "18c221a677016dac7cd90cb9151e8280", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "18c221a677016dac7cd90cb9151e8280");
            return;
        }
        synchronized (aVar) {
            aVar.a(true, false, str);
            final int i = aVar.j + 1;
            aVar.j = i;
            f.b(new Runnable() { // from class: com.meituan.android.customerservice.floating.a.15
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3ffe0c78ad7986dbfef8c1687d1c2b97", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3ffe0c78ad7986dbfef8c1687d1c2b97");
                    } else if (i == a.this.j) {
                        a.this.a(false, false, str);
                    }
                }
            }, PayTask.j);
        }
    }

    public static /* synthetic */ void a(a aVar, String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "f492c2babc263018d60cd70fe4c4f412", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "f492c2babc263018d60cd70fe4c4f412");
        } else if (z) {
            aVar.q.put(str, Boolean.TRUE);
            if (!aVar.l) {
                String str2 = aVar.m;
                C0247a c0247a = new C0247a();
                c0247a.b = true;
                c0247a.f = false;
                Integer valueOf = Integer.valueOf(aVar.d.intValue() + 1);
                aVar.d = valueOf;
                c0247a.e = valueOf;
                aVar.a(str2, c0247a);
                return;
            }
            String str3 = aVar.m;
            C0247a c0247a2 = new C0247a();
            c0247a2.b = false;
            c0247a2.f = true;
            aVar.a(str3, c0247a2);
        } else {
            aVar.q.put(str, Boolean.FALSE);
            aVar.d(str);
        }
    }

    private a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dabe8915dba24e1ffd5663c8137d4837", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dabe8915dba24e1ffd5663c8137d4837");
            return;
        }
        this.d = 0;
        this.e = new HashMap<>();
        this.h = 0;
        this.j = 0;
        this.k = true;
        this.l = false;
        this.r = new CopyOnWriteArraySet<>();
        this.s = new b();
        this.t = new d.b() { // from class: com.meituan.android.customerservice.floating.a.9
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.customerservice.kit.utils.d.b
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a5529ce6bfd2904ae159248151c9c8db", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a5529ce6bfd2904ae159248151c9c8db");
                    return;
                }
                c.a(getClass(), "floating into foreground");
                g.b(false);
                if (!a.this.l) {
                    a aVar = a.this;
                    String str = a.this.m;
                    C0247a c0247a = new C0247a();
                    c0247a.b = true;
                    c0247a.f = false;
                    a aVar2 = a.this;
                    Integer valueOf = Integer.valueOf(a.this.d.intValue() + 1);
                    aVar2.d = valueOf;
                    c0247a.e = valueOf;
                    aVar.a(str, c0247a);
                    return;
                }
                a.this.l = false;
                a aVar3 = a.this;
                String str2 = a.this.m;
                C0247a c0247a2 = new C0247a();
                c0247a2.b = true;
                c0247a2.f = true;
                a aVar4 = a.this;
                Integer valueOf2 = Integer.valueOf(a.this.d.intValue() + 1);
                aVar4.d = valueOf2;
                c0247a2.e = valueOf2;
                aVar3.a(str2, c0247a2);
            }

            @Override // com.meituan.android.customerservice.kit.utils.d.b
            public final void b() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "087b081c6d5b12e256613459b36cd6c3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "087b081c6d5b12e256613459b36cd6c3");
                    return;
                }
                c.a(getClass(), "floating into background");
                g.b(true);
                a.this.d(a.this.m);
            }
        };
        this.u = new NetworkConnectChangedManager.a() { // from class: com.meituan.android.customerservice.floating.a.10
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.customerservice.utils.NetworkConnectChangedManager.a
            public final void a(boolean z) {
                Object[] objArr2 = {(byte) 1};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "34df9266a763910c147041be95215003", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "34df9266a763910c147041be95215003");
                } else {
                    a.this.a(false);
                }
            }
        };
        this.v = new BroadcastReceiver() { // from class: com.meituan.android.customerservice.floating.FloatingLayerManager$4
            public static ChangeQuickRedirect a;

            /* JADX WARN: Code restructure failed: missing block: B:27:0x0089, code lost:
                if (r1.equals("upload_voucher") != false) goto L21;
             */
            @Override // android.content.BroadcastReceiver
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void onReceive(android.content.Context r13, android.content.Intent r14) {
                /*
                    r12 = this;
                    r0 = 2
                    java.lang.Object[] r8 = new java.lang.Object[r0]
                    r9 = 0
                    r8[r9] = r13
                    r13 = 1
                    r8[r13] = r14
                    com.meituan.robust.ChangeQuickRedirect r10 = com.meituan.android.customerservice.floating.FloatingLayerManager$4.a
                    java.lang.String r11 = "537481d9290b7479315fc9508b59df60"
                    r4 = 0
                    r6 = 4611686018427387904(0x4000000000000000, double:2.0)
                    r1 = r8
                    r2 = r12
                    r3 = r10
                    r5 = r11
                    boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
                    if (r1 == 0) goto L1e
                    com.meituan.robust.PatchProxy.accessDispatch(r8, r12, r10, r9, r11)
                    return
                L1e:
                    if (r14 == 0) goto Lad
                    java.lang.String r1 = "cs_floating_status_action"
                    java.lang.String r2 = r14.getAction()
                    boolean r1 = android.text.TextUtils.equals(r1, r2)
                    if (r1 != 0) goto L2e
                    goto Lad
                L2e:
                    java.lang.String r1 = "type"
                    java.lang.String r1 = com.sankuai.waimai.platform.utils.f.a(r14, r1)
                    boolean r2 = android.text.TextUtils.isEmpty(r1)
                    if (r2 == 0) goto L3c
                    return
                L3c:
                    java.lang.String r2 = "isShow"
                    boolean r14 = com.sankuai.waimai.platform.utils.f.a(r14, r2, r9)
                    java.lang.Class r2 = r12.getClass()
                    java.lang.StringBuilder r3 = new java.lang.StringBuilder
                    java.lang.String r4 = "ShowFloatingBroadcastReceiver: "
                    r3.<init>(r4)
                    r3.append(r14)
                    java.lang.String r3 = r3.toString()
                    com.meituan.android.customerservice.utils.c.a(r2, r3)
                    r2 = -1
                    int r3 = r1.hashCode()
                    r4 = -1894600080(0xffffffff8f12b270, float:-7.2327216E-30)
                    if (r3 == r4) goto L82
                    r13 = -1727195836(0xffffffff990d1544, float:-7.293824E-24)
                    if (r3 == r13) goto L77
                    r13 = 3364(0xd24, float:4.714E-42)
                    if (r3 == r13) goto L6c
                    goto L8c
                L6c:
                    java.lang.String r13 = "im"
                    boolean r13 = r1.equals(r13)
                    if (r13 == 0) goto L8c
                    r13 = 0
                    goto L8d
                L77:
                    java.lang.String r13 = "service_order"
                    boolean r13 = r1.equals(r13)
                    if (r13 == 0) goto L8c
                    r13 = 2
                    goto L8d
                L82:
                    java.lang.String r0 = "upload_voucher"
                    boolean r0 = r1.equals(r0)
                    if (r0 == 0) goto L8c
                    goto L8d
                L8c:
                    r13 = -1
                L8d:
                    switch(r13) {
                        case 0: goto La3;
                        case 1: goto L9a;
                        case 2: goto L91;
                        default: goto L90;
                    }
                L90:
                    goto Lac
                L91:
                    com.meituan.android.customerservice.floating.a r13 = com.meituan.android.customerservice.floating.a.this
                    java.lang.String r0 = "service_order"
                    com.meituan.android.customerservice.floating.a.a(r13, r0, r14)
                    goto Lac
                L9a:
                    com.meituan.android.customerservice.floating.a r13 = com.meituan.android.customerservice.floating.a.this
                    java.lang.String r0 = "upload_voucher"
                    com.meituan.android.customerservice.floating.a.a(r13, r0, r14)
                    return
                La3:
                    com.meituan.android.customerservice.floating.a r13 = com.meituan.android.customerservice.floating.a.this
                    java.lang.String r0 = "im"
                    com.meituan.android.customerservice.floating.a.a(r13, r0, r14)
                    return
                Lac:
                    return
                Lad:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.customerservice.floating.FloatingLayerManager$4.onReceive(android.content.Context, android.content.Intent):void");
            }
        };
        this.w = new b.a() { // from class: com.meituan.android.customerservice.floating.a.11
            public static ChangeQuickRedirect a;

            @Override // com.dianping.sharkpush.b.a
            public final void a(boolean z) {
                Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "94c9dfc6c3283ce4b8791d04998c7331", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "94c9dfc6c3283ce4b8791d04998c7331");
                    return;
                }
                Class<?> cls = getClass();
                c.a(cls, "sharkpush status change isReady:" + z);
                if (z) {
                    a.this.a(false);
                }
            }
        };
        this.n = new d.a() { // from class: com.meituan.android.customerservice.floating.a.12
            public static ChangeQuickRedirect a;

            @Override // com.dianping.sharkpush.d.a, dianping.com.nvlinker.stub.ISharkPushReceiver
            public final void onReceive(final String str, final byte[] bArr) {
                Object[] objArr2 = {str, bArr};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a7304dd7504e1a58eb9b36f0d7400962", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a7304dd7504e1a58eb9b36f0d7400962");
                } else {
                    f.a(new Runnable() { // from class: com.meituan.android.customerservice.floating.a.12.1
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean z;
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "8665542f010fa246409cd82881485dff", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "8665542f010fa246409cd82881485dff");
                            } else if (!a.this.k) {
                                c.a(getClass(), "sharkpush-> not receive message");
                            } else if (!TextUtils.equals(str, "csc_chat_status") || bArr == null) {
                                c.a(getClass(), "sharkpush-> push error");
                            } else {
                                String str2 = new String(bArr);
                                Class<?> cls = getClass();
                                c.a(cls, "sharkpush-> cmd:" + str + "\tresponse: " + str2);
                                if (TextUtils.isEmpty(str2)) {
                                    return;
                                }
                                final FloatingInfoBean floatingInfoBean = (FloatingInfoBean) new Gson().fromJson(str2, (Class<Object>) FloatingInfoBean.class);
                                if (TextUtils.equals("im", floatingInfoBean.getType()) && !TextUtils.isEmpty(a.this.e.get("im")) && !TextUtils.isEmpty(floatingInfoBean.getMessageId()) && Long.valueOf(floatingInfoBean.getMessageId()).longValue() <= Long.valueOf(a.this.e.get("im")).longValue()) {
                                    c.a(getClass(), "sharkpush-> im message throw");
                                } else if (TextUtils.isEmpty(floatingInfoBean.getType())) {
                                } else {
                                    a aVar = a.this;
                                    String str3 = a.this.m;
                                    String type = floatingInfoBean.getType();
                                    Object[] objArr4 = {str3, type};
                                    ChangeQuickRedirect changeQuickRedirect4 = a.a;
                                    if (PatchProxy.isSupport(objArr4, aVar, changeQuickRedirect4, false, "114552ca424ecb3132c65c544e5c8f49", RobustBitConfig.DEFAULT_VALUE)) {
                                        z = ((Boolean) PatchProxy.accessDispatch(objArr4, aVar, changeQuickRedirect4, false, "114552ca424ecb3132c65c544e5c8f49")).booleanValue();
                                    } else {
                                        if (TextUtils.equals(str3, "im") && (TextUtils.equals(type, "upload_voucher") || TextUtils.equals(type, "service_order"))) {
                                            Class<?> cls2 = aVar.getClass();
                                            c.a(cls2, "curType=" + str3 + " > sourceType=" + type + ", not push");
                                        } else if (TextUtils.equals(str3, "upload_voucher") && TextUtils.equals(type, "service_order")) {
                                            Class<?> cls3 = aVar.getClass();
                                            c.a(cls3, "curType=" + str3 + " > sourceType=" + type + ", not push");
                                        } else {
                                            z = true;
                                        }
                                        z = false;
                                    }
                                    if (z) {
                                        a.this.g = floatingInfoBean.getPageName();
                                        String type2 = floatingInfoBean.getType();
                                        if (TextUtils.equals("im", type2)) {
                                            a aVar2 = a.this;
                                            Object[] objArr5 = {floatingInfoBean};
                                            ChangeQuickRedirect changeQuickRedirect5 = a.a;
                                            if (PatchProxy.isSupport(objArr5, aVar2, changeQuickRedirect5, false, "2f1120646fd03b0cde31a2523cc8fc2f", RobustBitConfig.DEFAULT_VALUE)) {
                                                PatchProxy.accessDispatch(objArr5, aVar2, changeQuickRedirect5, false, "2f1120646fd03b0cde31a2523cc8fc2f");
                                                return;
                                            }
                                            aVar2.e.put("im", floatingInfoBean.getMessageId());
                                            if (!TextUtils.equals("im", aVar2.m) || !aVar2.a()) {
                                                c.a(aVar2.getClass(), "im floating is null, not push");
                                            } else if (floatingInfoBean.getIsShow()) {
                                                e.a(aVar2.c, floatingInfoBean.getVisitId());
                                                aVar2.f = floatingInfoBean.getChatId();
                                                aVar2.a(floatingInfoBean.getBudget());
                                                aVar2.a(floatingInfoBean);
                                            } else {
                                                aVar2.b(floatingInfoBean.getType());
                                            }
                                        } else if (TextUtils.equals("service_order", type2)) {
                                            final a aVar3 = a.this;
                                            Object[] objArr6 = {floatingInfoBean};
                                            ChangeQuickRedirect changeQuickRedirect6 = a.a;
                                            if (PatchProxy.isSupport(objArr6, aVar3, changeQuickRedirect6, false, "04c559db8def13f11c80c857774b07e8", RobustBitConfig.DEFAULT_VALUE)) {
                                                PatchProxy.accessDispatch(objArr6, aVar3, changeQuickRedirect6, false, "04c559db8def13f11c80c857774b07e8");
                                            } else if (floatingInfoBean.getIsShow()) {
                                                final String type3 = floatingInfoBean.getType();
                                                e.a(aVar3.c, floatingInfoBean.getVisitId());
                                                aVar3.f = floatingInfoBean.getChatId();
                                                aVar3.a(floatingInfoBean.getType());
                                                aVar3.a(floatingInfoBean);
                                                aVar3.i = new Runnable() { // from class: com.meituan.android.customerservice.floating.a.13
                                                    public static ChangeQuickRedirect a;

                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        Object[] objArr7 = new Object[0];
                                                        ChangeQuickRedirect changeQuickRedirect7 = a;
                                                        if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "4fe4433aa32ff8298dae7ebff1ddee65", RobustBitConfig.DEFAULT_VALUE)) {
                                                            PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "4fe4433aa32ff8298dae7ebff1ddee65");
                                                            return;
                                                        }
                                                        a.this.b(1);
                                                        a.a(a.this, type3);
                                                    }
                                                };
                                                C0247a c0247a = new C0247a();
                                                c0247a.b = false;
                                                c0247a.f = false;
                                                aVar3.a(type3, c0247a);
                                            } else {
                                                aVar3.b(floatingInfoBean.getType());
                                            }
                                        } else if (TextUtils.equals("upload_voucher", type2)) {
                                            final a aVar4 = a.this;
                                            Object[] objArr7 = {floatingInfoBean};
                                            ChangeQuickRedirect changeQuickRedirect7 = a.a;
                                            if (PatchProxy.isSupport(objArr7, aVar4, changeQuickRedirect7, false, "98bced5a09f3371871e71dd3692239e3", RobustBitConfig.DEFAULT_VALUE)) {
                                                PatchProxy.accessDispatch(objArr7, aVar4, changeQuickRedirect7, false, "98bced5a09f3371871e71dd3692239e3");
                                                return;
                                            }
                                            e.c(aVar4.c, floatingInfoBean.getMessageId());
                                            if (floatingInfoBean.getIsShow()) {
                                                e.a(aVar4.c, floatingInfoBean.getVisitId());
                                                aVar4.f = floatingInfoBean.getChatId();
                                                aVar4.a("upload_voucher");
                                                aVar4.a(floatingInfoBean);
                                                aVar4.i = new Runnable() { // from class: com.meituan.android.customerservice.floating.a.14
                                                    public static ChangeQuickRedirect a;

                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        Object[] objArr8 = new Object[0];
                                                        ChangeQuickRedirect changeQuickRedirect8 = a;
                                                        if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "1e0e6e85c5d972ea72ac5824971a0656", RobustBitConfig.DEFAULT_VALUE)) {
                                                            PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "1e0e6e85c5d972ea72ac5824971a0656");
                                                            return;
                                                        }
                                                        a.this.b(1);
                                                        e.b(a.this.c, floatingInfoBean.getChatId());
                                                    }
                                                };
                                                String type4 = floatingInfoBean.getType();
                                                C0247a c0247a2 = new C0247a();
                                                c0247a2.b = false;
                                                c0247a2.f = true;
                                                aVar4.a(type4, c0247a2);
                                                return;
                                            }
                                            aVar4.c("upload_voucher");
                                        }
                                    }
                                }
                            }
                        }
                    });
                }
            }

            @Override // dianping.com.nvlinker.stub.ISharkPushReceiver
            public final void onError(String str, int i, String str2) {
                Object[] objArr2 = {str, Integer.valueOf(i), str2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9bb7c93e9802bcf4f269b0c5e36e5cc3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9bb7c93e9802bcf4f269b0c5e36e5cc3");
                    return;
                }
                Class<?> cls = getClass();
                c.b(cls, "sharkpush-> cmd:" + str + "\tcode: \tmsg: " + str2);
            }
        };
        this.x = new BroadcastReceiver() { // from class: com.meituan.android.customerservice.floating.FloatingLayerManager$10
            public static ChangeQuickRedirect a;

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, final Intent intent) {
                Object[] objArr2 = {context2, intent};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d4b07e03f69f92050fe19f137bf214d7", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d4b07e03f69f92050fe19f137bf214d7");
                } else {
                    f.a(new Runnable() { // from class: com.meituan.android.customerservice.floating.FloatingLayerManager$10.1
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "6c2d31f520899776503eb1e1e020e867", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "6c2d31f520899776503eb1e1e020e867");
                            } else if (intent == null) {
                            } else {
                                String action = intent.getAction();
                                String a2 = com.sankuai.waimai.platform.utils.f.a(intent, "data");
                                Class<?> cls = getClass();
                                c.a(cls, "knb-> action:" + action + ", data:" + a2);
                                if (TextUtils.isEmpty(a2)) {
                                    return;
                                }
                                FloatingInfoBean floatingInfoBean = (FloatingInfoBean) new Gson().fromJson(a2, (Class<Object>) FloatingInfoBean.class);
                                if (TextUtils.equals("csc:csc_chat_status", action)) {
                                    if (TextUtils.isEmpty(floatingInfoBean.getType())) {
                                        return;
                                    }
                                    if (!floatingInfoBean.getIsShow()) {
                                        if (floatingInfoBean.getIsShow()) {
                                            return;
                                        }
                                        c.a(getClass(), "knb-> dismiss");
                                        a.this.k = false;
                                        a.this.c(floatingInfoBean.getType());
                                        if (floatingInfoBean.getIsNeedRequest()) {
                                            a.this.a(true);
                                            return;
                                        }
                                        return;
                                    }
                                    a.this.k = true;
                                    e.a(a.this.c, floatingInfoBean.getVisitId());
                                    a.this.a(true);
                                } else if (TextUtils.equals("csc:csc_evidence_check", action)) {
                                    a.this.k = true;
                                    e.a(a.this.c, floatingInfoBean.getVisitId());
                                    a.this.a(false);
                                }
                            }
                        }
                    });
                }
            }
        };
        this.c = context;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.customerservice.utils.b.a;
        HashMap<String, Boolean> hashMap = null;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "c6fd076c40cef026ddf665e1d3e2f661", RobustBitConfig.DEFAULT_VALUE)) {
            hashMap = (HashMap) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "c6fd076c40cef026ddf665e1d3e2f661");
        } else if (com.meituan.android.customerservice.utils.b.b != null) {
            hashMap = com.meituan.android.customerservice.utils.b.b.g();
        }
        this.q = hashMap;
        f.b(new Runnable() { // from class: com.meituan.android.customerservice.floating.a.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "80e0fe4234807577e6530281a112a056", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "80e0fe4234807577e6530281a112a056");
                } else {
                    com.dianping.sharkpush.b.a("csc_chat_status", a.this.n);
                }
            }
        });
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("csc:csc_chat_status");
        intentFilter.addAction("csc:csc_evidence_check");
        context.registerReceiver(this.x, intentFilter);
        LocalBroadcastManager.getInstance(context).registerReceiver(this.v, new IntentFilter("cs_floating_status_action"));
        if (a()) {
            a(false);
        }
    }

    public static synchronized a a(Context context) {
        synchronized (a.class) {
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d39df1a401fb4730a23761cd3960256d", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d39df1a401fb4730a23761cd3960256d");
            }
            if (b == null) {
                b = new a(context);
            }
            return b;
        }
    }

    void a(FloatingInfoBean floatingInfoBean) {
        Object[] objArr = {floatingInfoBean};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed2abe6db44bfad719799d6c9302ee7c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed2abe6db44bfad719799d6c9302ee7c");
        } else if (TextUtils.equals(floatingInfoBean.getType(), this.m)) {
            if (!TextUtils.isEmpty(floatingInfoBean.getUrl())) {
                e.d(this.c, floatingInfoBean.getUrl());
            }
            if (floatingInfoBean.getExpireTime() > 0) {
                TimerManager.a().a(this.c.getApplicationContext(), floatingInfoBean.getExpireTime());
            }
        }
    }

    public final void a(final boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d40ed9363233b5965e6abbd1ab09c36", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d40ed9363233b5965e6abbd1ab09c36");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.y;
        if (currentTimeMillis < 10000 && currentTimeMillis >= 0) {
            c.a(getClass(), "checkFloatState return");
            return;
        }
        this.y = System.currentTimeMillis();
        com.meituan.android.customerservice.retrofit.a.a(this.c, e.b(this.c), com.meituan.android.customerservice.utils.b.b(), new j<HttpResult<FloatingInfoBean>>() { // from class: com.meituan.android.customerservice.floating.a.2
            public static ChangeQuickRedirect a;

            @Override // rx.e
            public final void onCompleted() {
            }

            @Override // rx.e
            public final /* synthetic */ void onNext(Object obj) {
                HttpResult httpResult = (HttpResult) obj;
                Object[] objArr2 = {httpResult};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5057b89464961bed8c69bf17b499fb60", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5057b89464961bed8c69bf17b499fb60");
                } else if (httpResult == null) {
                    c.a(getClass(), "queryFloatingStatus-> onNext:result null");
                } else {
                    Class<?> cls = getClass();
                    c.a(cls, "queryFloatingStatus-> onNext:" + httpResult.toString());
                    final FloatingInfoBean floatingInfoBean = (FloatingInfoBean) httpResult.getData();
                    String type = floatingInfoBean.getType();
                    if (TextUtils.isEmpty(type)) {
                        return;
                    }
                    a.this.g = floatingInfoBean.getPageName();
                    if (floatingInfoBean.getIsShow()) {
                        e.a(a.this.c, floatingInfoBean.getVisitId());
                        a.this.f = floatingInfoBean.getChatId();
                        if (z) {
                            floatingInfoBean.setIsNeedRequest(true);
                        }
                        if (TextUtils.equals("im", type) || TextUtils.equals("service_order", type)) {
                            final a aVar = a.this;
                            Object[] objArr3 = {floatingInfoBean};
                            ChangeQuickRedirect changeQuickRedirect3 = a.a;
                            if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "250477ca9eeeb1ceb6c0d30ef49191cf", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "250477ca9eeeb1ceb6c0d30ef49191cf");
                                return;
                            }
                            if (TextUtils.equals(aVar.m, "im")) {
                                aVar.e.put("im", floatingInfoBean.getMessageId());
                            }
                            final String type2 = floatingInfoBean.getType();
                            aVar.a(type2);
                            aVar.a(floatingInfoBean);
                            aVar.a(floatingInfoBean.getBudget());
                            aVar.i = new Runnable() { // from class: com.meituan.android.customerservice.floating.a.3
                                public static ChangeQuickRedirect a;

                                @Override // java.lang.Runnable
                                public final void run() {
                                    Object[] objArr4 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect4 = a;
                                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "328a3ed30acc7dc66e199b601808180e", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "328a3ed30acc7dc66e199b601808180e");
                                        return;
                                    }
                                    a.this.b(1);
                                    Class<?> cls2 = getClass();
                                    c.a(cls2, "oldChatId: " + e.c(a.this.c) + "  newChatId: " + floatingInfoBean.getChatId());
                                    if (TextUtils.equals(e.c(a.this.c), floatingInfoBean.getChatId()) || !TextUtils.equals("im", type2)) {
                                        return;
                                    }
                                    e.b(a.this.c, floatingInfoBean.getChatId());
                                    a.a(a.this, type2);
                                }
                            };
                            if (floatingInfoBean.getIsNeedRequest()) {
                                C0247a c0247a = new C0247a();
                                c0247a.b = false;
                                c0247a.f = true;
                                aVar.a(type2, c0247a);
                                return;
                            }
                            C0247a c0247a2 = new C0247a();
                            c0247a2.b = true;
                            c0247a2.f = false;
                            aVar.a(type2, c0247a2);
                            return;
                        } else if (TextUtils.equals("upload_voucher", type)) {
                            a aVar2 = a.this;
                            Object[] objArr4 = {floatingInfoBean};
                            ChangeQuickRedirect changeQuickRedirect4 = a.a;
                            if (PatchProxy.isSupport(objArr4, aVar2, changeQuickRedirect4, false, "366fd0f666e8fe1af0bd0e5144865504", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, aVar2, changeQuickRedirect4, false, "366fd0f666e8fe1af0bd0e5144865504");
                                return;
                            }
                            Context context = aVar2.c;
                            Object[] objArr5 = {context};
                            ChangeQuickRedirect changeQuickRedirect5 = e.a;
                            if ((PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "e90faabecb36d57105cb3ba48dceba42", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "e90faabecb36d57105cb3ba48dceba42")).booleanValue() : q.a(context, "customerservice_common").b("upload_floating_close", false)) && TextUtils.equals(floatingInfoBean.getMessageId(), e.d(aVar2.c))) {
                                c.a(aVar2.getClass(), "user already close upload voucher floating");
                                return;
                            }
                            aVar2.a("upload_voucher");
                            aVar2.a(floatingInfoBean);
                            e.c(aVar2.c, floatingInfoBean.getMessageId());
                            if (TextUtils.equals(floatingInfoBean.getMessageId(), e.d(aVar2.c))) {
                                String type3 = floatingInfoBean.getType();
                                C0247a c0247a3 = new C0247a();
                                c0247a3.b = true;
                                c0247a3.f = false;
                                aVar2.a(type3, c0247a3);
                                return;
                            }
                            String type4 = floatingInfoBean.getType();
                            C0247a c0247a4 = new C0247a();
                            c0247a4.b = false;
                            c0247a4.f = true;
                            aVar2.a(type4, c0247a4);
                            return;
                        } else {
                            return;
                        }
                    }
                    a.this.c(floatingInfoBean.getType());
                }
            }

            @Override // rx.e
            public final void onError(Throwable th) {
                Object[] objArr2 = {th};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "038a88a790d05ec243678b954ccce44c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "038a88a790d05ec243678b954ccce44c");
                    return;
                }
                Class<?> cls = getClass();
                c.b(cls, "queryFloatingStatus-> onError:" + th.toString());
            }
        });
    }

    private void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e359bf063b7537456c0832d6772da020", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e359bf063b7537456c0832d6772da020");
            return;
        }
        com.meituan.android.customerservice.kit.utils.d.a().a(this.t);
        NetworkConnectChangedManager a2 = NetworkConnectChangedManager.a();
        Context context = this.c;
        Object[] objArr2 = {context};
        ChangeQuickRedirect changeQuickRedirect2 = NetworkConnectChangedManager.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "81642750705c9a3437bef377c35c7650", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "81642750705c9a3437bef377c35c7650");
        } else if (!a2.b.get()) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            context.registerReceiver(a2.c, intentFilter);
            a2.b.set(true);
        }
        NetworkConnectChangedManager.a().a(this.u);
        com.dianping.sharkpush.b.a(this.w);
        TimerManager a3 = TimerManager.a();
        Context context2 = this.c;
        Object[] objArr3 = {context2};
        ChangeQuickRedirect changeQuickRedirect3 = TimerManager.a;
        if (PatchProxy.isSupport(objArr3, a3, changeQuickRedirect3, false, "419baffeb98cfa9f76eff9146194c5b8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, a3, changeQuickRedirect3, false, "419baffeb98cfa9f76eff9146194c5b8");
        } else if (!a3.c.get()) {
            context2.registerReceiver(a3.b, new IntentFilter("com.meituan.android.customerservice.REMOVE_FLOAT_ACTION"));
            a3.c.set(true);
        }
        a(Boolean.TRUE);
    }

    private void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df501a7b91293fe1bf160999d29d1988", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df501a7b91293fe1bf160999d29d1988");
            return;
        }
        com.meituan.android.customerservice.kit.utils.d.a().b(this.t);
        NetworkConnectChangedManager.a().b(this.u);
        NetworkConnectChangedManager a2 = NetworkConnectChangedManager.a();
        Context context = this.c;
        Object[] objArr2 = {context};
        ChangeQuickRedirect changeQuickRedirect2 = NetworkConnectChangedManager.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "2c60cf01d9cab10e58c4b20d8ec903e5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "2c60cf01d9cab10e58c4b20d8ec903e5");
        } else if (a2.c != null && a2.b.get()) {
            context.unregisterReceiver(a2.c);
            a2.b.set(false);
        }
        com.dianping.sharkpush.b.b(this.w);
        TimerManager.a().cancel(this.c);
        TimerManager a3 = TimerManager.a();
        Context context2 = this.c;
        Object[] objArr3 = {context2};
        ChangeQuickRedirect changeQuickRedirect3 = TimerManager.a;
        if (PatchProxy.isSupport(objArr3, a3, changeQuickRedirect3, false, "ec744269d632e219523e00c34963a621", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, a3, changeQuickRedirect3, false, "ec744269d632e219523e00c34963a621");
        } else if (a3.b != null && a3.c.get()) {
            context2.unregisterReceiver(a3.b);
            a3.c.set(false);
        }
        this.y = 0L;
        this.d = 0;
        this.i = null;
        e.d(this.c, "");
        a(Boolean.FALSE);
    }

    public final synchronized boolean a(String str) {
        int[] iArr;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f6577e540720ff62b0df18b72847f22f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f6577e540720ff62b0df18b72847f22f")).booleanValue();
        }
        Class<?> cls = getClass();
        c.a(cls, "floating createView: " + str);
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (TextUtils.equals("upload_voucher", str)) {
            c("im");
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a3e59f2db1dabbb87dec44c7c8b75a16", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a3e59f2db1dabbb87dec44c7c8b75a16")).booleanValue();
            }
            if (this.p != null) {
                return false;
            }
            e.b(this.c, false);
            this.p = new UploadFloatingView(this.c);
            HashMap<String, int[]> e = com.meituan.android.customerservice.utils.b.e();
            if (e != null && !e.isEmpty() && (iArr = e.get("upload_voucher")) != null && iArr.length == 3) {
                this.p.a(iArr[0], iArr[1], iArr[2]);
            }
            this.p.setOnFloatingClickListener(new UploadFloatingView.a() { // from class: com.meituan.android.customerservice.floating.a.5
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.customerservice.floating.UploadFloatingView.a
                public final void a() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "dd3cddedf6bbe695458a0dac94e8dbc5", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "dd3cddedf6bbe695458a0dac94e8dbc5");
                        return;
                    }
                    e.b(a.this.c, true);
                    a.this.b(4);
                    a.this.c("upload_voucher");
                }

                @Override // com.meituan.android.customerservice.floating.UploadFloatingView.a
                public final void b() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "f92a0abe73edf4f96f5651be26315773", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "f92a0abe73edf4f96f5651be26315773");
                        return;
                    }
                    if (!TextUtils.isEmpty(e.e(a.this.c))) {
                        com.meituan.android.customerservice.utils.b.a(a.this.c, Uri.parse(e.e(a.this.c)).buildUpon().toString());
                    }
                    a.this.b(2);
                    a.this.c("upload_voucher");
                }
            });
            if (this.p != null) {
                this.m = "upload_voucher";
            }
            b();
            return true;
        } else if (TextUtils.equals("im", str)) {
            c("upload_voucher");
            return e("im");
        } else if (TextUtils.equals("service_order", str)) {
            c("upload_voucher");
            return e("service_order");
        } else {
            return false;
        }
    }

    private boolean e(String str) {
        int[] iArr;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f2f2b505a4b416695d3b328fae4ad52d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f2f2b505a4b416695d3b328fae4ad52d")).booleanValue();
        }
        this.h++;
        if (this.o != null) {
            return false;
        }
        this.o = new FloatingView(this.c);
        HashMap<String, int[]> e = com.meituan.android.customerservice.utils.b.e();
        if (e != null && !e.isEmpty() && (iArr = e.get("im")) != null && iArr.length == 3) {
            this.o.a(iArr[0], iArr[1], iArr[2]);
        }
        this.o.setOnFloatingClickListener(new FloatingView.a() { // from class: com.meituan.android.customerservice.floating.a.4
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.customerservice.floating.FloatingView.a
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fcfdcf5080c8efae07ddd2c50236df57", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fcfdcf5080c8efae07ddd2c50236df57");
                    return;
                }
                if (!TextUtils.isEmpty(e.e(a.this.c))) {
                    com.meituan.android.customerservice.utils.b.a(a.this.c, Uri.parse(e.e(a.this.c)).buildUpon().toString());
                }
                a.this.b(2);
                a.this.c("im");
            }
        });
        if (this.o != null) {
            if (!TextUtils.equals(str, "im")) {
                if (TextUtils.equals(str, "service_order")) {
                    this.m = "service_order";
                }
            } else {
                this.m = "im";
            }
        }
        b();
        return true;
    }

    public final synchronized void b(final String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5f560aae08a1e326b3bcde6e834ba52a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5f560aae08a1e326b3bcde6e834ba52a");
            return;
        }
        if (this.o != null && !TextUtils.isEmpty(str)) {
            e.b(this.c, "floating_default_chat_id");
            final int i = this.h + 1;
            this.h = i;
            if (this.o.d()) {
                synchronized (this) {
                    a(true, true, str);
                    final int i2 = this.j + 1;
                    this.j = i2;
                    f.b(new Runnable() { // from class: com.meituan.android.customerservice.floating.a.6
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr2 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "18e69a014a186df7f9f63ec61503bf65", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "18e69a014a186df7f9f63ec61503bf65");
                                return;
                            }
                            if (i2 == a.this.j) {
                                a.this.a(false, true, str);
                            }
                            if (i == a.this.h) {
                                a.this.c(str);
                            }
                            a.this.a(false);
                        }
                    }, PayTask.j);
                }
            } else {
                c(str);
                a(false);
            }
        }
    }

    public final synchronized void c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "55d67216cbd853d51a02fd92cbc79718", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "55d67216cbd853d51a02fd92cbc79718");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            Class<?> cls = getClass();
            c.a(cls, "destroyViewIfPresent: " + str);
            if (TextUtils.equals("upload_voucher", str)) {
                g(str);
            } else if (TextUtils.equals("im", str)) {
                f(str);
            } else if (TextUtils.equals("service_order", str)) {
                f(str);
            } else {
                if (TextUtils.equals("all", str)) {
                    f(str);
                    g(str);
                }
            }
        }
    }

    private void f(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "605a8f3f3818850c190078754cce4c16", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "605a8f3f3818850c190078754cce4c16");
        } else if (this.o == null) {
        } else {
            this.h++;
            this.s.a = 0;
            this.s.b = str;
            this.o.b();
            if (!this.r.isEmpty()) {
                Iterator<Object> it = this.r.iterator();
                while (it.hasNext()) {
                    it.next();
                    new b(0, str);
                }
            }
            this.o = null;
            this.m = null;
            c();
        }
    }

    private void g(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "242e52cd0be503a386cab357e93abe18", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "242e52cd0be503a386cab357e93abe18");
        } else if (this.p == null) {
        } else {
            this.s.a = 0;
            this.s.b = str;
            this.p.b();
            if (!this.r.isEmpty()) {
                Iterator<Object> it = this.r.iterator();
                while (it.hasNext()) {
                    it.next();
                    new b(0, str);
                }
            }
            this.p = null;
            this.m = null;
            c();
        }
    }

    public final synchronized void a(final String str, final C0247a c0247a) {
        boolean z;
        Object[] objArr = {str, c0247a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7cf7861c33245f5f95f2336b0e27349f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7cf7861c33245f5f95f2336b0e27349f");
            return;
        }
        if (!TextUtils.isEmpty(str) && c0247a != null) {
            if (TextUtils.equals("upload_voucher", str) && this.p == null) {
                return;
            }
            if (TextUtils.equals("im", str) && this.o == null) {
                return;
            }
            if (TextUtils.equals("upload_voucher", str) && this.o != null) {
                c.a(getClass(), "show upload,but im or service do not destory");
                return;
            }
            Object[] objArr2 = {"im"};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "aa254d9644a4604dc13a971d36880ba4", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "aa254d9644a4604dc13a971d36880ba4")).booleanValue();
            } else {
                if (this.q != null && !this.q.isEmpty() && this.q.get("im") != null) {
                    z = this.q.get("im").booleanValue();
                }
                z = true;
            }
            if (z) {
                if (!com.meituan.android.customerservice.kit.utils.d.a().b) {
                    c.a(getClass(), "FloatingView in background, not show.");
                    if (TextUtils.equals("upload_voucher", str) || (TextUtils.equals("service_order", str) && c0247a.f)) {
                        this.l = true;
                    }
                    return;
                }
                if (h.a(this.c)) {
                    c.a(getClass(), "FloatingView can show, prepare show on ui thread.");
                    if (TextUtils.equals("upload_voucher", str)) {
                        this.s.a = 1;
                        this.s.b = str;
                        if (!this.r.isEmpty()) {
                            Iterator<Object> it = this.r.iterator();
                            while (it.hasNext()) {
                                it.next();
                                new b(1, str);
                            }
                        }
                        this.p.c();
                    } else if (TextUtils.equals("im", str) || TextUtils.equals("service_order", str)) {
                        this.s.a = 1;
                        this.s.b = str;
                        if (!this.r.isEmpty()) {
                            Iterator<Object> it2 = this.r.iterator();
                            while (it2.hasNext()) {
                                it2.next();
                                new b(1, str);
                            }
                        }
                        this.o.c();
                    }
                    if (this.i != null) {
                        this.i.run();
                        this.i = null;
                    }
                } else if (c0247a.b && c0247a.e == this.d && System.nanoTime() - c0247a.d < c0247a.c) {
                    f.a(new Runnable() { // from class: com.meituan.android.customerservice.floating.a.7
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "27aa8127072e6e4ac7b7016c21aaf87a", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "27aa8127072e6e4ac7b7016c21aaf87a");
                            } else {
                                a.this.a(str, c0247a);
                            }
                        }
                    }, 100L);
                } else if (c0247a.f) {
                    Class<?> cls = getClass();
                    c.a(cls, "FloatingView can show, non permission, pop dialog.loop check permission " + c0247a.b);
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (!PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "2385eeb01dc30b0a18422433d253aef5", RobustBitConfig.DEFAULT_VALUE)) {
                        f.b(new Runnable() { // from class: com.meituan.android.customerservice.floating.a.8
                            public static ChangeQuickRedirect a;

                            @Override // java.lang.Runnable
                            public final void run() {
                                Object[] objArr4 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "443b32fcc6211bf8eaf93d8c547a52cd", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "443b32fcc6211bf8eaf93d8c547a52cd");
                                    return;
                                }
                                Intent intent = new Intent(a.this.c, FloatingDialogActivity.class);
                                intent.putExtra("message", a.this.c.getString(R.string.cs_floating_permisson_dialog_content));
                                intent.setFlags(y.a);
                                a.this.c.startActivity(intent);
                            }
                        }, 500L);
                        return;
                    }
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "2385eeb01dc30b0a18422433d253aef5");
                } else {
                    Class<?> cls2 = getClass();
                    c.a(cls2, "FloatingView can show, non permission. loop check permission " + c0247a.b);
                }
            }
        }
    }

    public final synchronized void d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce81f1723c31c1aa2dfe6ec38368799a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce81f1723c31c1aa2dfe6ec38368799a");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            if (TextUtils.equals("upload_voucher", str)) {
                if (this.p == null) {
                    return;
                }
                this.s.a = 0;
                this.s.b = str;
                this.p.b();
                if (!this.r.isEmpty()) {
                    Iterator<Object> it = this.r.iterator();
                    while (it.hasNext()) {
                        it.next();
                        new b(0, str);
                    }
                }
            } else if (TextUtils.equals("im", str) || TextUtils.equals("service_order", str)) {
                if (this.o == null) {
                    return;
                }
                this.s.a = 0;
                this.s.b = str;
                this.o.b();
                if (!this.r.isEmpty()) {
                    Iterator<Object> it2 = this.r.iterator();
                    while (it2.hasNext()) {
                        it2.next();
                        new b(0, str);
                    }
                }
            }
        }
    }

    public final synchronized void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da04b26db04f5cabb02c8ecad1a4e112", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da04b26db04f5cabb02c8ecad1a4e112");
            return;
        }
        if (this.o != null) {
            this.o.setRedDotNumber(i);
        }
    }

    public final synchronized void a(boolean z, boolean z2, String str) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b569e529a7690a9d0c68b13d0c48f0a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b569e529a7690a9d0c68b13d0c48f0a");
            return;
        }
        if (this.o != null) {
            this.o.a(z, z2, str);
        }
    }

    public final void b(int i) {
        String c;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "105411c6b11106ade5e7d0b6c83d0691", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "105411c6b11106ade5e7d0b6c83d0691");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("logType", "OPERATION");
        hashMap.put("visitId", e.b(this.c));
        hashMap.put("pageName", this.g);
        String str = "";
        switch (i) {
            case 1:
                str = "展示浮窗";
                break;
            case 2:
                str = "点击浮窗";
                break;
            case 3:
                str = "超时关闭";
                break;
            case 4:
                str = "手动关闭";
                break;
        }
        hashMap.put("operationName", str);
        hashMap.put("operationComment", this.f);
        hashMap.put("operateTime", Long.valueOf(System.currentTimeMillis()));
        hashMap.put("phoneModel", Build.MANUFACTURER);
        hashMap.put("sysName", "android");
        hashMap.put("systemVersion", Integer.valueOf(Build.VERSION.SDK_INT));
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.customerservice.utils.b.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "32e404afb2f2d2feb0a34a8a0f82259d", RobustBitConfig.DEFAULT_VALUE)) {
            c = (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "32e404afb2f2d2feb0a34a8a0f82259d");
        } else {
            c = com.meituan.android.customerservice.utils.b.b != null ? com.meituan.android.customerservice.utils.b.b.c() : "";
        }
        hashMap.put("appVersion", c);
        hashMap.put("appName", Integer.valueOf(com.meituan.android.customerservice.utils.b.c()));
        com.meituan.android.customerservice.retrofit.a.a(hashMap);
    }

    private void a(Boolean bool) {
        Object[] objArr = {bool};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9cfaa4171cf6a9dae36ba25a06e54f12", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9cfaa4171cf6a9dae36ba25a06e54f12");
        } else {
            e.a(this.c, bool.booleanValue());
        }
    }

    boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5504491ee5e7da8fd4cad7f860915308", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5504491ee5e7da8fd4cad7f860915308")).booleanValue() : e.a(this.c);
    }

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.android.customerservice.floating.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0247a {
        public static ChangeQuickRedirect a;
        boolean b;
        long c;
        long d;
        Integer e;
        boolean f;
        private long g;

        public C0247a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "02b0ea6c0c8ca1a5880d7d34d5da2253", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "02b0ea6c0c8ca1a5880d7d34d5da2253");
                return;
            }
            this.b = false;
            this.c = 3000000000L;
            this.d = System.nanoTime();
            this.g = 100L;
            this.e = 0;
            this.f = false;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class b {
        public int a;
        public String b;

        public b() {
            this.a = 0;
            this.b = "im";
        }

        public b(int i, String str) {
            this.a = 0;
            this.b = "im";
            this.a = i;
            this.b = str;
        }
    }
}

package com.dianping.nvlbservice;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import com.dianping.nvlbservice.f;
import com.dianping.nvnetwork.Request;
import com.dianping.nvnetwork.n;
import com.dianping.nvnetwork.q;
import com.meituan.android.recce.host.RecceBridgeHandler;
import com.meituan.msc.modules.engine.requestPrefetch.PrefetchConfig;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import dianping.com.nvlinker.NVLinker;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import rx.d;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class j implements f {
    public static ChangeQuickRedirect a = null;
    public static boolean b = false;
    private static final byte[] i = "D7C6F71A12153EE5".getBytes();
    private static final byte[] j = "55C930D827BDABFD".getBytes();
    private final Context c;
    private boolean d;
    private final AtomicBoolean e;
    private long f;
    private List<e> g;
    private com.dianping.monitor.e h;
    private int k;
    private final Map<String, List<h>> l;
    private final Object m;
    private final CopyOnWriteArrayList<f.a> n;
    private final List<h> o;
    private final List<h> p;
    private final Random q;

    /* JADX WARN: Finally extract failed */
    public static /* synthetic */ void a(j jVar, long j2) {
        Request build;
        boolean z;
        com.dianping.monitor.e eVar;
        int i2 = 0;
        Object[] objArr = {new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, jVar, changeQuickRedirect, false, "53edb029e9c2933a8796d27a0085b364", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, jVar, changeQuickRedirect, false, "53edb029e9c2933a8796d27a0085b364");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        try {
            if (currentTimeMillis < jVar.f + j2) {
                Thread.sleep((jVar.f + j2) - currentTimeMillis);
            }
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, jVar, changeQuickRedirect2, false, "c6b12ab9c643be94ddeb7440cb15f383", RobustBitConfig.DEFAULT_VALUE)) {
                build = (Request) PatchProxy.accessDispatch(objArr2, jVar, changeQuickRedirect2, false, "c6b12ab9c643be94ddeb7440cb15f383");
            } else {
                String str = i.c ? "http://test.shark.dianping.com/api/multi/loadbalance" : "https://shark.dianping.com/api/multi/loadbalance";
                HashMap<String, String> hashMap = new HashMap<>();
                hashMap.put("t", String.valueOf(jVar.k));
                hashMap.put("v", "4");
                hashMap.put("a", String.valueOf(NVLinker.getAppID()));
                hashMap.put("p", "2");
                hashMap.put("u", NVLinker.getUnionID());
                build = new Request.Builder().method("POST").isFailOver(true).isPostFailOver(true).url(str).params(hashMap).addHeaders("Content-Type", PrefetchConfig.PREFETCH_POST_CONTENT_TYPE_FORM).build();
            }
            Request request = build;
            int a2 = n.a(request);
            Iterator<e> it = jVar.g.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                q a3 = it.next().a(request);
                if (a3 != null) {
                    int a4 = n.a(a3);
                    String a5 = k.a(request.d);
                    Object[] objArr3 = new Object[i2];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, jVar, changeQuickRedirect3, false, "2a1120fd29a390d318b62dafba0a0a93", RobustBitConfig.DEFAULT_VALUE)) {
                        eVar = (com.dianping.monitor.e) PatchProxy.accessDispatch(objArr3, jVar, changeQuickRedirect3, false, "2a1120fd29a390d318b62dafba0a0a93");
                    } else {
                        if (jVar.h == null) {
                            jVar.h = new com.dianping.monitor.impl.a(jVar.c, NVLinker.getAppID(), NVLinker.getAppversion()) { // from class: com.dianping.nvlbservice.j.2
                                public static ChangeQuickRedirect a;

                                @Override // com.dianping.monitor.impl.a
                                public final String getUnionid() {
                                    Object[] objArr4 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect4 = a;
                                    return PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "c57268a9bf65ba77b037db0d74c86584", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "c57268a9bf65ba77b037db0d74c86584") : NVLinker.getUnionID();
                                }
                            };
                        }
                        eVar = jVar.h;
                    }
                    eVar.pv4(0L, a5, 0, a3.c, a3.statusCode(), a2, a4, (int) (System.currentTimeMillis() - currentTimeMillis), a3.d, String.valueOf(a3.b), 33);
                    if (jVar.a(a3)) {
                        z = true;
                        break;
                    }
                    i2 = 0;
                }
            }
            if (z) {
                jVar.f = System.currentTimeMillis();
            }
            jVar.e.set(false);
            Iterator<f.a> it2 = jVar.n.iterator();
            while (it2.hasNext()) {
                it2.next().a(z);
            }
        } catch (Throwable th) {
            try {
                i.a("LBManagerService", th);
                jVar.e.set(false);
                Iterator<f.a> it3 = jVar.n.iterator();
                while (it3.hasNext()) {
                    it3.next().a(false);
                }
            } catch (Throwable th2) {
                jVar.e.set(false);
                Iterator<f.a> it4 = jVar.n.iterator();
                while (it4.hasNext()) {
                    it4.next().a(false);
                }
                throw th2;
            }
        }
    }

    public static /* synthetic */ void a(j jVar, boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, jVar, changeQuickRedirect, false, "e36bf9ed67d8cf8b3f25a4091b86b9f1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, jVar, changeQuickRedirect, false, "e36bf9ed67d8cf8b3f25a4091b86b9f1");
        } else if (jVar.d != z) {
            jVar.d = z;
            jVar.a(0L);
        }
    }

    public j(m... mVarArr) {
        byte[] decode;
        Object[] objArr = {mVarArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a9c8ff59b01e47d806c41c3a657f7294", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a9c8ff59b01e47d806c41c3a657f7294");
            return;
        }
        this.m = new Object();
        if (!NVLinker.isLinkerInit()) {
            throw new IllegalStateException("you should init nvlinker first.");
        }
        if (mVarArr == null) {
            throw new IllegalArgumentException("tunnelTypes can not be null.");
        }
        this.k = k.a(mVarArr);
        this.q = new Random(System.currentTimeMillis());
        this.l = new HashMap();
        this.g = new ArrayList();
        this.g.add(new a());
        this.e = new AtomicBoolean(false);
        this.c = NVLinker.getContext();
        this.n = new CopyOnWriteArrayList<>();
        this.d = NVLinker.isAppBackground();
        this.o = new ArrayList();
        this.p = new ArrayList();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "37a09037f3ab101c5a98e8f3fbf7bf0f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "37a09037f3ab101c5a98e8f3fbf7bf0f");
            return;
        }
        NVLinker.registerBackgroundStateListener(new NVLinker.AppBackgroundStateListener() { // from class: com.dianping.nvlbservice.j.1
            public static ChangeQuickRedirect a;

            @Override // dianping.com.nvlinker.NVLinker.AppBackgroundStateListener
            public final void onBackgroundStateChanged(boolean z) {
                Object[] objArr3 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "8dc2337f92c0509c73ee7282971c8894", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "8dc2337f92c0509c73ee7282971c8894");
                    return;
                }
                StringBuilder sb = new StringBuilder("lb service ");
                sb.append(z ? "background" : "foreground");
                i.a("LBManagerService", sb.toString());
                j.a(j.this, z);
            }
        });
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "17705294de00167c11ed919b735d6230", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "17705294de00167c11ed919b735d6230");
        } else {
            String string = this.c.getSharedPreferences(a(), 0).getString("ip_list_key_v4", "");
            if (!k.b(string) && (decode = Base64.decode(string, 0)) != null) {
                a(new String(decode), true);
            }
        }
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = a;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "42a0bd250d8c262e0c80aed1a25e9091", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "42a0bd250d8c262e0c80aed1a25e9091");
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(l.a("上海"));
            Collections.shuffle(arrayList, this.q);
            this.o.addAll(arrayList);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(l.a("北京"));
            Collections.shuffle(arrayList2, this.q);
            this.o.addAll(arrayList2);
            ArrayList arrayList3 = new ArrayList();
            arrayList3.addAll(l.a("广州"));
            Collections.shuffle(arrayList3, this.q);
            this.o.addAll(arrayList3);
        }
        Object[] objArr5 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect5 = a;
        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "2183c223081bd28c0da2f8a919e64984", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "2183c223081bd28c0da2f8a919e64984");
        } else {
            ArrayList arrayList4 = new ArrayList();
            arrayList4.addAll(l.b("上海"));
            Collections.shuffle(arrayList4, this.q);
            this.o.addAll(arrayList4);
            ArrayList arrayList5 = new ArrayList();
            arrayList5.addAll(l.b("北京"));
            Collections.shuffle(arrayList5, this.q);
            this.o.addAll(arrayList5);
            ArrayList arrayList6 = new ArrayList();
            arrayList6.addAll(l.b("广州"));
            Collections.shuffle(arrayList6, this.q);
            this.o.addAll(arrayList6);
        }
        this.o.addAll(l.a());
        this.o.addAll(l.c());
    }

    @Override // com.dianping.nvlbservice.f
    public final void a(final long j2) {
        Object[] objArr = {new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "523b7dd7dc2fcded0924c807226172d7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "523b7dd7dc2fcded0924c807226172d7");
        } else if (this.d) {
            i.a("LBManagerService", "lb service is background.");
        } else if (!this.e.compareAndSet(false, true)) {
            i.a("LBManagerService", "fetch is started.");
        } else {
            i.a("LBManagerService", "fetch...");
            a(new Runnable() { // from class: com.dianping.nvlbservice.j.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "766f5eab67848892ec47c595c86862cd", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "766f5eab67848892ec47c595c86862cd");
                    } else {
                        j.a(j.this, j2);
                    }
                }
            });
        }
    }

    @Override // com.dianping.nvlbservice.f
    public final void a(e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f77a929a28345821670b7a82a05437f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f77a929a28345821670b7a82a05437f");
        } else {
            this.g.add(0, eVar);
        }
    }

    @Override // com.dianping.nvlbservice.f
    public final List<h> a(m mVar) {
        Object[] objArr = {mVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "22ad5003856f17f92b67c73b7f6db431", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "22ad5003856f17f92b67c73b7f6db431") : a(mVar);
    }

    private List<h> a(m... mVarArr) {
        Object[] objArr = {mVarArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b043776c3e75741ad6f6b26f6d0f7668", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b043776c3e75741ad6f6b26f6d0f7668");
        }
        ArrayList arrayList = new ArrayList();
        if (!this.p.isEmpty()) {
            arrayList.addAll(a(this.p, mVarArr));
            return arrayList;
        }
        synchronized (this.m) {
            for (int i2 = 0; i2 <= 0; i2++) {
                try {
                    m mVar = mVarArr[0];
                    List<h> a2 = k.a(mVar, this.l.get(String.valueOf(mVar.g)));
                    if (a2 != null) {
                        arrayList.addAll(a2);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.addAll(a(this.o, mVarArr));
            return arrayList;
        }
        return arrayList;
    }

    private List<h> a(List<h> list, m... mVarArr) {
        Object[] objArr = {list, mVarArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "669adb1a7e0944844d3dea62adeb2c59", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "669adb1a7e0944844d3dea62adeb2c59");
        }
        ArrayList arrayList = new ArrayList();
        for (m mVar : mVarArr) {
            List<h> a2 = k.a(mVar, list);
            if (a2 != null) {
                arrayList.addAll(a2);
            }
        }
        return arrayList;
    }

    @Override // com.dianping.nvlbservice.f
    public final void a(f.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d08ba7a4374a6da3ed3fa28fa6afefde", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d08ba7a4374a6da3ed3fa28fa6afefde");
        } else {
            this.n.add(aVar);
        }
    }

    private boolean a(q qVar) {
        boolean z = false;
        Object[] objArr = {qVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4002d57b5d64786fd7e698aca20bb8f9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4002d57b5d64786fd7e698aca20bb8f9")).booleanValue();
        }
        try {
            if (qVar.result() == null || !qVar.isSuccess()) {
                return false;
            }
            i.b("LBManagerService", "nvnetwork_lb1:" + new String(qVar.result()));
            byte[] a2 = k.a(qVar.result(), i, j);
            Object[] objArr2 = {a2};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            String str = PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "37cd549079cb84335e08f655da6b345b", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "37cd549079cb84335e08f655da6b345b") : new String(a2, "UTF-8");
            if (b) {
                PrintStream printStream = System.out;
                printStream.println("ipJson: " + str);
            }
            Object[] objArr3 = {str};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "4313b220e1f69069f9be1ac1e6f0156f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "4313b220e1f69069f9be1ac1e6f0156f");
            } else {
                SharedPreferences.Editor edit = this.c.getSharedPreferences(a(), 0).edit();
                edit.putString("ip_list_key_v4", Base64.encodeToString((str == null ? "" : str).getBytes(), 0));
                edit.apply();
            }
            a(str, false);
            try {
                i.b("LBManagerService", "Loadbalance result :: " + str);
                return true;
            } catch (Exception e) {
                e = e;
                z = true;
                i.a("LBManagerService", e);
                e.printStackTrace();
                if (b) {
                    e.printStackTrace();
                }
                if (qVar.result() != null) {
                    i.b("LBManagerService", "nvnetwork_lb:" + new String(qVar.result()));
                } else {
                    i.b("LBManagerService", "nvnetwork_lb:  resp null");
                }
                return z;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    private String a() {
        m[] a2;
        String str;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "69095c01ce47517e85cd6ccf2951b4cf", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "69095c01ce47517e85cd6ccf2951b4cf");
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (m mVar : m.a()) {
            if ((this.k & mVar.g) != 0) {
                if (stringBuffer.length() > 0) {
                    stringBuffer.append(CommonConstant.Symbol.UNDERLINE);
                }
                stringBuffer.append(mVar.h);
            }
        }
        if (stringBuffer.length() == 0) {
            stringBuffer.append("unknown");
        }
        Object[] objArr2 = new Object[2];
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect2, false, "49f0855ccf21ee21511e2ad86c4b519a", RobustBitConfig.DEFAULT_VALUE)) {
            str = (String) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect2, false, "49f0855ccf21ee21511e2ad86c4b519a");
        } else if (TextUtils.isEmpty(b.b())) {
            str = "lb_ip_list_file";
        } else {
            str = "lb_ip_list_file" + b.b();
        }
        objArr2[0] = str;
        objArr2[1] = stringBuffer;
        return String.format("%s_%s", objArr2);
    }

    private void a(final Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "160cf2f07c16c408921627b16c469b5d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "160cf2f07c16c408921627b16c469b5d");
        } else if (Looper.getMainLooper() != Looper.myLooper()) {
            runnable.run();
        } else {
            rx.d.a(new rx.j<Object>() { // from class: com.dianping.nvlbservice.j.4
                public static ChangeQuickRedirect a;

                @Override // rx.e
                public final void onCompleted() {
                }

                @Override // rx.e
                public final void onNext(Object obj) {
                }

                @Override // rx.e
                public final void onError(Throwable th) {
                    Object[] objArr2 = {th};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "155d6d2a3a5b32531dfd6b8f826ffed1", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "155d6d2a3a5b32531dfd6b8f826ffed1");
                    } else {
                        i.a("LBManagerService", th);
                    }
                }
            }, rx.d.a((d.a) new d.a<Object>() { // from class: com.dianping.nvlbservice.j.5
                public static ChangeQuickRedirect a;

                @Override // rx.functions.b
                public final /* synthetic */ void call(Object obj) {
                    rx.j jVar = (rx.j) obj;
                    Object[] objArr2 = {jVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c83cbe7a40e7d2ada8739a3a220b6ac1", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c83cbe7a40e7d2ada8739a3a220b6ac1");
                        return;
                    }
                    runnable.run();
                    jVar.onNext("");
                    jVar.onCompleted();
                }
            }).b(rx.schedulers.a.e()));
        }
    }

    private void a(String str, boolean z) {
        List<h> list;
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e39f7c9f4d5bc7744b45c53ab8abcaa0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e39f7c9f4d5bc7744b45c53ab8abcaa0");
        } else if (!k.b(str)) {
            try {
                synchronized (this.m) {
                    this.l.clear();
                    JSONObject jSONObject = new JSONObject(str);
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        String string = jSONObject.getString(next);
                        if (!k.b(string)) {
                            String[] split = string.split(RecceBridgeHandler.RECCE_BRIDGE_ARGS_SEPARATOR);
                            if (!this.l.containsKey(next)) {
                                list = new ArrayList<>();
                                this.l.put(next, list);
                            } else {
                                list = this.l.get(next);
                            }
                            for (String str2 : split) {
                                if (str2 != null) {
                                    String trim = str2.trim();
                                    if (!k.b(trim)) {
                                        list.add(new h(trim, i.c ? 8000 : 443, Integer.parseInt(next)));
                                    }
                                }
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                i.a("LBManagerService", th);
            }
        }
    }
}

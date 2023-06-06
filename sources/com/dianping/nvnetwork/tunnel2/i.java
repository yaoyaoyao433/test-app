package com.dianping.nvnetwork.tunnel2;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import com.dianping.nvnetwork.mol.LbTask;
import com.dianping.nvnetwork.tunnel2.a;
import com.dianping.nvnetwork.tunnel2.h;
import com.dianping.nvnetwork.util.l;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.tencent.ijk.media.player.IjkMediaPlayer;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.net.Inet6Address;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import rx.d;
import rx.k;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class i {
    public static ChangeQuickRedirect a;
    static final rx.g f = rx.schedulers.a.e();
    private static a m = new a();
    private static final Comparator<File> p = new Comparator<File>() { // from class: com.dianping.nvnetwork.tunnel2.i.4
        public static ChangeQuickRedirect a;

        @Override // java.util.Comparator
        public final /* synthetic */ int compare(File file, File file2) {
            File file3 = file;
            File file4 = file2;
            Object[] objArr = {file3, file4};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "72d2021eb3f9b96f69c0365dd2186b1f", 6917529027641081856L)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "72d2021eb3f9b96f69c0365dd2186b1f")).intValue();
            }
            int i = ((file3.lastModified() - file4.lastModified()) > 0L ? 1 : ((file3.lastModified() - file4.lastModified()) == 0L ? 0 : -1));
            if (i < 0) {
                return -1;
            }
            return i > 0 ? 1 : 0;
        }
    };
    private static final Comparator<b> q = new Comparator<b>() { // from class: com.dianping.nvnetwork.tunnel2.i.5
        public static ChangeQuickRedirect a;

        @Override // java.util.Comparator
        public final /* synthetic */ int compare(b bVar, b bVar2) {
            b bVar3 = bVar;
            b bVar4 = bVar2;
            Object[] objArr = {bVar3, bVar4};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3669d43f97d49235d368065023b56b4f", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3669d43f97d49235d368065023b56b4f")).intValue() : bVar3.a() - bVar4.a();
        }
    };
    String b;
    final e c;
    AtomicBoolean d;
    LinkedBlockingQueue<h> e;
    k g;
    long h;
    k i;
    private final c j;
    private LinkedBlockingQueue<h> k;
    private LinkedList<b> l;
    private String n;
    private a.InterfaceC0102a o;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class a {
        public List<b> a = new LinkedList();
        public long b;
    }

    public static /* synthetic */ void a(i iVar, h hVar, int i) {
        Object[] objArr = {hVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, iVar, changeQuickRedirect, false, "53016086f976c6ce20bd712310839b5e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, iVar, changeQuickRedirect, false, "53016086f976c6ce20bd712310839b5e");
        } else if (iVar.d.get()) {
            hVar.a();
            com.dianping.nvnetwork.util.g.a("SmartRouting", "ping success, ip : " + hVar.c + " ,rtt :" + i);
            b bVar = new b();
            bVar.b = hVar.c;
            bVar.c = i;
            iVar.l.add(bVar);
            synchronized (iVar.k) {
                iVar.k.remove(hVar);
                iVar.k.notify();
            }
        }
    }

    public static /* synthetic */ void a(i iVar, Collection collection) {
        SharedPreferences sharedPreferences;
        Set<String> stringSet;
        Object[] objArr = {collection};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, iVar, changeQuickRedirect, false, "63ab33581ecf68063715eb7be56e48ce", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, iVar, changeQuickRedirect, false, "63ab33581ecf68063715eb7be56e48ce");
        } else if (com.dianping.nvnetwork.g.b() == null || collection == null || collection.size() <= 0 || (stringSet = (sharedPreferences = com.dianping.nvnetwork.g.b().getSharedPreferences(iVar.h(), 0)).getStringSet("ip_set", null)) == null) {
        } else {
            HashSet hashSet = new HashSet(stringSet);
            hashSet.removeAll(collection);
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putStringSet("ip_set", hashSet);
            edit.apply();
        }
    }

    public static /* synthetic */ boolean a(i iVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, iVar, changeQuickRedirect, false, "37f724288bfd80259951918cd2a7feb0", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, iVar, changeQuickRedirect, false, "37f724288bfd80259951918cd2a7feb0")).booleanValue() : com.dianping.nvnetwork.g.o() == 10001 && !com.dianping.nvnetwork.h.h().g() && com.dianping.nvnetwork.h.h().U && com.dianping.nvnetwork.util.j.a(com.dianping.nvnetwork.g.b());
    }

    public static /* synthetic */ boolean a(i iVar, List list) {
        int i;
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, iVar, changeQuickRedirect, false, "9f95135c586a1939db844c35288ee69f", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, iVar, changeQuickRedirect, false, "9f95135c586a1939db844c35288ee69f")).booleanValue();
        }
        a c = c();
        if (!c.a.isEmpty() || list.size() == c.a.size()) {
            long currentTimeMillis = System.currentTimeMillis() - c.b;
            LinkedList linkedList = new LinkedList();
            for (b bVar : c.a) {
                linkedList.add(bVar.b);
            }
            boolean containsAll = list.containsAll(linkedList);
            com.dianping.nvnetwork.h h = com.dianping.nvnetwork.h.h();
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.dianping.nvnetwork.h.a;
            if (PatchProxy.isSupport(objArr2, h, changeQuickRedirect2, false, "8e07aa62723fbef0362f95f0e68ebb40", 6917529027641081856L)) {
                i = ((Integer) PatchProxy.accessDispatch(objArr2, h, changeQuickRedirect2, false, "8e07aa62723fbef0362f95f0e68ebb40")).intValue();
            } else if (com.dianping.nvnetwork.g.f().b() == 1) {
                i = h.X;
            } else {
                i = h.Y;
            }
            boolean z = currentTimeMillis < ((long) (i * 1000));
            if (containsAll && z) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ void c(i iVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, iVar, changeQuickRedirect, false, "69e7c14f193270f427c802001b7665ed", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, iVar, changeQuickRedirect, false, "69e7c14f193270f427c802001b7665ed");
            return;
        }
        com.dianping.nvnetwork.util.g.a("SmartRouting", "ping racing stopping");
        if (iVar.g != null && iVar.g.isUnsubscribed()) {
            iVar.g.unsubscribe();
        }
        if (iVar.i != null && iVar.i.isUnsubscribed()) {
            iVar.i.unsubscribe();
        }
        iVar.a();
        iVar.d.set(false);
    }

    public static /* synthetic */ String e() {
        return d();
    }

    public i(e eVar, c cVar) {
        Object[] objArr = {eVar, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9358d7c736c3e4a8eda7dfdc601fbb9c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9358d7c736c3e4a8eda7dfdc601fbb9c");
            return;
        }
        this.b = "";
        this.d = new AtomicBoolean();
        this.k = new LinkedBlockingQueue<>();
        this.e = new LinkedBlockingQueue<>();
        this.l = new LinkedList<>();
        this.o = new a.InterfaceC0102a() { // from class: com.dianping.nvnetwork.tunnel2.i.1
            public static ChangeQuickRedirect a;

            @Override // com.dianping.nvnetwork.tunnel2.a.InterfaceC0102a
            public final synchronized void a(com.dianping.nvnetwork.tunnel2.a aVar, int i) {
                Object[] objArr2 = {aVar, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7d9fdfa8097d5a3369c0c431a74fe178", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7d9fdfa8097d5a3369c0c431a74fe178");
                    return;
                }
                aVar.h();
                final h hVar = (h) aVar;
                b bVar = new b();
                bVar.b = hVar.c;
                bVar.d = i;
                com.dianping.nvnetwork.util.g.a("SmartRouting", "Connection success, start ping racing :" + aVar.c);
                h.a aVar2 = new h.a() { // from class: com.dianping.nvnetwork.tunnel2.i.1.1
                    public static ChangeQuickRedirect a;

                    @Override // com.dianping.nvnetwork.tunnel2.h.a
                    public final void a(int i2) {
                        Object[] objArr3 = {Integer.valueOf(i2)};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e87564d0351a928d551b609072ddc2cf", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e87564d0351a928d551b609072ddc2cf");
                        } else {
                            i.a(i.this, hVar, i2);
                        }
                    }

                    @Override // com.dianping.nvnetwork.tunnel2.h.a
                    public final void a(Throwable th) {
                        Object[] objArr3 = {th};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a05796f4dfbefbe5977aee953ba79fb4", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a05796f4dfbefbe5977aee953ba79fb4");
                        } else {
                            i.this.a(hVar, th);
                        }
                    }
                };
                int i2 = com.dianping.nvnetwork.h.h().V - 1;
                Object[] objArr3 = {aVar2, Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect3 = h.f;
                if (PatchProxy.isSupport(objArr3, hVar, changeQuickRedirect3, false, "5db37a2b4c5f369d32ef78cf9dc5d0a6", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr3, hVar, changeQuickRedirect3, false, "5db37a2b4c5f369d32ef78cf9dc5d0a6");
                    return;
                }
                hVar.i = aVar2;
                hVar.j.set(i2);
                hVar.p();
            }

            @Override // com.dianping.nvnetwork.tunnel2.a.InterfaceC0102a
            public final synchronized void a(com.dianping.nvnetwork.tunnel2.a aVar, int i, Object obj) {
                Object[] objArr2 = {aVar, Integer.valueOf(i), obj};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b3ae33d10958f6aadad726d643f7cdcb", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b3ae33d10958f6aadad726d643f7cdcb");
                    return;
                }
                com.dianping.nvnetwork.util.g.a("SmartRouting", "Connection failed: timeout " + aVar.c);
                i.this.a((h) aVar, obj);
            }
        };
        this.c = eVar;
        this.j = cVar;
        b().a(new rx.functions.b<Void>() { // from class: com.dianping.nvnetwork.tunnel2.i.12
            @Override // rx.functions.b
            public final /* bridge */ /* synthetic */ void call(Void r1) {
            }
        }, new rx.functions.b<Throwable>() { // from class: com.dianping.nvnetwork.tunnel2.i.14
            @Override // rx.functions.b
            public final /* bridge */ /* synthetic */ void call(Throwable th) {
            }
        });
        l.a().a(j.class).a(rx.schedulers.a.d()).a(new rx.functions.b<j>() { // from class: com.dianping.nvnetwork.tunnel2.i.15
            public static ChangeQuickRedirect a;

            @Override // rx.functions.b
            public final /* synthetic */ void call(j jVar) {
                j jVar2 = jVar;
                Object[] objArr2 = {jVar2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "342ff501d09a4a6772d5a7fd382235a5", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "342ff501d09a4a6772d5a7fd382235a5");
                } else if (jVar2 != null && jVar2.a == 2 && i.a(i.this)) {
                    i.this.b().a(new rx.functions.b<Void>() { // from class: com.dianping.nvnetwork.tunnel2.i.15.1
                        public static ChangeQuickRedirect a;

                        @Override // rx.functions.b
                        public final /* synthetic */ void call(Void r14) {
                            Object[] objArr3 = {r14};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "baf7d88517a08f9351fdcfa5a3df75d0", 6917529027641081856L)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "baf7d88517a08f9351fdcfa5a3df75d0");
                                return;
                            }
                            List<SocketAddress> list = com.dianping.nvnetwork.tunnel.a.a(com.dianping.nvnetwork.g.b()).b().a;
                            if (i.a(i.this, (List) list)) {
                                return;
                            }
                            if (i.this.d.get()) {
                                i.c(i.this);
                            }
                            final i iVar = i.this;
                            Object[] objArr4 = {list};
                            ChangeQuickRedirect changeQuickRedirect4 = i.a;
                            if (PatchProxy.isSupport(objArr4, iVar, changeQuickRedirect4, false, "c74e1974c164592f0633358ac529abbf", 6917529027641081856L)) {
                                PatchProxy.accessDispatch(objArr4, iVar, changeQuickRedirect4, false, "c74e1974c164592f0633358ac529abbf");
                                return;
                            }
                            com.dianping.nvnetwork.util.g.a("SmartRouting", "startHorseRacing ");
                            iVar.h = System.currentTimeMillis();
                            iVar.a();
                            iVar.b = i.d();
                            iVar.d.set(true);
                            for (SocketAddress socketAddress : list) {
                                iVar.e.add(new h(iVar.c, socketAddress));
                            }
                            iVar.g = rx.d.a(com.dianping.nvnetwork.h.h().Z, 1L, TimeUnit.SECONDS, i.f).i(new rx.functions.g<Long, Boolean>() { // from class: com.dianping.nvnetwork.tunnel2.i.19
                                public static ChangeQuickRedirect a;

                                @Override // rx.functions.g
                                public final /* synthetic */ Boolean call(Long l) {
                                    Object[] objArr5 = {l};
                                    ChangeQuickRedirect changeQuickRedirect5 = a;
                                    return PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "91d62493c23951322c2caedd2419b734", 6917529027641081856L) ? (Boolean) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "91d62493c23951322c2caedd2419b734") : Boolean.valueOf(i.this.d.get());
                                }
                            }).a(new rx.functions.b<Long>() { // from class: com.dianping.nvnetwork.tunnel2.i.17
                                public static ChangeQuickRedirect a;

                                @Override // rx.functions.b
                                public final /* synthetic */ void call(Long l) {
                                    Object[] objArr5 = {l};
                                    ChangeQuickRedirect changeQuickRedirect5 = a;
                                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "5c20d15433b0b9b330bf845deb20b442", 6917529027641081856L)) {
                                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "5c20d15433b0b9b330bf845deb20b442");
                                    } else if (i.this.e.isEmpty() && i.this.k.isEmpty()) {
                                        i.this.g();
                                    } else {
                                        while (i.this.k.size() < com.dianping.nvnetwork.h.h().W && !i.this.e.isEmpty()) {
                                            h hVar = (h) i.this.e.poll();
                                            if (hVar != null) {
                                                i.this.k.add(hVar);
                                                hVar.a(5000, i.this.o);
                                                com.dianping.nvnetwork.util.g.a("SmartRouting", "ping racing try connect: " + hVar.c);
                                            }
                                        }
                                        Iterator it = i.this.k.iterator();
                                        while (it.hasNext()) {
                                            h hVar2 = (h) it.next();
                                            if (hVar2.k()) {
                                                i.this.a(hVar2, new IOException("ping timeout"));
                                            }
                                        }
                                    }
                                }
                            }, new rx.functions.b<Throwable>() { // from class: com.dianping.nvnetwork.tunnel2.i.18
                                public static ChangeQuickRedirect a;

                                @Override // rx.functions.b
                                public final /* synthetic */ void call(Throwable th) {
                                    Throwable th2 = th;
                                    Object[] objArr5 = {th2};
                                    ChangeQuickRedirect changeQuickRedirect5 = a;
                                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "503de66f5a300aa2d22a39fe4a317f41", 6917529027641081856L)) {
                                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "503de66f5a300aa2d22a39fe4a317f41");
                                        return;
                                    }
                                    com.dianping.nvnetwork.util.g.a("SmartRouting", "ping racing wtf ?? : " + th2.getMessage());
                                    i.c(i.this);
                                }
                            });
                        }
                    }, new rx.functions.b<Throwable>() { // from class: com.dianping.nvnetwork.tunnel2.i.15.2
                        @Override // rx.functions.b
                        public final /* bridge */ /* synthetic */ void call(Throwable th) {
                        }
                    });
                }
            }
        }, new rx.functions.b<Throwable>() { // from class: com.dianping.nvnetwork.tunnel2.i.16
            public static ChangeQuickRedirect a;

            @Override // rx.functions.b
            public final /* synthetic */ void call(Throwable th) {
                Throwable th2 = th;
                Object[] objArr2 = {th2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "59f9e8e60d1cccef35d479eecad16c99", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "59f9e8e60d1cccef35d479eecad16c99");
                } else {
                    th2.printStackTrace();
                }
            }
        });
    }

    void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2628dab550fa2a249b51689f78d5f215", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2628dab550fa2a249b51689f78d5f215");
            return;
        }
        Iterator<h> it = this.k.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        this.k.clear();
        this.e.clear();
        this.l.clear();
    }

    public final synchronized rx.d<Void> b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "17e696913c06776d6136b5d5521173f9", 6917529027641081856L)) {
            return (rx.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "17e696913c06776d6136b5d5521173f9");
        }
        return rx.d.a((d.a) new d.a<Void>() { // from class: com.dianping.nvnetwork.tunnel2.i.20
            public static ChangeQuickRedirect a;

            @Override // rx.functions.b
            public final /* synthetic */ void call(Object obj) {
                rx.j jVar = (rx.j) obj;
                Object[] objArr2 = {jVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3739fa1c7ac6197d0e786a81f3963965", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3739fa1c7ac6197d0e786a81f3963965");
                    return;
                }
                a aVar = new a();
                if (!com.dianping.nvnetwork.h.h().U) {
                    a unused = i.m = new a();
                    return;
                }
                File file = new File(i.this.a("shark_routing") + File.separator + i.e());
                try {
                    FileInputStream fileInputStream = new FileInputStream(file);
                    byte[] bArr = new byte[(int) file.length()];
                    fileInputStream.read(bArr);
                    fileInputStream.close();
                    JSONObject jSONObject = new JSONObject(new String(Base64.decode(bArr, 0)));
                    JSONArray jSONArray = jSONObject.getJSONArray(Constants.EventInfoConsts.KEY_LX_INNER_DATAS_LIST);
                    for (int i = 0; i < jSONArray.length(); i++) {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                        aVar.a.add(new b(new InetSocketAddress(jSONObject2.getString(IjkMediaPlayer.OnNativeInvokeListener.ARG_IP), jSONObject2.getInt(IjkMediaPlayer.OnNativeInvokeListener.ARG_PORT)), jSONObject2.getInt("rtt")));
                    }
                    aVar.b = jSONObject.getLong("time");
                } catch (IOException | JSONException e) {
                    com.dianping.nvnetwork.util.g.a("SmartRouting", e.getMessage());
                    aVar.a.clear();
                    a unused2 = i.m = aVar;
                }
                jVar.onNext(null);
                jVar.onCompleted();
            }
        }).b(f);
    }

    public static synchronized a c() {
        synchronized (i.class) {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0d998bcc6de1cb3eb235d0a20e197598", 6917529027641081856L)) {
                return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0d998bcc6de1cb3eb235d0a20e197598");
            } else if (!com.dianping.nvnetwork.h.h().U) {
                return new a();
            } else {
                return m;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(LinkedList<b> linkedList) throws Exception {
        Object[] objArr = {linkedList};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "af839d8937026f14c3d0ebb858bd92df", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "af839d8937026f14c3d0ebb858bd92df");
            return;
        }
        if (com.dianping.nvnetwork.g.b() != null && linkedList != null && !linkedList.isEmpty()) {
            m.a = linkedList;
            m.b = System.currentTimeMillis();
            com.dianping.nvnetwork.util.g.a("SmartRouting", "ping racing save result");
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            Iterator<b> it = linkedList.iterator();
            while (it.hasNext()) {
                b next = it.next();
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(IjkMediaPlayer.OnNativeInvokeListener.ARG_IP, ((InetSocketAddress) next.b).getHostName());
                jSONObject2.put(IjkMediaPlayer.OnNativeInvokeListener.ARG_PORT, ((InetSocketAddress) next.b).getPort());
                jSONObject2.put("rtt", next.c);
                jSONArray.put(jSONObject2);
            }
            jSONObject.put(Constants.EventInfoConsts.KEY_LX_INNER_DATAS_LIST, jSONArray);
            jSONObject.put("time", System.currentTimeMillis());
            String encodeToString = Base64.encodeToString(jSONObject.toString().getBytes(), 0);
            File file = new File(a("shark_routing") + File.separator + d());
            if (file.getParentFile() != null) {
                file.getParentFile().mkdirs();
            }
            if (!file.exists() && !file.isFile()) {
                file.createNewFile();
            }
            FileWriter fileWriter = new FileWriter(file, false);
            fileWriter.write(encodeToString);
            fileWriter.flush();
            fileWriter.close();
            f();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "95566b4357c88f95c29b114769a234be", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "95566b4357c88f95c29b114769a234be");
        }
        if (!TextUtils.isEmpty(this.n)) {
            return this.n;
        }
        String str2 = com.dianping.nvnetwork.g.b().getApplicationInfo().dataDir + File.separator + str;
        String a2 = com.dianping.nvtunnelkit.utils.d.a(com.dianping.nvnetwork.g.b());
        if (TextUtils.isEmpty(a2)) {
            this.n = str2;
        } else {
            this.n = str2 + a2;
        }
        return this.n;
    }

    static String d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8c980173feb694c8cfc56cb4a2259ae3", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8c980173feb694c8cfc56cb4a2259ae3");
        }
        String str = "mobile";
        if (com.dianping.nvnetwork.g.f().b() == 1) {
            String v = com.dianping.nvnetwork.g.v();
            if (TextUtils.isEmpty(v)) {
                v = "default";
            }
            str = "wifi_" + v;
        }
        return "shark_" + str;
    }

    private void f() {
        File[] listFiles;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8a6650b0fdeb54cbb654ebdcf1e96819", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8a6650b0fdeb54cbb654ebdcf1e96819");
            return;
        }
        int i = com.dianping.nvnetwork.h.h().aa;
        File file = new File(a("shark_routing"));
        if (file.exists() && (listFiles = file.listFiles(new FileFilter() { // from class: com.dianping.nvnetwork.tunnel2.i.3
            public static ChangeQuickRedirect a;

            @Override // java.io.FileFilter
            public final boolean accept(File file2) {
                Object[] objArr2 = {file2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5e174105d7550cf7ece9c55610c43b7c", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5e174105d7550cf7ece9c55610c43b7c")).booleanValue() : file2.getName().contains("wifi");
            }
        })) != null && listFiles.length > i) {
            Arrays.sort(listFiles, p);
            int length = listFiles.length - i;
            for (int i2 = 0; i2 < length; i2++) {
                listFiles[i2].delete();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(h hVar, Object obj) {
        Object[] objArr = {hVar, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd994340a68cf72b2a4da7eeed9a94aa", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd994340a68cf72b2a4da7eeed9a94aa");
        } else if (this.d.get()) {
            hVar.a();
            com.dianping.nvnetwork.util.g.a("SmartRouting", hVar.c + " ping failed, error: " + obj);
            b bVar = new b();
            bVar.b = hVar.c;
            bVar.c = Integer.MAX_VALUE;
            this.l.add(bVar);
            this.k.remove(hVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "52ff1a3422030e683083c8e0db1d0b46", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "52ff1a3422030e683083c8e0db1d0b46");
        } else if (d().equals(this.b)) {
            com.dianping.nvnetwork.util.g.a("SmartRouting", "ping racing completed");
            this.d.set(false);
            Collections.sort(this.l, q);
            final LinkedList linkedList = new LinkedList();
            linkedList.addAll(this.l);
            j jVar = new j();
            jVar.a = 1;
            jVar.b = linkedList;
            l.a().a(jVar);
            com.dianping.nvnetwork.g.d().pv3(0L, "shark/smartroutingping", com.dianping.nvnetwork.g.f().b(), 2, 0, 0, 0, (int) (System.currentTimeMillis() - this.h), null, 1);
            new LbTask().uploadLb(com.dianping.nvnetwork.g.f().b(), linkedList);
            rx.d.a(new com.dianping.nvnetwork.l(), rx.d.a((d.a) new d.a<Void>() { // from class: com.dianping.nvnetwork.tunnel2.i.7
                public static ChangeQuickRedirect a;

                @Override // rx.functions.b
                public final /* synthetic */ void call(Object obj) {
                    rx.j jVar2 = (rx.j) obj;
                    Object[] objArr2 = {jVar2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1c0e8c92784966571073a41cc4bc10cb", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1c0e8c92784966571073a41cc4bc10cb");
                        return;
                    }
                    try {
                        i.this.a(linkedList);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    jVar2.onCompleted();
                }
            }).b(f).a(new rx.functions.b<Throwable>() { // from class: com.dianping.nvnetwork.tunnel2.i.6
                public static ChangeQuickRedirect a;

                @Override // rx.functions.b
                public final /* synthetic */ void call(Throwable th) {
                    Throwable th2 = th;
                    Object[] objArr2 = {th2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fbd6525caff9ac586c43df61dab01897", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fbd6525caff9ac586c43df61dab01897");
                    } else {
                        th2.printStackTrace();
                    }
                }
            }));
            rx.d.a((d.a) new d.a<Void>() { // from class: com.dianping.nvnetwork.tunnel2.i.11
                public static ChangeQuickRedirect a;

                @Override // rx.functions.b
                public final /* synthetic */ void call(Object obj) {
                    rx.j jVar2 = (rx.j) obj;
                    Object[] objArr2 = {jVar2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "baf9ce62e3a4f71c55f18a0ceea67deb", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "baf9ce62e3a4f71c55f18a0ceea67deb");
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    Iterator it = linkedList.iterator();
                    while (it.hasNext()) {
                        b bVar = (b) it.next();
                        String hostAddress = ((InetSocketAddress) bVar.b).getAddress().getHostAddress();
                        if (!hostAddress.isEmpty() && bVar.c != Integer.MAX_VALUE) {
                            arrayList.add(hostAddress);
                        }
                    }
                    i.a(i.this, (Collection) arrayList);
                    jVar2.onCompleted();
                }
            }).b(f).a(new rx.functions.b<Throwable>() { // from class: com.dianping.nvnetwork.tunnel2.i.10
                public static ChangeQuickRedirect a;

                @Override // rx.functions.b
                public final /* synthetic */ void call(Throwable th) {
                    Throwable th2 = th;
                    Object[] objArr2 = {th2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "22cb1e8c8761f0f6f80a580f17ff6b18", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "22cb1e8c8761f0f6f80a580f17ff6b18");
                    } else {
                        th2.printStackTrace();
                    }
                }
            }).a(new rx.functions.b<Void>() { // from class: com.dianping.nvnetwork.tunnel2.i.8
                @Override // rx.functions.b
                public final /* bridge */ /* synthetic */ void call(Void r1) {
                }
            }, new rx.functions.b<Throwable>() { // from class: com.dianping.nvnetwork.tunnel2.i.9
                @Override // rx.functions.b
                public final /* bridge */ /* synthetic */ void call(Throwable th) {
                }
            });
        }
    }

    public final void a(final h hVar, e eVar) {
        Object[] objArr = {hVar, eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f13897b91f74da776af20ce8653bc4c9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f13897b91f74da776af20ce8653bc4c9");
        } else if (com.dianping.nvnetwork.h.h().F && hVar != null && this.j.b.contains(hVar)) {
            try {
                String hostAddress = hVar.getSecureSocketAddress() != null ? hVar.getSecureSocketAddress().getHostAddress() : "";
                if (!TextUtils.isEmpty(hostAddress)) {
                    com.dianping.nvnetwork.tunnel.a.a(com.dianping.nvnetwork.g.b()).a(hostAddress);
                    b(hostAddress);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            com.dianping.nvnetwork.util.i.a("smartRouting: soft close connection.");
            com.dianping.nvnetwork.tunnel.a.a(com.dianping.nvnetwork.g.b()).a(0);
            this.j.a(hVar);
            eVar.a(new Runnable() { // from class: com.dianping.nvnetwork.tunnel2.i.13
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4b19ff0cc3c1ce12d80bcae173f90168", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4b19ff0cc3c1ce12d80bcae173f90168");
                    } else {
                        hVar.a();
                    }
                }
            }, eVar.c());
            this.j.a();
        }
    }

    private void b(String str) {
        HashSet hashSet;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c29a9e3b0cd2f09f3a594649ab91943b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c29a9e3b0cd2f09f3a594649ab91943b");
        } else if (com.dianping.nvnetwork.g.b() == null || str == null || str.length() <= 0) {
        } else {
            SharedPreferences sharedPreferences = com.dianping.nvnetwork.g.b().getSharedPreferences(h(), 0);
            Set<String> stringSet = sharedPreferences.getStringSet("ip_set", null);
            if (stringSet == null) {
                hashSet = new HashSet();
            } else {
                hashSet = new HashSet(stringSet);
            }
            hashSet.add(str);
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putStringSet("ip_set", hashSet);
            edit.apply();
        }
    }

    private String h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "51373ef54358bae20dd5d2b6c910d5b1", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "51373ef54358bae20dd5d2b6c910d5b1");
        }
        String a2 = com.dianping.nvtunnelkit.utils.d.a(com.dianping.nvnetwork.g.b());
        if (TextUtils.isEmpty(a2)) {
            return "isolate_ips";
        }
        return "isolate_ips" + a2;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class b {
        public static ChangeQuickRedirect a;
        public SocketAddress b;
        public int c;
        public int d;

        public b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a8fb35b2d9c269778944adbe94b8ff7", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a8fb35b2d9c269778944adbe94b8ff7");
                return;
            }
            this.c = -1;
            this.d = Integer.MAX_VALUE;
        }

        public b(SocketAddress socketAddress, int i) {
            Object[] objArr = {socketAddress, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8bbf7a08928f235b0e417c6445f6c9b0", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8bbf7a08928f235b0e417c6445f6c9b0");
                return;
            }
            this.c = -1;
            this.d = Integer.MAX_VALUE;
            this.b = socketAddress;
            this.c = i;
        }

        public final int a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "438d01c4719a975d254ee837532777d5", 6917529027641081856L)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "438d01c4719a975d254ee837532777d5")).intValue();
            }
            if ((this.b instanceof InetSocketAddress) && (((InetSocketAddress) this.b).getAddress() instanceof Inet6Address)) {
                if (this.c != Integer.MAX_VALUE) {
                    return this.c;
                }
                return this.c - com.dianping.nvnetwork.h.h().ad;
            }
            return this.c;
        }
    }
}

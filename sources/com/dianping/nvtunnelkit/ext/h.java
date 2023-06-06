package com.dianping.nvtunnelkit.ext;

import android.os.Looper;
import android.support.annotation.VisibleForTesting;
import android.text.TextUtils;
import android.util.Base64;
import com.dianping.nvtunnelkit.conn.b;
import com.dianping.nvtunnelkit.kit.v;
import com.dianping.nvtunnelkit.kit.w;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.ijk.media.player.IjkMediaPlayer;
import java.io.File;
import java.io.FileFilter;
import java.io.FileWriter;
import java.net.Inet6Address;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;
import rx.d;
import rx.k;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class h<T extends w> implements com.dianping.nvtunnelkit.ext.b<T> {
    public static ChangeQuickRedirect a;
    private static final String b = com.dianping.nvtunnelkit.logger.a.a("SmartRouting");
    private static final Comparator<File> t = new Comparator<File>() { // from class: com.dianping.nvtunnelkit.ext.h.7
        public static ChangeQuickRedirect a;

        @Override // java.util.Comparator
        public final /* synthetic */ int compare(File file, File file2) {
            File file3 = file;
            File file4 = file2;
            Object[] objArr = {file3, file4};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a165f408ba68b0ad46931969c05491ee", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a165f408ba68b0ad46931969c05491ee")).intValue();
            }
            int i = ((file3.lastModified() - file4.lastModified()) > 0L ? 1 : ((file3.lastModified() - file4.lastModified()) == 0L ? 0 : -1));
            if (i < 0) {
                return -1;
            }
            return i > 0 ? 1 : 0;
        }
    };
    private final com.dianping.nvtunnelkit.kit.e<T> c;
    private k d;
    private k e;
    private final v f;
    private volatile a g;
    private final Object h;
    private final Object i;
    private String j;
    private final List<com.dianping.nvtunnelkit.conn.b> k;
    private final Queue<com.dianping.nvtunnelkit.conn.b> l;
    private final List<b> m;
    private final i n;
    private final com.dianping.nvtunnelkit.kit.a o;
    private final AtomicBoolean p;
    private final d q;
    private long r;
    private com.dianping.nvtunnelkit.conn.d s;
    private final Comparator<b> u;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class a {
        public List<b> a = new LinkedList();
        public long b;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface d {
        String a();

        void a(String str);

        void a(Collection<String> collection);

        List<com.dianping.nvtunnelkit.ext.c> b();
    }

    public static /* synthetic */ void a(h hVar, com.dianping.nvtunnelkit.conn.b bVar, int i) {
        Object[] objArr = {bVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, hVar, changeQuickRedirect, false, "7f4c2a347f87192404d88594abc09df9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, hVar, changeQuickRedirect, false, "7f4c2a347f87192404d88594abc09df9");
            return;
        }
        com.dianping.nvtunnelkit.logger.b.b(b, String.format("conn ping completed, ip: %s, avgRtt: %s", bVar.q, Integer.valueOf(i)));
        synchronized (hVar.h) {
            if (hVar.k.contains(bVar)) {
                hVar.k.remove(bVar);
                bVar.t();
                hVar.m.add(new b(bVar.m, i, bVar.l.g));
                if (com.dianping.nvtunnelkit.utils.a.b(hVar.k) && com.dianping.nvtunnelkit.utils.a.b(hVar.l)) {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, hVar, changeQuickRedirect2, false, "7b8222a937b5ddead4613ed028c29ed7", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, hVar, changeQuickRedirect2, false, "7b8222a937b5ddead4613ed028c29ed7");
                    } else {
                        com.dianping.nvtunnelkit.logger.b.b(b, "handleRacingCompleted...");
                        synchronized (hVar.h) {
                            if (!com.dianping.nvtunnelkit.utils.f.a(hVar.j, hVar.j())) {
                                com.dianping.nvtunnelkit.logger.b.b(b, "NetworkType changed.");
                            } else {
                                com.dianping.nvtunnelkit.ext.d.a().pv3(0L, "shark/smartroutingping", com.dianping.nvtunnelkit.utils.c.c(), 2, 0, 0, 0, (int) (System.currentTimeMillis() - hVar.r), null, 1);
                                Collections.sort(hVar.m, hVar.u);
                                final LinkedList linkedList = new LinkedList();
                                linkedList.addAll(hVar.m);
                                Object[] objArr3 = {linkedList};
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, hVar, changeQuickRedirect3, false, "07b9fefb30a76be3ddb8d894c44f69bf", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, hVar, changeQuickRedirect3, false, "07b9fefb30a76be3ddb8d894c44f69bf");
                                } else if (!com.dianping.nvtunnelkit.utils.a.b(linkedList)) {
                                    rx.d.a(new c(), rx.d.a((d.a) new d.a<String>() { // from class: com.dianping.nvtunnelkit.ext.h.2
                                        public static ChangeQuickRedirect a;

                                        @Override // rx.functions.b
                                        public final /* synthetic */ void call(Object obj) {
                                            rx.j jVar = (rx.j) obj;
                                            Object[] objArr4 = {jVar};
                                            ChangeQuickRedirect changeQuickRedirect4 = a;
                                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "db3fe141c610373f0888101f6d0cc993", RobustBitConfig.DEFAULT_VALUE)) {
                                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "db3fe141c610373f0888101f6d0cc993");
                                                return;
                                            }
                                            try {
                                                com.dianping.nvtunnelkit.logger.b.b(h.b, "ping racing save mResult");
                                                JSONObject jSONObject = new JSONObject();
                                                JSONArray jSONArray = new JSONArray();
                                                for (b bVar2 : linkedList) {
                                                    JSONObject jSONObject2 = new JSONObject();
                                                    jSONObject2.put(IjkMediaPlayer.OnNativeInvokeListener.ARG_IP, ((InetSocketAddress) bVar2.b).getHostName());
                                                    jSONObject2.put(IjkMediaPlayer.OnNativeInvokeListener.ARG_PORT, ((InetSocketAddress) bVar2.b).getPort());
                                                    jSONObject2.put("rtt", bVar2.c);
                                                    jSONObject2.put("pingoffset", bVar2.d);
                                                    jSONArray.put(jSONObject2);
                                                }
                                                jSONObject.put(Constants.EventInfoConsts.KEY_LX_INNER_DATAS_LIST, jSONArray);
                                                jSONObject.put("time", System.currentTimeMillis());
                                                String encodeToString = Base64.encodeToString(jSONObject.toString().getBytes(), 0);
                                                synchronized (h.this.i) {
                                                    File file = new File(h.this.e() + File.separator + h.this.j());
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
                                                    h.l(h.this);
                                                }
                                                a aVar = new a();
                                                aVar.a = linkedList;
                                                aVar.b = System.currentTimeMillis();
                                                synchronized (h.this.h) {
                                                    h.this.g = h.b(h.this, aVar);
                                                }
                                            } catch (Exception e) {
                                                com.dianping.nvtunnelkit.logger.b.a(h.b, e);
                                            }
                                            jVar.onNext("");
                                            jVar.onCompleted();
                                        }
                                    }).b(com.dianping.nvtunnelkit.core.c.a().b));
                                }
                                Object[] objArr4 = {linkedList};
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr4, hVar, changeQuickRedirect4, false, "2e3e0f05783fc85763b62c69fab2fa46", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr4, hVar, changeQuickRedirect4, false, "2e3e0f05783fc85763b62c69fab2fa46");
                                } else {
                                    rx.d.a(new c(), rx.d.a((d.a) new d.a<String>() { // from class: com.dianping.nvtunnelkit.ext.h.4
                                        public static ChangeQuickRedirect a;

                                        @Override // rx.functions.b
                                        public final /* synthetic */ void call(Object obj) {
                                            rx.j jVar = (rx.j) obj;
                                            Object[] objArr5 = {jVar};
                                            ChangeQuickRedirect changeQuickRedirect5 = a;
                                            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "61bbf8b263ed595486443cd4237fb872", RobustBitConfig.DEFAULT_VALUE)) {
                                                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "61bbf8b263ed595486443cd4237fb872");
                                                return;
                                            }
                                            ArrayList arrayList = new ArrayList();
                                            for (b bVar2 : linkedList) {
                                                String hostAddress = ((InetSocketAddress) bVar2.b).getAddress().getHostAddress();
                                                if (!com.dianping.nvtunnelkit.utils.f.a(hostAddress) && bVar2.c != Integer.MAX_VALUE) {
                                                    arrayList.add(hostAddress);
                                                }
                                            }
                                            h.a(h.this, (Collection) arrayList);
                                            jVar.onNext("");
                                            jVar.onCompleted();
                                        }
                                    }).b(com.dianping.nvtunnelkit.core.c.a().b));
                                }
                                Object[] objArr5 = {linkedList};
                                ChangeQuickRedirect changeQuickRedirect5 = a;
                                if (PatchProxy.isSupport(objArr5, hVar, changeQuickRedirect5, false, "410b1fa073acd23bd648fb31848592fb", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr5, hVar, changeQuickRedirect5, false, "410b1fa073acd23bd648fb31848592fb");
                                } else {
                                    hVar.c(linkedList);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static /* synthetic */ void a(h hVar, Collection collection) {
        Object[] objArr = {collection};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, hVar, changeQuickRedirect, false, "a58efbccaac9a031953bbe2ff303766e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, hVar, changeQuickRedirect, false, "a58efbccaac9a031953bbe2ff303766e");
        } else if (com.dianping.nvtunnelkit.utils.a.b(collection) || !hVar.f.m) {
        } else {
            hVar.f();
            hVar.q.a(collection);
        }
    }

    public static /* synthetic */ boolean a(h hVar, List list, a aVar) {
        long j;
        boolean z = false;
        Object[] objArr = {list, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, hVar, changeQuickRedirect, false, "c976b4d4ec45ad4ec752ef8652017f68", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, hVar, changeQuickRedirect, false, "c976b4d4ec45ad4ec752ef8652017f68")).booleanValue();
        }
        if (!aVar.a.isEmpty() || list.size() == aVar.a.size()) {
            long currentTimeMillis = System.currentTimeMillis() - aVar.b;
            LinkedList linkedList = new LinkedList();
            for (b bVar : aVar.a) {
                linkedList.add(bVar.b);
            }
            boolean containsAll = list.containsAll(linkedList);
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, hVar, changeQuickRedirect2, false, "6308dad401fbba520922db1ec3569703", RobustBitConfig.DEFAULT_VALUE)) {
                j = ((Long) PatchProxy.accessDispatch(objArr2, hVar, changeQuickRedirect2, false, "6308dad401fbba520922db1ec3569703")).longValue();
            } else if (com.dianping.nvtunnelkit.utils.c.c() == 1) {
                j = hVar.n.g;
            } else {
                j = hVar.n.h;
            }
            boolean z2 = currentTimeMillis < j * 1000;
            if (containsAll && z2) {
                z = true;
            }
        }
        com.dianping.nvtunnelkit.logger.b.b(b, "checkSame... ret: " + z);
        return z;
    }

    public static /* synthetic */ a b(h hVar, a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, hVar, changeQuickRedirect, false, "070f691864dd0c0ffee918a682ce4a01", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, hVar, changeQuickRedirect, false, "070f691864dd0c0ffee918a682ce4a01");
        }
        a aVar2 = new a();
        aVar2.b = aVar.b;
        aVar2.a.addAll(aVar.a);
        return aVar2;
    }

    public static /* synthetic */ rx.d c(h hVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, hVar, changeQuickRedirect, false, "b02e583289f318a8c0b387c2e326309b", RobustBitConfig.DEFAULT_VALUE) ? (rx.d) PatchProxy.accessDispatch(objArr, hVar, changeQuickRedirect, false, "b02e583289f318a8c0b387c2e326309b") : rx.d.a(hVar.h(), 1L, TimeUnit.SECONDS, com.dianping.nvtunnelkit.core.c.a().b).i(new rx.functions.g<Long, Boolean>() { // from class: com.dianping.nvtunnelkit.ext.h.14
            public static ChangeQuickRedirect a;

            /* JADX INFO: Access modifiers changed from: private */
            @Override // rx.functions.g
            /* renamed from: a */
            public Boolean call(Long l) {
                Boolean valueOf;
                boolean z = true;
                Object[] objArr2 = {l};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9e7bc94b98f04aafd7f32cb815567d29", RobustBitConfig.DEFAULT_VALUE)) {
                    return (Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9e7bc94b98f04aafd7f32cb815567d29");
                }
                synchronized (h.this.h) {
                    if (!com.dianping.nvtunnelkit.utils.a.c(h.this.k) && !com.dianping.nvtunnelkit.utils.a.c(h.this.l)) {
                        z = false;
                    }
                    valueOf = Boolean.valueOf(z);
                }
                return valueOf;
            }
        }).b(new rx.functions.b<Long>() { // from class: com.dianping.nvtunnelkit.ext.h.13
            public static ChangeQuickRedirect a;

            @Override // rx.functions.b
            public final /* synthetic */ void call(Long l) {
                Object[] objArr2 = {l};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7d48e2f59959c061cf7c6fccd4ca0dc2", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7d48e2f59959c061cf7c6fccd4ca0dc2");
                    return;
                }
                synchronized (h.this.h) {
                    while (com.dianping.nvtunnelkit.utils.a.a(h.this.k) < h.i(h.this) && com.dianping.nvtunnelkit.utils.a.c(h.this.l)) {
                        com.dianping.nvtunnelkit.conn.b bVar = (com.dianping.nvtunnelkit.conn.b) h.this.l.poll();
                        h.this.k.add(bVar);
                        bVar.a(bVar.l.d);
                    }
                    for (int a2 = com.dianping.nvtunnelkit.utils.a.a(h.this.k) - 1; a2 >= 0; a2--) {
                        com.dianping.nvtunnelkit.conn.b bVar2 = (com.dianping.nvtunnelkit.conn.b) h.this.k.get(a2);
                        if (bVar2.m()) {
                            h.a(h.this, bVar2, Integer.MAX_VALUE);
                        }
                    }
                }
            }
        });
    }

    public static /* synthetic */ void l(h hVar) {
        File[] listFiles;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, hVar, changeQuickRedirect, false, "dc1993cf1747602966c3feae571329df", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, hVar, changeQuickRedirect, false, "dc1993cf1747602966c3feae571329df");
            return;
        }
        int i = hVar.n.b;
        File file = new File(hVar.e());
        if (!file.exists() || (listFiles = file.listFiles(new FileFilter() { // from class: com.dianping.nvtunnelkit.ext.h.3
            public static ChangeQuickRedirect a;

            @Override // java.io.FileFilter
            public final boolean accept(File file2) {
                Object[] objArr2 = {file2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e55ca440f8af6257c1fe30caa8ae1021", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e55ca440f8af6257c1fe30caa8ae1021")).booleanValue() : file2.getName().contains("wifi");
            }
        })) == null || listFiles.length <= i) {
            return;
        }
        Arrays.sort(listFiles, t);
        int length = listFiles.length - i;
        for (int i2 = 0; i2 < length; i2++) {
            listFiles[i2].delete();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.dianping.nvtunnelkit.ext.b
    public final /* synthetic */ void c(com.dianping.nvtunnelkit.conn.c cVar) {
        List<T> b2;
        w wVar = (w) cVar;
        Object[] objArr = {wVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "80deecb12912d80a4a3f4c6b5b441597", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "80deecb12912d80a4a3f4c6b5b441597");
            return;
        }
        String str = b;
        com.dianping.nvtunnelkit.logger.b.b(str, "isolateConnection enable: " + this.f.m);
        if (!this.f.m || wVar == null || (b2 = this.c.b.b()) == null) {
            return;
        }
        synchronized (b2) {
            if (b2.contains(wVar)) {
                try {
                    SocketAddress socketAddress = wVar.m;
                    if (socketAddress instanceof InetSocketAddress) {
                        String hostAddress = ((InetSocketAddress) socketAddress).getAddress().getHostAddress();
                        if (com.dianping.nvtunnelkit.utils.f.b(hostAddress)) {
                            Object[] objArr2 = {hostAddress};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1d4773bff092c64643b628518c5f76ee", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1d4773bff092c64643b628518c5f76ee");
                            } else {
                                String str2 = b;
                                com.dianping.nvtunnelkit.logger.b.b(str2, "saveIsolateIP ip: " + hostAddress);
                                if (!com.dianping.nvtunnelkit.utils.f.a(hostAddress) && this.f.m) {
                                    f();
                                    this.q.a(hostAddress);
                                }
                            }
                        }
                    }
                } catch (Exception e) {
                    com.dianping.nvtunnelkit.logger.b.a(b, e);
                }
                if (this.o != null) {
                    this.o.d();
                }
                this.c.b.c(wVar);
            }
        }
    }

    public h(com.dianping.nvtunnelkit.kit.e<T> eVar, com.dianping.nvtunnelkit.kit.a aVar, d dVar) {
        Object[] objArr = {eVar, aVar, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "41c51f5eec4f8c919a98955cebe6751b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "41c51f5eec4f8c919a98955cebe6751b");
            return;
        }
        this.h = new Object();
        this.i = new Object();
        this.m = new LinkedList();
        this.s = new com.dianping.nvtunnelkit.conn.d<com.dianping.nvtunnelkit.conn.b>() { // from class: com.dianping.nvtunnelkit.ext.h.5
            public static ChangeQuickRedirect a;

            @Override // com.dianping.nvtunnelkit.conn.d
            public final /* bridge */ /* synthetic */ void a(com.dianping.nvtunnelkit.conn.b bVar, Throwable th) {
            }

            @Override // com.dianping.nvtunnelkit.conn.d
            public final /* synthetic */ void a(com.dianping.nvtunnelkit.conn.b bVar) {
                final com.dianping.nvtunnelkit.conn.b bVar2 = bVar;
                Object[] objArr2 = {bVar2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8ceab7a764b392b2645cf82efc9e0af0", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8ceab7a764b392b2645cf82efc9e0af0");
                    return;
                }
                com.dianping.nvtunnelkit.logger.b.a(h.b, "onConnectSuccess....");
                synchronized (h.this.h) {
                    if (h.this.k.contains(bVar2)) {
                        b.a aVar2 = new b.a() { // from class: com.dianping.nvtunnelkit.ext.h.5.1
                            public static ChangeQuickRedirect a;

                            @Override // com.dianping.nvtunnelkit.conn.b.a
                            public final void a(int i) {
                                Object[] objArr3 = {Integer.valueOf(i)};
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "80e71b96c0425a334d22628403cccc62", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "80e71b96c0425a334d22628403cccc62");
                                } else {
                                    h.a(h.this, bVar2, i);
                                }
                            }

                            @Override // com.dianping.nvtunnelkit.conn.b.a
                            public final void a(Throwable th) {
                                Object[] objArr3 = {th};
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "1f31081c47e466e364194a34465429e3", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "1f31081c47e466e364194a34465429e3");
                                } else {
                                    h.a(h.this, bVar2, Integer.MAX_VALUE);
                                }
                            }
                        };
                        int m = h.m(h.this);
                        Object[] objArr3 = {aVar2, Integer.valueOf(m)};
                        ChangeQuickRedirect changeQuickRedirect3 = com.dianping.nvtunnelkit.conn.b.j;
                        if (PatchProxy.isSupport(objArr3, bVar2, changeQuickRedirect3, false, "87d9d0d339ec174b405b7d1e9580d1e7", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, bVar2, changeQuickRedirect3, false, "87d9d0d339ec174b405b7d1e9580d1e7");
                        } else {
                            bVar2.v = aVar2;
                            bVar2.p.set(m);
                            bVar2.q();
                        }
                    }
                }
            }

            @Override // com.dianping.nvtunnelkit.conn.d
            public final /* synthetic */ void b(com.dianping.nvtunnelkit.conn.b bVar) {
                com.dianping.nvtunnelkit.conn.b bVar2 = bVar;
                Object[] objArr2 = {bVar2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4109fa1ee54fc79336a123c44b0e12f2", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4109fa1ee54fc79336a123c44b0e12f2");
                    return;
                }
                com.dianping.nvtunnelkit.logger.b.a(h.b, "onConnectClosed....");
                h.a(h.this, bVar2, Integer.MAX_VALUE);
            }
        };
        this.u = new Comparator<b>() { // from class: com.dianping.nvtunnelkit.ext.h.8
            public static ChangeQuickRedirect a;

            @Override // java.util.Comparator
            public final /* synthetic */ int compare(b bVar, b bVar2) {
                b bVar3 = bVar;
                b bVar4 = bVar2;
                Object[] objArr2 = {bVar3, bVar4};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "20b9a441ab6dea2cb09a811f08b81090", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "20b9a441ab6dea2cb09a811f08b81090")).intValue() : a(bVar3) - a(bVar4);
            }

            private int a(b bVar) {
                Object[] objArr2 = {bVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8a7be60425a81a8acc154c59f7a88f4b", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8a7be60425a81a8acc154c59f7a88f4b")).intValue();
                }
                if ((bVar.b instanceof InetSocketAddress) && (((InetSocketAddress) bVar.b).getAddress() instanceof Inet6Address)) {
                    return bVar.c == Integer.MAX_VALUE ? bVar.c - 500 : bVar.c;
                }
                return bVar.c;
            }
        };
        this.c = eVar;
        this.f = this.c.c;
        this.k = new ArrayList();
        this.l = new LinkedList();
        this.q = dVar;
        this.n = this.f.v;
        this.o = aVar;
        this.p = new AtomicBoolean(false);
    }

    @Override // com.dianping.nvtunnelkit.ext.b
    public final void a(final List<SocketAddress> list) {
        boolean z;
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "45979ce4b7d41d8734530834383f8ca5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "45979ce4b7d41d8734530834383f8ca5");
            return;
        }
        this.r = System.currentTimeMillis();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f97fecc1c1ef7e7371d4dcbd4a281bdb", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f97fecc1c1ef7e7371d4dcbd4a281bdb")).booleanValue();
        } else {
            z = !this.c.j();
        }
        if (!z) {
            com.dianping.nvtunnelkit.logger.b.b(b, "startRacing ....env disable.");
        } else if (this.p.get()) {
        } else {
            if (com.dianping.nvtunnelkit.utils.a.b(this.c.b.b())) {
                com.dianping.nvtunnelkit.logger.b.b(b, "startRacing wait for tunnel connections.");
                g();
                this.p.set(true);
                this.e = rx.d.a(new c(), rx.d.a(h(), 60L, TimeUnit.SECONDS, com.dianping.nvtunnelkit.core.c.a().b).i(new rx.functions.g<Long, Boolean>() { // from class: com.dianping.nvtunnelkit.ext.h.9
                    public static ChangeQuickRedirect a;

                    @Override // rx.functions.g
                    public final /* synthetic */ Boolean call(Long l) {
                        Long l2 = l;
                        Object[] objArr3 = {l2};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "092d657db32d82dfcda0b731e23d8379", RobustBitConfig.DEFAULT_VALUE)) {
                            return (Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "092d657db32d82dfcda0b731e23d8379");
                        }
                        if (l2.longValue() >= 5) {
                            h.this.p.set(false);
                        }
                        return Boolean.valueOf(h.this.p.get());
                    }
                }).b(new rx.functions.b<Long>() { // from class: com.dianping.nvtunnelkit.ext.h.1
                    public static ChangeQuickRedirect a;

                    @Override // rx.functions.b
                    public final /* synthetic */ void call(Long l) {
                        Object[] objArr3 = {l};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "85f0407618e88a1c2acaf82744f52ca1", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "85f0407618e88a1c2acaf82744f52ca1");
                        } else if (com.dianping.nvtunnelkit.utils.a.c(h.this.c.b.b())) {
                            h.this.p.set(false);
                            h.this.b(list);
                        }
                    }
                }));
                return;
            }
            b(list);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final List<SocketAddress> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "efad6f32ed9f6e19a11f7eba6c9a66e8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "efad6f32ed9f6e19a11f7eba6c9a66e8");
            return;
        }
        com.dianping.nvtunnelkit.logger.b.b(b, "realStartRacing, address size: " + com.dianping.nvtunnelkit.utils.a.a(list));
        k();
        this.d = rx.d.a(new c(), i().b(new rx.functions.g<a, Boolean>() { // from class: com.dianping.nvtunnelkit.ext.h.12
            public static ChangeQuickRedirect a;

            @Override // rx.functions.g
            public final /* synthetic */ Boolean call(a aVar) {
                a aVar2 = aVar;
                Object[] objArr2 = {aVar2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2f6ed2435d3a475e06f9cf30dbcd5463", RobustBitConfig.DEFAULT_VALUE) ? (Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2f6ed2435d3a475e06f9cf30dbcd5463") : Boolean.valueOf(!h.a(h.this, list, aVar2));
            }
        }).b(new rx.functions.b<a>() { // from class: com.dianping.nvtunnelkit.ext.h.11
            public static ChangeQuickRedirect a;

            @Override // rx.functions.b
            public final /* synthetic */ void call(a aVar) {
                Object[] objArr2 = {aVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6148b9e781924d698247f367143266ba", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6148b9e781924d698247f367143266ba");
                    return;
                }
                synchronized (h.this.h) {
                    h.this.j = h.this.j();
                    int a2 = com.dianping.nvtunnelkit.utils.a.a(list);
                    for (int i = 0; i < a2; i++) {
                        w a3 = h.this.c.a((SocketAddress) list.get(i));
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = com.dianping.nvtunnelkit.conn.b.j;
                        if (PatchProxy.isSupport(objArr3, a3, changeQuickRedirect3, false, "da272bda67de6fcbbb55fb0f33f73b01", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, a3, changeQuickRedirect3, false, "da272bda67de6fcbbb55fb0f33f73b01");
                        } else {
                            a3.n.clear();
                        }
                        a3.a(h.this.s);
                        h.this.l.add(a3);
                    }
                }
            }
        }).c(new rx.functions.g<a, rx.d<Long>>() { // from class: com.dianping.nvtunnelkit.ext.h.10
            public static ChangeQuickRedirect a;

            @Override // rx.functions.g
            public final /* synthetic */ rx.d<Long> call(a aVar) {
                Object[] objArr2 = {aVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9e609e5727cf00a9010869eeba5e6a1a", RobustBitConfig.DEFAULT_VALUE) ? (rx.d) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9e609e5727cf00a9010869eeba5e6a1a") : h.c(h.this);
            }
        }).b(com.dianping.nvtunnelkit.core.c.a().b));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cfd5fc1fd5c3d94db62904ae0f57624b", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cfd5fc1fd5c3d94db62904ae0f57624b");
        }
        f();
        if (this.q == null) {
            return "";
        }
        String str = this.q.a() + File.separator + this.f.b;
        String a2 = com.dianping.nvtunnelkit.utils.d.a();
        if (TextUtils.isEmpty(a2)) {
            return str;
        }
        return str + a2;
    }

    private void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "624bf668818e9cb9ac25b6c838e00800", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "624bf668818e9cb9ac25b6c838e00800");
        } else if ((this.f.n || this.f.m) && this.q == null) {
            throw new IllegalStateException("enable routing and smart logic need set StorageDelegate.");
        }
    }

    private void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c37da789636fbdee37bab51629bcc610", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c37da789636fbdee37bab51629bcc610");
        } else if (this.e == null || this.e.isUnsubscribed()) {
        } else {
            this.e.unsubscribe();
        }
    }

    @VisibleForTesting
    private List<SocketAddress> c(List<b> list) {
        List<T> b2;
        List<b> list2 = list;
        char c2 = 1;
        char c3 = 0;
        Object[] objArr = {list2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "18dd412a724648ad0c3cab8c8f9efbc9", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "18dd412a724648ad0c3cab8c8f9efbc9");
        }
        com.dianping.nvtunnelkit.logger.b.b(b, "processSoftSwitch....");
        ArrayList arrayList = new ArrayList();
        if (com.dianping.nvtunnelkit.utils.a.b(list) || (b2 = this.c.b.b()) == null) {
            return arrayList;
        }
        synchronized (b2) {
            if (b2.size() == 0) {
                return arrayList;
            }
            LinkedList linkedList = new LinkedList();
            for (b bVar : list) {
                linkedList.add(bVar.b);
            }
            Collections.sort(b2, new Comparator<com.dianping.nvtunnelkit.conn.b>() { // from class: com.dianping.nvtunnelkit.ext.h.15
                public static ChangeQuickRedirect a;

                @Override // java.util.Comparator
                public final /* synthetic */ int compare(com.dianping.nvtunnelkit.conn.b bVar2, com.dianping.nvtunnelkit.conn.b bVar3) {
                    com.dianping.nvtunnelkit.conn.b bVar4 = bVar2;
                    com.dianping.nvtunnelkit.conn.b bVar5 = bVar3;
                    Object[] objArr2 = {bVar4, bVar5};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8e52b81edb4d6dfbdfe412422b381e82", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8e52b81edb4d6dfbdfe412422b381e82")).intValue() : bVar4.a() - bVar5.a();
                }
            });
            LinkedList linkedList2 = new LinkedList();
            for (T t2 : b2) {
                linkedList2.add(t2.m);
            }
            int size = b2.size() - 1;
            while (size >= 0) {
                T t3 = b2.get(size);
                int i = 0;
                while (true) {
                    if (i < list.size()) {
                        b bVar2 = list2.get(i);
                        if (!linkedList2.contains(bVar2.b)) {
                            int indexOf = linkedList.indexOf(t3.m);
                            if ((indexOf == -1 ? t3.n() : list2.get(indexOf).a()) - this.n.i > bVar2.a()) {
                                linkedList2.add(bVar2.b);
                                arrayList.add(bVar2.b);
                                SocketAddress socketAddress = bVar2.b;
                                Object[] objArr2 = new Object[2];
                                objArr2[c3] = t3;
                                objArr2[c2] = socketAddress;
                                ChangeQuickRedirect changeQuickRedirect2 = a;
                                final T t4 = t3;
                                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "10012948b6876f804d284c7787ea86fe", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "10012948b6876f804d284c7787ea86fe");
                                } else {
                                    String a2 = com.dianping.nvtunnelkit.utils.g.a(t4.m);
                                    String a3 = com.dianping.nvtunnelkit.utils.g.a(socketAddress);
                                    com.dianping.nvtunnelkit.logger.b.b(b, "soft switch, fromIp: " + a2 + " ,toIp: " + a3);
                                    final T a4 = this.c.a(socketAddress);
                                    a4.a(new com.dianping.nvtunnelkit.conn.d() { // from class: com.dianping.nvtunnelkit.ext.h.16
                                        public static ChangeQuickRedirect a;

                                        @Override // com.dianping.nvtunnelkit.conn.d
                                        public final void a(com.dianping.nvtunnelkit.conn.c cVar, Throwable th) {
                                        }

                                        @Override // com.dianping.nvtunnelkit.conn.d
                                        public final void a(com.dianping.nvtunnelkit.conn.c cVar) {
                                            Object[] objArr3 = {cVar};
                                            ChangeQuickRedirect changeQuickRedirect3 = a;
                                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "41063eb5b5e351ed9939f3d87234a563", RobustBitConfig.DEFAULT_VALUE)) {
                                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "41063eb5b5e351ed9939f3d87234a563");
                                                return;
                                            }
                                            a4.b(this);
                                            if (h.this.c.b != null) {
                                                h.this.c.b.c(t4);
                                            } else {
                                                t4.s();
                                            }
                                        }

                                        @Override // com.dianping.nvtunnelkit.conn.d
                                        public final void b(com.dianping.nvtunnelkit.conn.c cVar) {
                                            Object[] objArr3 = {cVar};
                                            ChangeQuickRedirect changeQuickRedirect3 = a;
                                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "dd7112e60b728bba94793d6fd66c10bd", RobustBitConfig.DEFAULT_VALUE)) {
                                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "dd7112e60b728bba94793d6fd66c10bd");
                                            } else {
                                                a4.b(this);
                                            }
                                        }
                                    });
                                    a4.a(a4.l.d);
                                }
                            }
                        }
                        i++;
                        t3 = t3;
                        list2 = list;
                        c2 = 1;
                        c3 = 0;
                    }
                }
                size--;
                list2 = list;
                c2 = 1;
                c3 = 0;
            }
            return arrayList;
        }
    }

    private long h() {
        return this.n.e;
    }

    private rx.d<a> i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c7dc69d241fa1136749531d7f6ab7c7", RobustBitConfig.DEFAULT_VALUE) ? (rx.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c7dc69d241fa1136749531d7f6ab7c7") : rx.d.a((d.a) new d.a<a>() { // from class: com.dianping.nvtunnelkit.ext.h.6
            public static ChangeQuickRedirect a;

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:61:0x0105 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:65:0x00aa A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Type inference failed for: r3v1 */
            /* JADX WARN: Type inference failed for: r3v14 */
            /* JADX WARN: Type inference failed for: r3v15 */
            /* JADX WARN: Type inference failed for: r3v3, types: [java.io.Closeable] */
            /* JADX WARN: Type inference failed for: r3v4 */
            /* JADX WARN: Type inference failed for: r3v6 */
            @Override // rx.functions.b
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final /* synthetic */ void call(java.lang.Object r12) {
                /*
                    Method dump skipped, instructions count: 294
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.dianping.nvtunnelkit.ext.h.AnonymousClass6.call(java.lang.Object):void");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e03da1fb5b8f8f7baa5621036c69b010", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e03da1fb5b8f8f7baa5621036c69b010");
        }
        String str = "mobile";
        if (com.dianping.nvtunnelkit.utils.c.c() == 1) {
            String d2 = com.dianping.nvtunnelkit.utils.c.d();
            if (com.dianping.nvtunnelkit.utils.f.a(d2)) {
                d2 = "default";
            }
            str = "wifi_" + d2;
        }
        return this.f.b + CommonConstant.Symbol.UNDERLINE + str;
    }

    private void k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc116e8e235bc71e641fb566f5c01dfe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc116e8e235bc71e641fb566f5c01dfe");
            return;
        }
        com.dianping.nvtunnelkit.logger.b.b(b, "cancelRacingTask....");
        synchronized (this.h) {
            if (this.d != null && !this.d.isUnsubscribed()) {
                this.d.unsubscribe();
            }
            for (com.dianping.nvtunnelkit.conn.b bVar : this.k) {
                bVar.t();
            }
            this.k.clear();
            this.l.clear();
            this.m.clear();
        }
    }

    @Override // com.dianping.nvtunnelkit.ext.b
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f34a2add11d3e87ba2a25ac91c170e15", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f34a2add11d3e87ba2a25ac91c170e15");
            return;
        }
        g();
        this.p.set(false);
        k();
    }

    @Override // com.dianping.nvtunnelkit.ext.b
    public final List<SocketAddress> c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "833df2091111e5c2992409e1870e760a", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "833df2091111e5c2992409e1870e760a");
        }
        if (this.g == null && Looper.myLooper() != Looper.getMainLooper()) {
            rx.d.a(new com.dianping.nvtunnelkit.core.j(), i());
        }
        ArrayList<b> arrayList = new ArrayList();
        synchronized (this.h) {
            if (this.g != null && this.g.a != null) {
                arrayList.addAll(this.g.a);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (b bVar : arrayList) {
            arrayList2.add(bVar.b);
        }
        return arrayList2;
    }

    @Override // com.dianping.nvtunnelkit.ext.b
    public final List<com.dianping.nvtunnelkit.ext.c> d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7755071e4a517d248e7572d174265a94", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7755071e4a517d248e7572d174265a94");
        }
        if (this.f.m) {
            f();
            return this.q.b();
        }
        return null;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class c<T> extends rx.j<T> {
        public static ChangeQuickRedirect a;

        @Override // rx.e
        public final void onCompleted() {
        }

        @Override // rx.e
        public final void onNext(T t) {
        }

        @Override // rx.e
        public final void onError(Throwable th) {
            Object[] objArr = {th};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d67bbf76328a50b11b0afa71160fe58", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d67bbf76328a50b11b0afa71160fe58");
            } else {
                com.dianping.nvtunnelkit.logger.b.a(h.b, th);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class b {
        public static ChangeQuickRedirect a;
        public SocketAddress b;
        public int c;
        public int d;

        public b(SocketAddress socketAddress, int i, int i2) {
            Object[] objArr = {socketAddress, Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1121519a08eda6fa5b30cce6d1a0abb4", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1121519a08eda6fa5b30cce6d1a0abb4");
                return;
            }
            this.c = -1;
            this.b = socketAddress;
            this.c = i;
            this.d = i2;
        }

        public final int a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2eb2007cdc90e03e34c105f9785783af", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2eb2007cdc90e03e34c105f9785783af")).intValue();
            }
            if ((this.b instanceof InetSocketAddress) && (((InetSocketAddress) this.b).getAddress() instanceof Inet6Address)) {
                return this.c == Integer.MAX_VALUE ? this.c - this.d : this.c;
            }
            return this.c;
        }
    }

    public static /* synthetic */ int i(h hVar) {
        return hVar.n.c;
    }

    public static /* synthetic */ int m(h hVar) {
        return hVar.n.a;
    }
}

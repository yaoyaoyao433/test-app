package com.dianping.nvnetwork.tunnel;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import com.dianping.nvnetwork.NVDefaultNetworkService;
import com.dianping.nvnetwork.Request;
import com.dianping.nvnetwork.g;
import com.dianping.nvnetwork.h;
import com.dianping.nvnetwork.l;
import com.dianping.nvnetwork.q;
import com.dianping.nvnetwork.tunnel2.i;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.meituan.android.recce.host.RecceBridgeHandler;
import com.meituan.metrics.traffic.reflection.SharkWrapper;
import com.meituan.msc.modules.engine.requestPrefetch.PrefetchConfig;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONObject;
import rx.d;
import rx.j;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static a m;
    private static final Random n = new Random(System.currentTimeMillis());
    private static final byte[] r = "D7C6F71A12153EE5".getBytes();
    private static final byte[] s = "55C930D827BDABFD".getBytes();
    public final Random b;
    public List<SocketAddress> c;
    public final Pattern d;
    public final Pattern e;
    private List<SocketAddress> f;
    private List<SocketAddress> g;
    private List<SocketAddress> h;
    private List<SocketAddress> i;
    private ConcurrentHashMap<String, b> j;
    private Context k;
    private boolean l;
    private final NVDefaultNetworkService o;
    private boolean p;
    private long q;

    /* compiled from: ProGuard */
    /* renamed from: com.dianping.nvnetwork.tunnel.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0100a {
        public List<SocketAddress> a = new LinkedList();
        public int b;
    }

    public static /* synthetic */ boolean a(a aVar, boolean z) {
        aVar.p = false;
        return false;
    }

    public static /* synthetic */ boolean b(a aVar, boolean z) {
        aVar.l = false;
        return false;
    }

    public static /* synthetic */ Request c(a aVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "2c3d5144569f5953f53da90b4c8440fe", 6917529027641081856L)) {
            return (Request) PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "2c3d5144569f5953f53da90b4c8440fe");
        }
        String str = "https://shark.dianping.com/api/multi/loadbalance";
        if (g.p() && !TextUtils.isEmpty(g.m())) {
            str = "http://test.shark.dianping.com/api/multi/loadbalance";
        }
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("t", "1");
        StringBuilder sb = new StringBuilder();
        sb.append(g.a());
        hashMap.put("a", sb.toString());
        hashMap.put("v", "4");
        hashMap.put("p", "2");
        hashMap.put("u", g.j());
        return new Request.Builder().method("POST").isFailOver(true).isPostFailOver(true).url(str).params(hashMap).addHeaders("Content-Type", PrefetchConfig.PREFETCH_POST_CONTENT_TYPE_FORM).samplingRate(33).build();
    }

    private a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e45009b26b00272d92ba965a888f5ce0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e45009b26b00272d92ba965a888f5ce0");
            return;
        }
        this.f = Collections.synchronizedList(new LinkedList());
        this.g = Collections.synchronizedList(new LinkedList());
        this.h = Collections.synchronizedList(new LinkedList());
        this.i = Collections.synchronizedList(new LinkedList());
        this.j = new ConcurrentHashMap<>();
        this.b = new Random();
        this.p = false;
        this.q = 0L;
        this.c = new LinkedList();
        this.c.add(new InetSocketAddress("192.168.217.46", 8000));
        this.d = Pattern.compile("\\b((?!\\d\\d\\d)\\d+|1\\d\\d|2[0-4]\\d|25[0-5])\\.((?!\\d\\d\\d)\\d+|1\\d\\d|2[0-4]\\d|25[0-5])\\.((?!\\d\\d\\d)\\d+|1\\d\\d|2[0-4]\\d|25[0-5])\\.((?!\\d\\d\\d)\\d+|1\\d\\d|2[0-4]\\d|25[0-5])\\b");
        this.e = Pattern.compile("/^\\s*((([0-9A-Fa-f]{1,4}:){7}([0-9A-Fa-f]{1,4}|:))|(([0-9A-Fa-f]{1,4}:){6}(:[0-9A-Fa-f]{1,4}|((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)(\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)){3})|:))|(([0-9A-Fa-f]{1,4}:){5}(((:[0-9A-Fa-f]{1,4}){1,2})|:((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)(\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)){3})|:))|(([0-9A-Fa-f]{1,4}:){4}(((:[0-9A-Fa-f]{1,4}){1,3})|((:[0-9A-Fa-f]{1,4})?:((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)(\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)){3}))|:))|(([0-9A-Fa-f]{1,4}:){3}(((:[0-9A-Fa-f]{1,4}){1,4})|((:[0-9A-Fa-f]{1,4}){0,2}:((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)(\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)){3}))|:))|(([0-9A-Fa-f]{1,4}:){2}(((:[0-9A-Fa-f]{1,4}){1,5})|((:[0-9A-Fa-f]{1,4}){0,3}:((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)(\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)){3}))|:))|(([0-9A-Fa-f]{1,4}:){1}(((:[0-9A-Fa-f]{1,4}){1,6})|((:[0-9A-Fa-f]{1,4}){0,4}:((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)(\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)){3}))|:))|(:(((:[0-9A-Fa-f]{1,4}){1,7})|((:[0-9A-Fa-f]{1,4}){0,5}:((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)(\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)){3}))|:)))(%.+)?\\s*$/");
        this.k = context;
        NVDefaultNetworkService.a aVar = new NVDefaultNetworkService.a(g.b());
        SharkWrapper.addInterceptorToBuilder(aVar);
        aVar.e = true;
        this.o = aVar.a();
    }

    public static synchronized a a(Context context) {
        synchronized (a.class) {
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "75d383d00a42e45065c62bfa8a0366a8", 6917529027641081856L)) {
                return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "75d383d00a42e45065c62bfa8a0366a8");
            }
            if (m == null) {
                a aVar = new a(context);
                m = aVar;
                aVar.f();
                m.e();
            }
            return m;
        }
    }

    private synchronized void a(String[] strArr) {
        Object[] objArr = {strArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f44d6d058a443d4f6203648ee4288675", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f44d6d058a443d4f6203648ee4288675");
            return;
        }
        if (this.k != null && strArr != null && strArr.length > 0) {
            SharedPreferences.Editor edit = this.k.getSharedPreferences(h(), 0).edit();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < strArr.length; i++) {
                sb.append(strArr[i]);
                if (i != strArr.length - 1) {
                    sb.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
                }
            }
            edit.putString("ip_list_key_v2", Base64.encodeToString(sb.toString().getBytes(), 0));
            edit.apply();
        }
    }

    private synchronized void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee3e283f86d4ee1841192e6d957e3644", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee3e283f86d4ee1841192e6d957e3644");
        } else {
            this.f.clear();
        }
    }

    public final synchronized void a(C0100a c0100a) {
        Object[] objArr = {c0100a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d8bc82136580e32c4cc3966f4ad06a13", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d8bc82136580e32c4cc3966f4ad06a13");
        } else if (c0100a.b == 1) {
            d();
            a(30000);
        } else if (c0100a.b == 2) {
            LinkedList linkedList = new LinkedList();
            LinkedList linkedList2 = new LinkedList();
            LinkedList linkedList3 = new LinkedList();
            for (SocketAddress socketAddress : c0100a.a) {
                if (this.g.contains(socketAddress)) {
                    linkedList.add(socketAddress);
                }
                if (this.h.contains(socketAddress)) {
                    linkedList2.add(socketAddress);
                }
                if (this.i.contains(socketAddress)) {
                    linkedList3.add(socketAddress);
                }
            }
            if (!linkedList2.isEmpty()) {
                this.h.removeAll(linkedList2);
            }
            if (!linkedList.isEmpty()) {
                this.g.removeAll(linkedList);
            }
            if (!linkedList3.isEmpty()) {
                this.i.removeAll(linkedList3);
            }
        }
    }

    private synchronized void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4308401355317f1fd46a317046258a09", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4308401355317f1fd46a317046258a09");
            return;
        }
        if (this.k != null && this.f.isEmpty()) {
            String string = this.k.getSharedPreferences(h(), 0).getString("ip_list_key_v2", "");
            if (!TextUtils.isEmpty(string)) {
                String[] split = new String(Base64.decode(string, 0)).split(RecceBridgeHandler.RECCE_BRIDGE_ARGS_SEPARATOR);
                if (split.length > 0) {
                    b(split);
                }
                return;
            }
            a(this.b.nextInt(2000) + 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "14616ed817817dc56d170fdf5155f541", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "14616ed817817dc56d170fdf5155f541");
            return;
        }
        m.g.clear();
        m.g.addAll(com.dianping.nvnetwork.tunnel.b.a("上海"));
        Collections.shuffle(m.g, n);
        this.h.clear();
        this.h.addAll(com.dianping.nvnetwork.tunnel.b.a("北京"));
        Collections.shuffle(this.h, n);
        this.i.clear();
        this.i.addAll(com.dianping.nvnetwork.tunnel.b.a("广州"));
        Collections.shuffle(this.i, n);
    }

    private synchronized void b(final String[] strArr) {
        Object[] objArr = {strArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3152406d8f5d8b62adaaf11c490be6b1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3152406d8f5d8b62adaaf11c490be6b1");
        } else if (this.p) {
        } else {
            this.p = true;
            Runnable runnable = new Runnable() { // from class: com.dianping.nvnetwork.tunnel.a.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    String[] strArr2;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "656f3183eada272e101517d4bfe673a5", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "656f3183eada272e101517d4bfe673a5");
                        return;
                    }
                    a.this.f.clear();
                    for (String str : strArr) {
                        if (!TextUtils.isEmpty(str)) {
                            a.this.f.add(new InetSocketAddress(str, 443));
                        }
                    }
                    Collections.shuffle(a.this.f, a.n);
                    a.a(a.this, false);
                }
            };
            if (Looper.myLooper() == Looper.getMainLooper()) {
                com.sankuai.android.jarvis.c.a("shark_fetch_ip", runnable).start();
            } else {
                runnable.run();
            }
        }
    }

    public final synchronized void a(final int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ece4ba12eba5c965ec5418371c9b859", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ece4ba12eba5c965ec5418371c9b859");
            return;
        }
        if (!this.l) {
            this.l = true;
            rx.d.a(new l(), rx.d.a((d.a) new d.a<q>() { // from class: com.dianping.nvnetwork.tunnel.a.2
                public static ChangeQuickRedirect a;

                @Override // rx.functions.b
                public final /* synthetic */ void call(Object obj) {
                    int i2;
                    j jVar = (j) obj;
                    Object[] objArr2 = {jVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3e88a2748328fea7ec9e046a744d2057", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3e88a2748328fea7ec9e046a744d2057");
                    } else if (!g.u()) {
                        jVar.onCompleted();
                    } else {
                        long currentTimeMillis = System.currentTimeMillis();
                        if (a.this.q + i > currentTimeMillis && (i2 = (int) ((a.this.q + i) - currentTimeMillis)) > 0) {
                            try {
                                Thread.sleep(i2);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        if (a.this.a(a.this.o.execSync(a.c(a.this)))) {
                            a.this.q = System.currentTimeMillis();
                        } else {
                            a.this.f();
                        }
                        a.b(a.this, false);
                        jVar.onCompleted();
                    }
                }
            }).b(rx.schedulers.a.e()).a(rx.android.schedulers.a.a()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(q qVar) {
        boolean z = false;
        Object[] objArr = {qVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "07893378756b3aea11f1b835b01762d1", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "07893378756b3aea11f1b835b01762d1")).booleanValue();
        }
        try {
            if (qVar.result() != null && qVar.isSuccess()) {
                String string = new JSONObject(new String(b(qVar.result()), "UTF-8")).getString("1");
                com.dianping.nvnetwork.util.g.a("nvnetwork_lb", string);
                if (string.length() > 0) {
                    String[] split = string.split(RecceBridgeHandler.RECCE_BRIDGE_ARGS_SEPARATOR);
                    if (split.length > 0) {
                        b(split);
                        a(split);
                    }
                    try {
                        com.dianping.nvnetwork.util.l.a().a(new com.dianping.nvnetwork.tunnel2.j(2, null));
                        com.dianping.networklog.c.a("Loadbalance result :: " + string, 4);
                        return true;
                    } catch (Exception e) {
                        e = e;
                        z = true;
                        if (qVar.result() != null) {
                            com.dianping.nvnetwork.util.g.a("nvnetwork_lb", new String(qVar.result()));
                        } else {
                            com.dianping.nvnetwork.util.g.a("nvnetwork_lb", "resp null");
                        }
                        e.printStackTrace();
                        return z;
                    }
                }
            }
            return false;
        } catch (Exception e2) {
            e = e2;
        }
    }

    public final synchronized C0100a a() {
        List<SocketAddress> g;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a2ac99add248075a1e1439496e12fd7f", 6917529027641081856L)) {
            return (C0100a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a2ac99add248075a1e1439496e12fd7f");
        }
        C0100a c0100a = new C0100a();
        if (!this.f.isEmpty()) {
            boolean z = true;
            c0100a.b = 1;
            g = this.f;
            i.a c = i.c();
            if (!c.a.isEmpty() && this.f.size() == c.a.size()) {
                g = new LinkedList<>();
                Iterator<i.b> it = c.a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    i.b next = it.next();
                    if (!this.f.contains(next.b)) {
                        z = false;
                        break;
                    }
                    g.add(next.b);
                }
                if (z) {
                    c0100a.b = 3;
                } else {
                    g = this.f;
                }
            }
        } else {
            if (this.g.isEmpty() && this.h.isEmpty() && this.i.isEmpty()) {
                f();
            }
            g = g();
            if (!g.isEmpty()) {
                c0100a.b = 2;
            }
        }
        for (int i = 0; i < g.size() && i != 10; i++) {
            c0100a.a.add(g.get(i));
        }
        if (g.p() && !TextUtils.isEmpty(g.m()) && g.n() >= 0) {
            g.m();
            c0100a.a.clear();
            c0100a.a.add(new InetSocketAddress(g.m(), g.n()));
        }
        if (h.h().F && this.j.size() > 0) {
            int b2 = g.f().b();
            ArrayList arrayList = new ArrayList();
            for (SocketAddress socketAddress : c0100a.a) {
                if (socketAddress instanceof InetSocketAddress) {
                    b bVar = this.j.get(((InetSocketAddress) socketAddress).isUnresolved() ? ((InetSocketAddress) socketAddress).getHostName() : ((InetSocketAddress) socketAddress).getAddress().getHostAddress());
                    if (bVar != null) {
                        if (System.currentTimeMillis() - bVar.b <= h.h().E && bVar.c == b2) {
                            arrayList.add(socketAddress);
                        }
                        this.j.remove(bVar.a, bVar);
                    }
                }
            }
            c0100a.a.removeAll(arrayList);
        }
        return c0100a;
    }

    public final synchronized C0100a b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d1a7ae31f2c3ecf5396f0578f42c5d91", 6917529027641081856L)) {
            return (C0100a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d1a7ae31f2c3ecf5396f0578f42c5d91");
        }
        C0100a c0100a = new C0100a();
        if (!this.f.isEmpty()) {
            c0100a.a.addAll(this.f);
        } else if (this.k != null && this.f.isEmpty()) {
            String string = this.k.getSharedPreferences(h(), 0).getString("ip_list_key_v2", "");
            if (!TextUtils.isEmpty(string)) {
                String[] split = new String(Base64.decode(string, 0)).split(RecceBridgeHandler.RECCE_BRIDGE_ARGS_SEPARATOR);
                if (split.length > 0) {
                    for (String str : split) {
                        c0100a.a.add(new InetSocketAddress(str, 443));
                    }
                }
            }
        }
        return c0100a;
    }

    private synchronized List<SocketAddress> g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd46ec90fed79b65dcc43b6ade8cd2fe", 6917529027641081856L)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd46ec90fed79b65dcc43b6ade8cd2fe");
        }
        LinkedList linkedList = new LinkedList();
        if (!this.h.isEmpty()) {
            for (int i = 0; i < this.h.size(); i++) {
                linkedList.add(this.h.get(i));
                if (i == 1) {
                    break;
                }
            }
        }
        if (!this.i.isEmpty()) {
            for (int i2 = 0; i2 < this.i.size(); i2++) {
                linkedList.add(this.i.get(i2));
                if (i2 == 1) {
                    break;
                }
            }
        }
        int size = 5 - linkedList.size();
        if (!this.g.isEmpty()) {
            for (int i3 = 0; i3 < this.g.size(); i3++) {
                linkedList.add(this.g.get(i3));
                if (i3 == size) {
                    break;
                }
            }
        }
        return linkedList;
    }

    private synchronized byte[] a(byte[] bArr) throws Exception {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f345dca8981c50e91f449ac53a56bda8", 6917529027641081856L)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f345dca8981c50e91f449ac53a56bda8");
        }
        SecretKeySpec secretKeySpec = new SecretKeySpec(r, "AES");
        Cipher cipher = Cipher.getInstance("AES/CBC/NoPadding");
        cipher.init(2, secretKeySpec, new IvParameterSpec(s));
        return cipher.doFinal(bArr);
    }

    private synchronized byte[] b(byte[] bArr) throws Exception {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "879d332fd2d1104e9a79f4fafe918224", 6917529027641081856L)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "879d332fd2d1104e9a79f4fafe918224");
        }
        byte[] a2 = a(bArr);
        int i = 0;
        for (int length = a2.length - 1; length >= 0 && a2[length] == 0; length--) {
            i++;
        }
        if (i > 0) {
            byte[] bArr2 = new byte[a2.length - i];
            System.arraycopy(a2, 0, bArr2, 0, bArr2.length);
            a2 = bArr2;
        }
        return a2;
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1fcc315a9393933e04ff93b178e6c401", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1fcc315a9393933e04ff93b178e6c401");
            return;
        }
        com.dianping.nvnetwork.util.g.a("add isolation ip:" + str);
        if (this.j.containsKey(str)) {
            return;
        }
        this.j.put(str, new b(str, System.currentTimeMillis()));
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    class b {
        public String a;
        public long b;
        public int c = g.f().b();

        public b(String str, long j) {
            this.a = str;
            this.b = j;
        }
    }

    private String h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c886b2b71a2e7baefa4c22f349428532", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c886b2b71a2e7baefa4c22f349428532");
        }
        String a2 = com.dianping.nvtunnelkit.utils.d.a(g.b());
        if (TextUtils.isEmpty(a2)) {
            return "ip_list_name";
        }
        return "ip_list_name" + a2;
    }
}

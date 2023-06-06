package com.sankuai.xm.im.session;

import android.support.annotation.NonNull;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.met.mercury.load.bean.DDLoadConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.callback.Callback;
import com.sankuai.xm.base.trace.j;
import com.sankuai.xm.base.util.q;
import com.sankuai.xm.im.IMClient;
import com.sankuai.xm.im.cache.DBProxy;
import com.sankuai.xm.im.cache.bean.DBSession;
import com.sankuai.xm.im.cache.l;
import com.sankuai.xm.im.session.a;
import com.sankuai.xm.im.utils.MessageUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class a extends q {
    public static ChangeQuickRedirect h = null;
    public static final HashMap<Integer, C1395a> i = new HashMap<>();
    public static final HashMap<Integer, Integer> j = new HashMap<>();
    public static final List<C1395a> k = new ArrayList();
    public static volatile int l = 5000;
    private static long m = 300000;
    private volatile boolean n;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce2c8e0778b383d3075eb9b2fb005181", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce2c8e0778b383d3075eb9b2fb005181");
        } else {
            this.n = false;
        }
    }

    public final void a(final Callback<List<DBSession>> callback) {
        Object[] objArr = {callback};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8da1a9d3270a86550710c56c4f233d4d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8da1a9d3270a86550710c56c4f233d4d");
            return;
        }
        if (IMClient.a().g() == 1) {
            m = 300000L;
        } else {
            m = 10000L;
        }
        long currentTimeMillis = System.currentTimeMillis() - com.sankuai.xm.im.utils.b.a().getLong("session_clean_config_last", 0L);
        if (currentTimeMillis >= 0 && currentTimeMillis < DDLoadConstants.CACHE_MULTIPLE_PROCESS_PROCTECT_TIME) {
            com.sankuai.xm.im.utils.a.b("SessionConfigController::executeSessionCleanByConfig min EXECUTE_INERVAL", new Object[0]);
            callback.onSuccess(Collections.emptyList());
            return;
        }
        DBProxy.l().a(j.a(new Runnable() { // from class: com.sankuai.xm.im.session.a.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "11cb2106929c417dcbbe48db26b3c84b", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "11cb2106929c417dcbbe48db26b3c84b");
                } else if (IMClient.a().k() != 0) {
                    final List c = a.this.c();
                    final Map d = a.this.d();
                    final l lVar = DBProxy.l().m;
                    final int c2 = C1395a.c();
                    final Callback callback2 = callback;
                    Object[] objArr3 = {Integer.valueOf(c2), d, c, callback2};
                    ChangeQuickRedirect changeQuickRedirect3 = l.a;
                    if (PatchProxy.isSupport(objArr3, lVar, changeQuickRedirect3, false, "5720ded4bf93ea4de0caf0b7f09d104f", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr3, lVar, changeQuickRedirect3, false, "5720ded4bf93ea4de0caf0b7f09d104f");
                    } else {
                        com.sankuai.xm.im.utils.a.b("cleanOldSessionWithConditions", new Object[0]);
                        lVar.c.a(j.a(new Runnable() { // from class: com.sankuai.xm.im.cache.l.11
                            public static ChangeQuickRedirect a;

                            @Override // java.lang.Runnable
                            public final void run() {
                                Object[] objArr4 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "1995b94a824f931f98ad7f3ba30fc7a7", 6917529027641081856L)) {
                                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "1995b94a824f931f98ad7f3ba30fc7a7");
                                    return;
                                }
                                ArrayList arrayList = new ArrayList();
                                HashMap hashMap = new HashMap();
                                for (a.C1395a c1395a : c) {
                                    if (c1395a.c >= 0) {
                                        com.sankuai.xm.im.utils.a.b("cleanOldSessionWithConditions, config = " + c1395a, new Object[0]);
                                        List a2 = l.this.a(c1395a.a(), c1395a.b(), MessageUtils.getAllCategoryOfService(c1395a.d), false, Short.valueOf(c1395a.c));
                                        if (a2 != null) {
                                            arrayList.addAll(a2);
                                        }
                                        Set set = (Set) hashMap.get(Integer.valueOf(c1395a.d));
                                        if (set == null) {
                                            set = new HashSet();
                                            hashMap.put(Integer.valueOf(c1395a.d), set);
                                        }
                                        set.add(Short.valueOf(c1395a.c));
                                    }
                                }
                                for (Map.Entry entry : d.entrySet()) {
                                    if (entry != null && entry.getValue() != null) {
                                        Set set2 = (Set) hashMap.get(entry.getKey());
                                        int b = com.sankuai.xm.base.util.b.b(set2);
                                        Short[] shArr = b > 0 ? (Short[]) set2.toArray(new Short[b]) : null;
                                        a.C1395a c1395a2 = (a.C1395a) entry.getValue();
                                        List a3 = l.this.a(c1395a2.a(), c1395a2.b(), MessageUtils.getAllCategoryOfService(c1395a2.d), true, shArr);
                                        if (a3 != null) {
                                            arrayList.addAll(a3);
                                        }
                                    }
                                }
                                List<DBSession> a4 = l.this.a(c2);
                                if (a4 != null) {
                                    arrayList.addAll(a4);
                                }
                                callback2.onSuccess(arrayList);
                            }
                        }), callback2);
                    }
                    com.sankuai.xm.im.utils.b.a(com.sankuai.xm.im.utils.b.a().a("session_clean_config_last", System.currentTimeMillis()));
                } else {
                    com.sankuai.xm.im.utils.a.b("SessionConfigController::executeSessionCleanByConfig uid = 0", new Object[0]);
                    callback.onSuccess(Collections.emptyList());
                }
            }
        }), m);
    }

    @Override // com.sankuai.xm.base.util.q
    public final void b() throws Exception {
        int i2 = 0;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f94b1d5b021dda283b30f04e1198e2c7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f94b1d5b021dda283b30f04e1198e2c7");
            return;
        }
        ArrayList arrayList = new ArrayList();
        JSONArray optJSONArray = this.f.optJSONArray("specified_config");
        JSONObject optJSONObject = this.f.optJSONObject("unspecified_config");
        int optInt = this.f.optInt("total", 0);
        if (optJSONArray != null && optJSONArray.length() > 0) {
            int i3 = 0;
            while (i3 < optJSONArray.length()) {
                JSONObject jSONObject = optJSONArray.getJSONObject(i3);
                String optString = jSONObject.optString("type");
                long optLong = jSONObject.optLong(RemoteMessageConst.TTL, 0L);
                int optInt2 = jSONObject.optInt("count", i2);
                int a = a(optString);
                if (a >= 0 && optLong >= 0 && optInt2 >= 0) {
                    C1395a c1395a = new C1395a(a, (short) jSONObject.optInt("channel", -2));
                    c1395a.a(optLong);
                    c1395a.a(optInt2);
                    arrayList.add(c1395a);
                }
                i3++;
                i2 = 0;
            }
        }
        synchronized (C1395a.class) {
            k.clear();
            k.addAll(arrayList);
            if (optInt > 0) {
                l = optInt;
            }
        }
        if (optJSONObject != null) {
            Iterator<String> keys = optJSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                JSONObject optJSONObject2 = optJSONObject.optJSONObject(next);
                if (optJSONObject2 != null) {
                    int a2 = a(next);
                    synchronized (C1395a.class) {
                        C1395a c1395a2 = i.get(Integer.valueOf(a2));
                        if (c1395a2 == null) {
                            c1395a2 = new C1395a(a2, (short) -2);
                            i.put(Integer.valueOf(a2), c1395a2);
                        }
                        c1395a2.a(optJSONObject2.optLong(RemoteMessageConst.TTL, 0L));
                        c1395a2.a(optJSONObject2.optInt("count", 0));
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public List<C1395a> c() {
        ArrayList arrayList;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2787e65af2ac34e6ce86401c4ae85528", 6917529027641081856L)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2787e65af2ac34e6ce86401c4ae85528");
        }
        e();
        synchronized (C1395a.class) {
            arrayList = new ArrayList(k);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public Map<Integer, C1395a> d() {
        int[] iArr;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a6d4625241a892bd589157e91ec5f9f", 6917529027641081856L)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a6d4625241a892bd589157e91ec5f9f");
        }
        e();
        HashMap hashMap = new HashMap();
        synchronized (C1395a.class) {
            if (j.size() > 0 || i.size() > 0) {
                for (int i2 : C1395a.b) {
                    Integer num = j.get(Integer.valueOf(i2));
                    C1395a c1395a = i.get(Integer.valueOf(i2));
                    if (num != null || c1395a != null) {
                        C1395a c1395a2 = new C1395a(i2, (short) -2);
                        if (c1395a != null) {
                            c1395a2.a(c1395a.a());
                            c1395a2.a(c1395a.b());
                        }
                        if (num != null) {
                            c1395a2.a(Math.min(num.intValue(), c1395a2.b()));
                        }
                        hashMap.put(Integer.valueOf(i2), c1395a2);
                    }
                }
            }
        }
        return hashMap;
    }

    private void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c816797fb15137f3f72ff86c3768cb6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c816797fb15137f3f72ff86c3768cb6");
        } else if (this.n) {
        } else {
            synchronized (this) {
                if (!this.n) {
                    a("session_clean", false, false);
                }
                this.n = true;
            }
        }
    }

    private int a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b88c93f43edaf68b61c4115b9add254", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b88c93f43edaf68b61c4115b9add254")).intValue();
        }
        if ("im".equals(str)) {
            return 1;
        }
        if ("gim".equals(str)) {
            return 2;
        }
        return "pub".equals(str) ? 3 : -1;
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.xm.im.session.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static class C1395a {
        public static ChangeQuickRedirect a;
        public static final int[] b = {1, 2, 3};
        public final short c;
        public final int d;
        public long e;
        public int f;

        public C1395a(int i, short s) {
            Object[] objArr = {Integer.valueOf(i), Short.valueOf(s)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "14c39d21ffa75e002e896a08e43ce01f", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "14c39d21ffa75e002e896a08e43ce01f");
                return;
            }
            this.e = 31536000000L;
            this.f = 1000;
            this.d = i;
            this.c = s;
        }

        public final synchronized void a(int i) {
            if (i > 0) {
                this.f = i;
            }
        }

        public final synchronized void a(long j) {
            Object[] objArr = {new Long(j)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "07e5283ead02c5a6692d042d5e766ae6", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "07e5283ead02c5a6692d042d5e766ae6");
                return;
            }
            if (j > 0) {
                this.e = j;
            }
        }

        public final synchronized long a() {
            return this.e;
        }

        public final synchronized int b() {
            return this.f;
        }

        public String toString() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "956ef9b747afd7617de67f2fc18af95c", 6917529027641081856L)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "956ef9b747afd7617de67f2fc18af95c");
            }
            return "SessionConfig{mChannel=" + ((int) this.c) + ", mCategory=" + this.d + ", mTTL=" + this.e + ", mMaxCount=" + this.f + '}';
        }

        public static synchronized int a(int... iArr) {
            synchronized (C1395a.class) {
                Object[] objArr = {iArr};
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1c7cf817b5d653dc857731951dd4a0ca", 6917529027641081856L)) {
                    return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1c7cf817b5d653dc857731951dd4a0ca")).intValue();
                }
                if (iArr != null && iArr.length != 0) {
                    int i = 0;
                    for (int i2 : iArr) {
                        i += b(i2);
                    }
                    return Math.min(a.l, i);
                }
                return 0;
            }
        }

        public static synchronized int b(int i) {
            int i2;
            synchronized (C1395a.class) {
                Object[] objArr = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f77550081f2bb7a7677d8816eb6d1348", 6917529027641081856L)) {
                    return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f77550081f2bb7a7677d8816eb6d1348")).intValue();
                } else if (Arrays.binarySearch(b, i) < 0) {
                    return 0;
                } else {
                    C1395a c1395a = a.i.get(Integer.valueOf(i));
                    if (c1395a != null) {
                        i2 = c1395a.b() + 0;
                        for (C1395a c1395a2 : a.k) {
                            if (c1395a2.d == i) {
                                i2 += c1395a2.b();
                            }
                        }
                    } else {
                        i2 = a.l;
                    }
                    Integer num = a.j.get(Integer.valueOf(i));
                    if (num != null && num.intValue() > 0 && num.intValue() < i2) {
                        i2 = num.intValue();
                    }
                    if (i2 <= 0 || i2 > a.l) {
                        i2 = a.l;
                    }
                    return i2;
                }
            }
        }

        public static synchronized void a(int i, int i2) {
            synchronized (C1395a.class) {
                Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a429bb6f1baff9fb4e3a53bd52408d4a", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a429bb6f1baff9fb4e3a53bd52408d4a");
                    return;
                }
                if (i2 > 0 && Arrays.binarySearch(b, i) >= 0) {
                    a.j.put(Integer.valueOf(i), Integer.valueOf(i2));
                }
            }
        }

        public static int c() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "94b0ce42c5bfe3df460fc56cb1d629a4", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "94b0ce42c5bfe3df460fc56cb1d629a4")).intValue() : a(b);
        }
    }
}

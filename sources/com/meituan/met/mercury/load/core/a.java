package com.meituan.met.mercury.load.core;

import android.text.TextUtils;
import com.google.gson.reflect.TypeToken;
import com.meituan.android.cipstorage.ag;
import com.meituan.met.mercury.load.bean.BundleData;
import com.meituan.met.mercury.load.bean.ResourceIdVersion;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class a {
    public static ChangeQuickRedirect a;
    private String c;
    private com.meituan.android.cipstorage.q e;
    private String f;
    private HashMap<String, BundleData> g;
    private final ReentrantReadWriteLock h;
    private final Lock i;
    private final Lock j;
    private static ConcurrentHashMap<String, a> d = new ConcurrentHashMap<>();
    public static String b = "all_business_meta";

    private a(String str) {
        Set<String> b2;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d32696f680d9ee985d764384ddb89a7e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d32696f680d9ee985d764384ddb89a7e");
            return;
        }
        this.e = null;
        this.f = "bundle_meta_list_";
        this.h = new ReentrantReadWriteLock();
        this.i = this.h.readLock();
        this.j = this.h.writeLock();
        this.c = str;
        this.e = e.m();
        this.g = (HashMap) this.e.a(c(), new C0384a());
        if (this.g == null) {
            this.g = new HashMap<>();
        }
        if (this.g.isEmpty() && (b2 = e.m().b(b, (Set<String>) null)) != null && b2.contains(str)) {
            b2.remove(str);
            e.m().a(b, b2);
        }
    }

    public static a a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "72154dcff4abb2dcd6cdab653d632b75", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "72154dcff4abb2dcd6cdab653d632b75");
        }
        a aVar = d.get(str);
        if (aVar == null) {
            synchronized (a.class) {
                aVar = d.get(str);
                if (aVar == null) {
                    aVar = new a(str);
                    d.put(str, aVar);
                }
            }
        }
        return aVar;
    }

    private String c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef2dda4f81871192aa2100a6f2482ff9", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef2dda4f81871192aa2100a6f2482ff9");
        }
        return this.f + this.c;
    }

    public final void a(List<BundleData> list) {
        boolean z = false;
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dcb38a46044391b141c8b27414e5471e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dcb38a46044391b141c8b27414e5471e");
        } else if (!com.meituan.met.mercury.load.utils.d.a(list)) {
            this.j.lock();
            try {
                long currentTimeMillis = System.currentTimeMillis();
                for (BundleData bundleData : list) {
                    if (bundleData != null && !TextUtils.isEmpty(bundleData.bundleName)) {
                        bundleData.producedTimeMillis = currentTimeMillis;
                        this.g.put(bundleData.bundleName, bundleData);
                        z = true;
                    }
                }
                if (z) {
                    d();
                }
            } finally {
                this.j.unlock();
            }
        }
    }

    public final void a() {
        boolean z = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c47bb7bc0aae8992a758beab6d26851f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c47bb7bc0aae8992a758beab6d26851f");
        } else if (this.g != null && this.g.size() != 0) {
            this.j.lock();
            try {
                long currentTimeMillis = System.currentTimeMillis();
                for (BundleData bundleData : this.g.values()) {
                    if (bundleData != null) {
                        bundleData.producedTimeMillis = currentTimeMillis;
                        z = true;
                    }
                }
                if (z) {
                    d();
                }
            } finally {
                this.j.unlock();
            }
        }
    }

    public final List<BundleData> b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d6fb5d0ebc507190030ecf242a74f111", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d6fb5d0ebc507190030ecf242a74f111");
        }
        if (this.g == null || this.g.size() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        this.i.lock();
        try {
            try {
                for (BundleData bundleData : this.g.values()) {
                    if (bundleData != null) {
                        arrayList.add(bundleData.m9clone());
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return arrayList;
        } finally {
            this.i.unlock();
        }
    }

    public final BundleData b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b75166132181048e58324f4644594f2", RobustBitConfig.DEFAULT_VALUE)) {
            return (BundleData) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b75166132181048e58324f4644594f2");
        }
        BundleData bundleData = null;
        if (this.g == null || this.g.size() == 0 || TextUtils.isEmpty(str)) {
            return null;
        }
        this.i.lock();
        try {
            try {
                if (this.g.containsKey(str) && this.g.get(str) != null) {
                    bundleData = this.g.get(str).m9clone();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return bundleData;
        } finally {
            this.i.unlock();
        }
    }

    public final void b(List<ResourceIdVersion> list) {
        boolean z = false;
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "106699c028573870fe25ad74df9e5d8c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "106699c028573870fe25ad74df9e5d8c");
        } else if (!com.meituan.met.mercury.load.utils.d.a(list)) {
            this.j.lock();
            try {
                for (ResourceIdVersion resourceIdVersion : list) {
                    if (resourceIdVersion != null && !TextUtils.isEmpty(resourceIdVersion.id) && !TextUtils.isEmpty(resourceIdVersion.version) && this.g.containsKey(resourceIdVersion.id) && this.g.get(resourceIdVersion.id) != null && TextUtils.equals(this.g.get(resourceIdVersion.id).getBundleVersion(), resourceIdVersion.version)) {
                        this.g.remove(resourceIdVersion.id);
                        z = true;
                    }
                }
                if (z) {
                    d();
                }
            } finally {
                this.j.unlock();
            }
        }
    }

    private void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "83ab5f3033d1ce78b6ff5829c38531c6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "83ab5f3033d1ce78b6ff5829c38531c6");
            return;
        }
        this.i.lock();
        try {
            this.e.a(c(), (String) this.g, (ag<String>) new C0384a());
            Set<String> b2 = this.e.b(b, new HashSet());
            if (!b2.contains(this.c)) {
                b2.add(this.c);
                this.e.a(b, b2);
            }
        } finally {
            this.i.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* renamed from: com.meituan.met.mercury.load.core.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0384a implements ag<HashMap<String, BundleData>> {
        public static ChangeQuickRedirect a;

        public C0384a() {
        }

        @Override // com.meituan.android.cipstorage.ag
        public final /* synthetic */ HashMap<String, BundleData> deserializeFromString(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd151f36a4c62b9b1d193e76dc823999", RobustBitConfig.DEFAULT_VALUE) ? (HashMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd151f36a4c62b9b1d193e76dc823999") : (HashMap) com.meituan.met.mercury.load.utils.a.a(str, new TypeToken<HashMap<String, BundleData>>() { // from class: com.meituan.met.mercury.load.core.a.a.1
            }.getType());
        }

        @Override // com.meituan.android.cipstorage.ag
        public final /* synthetic */ String serializeAsString(HashMap<String, BundleData> hashMap) {
            HashMap<String, BundleData> hashMap2 = hashMap;
            Object[] objArr = {hashMap2};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f8df74b2891283d60ad1dae7b597581d", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f8df74b2891283d60ad1dae7b597581d") : com.meituan.met.mercury.load.utils.a.a(hashMap2);
        }
    }
}

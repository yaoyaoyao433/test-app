package com.meituan.met.mercury.load.core;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.dianping.shield.monitor.ShieldMonitorKey;
import com.google.gson.reflect.TypeToken;
import com.meituan.android.cipstorage.ag;
import com.meituan.android.cipstorage.u;
import com.meituan.met.mercury.load.bean.DDLoadConstants;
import com.meituan.met.mercury.load.bean.ResourceIdVersion;
import com.meituan.met.mercury.load.bean.ResourceNameVersion;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class r {
    public static ChangeQuickRedirect a;
    private String d;
    private List<DDResource> e;
    private final ReentrantReadWriteLock f;
    private final Lock g;
    private final Lock h;
    private static Map<String, r> c = Collections.synchronizedMap(new HashMap());
    public static final Map<String, Integer> b = new ConcurrentHashMap();

    private r(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c0e04733c38f0ce564d84fbd6da69699", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c0e04733c38f0ce564d84fbd6da69699");
            return;
        }
        this.f = new ReentrantReadWriteLock();
        this.g = this.f.readLock();
        this.h = this.f.writeLock();
        this.d = str;
        c();
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void c() {
        /*
            Method dump skipped, instructions count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.met.mercury.load.core.r.c():void");
    }

    private void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d1e667a648ebcf1815a8a4e9633c332d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d1e667a648ebcf1815a8a4e9633c332d");
            return;
        }
        this.g.lock();
        try {
            com.meituan.android.cipstorage.q m = e.m();
            m.a(e(), (String) this.e, (ag<String>) new c());
            Set<String> b2 = m.b("all_business", new HashSet());
            if (!b2.contains(this.d)) {
                b2.add(this.d);
                m.a("all_business", b2);
            }
            com.meituan.met.mercury.load.utils.b bVar = new com.meituan.met.mercury.load.utils.b("ResourceCache cache saveToFile");
            bVar.a(ShieldMonitorKey.TAG_BUSINESS, this.d).a("cachedData", this.e);
            com.meituan.met.mercury.load.utils.c.a(bVar);
        } finally {
            this.g.unlock();
        }
    }

    private String e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "672d60b19cf2ae8ed43a27f890d02705", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "672d60b19cf2ae8ed43a27f890d02705");
        }
        return "resource_cache_" + this.d;
    }

    public static r a(String str) {
        r rVar;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "36ba2ecca6d56103a024002bcb0489f0", RobustBitConfig.DEFAULT_VALUE)) {
            return (r) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "36ba2ecca6d56103a024002bcb0489f0");
        }
        r rVar2 = c.get(str);
        if (rVar2 != null) {
            return rVar2;
        }
        synchronized (c) {
            rVar = c.get(str);
            if (rVar == null) {
                rVar = new r(str);
                c.put(str, rVar);
            }
        }
        return rVar;
    }

    public static Set<String> a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5ef8ef8cd7fe7309c639dc2336e539dd", RobustBitConfig.DEFAULT_VALUE) ? (Set) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5ef8ef8cd7fe7309c639dc2336e539dd") : e.m().b("all_business", (Set<String>) null);
    }

    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v5 */
    public static void b() {
        boolean z;
        String str;
        boolean z2;
        File a2;
        int i = 0;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        String str2 = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1380de190747f1a27bf086fa6d354e06", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1380de190747f1a27bf086fa6d354e06");
            return;
        }
        Set<String> a3 = a();
        if (a3 == null || a3.isEmpty()) {
            return;
        }
        for (String str3 : a3) {
            r a4 = a(str3);
            Object[] objArr2 = new Object[i];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, a4, changeQuickRedirect2, false, "f0c9af3febd8911fbcf34e57fb4949db", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, a4, changeQuickRedirect2, i, "f0c9af3febd8911fbcf34e57fb4949db");
            } else {
                if (a4.f()) {
                    a4.h.lock();
                    try {
                        Iterator<DDResource> it = a4.e.iterator();
                        z = false;
                        while (it.hasNext()) {
                            DDResource next = it.next();
                            if (next == null) {
                                break;
                            }
                            boolean z3 = next.getDeleteState() == 1 && next.processProctect();
                            boolean z4 = next.cacheIsInvalid() && !next.isPreset();
                            if (z3 || z4) {
                                com.meituan.met.mercury.load.utils.b bVar = new com.meituan.met.mercury.load.utils.b("ResourceCache回收删除资源");
                                bVar.a(ShieldMonitorKey.TAG_BUSINESS, a4.d).a("cachedData", next);
                                com.meituan.met.mercury.load.utils.c.a(bVar);
                                it.remove();
                                a4.b(next);
                                a(a4.d, next, !z3 ? 30 : 0);
                                z = true;
                            }
                        }
                        a4.h.unlock();
                    } finally {
                        a4.h.unlock();
                    }
                } else {
                    z = false;
                }
                if (z) {
                    a4.d();
                }
            }
            r a5 = a(str3);
            Object[] objArr3 = new Object[i];
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, a5, changeQuickRedirect3, false, "b54724bb39ccbaf0e6cf498d0a5dd39d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, a5, changeQuickRedirect3, i, "b54724bb39ccbaf0e6cf498d0a5dd39d");
            } else {
                com.meituan.met.mercury.load.utils.b bVar2 = new com.meituan.met.mercury.load.utils.b("recycleUnKnownFile business:" + a5.d);
                try {
                } catch (Exception e) {
                    e = e;
                    str = str2;
                }
                if (com.meituan.met.mercury.load.core.c.c) {
                    String str4 = a5.d;
                    Object[] objArr4 = new Object[1];
                    objArr4[i] = str4;
                    ChangeQuickRedirect changeQuickRedirect4 = com.meituan.met.mercury.load.utils.f.a;
                    if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "e8d2800081e923efdb49f6a20b869b74", RobustBitConfig.DEFAULT_VALUE)) {
                        z2 = ((Boolean) PatchProxy.accessDispatch(objArr4, str2, changeQuickRedirect4, true, "e8d2800081e923efdb49f6a20b869b74")).booleanValue();
                    } else {
                        com.meituan.android.cipstorage.q m = e.m();
                        StringBuilder sb = new StringBuilder("last_clear_time_");
                        sb.append(str4);
                        z2 = System.currentTimeMillis() - m.b(sb.toString(), 0L) > DDLoadConstants.UNKNOWN_FILE_CLEAR_POLL_DURATION;
                    }
                    if (z2) {
                        HashSet<File> hashSet = new HashSet();
                        String str5 = a5.d;
                        Object[] objArr5 = {str5};
                        ChangeQuickRedirect changeQuickRedirect5 = com.meituan.met.mercury.load.utils.f.a;
                        Set<File> a6 = com.meituan.met.mercury.load.utils.f.a(PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "f461da639c6f7fcb88ba5a9a0d3dabe8", RobustBitConfig.DEFAULT_VALUE) ? (File) PatchProxy.accessDispatch(objArr5, str2, changeQuickRedirect5, true, "f461da639c6f7fcb88ba5a9a0d3dabe8") : e.a(str5, str2, str2, str2, u.e));
                        if (a6 != null && a6.size() > 0) {
                            hashSet.addAll(a6);
                        }
                        String str6 = a5.d;
                        Object[] objArr6 = {str6};
                        ChangeQuickRedirect changeQuickRedirect6 = com.meituan.met.mercury.load.utils.f.a;
                        try {
                            if (PatchProxy.isSupport(objArr6, null, changeQuickRedirect6, true, "35a03350976d335d33ea45a5ca77ff98", RobustBitConfig.DEFAULT_VALUE)) {
                                str = null;
                                try {
                                    a2 = (File) PatchProxy.accessDispatch(objArr6, null, changeQuickRedirect6, true, "35a03350976d335d33ea45a5ca77ff98");
                                } catch (Exception e2) {
                                    e = e2;
                                    e.printStackTrace();
                                    com.meituan.met.mercury.load.report.d.a("ResourceCache", "recycleUnKnownFile-" + a5.d, e);
                                    str2 = str;
                                    i = 0;
                                }
                            } else {
                                str = null;
                                a2 = e.a(str6, null, null, null, u.b);
                            }
                            Set<File> a7 = com.meituan.met.mercury.load.utils.f.a(a2);
                            if (a7 != null && a7.size() > 0) {
                                hashSet.addAll(a7);
                            }
                            if (hashSet.size() <= 0) {
                                com.meituan.met.mercury.load.utils.f.a(a5.d);
                            } else {
                                a5.g.lock();
                                HashSet hashSet2 = new HashSet();
                                for (File file : hashSet) {
                                    if (file != null) {
                                        boolean z5 = false;
                                        for (DDResource dDResource : a5.e) {
                                            if (dDResource != null && !TextUtils.isEmpty(dDResource.getLocalPath()) && TextUtils.equals(dDResource.getLocalPath(), file.getPath())) {
                                                z5 = true;
                                            }
                                        }
                                        long lastModified = file.lastModified();
                                        long currentTimeMillis = System.currentTimeMillis() - lastModified;
                                        boolean endsWith = file.getPath().endsWith(".tmp");
                                        if (!z5 && file.exists()) {
                                            if (lastModified > 0 && ((endsWith && currentTimeMillis > com.meituan.met.mercury.load.core.c.m * 86400000) || (!endsWith && currentTimeMillis > DDLoadConstants.CACHE_MULTIPLE_PROCESS_PROCTECT_TIME))) {
                                                hashSet2.add(file);
                                                file.delete();
                                                a(a5.d, "", "", file.getPath(), endsWith ? 110 : 60);
                                            }
                                        }
                                    }
                                }
                                com.meituan.met.mercury.load.utils.f.a(a5.d);
                                bVar2.a("delFiles", hashSet2.toString());
                                com.meituan.met.mercury.load.utils.c.a(bVar2);
                                a5.g.unlock();
                            }
                        } catch (Exception e3) {
                            e = e3;
                            str = null;
                        }
                        str2 = str;
                        i = 0;
                    }
                }
                str = str2;
                str2 = str;
                i = 0;
            }
        }
    }

    public final DDResource b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "23cf0ec3aeea4efbefec893f2122a353", RobustBitConfig.DEFAULT_VALUE)) {
            return (DDResource) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "23cf0ec3aeea4efbefec893f2122a353");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        this.g.lock();
        try {
            if (f()) {
                for (DDResource dDResource : this.e) {
                    if (dDResource != null && dDResource.getPreload() == 0 && str.equals(dDResource.getMd5()) && dDResource.localFileExists()) {
                        return dDResource.m10clone();
                    }
                }
            }
            return null;
        } finally {
            this.g.unlock();
        }
    }

    public final List<DDResource> a(@NonNull a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cca2734c3f1cf0e0a629a9cb99518fe0", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cca2734c3f1cf0e0a629a9cb99518fe0");
        }
        if (aVar == null) {
            return null;
        }
        this.g.lock();
        try {
            if (f()) {
                ArrayList arrayList = new ArrayList();
                for (DDResource dDResource : this.e) {
                    if (dDResource != null && aVar.a(dDResource) && dDResource.localFileExists()) {
                        arrayList.add(dDResource.m10clone());
                    }
                }
                return arrayList;
            }
            return null;
        } finally {
            this.g.unlock();
        }
    }

    private void b(DDResource dDResource) {
        Object[] objArr = {dDResource};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ab48eb63a4fee28f9c363ad373f11bfc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ab48eb63a4fee28f9c363ad373f11bfc");
        } else if (dDResource == null || TextUtils.isEmpty(dDResource.getLocalPath())) {
        } else {
            File file = new File(dDResource.getLocalPath());
            if (!file.exists() || file.delete()) {
                return;
            }
            com.meituan.met.mercury.load.report.e.a().a(this.d, dDResource.getName(), dDResource.getVersion(), "DDDResourceDel", Float.valueOf(0.0f), null);
        }
    }

    public final boolean a(DDResource dDResource) {
        Object[] objArr = {dDResource};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e99c0e60b98bf7cabf1228b8d7df6cb", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e99c0e60b98bf7cabf1228b8d7df6cb")).booleanValue();
        }
        this.h.lock();
        try {
            if (c(dDResource)) {
                d();
                return true;
            }
            return false;
        } finally {
            this.h.unlock();
        }
    }

    public final boolean a(List<DDResource> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a120545b23695bd2af03a88d77c125b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a120545b23695bd2af03a88d77c125b")).booleanValue();
        }
        if (list == null || list.isEmpty()) {
            return false;
        }
        this.h.lock();
        try {
            boolean z = false;
            for (DDResource dDResource : list) {
                z |= c(dDResource);
            }
            if (z) {
                d();
                return true;
            }
            return false;
        } finally {
            this.h.unlock();
        }
    }

    private boolean c(DDResource dDResource) {
        Object[] objArr = {dDResource};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cbd7e80b67f55b65e4801aa9326b75c9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cbd7e80b67f55b65e4801aa9326b75c9")).booleanValue();
        }
        if (d(dDResource) && dDResource.localFileExists()) {
            DDResource m10clone = dDResource.m10clone();
            if (m10clone.getFileSize() <= 0 && !m10clone.isDefaultPreset()) {
                m10clone.setFileSize(new File(m10clone.getLocalPath()).length());
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList(this.e.size() + 1);
            arrayList2.addAll(this.e);
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                DDResource dDResource2 = (DDResource) it.next();
                if (m10clone.equals(dDResource2)) {
                    return false;
                }
                if (TextUtils.equals(m10clone.getName(), dDResource2.getName())) {
                    arrayList.add(dDResource2);
                    it.remove();
                }
            }
            if (com.meituan.met.mercury.load.utils.d.a(arrayList)) {
                arrayList2.add(m10clone);
                this.e = arrayList2;
                return true;
            }
            int intValue = (b.size() <= 0 || !b.containsKey(m10clone.getName())) ? 1 : b.get(m10clone.getName()).intValue();
            if (intValue > 1 && arrayList.size() > 1 && arrayList.size() + 1 > intValue) {
                a((List<DDResource>) arrayList, true);
            }
            Iterator<DDResource> it2 = arrayList.iterator();
            int i = -1;
            while (it2.hasNext()) {
                DDResource next = it2.next();
                if (m10clone.getPreload() > 0) {
                    if (next.getPreload() == 0) {
                        if (TextUtils.equals(m10clone.getVersion(), next.getVersion())) {
                            m10clone.setDeleteState(1);
                            i = 71;
                        }
                    } else {
                        if (TextUtils.equals(m10clone.getVersion(), next.getVersion())) {
                            if (TextUtils.equals(m10clone.getLocalPath(), next.getLocalPath())) {
                                it2.remove();
                            } else if (m10clone.getPreload() == 1 || (m10clone.getPreload() != 1 && next.getPreload() != 1)) {
                                next.setIsNewest(0);
                                next.setDeleteState(1);
                            } else {
                                m10clone.setIsNewest(0);
                                m10clone.setDeleteState(1);
                            }
                        } else {
                            next.setIsNewest(0);
                            next.setDeleteState(1);
                        }
                        i = 70;
                    }
                } else if (next.getPreload() > 0) {
                    if (TextUtils.equals(m10clone.getVersion(), next.getVersion())) {
                        next.setDeleteState(1);
                        i = 70;
                    }
                } else if (TextUtils.equals(m10clone.getVersion(), next.getVersion())) {
                    if (TextUtils.equals(m10clone.getLocalPath(), next.getLocalPath())) {
                        it2.remove();
                    } else {
                        next.setDeleteState(1);
                        i = 21;
                    }
                } else {
                    if (m10clone.getIsNewest() == 1 && next.getIsNewest() == 1) {
                        next.setIsNewest(0);
                    }
                    if (next.getIsNewest() != 1 && next.getDeleteState() != 1 && !next.isDefaultPreset() && intValue - 1 <= 0 && !next.isPreset()) {
                        next.setDeleteState(1);
                        i = 20;
                    }
                }
                if (next.getDeleteState() == 1 && i > 0) {
                    a(this.d, next, i);
                }
            }
            if (m10clone.getDeleteState() == 1 && i > 0) {
                a(this.d, m10clone, i);
            }
            arrayList2.add(m10clone);
            if (!com.meituan.met.mercury.load.utils.d.a(arrayList)) {
                arrayList2.addAll(arrayList);
            }
            this.e = arrayList2;
            return true;
        }
        return false;
    }

    public final void a(List<ResourceIdVersion> list, int i) {
        boolean z = false;
        Object[] objArr = {list, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "afd6a9bb7cbcb3a4649708edd5ab39d7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "afd6a9bb7cbcb3a4649708edd5ab39d7");
        } else if (list != null && !list.isEmpty()) {
            this.h.lock();
            try {
                for (DDResource dDResource : this.e) {
                    for (ResourceIdVersion resourceIdVersion : list) {
                        if (TextUtils.equals(dDResource.getName(), resourceIdVersion.id) && TextUtils.equals(dDResource.getVersion(), resourceIdVersion.version) && dDResource.getDeleteState() != 1 && !dDResource.isPreset()) {
                            dDResource.setDeleteState(1);
                            a(this.d, dDResource.getName(), dDResource.getVersion(), "", i);
                            z = true;
                        }
                    }
                }
                if (z) {
                    d();
                }
            } finally {
                this.h.unlock();
            }
        }
    }

    public final void b(List<ResourceIdVersion> list, int i) {
        boolean z = false;
        Object[] objArr = {list, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a1a548871c351fb172e16b7c637501b9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a1a548871c351fb172e16b7c637501b9");
        } else if (!list.isEmpty()) {
            this.h.lock();
            try {
                for (DDResource dDResource : this.e) {
                    for (ResourceIdVersion resourceIdVersion : list) {
                        if (TextUtils.equals(dDResource.getName(), resourceIdVersion.id) && TextUtils.equals(dDResource.getVersion(), resourceIdVersion.version) && dDResource.getDeleteState() != i && !dDResource.isPreset()) {
                            dDResource.setDeleteState(i);
                            if (i == 1) {
                                a(this.d, dDResource, 130);
                            }
                            z = true;
                        }
                    }
                }
                if (z) {
                    d();
                }
            } finally {
                this.h.unlock();
            }
        }
    }

    public final void b(List<ResourceNameVersion> list) {
        boolean z = false;
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b4e0845fd3748dc530aa501bf517b852", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b4e0845fd3748dc530aa501bf517b852");
        } else if (!com.meituan.met.mercury.load.utils.d.a(list)) {
            this.h.lock();
            try {
                com.meituan.met.mercury.load.utils.b bVar = new com.meituan.met.mercury.load.utils.b(this.d + ":deleteLocalResource");
                bVar.a("nameVersions", list.toString());
                Iterator<DDResource> it = this.e.iterator();
                while (it.hasNext()) {
                    DDResource next = it.next();
                    if (next == null) {
                        it.remove();
                        z = true;
                    } else {
                        for (ResourceNameVersion resourceNameVersion : list) {
                            if (TextUtils.equals(next.getName(), resourceNameVersion.getName()) && TextUtils.equals(next.getVersion(), resourceNameVersion.getVersion()) && !next.isPreset()) {
                                it.remove();
                                b(next);
                                a(this.d, next.getName(), next.getVersion(), "", 100);
                                z = true;
                            }
                        }
                    }
                }
                bVar.a("changed", Boolean.valueOf(z));
                com.meituan.met.mercury.load.utils.c.a(bVar);
                if (z) {
                    d();
                }
            } finally {
                this.h.unlock();
            }
        }
    }

    private boolean d(DDResource dDResource) {
        Object[] objArr = {dDResource};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b7d03e894865ba318c38a29f264af7d2", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b7d03e894865ba318c38a29f264af7d2")).booleanValue() : (dDResource == null || !this.d.equals(dDResource.getBusiness()) || TextUtils.isEmpty(dDResource.getMd5()) || TextUtils.isEmpty(dDResource.getName())) ? false : true;
    }

    private boolean f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a4ba7ab713be808baabb2e027e47b426", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a4ba7ab713be808baabb2e027e47b426")).booleanValue() : this.e != null && this.e.size() > 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(long r13) {
        /*
            Method dump skipped, instructions count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.met.mercury.load.core.r.a(long):void");
    }

    private void a(List<DDResource> list, final boolean z) {
        Object[] objArr = {list, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd8700e19cfb0320be6543bd3d05ee74", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd8700e19cfb0320be6543bd3d05ee74");
        } else {
            Collections.sort(list, new Comparator<DDResource>() { // from class: com.meituan.met.mercury.load.core.r.1
                public static ChangeQuickRedirect a;

                @Override // java.util.Comparator
                public final /* synthetic */ int compare(DDResource dDResource, DDResource dDResource2) {
                    int i;
                    DDResource dDResource3 = dDResource;
                    DDResource dDResource4 = dDResource2;
                    Object[] objArr2 = {dDResource3, dDResource4};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "46c3074c4e102411675f95ae90dbc114", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "46c3074c4e102411675f95ae90dbc114")).intValue();
                    }
                    if (dDResource3 == null || dDResource4 == null || dDResource3.getLastUseMillis() - dDResource4.getLastUseMillis() == 0) {
                        return 0;
                    }
                    return z ? i < 0 ? 1 : -1 : i > 0 ? 1 : -1;
                }
            });
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class c implements ag<List<DDResource>> {
        public static ChangeQuickRedirect a;

        public c() {
        }

        @Override // com.meituan.android.cipstorage.ag
        public final /* synthetic */ List<DDResource> deserializeFromString(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5fb5666b7daf5506206fd2e23e28cb05", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5fb5666b7daf5506206fd2e23e28cb05") : (List) com.meituan.met.mercury.load.utils.a.a(str, new TypeToken<List<DDResource>>() { // from class: com.meituan.met.mercury.load.core.r.c.1
            }.getType());
        }

        @Override // com.meituan.android.cipstorage.ag
        public final /* synthetic */ String serializeAsString(List<DDResource> list) {
            List<DDResource> list2 = list;
            Object[] objArr = {list2};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4dbebf7922e188b8bc996d827f2d8987", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4dbebf7922e188b8bc996d827f2d8987") : com.meituan.met.mercury.load.utils.a.a(list2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        public Set<String> b;
        public List<ResourceNameVersion> c;
        public String d;
        public String e;
        public String f;
        public Set<Integer> g;
        public Integer h;
        public Integer i;
        Set<Integer> j;

        public a() {
        }

        public final boolean a(DDResource dDResource) {
            boolean z;
            Object[] objArr = {dDResource};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fadae2573e77461ff8a4a5369d5770af", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fadae2573e77461ff8a4a5369d5770af")).booleanValue();
            }
            if (dDResource == null) {
                return false;
            }
            if (this.c != null && this.c.size() > 0) {
                Iterator<ResourceNameVersion> it = this.c.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    }
                    ResourceNameVersion next = it.next();
                    if (TextUtils.equals(next.getName(), dDResource.getName()) && TextUtils.equals(next.getVersion(), dDResource.getVersion())) {
                        z = true;
                        break;
                    }
                }
                if (!z) {
                    return false;
                }
            }
            if (this.b == null || this.b.size() <= 0 || this.b.contains(dDResource.getName())) {
                if (this.d == null || this.d.equals(dDResource.getName())) {
                    if (this.e == null || this.e.equals(dDResource.getVersion())) {
                        if (this.f == null || this.f.equals(dDResource.getMd5())) {
                            if (this.g == null || this.g.size() <= 0 || this.g.contains(Integer.valueOf(dDResource.getMode()))) {
                                if (this.h == null || this.h.equals(Integer.valueOf(dDResource.getIsNewest()))) {
                                    if (this.i == null || this.i.equals(Integer.valueOf(dDResource.getDeleteState()))) {
                                        return this.j == null || this.j.size() <= 0 || this.j.contains(Integer.valueOf(dDResource.getPreload()));
                                    }
                                    return false;
                                }
                                return false;
                            }
                            return false;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static final class b {
        public static ChangeQuickRedirect a;
        List<ResourceNameVersion> b;
        Set<String> c;
        String d;
        Set<Integer> e;
        Integer f;
        Integer g;
        Set<Integer> h;
        private String i;
        private String j;

        public static b a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fa70cfa4aeeb7e2782de837acd67a673", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fa70cfa4aeeb7e2782de837acd67a673") : new b();
        }

        public final a b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a50040860bf3af9bb499a56b55b237ec", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a50040860bf3af9bb499a56b55b237ec");
            }
            a aVar = new a();
            aVar.c = this.b;
            aVar.b = this.c;
            aVar.d = this.d;
            aVar.h = this.f;
            aVar.e = this.i;
            aVar.f = this.j;
            aVar.i = this.g;
            aVar.g = this.e;
            aVar.j = this.h;
            return aVar;
        }
    }

    public static void a(String str, DDResource dDResource, int i) {
        Object[] objArr = {str, dDResource, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c033dcd68a118e793880b3746b0f1291", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c033dcd68a118e793880b3746b0f1291");
            return;
        }
        String str2 = "";
        String str3 = "";
        String str4 = "";
        if (dDResource != null) {
            str2 = dDResource.getName();
            str3 = dDResource.getVersion();
            str4 = dDResource.getLocalPath();
        }
        a(str, str2, str3, str4, i);
    }

    public static void a(String str, String str2, String str3, String str4, int i) {
        Object[] objArr = {str, str2, str3, str4, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4709bf6b496b0e3095be3dfe8681b20e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4709bf6b496b0e3095be3dfe8681b20e");
            return;
        }
        HashMap hashMap = new HashMap();
        if (i == 60 || i == 110) {
            hashMap.put("path", str4);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        hashMap.put("strategy", sb.toString());
        com.meituan.met.mercury.load.report.e.a().a(str, str2, str3, "DDDBundleClear", Float.valueOf(0.0f), hashMap);
    }
}

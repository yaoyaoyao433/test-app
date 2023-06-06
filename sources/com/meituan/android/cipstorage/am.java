package com.meituan.android.cipstorage;

import android.annotation.SuppressLint;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.TreeMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class am {
    public static ChangeQuickRedirect a;
    public String b;
    public String c;
    public List<String> d;
    public int e;
    public boolean f;
    public i g;
    public File h;
    public am i;
    public List<am> j;

    public am(File file, String str, int i) {
        Object[] objArr = {file, str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "30b8266ee8965a85e4ac042b98f2bab7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "30b8266ee8965a85e4ac042b98f2bab7");
            return;
        }
        this.d = new ArrayList();
        this.e = -1;
        this.h = file;
        if (file != null) {
            this.f = file.isDirectory();
            String substring = file.getAbsolutePath().substring(i);
            this.b = str + y.a(substring, this.d);
            this.c = str + substring;
        }
    }

    public static Map<String, Integer> a(Map<String, Integer> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "676eb2a05bd1550d558c9591c777ab8a", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "676eb2a05bd1550d558c9591c777ab8a");
        }
        HashMap hashMap = map == null ? new HashMap() : new HashMap(map);
        String[] strArr = {"/external/cache", "/internal/cache"};
        for (int i = 0; i < 2; i++) {
            String str = strArr[i];
            if (!hashMap.containsKey(str)) {
                hashMap.put(str, 4000);
            }
        }
        return hashMap;
    }

    public static PriorityQueue<am> a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "104e768e8d5cd15035547fe901f08255", RobustBitConfig.DEFAULT_VALUE) ? (PriorityQueue) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "104e768e8d5cd15035547fe901f08255") : new PriorityQueue<>(11, new Comparator<am>() { // from class: com.meituan.android.cipstorage.am.1
            public static ChangeQuickRedirect a;

            @Override // java.util.Comparator
            public final /* synthetic */ int compare(am amVar, am amVar2) {
                am amVar3 = amVar;
                am amVar4 = amVar2;
                Object[] objArr2 = {amVar3, amVar4};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f511a05904d4bf89845c8ad6de347c75", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f511a05904d4bf89845c8ad6de347c75")).intValue();
                }
                int i = ((amVar4.g.b() - amVar3.g.b()) > 0L ? 1 : ((amVar4.g.b() - amVar3.g.b()) == 0L ? 0 : -1));
                if (i > 0) {
                    return 1;
                }
                return i == 0 ? 0 : -1;
            }
        });
    }

    public static Map<String, Integer> b(Map<String, Integer> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3431e3c510663d62c2d69706247c57b7", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3431e3c510663d62c2d69706247c57b7");
        }
        final HashMap hashMap = map == null ? new HashMap() : new HashMap(map);
        String[] strArr = {"/", "/external/cache/cips", "/external/files/cips", "/internal/cache/cips", "/internal/files/cips"};
        for (int i = 0; i < 5; i++) {
            String str = strArr[i];
            if (!hashMap.containsKey(str)) {
                hashMap.put(str, 2);
            }
        }
        TreeMap treeMap = new TreeMap(new Comparator<String>() { // from class: com.meituan.android.cipstorage.am.2
            public static ChangeQuickRedirect a;

            @Override // java.util.Comparator
            public final /* synthetic */ int compare(String str2, String str3) {
                String str4 = str2;
                String str5 = str3;
                Object[] objArr2 = {str4, str5};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "73edb546d054b8bbaa5629a0c69f1cba", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "73edb546d054b8bbaa5629a0c69f1cba")).intValue();
                }
                int a2 = a(str5) - a(str4);
                return a2 != 0 ? a2 : str5.compareTo(str4);
            }

            private int a(String str2) {
                Object[] objArr2 = {str2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "73616447a64403c719e52431ce5fc5a8", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "73616447a64403c719e52431ce5fc5a8")).intValue();
                }
                Integer num = (Integer) hashMap.get(str2);
                return str2.split("/").length + (num != null ? num.intValue() : 0);
            }
        });
        treeMap.putAll(hashMap);
        return treeMap;
    }

    public final void a(am amVar) {
        Object[] objArr = {amVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "762eb2a6165174d19fee4e3a67c3e599", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "762eb2a6165174d19fee4e3a67c3e599");
            return;
        }
        if (this.j == null) {
            this.j = new ArrayList();
        }
        this.j.add(amVar);
        amVar.i = this;
        if (this.g == null) {
            this.g = new i(0L, 0L, 0L, 0L);
        }
        this.g.b += amVar.g.b;
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eef713d008214883621fcfe8832c0be2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eef713d008214883621fcfe8832c0be2");
            return;
        }
        long a2 = ab.a(this.h);
        if (a2 > this.g.b) {
            a2 = this.g.b;
        }
        this.g.b -= a2;
        i iVar = this.g;
        i iVar2 = this.g;
        this.g.d = 0L;
        iVar2.e = 0L;
        iVar.c = 0L;
        if (this.i != null) {
            this.i.j.remove(this);
        }
        if (a2 > 0) {
            for (am amVar = this.i; amVar != null; amVar = amVar.i) {
                amVar.g.b -= a2;
            }
        }
    }

    @SuppressLint({"DefaultLocale"})
    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "472050b7ed850035f28494444e23f90f", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "472050b7ed850035f28494444e23f90f");
        }
        return String.format("path: %s formatPath: %s level: %d fileInfo: %s", this.h != null ? this.h.getAbsolutePath() : StringUtil.NULL, this.b, Integer.valueOf(this.e), this.g);
    }
}

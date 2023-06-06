package com.meituan.android.cipstorage;

import com.meituan.android.cipstorage.af;
import com.meituan.android.cipstorage.j;
import com.meituan.android.cipstorage.l;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class t extends j.c {
    public static ChangeQuickRedirect a;
    public static final Map<l, l.a> d = new HashMap();

    @Override // com.meituan.android.cipstorage.j.c
    public final String a() {
        return "clean.storage";
    }

    @Override // com.meituan.android.cipstorage.j.c
    public final boolean a(af afVar) {
        Object[] objArr = {afVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d088be2deb43881ae349277761d975f5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d088be2deb43881ae349277761d975f5")).booleanValue();
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r10v3 */
    @Override // com.meituan.android.cipstorage.j.c
    public final void b(af afVar) {
        Iterator<Map.Entry<l, l.a>> it;
        Set<File> emptySet;
        long j;
        char c = 1;
        ?? r10 = 0;
        Object[] objArr = {afVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa358fbec3cd315d263a9eb77e3ff419", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa358fbec3cd315d263a9eb77e3ff419");
            return;
        }
        b();
        Set<af.c> a2 = afVar.a();
        if (a2 != null && !a2.isEmpty()) {
            for (af.c cVar : a2) {
                if (!cVar.c) {
                    d.remove(cVar.b);
                } else {
                    l.a aVar = d.get(cVar.b);
                    if (aVar == null) {
                        aVar = new l.a();
                        d.put(cVar.b, aVar);
                    }
                    aVar.a = cVar.d;
                }
            }
        }
        b();
        List<String> c2 = afVar.c();
        Iterator<Map.Entry<l, l.a>> it2 = d.entrySet().iterator();
        long j2 = 0;
        while (it2.hasNext()) {
            Map.Entry<l, l.a> next = it2.next();
            l.a value = next.getValue();
            final ae aeVar = value.b != null ? value.b : ae.a;
            final l key = next.getKey();
            long j3 = value.a;
            Object[] objArr2 = new Object[4];
            objArr2[r10] = key;
            objArr2[c] = new Long(j3);
            objArr2[2] = aeVar;
            objArr2[3] = c2;
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a687ca2b931f933f89ff537df025b40b", RobustBitConfig.DEFAULT_VALUE)) {
                j = ((Long) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, r10, "a687ca2b931f933f89ff537df025b40b")).longValue();
                it = it2;
            } else {
                Object[] objArr3 = new Object[2];
                objArr3[r10] = key;
                objArr3[1] = aeVar;
                ChangeQuickRedirect changeQuickRedirect3 = a;
                it = it2;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "f6e030f5ba0dd724b063beb7df53e3c7", RobustBitConfig.DEFAULT_VALUE)) {
                    emptySet = (Set) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "f6e030f5ba0dd724b063beb7df53e3c7");
                } else {
                    File[] listFiles = new File(y.a(key)).listFiles();
                    if (listFiles == null || listFiles.length <= 0) {
                        emptySet = Collections.emptySet();
                    } else {
                        TreeSet treeSet = new TreeSet(new Comparator<File>() { // from class: com.meituan.android.cipstorage.t.1
                            public static ChangeQuickRedirect a;

                            @Override // java.util.Comparator
                            public final /* synthetic */ int compare(File file, File file2) {
                                File file3 = file;
                                File file4 = file2;
                                Object[] objArr4 = {file3, file4};
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "b875b72d52f4356331e9b1c7495abbbd", RobustBitConfig.DEFAULT_VALUE)) {
                                    return ((Integer) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "b875b72d52f4356331e9b1c7495abbbd")).intValue();
                                }
                                int a3 = (int) (aeVar.a(key, file4) - aeVar.a(key, file3));
                                return a3 == 0 ? file4.compareTo(file3) : a3;
                            }
                        });
                        treeSet.addAll(Arrays.asList(listFiles));
                        emptySet = treeSet;
                    }
                }
                j = 0;
                long j4 = 0;
                for (File file : emptySet) {
                    long a3 = y.a(file) + j4;
                    if (a3 > j3) {
                        j += ab.a(file, c2);
                    } else {
                        j4 = a3;
                    }
                }
            }
            j2 += j;
            b();
            it2 = it;
            c = 1;
            r10 = 0;
        }
        if (j2 > 0) {
            v.a("storage", j2, null);
        }
    }
}

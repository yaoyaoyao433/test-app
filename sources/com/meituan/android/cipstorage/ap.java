package com.meituan.android.cipstorage;

import android.util.SparseArray;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class ap {
    public static ChangeQuickRedirect a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static abstract class a {
        public boolean a(am amVar, int i) {
            return true;
        }

        public boolean a(Map<am, List<am>> map, int i) {
            return true;
        }

        public boolean b(am amVar, int i) {
            return true;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    static class b {
        public List<am> d;
        public SparseArray<PriorityQueue<am>> a = new SparseArray<>();
        public Map<String, am> b = new HashMap();
        public am c = new am(null, "/", 0);
        public Set<am> e = new HashSet();
    }

    private static void b(am amVar, a aVar) {
        Object[] objArr = {amVar, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "52367b85e46151ecf3f1807a97ffea04", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "52367b85e46151ecf3f1807a97ffea04");
        } else if (amVar == null) {
        } else {
            a(amVar, aVar, 0);
        }
    }

    private static void a(am amVar, a aVar, int i) {
        Object[] objArr = {amVar, aVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2dbcc66bfbf1e71da099be48576803c6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2dbcc66bfbf1e71da099be48576803c6");
            return;
        }
        aVar.b(amVar, i);
        int i2 = i + 1;
        if (amVar.f && amVar.j != null && aVar.a(amVar, i)) {
            for (am amVar2 : amVar.j) {
                if (amVar2 != null) {
                    a(amVar2, aVar, i2);
                }
            }
        }
    }

    public static List<am> a(am amVar, List<am> list) {
        Object[] objArr = {amVar, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "713883c356b9522b83d42c8f651128a7", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "713883c356b9522b83d42c8f651128a7");
        }
        final HashSet hashSet = new HashSet();
        for (am amVar2 : list) {
            hashSet.add(amVar2);
            for (am amVar3 = amVar2.i; amVar3 != null && !hashSet.contains(amVar3); amVar3 = amVar3.i) {
                hashSet.add(amVar3);
            }
        }
        final ArrayList arrayList = new ArrayList();
        final HashSet hashSet2 = new HashSet(list);
        b(amVar, new a() { // from class: com.meituan.android.cipstorage.ap.2
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cipstorage.ap.a
            public final boolean a(am amVar4, int i) {
                Object[] objArr2 = {amVar4, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "983b87d73f6f4e9187d12a5d9804bc67", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "983b87d73f6f4e9187d12a5d9804bc67")).booleanValue() : hashSet.contains(amVar4) && !hashSet2.contains(amVar4);
            }

            @Override // com.meituan.android.cipstorage.ap.a
            public final boolean b(am amVar4, int i) {
                Object[] objArr2 = {amVar4, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a4a9fec2e20a2748babfa288d5dfadd8", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a4a9fec2e20a2748babfa288d5dfadd8")).booleanValue();
                }
                if (!hashSet.contains(amVar4)) {
                    arrayList.add(amVar4);
                }
                return super.b(amVar4, i);
            }
        });
        return arrayList;
    }

    public static void a(am amVar, a aVar) {
        int i = 0;
        Object[] objArr = {amVar, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b67ce88e32898b6b54b0e73fa88edb9e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b67ce88e32898b6b54b0e73fa88edb9e");
        } else if (amVar != null) {
            LinkedList linkedList = new LinkedList();
            linkedList.offer(amVar);
            while (!linkedList.isEmpty()) {
                HashMap hashMap = new HashMap();
                int size = linkedList.size();
                while (true) {
                    int i2 = size - 1;
                    if (size == 0) {
                        break;
                    }
                    am amVar2 = (am) linkedList.poll();
                    List<am> list = hashMap.get(amVar2.i);
                    if (list == null) {
                        list = new ArrayList<>();
                        hashMap.put(amVar2.i, list);
                    }
                    list.add(amVar2);
                    if (amVar2.f && amVar2.j != null && aVar.a(amVar2, i)) {
                        for (am amVar3 : amVar2.j) {
                            linkedList.offer(amVar3);
                        }
                    }
                    size = i2;
                }
                int i3 = i + 1;
                if (!aVar.a(hashMap, i)) {
                    return;
                }
                i = i3;
            }
        }
    }

    private static am a(File file, int i, String str, int i2, a aVar) {
        Object[] objArr = {file, Integer.valueOf(i), str, Integer.valueOf(i2), aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "770055a1dbf20ec0895e3481bcac760a", RobustBitConfig.DEFAULT_VALUE)) {
            return (am) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "770055a1dbf20ec0895e3481bcac760a");
        }
        am amVar = new am(file, str, i2);
        i a2 = MMKV.a(file);
        amVar.g = a2;
        if (file.isDirectory() && aVar.a(amVar, i)) {
            a2.b = 0L;
            File[] listFiles = file.listFiles();
            if (listFiles != null && listFiles.length > 0) {
                for (File file2 : listFiles) {
                    amVar.a(a(file2, i + 1, str, i2, aVar));
                }
            }
        }
        if (aVar != null) {
            aVar.b(amVar, i);
        }
        return amVar;
    }

    public static void a(am amVar, boolean z, a aVar) {
        String str;
        Object[] objArr = {amVar, Byte.valueOf(z ? (byte) 1 : (byte) 0), aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        File file = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6b3596fa47ce8d3ddf288e17274b6714", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6b3596fa47ce8d3ddf288e17274b6714");
            return;
        }
        if (z) {
            str = "/external";
            File externalCacheDir = v.c.getExternalCacheDir();
            if (externalCacheDir != null) {
                file = externalCacheDir.getParentFile();
            }
        } else {
            str = "/internal";
            file = v.c.getCacheDir().getParentFile();
        }
        if (file == null) {
            return;
        }
        amVar.a(a(file, 0, str, file.getAbsolutePath().length(), aVar));
    }
}

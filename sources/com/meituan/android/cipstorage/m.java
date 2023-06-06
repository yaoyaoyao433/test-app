package com.meituan.android.cipstorage;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class m {
    public static ChangeQuickRedirect a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface a {
        void a(File file, Map<File, i> map);

        boolean a(File file);
    }

    public static void a(File file, boolean z, a aVar) {
        Object[] objArr = {file, (byte) 1, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cb4ca9d229621829be62d46c883eb808", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cb4ca9d229621829be62d46c883eb808");
        } else if (file.exists()) {
            if (file.isFile()) {
                a((File) null, Collections.singletonMap(file, MMKV.a(file)), aVar);
                return;
            }
            HashMap hashMap = new HashMap();
            LinkedList linkedList = new LinkedList();
            LinkedList linkedList2 = new LinkedList();
            linkedList.offer(file);
            do {
                File file2 = (File) linkedList.poll();
                if (file2 == null) {
                    File file3 = (File) linkedList2.poll();
                    if (!hashMap.isEmpty()) {
                        a(file3, hashMap, aVar);
                        hashMap = new HashMap();
                    }
                } else if (file2.isDirectory()) {
                    if (aVar.a(file2)) {
                        File[] listFiles = file2.listFiles();
                        if (listFiles != null && listFiles.length > 0) {
                            for (File file4 : listFiles) {
                                linkedList.offer(file4);
                            }
                        }
                        linkedList.offer(null);
                        linkedList2.offer(file2);
                    }
                } else {
                    hashMap.put(file2, MMKV.a(file2));
                }
            } while (!linkedList.isEmpty());
        }
    }

    private static void a(File file, Map<File, i> map, a aVar) {
        boolean z = false;
        Object[] objArr = {file, map, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f202ed39850029dca66a681171b663fa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f202ed39850029dca66a681171b663fa");
            return;
        }
        i a2 = file != null ? MMKV.a(file) : null;
        if (a2 != null && a2.a()) {
            Iterator<i> it = map.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = true;
                    break;
                }
                i next = it.next();
                if (next.a()) {
                    break;
                } else if (a2.c > next.d) {
                    if (a2.c <= next.e) {
                        break;
                    }
                } else {
                    break;
                }
            }
            if (z) {
                for (i iVar : map.values()) {
                    iVar.c = a2.c;
                }
            }
        }
        aVar.a(file, map);
    }

    private static void a(File file, boolean z, boolean z2, boolean z3, Map<String, f> map, String str) {
        Object[] objArr = {file, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Byte.valueOf(z3 ? (byte) 1 : (byte) 0), map, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f8e54493380c17e2b293e0ed74667282", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f8e54493380c17e2b293e0ed74667282");
            return;
        }
        File[] listFiles = str == null ? file.listFiles() : new File[]{new File(file, str)};
        int length = listFiles == null ? 0 : listFiles.length;
        for (int i = 0; i < length; i++) {
            File file2 = listFiles[i];
            String name = file2.getName();
            f fVar = map.get(name);
            if (fVar == null) {
                fVar = new f();
                map.put(name, fVar);
            }
            if (z) {
                long a2 = y.a(file2);
                if (z2) {
                    if (z3) {
                        fVar.b += a2;
                    } else {
                        fVar.c += a2;
                    }
                } else if (z3) {
                    fVar.d += a2;
                } else {
                    fVar.e += a2;
                }
            }
        }
    }

    private static void a(File file, boolean z, boolean z2, Map<String, f> map, String str) {
        Object[] objArr = {file, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), map, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e1526a6db1859b31385997076691639b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e1526a6db1859b31385997076691639b");
            return;
        }
        File[] listFiles = file.listFiles();
        int length = listFiles == null ? 0 : listFiles.length;
        for (int i = 0; i < length; i++) {
            File file2 = listFiles[i];
            String name = file2.getName();
            a(file2, z2, ("common".equals(name) || "lru".equals(name)) ? false : true, z, map, str);
        }
    }

    public static Map<String, f> a(boolean z, String str, boolean z2) {
        Map<String, f> singletonMap;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str, Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ff5058e06628df25d531944c2095af97", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ff5058e06628df25d531944c2095af97");
        }
        if (str == null) {
            singletonMap = new HashMap<>();
        } else {
            singletonMap = Collections.singletonMap(str, new f());
        }
        a(new File(y.b), true, z, singletonMap, str);
        a(new File(y.c), false, z, singletonMap, str);
        if (!TextUtils.equals(y.b, y.d)) {
            a(new File(y.d), true, z, singletonMap, str);
        }
        if (!TextUtils.equals(y.c, y.e)) {
            a(new File(y.e), false, z, singletonMap, str);
        }
        if (z) {
            a(singletonMap);
        }
        return (str == null && z2) ? b(singletonMap) : singletonMap;
    }

    private static void a(Map<String, f> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d4e0c46cfc01699b7e36ba54d5c731d8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d4e0c46cfc01699b7e36ba54d5c731d8");
            return;
        }
        for (Map.Entry<String, f> entry : map.entrySet()) {
            String key = entry.getKey();
            f value = entry.getValue();
            for (u uVar : u.e()) {
                value.g += y.a(new File(y.c(key, uVar)));
            }
        }
    }

    private static Map<String, f> b(Map<String, f> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ade4d55f7ffa7d0205c748244b257f9e", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ade4d55f7ffa7d0205c748244b257f9e");
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, f> entry : map.entrySet()) {
            String key = entry.getKey();
            f value = entry.getValue();
            String a2 = y.a(key);
            if (TextUtils.equals(key, a2)) {
                hashMap.put(key, value);
            } else {
                f fVar = (f) hashMap.get(a2);
                if (fVar == null) {
                    fVar = new f();
                    hashMap.put(a2, fVar);
                }
                Object[] objArr2 = {value};
                ChangeQuickRedirect changeQuickRedirect2 = f.a;
                if (PatchProxy.isSupport(objArr2, fVar, changeQuickRedirect2, false, "b9c115ddab449683467b5018e05fe21e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, fVar, changeQuickRedirect2, false, "b9c115ddab449683467b5018e05fe21e");
                } else {
                    fVar.b += value.b;
                    fVar.c += value.c;
                    fVar.d += value.d;
                    fVar.e += value.e;
                    fVar.f += value.f;
                    fVar.g += value.g;
                }
            }
        }
        return hashMap;
    }
}

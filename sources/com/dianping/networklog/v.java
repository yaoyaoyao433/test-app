package com.dianping.networklog;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StatFs;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.VisibleForTesting;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.dianping.networklog.af;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public final class v {
    public static ChangeQuickRedirect a;
    public static final Pattern b = Pattern.compile("^\\.(\\d+).*$");
    File c;
    File d;
    File e;
    File f;
    long g;
    File h;
    File i;
    Context j;
    boolean k;
    public AtomicBoolean l;

    public v() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d09721dd4df4c3ee1e7bf356b2996ae0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d09721dd4df4c3ee1e7bf356b2996ae0");
            return;
        }
        this.k = false;
        this.l = new AtomicBoolean(false);
    }

    @VisibleForTesting
    private int a(@NonNull String str, @NonNull String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3971366aab1a5e5ec647b632f54fdfe3", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3971366aab1a5e5ec647b632f54fdfe3")).intValue();
        }
        if (str.equals(str2)) {
            return 0;
        }
        if (str.startsWith(str2)) {
            Matcher matcher = b.matcher(str.substring(str2.length()));
            if (matcher.find()) {
                return Integer.parseInt(matcher.group(1));
            }
            return -1;
        }
        return -1;
    }

    @VisibleForTesting
    @NonNull
    private List<Pair<Integer, String>> a(File file, String str) {
        String[] list;
        Object[] objArr = {file, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4090d5b883e5df8156a3970df5a6ec61", 6917529027641081856L)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4090d5b883e5df8156a3970df5a6ec61");
        }
        ArrayList arrayList = new ArrayList();
        if (file != null && str != null && file.exists() && (list = file.list()) != null) {
            for (String str2 : list) {
                int a2 = a(str2, str);
                if (a2 > 0) {
                    arrayList.add(new Pair(Integer.valueOf(a2), str2));
                }
            }
        }
        return arrayList;
    }

    private void a(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e392cd375643c35938dd50ba5f58d56", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e392cd375643c35938dd50ba5f58d56");
        } else {
            aj.a(this.j, "logan_daily_seq", 0).edit().putInt(str, i).apply();
        }
    }

    private void a(String str, Map<Long, Long> map) {
        String[] list;
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c4bae89668be676f9a8333731c33bcfb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c4bae89668be676f9a8333731c33bcfb");
            return;
        }
        File file = new File(this.d, str);
        if (!file.isDirectory() || (list = file.list()) == null) {
            return;
        }
        for (String str2 : list) {
            if (!TextUtils.isEmpty(str2) && !str2.endsWith(".copy")) {
                try {
                    String b2 = aj.b(str2);
                    if (!TextUtils.isEmpty(b2)) {
                        long parseLong = Long.parseLong(b2);
                        long length = new File(file, str2).length();
                        Long l = map.get(Long.valueOf(parseLong));
                        Long valueOf = Long.valueOf(parseLong);
                        if (l != null) {
                            length += l.longValue();
                        }
                        map.put(valueOf, Long.valueOf(length));
                    }
                } catch (Exception unused) {
                }
            }
        }
    }

    private void a(List<af.a> list, File file, String str, String str2) {
        int i = 0;
        Object[] objArr = {list, file, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e4b9dae8ac0060557491730c24b60f8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e4b9dae8ac0060557491730c24b60f8");
            return;
        }
        List<Pair<Integer, String>> a2 = a(file, str);
        for (Pair<Integer, String> pair : a2) {
            if (((Integer) pair.first).intValue() > i) {
                i = ((Integer) pair.first).intValue();
            }
        }
        for (Pair<Integer, String> pair2 : a2) {
            File file2 = new File(file, (String) pair2.second);
            if (file2.length() > 0) {
                list.add(new af.a(file2, ((Integer) pair2.first).intValue(), i, str2));
            } else {
                file2.delete();
            }
        }
    }

    private int c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "71575be079f4a33288d85d0f09719f95", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "71575be079f4a33288d85d0f09719f95")).intValue() : aj.a(this.j, "logan_daily_seq", 0).getInt(str, 0);
    }

    @VisibleForTesting
    private String f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7cfb03e32290e9013fe47457f1e2c126", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7cfb03e32290e9013fe47457f1e2c126") : this.c != null ? this.c.getAbsolutePath() : "";
    }

    private Map<String, Long> g() {
        String[] list;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "02d20b3bbe75a4d97f0aa9b9987febe0", 6917529027641081856L)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "02d20b3bbe75a4d97f0aa9b9987febe0");
        }
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        File file = this.c;
        if (file != null && file.isDirectory() && (list = file.list()) != null) {
            for (String str : list) {
                if (!TextUtils.isEmpty(str) && !str.endsWith(".copy")) {
                    try {
                        String a2 = aj.a(Long.parseLong(aj.b(str)));
                        long length = new File(file, str).length();
                        Long l = (Long) concurrentHashMap.get(a2);
                        if (l != null) {
                            length += l.longValue();
                        }
                        concurrentHashMap.put(a2, Long.valueOf(length));
                    } catch (Exception unused) {
                    }
                }
            }
        }
        return concurrentHashMap;
    }

    public final File a(File file) {
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2cfed70cdc647d4faced5cfff7dba2f6", 6917529027641081856L)) {
            return (File) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2cfed70cdc647d4faced5cfff7dba2f6");
        }
        String name = file.getName();
        if (file.exists()) {
            File parentFile = file.getParentFile();
            int c = c(file.getName()) + 1;
            try {
                File file2 = new File(parentFile, name + CommonConstant.Symbol.DOT + c);
                if (file2.exists()) {
                    file.delete();
                } else if (file.renameTo(file2)) {
                    return file2;
                }
                return null;
            } finally {
                a(file.getName(), c);
            }
        }
        return null;
    }

    @Nullable
    public final File a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0af1b2c22d513c7f7b41b54b3118cd33", 6917529027641081856L) ? (File) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0af1b2c22d513c7f7b41b54b3118cd33") : com.meituan.android.cipstorage.q.a(this.j, "bfe_logan", str);
    }

    public final String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "80886d5f3a272f821515ec744b0cfb7d", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "80886d5f3a272f821515ec744b0cfb7d");
        }
        if (this.h != null) {
            return this.h.getAbsolutePath();
        }
        return null;
    }

    public final List<af.a> a(String str, boolean z, y yVar) {
        File[] listFiles;
        boolean z2 = true;
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0), yVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "309dd1cabc4088506484bd1b65ee046a", 6917529027641081856L)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "309dd1cabc4088506484bd1b65ee046a");
        }
        File file = this.c;
        if (file == null || TextUtils.isEmpty(str)) {
            return new ArrayList(0);
        }
        File file2 = this.f;
        if (!((file2 == null || !str.equals(file2.getName())) ? false : false)) {
            a(new File(file, str));
        } else if (!z) {
            yVar.d();
            if (file2.length() > 0) {
                b(yVar);
            }
        }
        ArrayList arrayList = new ArrayList();
        File parentFile = file.getParentFile();
        if (parentFile != null && (listFiles = parentFile.listFiles()) != null) {
            for (File file3 : listFiles) {
                if (file3.isDirectory()) {
                    a(arrayList, file3, str, file3.getName());
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b0be555b5cc1964efc20b75ad218e8b8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b0be555b5cc1964efc20b75ad218e8b8");
            return;
        }
        SharedPreferences a2 = aj.a(this.j, "logan_daily_seq", 0);
        SharedPreferences.Editor edit = a2.edit();
        for (Map.Entry<String, ?> entry : a2.getAll().entrySet()) {
            try {
                if (Long.parseLong(entry.getKey()) <= j) {
                    edit.remove(entry.getKey());
                }
            } catch (Exception unused) {
            }
        }
        edit.apply();
    }

    public final void a(long j, File file) {
        String[] list;
        Object[] objArr = {new Long(j), file};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "11400d412954fd70babc22ec05d93970", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "11400d412954fd70babc22ec05d93970");
        } else if (file != null && file.isDirectory() && (list = file.list()) != null) {
            for (String str : list) {
                try {
                    String b2 = aj.b(str);
                    if (!TextUtils.isEmpty(b2) && Long.parseLong(b2) <= j) {
                        new File(file, str).delete();
                    }
                } catch (Exception unused) {
                }
            }
        }
    }

    public final void a(e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "403c03497fc55c426a65ad866ce06e85", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "403c03497fc55c426a65ad866ce06e85");
        } else if (!this.k) {
            eVar.a(c.k);
        } else {
            File file = this.f;
            if (file == null) {
                return;
            }
            eVar.a(c.k - b(file.getName()));
        }
    }

    public final long b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e995741e373b6d40f8158a87b834e36", 6917529027641081856L)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e995741e373b6d40f8158a87b834e36")).longValue();
        }
        long j = 0;
        File file = this.c;
        for (Pair<Integer, String> pair : a(file, str)) {
            j += new File(file, (String) pair.second).length();
        }
        return j;
    }

    public final String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "269df4a625a8669e3f90c0d1311dcf3b", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "269df4a625a8669e3f90c0d1311dcf3b") : this.k ? f() : a();
    }

    public final void b(e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3149ab849abd0c1930b0b8d2638c8455", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3149ab849abd0c1930b0b8d2638c8455");
            return;
        }
        File file = this.f;
        if (file == null) {
            return;
        }
        eVar.a(1, "Rollover " + c(file.getName()), com.meituan.android.time.c.b(), System.currentTimeMillis(), "LoganThread", 0L, false, null);
        eVar.d();
        a(file);
        eVar.a(file.getName());
        eVar.a(1, "Rollover done " + c(file.getName()), com.meituan.android.time.c.b(), System.currentTimeMillis(), "LoganThread", 0L, false, null);
        a(eVar);
    }

    public final long c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d1dfc50f09be3ea15e1474db18a8e7ac", 6917529027641081856L)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d1dfc50f09be3ea15e1474db18a8e7ac")).longValue();
        }
        File file = this.c;
        if (file == null) {
            return -1L;
        }
        try {
            StatFs statFs = new StatFs(file.getAbsolutePath());
            return statFs.getAvailableBlocks() * statFs.getBlockSize();
        } catch (IllegalArgumentException unused) {
            return -1L;
        }
    }

    public final String d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "28a28dc7ee21d2668eb35cf158766d23", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "28a28dc7ee21d2668eb35cf158766d23");
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, Long> entry : g().entrySet()) {
            String str = "unknown";
            try {
                str = String.valueOf(aj.b(entry.getValue().longValue()));
            } catch (Exception unused) {
            }
            if (sb.length() > 0) {
                sb.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
            }
            sb.append(entry.getKey());
            sb.append(CommonConstant.Symbol.COLON);
            sb.append(str);
        }
        return sb.toString();
    }

    public final void e() {
        Map<Long, Long> concurrentHashMap;
        String[] list;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6bb8615369ee313775a174f19545c6bd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6bb8615369ee313775a174f19545c6bd");
        } else if (c.r && this.l.compareAndSet(false, true)) {
            try {
                try {
                } catch (Exception e) {
                    if (c.e) {
                        Log.w("LoganFileManager", "deleteOverSizeLog error", e);
                    }
                }
                if (this.j != null && j.a(this.j)) {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "26fa7fac9badb659aeeeec1c55842564", 6917529027641081856L)) {
                        concurrentHashMap = (Map) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "26fa7fac9badb659aeeeec1c55842564");
                    } else {
                        concurrentHashMap = new ConcurrentHashMap<>();
                        if (this.d != null && this.d.isDirectory() && (list = this.d.list()) != null) {
                            for (String str : list) {
                                a(str, concurrentHashMap);
                            }
                        }
                    }
                    ArrayList<Long> arrayList = new ArrayList(concurrentHashMap.keySet());
                    Collections.sort(arrayList, Collections.reverseOrder());
                    Long l = 0L;
                    ArrayList arrayList2 = new ArrayList();
                    long b2 = aj.b();
                    for (Long l2 : arrayList) {
                        l = Long.valueOf(l.longValue() + concurrentHashMap.get(l2).longValue());
                        if (l.longValue() > c.q && l2.longValue() != b2) {
                            arrayList2.add(l2);
                        }
                    }
                    a(arrayList2);
                }
            } finally {
                this.l.set(false);
            }
        }
    }

    private void a(List<Long> list) {
        String[] list2;
        String[] list3;
        char c = 1;
        char c2 = 0;
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d616744f11de1eb37d8b56d803f528b3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d616744f11de1eb37d8b56d803f528b3");
        } else if (list.size() != 0 && this.d != null && this.d.isDirectory() && (list2 = this.d.list()) != null) {
            int length = list2.length;
            int i = 0;
            while (i < length) {
                String str = list2[i];
                Object[] objArr2 = new Object[2];
                objArr2[c2] = str;
                objArr2[c] = list;
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2b9474abe18e9f6f628d1bdca6cf5e2e", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2b9474abe18e9f6f628d1bdca6cf5e2e");
                } else {
                    File file = new File(this.d, str);
                    if (file.isDirectory() && (list3 = file.list()) != null) {
                        for (String str2 : list3) {
                            if (!TextUtils.isEmpty(str2)) {
                                try {
                                    if (list.contains(Long.valueOf(Long.parseLong(aj.b(str2))))) {
                                        new File(file, str2).delete();
                                    }
                                } catch (Exception unused) {
                                }
                            }
                        }
                    }
                }
                i++;
                c = 1;
                c2 = 0;
            }
        }
    }
}

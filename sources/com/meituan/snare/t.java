package com.meituan.snare;

import android.os.Build;
import android.os.Debug;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.FileUtils;
import java.io.File;
import java.io.FilenameFilter;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class t {
    public static ChangeQuickRedirect a;
    private static final String[] b = {CommonConstant.Symbol.MINUS, CommonConstant.Symbol.UNDERLINE, "#"};

    public static boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cad6a163ae55af29003de8bd51da69f6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cad6a163ae55af29003de8bd51da69f6")).booleanValue();
        }
        try {
            Debug.dumpHprofData(str);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static String a(int i, int i2, int i3, boolean z) {
        Object[] objArr = {Integer.valueOf(i), 300, 600, (byte) 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ed1edf50e67404c799355844734fbc98", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ed1edf50e67404c799355844734fbc98");
        }
        String c = c(i, 300, 600, true);
        if (TextUtils.isEmpty(c)) {
            c = b(i, 300, 600, true);
        }
        return c == null ? "" : c;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    private static java.lang.String b(int r18, int r19, int r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 444
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.snare.t.b(int, int, int, boolean):java.lang.String");
    }

    private static String c(int i, int i2, int i3, boolean z) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "84f8448a80c8b4580e75844aa3ed1019", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "84f8448a80c8b4580e75844aa3ed1019");
        }
        try {
            StringBuilder sb = new StringBuilder("current threads (from reflect):\n");
            Field declaredField = ThreadGroup.class.getDeclaredField("systemThreadGroup");
            declaredField.setAccessible(true);
            ThreadGroup threadGroup = (ThreadGroup) declaredField.get(null);
            int activeCount = threadGroup.activeCount();
            Thread[] threadArr = new Thread[activeCount + (activeCount / 2)];
            int enumerate = threadGroup.enumerate(threadArr);
            if (enumerate < i2) {
                return null;
            }
            int min = Math.min(enumerate, i3);
            HashMap hashMap = z ? new HashMap(64) : null;
            for (int i4 = 0; i4 < min; i4++) {
                Thread thread = threadArr[i4];
                if (thread != null) {
                    String name = thread.getName();
                    if (!z) {
                        sb.append("    thread ");
                        sb.append(thread.getId());
                        sb.append(": ");
                        if (TextUtils.isEmpty(name)) {
                            name = "???";
                        }
                        sb.append(name);
                        sb.append('\n');
                    } else {
                        String b2 = b(name);
                        Integer num = (Integer) hashMap.get(b2);
                        if (num == null) {
                            num = 0;
                        }
                        hashMap.put(b2, Integer.valueOf(num.intValue() + 1));
                    }
                }
            }
            if (z) {
                for (Map.Entry<String, Integer> entry : b(hashMap)) {
                    sb.append("    thread count ");
                    sb.append(entry.getValue());
                    sb.append(": ");
                    sb.append(entry.getKey());
                    sb.append('\n');
                }
            }
            sb.append("    (number of threads: ");
            sb.append(min);
            sb.append(")\n");
            return sb.toString();
        } catch (Throwable unused) {
            return null;
        }
    }

    private static List<Map.Entry<String, Integer>> b(Map<String, Integer> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bd2b415b7984cf9be09a88af7ab9bafd", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bd2b415b7984cf9be09a88af7ab9bafd");
        }
        ArrayList arrayList = new ArrayList(map.entrySet());
        Collections.sort(arrayList, new Comparator<Map.Entry<String, Integer>>() { // from class: com.meituan.snare.t.2
            public static ChangeQuickRedirect a;

            @Override // java.util.Comparator
            public final /* synthetic */ int compare(Map.Entry<String, Integer> entry, Map.Entry<String, Integer> entry2) {
                Map.Entry<String, Integer> entry3 = entry;
                Map.Entry<String, Integer> entry4 = entry2;
                Object[] objArr2 = {entry3, entry4};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0417278dc63304bfd10d48615f25651f", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0417278dc63304bfd10d48615f25651f")).intValue() : entry4.getValue().intValue() - entry3.getValue().intValue();
            }
        });
        return arrayList;
    }

    private static String b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0162c4716a4faae0b21e36d8f860f737", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0162c4716a4faae0b21e36d8f860f737");
        }
        if (TextUtils.isEmpty(str)) {
            return "???";
        }
        for (String str2 : b) {
            int lastIndexOf = str.lastIndexOf(str2);
            if (lastIndexOf != -1 && TextUtils.isDigitsOnly(str.substring(lastIndexOf + 1))) {
                return str.substring(0, lastIndexOf);
            }
        }
        return str;
    }

    public static String a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7ef2b65222e5722bb2a901be725a05ec", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7ef2b65222e5722bb2a901be725a05ec");
        }
        return "memory info:\n System Summary (From: /proc/meminfo)\n" + FileUtils.readFile("/proc/meminfo") + "-\n Prsocess Status (From: /proc/PID/status)\n" + FileUtils.readFile("/proc/" + i + "/status") + "-\n Process Limits (From: /proc/PID/limits)\n" + FileUtils.readFile("/proc/" + i + "/limits") + "-\n" + a() + "\n";
    }

    public static String a(Map<String, Long> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d651a2b6fee9c58cbcdde87d83f2b196", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d651a2b6fee9c58cbcdde87d83f2b196");
        }
        if (map == null) {
            return "";
        }
        JSONArray jSONArray = new JSONArray();
        if (map.isEmpty()) {
            return jSONArray.toString();
        }
        long j = 0;
        try {
            for (Map.Entry<String, Long> entry : map.entrySet()) {
                j += entry.getValue().longValue();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(entry.getKey(), entry.getValue());
                jSONArray.put(jSONObject);
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("total", String.valueOf(j));
            jSONArray.put(jSONObject2);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONArray.toString();
    }

    public static String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6eec148eebc6d540dd2a5905cacd9814", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6eec148eebc6d540dd2a5905cacd9814");
        }
        StringBuilder sb = new StringBuilder();
        sb.append(" Process Summary (From: android.os.Debug.MemoryInfo)\n");
        sb.append(String.format(Locale.US, "%21s %8s\n", "", "Pss(KB)"));
        sb.append(String.format(Locale.US, "%21s %8s\n", "", "------"));
        try {
            Debug.MemoryInfo memoryInfo = new Debug.MemoryInfo();
            Debug.getMemoryInfo(memoryInfo);
            if (Build.VERSION.SDK_INT >= 23) {
                sb.append(String.format(Locale.US, "%21s %8s\n", "Java Heap:", memoryInfo.getMemoryStat("summary.java-heap")));
                sb.append(String.format(Locale.US, "%21s %8s\n", "Native Heap:", memoryInfo.getMemoryStat("summary.native-heap")));
                sb.append(String.format(Locale.US, "%21s %8s\n", "Code:", memoryInfo.getMemoryStat("summary.code")));
                sb.append(String.format(Locale.US, "%21s %8s\n", "Stack:", memoryInfo.getMemoryStat("summary.stack")));
                sb.append(String.format(Locale.US, "%21s %8s\n", "Graphics:", memoryInfo.getMemoryStat("summary.graphics")));
                sb.append(String.format(Locale.US, "%21s %8s\n", "Private Other:", memoryInfo.getMemoryStat("summary.private-other")));
                sb.append(String.format(Locale.US, "%21s %8s\n", "System:", memoryInfo.getMemoryStat("summary.system")));
                sb.append(String.format(Locale.US, "%21s %8s %21s %8s\n", "TOTAL:", memoryInfo.getMemoryStat("summary.total-pss"), "TOTAL SWAP:", memoryInfo.getMemoryStat("summary.total-swap")));
            } else {
                Locale locale = Locale.US;
                sb.append(String.format(locale, "%21s %8s\n", "Java Heap:", "~ " + memoryInfo.dalvikPrivateDirty));
                sb.append(String.format(Locale.US, "%21s %8s\n", "Native Heap:", String.valueOf(memoryInfo.nativePrivateDirty)));
                Locale locale2 = Locale.US;
                sb.append(String.format(locale2, "%21s %8s\n", "Private Other:", "~ " + memoryInfo.otherPrivateDirty));
                if (Build.VERSION.SDK_INT >= 19) {
                    sb.append(String.format(Locale.US, "%21s %8s\n", "System:", String.valueOf((memoryInfo.getTotalPss() - memoryInfo.getTotalPrivateDirty()) - memoryInfo.getTotalPrivateClean())));
                } else {
                    Locale locale3 = Locale.US;
                    sb.append(String.format(locale3, "%21s %8s\n", "System:", "~ " + (memoryInfo.getTotalPss() - memoryInfo.getTotalPrivateDirty())));
                }
                sb.append(String.format(Locale.US, "%21s %8s\n", "TOTAL:", String.valueOf(memoryInfo.getTotalPss())));
            }
        } catch (Exception unused) {
        }
        return sb.toString();
    }

    public static String b(int i) {
        String str;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3d4c6c8def1c5e591e440310eff0dbd1", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3d4c6c8def1c5e591e440310eff0dbd1");
        }
        StringBuilder sb = new StringBuilder("open files:\n");
        try {
            File[] listFiles = new File("/proc/" + i + "/fd").listFiles(new FilenameFilter() { // from class: com.meituan.snare.t.3
                public static ChangeQuickRedirect a;

                @Override // java.io.FilenameFilter
                public final boolean accept(File file, String str2) {
                    Object[] objArr2 = {file, str2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9bb3419c9c0239921ea28b9c8a9f3b98", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9bb3419c9c0239921ea28b9c8a9f3b98")).booleanValue() : TextUtils.isDigitsOnly(str2);
                }
            });
            if (listFiles != null) {
                int i2 = 0;
                for (File file : listFiles) {
                    try {
                        str = file.getCanonicalPath();
                    } catch (Exception unused) {
                        str = null;
                    }
                    sb.append("    fd ");
                    sb.append(file.getName());
                    sb.append(": ");
                    if (TextUtils.isEmpty(str)) {
                        str = "???";
                    }
                    sb.append(str);
                    sb.append('\n');
                    i2++;
                    if (i2 > 1024) {
                        break;
                    }
                }
                if (listFiles.length > 1024) {
                    sb.append("    ......\n");
                }
                sb.append("    (number of FDs: ");
                sb.append(listFiles.length);
                sb.append(")\n");
            }
        } catch (Exception unused2) {
        }
        sb.append('\n');
        return sb.toString();
    }

    public static String a(Thread thread, int i) {
        Object[] objArr = {thread, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6ced225cf47f1ab327d120bb0fc78b9a", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6ced225cf47f1ab327d120bb0fc78b9a");
        }
        StringBuilder sb = new StringBuilder();
        Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
        int i2 = 0;
        int i3 = 0;
        for (Map.Entry<Thread, StackTraceElement[]> entry : allStackTraces.entrySet()) {
            Thread key = entry.getKey();
            StackTraceElement[] value = entry.getValue();
            if (!key.getName().equals(thread.getName())) {
                if (i <= 0 || i2 < i) {
                    sb.append("\n");
                    sb.append("tid: ");
                    sb.append(key.getId());
                    sb.append(", name: ");
                    sb.append(key.getName());
                    sb.append("\n");
                    sb.append("\n");
                    sb.append("java stacktrace:\n");
                    for (StackTraceElement stackTraceElement : value) {
                        sb.append("    at ");
                        sb.append(stackTraceElement.toString());
                        sb.append("\n");
                    }
                    sb.append("\n");
                    i2++;
                } else {
                    i3++;
                }
            }
        }
        if (allStackTraces.size() > 1) {
            sb.append("total JVM threads (exclude the crashed thread): ");
            sb.append(allStackTraces.size() - 1);
            sb.append("\n");
            if (i > 0) {
                sb.append("JVM threads ignored by max count limit: ");
                sb.append(i3);
                sb.append("\n");
            }
            sb.append("dumped JVM threads:");
            sb.append(i2);
            sb.append("\n");
        }
        return sb.toString();
    }
}

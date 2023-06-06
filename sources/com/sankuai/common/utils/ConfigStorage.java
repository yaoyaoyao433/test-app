package com.sankuai.common.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class ConfigStorage {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static Map<String, String> sConfig;
    private static ArrayList<OnConfigChangeListener> sListeners = new ArrayList<>();

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface OnConfigChangeListener {
        void onChanged();
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0047, code lost:
        if (com.sankuai.common.utils.ConfigStorage.sConfig.equals(r13) == false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized void putConfig(java.util.Map<java.lang.String, java.lang.String> r13) {
        /*
            java.lang.Class<com.sankuai.common.utils.ConfigStorage> r0 = com.sankuai.common.utils.ConfigStorage.class
            monitor-enter(r0)
            r1 = 1
            java.lang.Object[] r9 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L85
            r10 = 0
            r9[r10] = r13     // Catch: java.lang.Throwable -> L85
            com.meituan.robust.ChangeQuickRedirect r11 = com.sankuai.common.utils.ConfigStorage.changeQuickRedirect     // Catch: java.lang.Throwable -> L85
            java.lang.String r12 = "c05f2e81a31aadeaa915db1976bd0a7a"
            r3 = 0
            r5 = 1
            r7 = 4611686018427387904(0x4000000000000000, double:2.0)
            r2 = r9
            r4 = r11
            r6 = r12
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L85
            r3 = 0
            if (r2 == 0) goto L20
            com.meituan.robust.PatchProxy.accessDispatch(r9, r3, r11, r1, r12)     // Catch: java.lang.Throwable -> L85
            monitor-exit(r0)
            return
        L20:
            java.util.Map<java.lang.String, java.lang.String> r2 = com.sankuai.common.utils.ConfigStorage.sConfig     // Catch: java.lang.Throwable -> L85
            if (r2 == r13) goto L83
            java.util.ArrayList<com.sankuai.common.utils.ConfigStorage$OnConfigChangeListener> r2 = com.sankuai.common.utils.ConfigStorage.sListeners     // Catch: java.lang.Throwable -> L85
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L85
            java.util.ArrayList<com.sankuai.common.utils.ConfigStorage$OnConfigChangeListener> r4 = com.sankuai.common.utils.ConfigStorage.sListeners     // Catch: java.lang.Throwable -> L80
            boolean r4 = r4.isEmpty()     // Catch: java.lang.Throwable -> L80
            r4 = r4 ^ r1
            if (r4 == 0) goto L37
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L80
            java.util.ArrayList<com.sankuai.common.utils.ConfigStorage$OnConfigChangeListener> r5 = com.sankuai.common.utils.ConfigStorage.sListeners     // Catch: java.lang.Throwable -> L80
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L80
        L37:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L80
            if (r4 == 0) goto L4a
            if (r13 == 0) goto L49
            java.util.Map<java.lang.String, java.lang.String> r2 = com.sankuai.common.utils.ConfigStorage.sConfig     // Catch: java.lang.Throwable -> L85
            if (r2 != 0) goto L41
            goto L49
        L41:
            java.util.Map<java.lang.String, java.lang.String> r2 = com.sankuai.common.utils.ConfigStorage.sConfig     // Catch: java.lang.Throwable -> L85
            boolean r2 = r2.equals(r13)     // Catch: java.lang.Throwable -> L85
            if (r2 != 0) goto L4a
        L49:
            r10 = 1
        L4a:
            com.sankuai.common.utils.ConfigStorage.sConfig = r13     // Catch: java.lang.Throwable -> L85
            if (r10 == 0) goto L83
            android.os.Looper r13 = android.os.Looper.getMainLooper()     // Catch: java.lang.Throwable -> L85
            android.os.Looper r1 = android.os.Looper.myLooper()     // Catch: java.lang.Throwable -> L85
            if (r13 != r1) goto L6e
            java.util.Iterator r13 = r3.iterator()     // Catch: java.lang.Throwable -> L85
        L5c:
            boolean r1 = r13.hasNext()     // Catch: java.lang.Throwable -> L85
            if (r1 == 0) goto L6c
            java.lang.Object r1 = r13.next()     // Catch: java.lang.Throwable -> L85
            com.sankuai.common.utils.ConfigStorage$OnConfigChangeListener r1 = (com.sankuai.common.utils.ConfigStorage.OnConfigChangeListener) r1     // Catch: java.lang.Throwable -> L85
            r1.onChanged()     // Catch: java.lang.Throwable -> L85
            goto L5c
        L6c:
            monitor-exit(r0)
            return
        L6e:
            android.os.Handler r13 = new android.os.Handler     // Catch: java.lang.Throwable -> L85
            android.os.Looper r1 = android.os.Looper.getMainLooper()     // Catch: java.lang.Throwable -> L85
            r13.<init>(r1)     // Catch: java.lang.Throwable -> L85
            com.sankuai.common.utils.ConfigStorage$1 r1 = new com.sankuai.common.utils.ConfigStorage$1     // Catch: java.lang.Throwable -> L85
            r1.<init>()     // Catch: java.lang.Throwable -> L85
            r13.post(r1)     // Catch: java.lang.Throwable -> L85
            goto L83
        L80:
            r13 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L80
            throw r13     // Catch: java.lang.Throwable -> L85
        L83:
            monitor-exit(r0)
            return
        L85:
            r13 = move-exception
            monitor-exit(r0)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.common.utils.ConfigStorage.putConfig(java.util.Map):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void notifyListeners() {
        ArrayList arrayList;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3f6bd7cd28db51fc94acf1c22ccffb4f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3f6bd7cd28db51fc94acf1c22ccffb4f");
            return;
        }
        synchronized (sListeners) {
            arrayList = new ArrayList(sListeners);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((OnConfigChangeListener) it.next()).onChanged();
        }
    }

    public static synchronized Map<String, String> getConfig() {
        Map<String, String> map;
        synchronized (ConfigStorage.class) {
            map = sConfig;
        }
        return map;
    }

    public static synchronized String getConfigForKey(String str, String str2) {
        synchronized (ConfigStorage.class) {
            Object[] objArr = {str, str2};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7cc67983fda342c88439344092fdec79", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7cc67983fda342c88439344092fdec79");
            } else if (sConfig == null || !sConfig.containsKey(str)) {
                return str2;
            } else {
                return sConfig.get(str);
            }
        }
    }

    public static void registerOnConfigChangeListener(OnConfigChangeListener onConfigChangeListener) {
        Object[] objArr = {onConfigChangeListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c6b80f003af5e587e98a85b84cb6b253", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c6b80f003af5e587e98a85b84cb6b253");
            return;
        }
        synchronized (sListeners) {
            sListeners.add(onConfigChangeListener);
        }
    }

    public static void unregisterOnConfigChangeListener(OnConfigChangeListener onConfigChangeListener) {
        Object[] objArr = {onConfigChangeListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5bf2fb548f57bef7ffc34ddbe4725e59", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5bf2fb548f57bef7ffc34ddbe4725e59");
            return;
        }
        synchronized (sListeners) {
            sListeners.remove(onConfigChangeListener);
        }
    }
}

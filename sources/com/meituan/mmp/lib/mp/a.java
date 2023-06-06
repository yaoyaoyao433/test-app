package com.meituan.mmp.lib.mp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.android.meituan.multiprocess.e;
import com.meituan.mmp.lib.mp.GlobalEngineMonitor;
import com.meituan.mmp.lib.router.AppBrandMonitor;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.ProcessUtils;
import com.sankuai.waimai.monitor.model.ErrorCode;
import java.io.PrintStream;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public enum a {
    MAIN(null, ErrorCode.ERROR_TYPE_M),
    STANDARD(":miniApp0", "0"),
    TASK_1(":miniApp1", "1"),
    TASK_2(":miniApp2", "2"),
    TASK_3(":miniApp3", "3");
    
    public static ChangeQuickRedirect a;
    private static String i;
    private static String j;
    private static a k;
    public final String g;
    private final String h;

    public static a valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "30aab8faccd6fd32d04ce32def3a84be", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "30aab8faccd6fd32d04ce32def3a84be") : (a) Enum.valueOf(a.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static a[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c8ce6e6411b2e53b35f5d5ded861afee", RobustBitConfig.DEFAULT_VALUE) ? (a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c8ce6e6411b2e53b35f5d5ded861afee") : (a[]) values().clone();
    }

    a(String str, String str2) {
        Object[] objArr = {r10, Integer.valueOf(r11), str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "10d2766a634ae69f4224132f32836eee", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "10d2766a634ae69f4224132f32836eee");
            return;
        }
        this.h = str;
        this.g = str2;
    }

    public final String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee7f385cf02b9fa492d712a3373d5d88", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee7f385cf02b9fa492d712a3373d5d88");
        }
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append(this.h != null ? this.h : "");
        return sb.toString();
    }

    public final String b() {
        return this.h == null ? "main" : this.h;
    }

    public final boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f92cf9278f1334a09d001700df9b155d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f92cf9278f1334a09d001700df9b155d")).booleanValue() : this == e();
    }

    public static void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "dc14ad7613d4ff8a9b696253c0d40344", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "dc14ad7613d4ff8a9b696253c0d40344");
        } else if (i == null) {
            i = context.getPackageName();
            PrintStream printStream = System.out;
            printStream.println("MMPProcess: init new process: " + d());
        }
    }

    public static String d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7f817e53ea4bc69922e53c42c6cd3e73", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7f817e53ea4bc69922e53c42c6cd3e73");
        }
        if (j == null) {
            j = ProcessUtils.getCurrentProcessName();
        }
        return j;
    }

    @Nullable
    public static a e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "59d773d987a0cc10a295c1d9c458c77f", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "59d773d987a0cc10a295c1d9c458c77f");
        }
        if (k == null) {
            k = a(d());
        }
        return k;
    }

    public static boolean f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ce9faed40287bcdb4a4315fd2fee561d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ce9faed40287bcdb4a4315fd2fee561d")).booleanValue() : MAIN.c();
    }

    @Nullable
    public static a a(String str) {
        a[] valuesCustom;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a1363bcd3b0e08981e70d05f06d29e9f", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a1363bcd3b0e08981e70d05f06d29e9f");
        }
        for (a aVar : valuesCustom()) {
            if (aVar.a().equals(str)) {
                return aVar;
            }
        }
        return null;
    }

    public static void a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "18fb15a8859ef75877d281ea6cf09198", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "18fb15a8859ef75877d281ea6cf09198");
        } else if (aVar == null || aVar.c()) {
        } else {
            e.a("mmp_" + aVar.a());
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.mmp.lib.mp.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public enum EnumC0420a {
        NOT_RUNNING,
        EMPTY,
        ENGINE_ONLY,
        ACTIVITY_RUNNING;
        
        public static ChangeQuickRedirect a;

        EnumC0420a() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "378c6d0ffec63a4d75553a0f3559378f", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "378c6d0ffec63a4d75553a0f3559378f");
            }
        }

        public static EnumC0420a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6714bc842463e14dc08ec0c558380857", RobustBitConfig.DEFAULT_VALUE) ? (EnumC0420a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6714bc842463e14dc08ec0c558380857") : (EnumC0420a) Enum.valueOf(EnumC0420a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static EnumC0420a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "60c392daa336bc63fea76732e614d37b", RobustBitConfig.DEFAULT_VALUE) ? (EnumC0420a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "60c392daa336bc63fea76732e614d37b") : (EnumC0420a[]) values().clone();
        }
    }

    @NonNull
    private static Map<a, EnumC0420a> g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7c2174333f3ef8363fa4a33acf1e3fca", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7c2174333f3ef8363fa4a33acf1e3fca");
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (a aVar : valuesCustom()) {
            linkedHashMap.put(aVar, EnumC0420a.NOT_RUNNING);
        }
        for (a aVar2 : b.a()) {
            linkedHashMap.put(aVar2, EnumC0420a.EMPTY);
        }
        for (GlobalEngineMonitor.AppEngineRecord appEngineRecord : GlobalEngineMonitor.a().a((String) null)) {
            linkedHashMap.put(appEngineRecord.d, EnumC0420a.ENGINE_ONLY);
        }
        AppBrandMonitor appBrandMonitor = AppBrandMonitor.e;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = AppBrandMonitor.a;
        for (AppBrandMonitor.ActivityRecord activityRecord : PatchProxy.isSupport(objArr2, appBrandMonitor, changeQuickRedirect2, false, "028f8f166b1a29ed019b980beff56046", RobustBitConfig.DEFAULT_VALUE) ? (Collection) PatchProxy.accessDispatch(objArr2, appBrandMonitor, changeQuickRedirect2, false, "028f8f166b1a29ed019b980beff56046") : Collections.unmodifiableList(appBrandMonitor.c)) {
            linkedHashMap.put(activityRecord.b(), EnumC0420a.ACTIVITY_RUNNING);
        }
        return linkedHashMap;
    }

    @NonNull
    public static Map<EnumC0420a, Set<a>> a(@NonNull Set<a> set) {
        Object[] objArr = {set};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "998cf2473b26bb35132772349d94ec42", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "998cf2473b26bb35132772349d94ec42");
        }
        HashMap hashMap = new HashMap();
        for (EnumC0420a enumC0420a : EnumC0420a.valuesCustom()) {
            hashMap.put(enumC0420a, new HashSet());
        }
        for (Map.Entry<a, EnumC0420a> entry : g().entrySet()) {
            if (set.contains(entry.getKey())) {
                ((Set) hashMap.get(entry.getValue())).add(entry.getKey());
            }
        }
        return hashMap;
    }
}

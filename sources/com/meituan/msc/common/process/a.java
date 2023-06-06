package com.meituan.msc.common.process;

import android.content.Context;
import android.support.annotation.Nullable;
import com.meituan.msc.modules.reporter.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.ProcessUtils;
import com.sankuai.waimai.monitor.model.ErrorCode;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public enum a {
    MAIN(null, ErrorCode.ERROR_TYPE_M),
    STANDARD(":mscMiniApp0", "0"),
    TASK_1(":mscMiniApp1", "1"),
    TASK_2(":mscMiniApp2", "2"),
    TASK_3(":mscMiniApp3", "3");
    
    public static ChangeQuickRedirect a;
    private static String i;
    private static String j;
    private static a k;
    public final String g;
    public final String h;

    public static a valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "66ab1fdb098c5056b6edf010ae8f3786", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "66ab1fdb098c5056b6edf010ae8f3786") : (a) Enum.valueOf(a.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static a[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7302461b4319d357a4e7243a9d315503", RobustBitConfig.DEFAULT_VALUE) ? (a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7302461b4319d357a4e7243a9d315503") : (a[]) values().clone();
    }

    a(String str, String str2) {
        Object[] objArr = {r10, Integer.valueOf(r11), str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1464bf8c2eda211cec992628e69c10d6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1464bf8c2eda211cec992628e69c10d6");
            return;
        }
        this.g = str;
        this.h = str2;
    }

    public static String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e40a1153a335dba87cbc94ae69098196", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e40a1153a335dba87cbc94ae69098196");
        }
        a e = e();
        return e == null ? "" : e.h;
    }

    public final String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e48d29d87b22a99dc47e20ec6d633e65", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e48d29d87b22a99dc47e20ec6d633e65");
        }
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append(this.g != null ? this.g : "");
        return sb.toString();
    }

    public final boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b395cde2273b6ae246950e8fb767f4b9", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b395cde2273b6ae246950e8fb767f4b9")).booleanValue() : this == e();
    }

    public static void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fd46b70e1b8792db641a226eb458322b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fd46b70e1b8792db641a226eb458322b");
        } else if (i == null) {
            i = context.getPackageName();
            g.b("MMPProcess: init new process: " + d());
        }
    }

    public static String d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c01b21aeff8c6ba4ec042bb792f5f87a", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c01b21aeff8c6ba4ec042bb792f5f87a");
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
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "17d343a6d3cd054b34e0511cd15096a0", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "17d343a6d3cd054b34e0511cd15096a0");
        }
        if (k == null) {
            k = a(d());
        }
        return k;
    }

    public static boolean f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "288f01cd86ac6af3096507c4f8504ef3", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "288f01cd86ac6af3096507c4f8504ef3")).booleanValue() : MAIN.c();
    }

    @Nullable
    public static a a(String str) {
        a[] valuesCustom;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f0aee340fa8990410bd1b4689736ba7b", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f0aee340fa8990410bd1b4689736ba7b");
        }
        for (a aVar : valuesCustom()) {
            if (aVar.b().equals(str)) {
                return aVar;
            }
        }
        return null;
    }
}

package com.sankuai.shangou.stone.util;

import android.content.Context;
import android.support.annotation.NonNull;
import com.meituan.android.cipstorage.ag;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.util.HashSet;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class r {
    public static ChangeQuickRedirect a;
    public com.meituan.android.cipstorage.u b;
    private String c;
    private int d;

    private r(@NonNull String str, int i, com.meituan.android.cipstorage.u uVar) {
        Object[] objArr = {str, 1, uVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ad81bcfebd91c67c47b39b68c85be6b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ad81bcfebd91c67c47b39b68c85be6b");
            return;
        }
        this.b = uVar;
        this.d = 1;
        this.c = str;
    }

    public r(@NonNull String str) {
        this(str, 1, com.meituan.android.cipstorage.u.e);
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "45f07d6fde352d78131f67a3c99eafc0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "45f07d6fde352d78131f67a3c99eafc0");
        }
    }

    public final com.meituan.android.cipstorage.q a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "45b899874988792ef0dc7a370bbd9a16", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.cipstorage.q) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "45b899874988792ef0dc7a370bbd9a16") : com.meituan.android.cipstorage.q.a(context, this.c, this.d);
    }

    public final <T> void a(Context context, String str, T t, ag<T> agVar) {
        Object[] objArr = {context, str, t, agVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a425d9acaa76527585937d0f3c472494", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a425d9acaa76527585937d0f3c472494");
        } else {
            a(context).a(str, (String) t, (ag<String>) agVar, this.b);
        }
    }

    public final void a(Context context, String str, long j) {
        Object[] objArr = {context, str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e52baf7fdefff6879f294cf8f36c445", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e52baf7fdefff6879f294cf8f36c445");
        } else if (context == null) {
            a();
        } else {
            a(context).a(str, j, this.b);
        }
    }

    public final long b(Context context, String str, long j) {
        Object[] objArr = {context, str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7cd2c1ec28fa6c0e6f51fbf14c7b2ab6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7cd2c1ec28fa6c0e6f51fbf14c7b2ab6")).longValue();
        }
        if (context == null) {
            a();
            return j;
        }
        return a(context).b(str, j, this.b);
    }

    public final void a(Context context, String str, boolean z) {
        Object[] objArr = {context, str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "808d4201a27c2c3a7070e30b35e4a6df", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "808d4201a27c2c3a7070e30b35e4a6df");
        } else if (context == null) {
            a();
        } else {
            a(context).a(str, z, this.b);
        }
    }

    public final boolean b(Context context, String str, boolean z) {
        Object[] objArr = {context, str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fbbed3b7cbc8be60844adc10ded79d18", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fbbed3b7cbc8be60844adc10ded79d18")).booleanValue();
        }
        if (context == null) {
            a();
            return z;
        }
        return a(context).b(str, z, this.b);
    }

    public final void a(Context context, String str, String str2) {
        Object[] objArr = {context, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1263fd432d090c292409dd03ea333262", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1263fd432d090c292409dd03ea333262");
        } else if (context == null) {
            a();
        } else {
            a(context).a(str, str2, this.b);
        }
    }

    public final String b(Context context, String str, String str2) {
        Object[] objArr = {context, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b12bcab04704b7fb4c609df822eac5ce", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b12bcab04704b7fb4c609df822eac5ce");
        }
        if (context == null) {
            a();
            return str2;
        }
        return a(context).b(str, str2, this.b);
    }

    public final void a(Context context, String str, int i) {
        Object[] objArr = {context, str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "661a8eab9c414e73436e3cb77bbfd5d1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "661a8eab9c414e73436e3cb77bbfd5d1");
        } else if (context == null) {
            a();
        } else {
            a(context).a(str, i, this.b);
        }
    }

    public final int b(Context context, String str, int i) {
        Object[] objArr = {context, str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "092298111333b40f97dff6d51c52d28f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "092298111333b40f97dff6d51c52d28f")).intValue();
        }
        if (context == null) {
            a();
            return i;
        }
        return a(context).b(str, i, this.b);
    }

    public final HashSet<String> a(Context context, String str, HashSet<String> hashSet) {
        Object[] objArr = {context, str, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc090094b7e2295db8c36bb8a6b8929a", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashSet) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc090094b7e2295db8c36bb8a6b8929a");
        }
        if (context == null) {
            a();
            return null;
        }
        Set<String> b = a(context).b(str, (Set<String>) null, this.b);
        if (b == null) {
            return null;
        }
        return new HashSet<>(b);
    }

    public final void b(Context context, String str, HashSet<String> hashSet) {
        Object[] objArr = {context, str, hashSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "02b610fb7bac823a04633406b4a6c60e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "02b610fb7bac823a04633406b4a6c60e");
        } else if (context == null) {
            a();
        } else {
            a(context).a(str, hashSet, this.b);
        }
    }

    public static File c(Context context, String str, String str2) {
        Object[] objArr = {context, str, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "85f05c888f8ad2e0048c0e38c077322f", RobustBitConfig.DEFAULT_VALUE) ? (File) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "85f05c888f8ad2e0048c0e38c077322f") : com.meituan.android.cipstorage.q.a(context, str, (String) null);
    }

    public static File a(Context context, String str, String str2, com.meituan.android.cipstorage.u uVar) {
        Object[] objArr = {context, str, str2, uVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a066a267991fa0f66309fbfb1bba8ad1", RobustBitConfig.DEFAULT_VALUE) ? (File) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a066a267991fa0f66309fbfb1bba8ad1") : com.meituan.android.cipstorage.q.a(context, str, str2, uVar);
    }

    public static void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d5f75e2ebc832a035c8252de4eee7211", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d5f75e2ebc832a035c8252de4eee7211");
        } else {
            com.sankuai.shangou.stone.util.log.a.c("SGCIPStorage", "%s", "CIUtil context is null");
        }
    }
}

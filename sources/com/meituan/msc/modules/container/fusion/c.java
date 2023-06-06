package com.meituan.msc.modules.container.fusion;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.msc.modules.container.MSCActivity;
import com.meituan.msc.modules.reporter.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class c {
    public static ChangeQuickRedirect a;
    public static final List<a> b = new CopyOnWriteArrayList();
    public static a c = null;
    public static final Map<a, Intent> d = new ConcurrentHashMap();

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        public String b;
        public WeakReference<MSCActivity> c;
        public int d;
        public boolean e;

        @Nullable
        public final MSCActivity a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5f7a1f205d722663e830d06f586a2b3d", RobustBitConfig.DEFAULT_VALUE) ? (MSCActivity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5f7a1f205d722663e830d06f586a2b3d") : this.c.get();
        }
    }

    public static void a(@NonNull Activity activity, int i) {
        Object[] objArr = {activity, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1c206257422b8c139cd4a1a4575ae698", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1c206257422b8c139cd4a1a4575ae698");
        } else if (activity != null && MSCActivity.class.isAssignableFrom(activity.getClass())) {
            for (a aVar : b) {
                if (aVar.d == i) {
                    c = aVar;
                    return;
                }
            }
        }
    }

    public static String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0009f3b88946361e0ce002c6fa750b33", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0009f3b88946361e0ce002c6fa750b33");
        }
        Object[] objArr2 = new Object[1];
        StringBuilder sb = new StringBuilder(StringUtil.SPACE);
        sb.append(c != null ? c.b : null);
        objArr2[0] = sb.toString();
        g.d("getCurrentForegroundAppIdInThisProcess", objArr2);
        if (c != null) {
            return c.b;
        }
        return null;
    }

    public static void a(@NonNull MSCActivity mSCActivity, String str, int i, boolean z) {
        Object[] objArr = {mSCActivity, str, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4de317c57f2834e3c9b3f1e053d9b062", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4de317c57f2834e3c9b3f1e053d9b062");
            return;
        }
        a aVar = new a();
        aVar.c = new WeakReference<>(mSCActivity);
        aVar.b = str;
        aVar.d = i;
        b.add(aVar);
    }

    @SuppressLint({"Iterator"})
    public static void a(@NonNull MSCActivity mSCActivity, int i) {
        Object[] objArr = {mSCActivity, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e32c4eedcb23a292ca6b31678c479ad4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e32c4eedcb23a292ca6b31678c479ad4");
        } else if (mSCActivity.isFinishing()) {
            for (a aVar : b) {
                if (aVar.d == i) {
                    b.remove(aVar);
                    if (c == aVar) {
                        c = null;
                        return;
                    }
                    return;
                }
            }
        }
    }

    public static boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "474c59f1e4e0bddf3f101ac518223f81", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "474c59f1e4e0bddf3f101ac518223f81")).booleanValue() : b(str) > 0;
    }

    public static int b(String str) {
        int i = 0;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0907bf390824973d2b0096318b43ee60", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0907bf390824973d2b0096318b43ee60")).intValue();
        }
        for (a aVar : b) {
            if (TextUtils.equals(str, aVar.b)) {
                i++;
            }
        }
        return i;
    }

    public static Intent a(MSCActivity mSCActivity) {
        Object[] objArr = {mSCActivity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "13aa4648f78b6e2556118da7642b8178", RobustBitConfig.DEFAULT_VALUE)) {
            return (Intent) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "13aa4648f78b6e2556118da7642b8178");
        }
        for (Map.Entry<a, Intent> entry : d.entrySet()) {
            if (entry.getKey().d == mSCActivity.p()) {
                d.remove(entry.getKey());
                return entry.getValue();
            }
        }
        return null;
    }

    public static boolean a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4c0203101c2640fd155059eabe44f171", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4c0203101c2640fd155059eabe44f171")).booleanValue();
        }
        for (a aVar : d.keySet()) {
            if (aVar.d == i && aVar.e) {
                return true;
            }
        }
        return false;
    }

    public static void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1a75a32dc08b8698b9565bbf52c0e9b0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1a75a32dc08b8698b9565bbf52c0e9b0");
            return;
        }
        for (a aVar : d.keySet()) {
            if (aVar.d == i) {
                d.remove(aVar);
            }
        }
    }
}

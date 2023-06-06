package com.meituan.mmp.main.fusion;

import android.arch.lifecycle.d;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.mmp.lib.HeraActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
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
    public static final Map<a, Intent> c = new ConcurrentHashMap();

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        public String b;
        public WeakReference<HeraActivity> c;
        public int d;
        public boolean e;

        @Nullable
        public final HeraActivity a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d60718dbef37d7e4b999478d3372ed1f", RobustBitConfig.DEFAULT_VALUE) ? (HeraActivity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d60718dbef37d7e4b999478d3372ed1f") : this.c.get();
        }
    }

    public static void a(@NonNull HeraActivity heraActivity, String str, int i, boolean z) {
        Object[] objArr = {heraActivity, str, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fbdc124299bc8318d0b734f23ffab1e3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fbdc124299bc8318d0b734f23ffab1e3");
            return;
        }
        a aVar = new a();
        aVar.c = new WeakReference<>(heraActivity);
        aVar.b = str;
        aVar.d = i;
        b.add(aVar);
    }

    public static void a(@NonNull HeraActivity heraActivity, int i) {
        Object[] objArr = {heraActivity, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "199403050c4a4fdf6907c14f012081a7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "199403050c4a4fdf6907c14f012081a7");
        } else if (heraActivity.isFinishing()) {
            for (a aVar : b) {
                if (aVar.d == i) {
                    b.remove(aVar);
                    return;
                }
            }
        }
    }

    public static boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7eb4e7b15f4b58fe0b606f7fdd68023f", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7eb4e7b15f4b58fe0b606f7fdd68023f")).booleanValue() : b(str) > 0;
    }

    public static int b(String str) {
        int i = 0;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c0ebc404f5acadfd802a096ff0974162", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c0ebc404f5acadfd802a096ff0974162")).intValue();
        }
        for (a aVar : b) {
            if (TextUtils.equals(str, aVar.b)) {
                i++;
            }
        }
        return i;
    }

    public static boolean c(String str) {
        HeraActivity a2;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "032f6b3094acb0a1257fb00dd85d417f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "032f6b3094acb0a1257fb00dd85d417f")).booleanValue();
        }
        for (a aVar : b) {
            if (TextUtils.equals(str, aVar.b) && (a2 = aVar.a()) != null && a2.getLifecycle().a().a(d.b.RESUMED)) {
                return true;
            }
        }
        return false;
    }

    public static Intent a(HeraActivity heraActivity) {
        Object[] objArr = {heraActivity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a4186bcb15452afa720f7040ec309fcc", RobustBitConfig.DEFAULT_VALUE)) {
            return (Intent) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a4186bcb15452afa720f7040ec309fcc");
        }
        for (Map.Entry<a, Intent> entry : c.entrySet()) {
            if (entry.getKey().d == heraActivity.i()) {
                c.remove(entry.getKey());
                return entry.getValue();
            }
        }
        return null;
    }

    public static boolean a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ce04ce6c065ce12e8de29ce80da35d66", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ce04ce6c065ce12e8de29ce80da35d66")).booleanValue();
        }
        for (a aVar : c.keySet()) {
            if (aVar.d == i && aVar.e) {
                return true;
            }
        }
        return false;
    }

    public static void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a6aba3f65fac4d185d6728a77c28b62b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a6aba3f65fac4d185d6728a77c28b62b");
            return;
        }
        for (a aVar : c.keySet()) {
            if (aVar.d == i) {
                c.remove(aVar);
            }
        }
    }
}

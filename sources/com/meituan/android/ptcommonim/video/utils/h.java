package com.meituan.android.ptcommonim.video.utils;

import android.app.Activity;
import android.util.Pair;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.LinkedHashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class h {
    public static ChangeQuickRedirect a;

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c273142f4540ef315ee950c27a02a6e0", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c273142f4540ef315ee950c27a02a6e0") : new a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Activity activity, Map<String, Pair<String, Runnable>> map, Runnable runnable) {
        Object[] objArr = {activity, map, runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "107fee1f95f3beb309b75e047b43e2ad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "107fee1f95f3beb309b75e047b43e2ad");
            return;
        }
        com.meituan.android.privacy.interfaces.e createPermissionGuard = Privacy.createPermissionGuard();
        if (createPermissionGuard == null) {
            return;
        }
        if (map == null || map.isEmpty()) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        String next = map.keySet().iterator().next();
        Pair<String, Runnable> remove = map.remove(next);
        if (remove == null) {
            a(activity, map, runnable);
        } else if (createPermissionGuard.a(activity, next, (String) remove.first) > 0) {
            a(activity, map, runnable);
        } else {
            String str = (String) remove.first;
            Object[] objArr2 = {remove, activity, map, runnable};
            ChangeQuickRedirect changeQuickRedirect2 = i.a;
            createPermissionGuard.a(activity, next, str, PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "9a26fa2d4be8679c32deadb47847a18e", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.privacy.interfaces.d) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "9a26fa2d4be8679c32deadb47847a18e") : new i(remove, activity, map, runnable));
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static final class a {
        public static ChangeQuickRedirect a;
        public Runnable b;
        private Map<String, Pair<String, Runnable>> c;

        public a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ad27ae606a89f6c1a5cecacd4fb9bad", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ad27ae606a89f6c1a5cecacd4fb9bad");
            } else {
                this.c = new LinkedHashMap();
            }
        }

        public final a a(String str, String str2, Runnable runnable) {
            Object[] objArr = {str, str2, runnable};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e4c58b96a1d3bf4985462845c168d2c6", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e4c58b96a1d3bf4985462845c168d2c6");
            }
            this.c.put(str, Pair.create(str2, runnable));
            return this;
        }

        public final void a(Activity activity) {
            Object[] objArr = {activity};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "22e5554b7b9ab22aeab3269a5447c0f2", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "22e5554b7b9ab22aeab3269a5447c0f2");
            } else {
                h.a(activity, this.c, this.b);
            }
        }
    }
}

package com.meituan.mmp.lib.router;

import android.content.SharedPreferences;
import android.support.annotation.Nullable;
import com.meituan.android.common.horn.Horn;
import com.meituan.android.common.horn.HornCallback;
import com.meituan.mmp.lib.DebugHelper;
import com.meituan.mmp.lib.utils.ac;
import com.meituan.mmp.main.MMPEnvHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class c {
    public static ChangeQuickRedirect a = null;
    public static volatile boolean b = false;
    public static volatile boolean d = b;
    public static volatile boolean c = true;
    public static volatile boolean e = c;
    public static final Set<String> f = new CopyOnWriteArraySet();
    public static final Set<String> g = new CopyOnWriteArraySet();

    public static void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ae3634a1c31900314593cf66d20a5dc1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ae3634a1c31900314593cf66d20a5dc1");
        } else {
            Horn.register("mmp_multi", new HornCallback() { // from class: com.meituan.mmp.lib.router.c.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.common.horn.HornCallback
                public final void onChanged(boolean z, String str) {
                    Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "128f98662910d527a2262f7a6a4119ba", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "128f98662910d527a2262f7a6a4119ba");
                    } else if (z) {
                        try {
                            JSONObject jSONObject = new JSONObject(str);
                            com.meituan.mmp.lib.trace.b.b("MMPHornAppBrandConfig", "mmp_multi: " + jSONObject);
                            c.a(jSONObject.optBoolean("open_multi_appbrand", c.b), jSONObject.optBoolean("default_enable_multi_appbrand", c.c), ac.a(jSONObject.optJSONArray("force_enable_multi_appbrand_apps")), ac.a(jSONObject.optJSONArray("force_disable_multi_appbrand_apps")));
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                    }
                }
            });
        }
    }

    public static void a(boolean z, boolean z2, Set<String> set, Set<String> set2) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), set, set2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c904fb4c7be17b35425397b03a0d612e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c904fb4c7be17b35425397b03a0d612e");
            return;
        }
        SharedPreferences.Editor edit = MMPEnvHelper.getSharedPreferences(MMPEnvHelper.getEnvInfo().getApplicationContext(), "key_mutl_cfg").edit();
        edit.putBoolean("key_mutl_cfg", z);
        edit.putBoolean("default_enable_multi_app_brand", z2);
        edit.putStringSet("force_enable_multi_app_brand_apps", set);
        edit.putStringSet("default_enable_multi_app_brand_apps", set2);
        edit.apply();
        d = z;
        e = z2;
        f.clear();
        f.addAll(set);
        g.clear();
        g.addAll(set2);
    }

    public static void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "055240256e05f77a7cfb0bbef121d1d4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "055240256e05f77a7cfb0bbef121d1d4");
            return;
        }
        SharedPreferences sharedPreferences = MMPEnvHelper.getSharedPreferences(MMPEnvHelper.getEnvInfo().getApplicationContext(), "key_mutl_cfg");
        d = sharedPreferences.getBoolean("key_mutl_cfg", b);
        e = sharedPreferences.getBoolean("default_enable_multi_app_brand", c);
        Set<String> stringSet = sharedPreferences.getStringSet("force_enable_multi_app_brand_apps", null);
        if (stringSet != null) {
            f.clear();
            f.addAll(stringSet);
        }
        Set<String> stringSet2 = sharedPreferences.getStringSet("default_enable_multi_app_brand_apps", null);
        if (stringSet2 != null) {
            g.clear();
            g.addAll(stringSet2);
        }
    }

    public static boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d27ced23686e0befb08509b181c02ad8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d27ced23686e0befb08509b181c02ad8")).booleanValue();
        }
        if (DebugHelper.k != null) {
            return DebugHelper.k.booleanValue();
        }
        return e;
    }

    @Nullable
    public static Boolean a(String str) {
        boolean z;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "25cb8ebbb86359d8e4ce956695c34bb6", RobustBitConfig.DEFAULT_VALUE)) {
            return (Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "25cb8ebbb86359d8e4ce956695c34bb6");
        }
        if (DebugHelper.k != null) {
            return DebugHelper.k;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "715a05ab57e18390d88646c5ac193087", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "715a05ab57e18390d88646c5ac193087")).booleanValue();
        } else if (DebugHelper.k != null) {
            z = DebugHelper.k.booleanValue();
        } else {
            z = d;
        }
        if (!z) {
            return Boolean.FALSE;
        }
        if (g.contains(str)) {
            return Boolean.FALSE;
        }
        if (f.contains(str)) {
            return Boolean.TRUE;
        }
        return null;
    }

    public static Boolean b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8b6932649529d55b86b22a056948c133", RobustBitConfig.DEFAULT_VALUE)) {
            return (Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8b6932649529d55b86b22a056948c133");
        }
        Boolean a2 = a(str);
        return a2 != null ? a2 : Boolean.valueOf(e);
    }
}

package com.meituan.msc.modules.engine;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.msc.extern.MSCEnvHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class l {
    public static ChangeQuickRedirect a;
    private static final Set<String> b = Collections.synchronizedSet(new LinkedHashSet());

    public static void a(final String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1d7e0681a2843e021b9ee19ce96a4ccf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1d7e0681a2843e021b9ee19ce96a4ccf");
        } else {
            com.meituan.msc.common.executor.a.b.submit(new Runnable() { // from class: com.meituan.msc.modules.engine.l.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "39feab61107a5a71686b10692039cd0f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "39feab61107a5a71686b10692039cd0f");
                    } else {
                        l.b(str);
                    }
                }
            });
        }
    }

    public static void b(String str) {
        String jSONArray;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "81d3a428df49788beaece47cbc0e9e58", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "81d3a428df49788beaece47cbc0e9e58");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            MSCEnvHelper.getSharedPreferences("mmp_recent_app").edit().putString("mmp_recent_app_appid", str).apply();
            SharedPreferences.Editor edit = MSCEnvHelper.getSharedPreferences("mmp_recent_app_list").edit();
            Object[] objArr2 = {str};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "35a36d9eb7bb26b25de7c35784018f06", RobustBitConfig.DEFAULT_VALUE)) {
                jSONArray = (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "35a36d9eb7bb26b25de7c35784018f06");
            } else {
                if (!b.add(str)) {
                    b.remove(str);
                    b.add(str);
                }
                jSONArray = new JSONArray((Collection) b).toString();
            }
            edit.putString("mmp_recent_app_appid_list", jSONArray).apply();
        }
    }

    @Nullable
    private static Set<String> b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a8978b1660d18157195205c3aa151c89", RobustBitConfig.DEFAULT_VALUE)) {
            return (Set) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a8978b1660d18157195205c3aa151c89");
        }
        String string = MSCEnvHelper.getSharedPreferences("mmp_recent_app_list").getString("mmp_recent_app_appid_list", null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            JSONArray jSONArray = new JSONArray(string);
            for (int i = 0; i < jSONArray.length(); i++) {
                b.add(jSONArray.getString(i));
            }
        } catch (Throwable th) {
            com.meituan.msc.modules.reporter.g.a("RecentMMPManager", th);
        }
        return b;
    }

    @NonNull
    public static List<String> a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "327530d2d95ab54bcacc390e890c9e46", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "327530d2d95ab54bcacc390e890c9e46");
        }
        Set<String> b2 = b();
        ArrayList arrayList = new ArrayList();
        if (b2 != null) {
            arrayList.addAll(b2);
        }
        int C = com.meituan.msc.common.config.b.C();
        return arrayList.size() <= C ? arrayList : arrayList.subList(arrayList.size() - C, arrayList.size());
    }

    public static void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "975b199de080a844c77481c64d907763", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "975b199de080a844c77481c64d907763");
        } else {
            MSCEnvHelper.getSharedPreferences(context.getApplicationContext(), "mmp_recent_app").edit().putBoolean("mmp_webview_init_error", true).apply();
        }
    }
}

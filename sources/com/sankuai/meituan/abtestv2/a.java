package com.sankuai.meituan.abtestv2;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.JsonStorage;
import com.sankuai.meituan.abtestv2.mode.ABTestStrategyBean;
import com.sankuai.meituan.retrofit2.raw.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a implements b {
    public static ChangeQuickRedirect a;
    private final List<Object> b;
    private a.InterfaceC0637a c;
    private Context d;
    private Map<String, ABTestStrategyBean> e;
    private boolean f;

    public a(Context context) {
        String loadJsonSync;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ea85f25510f697910b3c765c332d40e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ea85f25510f697910b3c765c332d40e");
            return;
        }
        this.b = new ArrayList();
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = false;
        if (context == null || !(context instanceof Application)) {
            throw new IllegalArgumentException("the context is null or not appcontext");
        }
        this.d = context;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cc6dd74835a85df8adc648dad383e059", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cc6dd74835a85df8adc648dad383e059");
            return;
        }
        String a2 = a();
        SharedPreferences sharedPreferences = this.d.getSharedPreferences("status", 0);
        String string = sharedPreferences.getString("pref_key_abtest_last_version", "");
        if (TextUtils.isEmpty(string) || !TextUtils.equals(string, a2)) {
            JsonStorage.saveJsonAsync(this.d, "base/abtestv2/ABTestImpl/isolate/abtest_client_isolate", "{}");
            JsonStorage.saveJsonAsync(this.d, "base/abtestv2/ABTestImpl/parall/abtest_client_parall", "{}");
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putString("pref_key_abtest_last_version", a2);
            edit.remove("pref_key_abtest_app_isolate");
            edit.apply();
        } else {
            this.f = sharedPreferences.getBoolean("pref_key_abtest_app_isolate", false);
            if (this.f) {
                loadJsonSync = JsonStorage.loadJsonSync(this.d, "base/abtestv2/ABTestImpl/isolate/abtest_client_isolate");
            } else {
                loadJsonSync = JsonStorage.loadJsonSync(this.d, "base/abtestv2/ABTestImpl/parall/abtest_client_parall");
            }
            if (!TextUtils.isEmpty(loadJsonSync)) {
                try {
                    this.e = (Map) com.meituan.android.turbo.a.a(com.meituan.android.turbo.b.a(Map.class, String.class, ABTestStrategyBean.class), loadJsonSync);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        if (this.e == null) {
            this.e = new HashMap();
        }
    }

    @Override // com.sankuai.meituan.abtestv2.b
    public final synchronized String a(String str) {
        int i = 0;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eac8df0abf33b3b21179d1436fe46eff", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eac8df0abf33b3b21179d1436fe46eff");
        }
        Context context = this.d;
        Object[] objArr2 = {context};
        ChangeQuickRedirect changeQuickRedirect2 = c.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "407694b8742c1cc7518104669c10cc77", RobustBitConfig.DEFAULT_VALUE)) {
            i = ((Integer) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "407694b8742c1cc7518104669c10cc77")).intValue();
        } else if (context != null) {
            i = context.getSharedPreferences("status", 0).getInt("abtestv2_setting_switcher_pref", 0);
        }
        if (i == 1) {
            return b(str);
        } else if (this.e == null || !this.e.containsKey(str)) {
            return null;
        } else {
            ABTestStrategyBean aBTestStrategyBean = this.e.get(str);
            if (aBTestStrategyBean != null) {
                return aBTestStrategyBean.strategyKey;
            }
            return null;
        }
    }

    private synchronized String b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f578470f1e0f1d6bf1933deb37d9592", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f578470f1e0f1d6bf1933deb37d9592");
        }
        Map<String, String> a2 = c.a(this.d);
        if (a2 != null) {
            return a2.get(str);
        }
        return null;
    }

    private String a() {
        PackageInfo packageInfo;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "374277077a4ffc26f1086e55b1621e6e", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "374277077a4ffc26f1086e55b1621e6e");
        }
        if (this.d == null) {
            return "";
        }
        try {
            packageInfo = this.d.getApplicationContext().getPackageManager().getPackageInfo(this.d.getPackageName(), 0);
        } catch (Exception unused) {
            packageInfo = null;
        }
        return packageInfo == null ? "" : packageInfo.versionName;
    }
}

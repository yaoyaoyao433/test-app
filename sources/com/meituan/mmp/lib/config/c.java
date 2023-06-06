package com.meituan.mmp.lib.config;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.meituan.android.common.horn.Horn;
import com.meituan.android.common.horn.HornCallback;
import com.meituan.android.common.locate.loader.LocationStrategy;
import com.meituan.mmp.main.MMPEnvHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class c {
    public static ChangeQuickRedirect a;
    public static final long b = TimeUnit.DAYS.toMillis(2);
    public SharedPreferences c;

    public static void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3475739267771b71c8a8b056eecb93b0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3475739267771b71c8a8b056eecb93b0");
            return;
        }
        com.meituan.mmp.lib.trace.b.b("mmp_cache", "registerHorn");
        Horn.register("mmp_cache", new HornCallback() { // from class: com.meituan.mmp.lib.config.c.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.common.horn.HornCallback
            public final void onChanged(boolean z, String str) {
                Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "812cde531e91acc99304249715dde034", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "812cde531e91acc99304249715dde034");
                    return;
                }
                c cVar = new c(MMPEnvHelper.getContext());
                com.meituan.mmp.lib.trace.b.b("mmp_cache", String.format("onChanged: %s", str));
                if (!z) {
                    cVar.a("{}");
                } else if (TextUtils.isEmpty(str)) {
                } else {
                    cVar.a(str);
                }
            }
        });
    }

    public c(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5369d159fba760cc8f06189183ca2b37", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5369d159fba760cc8f06189183ca2b37");
        } else {
            this.c = MMPEnvHelper.getSharedPreferences(context, "mmp_horn_config");
        }
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "097ec16e9ec8a4d2cefc632f56a59643", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "097ec16e9ec8a4d2cefc632f56a59643");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            SharedPreferences.Editor edit = this.c.edit();
            edit.clear();
            while (keys.hasNext()) {
                String next = keys.next();
                edit.putLong(next, jSONObject.optLong(next) * LocationStrategy.LOCATION_TIMEOUT);
            }
            edit.apply();
        } catch (JSONException unused) {
        }
    }
}

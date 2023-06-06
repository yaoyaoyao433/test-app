package com.meituan.msc.common.config;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.meituan.android.common.horn.Horn;
import com.meituan.android.common.horn.HornCallback;
import com.meituan.msc.extern.MSCEnvHelper;
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
    public static final long b = TimeUnit.DAYS.toSeconds(2);
    public SharedPreferences c;

    public static void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7caab969b7e24559a05746d1df90a02c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7caab969b7e24559a05746d1df90a02c");
        } else {
            Horn.register("msc_cache", new HornCallback() { // from class: com.meituan.msc.common.config.c.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.common.horn.HornCallback
                public final void onChanged(boolean z, String str) {
                    Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "eaf37b866d38c66d7bcc2afd06067bd3", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "eaf37b866d38c66d7bcc2afd06067bd3");
                        return;
                    }
                    c cVar = new c(MSCEnvHelper.getContext());
                    if (!z) {
                        cVar.a("{}");
                    } else if (TextUtils.isEmpty(str)) {
                    } else {
                        cVar.a(str);
                    }
                }
            });
        }
    }

    public c(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c5d5db100a117c7f4eb26506a6327b44", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c5d5db100a117c7f4eb26506a6327b44");
        } else {
            this.c = MSCEnvHelper.getSharedPreferences(context, "msc_horn_config");
        }
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cf3d2bc09bc3dd3b6971a320fad8b4c9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cf3d2bc09bc3dd3b6971a320fad8b4c9");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            SharedPreferences.Editor edit = this.c.edit();
            edit.clear();
            while (keys.hasNext()) {
                String next = keys.next();
                edit.putLong(next, jSONObject.optLong(next) * 60);
            }
            edit.apply();
        } catch (JSONException unused) {
        }
    }

    public final long b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "befa8129f22280888c587d9d8df82b77", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "befa8129f22280888c587d9d8df82b77")).longValue() : this.c.getLong(str, b);
    }
}

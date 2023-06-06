package com.meituan.android.common.locate.reporter;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public final class l {
    public static ChangeQuickRedirect changeQuickRedirect;
    public boolean a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;

    /* loaded from: classes2.dex */
    public static final class a {
        private static final l a = new l();
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    public l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "69a380eabdcd69061db1696262c2f8cd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "69a380eabdcd69061db1696262c2f8cd");
            return;
        }
        this.a = true;
        this.b = true;
        this.c = true;
        this.d = true;
        this.e = true;
        if (com.meituan.android.common.locate.provider.g.a() == null) {
            return;
        }
        String string = f.b(com.meituan.android.common.locate.provider.g.a().getApplicationContext()).getString("LatLng_passback", "");
        if (TextUtils.isEmpty(string)) {
            return;
        }
        try {
            a(new JSONObject(string));
        } catch (JSONException e) {
            com.meituan.android.common.locate.platform.logs.c.a("initIpcConfig exception:" + e.getMessage(), 3);
        }
    }

    public static l a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d5544321ac7f6bab2aec591f5e1fe529", RobustBitConfig.DEFAULT_VALUE) ? (l) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d5544321ac7f6bab2aec591f5e1fe529") : a.a;
    }

    public final void a(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6c791e6c5f734b619b11c9353154721e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6c791e6c5f734b619b11c9353154721e");
        } else if (jSONObject == null) {
        } else {
            try {
                this.a = jSONObject.optBoolean("latlng_passback_babel_filter", true);
                this.b = jSONObject.optBoolean("latlng_passback_logan_filter", true);
                this.c = jSONObject.optBoolean("latlng_passback_perception_filter", true);
                this.d = jSONObject.optBoolean("latlng_passback_network_filter", true);
                this.e = jSONObject.optBoolean("latlng_passback_others_filter", true);
            } catch (Exception e) {
                com.meituan.android.common.locate.platform.logs.c.a("parse LatlngPassbackConfig exception:" + e.getMessage(), 3);
            }
        }
    }
}

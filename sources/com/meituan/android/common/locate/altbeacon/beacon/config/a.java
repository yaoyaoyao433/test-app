package com.meituan.android.common.locate.altbeacon.beacon.config;

import android.text.TextUtils;
import com.meituan.android.common.locate.platform.logs.c;
import com.meituan.android.common.locate.provider.g;
import com.meituan.android.common.locate.reporter.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class a {
    public static ChangeQuickRedirect changeQuickRedirect;
    public boolean a;
    public long b;
    public boolean c;

    /* renamed from: com.meituan.android.common.locate.altbeacon.beacon.config.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0207a {
        private static final a a = new a();
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "751fc28af30e4e44543b14194b6a80f2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "751fc28af30e4e44543b14194b6a80f2");
            return;
        }
        this.a = false;
        this.b = 300000L;
        this.c = true;
        b();
    }

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1630259128c469a747e8ee6be4cb13f7", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1630259128c469a747e8ee6be4cb13f7") : C0207a.a;
    }

    private void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2efcd06a20d79fcd0577acb6728d0c7e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2efcd06a20d79fcd0577acb6728d0c7e");
        } else if (g.a() == null) {
        } else {
            String string = f.b(g.a().getApplicationContext()).getString("alt_beacon_horn_config", "");
            if (TextUtils.isEmpty(string)) {
                return;
            }
            try {
                a(new JSONObject(string));
            } catch (JSONException e) {
                c.a("AltBeaconConfig exception:" + e.getMessage(), 3);
            }
        }
    }

    public void a(JSONObject jSONObject) {
        boolean z = true;
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a757b90e45f2bbcf87c5974a7ed1aa65", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a757b90e45f2bbcf87c5974a7ed1aa65");
        } else if (jSONObject == null) {
        } else {
            try {
                if (jSONObject.has("alt_beacon_switch")) {
                    this.a = jSONObject.getInt("alt_beacon_switch") == 1;
                }
                if (jSONObject.has("alt_beacon_net_check_interval")) {
                    this.b = jSONObject.getLong("alt_beacon_net_check_interval");
                    if (this.b < 300000) {
                        this.b = 300000L;
                    }
                }
                if (jSONObject.has("alt_beacon_background_conf")) {
                    if (jSONObject.getInt("alt_beacon_background_conf") != 1) {
                        z = false;
                    }
                    this.c = z;
                }
            } catch (JSONException e) {
                c.a("AltBeaconConfig config exception:" + e.getMessage(), 3);
            }
        }
    }
}

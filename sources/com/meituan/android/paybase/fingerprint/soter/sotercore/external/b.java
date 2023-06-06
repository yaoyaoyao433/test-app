package com.meituan.android.paybase.fingerprint.soter.sotercore.external;

import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paybase.utils.v;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b {
    public static ChangeQuickRedirect a;
    public String b;
    public String c;
    private long d;
    private int e;
    private String f;
    private String g;

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "900c5b2bb127980d1d2d8935ecdb063f", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "900c5b2bb127980d1d2d8935ecdb063f");
        }
        return "SoterPubKeyModel{counter=" + this.d + ", uid=" + this.e + ", cpu_id='" + this.f + "', pub_key_in_x509='" + this.g + "', rawJson='" + this.b + "', signature='" + this.c + "'}";
    }

    public b(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a47fe3063ac1e93da3d41db97a26cae", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a47fe3063ac1e93da3d41db97a26cae");
            return;
        }
        this.d = -1L;
        this.e = -1;
        this.f = "";
        this.g = "";
        this.b = "";
        this.c = "";
        this.b = str;
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.d = jSONObject.optLong("counter");
            this.e = jSONObject.optInt("uid");
            this.f = jSONObject.optString("cpu_id");
            this.g = jSONObject.optString("pub_key");
        } catch (JSONException e) {
            v.a("b_an74lgy8", new a.c().a(KnbConstants.PARAMS_SCENE, "SoterPubKeyModel_SoterPubKeyModel").a("message", e.getMessage()).b);
        }
        this.c = str2;
    }
}

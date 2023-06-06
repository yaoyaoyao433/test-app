package com.meituan.android.paybase.fingerprint.soter.sotercore.external;

import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paybase.utils.MTPaySuppressFBWarnings;
import com.meituan.android.paybase.utils.v;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
@MTPaySuppressFBWarnings({"NM_FIELD_NAMING_CONVENTION"})
/* loaded from: classes2.dex */
public final class c {
    public static ChangeQuickRedirect a;
    public String b;
    public String c;
    private String d;
    private String e;
    private long f;
    private String g;
    private String h;
    private String i;
    private String j;
    private String k;

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8371d7e91bcae7c34611273bfaefce80", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8371d7e91bcae7c34611273bfaefce80");
        }
        return "SoterSignatureResult{rawValue='" + this.d + "', fid='" + this.e + "', counter=" + this.f + ", TEEName='" + this.g + "', TEEVersion='" + this.h + "', FpName='" + this.i + "', FpVersion='" + this.j + "', cpuId='" + this.k + "', signaure='" + this.c + "'}";
    }

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de5ddcbccf7cbbdabeb78961711a8293", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de5ddcbccf7cbbdabeb78961711a8293");
            return;
        }
        this.d = null;
        this.e = null;
        this.f = -1L;
        this.g = "";
        this.h = "";
        this.i = "";
        this.j = "";
        this.k = "";
        this.b = "";
        this.c = "";
    }

    public static c a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "63ebb383d107ff1df53d7ac9370b29b8", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "63ebb383d107ff1df53d7ac9370b29b8");
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            c cVar = new c();
            cVar.b = str;
            cVar.d = jSONObject.optString("raw");
            cVar.e = jSONObject.optString("fid");
            long optLong = jSONObject.optLong("counter");
            Object[] objArr2 = {new Long(optLong)};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "40caa4a5675807d5559ca032a9229b16", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "40caa4a5675807d5559ca032a9229b16");
            } else {
                cVar.f = optLong;
            }
            cVar.g = jSONObject.optString("tee_n");
            cVar.h = jSONObject.optString("tee_v");
            cVar.i = jSONObject.optString("fp_n");
            cVar.j = jSONObject.optString("fp_v");
            cVar.k = jSONObject.optString("cpu_id");
            return cVar;
        } catch (JSONException e) {
            v.a("b_an74lgy8", new a.c().a(KnbConstants.PARAMS_SCENE, "SoterSignatureResult_convertFromJson").a("message", e.getMessage()).b);
            return null;
        }
    }
}

package com.meituan.passport.oauthlogin.model;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.connect.common.Constants;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public final String b;
    public String c;
    public String d;
    public String e;

    public a(String str, String str2, String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ca76b6e8dda3217c7cb8c1fa6906832", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ca76b6e8dda3217c7cb8c1fa6906832");
            return;
        }
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a728d0beca59cf2949ba41053ef95751", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a728d0beca59cf2949ba41053ef95751");
            return;
        }
        this.b = str;
        this.e = str2;
    }

    public final String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc313850c518913090abd4d1dd311cb2", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc313850c518913090abd4d1dd311cb2");
        }
        if (TextUtils.isEmpty(this.c)) {
            return "";
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject.put(Constants.PARAM_ACCESS_TOKEN, this.c);
            jSONObject2.put("access_token_result", jSONObject);
        } catch (Exception unused) {
        }
        return jSONObject2.toString();
    }

    public final String a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "495b64bccc386659825577178ce695d6", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "495b64bccc386659825577178ce695d6");
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return "";
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(str, str2);
        } catch (Exception unused) {
        }
        return jSONObject.toString();
    }
}

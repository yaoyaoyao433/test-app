package com.alipay.sdk.app;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class f {
    public static a a;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface a {
        void a(boolean z, JSONObject jSONObject, String str);
    }

    public static boolean a(com.alipay.sdk.sys.a aVar, Activity activity, int i, String str, String str2, a aVar2) {
        try {
            com.alipay.sdk.app.statistic.a.a(aVar, "biz", "TbStart");
            activity.startActivityForResult(new Intent(str2, Uri.parse(str)), 1010);
            a = aVar2;
            return true;
        } catch (Throwable th) {
            aVar2.a(false, null, "UNKNOWN_ERROR");
            com.alipay.sdk.app.statistic.a.a(aVar, "biz", "TbActFail", th);
            return false;
        }
    }
}

package com.meituan.mmp.lib.api.device;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.meituan.mmp.lib.api.ServiceApi;
import com.meituan.mmp.main.IApiCallback;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class PhoneCallModule extends ServiceApi {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.mmp.lib.api.InternalApi
    public final String[] b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "23486d4781477f3f9ded6aafd44fac45", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "23486d4781477f3f9ded6aafd44fac45") : new String[]{"makePhoneCall"};
    }

    @Override // com.meituan.mmp.lib.api.AbsApi
    public void invoke(String str, JSONObject jSONObject, IApiCallback iApiCallback) {
        Object[] objArr = {str, jSONObject, iApiCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3fc2147e9df5823a0b0d45b54e4b580a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3fc2147e9df5823a0b0d45b54e4b580a");
            return;
        }
        String optString = jSONObject.optString("phoneNumber");
        if (!TextUtils.isEmpty(optString)) {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.DIAL");
            intent.setData(Uri.parse("tel:" + optString));
            startActivity(intent, iApiCallback);
            iApiCallback.onSuccess(null);
            return;
        }
        iApiCallback.onFail();
    }
}

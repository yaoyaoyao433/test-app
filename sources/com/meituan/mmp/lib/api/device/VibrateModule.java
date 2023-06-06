package com.meituan.mmp.lib.api.device;

import android.os.Vibrator;
import com.meituan.mmp.lib.api.ServiceApi;
import com.meituan.mmp.main.IApiCallback;
import com.meituan.mmp.main.annotation.SupportApiNames;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class VibrateModule extends ServiceApi {
    @SupportApiNames
    public static final String[] API_NAMES = {"vibrateLong", "vibrateShort"};
    public static ChangeQuickRedirect a;

    @Override // com.meituan.mmp.lib.api.InternalApi
    public final String[] b() {
        return API_NAMES;
    }

    @Override // com.meituan.mmp.lib.api.AbsApi
    public void invoke(String str, JSONObject jSONObject, IApiCallback iApiCallback) {
        Object[] objArr = {str, jSONObject, iApiCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "39d5df2b667adcde09d7eab3f6eff688", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "39d5df2b667adcde09d7eab3f6eff688");
            return;
        }
        Vibrator vibrator = (Vibrator) getContext().getSystemService("vibrator");
        if (vibrator != null && vibrator.hasVibrator()) {
            vibrator.vibrate("vibrateShort".equals(str) ? 15L : 400L);
            iApiCallback.onSuccess(null);
            return;
        }
        iApiCallback.onFail();
    }
}

package com.dianping.titans.js.jshandler;

import android.os.Vibrator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.result.IRequestPermissionCallback;
import com.sankuai.titans.result.TitansPermissionUtil;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class VibrateJsHandler extends BaseJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "65c23a689c4adcda3582628f211b816f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "65c23a689c4adcda3582628f211b816f");
        } else {
            TitansPermissionUtil.checkSelfPermission(jsHost().getContext(), "android.permission.VIBRATE", new IRequestPermissionCallback() { // from class: com.dianping.titans.js.jshandler.VibrateJsHandler.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.sankuai.titans.result.IRequestPermissionCallback
                public void onResult(boolean z, int i) {
                    Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "9b9d13cc448a4c5586e4478c3d8b6004", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "9b9d13cc448a4c5586e4478c3d8b6004");
                    } else if (!z) {
                        VibrateJsHandler.this.failJsCallback("hasn't vibrator permission.");
                    } else {
                        int optInt = VibrateJsHandler.this.jsBean().argsJson.optInt("duration");
                        Vibrator vibrator = (Vibrator) VibrateJsHandler.this.jsHost().getContext().getSystemService("vibrator");
                        if (vibrator == null) {
                            VibrateJsHandler.this.failJsCallback("vibrator is null");
                            return;
                        }
                        try {
                            vibrator.vibrate(optInt);
                            VibrateJsHandler.this.jsCallback();
                        } catch (Exception e) {
                            VibrateJsHandler vibrateJsHandler = VibrateJsHandler.this;
                            vibrateJsHandler.failJsCallback("exception " + e.getMessage());
                        }
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void failJsCallback(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c8bcb1d52c8263fa32cc75ed5e86b131", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c8bcb1d52c8263fa32cc75ed5e86b131");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("status", "failed");
            jSONObject.put("next", str);
        } catch (JSONException unused) {
        }
        jsCallback(jSONObject);
    }
}

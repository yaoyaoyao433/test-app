package com.meituan.android.paycommon.lib.webview.jshandler;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.meituan.android.paybase.fingerprint.bean.OpenSoterFingerprintData;
import com.meituan.android.paybase.fingerprint.bean.SoterVerifyInfo;
import com.meituan.android.paybase.fingerprint.soter.soterexternal.e;
import com.meituan.android.paybase.webview.jshandler.PayBaseJSHandler;
import com.meituan.android.paycommon.lib.fingerprint.VerifyFingerprintActivity;
import com.meituan.android.paycommon.lib.retrofit.PayCommonRequestService;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.utils.f;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class ChangeFingerStatusJsHandler extends PayBaseJSHandler implements com.meituan.android.paybase.retrofit.b {
    private static final int REQ_TAG_OPEN_FINGERPRINT_FID_VERIFY = 346;
    public static final String REQ_TAG_OPEN_FINGER_ERROR_MES = "打开失败";
    public static final int REQ_TAG_VERIFY_FINGER = 3;
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.meituan.android.paybase.retrofit.b
    public void onRequestFinal(int i) {
    }

    @Override // com.meituan.android.paybase.retrofit.b
    public void onRequestStart(int i) {
    }

    @Override // com.meituan.android.paybase.webview.jshandler.PayBaseJSHandler, com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1003fb414844bf03b35ff25517d78135", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1003fb414844bf03b35ff25517d78135");
            return;
        }
        Activity activity = jsHost().getActivity();
        if (activity != null) {
            Boolean valueOf = Boolean.valueOf(jsBean().argsJson.optBoolean("open_or_not"));
            String optString = jsBean().argsJson.optString("challenge");
            int optInt = jsBean().argsJson.optInt("finger_type");
            if (!valueOf.booleanValue()) {
                Context applicationContext = activity.getApplicationContext();
                Object[] objArr2 = {applicationContext, ""};
                ChangeQuickRedirect changeQuickRedirect3 = e.a;
                if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "21005317d0673d8a5bf62d903c54611a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "21005317d0673d8a5bf62d903c54611a");
                } else if (applicationContext != null) {
                    com.meituan.android.paybase.fingerprint.soter.sotercore.external.a.a(com.meituan.android.paybase.fingerprint.soter.b.a().a(""), false);
                }
            } else if (optInt == 2) {
                VerifyFingerprintActivity.a(activity, new OpenSoterFingerprintData("", optString, "", null), 3);
                return;
            } else {
                String i = com.meituan.android.paycommon.lib.config.a.a().i();
                com.meituan.android.paybase.fingerprint.util.b.b(i);
                com.meituan.android.paybase.fingerprint.util.b.a(i);
            }
            jsCallback();
            return;
        }
        jsCallbackError(11, "未知错误");
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler, com.dianping.titans.js.jshandler.JsHandler
    public void onActivityResult(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fd72f2ceb125c5ab171968a5615d37c9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fd72f2ceb125c5ab171968a5615d37c9");
            return;
        }
        super.onActivityResult(i, i2, intent);
        if (i == 3) {
            if (i2 == 0 && intent != null) {
                ((PayCommonRequestService) com.meituan.android.paycommon.lib.retrofit.b.a().a(PayCommonRequestService.class, this, REQ_TAG_OPEN_FINGERPRINT_FID_VERIFY)).verifySoterInfo((HashMap) f.c(intent, "verifyResult"), com.meituan.android.paycommon.lib.config.a.a().o());
            } else {
                jsCallbackError(11, REQ_TAG_OPEN_FINGER_ERROR_MES);
            }
        }
    }

    @Override // com.meituan.android.paybase.retrofit.b
    public void onRequestSucc(int i, Object obj) {
        Object[] objArr = {Integer.valueOf(i), obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "37f7f54dc2f514bcd7a688fd868f9f41", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "37f7f54dc2f514bcd7a688fd868f9f41");
            return;
        }
        SoterVerifyInfo soterVerifyInfo = (SoterVerifyInfo) obj;
        if (soterVerifyInfo.isOpenFingerprintPaySuccess()) {
            jsCallback();
            return;
        }
        e.a(jsHost().getContext(), "", soterVerifyInfo.getSoterVerifyStatus());
        jsCallbackError(11, REQ_TAG_OPEN_FINGER_ERROR_MES);
    }

    @Override // com.meituan.android.paybase.retrofit.b
    public void onRequestException(int i, Exception exc) {
        Object[] objArr = {Integer.valueOf(i), exc};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3e7d86059c1e06c26e490cc3fc75b998", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3e7d86059c1e06c26e490cc3fc75b998");
            return;
        }
        if (i == REQ_TAG_OPEN_FINGERPRINT_FID_VERIFY) {
            e.b(jsHost().getContext(), "");
        }
        jsCallbackError(11, REQ_TAG_OPEN_FINGER_ERROR_MES);
    }
}

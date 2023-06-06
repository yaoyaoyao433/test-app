package com.meituan.android.identifycardrecognizer.jshandler;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import com.dianping.titans.js.jshandler.BaseJsHandler;
import com.meituan.android.identifycardrecognizer.IdCardCaptureActivity;
import com.meituan.android.identifycardrecognizer.PeopleCaptureActivity;
import com.meituan.android.identifycardrecognizer.PhotoSelectorActivity;
import com.meituan.android.identifycardrecognizer.bean.CustomColorInfo;
import com.meituan.android.identifycardrecognizer.utils.a;
import com.meituan.android.identifycardrecognizer.utils.b;
import com.meituan.android.identifycardrecognizer.utils.d;
import com.meituan.android.paybase.moduleinterface.FinanceJsHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.utils.f;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class IdCardOcrProcessJSHandler extends BaseJsHandler implements FinanceJsHandler {
    private static final String ARG_PROCESS = "process";
    private static final int PROCESS_CANCEL = 4;
    private static final int PROCESS_HAND_ID_CARD = 3;
    private static final int PROCESS_ID_CARD_CAPTURE = 1;
    private static final int PROCESS_PHOTO_SELECT = 2;
    private static final int PROCESS_REQUEST_FAIL = 5;
    public static final int START_ACTIVITY_OPEN_ID_CARD_CAPTURE_ACTIVITY = 490;
    public static final int START_ACTIVITY_OPEN_PEOPLE_CAPTURE_ACTIVITY = 491;
    public static final int START_ACTIVITY_OPEN_PHOTO_SELECT_ACTIVITY = 492;
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.meituan.android.paybase.moduleinterface.FinanceJsHandler
    public String getMethodName() {
        return "pay.identifyIdCardProcess";
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public String getSignature() {
        return "mRfVQCwHOlxpEfsjeeLKiiOqz+U3f+0ySMLuR1RYfrG5miluIdqC0JexLgK01LpPoTKtJLovlqAa3uq0f2x8ug==";
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8cf6cc6734af166d3fddb2378a8757f7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8cf6cc6734af166d3fddb2378a8757f7");
            return;
        }
        try {
            a.a(jsHost().getContext(), null);
            int i = jsBean().argsJson.getInt(ARG_PROCESS);
            jsBean().argsJson.getString("bizId");
            jsBean().argsJson.getString("customId");
            String string = jsBean().argsJson.getString("commonColor");
            CustomColorInfo customColorInfo = new CustomColorInfo();
            customColorInfo.setCommonColor(string);
            a.a(jsHost().getContext(), customColorInfo);
            goToIdCardOcrProcess(i);
        } catch (Exception e) {
            com.meituan.android.paybase.common.analyse.a.a(e, "IdCardOcrProcessJSHandler_exec", (Map<String, Object>) null);
        }
    }

    private void goToIdCardOcrProcess(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "458b6c8f31bac7ddd7eb5e13476419e1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "458b6c8f31bac7ddd7eb5e13476419e1");
            return;
        }
        Activity activity = jsHost().getActivity();
        if (activity == null) {
            com.meituan.android.paybase.common.analyse.cat.a.a("activityIsNull", "IdCardOcrProcessJSHandler_goToIdCardOcrProcess");
            return;
        }
        switch (i) {
            case 1:
                d.a("b_pay_identitycard_camera_sc", null);
                Intent intent = new Intent(activity, IdCardCaptureActivity.class);
                intent.putExtra("fromJSHandler", true);
                activity.startActivityForResult(intent, START_ACTIVITY_OPEN_ID_CARD_CAPTURE_ACTIVITY);
                return;
            case 2:
                d.a("b_pay_identitycard_album", null);
                PhotoSelectorActivity.a(activity, 2, (int) START_ACTIVITY_OPEN_PHOTO_SELECT_ACTIVITY, 1, true);
                return;
            case 3:
                Intent intent2 = new Intent(activity, PeopleCaptureActivity.class);
                intent2.putExtra("fromJSHandler", true);
                activity.startActivityForResult(intent2, START_ACTIVITY_OPEN_PEOPLE_CAPTURE_ACTIVITY);
                return;
            case 4:
                jsHost().getActivity().setResult(0);
                d.a("b_pay_identitycard_cancel_sc", null);
                com.meituan.android.paybase.common.analyse.a.a("b_vygb3gbw", (Map<String, Object>) null);
                return;
            case 5:
                Intent intent3 = new Intent();
                intent3.putExtra("status", "fail");
                jsHost().getActivity().setResult(-1, intent3);
                return;
            default:
                return;
        }
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler, com.dianping.titans.js.jshandler.JsHandler
    public void onActivityResult(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e2234005b06b51e7d7b1ca901fa6e305", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e2234005b06b51e7d7b1ca901fa6e305");
            return;
        }
        super.onActivityResult(i, i2, intent);
        JSONObject jSONObject = new JSONObject();
        if (i2 != -1) {
            if (i2 == 0) {
                jsCallbackError(12, "cancel");
                com.meituan.android.paybase.common.analyse.a.a("b_yachudc1", "c_8q3178yy", "身份验证取消", b.a(), b.c);
            }
        } else if (intent == null) {
            jsCallback();
        } else if (TextUtils.equals("success", f.a(intent, "status"))) {
            switch (i) {
                case START_ACTIVITY_OPEN_ID_CARD_CAPTURE_ACTIVITY /* 490 */:
                    jSONObject.optInt(ARG_PROCESS, 1);
                    break;
                case START_ACTIVITY_OPEN_PEOPLE_CAPTURE_ACTIVITY /* 491 */:
                    jSONObject.optInt(ARG_PROCESS, 3);
                    break;
                case START_ACTIVITY_OPEN_PHOTO_SELECT_ACTIVITY /* 492 */:
                    jSONObject.optInt(ARG_PROCESS, 2);
                    break;
            }
            jsCallback(jSONObject);
            com.meituan.android.paybase.common.analyse.a.a("b_kx5y6qd5", "c_8q3178yy", "身份验证成功", b.a(), b.c);
        } else if (TextUtils.equals("fail", f.a(intent, "status"))) {
            jsCallbackError(11, "fail");
            com.meituan.android.paybase.common.analyse.a.a("b_li7hhcsq", "c_8q3178yy", "身份验证失败", b.a(), b.c);
        } else if (TextUtils.equals("cancel", f.a(intent, "status"))) {
            jsCallbackError(12, "cancel");
            com.meituan.android.paybase.common.analyse.a.a("b_yachudc1", "c_8q3178yy", "身份验证取消", b.a(), b.c);
        } else {
            jsCallback();
            com.meituan.android.paybase.common.analyse.a.a("b_li7hhcsq", "c_8q3178yy", "身份验证失败", b.a(), b.c);
        }
    }

    @Override // com.meituan.android.paybase.moduleinterface.FinanceJsHandler
    public Class<?> getHandlerClass() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5c06b836f07e0abab82dba7d5ae2d535", RobustBitConfig.DEFAULT_VALUE) ? (Class) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5c06b836f07e0abab82dba7d5ae2d535") : getClass();
    }
}

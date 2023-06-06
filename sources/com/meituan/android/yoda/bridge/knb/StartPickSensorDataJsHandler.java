package com.meituan.android.yoda.bridge.knb;

import android.app.Activity;
import android.hardware.Sensor;
import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import com.dianping.titans.js.jshandler.BaseJsHandler;
import com.meituan.android.pay.model.OtherVerifyTypeConstants;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.android.recce.host.RecceBridgeHandler;
import com.meituan.android.yoda.model.behavior.tool.f;
import com.meituan.android.yoda.monitor.log.a;
import com.meituan.android.yoda.util.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class StartPickSensorDataJsHandler extends BaseJsHandler {
    private static final String TAG = "StartPickSensorDataJsHandler";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public String getSignature() {
        return "HVyPxiR0CjstQXLsQ5XEEaiu8+rJrVUt+pnabFt6hKYrhwLI64IPAGlXfC50sKnAM645bkqbUdvoiEj6d41Ebw==";
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        boolean z;
        Sensor defaultSensor;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "551f31482d7cd40a4b94e4ceea1e890a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "551f31482d7cd40a4b94e4ceea1e890a");
            return;
        }
        try {
            a.a(TAG, TAG, true);
            Activity activity = jsHost().getActivity();
            if (activity == null) {
                jsCallbackError(10000, "activity is null");
                return;
            }
            if (jsBean() != null && jsBean().argsJson != null) {
                String optString = jsBean().argsJson.optString(OtherVerifyTypeConstants.REQUEST_CODE_IDENTITY);
                f a = f.a();
                Object[] objArr2 = {activity, optString, "1|2|3", 20};
                ChangeQuickRedirect changeQuickRedirect3 = f.a;
                if (PatchProxy.isSupport(objArr2, a, changeQuickRedirect3, false, "40e01aa3473b3823179023d55f688d75", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, a, changeQuickRedirect3, false, "40e01aa3473b3823179023d55f688d75");
                } else {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = b.a;
                    if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect4, true, "6bb1de5d4ec5b5fddb30d6c06e48b300", RobustBitConfig.DEFAULT_VALUE)) {
                        z = ((Boolean) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect4, true, "6bb1de5d4ec5b5fddb30d6c06e48b300")).booleanValue();
                    } else {
                        z = Looper.getMainLooper() == Looper.myLooper();
                    }
                    if (z && activity != null) {
                        a.f = optString;
                        if (a.c == null) {
                            a.c = Privacy.createSensorManager(activity, "jcyf-7f184de1913fbddc");
                        }
                        if (!TextUtils.isEmpty("1|2|3")) {
                            a.e = 18;
                            String[] split = "1|2|3".split(RecceBridgeHandler.RECCE_BRIDGE_ARGS_SEPARATOR);
                            if (split != null && split.length != 0) {
                                a.b();
                                a.d = new f.b();
                                for (String str : split) {
                                    char c = 65535;
                                    switch (str.hashCode()) {
                                        case 49:
                                            if (str.equals("1")) {
                                                c = 0;
                                                break;
                                            }
                                            break;
                                        case 50:
                                            if (str.equals("2")) {
                                                c = 1;
                                                break;
                                            }
                                            break;
                                        case 51:
                                            if (str.equals("3")) {
                                                c = 2;
                                                break;
                                            }
                                            break;
                                    }
                                    switch (c) {
                                        case 0:
                                            Object[] objArr4 = new Object[0];
                                            ChangeQuickRedirect changeQuickRedirect5 = b.a;
                                            if (!(PatchProxy.isSupport(objArr4, null, changeQuickRedirect5, true, "3ffeb3a093e0ad21ac0733eae7a2ea96", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect5, true, "3ffeb3a093e0ad21ac0733eae7a2ea96")).booleanValue() : "huawei".equalsIgnoreCase(Build.BRAND)) && (defaultSensor = a.c.getDefaultSensor(1)) != null) {
                                                a.c.registerListener(a.d, defaultSensor, 1);
                                                a.a(f.b, "start collect acc, freq:1", true);
                                                continue;
                                            }
                                            break;
                                        case 1:
                                            Sensor defaultSensor2 = a.c.getDefaultSensor(2);
                                            if (defaultSensor2 != null) {
                                                a.c.registerListener(a.d, defaultSensor2, 1);
                                                a.a(f.b, "start collect mag, freq:1", true);
                                            } else {
                                                continue;
                                            }
                                        case 2:
                                            Sensor defaultSensor3 = a.c.getDefaultSensor(4);
                                            if (defaultSensor3 != null) {
                                                a.c.registerListener(a.d, defaultSensor3, 1);
                                                a.a(f.b, "start collect gyr, freq:1", true);
                                                break;
                                            }
                                            break;
                                    }
                                }
                            }
                        }
                    }
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(OtherVerifyTypeConstants.REQUEST_CODE_IDENTITY, optString);
                jsCallback(jSONObject.toString());
                a.a(TAG, "StartPickSensorDataJsHandler end, requestCode is " + optString, true);
                return;
            }
            a.a(TAG, "no requestCode", true);
            jsCallbackError(10000, "no requestCode");
        } catch (Exception e) {
            jsCallbackError(10000, e.getMessage());
            a.a(TAG, "Exception " + e.getMessage(), true);
        }
    }
}

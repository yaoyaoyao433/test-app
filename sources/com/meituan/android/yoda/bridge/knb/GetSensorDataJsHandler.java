package com.meituan.android.yoda.bridge.knb;

import android.app.Activity;
import android.text.TextUtils;
import com.dianping.titans.js.jshandler.BaseJsHandler;
import com.dianping.titans.utils.StorageUtil;
import com.meituan.android.pay.model.OtherVerifyTypeConstants;
import com.meituan.android.yoda.model.behavior.tool.c;
import com.meituan.android.yoda.model.behavior.tool.f;
import com.meituan.android.yoda.monitor.log.a;
import com.meituan.android.yoda.xxtea.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class GetSensorDataJsHandler extends BaseJsHandler {
    private static final String TAG = "GetSensorDataJsHandler";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public String getSignature() {
        return "JN67zQRUi6TfJhnXMLM38WXe+RsNwbctx7TkmUZv5EuyErqXw+Uq/PQ07SONMQNSOAk1OZMLWnRONDijmr4cww==";
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        String str;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6cfad7862371872769efeb1a0967ea4c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6cfad7862371872769efeb1a0967ea4c");
            return;
        }
        try {
            a.a(TAG, TAG, true);
            Activity activity = jsHost().getActivity();
            if (activity == null) {
                a.a(TAG, "no activity", true);
                jsCallbackError(10000, "no activity");
                return;
            }
            String str2 = f.a().f;
            f a = f.a();
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = f.a;
            if (PatchProxy.isSupport(objArr2, a, changeQuickRedirect3, false, "ff23e7aaf623db78bf2f6faeb169f10e", RobustBitConfig.DEFAULT_VALUE)) {
                str = (String) PatchProxy.accessDispatch(objArr2, a, changeQuickRedirect3, false, "ff23e7aaf623db78bf2f6faeb169f10e");
            } else {
                a.a(f.b, "getBioProbeSensorInfo", true);
                if (a.g.size() == 0 && a.i.size() == 0 && a.h.size() == 0) {
                    str = "";
                } else {
                    str = "{\"acc\":" + a.g.toString() + ",\"mag\":" + a.i.toString() + ",\"gyr\":" + a.h.toString() + CommonConstant.Symbol.BIG_BRACKET_RIGHT;
                }
            }
            if (TextUtils.isEmpty(str)) {
                a.a(TAG, "no sensor info", true);
                jsCallbackError(10000, "no sensor info");
                return;
            }
            byte[] a2 = com.meituan.android.yoda.util.a.a(str2);
            if (a2 == null) {
                a.a(TAG, "no requestCode", true);
                jsCallbackError(10000, "no requestCode");
                return;
            }
            int i = 32;
            byte[] bArr = new byte[32];
            if (a2.length < 32) {
                i = a2.length;
            }
            System.arraycopy(a2, 0, bArr, 0, i);
            byte[] a3 = com.meituan.android.yoda.util.a.a(c.a(str), bArr, com.meituan.android.yoda.util.a.b("15161718191a1b1c1d1e1f2021222324"));
            StorageUtil.putSharedValue(activity, str2, a3 != null ? b.a(a3) : "", 1);
            f.a().c();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(OtherVerifyTypeConstants.REQUEST_CODE_IDENTITY, str2);
            jsCallback(jSONObject);
            a.a(TAG, "GetSensorDataJsHandler end, requestCode is " + str2, true);
        } catch (Exception e) {
            jsCallbackError(10000, e.getMessage());
            a.a(TAG, "Exception " + e.getMessage(), true);
        }
    }
}

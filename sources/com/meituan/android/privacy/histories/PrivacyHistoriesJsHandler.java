package com.meituan.android.privacy.histories;

import android.content.Context;
import android.support.annotation.NonNull;
import com.BV.LinearGradient.LinearGradientManager;
import com.dianping.titans.js.jshandler.BaseJsHandler;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.common.unionid.oneid.oaid.OaidManager;
import com.meituan.android.common.unionid.oneid.util.AppUtil;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.msi.api.component.picker.bean.DatePickerParam;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class PrivacyHistoriesJsHandler extends BaseJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        String b;
        int b2;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3ed3059856cb860e01b0b3730d004cc2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3ed3059856cb860e01b0b3730d004cc2");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        Context context = jsHost().getContext();
        try {
            int optInt = jsBean().argsJson.optInt(DatePickerParam.FIELD_DAY, 7);
            a a = a.a(context);
            jSONObject.put(LinearGradientManager.PROP_LOCATIONS, a.a(context).a(optInt));
            jSONObject.put("imei", unionIdMerge(AppUtil.getImei1Cache(context), AppUtil.getImei1CallTimes(context)));
            jSONObject.put(Constants.Environment.KEY_IMSI, unionIdMerge(AppUtil.getImsi1Cache(context), AppUtil.getImsi1CallTimes(context)));
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = a.a;
            if (PatchProxy.isSupport(objArr2, a, changeQuickRedirect3, false, "de65d4d3fa6883ef1b62fd6a751f3831", RobustBitConfig.DEFAULT_VALUE)) {
                b = (String) PatchProxy.accessDispatch(objArr2, a, changeQuickRedirect3, false, "de65d4d3fa6883ef1b62fd6a751f3831");
            } else {
                a.a();
                b = a.b.b("androidid", (String) null);
            }
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect4 = a.a;
            if (PatchProxy.isSupport(objArr3, a, changeQuickRedirect4, false, "83d1fa3866d1a9879d5533a627ead7f1", RobustBitConfig.DEFAULT_VALUE)) {
                b2 = ((Integer) PatchProxy.accessDispatch(objArr3, a, changeQuickRedirect4, false, "83d1fa3866d1a9879d5533a627ead7f1")).intValue();
            } else {
                a.a();
                b2 = a.b.b("androidid_times", 0);
            }
            jSONObject.put("androidid", unionIdMerge(b, b2));
            jSONObject.put("oaid", unionIdMerge(getOaid(), 1));
            jSONObject.put(Constants.Environment.KEY_ICCID, unionIdMerge(AppUtil.getIccidCache(context), AppUtil.getIccidCallTimes(context)));
            jSONObject.put("carrier", Privacy.createTelephonyManager(context, "privacy.getHistories").getSimOperator());
            jsCallback(jSONObject);
        }
    }

    private String getOaid() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "31fa24f3350d32b57a6afd8e5fc0cdc3", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "31fa24f3350d32b57a6afd8e5fc0cdc3") : OaidManager.getInstance().getLocalOAID(jsHost().getContext());
    }

    private JSONObject unionIdMerge(String str, int i) throws JSONException {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "995dafd7d6d51f0cad537ae145c8953b", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "995dafd7d6d51f0cad537ae145c8953b");
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("value", proguard(str));
        jSONObject.put("times", i);
        return jSONObject;
    }

    public String proguard(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "313d3d58c795af5a59df0a72b2055702", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "313d3d58c795af5a59df0a72b2055702");
        }
        if (str == null || str.length() < 4) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length() - 4; i++) {
            sb.append('*');
        }
        sb.append(str.substring(str.length() - 4));
        return sb.toString();
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public String getSignature() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "927e607f229160e2f166c05aa1cfdc78", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "927e607f229160e2f166c05aa1cfdc78") : super.getSignature();
    }
}

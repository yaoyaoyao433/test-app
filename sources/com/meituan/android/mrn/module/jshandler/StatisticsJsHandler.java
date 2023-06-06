package com.meituan.android.mrn.module.jshandler;

import com.meituan.android.common.statistics.Statistics;
import com.meituan.android.mrn.module.utils.e;
import com.meituan.android.mrn.utils.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class StatisticsJsHandler extends RNBaseJsHandler {
    public static final String KEY = "MRN.lxTrack";
    public static final int MODULE_CLICK = 2;
    private static final int MODULE_EDIT = 11;
    public static final int MODULE_VIEW = 3;
    public static final int ORDER = 5;
    public static final int PAGE_DISAPPEAR = 1;
    public static final int PAGE_VIEW = 0;
    public static final int PAY = 4;
    private static final int SET_TAG = 6;
    private static final int SYSTEM_CHECK = 12;
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public String getSignature() {
        return "c6XmJhBSAy6E/QVmk9iCsR6a7HXWDZhbLTOMTJec/KTR3hakDoam78orHccEGFqBmxz5fN2PVUjBgC0qZ6U9WQ==";
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a75ebed6d5325ab41f7c5194fe0f333e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a75ebed6d5325ab41f7c5194fe0f333e");
            return;
        }
        if (this.mJsBean != null) {
            new StringBuilder("argJson:").append(this.mJsBean.argsJson != null ? this.mJsBean.argsJson.toString() : "");
        }
        JSONObject paramJSONObject = getParamJSONObject();
        new StringBuilder("param:").append(paramJSONObject != null ? paramJSONObject.toString() : "");
        if (paramJSONObject == null) {
            jsCallbackErrorMsg("StatisticsJsHandler: params should not null");
            return;
        }
        int optInt = paramJSONObject.optInt("eventName", -1);
        JSONObject optJSONObject = paramJSONObject.optJSONObject("data");
        if (optInt < 0) {
            jsCallbackErrorMsg("eventName should not empty");
        } else if (optJSONObject != null) {
            parseDataParam(optJSONObject, optInt);
            jsCallback();
        } else {
            jsCallbackErrorMsg("data should not empty");
        }
    }

    private void parseDataParam(JSONObject jSONObject, int i) {
        Map<String, Object> map;
        Object[] objArr = {jSONObject, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d80322c10d5034eeb85dc6254c5645a7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d80322c10d5034eeb85dc6254c5645a7");
            return;
        }
        String optString = jSONObject.optString("channelName");
        String optString2 = jSONObject.optString("pageInfoKey");
        String optString3 = jSONObject.optString("cid");
        String optString4 = jSONObject.optString("key");
        String optString5 = jSONObject.optString("bid");
        try {
            map = g.b(jSONObject.optJSONObject("params"));
        } catch (Exception e) {
            e.printStackTrace();
            map = null;
        }
        if (map == null) {
            map = new HashMap<>();
        }
        switch (i) {
            case 0:
                e.a(optString, optString2, optString3, map);
                return;
            case 1:
                e.b(optString, optString2, optString3, map);
                return;
            case 2:
                Object[] objArr2 = {optString, optString2, optString5, optString3, map};
                ChangeQuickRedirect changeQuickRedirect3 = e.a;
                if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "5ed2c97d45013fa2eef9c5ce5f1c4cb1", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "5ed2c97d45013fa2eef9c5ce5f1c4cb1");
                    return;
                } else {
                    e.a(optString).writeModelClick(optString2, optString5, map, optString3);
                    return;
                }
            case 3:
                Object[] objArr3 = {optString, optString2, optString5, optString3, map};
                ChangeQuickRedirect changeQuickRedirect4 = e.a;
                if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect4, true, "39f73139e0a52cb6da1b9b0c9c76faeb", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect4, true, "39f73139e0a52cb6da1b9b0c9c76faeb");
                    return;
                } else {
                    e.a(optString).writeModelView(optString2, optString5, map, optString3);
                    return;
                }
            case 4:
                Object[] objArr4 = {optString, optString2, optString5, optString3, map};
                ChangeQuickRedirect changeQuickRedirect5 = e.a;
                if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect5, true, "0559cf26e801108bdef1beb93fa46abc", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect5, true, "0559cf26e801108bdef1beb93fa46abc");
                    return;
                } else {
                    e.a(optString).writeBizPay(optString2, optString5, map, optString3);
                    return;
                }
            case 5:
                Object[] objArr5 = {optString, optString2, optString5, optString3, map};
                ChangeQuickRedirect changeQuickRedirect6 = e.a;
                if (PatchProxy.isSupport(objArr5, null, changeQuickRedirect6, true, "9aa3e1bc97703a71ebc705ff0d38914c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect6, true, "9aa3e1bc97703a71ebc705ff0d38914c");
                    return;
                } else {
                    e.a(optString).writeBizOrder(optString2, optString5, map, optString3);
                    return;
                }
            case 6:
                Object[] objArr6 = {map, optString4};
                ChangeQuickRedirect changeQuickRedirect7 = e.a;
                if (PatchProxy.isSupport(objArr6, null, changeQuickRedirect7, true, "7cbc0449896d91206c5b46d37c29b92e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr6, null, changeQuickRedirect7, true, "7cbc0449896d91206c5b46d37c29b92e");
                    return;
                } else {
                    Statistics.getChannel().updateTag(optString4, map);
                    return;
                }
            default:
                switch (i) {
                    case 11:
                        Object[] objArr7 = {optString, optString2, optString5, optString3, map};
                        ChangeQuickRedirect changeQuickRedirect8 = e.a;
                        if (PatchProxy.isSupport(objArr7, null, changeQuickRedirect8, true, "a86bbab2b5ea609435b8678e48427337", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr7, null, changeQuickRedirect8, true, "a86bbab2b5ea609435b8678e48427337");
                            return;
                        } else {
                            e.a(optString).writeModelEdit(optString2, optString5, map, optString3);
                            return;
                        }
                    case 12:
                        Object[] objArr8 = {optString, optString2, optString5, optString3, map};
                        ChangeQuickRedirect changeQuickRedirect9 = e.a;
                        if (PatchProxy.isSupport(objArr8, null, changeQuickRedirect9, true, "1f9746274b46194a17db852b6ecb13ff", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr8, null, changeQuickRedirect9, true, "1f9746274b46194a17db852b6ecb13ff");
                            return;
                        } else {
                            e.a(optString).writeSystemCheck(optString2, optString5, map, optString3);
                            return;
                        }
                    default:
                        return;
                }
        }
    }
}

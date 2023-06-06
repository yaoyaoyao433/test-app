package com.meituan.android.common.aidata.ai.mlmodel.operator;

import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class OperatorConfig {
    private static final String KEY_BIZ_FUNCTION = "name";
    private static final String KEY_PARAMS = "params";
    public static ChangeQuickRedirect changeQuickRedirect;
    public String bizName;
    public String opName;
    private JSONArray paramArray;
    public List<Object> paramList;

    @Nullable
    public static OperatorConfig fromJson(@Nullable JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        OperatorConfig operatorConfig = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "58a0bf70b8d01c3dc8a2703a0b834b33", RobustBitConfig.DEFAULT_VALUE)) {
            return (OperatorConfig) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "58a0bf70b8d01c3dc8a2703a0b834b33");
        }
        if (jSONObject != null) {
            operatorConfig = new OperatorConfig();
            operatorConfig.opName = jSONObject.optString("name");
            JSONArray optJSONArray = jSONObject.optJSONArray("params");
            operatorConfig.paramArray = new JSONArray();
            if (optJSONArray != null) {
                operatorConfig.paramList = new ArrayList();
                int length = optJSONArray.length();
                for (int i = 0; i < length; i++) {
                    Object opt = optJSONArray.opt(i);
                    if (opt != null) {
                        operatorConfig.paramArray.put(opt);
                        operatorConfig.paramList.add(opt);
                    }
                }
            }
        }
        return operatorConfig;
    }

    public JSONArray getParamArray() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5ea366ad2590aea11b10755630838a17", RobustBitConfig.DEFAULT_VALUE) ? (JSONArray) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5ea366ad2590aea11b10755630838a17") : this.paramArray != null ? this.paramArray : new JSONArray();
    }
}

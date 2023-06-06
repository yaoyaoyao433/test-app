package com.sankuai.common.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class APIBuilder {
    private static final int DEFAULT_VERSION = 1;
    private static final String METHOD = "method";
    private static final String PARAMS = "params";
    private static final String VERSION = "v";
    public static ChangeQuickRedirect changeQuickRedirect;
    private JSONObject mJSONObject;
    private String mMethod;
    private HashMap<String, Object> mParams;
    private int mVersion;

    public APIBuilder() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "be3ad15ebbaa1edd115dd424b70c09f5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "be3ad15ebbaa1edd115dd424b70c09f5");
            return;
        }
        this.mJSONObject = new JSONObject();
        this.mVersion = 1;
        this.mMethod = "";
        this.mParams = new HashMap<>();
    }

    public void addVersion(int i) {
        this.mVersion = i;
    }

    public void addMethod(String str) {
        this.mMethod = str;
    }

    public void put(String str, Object obj) {
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9d3ec092f6316151f712ee0564d34d61", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9d3ec092f6316151f712ee0564d34d61");
        } else {
            this.mParams.put(str, obj);
        }
    }

    public String get() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "48116b8220166cbc167c548ff02558c0", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "48116b8220166cbc167c548ff02558c0");
        }
        try {
            this.mJSONObject.put("v", this.mVersion);
            this.mJSONObject.put("method", this.mMethod);
            this.mJSONObject.put("params", genParams());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return this.mJSONObject.toString();
    }

    public void putList(String str, List<HashMap<String, Object>> list) {
        Object[] objArr = {str, list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "966be7ed2e99fc4c10eee48ed9c2c36d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "966be7ed2e99fc4c10eee48ed9c2c36d");
            return;
        }
        JSONArray jSONArray = new JSONArray();
        for (HashMap<String, Object> hashMap : list) {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry<String, Object> entry : hashMap.entrySet()) {
                try {
                    jSONObject.put(entry.getKey(), entry.getValue());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            jSONArray.put(jSONObject);
        }
        this.mParams.put(str, jSONArray);
    }

    private JSONObject genParams() throws JSONException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4933a03358fa233cc8c8ea185f4b26b6", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4933a03358fa233cc8c8ea185f4b26b6");
        }
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, Object> entry : this.mParams.entrySet()) {
            jSONObject.put(entry.getKey(), entry.getValue());
        }
        return jSONObject;
    }
}

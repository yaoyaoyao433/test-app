package com.meituan.android.common.aidata.jsengine.common;

import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class JSValueWrapper {
    public static ChangeQuickRedirect changeQuickRedirect;
    private boolean isSuccess;
    private JSONObject jsonObjectResult;
    private float mExecuteTime;
    private final String result;

    public JSValueWrapper(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "322e3cefef81b63391383191701d9784", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "322e3cefef81b63391383191701d9784");
            return;
        }
        this.mExecuteTime = 0.0f;
        this.result = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            this.jsonObjectResult = new JSONObject(str);
            this.isSuccess = this.jsonObjectResult.optBoolean("isSuccess", false);
        } catch (Exception unused) {
        }
    }

    public float getExecuteTime() {
        return this.mExecuteTime;
    }

    public void setExecuteTime(float f) {
        this.mExecuteTime = f;
    }

    public String stringValue() {
        return this.result;
    }

    public boolean isSuccess() {
        return this.isSuccess;
    }

    @Nullable
    public JSONObject getJSONObjectData() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e10319cd78131c21cb8c46a8aa0426e4", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e10319cd78131c21cb8c46a8aa0426e4");
        }
        if (this.jsonObjectResult == null) {
            return null;
        }
        return this.jsonObjectResult.optJSONObject("data");
    }

    @Nullable
    public JSONArray getJSONArrayData() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8c2bef6e2e558b8f22be109b73bd86ee", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONArray) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8c2bef6e2e558b8f22be109b73bd86ee");
        }
        if (this.jsonObjectResult == null) {
            return null;
        }
        return this.jsonObjectResult.optJSONArray("data");
    }

    @Nullable
    public Object getObjectData() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "df78fde6289b1c3fa3ce6ac8072c75d0", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "df78fde6289b1c3fa3ce6ac8072c75d0");
        }
        if (this.jsonObjectResult == null) {
            return null;
        }
        return this.jsonObjectResult.opt("data");
    }

    public String getErrorInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2d33dd4eadb04abaae9786f62bcb1263", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2d33dd4eadb04abaae9786f62bcb1263");
        }
        JSONObject jSONObjectData = getJSONObjectData();
        return jSONObjectData == null ? "" : jSONObjectData.optString("data", "");
    }
}

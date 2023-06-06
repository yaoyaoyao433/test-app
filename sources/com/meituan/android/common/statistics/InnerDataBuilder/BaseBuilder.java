package com.meituan.android.common.statistics.InnerDataBuilder;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class BaseBuilder {
    private static final String LX_INNER_DATA_KEY = "lx_inner_data";
    public static ChangeQuickRedirect changeQuickRedirect;
    private Context mContext;
    protected volatile boolean mNeedReport;

    public abstract boolean checkIfNeedReport();

    public void onPostProcessData(Context context, JSONObject jSONObject) {
    }

    public void onPreProcessData(Context context, JSONObject jSONObject, JSONObject jSONObject2, long j) {
    }

    public abstract JSONObject onProcessData(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, long j);

    public BaseBuilder() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "43b93e55b429f7b0bf9109cc97e452cc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "43b93e55b429f7b0bf9109cc97e452cc");
            return;
        }
        this.mContext = null;
        this.mNeedReport = true;
    }

    public Context getContext() {
        return this.mContext;
    }

    public JSONObject processData(Context context, JSONObject jSONObject, JSONObject jSONObject2, long j) {
        JSONObject jSONObject3;
        Object[] objArr = {context, jSONObject, jSONObject2, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b91740cdc9d33291df7aa240ba213117", 6917529027641081856L)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b91740cdc9d33291df7aa240ba213117");
        }
        this.mContext = context;
        JSONObject jSONObject4 = null;
        if (jSONObject == null) {
            return null;
        }
        onPreProcessData(context, jSONObject, jSONObject2, j);
        if (checkIfNeedReport()) {
            JSONObject optJSONObject = jSONObject.optJSONObject("lx_inner_data");
            if (optJSONObject == null) {
                try {
                    jSONObject3 = new JSONObject();
                } catch (Exception e) {
                    e = e;
                }
                try {
                    jSONObject.put("lx_inner_data", jSONObject3);
                    jSONObject4 = jSONObject3;
                } catch (Exception e2) {
                    e = e2;
                    optJSONObject = jSONObject3;
                    e.printStackTrace();
                    jSONObject4 = optJSONObject;
                    onProcessData(jSONObject, jSONObject4, jSONObject2, j);
                    onPostProcessData(context, jSONObject4);
                    return jSONObject;
                }
                onProcessData(jSONObject, jSONObject4, jSONObject2, j);
            }
            jSONObject4 = optJSONObject;
            onProcessData(jSONObject, jSONObject4, jSONObject2, j);
        }
        onPostProcessData(context, jSONObject4);
        return jSONObject;
    }
}

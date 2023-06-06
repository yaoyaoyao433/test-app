package com.meituan.android.common.statistics.InnerDataBuilder;

import android.text.TextUtils;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.common.statistics.config.ConfigManager;
import com.meituan.android.common.statistics.entity.EventName;
import com.meituan.android.common.statistics.flowmanager.FlowManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class CommonDataBuilder extends BaseBuilder {
    public static final String FLOW_CONTROL_STATS = "dc_cnt";
    public static final String FLOW_FROM_SUB_PROCESS = "from_child_proc";
    public static final String FLOW_HORN_CONF_VERSION = "horn_cnf";
    public static final String FLOW_PROCESS_NAME = "pn";
    public static final String OAID_USER_LIMITED = "oaid_limited";
    public static ChangeQuickRedirect changeQuickRedirect;
    private HashMap mParams;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class Holder {
        public static ChangeQuickRedirect changeQuickRedirect;
        public static CommonDataBuilder instance = new CommonDataBuilder();
    }

    @Override // com.meituan.android.common.statistics.InnerDataBuilder.BaseBuilder
    public boolean checkIfNeedReport() {
        return true;
    }

    public CommonDataBuilder() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6860a75b13b31de68913a20e0fe2fa64", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6860a75b13b31de68913a20e0fe2fa64");
        } else {
            this.mParams = new HashMap();
        }
    }

    public static CommonDataBuilder getInstance() {
        return Holder.instance;
    }

    @Override // com.meituan.android.common.statistics.InnerDataBuilder.BaseBuilder
    public JSONObject onProcessData(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, long j) {
        JSONObject statInfo;
        Object[] objArr = {jSONObject, jSONObject2, jSONObject3, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "28271ad7809749b975601d8486ea83c5", 6917529027641081856L)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "28271ad7809749b975601d8486ea83c5");
        }
        if (jSONObject2 == null) {
            return jSONObject2;
        }
        try {
            if (this.mParams != null && this.mParams.size() > 0) {
                for (Map.Entry entry : this.mParams.entrySet()) {
                    jSONObject2.put((String) entry.getKey(), entry.getValue());
                }
            }
            if ((EventName.PAGE_VIEW.equals(jSONObject.optString("nm")) || EventName.MPT.equals(jSONObject.optString("nm")) || EventName.QUIT.equals(jSONObject.optString("nm"))) && (statInfo = FlowManager.getInstance(getContext()).getStatInfo()) != null) {
                jSONObject2.put(FLOW_CONTROL_STATS, statInfo);
            }
            JSONObject statInfo2 = ConfigManager.getInstance(getContext()).getStatInfo();
            if (statInfo2 != null) {
                jSONObject2.put(FLOW_HORN_CONF_VERSION, statInfo2);
            }
            if (jSONObject.has(Constants.EventInfoConsts.KEY_PAGE_CREATE_FIRST_VIEW)) {
                int intValue = ((Integer) jSONObject.remove(Constants.EventInfoConsts.KEY_PAGE_CREATE_FIRST_VIEW)).intValue();
                if (EventName.PAGE_VIEW.equals(jSONObject.optString("nm")) && jSONObject.optInt(Constants.EventInfoConsts.KEY_IS_AUTO) == 6) {
                    jSONObject2.put(Constants.EventInfoConsts.KEY_PAGE_CREATE_FIRST_VIEW, intValue);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jSONObject2;
    }

    public void updateData(String str, Object obj) {
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e5672a03367eea15b77ffafd32372cb6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e5672a03367eea15b77ffafd32372cb6");
        } else if (this.mParams == null || TextUtils.isEmpty(str)) {
        } else {
            this.mParams.put(str, obj);
        }
    }
}

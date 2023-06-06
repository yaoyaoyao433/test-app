package com.meituan.android.common.statistics.dispatcher;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class SpecifiedEventConfig {
    public static final String LX_SPECIFIED_GESTURE = "lx_specified_gesture";
    public static ChangeQuickRedirect changeQuickRedirect;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    static class SpecifiedEventConfigHolder {
        public static ChangeQuickRedirect changeQuickRedirect;
        public static SpecifiedEventConfig specifiedEventConfig = new SpecifiedEventConfig();
    }

    public boolean isGestureSpecified(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "781524636999b0856a2db49b04c1215a", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "781524636999b0856a2db49b04c1215a")).booleanValue();
        }
        if (jSONObject == null) {
            return false;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("evs");
        JSONObject jSONObject2 = null;
        if (optJSONObject != null) {
            try {
                if (optJSONObject.has("val_lab")) {
                    jSONObject2 = optJSONObject.getJSONObject("val_lab");
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return jSONObject2 != null && jSONObject2.has(LX_SPECIFIED_GESTURE);
    }

    public static SpecifiedEventConfig getInstance() {
        return SpecifiedEventConfigHolder.specifiedEventConfig;
    }
}

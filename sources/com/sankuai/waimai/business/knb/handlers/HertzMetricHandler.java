package com.sankuai.waimai.business.knb.handlers;

import com.meituan.metrics.common.Constants;
import com.meituan.metrics.speedmeter.MetricsSpeedMeterTask;
import com.meituan.metrics.util.TimeUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.takeoutnew.util.aop.h;
import com.sankuai.waimai.foundation.utils.log.a;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class HertzMetricHandler extends TakeoutBaseJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ce25e9ddf54dc79dc4c546eb4451d219", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ce25e9ddf54dc79dc4c546eb4451d219");
        } else if (validateArgs()) {
            try {
                JSONObject jSONObject = jsBean().argsJson;
                String string = jSONObject.getString("page");
                int i = jSONObject.getInt(Constants.SPEED_METER_STEP);
                h.a(MetricsSpeedMeterTask.createCustomSpeedMeterTask(string, TimeUtil.elapsedTimeMillis() - jSONObject.getInt("interval")).recordStep(String.valueOf(i)));
            } catch (JSONException e) {
                a.a(e);
            }
        }
    }
}

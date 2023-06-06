package com.meituan.android.common.weaver.impl.knb;

import com.dianping.titans.js.jshandler.BaseJsHandler;
import com.meituan.android.common.weaver.impl.ErrorReporter;
import com.meituan.android.common.weaver.impl.ffp.CustomTagsEventWithActivity;
import com.meituan.android.common.weaver.interfaces.Weaver;
import com.meituan.android.common.weaver.interfaces.ffp.FFPUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class FFPCustomTags extends BaseJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final ErrorReporter sErrorReporter = new ErrorReporter("FFPCustomTags", 2);

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dd7f47215f5d0b7e2585bbc7223a4fc3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dd7f47215f5d0b7e2585bbc7223a4fc3");
            return;
        }
        try {
            JSONObject jSONObject = jsBean().argsJson;
            if (jSONObject == null) {
                return;
            }
            String string = jSONObject.getString("pagePath");
            JSONObject jSONObject2 = jSONObject.getJSONObject("customTags");
            CustomTagsEventWithActivity customTagsEventWithActivity = new CustomTagsEventWithActivity(string, jsHost().getActivity());
            customTagsEventWithActivity.withExtra(FFPUtil.json2Map(jSONObject2));
            Weaver.getWeaver().weave(customTagsEventWithActivity);
            jsCallback();
        } catch (Throwable th) {
            sErrorReporter.report(th);
        }
    }
}

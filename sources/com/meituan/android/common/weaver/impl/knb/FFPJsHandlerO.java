package com.meituan.android.common.weaver.impl.knb;

import android.app.Activity;
import android.support.annotation.NonNull;
import com.dianping.titans.js.jshandler.BaseJsHandler;
import com.meituan.android.common.weaver.impl.ErrorReporter;
import com.meituan.android.common.weaver.impl.blank.Blanks;
import com.meituan.android.common.weaver.impl.natives.PagePathHelper;
import com.meituan.android.common.weaver.impl.utils.Logger;
import com.meituan.android.common.weaver.interfaces.Weaver;
import com.meituan.android.common.weaver.interfaces.ffp.ContainerEvent;
import com.meituan.android.common.weaver.interfaces.ffp.FFPUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class FFPJsHandlerO extends BaseJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final ErrorReporter sErrorReporter = new ErrorReporter("FFPJsHandler", 2);

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "124721bc27e30f9566a2a6ba7bc9b83c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "124721bc27e30f9566a2a6ba7bc9b83c");
            return;
        }
        try {
            JSONObject jSONObject = jsBean().argsJson;
            if (jSONObject == null) {
                return;
            }
            Logger.getLogger().d("KNB:", jSONObject.toString());
            Map<String, Object> json2Map = FFPUtil.json2Map(jSONObject);
            json2Map.put("tType", ContainerEvent.CONTAINER_NAME_KNB);
            json2Map.put("newKNB", Boolean.FALSE);
            Weaver.getWeaver().weave(ContainerEvent.of(ContainerEvent.CONTAINER_NAME_KNB, jsHost().getActivity(), jsHost(), json2Map));
            jsCallback();
            if (Blanks.sEnable) {
                attachKNBInfo(json2Map);
            }
        } catch (Throwable th) {
            sErrorReporter.report(th);
        }
    }

    private void attachKNBInfo(@NonNull Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5da2f4f04ca785e49163c12fa746fc0e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5da2f4f04ca785e49163c12fa746fc0e");
        } else if ("whitescreen-start".equals((String) map.get("eType"))) {
            Activity activity = jsHost().getActivity();
            PagePathHelper findSpecialPagePath = Blanks.getInstance().findSpecialPagePath(activity, FFPUtil.idOfObj(activity));
            if (findSpecialPagePath instanceof KNBPagePath) {
                ((KNBPagePath) findSpecialPagePath).setOptions(map);
            }
        }
    }
}

package com.meituan.android.common.weaver.impl.knb;

import android.support.annotation.NonNull;
import com.meituan.android.common.weaver.impl.ErrorReporter;
import com.meituan.android.common.weaver.impl.blank.Blanks;
import com.meituan.android.common.weaver.impl.listener.LEnd;
import com.meituan.android.common.weaver.impl.listener.RenderEndEvent;
import com.meituan.android.common.weaver.impl.natives.PagePathHelper;
import com.meituan.android.common.weaver.impl.utils.Logger;
import com.meituan.android.common.weaver.interfaces.Weaver;
import com.meituan.android.common.weaver.interfaces.ffp.ContainerEvent;
import com.meituan.android.common.weaver.interfaces.ffp.FFPUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.protocol.jsbridge.RespResult;
import com.sankuai.titans.protocol.jsbridge.StrictJsBridge;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class FFPJsHandler extends StrictJsBridge<String, Void> {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final ErrorReporter sErrorReporter = new ErrorReporter("FFPJsHandler", 2);

    @Override // com.sankuai.titans.protocol.jsbridge.AbsJsHandler
    public void doExecAsync(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "54e09e5f3c57cf35a80714129b836698", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "54e09e5f3c57cf35a80714129b836698");
            return;
        }
        ffpAction(str);
        jsCallback(new RespResult.Builder().create());
    }

    public void ffpAction(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a851e785dab04bd54ceac6a5b241e8f9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a851e785dab04bd54ceac6a5b241e8f9");
            return;
        }
        try {
            Logger.getLogger().d("KNB:", str);
            Map<String, Object> json2Map = FFPUtil.json2Map(new JSONObject(str));
            json2Map.put("tType", ContainerEvent.CONTAINER_NAME_KNB);
            if (!json2Map.containsKey("ua")) {
                json2Map.put("ua", jsHost().getPageContext().getUA());
            }
            json2Map.put("kernel", jsHost().getPageContext().getContainerContext().getWebViewKernel());
            ContainerEvent of = ContainerEvent.of(ContainerEvent.CONTAINER_NAME_KNB, jsHost().getActivity(), jsHost().getPageContext().getContainerContext(), json2Map);
            if (!of.isCreate()) {
                Weaver.getWeaver().weave(of);
            }
            if (of.isEnd()) {
                new LEnd().onFFPRenderEnd(new RenderEndEvent(jsHost().getActivity(), of));
            }
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "47113eb150fc3fee3b7597eaa5ab31b9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "47113eb150fc3fee3b7597eaa5ab31b9");
        } else if ("whitescreen-start".equals((String) map.get("eType"))) {
            PagePathHelper findSpecialPagePath = Blanks.getInstance().findSpecialPagePath(jsHost().getActivity(), FFPUtil.idOfObj(jsHost().getPageContext().getContainerContext()));
            if (findSpecialPagePath instanceof KNBPagePath) {
                ((KNBPagePath) findSpecialPagePath).setOptions(map);
            }
        }
    }
}

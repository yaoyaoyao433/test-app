package com.dianping.titans.js.jshandler;

import android.content.Intent;
import android.support.annotation.NonNull;
import com.dianping.titans.js.JsBean;
import com.dianping.titans.js.JsCallback;
import com.dianping.titans.js.JsHost;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public interface JsHandler {
    void doExec();

    @Deprecated
    int getAuthority();

    boolean isApiSupported();

    JsBean jsBean();

    void jsCallback();

    void jsCallback(String str);

    void jsCallback(JSONObject jSONObject);

    int jsHandlerType();

    JsHost jsHost();

    void onActivityResult(int i, int i2, Intent intent);

    void onDestroy();

    void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr);

    @Deprecated
    void parseJsScheme(String str) throws Exception;

    @Deprecated
    void setJsCallback(JsCallback jsCallback);

    @Deprecated
    void setJsHandlerReportStrategy(JsHandlerReportStrategy jsHandlerReportStrategy);

    @Deprecated
    void setJsHandlerVerifyStrategy(JsHandlerVerifyStrategy jsHandlerVerifyStrategy);

    @Deprecated
    void setJsHost(JsHost jsHost);

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public enum Source {
        MRN,
        TITANS,
        THRID,
        MACH,
        PICASSO;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        Source() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7055fdffb069723584f91cb992d01bc6", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7055fdffb069723584f91cb992d01bc6");
            }
        }

        public static Source valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "35ba753cc9ce2f123df3265e0914ca42", RobustBitConfig.DEFAULT_VALUE) ? (Source) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "35ba753cc9ce2f123df3265e0914ca42") : (Source) Enum.valueOf(Source.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static Source[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b904f3487c2d80ca9a628e68a7659fea", RobustBitConfig.DEFAULT_VALUE) ? (Source[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b904f3487c2d80ca9a628e68a7659fea") : (Source[]) values().clone();
        }
    }
}

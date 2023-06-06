package com.meituan.mmp.lib.api.widget;

import com.meituan.mmp.lib.MMPWidgetFragment;
import com.meituan.mmp.lib.a;
import com.meituan.mmp.lib.api.ActivityApi;
import com.meituan.mmp.lib.api.d;
import com.meituan.mmp.lib.trace.b;
import com.meituan.mmp.main.IApiCallback;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class WidgetEventApi extends ActivityApi {
    public static ChangeQuickRedirect h;

    @Override // com.meituan.mmp.lib.api.InternalApi
    public final String[] b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f9751d3f06c448f01944211f81e648ff", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f9751d3f06c448f01944211f81e648ff") : new String[]{"triggerWidgetEvent"};
    }

    @Override // com.meituan.mmp.lib.api.AbsApi
    public void invoke(String str, JSONObject jSONObject, IApiCallback iApiCallback) throws d {
        Object[] objArr = {str, jSONObject, iApiCallback};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "18b06928f026006ce660a85a361e4d2d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "18b06928f026006ce660a85a361e4d2d");
            return;
        }
        Object[] objArr2 = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = h;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "223b9f16af88b1cdb93c9edbb1bb0a5c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "223b9f16af88b1cdb93c9edbb1bb0a5c");
        } else if (jSONObject != null) {
            a containerByPageIdOrCurContainer = getContainerByPageIdOrCurContainer(jSONObject.optInt("__mmp__viewId"));
            if (containerByPageIdOrCurContainer == null) {
                b.d("InnerApi", "triggerWidgetEvent but container not found");
            } else if (!containerByPageIdOrCurContainer.a()) {
                b.d("InnerApi", "triggerWidgetEvent but current container is not widget");
            } else {
                MMPWidgetFragment mMPWidgetFragment = (MMPWidgetFragment) containerByPageIdOrCurContainer.e;
                Object[] objArr3 = {jSONObject.optString("eventName"), jSONObject.optString("params")};
                ChangeQuickRedirect changeQuickRedirect3 = MMPWidgetFragment.h;
                if (PatchProxy.isSupport(objArr3, mMPWidgetFragment, changeQuickRedirect3, false, "6f2a3d75052442cd5756e84f2c9d4642", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, mMPWidgetFragment, changeQuickRedirect3, false, "6f2a3d75052442cd5756e84f2c9d4642");
                }
            }
        }
        iApiCallback.onSuccess(null);
    }
}

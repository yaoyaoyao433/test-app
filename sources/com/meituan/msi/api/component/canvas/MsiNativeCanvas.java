package com.meituan.msi.api.component.canvas;

import android.content.Context;
import android.view.View;
import com.google.gson.JsonObject;
import com.meituan.msi.annotations.MsiComponent;
import com.meituan.msi.api.component.canvas.param.MsiCanvasParam;
import com.meituan.msi.bean.MsiContext;
import com.meituan.msi.component.IMsiComponent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@MsiComponent(invokeParamType = JsonObject.class, name = "MSICanvas", property = MsiCanvasParam.class)
/* loaded from: classes3.dex */
public class MsiNativeCanvas extends e implements IMsiComponent<JsonObject> {
    public static ChangeQuickRedirect d;

    @Override // com.meituan.msi.component.IMsiComponent
    public final /* synthetic */ View a(String str, String str2, JsonObject jsonObject, MsiContext msiContext) {
        JsonObject jsonObject2 = jsonObject;
        Object[] objArr = {str, str2, jsonObject2, msiContext};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee89e494aace5658044dfbe3cc328571", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee89e494aace5658044dfbe3cc328571");
        }
        MsiNativeCanvas msiNativeCanvas = new MsiNativeCanvas(msiContext.getActivity());
        msiNativeCanvas.a(msiContext.getFileProvider());
        MsiCanvasParam msiCanvasParam = getMsiCanvasParam();
        msiCanvasParam.updateProperty(jsonObject2);
        if (msiCanvasParam.gesture) {
            msiNativeCanvas.a(msiContext, str, msiContext.getUIArgs());
        }
        return msiNativeCanvas;
    }

    @Override // com.meituan.msi.component.IMsiComponent
    public final /* synthetic */ boolean a(String str, String str2, JsonObject jsonObject) {
        JsonObject jsonObject2 = jsonObject;
        Object[] objArr = {str, str2, jsonObject2};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "21db3b2a48ff808f4aa8ff1793242e2f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "21db3b2a48ff808f4aa8ff1793242e2f")).booleanValue();
        }
        MsiCanvasParam msiCanvasParam = getMsiCanvasParam();
        msiCanvasParam.updateProperty(jsonObject2);
        a(msiCanvasParam);
        return true;
    }

    public MsiNativeCanvas(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "af84f6bc96336d37bd818f5c454f6c37", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "af84f6bc96336d37bd818f5c454f6c37");
        }
    }
}

package com.meituan.msi.api.component.input;

import android.os.Handler;
import android.os.Looper;
import com.google.gson.JsonObject;
import com.meituan.msi.annotations.MsiApiMethod;
import com.meituan.msi.bean.EventType;
import com.meituan.msi.bean.MsiContext;
import com.meituan.msi.view.MsiNativeViewApi;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.core.mlmodel.predictor.bean.TensorConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class InputApi extends MsiNativeViewApi<Input, JsonObject> {
    public static ChangeQuickRedirect a;
    protected static final Handler b = new Handler(Looper.getMainLooper());

    @MsiApiMethod(eventType = EventType.VIEW_EVENT, isCallback = true, name = "input.onBlur")
    public void onBlur(MsiContext msiContext) {
    }

    @MsiApiMethod(eventType = EventType.VIEW_EVENT, isCallback = true, name = "input.onConfirm")
    public void onConfirm(MsiContext msiContext) {
    }

    @MsiApiMethod(eventType = EventType.VIEW_EVENT, isCallback = true, name = "input.onFocus")
    public void onFocus(MsiContext msiContext) {
    }

    @MsiApiMethod(eventType = EventType.VIEW_EVENT, isCallback = true, name = "input.onInput")
    public void onInput(MsiContext msiContext) {
    }

    @MsiApiMethod(eventType = EventType.VIEW_EVENT, isCallback = true, name = "input.onKeyBoardHeightChange")
    public void onKeyBoardHeightChange(MsiContext msiContext) {
    }

    @Override // com.meituan.msi.view.MsiNativeViewApi
    public final /* synthetic */ Input a(MsiContext msiContext, JsonObject jsonObject, JsonObject jsonObject2) {
        JsonObject jsonObject3 = jsonObject2;
        Object[] objArr = {msiContext, jsonObject, jsonObject3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e081b388c182be56093d31430518df52", RobustBitConfig.DEFAULT_VALUE)) {
            return (Input) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e081b388c182be56093d31430518df52");
        }
        final Input input = new Input();
        if (msiContext.getEventDispatcher() == null || msiContext.getPageContext() == null || msiContext.getActivityContext() == null) {
            msiContext.onError("failed to init input");
            return input;
        }
        com.meituan.msi.dispather.a aVar = new com.meituan.msi.dispather.a(msiContext.getEventDispatcher(), jsonObject);
        InputParam inputParam = input.getInputParam();
        inputParam.updateProperty(jsonObject3);
        input.a(String.valueOf(msiContext.getViewId()), String.valueOf(msiContext.getPageId()), inputParam, aVar, msiContext.getPageContext(), msiContext.getActivityContext());
        b.postDelayed(new Runnable() { // from class: com.meituan.msi.api.component.input.InputApi.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d713b25870cceafdd14d096501b20fe0", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d713b25870cceafdd14d096501b20fe0");
                } else {
                    input.requestFocus();
                }
            }
        }, 100L);
        return input;
    }

    @Override // com.meituan.msi.view.MsiNativeViewApi
    public final /* synthetic */ boolean a(MsiContext msiContext, Input input, int i, int i2, JsonObject jsonObject, JsonObject jsonObject2) {
        Input input2 = input;
        JsonObject jsonObject3 = jsonObject2;
        Object[] objArr = {msiContext, input2, Integer.valueOf(i), Integer.valueOf(i2), jsonObject, jsonObject3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a82cfcc536773f47cfedc9a8ba31498", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a82cfcc536773f47cfedc9a8ba31498")).booleanValue();
        }
        if (jsonObject3 == null) {
            return false;
        }
        InputParam inputParam = input2.getInputParam();
        inputParam.updateProperty(jsonObject3);
        input2.a(inputParam);
        return true;
    }

    @MsiApiMethod(name = TensorConfig.KEY_INPUT_ARRAY, request = JsonObject.class)
    public void beforeOperation(JsonObject jsonObject, MsiContext msiContext) {
        Object[] objArr = {jsonObject, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8dc637c547a5630a6ab0adff3110f32f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8dc637c547a5630a6ab0adff3110f32f");
        } else {
            a(msiContext, (MsiContext) jsonObject);
        }
    }
}

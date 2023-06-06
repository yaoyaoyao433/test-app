package com.meituan.msi.api.component.textaera;

import com.google.gson.JsonObject;
import com.meituan.msi.annotations.MsiApiMethod;
import com.meituan.msi.bean.EventType;
import com.meituan.msi.bean.MsiContext;
import com.meituan.msi.util.m;
import com.meituan.msi.view.MsiNativeViewApi;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class TextAreaApi extends MsiNativeViewApi<TextArea, TextAreaParam> {
    public static ChangeQuickRedirect a;
    public a b;

    @MsiApiMethod(eventType = EventType.VIEW_EVENT, isCallback = true, name = "textarea.onBlur")
    public void onBlur(MsiContext msiContext) {
    }

    @MsiApiMethod(eventType = EventType.VIEW_EVENT, isCallback = true, name = "textarea.onConfirm")
    public void onConfirm(MsiContext msiContext) {
    }

    @MsiApiMethod(eventType = EventType.VIEW_EVENT, isCallback = true, name = "textarea.onFocus")
    public void onFocus(MsiContext msiContext) {
    }

    @MsiApiMethod(eventType = EventType.VIEW_EVENT, isCallback = true, name = "textarea.onInput")
    public void onInput(MsiContext msiContext) {
    }

    @MsiApiMethod(eventType = EventType.VIEW_EVENT, isCallback = true, name = "textarea.onKeyBoardHeightChange")
    public void onKeyboardHeightChange(MsiContext msiContext) {
    }

    @MsiApiMethod(eventType = EventType.VIEW_EVENT, isCallback = true, name = "textarea.onTextAreaHeightChange")
    public void onTextAreaHeightChange(MsiContext msiContext) {
    }

    @Override // com.meituan.msi.view.MsiNativeViewApi
    public final /* synthetic */ TextArea a(MsiContext msiContext, JsonObject jsonObject, TextAreaParam textAreaParam) {
        TextAreaParam textAreaParam2 = textAreaParam;
        Object[] objArr = {msiContext, jsonObject, textAreaParam2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2eec1845eb00ce6009cb480e4795760a", RobustBitConfig.DEFAULT_VALUE)) {
            return (TextArea) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2eec1845eb00ce6009cb480e4795760a");
        }
        TextArea textArea = new TextArea();
        if (this.b != null) {
            textArea.setMSITextAreaOriginPositionManager(this.b);
        }
        textArea.a(com.meituan.msi.a.f(), String.valueOf(msiContext.getViewId()), String.valueOf(msiContext.getPageId()), textAreaParam2, new com.meituan.msi.dispather.a(msiContext.getEventDispatcher(), jsonObject), msiContext.getPageContext(), msiContext.getActivityContext());
        return textArea;
    }

    @Override // com.meituan.msi.view.MsiNativeViewApi
    public final /* synthetic */ boolean a(MsiContext msiContext, TextArea textArea, int i, int i2, JsonObject jsonObject, TextAreaParam textAreaParam) {
        TextArea textArea2 = textArea;
        TextAreaParam textAreaParam2 = textAreaParam;
        Object[] objArr = {msiContext, textArea2, Integer.valueOf(i), Integer.valueOf(i2), jsonObject, textAreaParam2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bcde1be2e257a8a69e8ca34d0770a232", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bcde1be2e257a8a69e8ca34d0770a232")).booleanValue();
        }
        if (textAreaParam2 != null && textAreaParam2.autoSize != null && textAreaParam2.autoSize.booleanValue()) {
            JsonObject asJsonObject = jsonObject.getAsJsonObject("position");
            if (asJsonObject == null) {
                msiContext.onError("can not update textarea, position is empty");
                return false;
            }
            asJsonObject.addProperty("height", (Number) (-2));
            jsonObject.add("position", asJsonObject);
            msiContext.setUIArgs(jsonObject);
        }
        if (textArea2 != null) {
            textArea2.a(textAreaParam2);
            return true;
        }
        return false;
    }

    @MsiApiMethod(name = "textarea", request = TextAreaParam.class)
    public void beforeOperation(TextAreaParam textAreaParam, final MsiContext msiContext) {
        Object[] objArr = {textAreaParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a267a485f8b3a958f46f554ae16a641", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a267a485f8b3a958f46f554ae16a641");
            return;
        }
        if (this.b == null) {
            m.b(new Runnable() { // from class: com.meituan.msi.api.component.textaera.TextAreaApi.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0a12df90c4cce961c04972f7b377d182", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0a12df90c4cce961c04972f7b377d182");
                    } else if (TextAreaApi.this.b != null || msiContext.getPageContext() == null || msiContext.getPageContext().a(msiContext.getPageId()) == null) {
                    } else {
                        int identityHashCode = System.identityHashCode(msiContext.getPageContext().a(msiContext.getPageId()));
                        TextAreaApi textAreaApi = TextAreaApi.this;
                        Object[] objArr3 = {Integer.valueOf(identityHashCode)};
                        ChangeQuickRedirect changeQuickRedirect3 = a.a;
                        textAreaApi.b = PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "56b6df33fe3f158e98d715b3c143b468", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "56b6df33fe3f158e98d715b3c143b468") : new a(identityHashCode);
                    }
                }
            });
        }
        a(msiContext, (MsiContext) textAreaParam);
    }
}

package com.sankuai.waimai.bussiness.order.comment.rn;

import android.support.annotation.Nullable;
import android.view.ViewGroup;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.common.c;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.ao;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class CommentEditViewManager extends SimpleViewManager<a> {
    public static final int INSERT_WORD_TO_EDIT_TEXT = 1001;
    public static final int KEYBOARD_DISMISS = 1002;
    public static final String REACT_CLASS = "OrderEditView";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public a createViewInstance(ao aoVar) {
        Object[] objArr = {aoVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7d4cac363e7d4a4272c5ffd441942df3", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7d4cac363e7d4a4272c5ffd441942df3");
        }
        a aVar = new a(aoVar, aoVar.getCurrentActivity(), REACT_CLASS);
        aVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        return aVar;
    }

    @ReactProp(name = "hint")
    public void setHint(a aVar, String str) {
        Object[] objArr = {aVar, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "da20a32eea60e02e4586836eacee77df", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "da20a32eea60e02e4586836eacee77df");
        } else {
            aVar.setHintText(str);
        }
    }

    @ReactProp(name = "foodNameList")
    public void setFoodNameList(a aVar, ReadableArray readableArray) {
        Object[] objArr = {aVar, readableArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d1f0f132fe87361a85a545cfe4af48bc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d1f0f132fe87361a85a545cfe4af48bc");
        } else {
            aVar.setFoodNameList(readableArray);
        }
    }

    @ReactProp(name = "textCountTipVisible")
    public void setTextCountTipVisible(a aVar, boolean z) {
        Object[] objArr = {aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "541091f84d6a64797d59be2c0f34e8da", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "541091f84d6a64797d59be2c0f34e8da");
        } else {
            aVar.setTextCountTipVisible(z);
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @Nullable
    public Map<String, Integer> getCommandsMap() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e2aca3e602e0f5eb9853542efb4dd62b", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e2aca3e602e0f5eb9853542efb4dd62b") : c.a("keyboardDismiss", 1002, "insertWordToEditText", 1001);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(a aVar, int i, @Nullable ReadableArray readableArray) {
        Object[] objArr = {aVar, Integer.valueOf(i), readableArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ab78789477ed9dafe3a80150c2032bab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ab78789477ed9dafe3a80150c2032bab");
        } else if (aVar == null || i == 1002 || i != 1001 || readableArray == null) {
        } else {
            String string = readableArray.getString(0);
            Object[] objArr2 = {string};
            ChangeQuickRedirect changeQuickRedirect3 = a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect3, false, "88b36e153d4f6e10f56c1d358e605eca", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect3, false, "88b36e153d4f6e10f56c1d358e605eca");
            } else if (aVar.b != null) {
                aVar.b.a(string);
            }
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map getExportedCustomBubblingEventTypeConstants() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fca14cb6530a78b4ac3be80d90475070", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fca14cb6530a78b4ac3be80d90475070") : c.b().a("onTextChange", c.a("phasedRegistrationNames", c.a("bubbled", "onTextChange"))).a();
    }
}

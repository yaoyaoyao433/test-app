package com.meituan.msc.views.text;

import android.support.annotation.Nullable;
import com.meituan.msc.uimanager.ReactShadowNodeImpl;
import com.meituan.msc.uimanager.annotations.ReactProp;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class RNRawTextShadowNode extends ReactShadowNodeImpl {
    public static ChangeQuickRedirect a;
    @Nullable
    String b;

    @Override // com.meituan.msc.uimanager.ReactShadowNodeImpl
    public final boolean a() {
        return true;
    }

    @Override // com.meituan.msc.uimanager.ReactShadowNodeImpl, com.meituan.msc.uimanager.aa
    public final boolean b() {
        return true;
    }

    public RNRawTextShadowNode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "26f8683bb6fbb222d3275075f98d2d0b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "26f8683bb6fbb222d3275075f98d2d0b");
        } else {
            this.b = "";
        }
    }

    @ReactProp(name = "text")
    public void setText(@Nullable String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b6a31f8d7afb2d11c9619b83d5ca4bcd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b6a31f8d7afb2d11c9619b83d5ca4bcd");
            return;
        }
        this.b = str;
        e();
    }

    @Override // com.meituan.msc.uimanager.ReactShadowNodeImpl
    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fdca9b21d0cd484227d8a05efc93dd13", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fdca9b21d0cd484227d8a05efc93dd13");
        }
        return i() + " [text: " + this.b + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT;
    }
}

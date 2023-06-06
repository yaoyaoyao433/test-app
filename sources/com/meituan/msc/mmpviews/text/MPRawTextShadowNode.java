package com.meituan.msc.mmpviews.text;

import android.support.annotation.Nullable;
import com.meituan.msc.jse.bridge.Dynamic;
import com.meituan.msc.uimanager.ReactShadowNodeImpl;
import com.meituan.msc.uimanager.annotations.ReactProp;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class MPRawTextShadowNode extends ReactShadowNodeImpl {
    public static ChangeQuickRedirect a;
    @Nullable
    String b;

    @Override // com.meituan.msc.uimanager.ReactShadowNodeImpl, com.meituan.msc.uimanager.aa
    public final boolean b() {
        return true;
    }

    public MPRawTextShadowNode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ec68e6809b371ad953631ed37fad7f1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ec68e6809b371ad953631ed37fad7f1");
        } else {
            this.b = "";
        }
    }

    @ReactProp(name = "text")
    public void setText(@Nullable Dynamic dynamic) {
        Object[] objArr = {dynamic};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a934e3ec48572e4f95abd74f708aaf01", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a934e3ec48572e4f95abd74f708aaf01");
            return;
        }
        if (dynamic == null) {
            this.b = "";
        } else {
            switch (dynamic.getType()) {
                case Number:
                    double asDouble = dynamic.asDouble();
                    int i = (int) asDouble;
                    if (asDouble == i) {
                        this.b = String.valueOf(i);
                        break;
                    } else {
                        this.b = String.valueOf(asDouble);
                        break;
                    }
                case String:
                    this.b = dynamic.asString();
                    break;
                default:
                    this.b = dynamic.toString();
                    break;
            }
        }
        e();
    }

    @Override // com.meituan.msc.uimanager.ReactShadowNodeImpl
    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c01f9a888cd9d078aede54f524659a09", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c01f9a888cd9d078aede54f524659a09");
        }
        return i() + " [text: " + this.b + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT;
    }
}

package com.meituan.msc.views.view;

import com.meituan.android.recce.props.gens.PaddingEnd;
import com.meituan.android.recce.props.gens.PaddingStart;
import com.meituan.android.recce.props.gens.PaddingVertical;
import com.meituan.msc.jse.bridge.Dynamic;
import com.meituan.msc.uimanager.LayoutShadowNode;
import com.meituan.msc.uimanager.ReactShadowNodeImpl;
import com.meituan.msc.uimanager.annotations.ReactPropGroup;
import com.meituan.msc.uimanager.ax;
import com.meituan.msc.uimanager.s;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class RNLayoutShadowNode extends LayoutShadowNode {
    public static ChangeQuickRedirect C;

    @Override // com.meituan.msc.uimanager.ReactShadowNodeImpl
    public final boolean a() {
        return true;
    }

    @Override // com.meituan.msc.uimanager.ReactShadowNodeImpl
    public final void i(int i) {
    }

    @ReactPropGroup(names = {"padding", PaddingVertical.LOWER_CASE_NAME, "paddingHorizontal", PaddingStart.LOWER_CASE_NAME, PaddingEnd.LOWER_CASE_NAME, "paddingTop", "paddingBottom", "paddingLeft", "paddingRight"})
    public void setPaddings(int i, Dynamic dynamic) {
        Object[] objArr = {Integer.valueOf(i), dynamic};
        ChangeQuickRedirect changeQuickRedirect = C;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a80e084558102f09192800c12b469dd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a80e084558102f09192800c12b469dd");
        } else if (b()) {
        } else {
            int b = b(ax.c[i]);
            this.O.a(dynamic);
            switch (this.O.c) {
                case POINT:
                case UNDEFINED:
                    float f = this.O.b;
                    Object[] objArr2 = {Integer.valueOf(b), Float.valueOf(f)};
                    ChangeQuickRedirect changeQuickRedirect2 = ReactShadowNodeImpl.Q;
                    if (!PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7c02aa0deffa882565fbd772766938e9", RobustBitConfig.DEFAULT_VALUE)) {
                        this.T[b] = f;
                        this.U[b] = false;
                        super.T();
                        break;
                    } else {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7c02aa0deffa882565fbd772766938e9");
                        break;
                    }
                case PERCENT:
                    b(b, this.O.b);
                    break;
            }
            dynamic.recycle();
        }
    }

    @Override // com.meituan.msc.uimanager.LayoutShadowNode
    public void setBorderWidths(int i, Dynamic dynamic) {
        Object[] objArr = {Integer.valueOf(i), dynamic};
        ChangeQuickRedirect changeQuickRedirect = C;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "42b16e040c4ba565ef3821bef3f257ac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "42b16e040c4ba565ef3821bef3f257ac");
        } else if (b()) {
        } else {
            int b = b(ax.b[i]);
            float a = s.a(dynamic);
            if (!com.meituan.android.msc.yoga.f.a(a) && a < 0.0f) {
                a = Float.NaN;
            }
            if (!com.meituan.android.msc.yoga.f.a(a)) {
                a = s.a(a);
            }
            c(b, a);
        }
    }
}

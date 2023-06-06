package com.meituan.msc.uimanager;

import android.support.annotation.Nullable;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.recce.props.gens.AspectRatio;
import com.meituan.android.recce.props.gens.BorderBottomWidth;
import com.meituan.android.recce.props.gens.BorderEndWidth;
import com.meituan.android.recce.props.gens.BorderLeftWidth;
import com.meituan.android.recce.props.gens.BorderRightWidth;
import com.meituan.android.recce.props.gens.BorderStartWidth;
import com.meituan.android.recce.props.gens.FlexBasis;
import com.meituan.android.recce.props.gens.FlexGrow;
import com.meituan.android.recce.props.gens.FlexShrink;
import com.meituan.android.recce.props.gens.MarginBottom;
import com.meituan.android.recce.props.gens.MarginEnd;
import com.meituan.android.recce.props.gens.MarginHorizontal;
import com.meituan.android.recce.props.gens.MarginLeft;
import com.meituan.android.recce.props.gens.MarginRight;
import com.meituan.android.recce.props.gens.MarginStart;
import com.meituan.android.recce.props.gens.MarginTop;
import com.meituan.android.recce.props.gens.MarginVertical;
import com.meituan.android.recce.props.gens.MinHeight;
import com.meituan.android.recce.props.gens.MinWidth;
import com.meituan.metrics.sampler.fps.FpsEvent;
import com.meituan.msc.jse.bridge.Dynamic;
import com.meituan.msc.jse.bridge.ReadableType;
import com.meituan.msc.uimanager.annotations.ReactProp;
import com.meituan.msc.uimanager.annotations.ReactPropGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class LayoutShadowNode extends ReactShadowNodeImpl {
    public static ChangeQuickRedirect N;
    protected final a O;
    public boolean P;

    @ReactPropGroup(defaultFloat = Float.NaN, names = {"borderWidth", BorderStartWidth.LOWER_CASE_NAME, BorderEndWidth.LOWER_CASE_NAME, "borderTopWidth", BorderBottomWidth.LOWER_CASE_NAME, BorderLeftWidth.LOWER_CASE_NAME, BorderRightWidth.LOWER_CASE_NAME})
    public void setBorderWidths(int i, Dynamic dynamic) {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        public float b;
        public com.meituan.android.msc.yoga.s c;

        public a() {
        }

        public final void a(Dynamic dynamic) {
            Object[] objArr = {dynamic};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "54630275d0b6c2cb0e57bf524180793d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "54630275d0b6c2cb0e57bf524180793d");
            } else if (dynamic.isNull()) {
                this.c = com.meituan.android.msc.yoga.s.UNDEFINED;
                this.b = Float.NaN;
            } else if (dynamic.getType() == ReadableType.String) {
                String asString = dynamic.asString();
                if (asString.equals(FpsEvent.TYPE_SCROLL_AUTO)) {
                    this.c = com.meituan.android.msc.yoga.s.AUTO;
                    this.b = Float.NaN;
                } else if (asString.endsWith("%")) {
                    this.c = com.meituan.android.msc.yoga.s.PERCENT;
                    this.b = Float.parseFloat(asString.substring(0, asString.length() - 1));
                } else if (asString.endsWith("px")) {
                    this.c = com.meituan.android.msc.yoga.s.POINT;
                    this.b = Float.parseFloat(asString.substring(0, asString.length() - 2));
                } else if (Constants.UNDEFINED.equals(asString)) {
                    this.c = com.meituan.android.msc.yoga.s.AUTO;
                    this.b = Float.NaN;
                } else if (asString.matches("[-+]?[0-9]*\\.?[0-9]+")) {
                    try {
                        double parseDouble = Double.parseDouble(asString);
                        this.c = com.meituan.android.msc.yoga.s.POINT;
                        this.b = s.a(parseDouble);
                    } catch (NumberFormatException unused) {
                        throw new IllegalArgumentException("Unknown value: " + asString);
                    }
                } else {
                    throw new IllegalArgumentException("Unknown value: " + asString);
                }
            } else {
                this.c = com.meituan.android.msc.yoga.s.POINT;
                this.b = s.a(dynamic.asDouble());
            }
        }
    }

    public LayoutShadowNode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = N;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "98cffdb4ccd9a7ec2a315a282df5e3a4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "98cffdb4ccd9a7ec2a315a282df5e3a4");
        } else {
            this.O = new a();
        }
    }

    @ReactProp(name = "width")
    public void setWidth(Dynamic dynamic) {
        Object[] objArr = {dynamic};
        ChangeQuickRedirect changeQuickRedirect = N;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9cd2db5277a5472cf49f81d5f25a0054", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9cd2db5277a5472cf49f81d5f25a0054");
        } else if (b()) {
        } else {
            this.O.a(dynamic);
            switch (this.O.c) {
                case POINT:
                case UNDEFINED:
                    a(this.O.b);
                    break;
                case AUTO:
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = ReactShadowNodeImpl.Q;
                    if (!PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "95e0a40601866f4529541309e61ba815", RobustBitConfig.DEFAULT_VALUE)) {
                        this.V.n();
                        break;
                    } else {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "95e0a40601866f4529541309e61ba815");
                        break;
                    }
                case PERCENT:
                    float f = this.O.b;
                    Object[] objArr3 = {Float.valueOf(f)};
                    ChangeQuickRedirect changeQuickRedirect3 = ReactShadowNodeImpl.Q;
                    if (!PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "aa57df1be216be9bfd464447fca942c8", RobustBitConfig.DEFAULT_VALUE)) {
                        this.V.g(f);
                        break;
                    } else {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "aa57df1be216be9bfd464447fca942c8");
                        break;
                    }
            }
            dynamic.recycle();
        }
    }

    @ReactProp(name = MinWidth.LOWER_CASE_NAME)
    public void setMinWidth(Dynamic dynamic) {
        Object[] objArr = {dynamic};
        ChangeQuickRedirect changeQuickRedirect = N;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bdbcbf240af1e6f671fe86f03037c3e7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bdbcbf240af1e6f671fe86f03037c3e7");
        } else if (b()) {
        } else {
            this.O.a(dynamic);
            int i = AnonymousClass1.a[this.O.c.ordinal()];
            if (i != 4) {
                switch (i) {
                    case 1:
                    case 2:
                        float f = this.O.b;
                        Object[] objArr2 = {Float.valueOf(f)};
                        ChangeQuickRedirect changeQuickRedirect2 = ReactShadowNodeImpl.Q;
                        if (!PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4c0eb554d8d17781015f7bd4b7ee54c3", RobustBitConfig.DEFAULT_VALUE)) {
                            this.V.j(f);
                            break;
                        } else {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4c0eb554d8d17781015f7bd4b7ee54c3");
                            break;
                        }
                }
            } else {
                float f2 = this.O.b;
                Object[] objArr3 = {Float.valueOf(f2)};
                ChangeQuickRedirect changeQuickRedirect3 = ReactShadowNodeImpl.Q;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "da46be55f74eaae6ef0d820ce21bf056", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "da46be55f74eaae6ef0d820ce21bf056");
                } else {
                    this.V.k(f2);
                }
            }
            dynamic.recycle();
        }
    }

    @ReactProp(name = "collapsable")
    public void setCollapsable(boolean z) {
        this.P = z;
    }

    @ReactProp(name = "maxWidth")
    public void setMaxWidth(Dynamic dynamic) {
        Object[] objArr = {dynamic};
        ChangeQuickRedirect changeQuickRedirect = N;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e49bad29af0e2d74043dd2358c1c9b6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e49bad29af0e2d74043dd2358c1c9b6");
        } else if (b()) {
        } else {
            this.O.a(dynamic);
            int i = AnonymousClass1.a[this.O.c.ordinal()];
            if (i != 4) {
                switch (i) {
                    case 1:
                    case 2:
                        float f = this.O.b;
                        Object[] objArr2 = {Float.valueOf(f)};
                        ChangeQuickRedirect changeQuickRedirect2 = ReactShadowNodeImpl.Q;
                        if (!PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "90a58446289bf685c5a36e28752f80c5", RobustBitConfig.DEFAULT_VALUE)) {
                            this.V.n(f);
                            break;
                        } else {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "90a58446289bf685c5a36e28752f80c5");
                            break;
                        }
                }
            } else {
                float f2 = this.O.b;
                Object[] objArr3 = {Float.valueOf(f2)};
                ChangeQuickRedirect changeQuickRedirect3 = ReactShadowNodeImpl.Q;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b35451dea3d71252756f7662ad0cf96a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b35451dea3d71252756f7662ad0cf96a");
                } else {
                    this.V.o(f2);
                }
            }
            dynamic.recycle();
        }
    }

    @ReactProp(name = "height")
    public void setHeight(Dynamic dynamic) {
        Object[] objArr = {dynamic};
        ChangeQuickRedirect changeQuickRedirect = N;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f2ab050d2b53ed0405b1bd644d9ed6cc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f2ab050d2b53ed0405b1bd644d9ed6cc");
        } else if (b()) {
        } else {
            this.O.a(dynamic);
            switch (this.O.c) {
                case POINT:
                case UNDEFINED:
                    b(this.O.b);
                    break;
                case AUTO:
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = ReactShadowNodeImpl.Q;
                    if (!PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5e22934e36b760afff8d1d66bbcf7a5f", RobustBitConfig.DEFAULT_VALUE)) {
                        this.V.p();
                        break;
                    } else {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5e22934e36b760afff8d1d66bbcf7a5f");
                        break;
                    }
                case PERCENT:
                    float f = this.O.b;
                    Object[] objArr3 = {Float.valueOf(f)};
                    ChangeQuickRedirect changeQuickRedirect3 = ReactShadowNodeImpl.Q;
                    if (!PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "7d4a62381e07cde8b2607c318ec12e32", RobustBitConfig.DEFAULT_VALUE)) {
                        this.V.i(f);
                        break;
                    } else {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "7d4a62381e07cde8b2607c318ec12e32");
                        break;
                    }
            }
            dynamic.recycle();
        }
    }

    @ReactProp(name = MinHeight.LOWER_CASE_NAME)
    public void setMinHeight(Dynamic dynamic) {
        Object[] objArr = {dynamic};
        ChangeQuickRedirect changeQuickRedirect = N;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0df21c9b82224b6abdd77eb4d719524a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0df21c9b82224b6abdd77eb4d719524a");
        } else if (b()) {
        } else {
            this.O.a(dynamic);
            int i = AnonymousClass1.a[this.O.c.ordinal()];
            if (i != 4) {
                switch (i) {
                    case 1:
                    case 2:
                        float f = this.O.b;
                        Object[] objArr2 = {Float.valueOf(f)};
                        ChangeQuickRedirect changeQuickRedirect2 = ReactShadowNodeImpl.Q;
                        if (!PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8143717a6b196e9af578e49ae75bc10a", RobustBitConfig.DEFAULT_VALUE)) {
                            this.V.l(f);
                            break;
                        } else {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8143717a6b196e9af578e49ae75bc10a");
                            break;
                        }
                }
            } else {
                float f2 = this.O.b;
                Object[] objArr3 = {Float.valueOf(f2)};
                ChangeQuickRedirect changeQuickRedirect3 = ReactShadowNodeImpl.Q;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "70fbf8a7cc656546ac6e6c15bc25b9cf", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "70fbf8a7cc656546ac6e6c15bc25b9cf");
                } else {
                    this.V.m(f2);
                }
            }
            dynamic.recycle();
        }
    }

    @ReactProp(name = "maxHeight")
    public void setMaxHeight(Dynamic dynamic) {
        Object[] objArr = {dynamic};
        ChangeQuickRedirect changeQuickRedirect = N;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "80b6a7db6318402770669da0ae99d31d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "80b6a7db6318402770669da0ae99d31d");
        } else if (b()) {
        } else {
            this.O.a(dynamic);
            int i = AnonymousClass1.a[this.O.c.ordinal()];
            if (i != 4) {
                switch (i) {
                    case 1:
                    case 2:
                        float f = this.O.b;
                        Object[] objArr2 = {Float.valueOf(f)};
                        ChangeQuickRedirect changeQuickRedirect2 = ReactShadowNodeImpl.Q;
                        if (!PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "199828f6774fab614216506bacb59095", RobustBitConfig.DEFAULT_VALUE)) {
                            this.V.p(f);
                            break;
                        } else {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "199828f6774fab614216506bacb59095");
                            break;
                        }
                }
            } else {
                float f2 = this.O.b;
                Object[] objArr3 = {Float.valueOf(f2)};
                ChangeQuickRedirect changeQuickRedirect3 = ReactShadowNodeImpl.Q;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "3103eef317df089783c9ff990c7c894c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "3103eef317df089783c9ff990c7c894c");
                } else {
                    this.V.q(f2);
                }
            }
            dynamic.recycle();
        }
    }

    @Override // com.meituan.msc.uimanager.ReactShadowNodeImpl
    @ReactProp(defaultFloat = 0.0f, name = "flex")
    public void setFlex(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = N;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e8b51271eebf7b922ed075352da3d2d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e8b51271eebf7b922ed075352da3d2d");
        } else if (b()) {
        } else {
            super.setFlex(f);
        }
    }

    @Override // com.meituan.msc.uimanager.ReactShadowNodeImpl
    @ReactProp(defaultFloat = 0.0f, name = FlexGrow.LOWER_CASE_NAME)
    public void setFlexGrow(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = N;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b945c807c82561d97211c67d12c47895", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b945c807c82561d97211c67d12c47895");
        } else if (b()) {
        } else {
            super.setFlexGrow(f);
        }
    }

    @Override // com.meituan.msc.uimanager.ReactShadowNodeImpl
    @ReactProp(defaultFloat = 0.0f, name = FlexShrink.LOWER_CASE_NAME)
    public void setFlexShrink(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = N;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e02d7e61854133b7f625b9b748d73fd4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e02d7e61854133b7f625b9b748d73fd4");
        } else if (b()) {
        } else {
            super.setFlexShrink(f);
        }
    }

    @ReactProp(name = FlexBasis.LOWER_CASE_NAME)
    public void setFlexBasis(Dynamic dynamic) {
        Object[] objArr = {dynamic};
        ChangeQuickRedirect changeQuickRedirect = N;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4bb08fa158863cbe65dcefdccae6401f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4bb08fa158863cbe65dcefdccae6401f");
        } else if (b()) {
        } else {
            this.O.a(dynamic);
            switch (this.O.c) {
                case POINT:
                case UNDEFINED:
                    float f = this.O.b;
                    Object[] objArr2 = {Float.valueOf(f)};
                    ChangeQuickRedirect changeQuickRedirect2 = ReactShadowNodeImpl.Q;
                    if (!PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "332cefa27782d816fa9da91064e9b0e3", RobustBitConfig.DEFAULT_VALUE)) {
                        this.V.d(f);
                        break;
                    } else {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "332cefa27782d816fa9da91064e9b0e3");
                        break;
                    }
                case AUTO:
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = ReactShadowNodeImpl.Q;
                    if (!PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "3f9ad045d45b96125686fc76d2d6f3af", RobustBitConfig.DEFAULT_VALUE)) {
                        this.V.l();
                        break;
                    } else {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "3f9ad045d45b96125686fc76d2d6f3af");
                        break;
                    }
                case PERCENT:
                    float f2 = this.O.b;
                    Object[] objArr4 = {Float.valueOf(f2)};
                    ChangeQuickRedirect changeQuickRedirect4 = ReactShadowNodeImpl.Q;
                    if (!PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "e7569da3cbbf18c6ac29d2cb37390229", RobustBitConfig.DEFAULT_VALUE)) {
                        this.V.e(f2);
                        break;
                    } else {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "e7569da3cbbf18c6ac29d2cb37390229");
                        break;
                    }
            }
            dynamic.recycle();
        }
    }

    @ReactProp(defaultFloat = Float.NaN, name = AspectRatio.LOWER_CASE_NAME)
    public void setAspectRatio(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = N;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d52a2b38db0a604fc6fa0c4e3e4efd70", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d52a2b38db0a604fc6fa0c4e3e4efd70");
            return;
        }
        Object[] objArr2 = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = ReactShadowNodeImpl.Q;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "83a511d24158cf5122ce987f6886594f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "83a511d24158cf5122ce987f6886594f");
        } else {
            this.V.r(f);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004a, code lost:
        if (r13.equals("column-reverse") == false) goto L33;
     */
    @com.meituan.msc.uimanager.annotations.ReactProp(name = com.meituan.android.recce.props.gens.FlexDirection.LOWER_CASE_NAME)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setFlexDirection(@android.support.annotation.Nullable java.lang.String r13) {
        /*
            r12 = this;
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r13
            com.meituan.robust.ChangeQuickRedirect r10 = com.meituan.msc.uimanager.LayoutShadowNode.N
            java.lang.String r11 = "0c5d63d1791509fea1f88794a0014da0"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r2 = r12
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1b
            com.meituan.robust.PatchProxy.accessDispatch(r8, r12, r10, r9, r11)
            return
        L1b:
            boolean r1 = r12.b()
            if (r1 == 0) goto L22
            return
        L22:
            if (r13 != 0) goto L2a
            com.meituan.android.msc.yoga.j r13 = com.meituan.android.msc.yoga.j.COLUMN
            r12.a(r13)
            return
        L2a:
            r1 = -1
            int r2 = r13.hashCode()
            r3 = -1448970769(0xffffffffa9a275ef, float:-7.2147034E-14)
            if (r2 == r3) goto L62
            r3 = -1354837162(0xffffffffaf3ed356, float:-1.7355481E-10)
            if (r2 == r3) goto L58
            r3 = 113114(0x1b9da, float:1.58506E-40)
            if (r2 == r3) goto L4d
            r3 = 1272730475(0x4bdc536b, float:2.887855E7)
            if (r2 == r3) goto L44
            goto L6d
        L44:
            java.lang.String r2 = "column-reverse"
            boolean r2 = r13.equals(r2)
            if (r2 == 0) goto L6d
            goto L6e
        L4d:
            java.lang.String r0 = "row"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L6d
            r0 = 2
            goto L6e
        L58:
            java.lang.String r0 = "column"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L6d
            r0 = 0
            goto L6e
        L62:
            java.lang.String r0 = "row-reverse"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L6d
            r0 = 3
            goto L6e
        L6d:
            r0 = -1
        L6e:
            switch(r0) {
                case 0: goto L98;
                case 1: goto L92;
                case 2: goto L8c;
                case 3: goto L86;
                default: goto L71;
            }
        L71:
            com.meituan.msc.jse.bridge.JSApplicationIllegalArgumentException r0 = new com.meituan.msc.jse.bridge.JSApplicationIllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "invalid value for flexDirection: "
            r1.<init>(r2)
            r1.append(r13)
            java.lang.String r13 = r1.toString()
            r0.<init>(r13)
            throw r0
        L86:
            com.meituan.android.msc.yoga.j r13 = com.meituan.android.msc.yoga.j.ROW_REVERSE
            r12.a(r13)
            return
        L8c:
            com.meituan.android.msc.yoga.j r13 = com.meituan.android.msc.yoga.j.ROW
            r12.a(r13)
            return
        L92:
            com.meituan.android.msc.yoga.j r13 = com.meituan.android.msc.yoga.j.COLUMN_REVERSE
            r12.a(r13)
            return
        L98:
            com.meituan.android.msc.yoga.j r13 = com.meituan.android.msc.yoga.j.COLUMN
            r12.a(r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.msc.uimanager.LayoutShadowNode.setFlexDirection(java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0046, code lost:
        if (r13.equals("wrap") == false) goto L29;
     */
    @com.meituan.msc.uimanager.annotations.ReactProp(name = com.meituan.android.recce.props.gens.FlexWrap.LOWER_CASE_NAME)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setFlexWrap(@android.support.annotation.Nullable java.lang.String r13) {
        /*
            r12 = this;
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r13
            com.meituan.robust.ChangeQuickRedirect r10 = com.meituan.msc.uimanager.LayoutShadowNode.N
            java.lang.String r11 = "0ff7c0b5dc62c09f1c8e6aae41db5a12"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r2 = r12
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1b
            com.meituan.robust.PatchProxy.accessDispatch(r8, r12, r10, r9, r11)
            return
        L1b:
            boolean r1 = r12.b()
            if (r1 == 0) goto L22
            return
        L22:
            if (r13 != 0) goto L2a
            com.meituan.android.msc.yoga.u r13 = com.meituan.android.msc.yoga.u.NO_WRAP
            r12.a(r13)
            return
        L2a:
            r1 = -1
            int r2 = r13.hashCode()
            r3 = -1039592053(0xffffffffc209158b, float:-34.271038)
            if (r2 == r3) goto L54
            r3 = -749527969(0xffffffffd3531c5f, float:-9.0671409E11)
            if (r2 == r3) goto L49
            r3 = 3657802(0x37d04a, float:5.125672E-39)
            if (r2 == r3) goto L3f
            goto L5f
        L3f:
            java.lang.String r2 = "wrap"
            boolean r2 = r13.equals(r2)
            if (r2 == 0) goto L5f
            goto L60
        L49:
            java.lang.String r0 = "wrap-reverse"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L5f
            r0 = 2
            goto L60
        L54:
            java.lang.String r0 = "nowrap"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L5f
            r0 = 0
            goto L60
        L5f:
            r0 = -1
        L60:
            switch(r0) {
                case 0: goto L84;
                case 1: goto L7e;
                case 2: goto L78;
                default: goto L63;
            }
        L63:
            com.meituan.msc.jse.bridge.JSApplicationIllegalArgumentException r0 = new com.meituan.msc.jse.bridge.JSApplicationIllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "invalid value for flexWrap: "
            r1.<init>(r2)
            r1.append(r13)
            java.lang.String r13 = r1.toString()
            r0.<init>(r13)
            throw r0
        L78:
            com.meituan.android.msc.yoga.u r13 = com.meituan.android.msc.yoga.u.WRAP_REVERSE
            r12.a(r13)
            return
        L7e:
            com.meituan.android.msc.yoga.u r13 = com.meituan.android.msc.yoga.u.WRAP
            r12.a(r13)
            return
        L84:
            com.meituan.android.msc.yoga.u r13 = com.meituan.android.msc.yoga.u.NO_WRAP
            r12.a(r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.msc.uimanager.LayoutShadowNode.setFlexWrap(java.lang.String):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005b, code lost:
        if (r13.equals(com.meituan.metrics.sampler.fps.FpsEvent.TYPE_SCROLL_AUTO) != false) goto L17;
     */
    @com.meituan.msc.uimanager.annotations.ReactProp(name = com.meituan.android.recce.props.gens.AlignSelf.LOWER_CASE_NAME)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setAlignSelf(@android.support.annotation.Nullable java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.msc.uimanager.LayoutShadowNode.setAlignSelf(java.lang.String):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0066, code lost:
        if (r13.equals("flex-start") != false) goto L17;
     */
    @com.meituan.msc.uimanager.annotations.ReactProp(name = com.meituan.android.recce.props.gens.AlignItems.LOWER_CASE_NAME)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setAlignItems(@android.support.annotation.Nullable java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.msc.uimanager.LayoutShadowNode.setAlignItems(java.lang.String):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0065, code lost:
        if (r13.equals("flex-start") != false) goto L17;
     */
    @com.meituan.msc.uimanager.annotations.ReactProp(name = com.meituan.android.recce.props.gens.AlignContent.LOWER_CASE_NAME)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setAlignContent(@android.support.annotation.Nullable java.lang.String r13) {
        /*
            r12 = this;
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r13
            com.meituan.robust.ChangeQuickRedirect r10 = com.meituan.msc.uimanager.LayoutShadowNode.N
            java.lang.String r11 = "84eda7fa3f59f1e41776bacc6da8d1ac"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r2 = r12
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1b
            com.meituan.robust.PatchProxy.accessDispatch(r8, r12, r10, r9, r11)
            return
        L1b:
            boolean r1 = r12.b()
            if (r1 == 0) goto L22
            return
        L22:
            if (r13 != 0) goto L2a
            com.meituan.android.msc.yoga.a r13 = com.meituan.android.msc.yoga.a.FLEX_START
            r12.c(r13)
            return
        L2a:
            r1 = -1
            int r2 = r13.hashCode()
            switch(r2) {
                case -1881872635: goto L7c;
                case -1720785339: goto L72;
                case -1364013995: goto L68;
                case -46581362: goto L5e;
                case 3005871: goto L54;
                case 441309761: goto L49;
                case 1742952711: goto L3e;
                case 1937124468: goto L33;
                default: goto L32;
            }
        L32:
            goto L87
        L33:
            java.lang.String r0 = "space-around"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L87
            r0 = 7
            goto L88
        L3e:
            java.lang.String r0 = "flex-end"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L87
            r0 = 3
            goto L88
        L49:
            java.lang.String r0 = "space-between"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L87
            r0 = 6
            goto L88
        L54:
            java.lang.String r0 = "auto"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L87
            r0 = 0
            goto L88
        L5e:
            java.lang.String r2 = "flex-start"
            boolean r2 = r13.equals(r2)
            if (r2 == 0) goto L87
            goto L88
        L68:
            java.lang.String r0 = "center"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L87
            r0 = 2
            goto L88
        L72:
            java.lang.String r0 = "baseline"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L87
            r0 = 5
            goto L88
        L7c:
            java.lang.String r0 = "stretch"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L87
            r0 = 4
            goto L88
        L87:
            r0 = -1
        L88:
            switch(r0) {
                case 0: goto Lca;
                case 1: goto Lc4;
                case 2: goto Lbe;
                case 3: goto Lb8;
                case 4: goto Lb2;
                case 5: goto Lac;
                case 6: goto La6;
                case 7: goto La0;
                default: goto L8b;
            }
        L8b:
            com.meituan.msc.jse.bridge.JSApplicationIllegalArgumentException r0 = new com.meituan.msc.jse.bridge.JSApplicationIllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "invalid value for alignContent: "
            r1.<init>(r2)
            r1.append(r13)
            java.lang.String r13 = r1.toString()
            r0.<init>(r13)
            throw r0
        La0:
            com.meituan.android.msc.yoga.a r13 = com.meituan.android.msc.yoga.a.SPACE_AROUND
            r12.c(r13)
            return
        La6:
            com.meituan.android.msc.yoga.a r13 = com.meituan.android.msc.yoga.a.SPACE_BETWEEN
            r12.c(r13)
            return
        Lac:
            com.meituan.android.msc.yoga.a r13 = com.meituan.android.msc.yoga.a.BASELINE
            r12.c(r13)
            return
        Lb2:
            com.meituan.android.msc.yoga.a r13 = com.meituan.android.msc.yoga.a.STRETCH
            r12.c(r13)
            return
        Lb8:
            com.meituan.android.msc.yoga.a r13 = com.meituan.android.msc.yoga.a.FLEX_END
            r12.c(r13)
            return
        Lbe:
            com.meituan.android.msc.yoga.a r13 = com.meituan.android.msc.yoga.a.CENTER
            r12.c(r13)
            return
        Lc4:
            com.meituan.android.msc.yoga.a r13 = com.meituan.android.msc.yoga.a.FLEX_START
            r12.c(r13)
            return
        Lca:
            com.meituan.android.msc.yoga.a r13 = com.meituan.android.msc.yoga.a.AUTO
            r12.c(r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.msc.uimanager.LayoutShadowNode.setAlignContent(java.lang.String):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0070, code lost:
        if (r13.equals("center") != false) goto L17;
     */
    @com.meituan.msc.uimanager.annotations.ReactProp(name = com.meituan.android.recce.props.gens.JustifyContent.LOWER_CASE_NAME)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setJustifyContent(@android.support.annotation.Nullable java.lang.String r13) {
        /*
            r12 = this;
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r13
            com.meituan.robust.ChangeQuickRedirect r10 = com.meituan.msc.uimanager.LayoutShadowNode.N
            java.lang.String r11 = "3e3c897bc596aa2eed09e97580553d70"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r2 = r12
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1b
            com.meituan.robust.PatchProxy.accessDispatch(r8, r12, r10, r9, r11)
            return
        L1b:
            boolean r1 = r12.b()
            if (r1 == 0) goto L22
            return
        L22:
            if (r13 != 0) goto L2a
            com.meituan.android.msc.yoga.k r13 = com.meituan.android.msc.yoga.k.FLEX_START
            r12.a(r13)
            return
        L2a:
            r1 = -1
            int r2 = r13.hashCode()
            switch(r2) {
                case -1364013995: goto L6a;
                case -46581362: goto L5f;
                case 441309761: goto L54;
                case 1742952711: goto L49;
                case 1937124468: goto L3e;
                case 2055030478: goto L33;
                default: goto L32;
            }
        L32:
            goto L73
        L33:
            java.lang.String r0 = "space-evenly"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L73
            r0 = 5
            goto L74
        L3e:
            java.lang.String r0 = "space-around"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L73
            r0 = 4
            goto L74
        L49:
            java.lang.String r0 = "flex-end"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L73
            r0 = 2
            goto L74
        L54:
            java.lang.String r0 = "space-between"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L73
            r0 = 3
            goto L74
        L5f:
            java.lang.String r0 = "flex-start"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L73
            r0 = 0
            goto L74
        L6a:
            java.lang.String r2 = "center"
            boolean r2 = r13.equals(r2)
            if (r2 == 0) goto L73
            goto L74
        L73:
            r0 = -1
        L74:
            switch(r0) {
                case 0: goto Laa;
                case 1: goto La4;
                case 2: goto L9e;
                case 3: goto L98;
                case 4: goto L92;
                case 5: goto L8c;
                default: goto L77;
            }
        L77:
            com.meituan.msc.jse.bridge.JSApplicationIllegalArgumentException r0 = new com.meituan.msc.jse.bridge.JSApplicationIllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "invalid value for justifyContent: "
            r1.<init>(r2)
            r1.append(r13)
            java.lang.String r13 = r1.toString()
            r0.<init>(r13)
            throw r0
        L8c:
            com.meituan.android.msc.yoga.k r13 = com.meituan.android.msc.yoga.k.SPACE_EVENLY
            r12.a(r13)
            return
        L92:
            com.meituan.android.msc.yoga.k r13 = com.meituan.android.msc.yoga.k.SPACE_AROUND
            r12.a(r13)
            return
        L98:
            com.meituan.android.msc.yoga.k r13 = com.meituan.android.msc.yoga.k.SPACE_BETWEEN
            r12.a(r13)
            return
        L9e:
            com.meituan.android.msc.yoga.k r13 = com.meituan.android.msc.yoga.k.FLEX_END
            r12.a(r13)
            return
        La4:
            com.meituan.android.msc.yoga.k r13 = com.meituan.android.msc.yoga.k.CENTER
            r12.a(r13)
            return
        Laa:
            com.meituan.android.msc.yoga.k r13 = com.meituan.android.msc.yoga.k.FLEX_START
            r12.a(r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.msc.uimanager.LayoutShadowNode.setJustifyContent(java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005c, code lost:
        if (r13.equals("hidden") != false) goto L21;
     */
    @com.meituan.msc.uimanager.annotations.ReactProp(name = "overflow")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setOverflow(@android.support.annotation.Nullable java.lang.String r13) {
        /*
            r12 = this;
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r13
            com.meituan.robust.ChangeQuickRedirect r10 = com.meituan.msc.uimanager.LayoutShadowNode.N
            java.lang.String r11 = "579be163e849bb082a96e87b95615293"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r2 = r12
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1b
            com.meituan.robust.PatchProxy.accessDispatch(r8, r12, r10, r9, r11)
            return
        L1b:
            boolean r1 = r12.b()
            if (r1 == 0) goto L22
            return
        L22:
            if (r13 != 0) goto L2a
            com.meituan.android.msc.yoga.q r13 = com.meituan.android.msc.yoga.q.VISIBLE
            r12.a(r13)
            return
        L2a:
            r1 = -1
            int r2 = r13.hashCode()
            r3 = -1217487446(0xffffffffb76e9daa, float:-1.42226145E-5)
            if (r2 == r3) goto L55
            r0 = -907680051(0xffffffffc9e5e6cd, float:-1883353.6)
            if (r2 == r0) goto L4a
            r0 = 466743410(0x1bd1f072, float:3.4731534E-22)
            if (r2 == r0) goto L3f
            goto L5f
        L3f:
            java.lang.String r0 = "visible"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L5f
            r0 = 0
            goto L60
        L4a:
            java.lang.String r0 = "scroll"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L5f
            r0 = 2
            goto L60
        L55:
            java.lang.String r2 = "hidden"
            boolean r2 = r13.equals(r2)
            if (r2 == 0) goto L5f
            goto L60
        L5f:
            r0 = -1
        L60:
            switch(r0) {
                case 0: goto L84;
                case 1: goto L7e;
                case 2: goto L78;
                default: goto L63;
            }
        L63:
            com.meituan.msc.jse.bridge.JSApplicationIllegalArgumentException r0 = new com.meituan.msc.jse.bridge.JSApplicationIllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "invalid value for overflow: "
            r1.<init>(r2)
            r1.append(r13)
            java.lang.String r13 = r1.toString()
            r0.<init>(r13)
            throw r0
        L78:
            com.meituan.android.msc.yoga.q r13 = com.meituan.android.msc.yoga.q.SCROLL
            r12.a(r13)
            return
        L7e:
            com.meituan.android.msc.yoga.q r13 = com.meituan.android.msc.yoga.q.HIDDEN
            r12.a(r13)
            return
        L84:
            com.meituan.android.msc.yoga.q r13 = com.meituan.android.msc.yoga.q.VISIBLE
            r12.a(r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.msc.uimanager.LayoutShadowNode.setOverflow(java.lang.String):void");
    }

    @ReactProp(name = "display")
    public void setDisplay(@Nullable String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = N;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "98c309ad65382fbd37b2a204cd8558cb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "98c309ad65382fbd37b2a204cd8558cb");
        } else if (b()) {
        } else {
            if (str == null) {
                a(com.meituan.android.msc.yoga.h.FLEX);
            } else {
                a(com.meituan.android.msc.yoga.h.a(str));
            }
        }
    }

    @ReactPropGroup(names = {"margin", MarginVertical.LOWER_CASE_NAME, MarginHorizontal.LOWER_CASE_NAME, MarginStart.LOWER_CASE_NAME, MarginEnd.LOWER_CASE_NAME, MarginTop.LOWER_CASE_NAME, MarginBottom.LOWER_CASE_NAME, MarginLeft.LOWER_CASE_NAME, MarginRight.LOWER_CASE_NAME})
    public void setMargins(int i, Dynamic dynamic) {
        Object[] objArr = {Integer.valueOf(i), dynamic};
        ChangeQuickRedirect changeQuickRedirect = N;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8939ce75fb58f23f8cdaf878b14f2620", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8939ce75fb58f23f8cdaf878b14f2620");
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
                    if (!PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9d54f31e81b055830a600f4ff4853d2c", RobustBitConfig.DEFAULT_VALUE)) {
                        this.V.a(com.meituan.android.msc.yoga.i.a(b), f);
                        break;
                    } else {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9d54f31e81b055830a600f4ff4853d2c");
                        break;
                    }
                case AUTO:
                    a(b);
                    break;
                case PERCENT:
                    a(b, this.O.b);
                    break;
            }
            dynamic.recycle();
        }
    }

    @ReactPropGroup(names = {"start", "end", "left", "right", "top", "bottom"})
    public void setPositionValues(int i, Dynamic dynamic) {
        Object[] objArr = {Integer.valueOf(i), dynamic};
        ChangeQuickRedirect changeQuickRedirect = N;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "830453267253f8fa39739b963758228f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "830453267253f8fa39739b963758228f");
        } else if (b()) {
        } else {
            int b = b(new int[]{4, 5, 0, 2, 1, 3}[i]);
            this.O.a(dynamic);
            int i2 = AnonymousClass1.a[this.O.c.ordinal()];
            if (i2 != 4) {
                switch (i2) {
                    case 1:
                    case 2:
                        float f = this.O.b;
                        Object[] objArr2 = {Integer.valueOf(b), Float.valueOf(f)};
                        ChangeQuickRedirect changeQuickRedirect2 = ReactShadowNodeImpl.Q;
                        if (!PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "35c92d0a40d3ae689fb168e16a7136ad", RobustBitConfig.DEFAULT_VALUE)) {
                            this.V.f(com.meituan.android.msc.yoga.i.a(b), f);
                            break;
                        } else {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "35c92d0a40d3ae689fb168e16a7136ad");
                            break;
                        }
                }
            } else {
                float f2 = this.O.b;
                Object[] objArr3 = {Integer.valueOf(b), Float.valueOf(f2)};
                ChangeQuickRedirect changeQuickRedirect3 = ReactShadowNodeImpl.Q;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b642375ecdbbb903dbef688634a1aaab", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b642375ecdbbb903dbef688634a1aaab");
                } else {
                    this.V.g(com.meituan.android.msc.yoga.i.a(b), f2);
                }
            }
            dynamic.recycle();
        }
    }

    public final int b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = N;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc0126c8a4b631df759320550eee4651", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc0126c8a4b631df759320550eee4651")).intValue();
        }
        com.meituan.msc.jse.modules.i18nmanager.a.a();
        t();
        if (i != 0) {
            if (i != 2) {
                return i;
            }
            return 5;
        }
        return 4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0060, code lost:
        if (r13.equals("relative") != false) goto L23;
     */
    @com.meituan.msc.uimanager.annotations.ReactProp(name = "position")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setPosition(@android.support.annotation.Nullable java.lang.String r13) {
        /*
            r12 = this;
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r13
            com.meituan.robust.ChangeQuickRedirect r10 = com.meituan.msc.uimanager.LayoutShadowNode.N
            java.lang.String r11 = "4f771ae81398d37c28df5a85e430902d"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r2 = r12
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1b
            com.meituan.robust.PatchProxy.accessDispatch(r8, r12, r10, r9, r11)
            return
        L1b:
            boolean r1 = r12.b()
            if (r1 == 0) goto L22
            return
        L22:
            if (r13 != 0) goto L2a
            com.meituan.android.msc.yoga.r r13 = com.meituan.android.msc.yoga.r.RELATIVE
            r12.a(r13)
            return
        L2a:
            r1 = -1
            int r2 = r13.hashCode()
            r3 = -892481938(0xffffffffcacdce6e, float:-6743863.0)
            if (r2 == r3) goto L63
            r3 = -554435892(0xffffffffdef3facc, float:-8.7902942E18)
            if (r2 == r3) goto L59
            r0 = 97445748(0x5cee774, float:1.945717E-35)
            if (r2 == r0) goto L4e
            r0 = 1728122231(0x67010d77, float:6.0943366E23)
            if (r2 == r0) goto L44
            goto L6e
        L44:
            java.lang.String r0 = "absolute"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L6e
            r0 = 2
            goto L6f
        L4e:
            java.lang.String r0 = "fixed"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L6e
            r0 = 3
            goto L6f
        L59:
            java.lang.String r2 = "relative"
            boolean r2 = r13.equals(r2)
            if (r2 == 0) goto L6e
            goto L6f
        L63:
            java.lang.String r0 = "static"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L6e
            r0 = 0
            goto L6f
        L6e:
            r0 = -1
        L6f:
            switch(r0) {
                case 0: goto L99;
                case 1: goto L93;
                case 2: goto L8d;
                case 3: goto L87;
                default: goto L72;
            }
        L72:
            com.meituan.msc.jse.bridge.JSApplicationIllegalArgumentException r0 = new com.meituan.msc.jse.bridge.JSApplicationIllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "invalid value for position: "
            r1.<init>(r2)
            r1.append(r13)
            java.lang.String r13 = r1.toString()
            r0.<init>(r13)
            throw r0
        L87:
            com.meituan.android.msc.yoga.r r13 = com.meituan.android.msc.yoga.r.FIXED
            r12.a(r13)
            return
        L8d:
            com.meituan.android.msc.yoga.r r13 = com.meituan.android.msc.yoga.r.ABSOLUTE
            r12.a(r13)
            return
        L93:
            com.meituan.android.msc.yoga.r r13 = com.meituan.android.msc.yoga.r.RELATIVE
            r12.a(r13)
            return
        L99:
            com.meituan.android.msc.yoga.r r13 = com.meituan.android.msc.yoga.r.STATIC
            r12.a(r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.msc.uimanager.LayoutShadowNode.setPosition(java.lang.String):void");
    }

    @Override // com.meituan.msc.uimanager.ReactShadowNodeImpl
    @ReactProp(name = "onLayout")
    public void setShouldNotifyOnLayout(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = N;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7301bd317661cb8a5fde46d65864a1bd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7301bd317661cb8a5fde46d65864a1bd");
        } else {
            super.setShouldNotifyOnLayout(z);
        }
    }
}

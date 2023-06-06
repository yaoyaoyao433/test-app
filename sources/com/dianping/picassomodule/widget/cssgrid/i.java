package com.dianping.picassomodule.widget.cssgrid;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class i implements Cloneable {
    public static ChangeQuickRedirect a;
    public a b;
    public float c;
    public float d;
    public float e;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public enum a {
        GRID_TEMPLATE_STYLE_PIXEL,
        GRID_TEMPLATE_STYLE_PERCENTAGE,
        GRID_TEMPLATE_STYLE_WEIGHT;
        
        public static ChangeQuickRedirect a;

        a() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b2ddd035e443f95c5fb868edf6fa749", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b2ddd035e443f95c5fb868edf6fa749");
            }
        }

        public static a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "90c5135359d2ee72e9b9c094d3b01c82", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "90c5135359d2ee72e9b9c094d3b01c82") : (a) Enum.valueOf(a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "dface22e5d56dea9fec4c966f4f0258f", RobustBitConfig.DEFAULT_VALUE) ? (a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "dface22e5d56dea9fec4c966f4f0258f") : (a[]) values().clone();
        }
    }

    public i() {
        this(a.GRID_TEMPLATE_STYLE_WEIGHT, 1.0f);
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "79723e23a8f2ebd55c3e45fe722f832c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "79723e23a8f2ebd55c3e45fe722f832c");
        }
    }

    public i(a aVar, float f) {
        Object[] objArr = {aVar, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3ad4a5b5d0fb9059d553a605e291eca7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3ad4a5b5d0fb9059d553a605e291eca7");
            return;
        }
        this.b = aVar;
        if (this.b == a.GRID_TEMPLATE_STYLE_PIXEL) {
            this.c = f;
        } else if (this.b == a.GRID_TEMPLATE_STYLE_PERCENTAGE) {
            this.d = f;
        } else if (this.b == a.GRID_TEMPLATE_STYLE_WEIGHT) {
            this.e = f;
        }
    }

    public final Object clone() throws CloneNotSupportedException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "18e6ab6d90a4ebf4042324c17378673c", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "18e6ab6d90a4ebf4042324c17378673c") : super.clone();
    }
}

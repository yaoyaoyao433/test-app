package com.meituan.msc.views.text;

import com.meituan.msc.jse.bridge.JSApplicationIllegalArgumentException;
import com.meituan.msc.uimanager.s;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class n {
    public static ChangeQuickRedirect a;
    public boolean b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public r h;

    public n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "852828f3062ba1a3dd6c14b9ea68894a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "852828f3062ba1a3dd6c14b9ea68894a");
            return;
        }
        this.b = true;
        this.c = Float.NaN;
        this.d = Float.NaN;
        this.e = Float.NaN;
        this.f = Float.NaN;
        this.g = Float.NaN;
        this.h = r.UNSET;
    }

    public final n a(n nVar) {
        Object[] objArr = {nVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "99baccb63ee4623557883dd4f3512df3", RobustBitConfig.DEFAULT_VALUE)) {
            return (n) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "99baccb63ee4623557883dd4f3512df3");
        }
        n nVar2 = new n();
        nVar2.b = this.b;
        nVar2.c = !Float.isNaN(nVar.c) ? nVar.c : this.c;
        nVar2.d = !Float.isNaN(nVar.d) ? nVar.d : this.d;
        nVar2.e = !Float.isNaN(nVar.e) ? nVar.e : this.e;
        nVar2.f = !Float.isNaN(nVar.f) ? nVar.f : this.f;
        nVar2.g = !Float.isNaN(nVar.g) ? nVar.g : this.g;
        nVar2.h = nVar.h != r.UNSET ? nVar.h : this.h;
        return nVar2;
    }

    public final void a(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e0e7e7273328c019713c45c40f617aec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e0e7e7273328c019713c45c40f617aec");
        } else if (f != 0.0f && f < 1.0f) {
            throw new JSApplicationIllegalArgumentException("maxFontSizeMultiplier must be NaN, 0, or >= 1");
        } else {
            this.f = f;
        }
    }

    public final int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c670c6128e433dfa9fdcfa8621d2e3a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c670c6128e433dfa9fdcfa8621d2e3a")).intValue();
        }
        float f = !Float.isNaN(this.c) ? this.c : 14.0f;
        if (this.b) {
            return (int) Math.ceil(s.a(f, d()));
        }
        return (int) Math.ceil(s.a(f));
    }

    public final float b() {
        float a2;
        boolean z = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a8d111de0d8cb127f8fe1b2122ad0c88", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a8d111de0d8cb127f8fe1b2122ad0c88")).floatValue();
        }
        if (Float.isNaN(this.d)) {
            return Float.NaN;
        }
        if (this.b) {
            a2 = s.a(this.d, d());
        } else {
            a2 = s.a(this.d);
        }
        if (!Float.isNaN(this.g) && this.g > a2) {
            z = true;
        }
        return z ? this.g : a2;
    }

    public final float c() {
        float a2;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6e1eae22e10706d344d2ca15867171f4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6e1eae22e10706d344d2ca15867171f4")).floatValue();
        }
        if (Float.isNaN(this.e)) {
            return Float.NaN;
        }
        if (this.b) {
            a2 = s.a(this.e, d());
        } else {
            a2 = s.a(this.e);
        }
        return a2 / a();
    }

    private float d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a95edbf7238688571d66f08a402ac518", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a95edbf7238688571d66f08a402ac518")).floatValue();
        }
        if (Float.isNaN(this.f)) {
            return 0.0f;
        }
        return this.f;
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd35449f9df378dc35de9054bc52cbd0", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd35449f9df378dc35de9054bc52cbd0");
        }
        return "TextAttributes {\n  getAllowFontScaling(): " + this.b + "\n  getFontSize(): " + this.c + "\n  getEffectiveFontSize(): " + a() + "\n  getHeightOfTallestInlineViewOrImage(): " + this.g + "\n  getLetterSpacing(): " + this.e + "\n  getEffectiveLetterSpacing(): " + c() + "\n  getLineHeight(): " + this.d + "\n  getEffectiveLineHeight(): " + b() + "\n  getTextTransform(): " + this.h + "\n  getMaxFontSizeMultiplier(): " + this.f + "\n  getEffectiveMaxFontSizeMultiplier(): " + d() + "\n}";
    }
}

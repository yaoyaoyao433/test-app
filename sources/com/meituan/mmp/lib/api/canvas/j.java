package com.meituan.mmp.lib.api.canvas;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.support.v4.view.ViewCompat;
import com.meituan.mmp.lib.utils.ar;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class j extends Paint {
    public static ChangeQuickRedirect a;
    public a b;
    private float c;
    private String d;
    private int e;
    private int f;

    public j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b02392f0147c2a0c6abbc7809d69bbf1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b02392f0147c2a0c6abbc7809d69bbf1");
            return;
        }
        this.b = a.NORMAL;
        this.c = getAlpha() / 255.0f;
        this.f = getColor();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public enum a {
        NORMAL,
        TOP,
        BOTTOM,
        MIDDLE;
        
        public static ChangeQuickRedirect a;

        a() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e23c889b96e651a3c6aa175c49280654", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e23c889b96e651a3c6aa175c49280654");
            }
        }

        public static a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c5af3f16a0c34d03838b9a5da4415858", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c5af3f16a0c34d03838b9a5da4415858") : (a) Enum.valueOf(a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8b67a84eb9f1be24adceb3ad893868a7", RobustBitConfig.DEFAULT_VALUE) ? (a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8b67a84eb9f1be24adceb3ad893868a7") : (a[]) values().clone();
        }
    }

    public final j a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1693c92bb7954a09d136888dc1931cd6", RobustBitConfig.DEFAULT_VALUE)) {
            return (j) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1693c92bb7954a09d136888dc1931cd6");
        }
        j jVar = new j();
        jVar.setColor(getColor());
        jVar.setFlags(getFlags());
        jVar.setDither(isDither());
        Shader shader = getShader();
        if (shader != null) {
            Object a2 = ar.a(Shader.class, "copy", shader, new Class[0], new Object[0]);
            if (a2 != null && (a2 instanceof Shader)) {
                shader = (Shader) a2;
            }
            jVar.setShader(shader);
        }
        jVar.setStrokeJoin(getStrokeJoin());
        jVar.setStrokeMiter(getStrokeMiter());
        jVar.setStrokeWidth(getStrokeWidth());
        jVar.setStrokeCap(getStrokeCap());
        jVar.setStyle(getStyle());
        jVar.setTextSize(getTextSize());
        jVar.setTextAlign(getTextAlign());
        jVar.setTypeface(getTypeface());
        jVar.b = this.b;
        return jVar;
    }

    public final void a(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e2866ffc1b806cae3276385be12476e2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e2866ffc1b806cae3276385be12476e2");
            return;
        }
        this.c = f;
        setColor(this.f);
    }

    @Override // android.graphics.Paint
    public final void setColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e7027bf154a1de07a7ca4440a2efb012", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e7027bf154a1de07a7ca4440a2efb012");
            return;
        }
        this.f = i;
        super.setColor((i & ViewCompat.MEASURED_SIZE_MASK) | ((((int) (Color.alpha(i) * this.c)) & 255) << 24));
    }

    @Override // android.graphics.Paint
    public final void reset() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c793af6209b6e433f595c127678b04e5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c793af6209b6e433f595c127678b04e5");
            return;
        }
        this.b = a.NORMAL;
        super.reset();
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5bbf03e05610575e4e3815611db6a27d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5bbf03e05610575e4e3815611db6a27d");
            return;
        }
        this.d = str;
        setTypeface(Typeface.create(str, this.e));
    }

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ac74641c98ec9c76b75c43082d2ec63", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ac74641c98ec9c76b75c43082d2ec63");
            return;
        }
        this.e = i;
        setTypeface(Typeface.create(this.d, i));
    }
}

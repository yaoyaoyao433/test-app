package com.meituan.msi.api.component.canvas.view;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.support.v4.view.ViewCompat;
import com.meituan.msi.util.z;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b extends Paint {
    public static ChangeQuickRedirect a;
    public a b;
    private float c;
    private String d;
    private int e;
    private int f;

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e818aacd50bd7767a2023c2057beb831", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e818aacd50bd7767a2023c2057beb831");
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
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e34e23e46c56fba4d7e7be0918eb739", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e34e23e46c56fba4d7e7be0918eb739");
            }
        }

        public static a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6287d5e81b45ef7dd91aea8862410d06", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6287d5e81b45ef7dd91aea8862410d06") : (a) Enum.valueOf(a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c39874155f226d2b41a027cc4813a7ba", RobustBitConfig.DEFAULT_VALUE) ? (a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c39874155f226d2b41a027cc4813a7ba") : (a[]) values().clone();
        }
    }

    public final b a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d47f1dd9c4c7bd6d6b2f05728849115b", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d47f1dd9c4c7bd6d6b2f05728849115b");
        }
        b bVar = new b();
        bVar.setColor(getColor());
        bVar.setFlags(getFlags());
        bVar.setDither(isDither());
        Shader shader = getShader();
        if (shader != null) {
            Object a2 = z.a(Shader.class, "copy", shader, new Class[0], new Object[0]);
            if (a2 instanceof Shader) {
                shader = (Shader) a2;
            }
            bVar.setShader(shader);
        }
        bVar.setStrokeJoin(getStrokeJoin());
        bVar.setStrokeMiter(getStrokeMiter());
        bVar.setStrokeWidth(getStrokeWidth());
        bVar.setStrokeCap(getStrokeCap());
        bVar.setStyle(getStyle());
        bVar.setTextSize(getTextSize());
        bVar.setTextAlign(getTextAlign());
        bVar.setTypeface(getTypeface());
        bVar.b = this.b;
        return bVar;
    }

    public final void a(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d4a4ef7fde8cccc15f6fa98730312e51", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d4a4ef7fde8cccc15f6fa98730312e51");
            return;
        }
        this.c = f;
        setColor(this.f);
    }

    @Override // android.graphics.Paint
    public final void setColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "64fc29f3e34582ab59fc1178b40f8d32", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "64fc29f3e34582ab59fc1178b40f8d32");
            return;
        }
        this.f = i;
        super.setColor((i & ViewCompat.MEASURED_SIZE_MASK) | ((((int) (Color.alpha(i) * this.c)) & 255) << 24));
    }

    @Override // android.graphics.Paint
    public final void reset() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "252ead889f7c65cdad4180b3d8d3e8aa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "252ead889f7c65cdad4180b3d8d3e8aa");
            return;
        }
        this.b = a.NORMAL;
        super.reset();
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "05dc61faa36309a678c4633cf3b26a73", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "05dc61faa36309a678c4633cf3b26a73");
            return;
        }
        this.d = str;
        setTypeface(Typeface.create(str, this.e));
    }

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e65a5f4b0462aaea474a54fcc11e0d7c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e65a5f4b0462aaea474a54fcc11e0d7c");
            return;
        }
        this.e = i;
        setTypeface(Typeface.create(this.d, i));
    }
}

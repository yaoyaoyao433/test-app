package com.sankuai.waimai.platform.widget.labelview;

import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b {
    public static ChangeQuickRedirect a;
    final com.sankuai.waimai.platform.widget.labelview.a b;
    final com.sankuai.waimai.platform.widget.labelview.a c;
    int d;
    float e;
    float f;
    float g;
    float h;
    private final a i;
    @NonNull
    private C1096b j;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
        void a();
    }

    public b(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a35e9177172286ce5c4555215a875700", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a35e9177172286ce5c4555215a875700");
            return;
        }
        this.j = new C1096b();
        this.i = aVar;
        this.b = new com.sankuai.waimai.platform.widget.labelview.a(this.i);
        this.c = new com.sankuai.waimai.platform.widget.labelview.a(this.i);
    }

    public static com.sankuai.waimai.platform.widget.labelview.c a(TypedArray typedArray) {
        Object[] objArr = {typedArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "52ebc9a458ff3befc227ecbea1cc0d35", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.platform.widget.labelview.c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "52ebc9a458ff3befc227ecbea1cc0d35");
        }
        int color = typedArray.getColor(1, 0);
        Integer a2 = a(typedArray, 2);
        Integer a3 = a(typedArray, 3);
        Integer a4 = a(typedArray, 4);
        com.sankuai.waimai.platform.widget.labelview.c cVar = new com.sankuai.waimai.platform.widget.labelview.c();
        cVar.a(color, a2, a3, a4);
        return cVar;
    }

    public static Drawable b(TypedArray typedArray) {
        Object[] objArr = {typedArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fd8b1bf51f006bdeb7f5afb331d9f8de", RobustBitConfig.DEFAULT_VALUE)) {
            return (Drawable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fd8b1bf51f006bdeb7f5afb331d9f8de");
        }
        final Drawable drawable = typedArray.getDrawable(18);
        final Drawable drawable2 = typedArray.getDrawable(19);
        final Drawable drawable3 = typedArray.getDrawable(20);
        final Drawable drawable4 = typedArray.getDrawable(21);
        Object[] objArr2 = {drawable, drawable2, drawable3, drawable4};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        return PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "d1c8382618d9e4ce6a1ec82137478b86", RobustBitConfig.DEFAULT_VALUE) ? (Drawable) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "d1c8382618d9e4ce6a1ec82137478b86") : new c() { // from class: com.sankuai.waimai.platform.widget.labelview.b.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.platform.widget.labelview.b.c
            @Nullable
            public final Drawable a(int i) {
                Object[] objArr3 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e201baaa773ae88c15925912838029ee", RobustBitConfig.DEFAULT_VALUE)) {
                    return (Drawable) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e201baaa773ae88c15925912838029ee");
                }
                switch (i) {
                    case 2:
                        return drawable2;
                    case 3:
                        return drawable3;
                    case 4:
                        return drawable4;
                    default:
                        return drawable;
                }
            }
        }.a();
    }

    public final void c(TypedArray typedArray) {
        Object[] objArr = {typedArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cafb92576523637a5cdfc59bcc4c4de5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cafb92576523637a5cdfc59bcc4c4de5");
            return;
        }
        this.b.b(typedArray.getColor(5, 0), a(typedArray, 6), a(typedArray, 7), a(typedArray, 8));
        this.c.b(typedArray.getColor(9, 0), a(typedArray, 10), a(typedArray, 11), a(typedArray, 12));
        this.d = typedArray.getDimensionPixelSize(0, 0);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(13, 0);
        b(typedArray.getDimensionPixelSize(14, dimensionPixelSize), typedArray.getDimensionPixelSize(15, dimensionPixelSize), typedArray.getDimensionPixelSize(16, dimensionPixelSize), typedArray.getDimensionPixelSize(17, dimensionPixelSize));
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "17f53ca4c7d565d50e110f8d47095f97", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "17f53ca4c7d565d50e110f8d47095f97");
        } else {
            this.i.a();
        }
    }

    @Nullable
    private static Integer a(TypedArray typedArray, int i) {
        Object[] objArr = {typedArray, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0023053da61d240050b94bb94912e821", RobustBitConfig.DEFAULT_VALUE)) {
            return (Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0023053da61d240050b94bb94912e821");
        }
        if (typedArray.hasValue(i)) {
            return Integer.valueOf(typedArray.getColor(i, 0));
        }
        return null;
    }

    public final Drawable a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd30f1da4a02cab6f9747fb9df3878dd", RobustBitConfig.DEFAULT_VALUE) ? (Drawable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd30f1da4a02cab6f9747fb9df3878dd") : this.j.a();
    }

    public final void a(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c79bd8155c6642845b217445726f966", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c79bd8155c6642845b217445726f966");
        } else {
            a(f, f, f, f);
        }
    }

    public final void a(float f, float f2, float f3, float f4) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d004b6686053f1ab464c98c636b3c0b9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d004b6686053f1ab464c98c636b3c0b9");
            return;
        }
        b(f, f2, f3, f4);
        this.i.a();
    }

    private void b(float f, float f2, float f3, float f4) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f9138c31e978fef250d8f0023a3da8f8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f9138c31e978fef250d8f0023a3da8f8");
            return;
        }
        this.e = f;
        this.f = f2;
        this.g = f3;
        this.h = f4;
    }

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5fe52ab2f6a0b665fc2ae186e2bda4ab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5fe52ab2f6a0b665fc2ae186e2bda4ab");
        } else if (this.d != i) {
            this.d = i;
            this.i.a();
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.platform.widget.labelview.b$b  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    class C1096b extends c {
        public static ChangeQuickRedirect a;

        private C1096b() {
            Object[] objArr = {b.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a14c0cbb9db663439db425973adfb51", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a14c0cbb9db663439db425973adfb51");
            }
        }

        @Override // com.sankuai.waimai.platform.widget.labelview.b.c
        public final Drawable a(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "811c54292444bf13271024229f86c008", RobustBitConfig.DEFAULT_VALUE)) {
                return (Drawable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "811c54292444bf13271024229f86c008");
            }
            if (b.this.c.a(i) || b.this.b.a(i)) {
                int b = b.this.c.b(i);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(0);
                if (b.this.d > 0 && b != 0) {
                    gradientDrawable.setStroke(b.this.d, b);
                }
                gradientDrawable.setColor(b.this.b.b(i));
                gradientDrawable.setCornerRadii(new float[]{b.this.e, b.this.e, b.this.f, b.this.f, b.this.g, b.this.g, b.this.h, b.this.h});
                return gradientDrawable;
            }
            return null;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    static abstract class c implements d {
        public static ChangeQuickRedirect f;

        @Nullable
        public abstract Drawable a(int i);

        @Nullable
        public final Drawable a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = f;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fdd85c58df76b59ce2a18d336bd24831", RobustBitConfig.DEFAULT_VALUE)) {
                return (Drawable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fdd85c58df76b59ce2a18d336bd24831");
            }
            Drawable a = a(1);
            if (a == null) {
                return null;
            }
            StateListDrawable a2 = a(a(a(null, 4, d.g), 3, d.h), 2, d.i);
            if (a2 != null) {
                a2.addState(d.j, a);
                a2.setBounds(0, 0, a2.getMinimumWidth(), a2.getMinimumHeight());
                return a2;
            }
            return a;
        }

        private StateListDrawable a(StateListDrawable stateListDrawable, int i, int[] iArr) {
            Object[] objArr = {stateListDrawable, Integer.valueOf(i), iArr};
            ChangeQuickRedirect changeQuickRedirect = f;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ea9d75f036e839eb8cdd9f6f89973ab", RobustBitConfig.DEFAULT_VALUE)) {
                return (StateListDrawable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ea9d75f036e839eb8cdd9f6f89973ab");
            }
            Drawable a = a(i);
            if (a != null) {
                if (stateListDrawable == null) {
                    stateListDrawable = new StateListDrawable();
                }
                stateListDrawable.addState(iArr, a);
            }
            return stateListDrawable;
        }
    }
}

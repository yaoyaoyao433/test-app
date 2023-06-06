package com.sankuai.waimai.store.drug.newwidgets.labelview;

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
    final a b;
    final com.sankuai.waimai.store.drug.newwidgets.labelview.a c;
    final com.sankuai.waimai.store.drug.newwidgets.labelview.a d;
    int e;
    float f;
    float g;
    float h;
    float i;
    @NonNull
    C1165b j;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
        void a();
    }

    public b(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7354bc6f955893adb1c8485c21121c73", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7354bc6f955893adb1c8485c21121c73");
            return;
        }
        this.j = new C1165b();
        this.b = aVar;
        this.c = new com.sankuai.waimai.store.drug.newwidgets.labelview.a(this.b);
        this.d = new com.sankuai.waimai.store.drug.newwidgets.labelview.a(this.b);
    }

    public static com.sankuai.waimai.store.drug.newwidgets.labelview.c a(TypedArray typedArray) {
        Object[] objArr = {typedArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3f8b0532eef81a4ed122d600f6b8802d", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.store.drug.newwidgets.labelview.c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3f8b0532eef81a4ed122d600f6b8802d");
        }
        int color = typedArray.getColor(1, 0);
        Integer a2 = a(typedArray, 2);
        Integer a3 = a(typedArray, 3);
        Integer a4 = a(typedArray, 4);
        com.sankuai.waimai.store.drug.newwidgets.labelview.c cVar = new com.sankuai.waimai.store.drug.newwidgets.labelview.c();
        cVar.a(color, a2, a3, a4);
        return cVar;
    }

    public static Drawable b(TypedArray typedArray) {
        Object[] objArr = {typedArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "be57c713b4829af751aff1b41291ef7e", RobustBitConfig.DEFAULT_VALUE)) {
            return (Drawable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "be57c713b4829af751aff1b41291ef7e");
        }
        final Drawable drawable = typedArray.getDrawable(18);
        final Drawable drawable2 = typedArray.getDrawable(19);
        final Drawable drawable3 = typedArray.getDrawable(20);
        final Drawable drawable4 = typedArray.getDrawable(21);
        Object[] objArr2 = {drawable, drawable2, drawable3, drawable4};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        return PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "3b33adca107260bf8a68b39e63b58104", RobustBitConfig.DEFAULT_VALUE) ? (Drawable) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "3b33adca107260bf8a68b39e63b58104") : new c() { // from class: com.sankuai.waimai.store.drug.newwidgets.labelview.b.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.drug.newwidgets.labelview.b.c
            @Nullable
            public final Drawable a(int i) {
                Object[] objArr3 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "f6e87c41bbd07c3514a1f59279ff0754", RobustBitConfig.DEFAULT_VALUE)) {
                    return (Drawable) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "f6e87c41bbd07c3514a1f59279ff0754");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e7ec5e26336ee0c41f281b431466b9fc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e7ec5e26336ee0c41f281b431466b9fc");
            return;
        }
        this.c.b(typedArray.getColor(5, 0), a(typedArray, 6), a(typedArray, 7), a(typedArray, 8));
        this.d.b(typedArray.getColor(9, 0), a(typedArray, 10), a(typedArray, 11), a(typedArray, 12));
        this.e = typedArray.getDimensionPixelSize(0, 0);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(13, 0);
        a(typedArray.getDimensionPixelSize(14, dimensionPixelSize), typedArray.getDimensionPixelSize(15, dimensionPixelSize), typedArray.getDimensionPixelSize(16, dimensionPixelSize), typedArray.getDimensionPixelSize(17, dimensionPixelSize));
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1d02f3195e1aca9882df506b352aa694", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1d02f3195e1aca9882df506b352aa694");
        } else {
            this.b.a();
        }
    }

    @Nullable
    private static Integer a(TypedArray typedArray, int i) {
        Object[] objArr = {typedArray, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bc361e2b3af2ad7d20346dd80070517c", RobustBitConfig.DEFAULT_VALUE)) {
            return (Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bc361e2b3af2ad7d20346dd80070517c");
        }
        if (typedArray.hasValue(i)) {
            return Integer.valueOf(typedArray.getColor(i, 0));
        }
        return null;
    }

    public final void a(float f, float f2, float f3, float f4) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "58721b6ab29de50e77abddd0f062fe9b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "58721b6ab29de50e77abddd0f062fe9b");
            return;
        }
        this.f = f;
        this.g = f2;
        this.h = f3;
        this.i = f4;
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.store.drug.newwidgets.labelview.b$b  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    class C1165b extends c {
        public static ChangeQuickRedirect a;

        private C1165b() {
            Object[] objArr = {b.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2b6b4d9cf6274807e92574ee91b07c60", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2b6b4d9cf6274807e92574ee91b07c60");
            }
        }

        @Override // com.sankuai.waimai.store.drug.newwidgets.labelview.b.c
        public final Drawable a(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "28c7acc0bb93c7a9de4eb5019d2c99b3", RobustBitConfig.DEFAULT_VALUE)) {
                return (Drawable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "28c7acc0bb93c7a9de4eb5019d2c99b3");
            }
            if (b.this.d.a(i) || b.this.c.a(i)) {
                int b = b.this.d.b(i);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(0);
                if (b.this.e > 0 && b != 0) {
                    gradientDrawable.setStroke(b.this.e, b);
                }
                gradientDrawable.setColor(b.this.c.b(i));
                gradientDrawable.setCornerRadii(new float[]{b.this.f, b.this.f, b.this.g, b.this.g, b.this.h, b.this.h, b.this.i, b.this.i});
                return gradientDrawable;
            }
            return null;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    static abstract class c extends d {
        public static ChangeQuickRedirect f;

        @Nullable
        public abstract Drawable a(int i);

        @Nullable
        public final Drawable a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = f;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "11a4e9a7478f79256ddd2e947577ac50", RobustBitConfig.DEFAULT_VALUE)) {
                return (Drawable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "11a4e9a7478f79256ddd2e947577ac50");
            }
            Drawable a = a(1);
            if (a == null) {
                return null;
            }
            StateListDrawable a2 = a(a(a(null, 4, g), 3, h), 2, i);
            if (a2 != null) {
                a2.addState(j, a);
                a2.setBounds(0, 0, a2.getMinimumWidth(), a2.getMinimumHeight());
                return a2;
            }
            return a;
        }

        private StateListDrawable a(StateListDrawable stateListDrawable, int i, int[] iArr) {
            Object[] objArr = {stateListDrawable, Integer.valueOf(i), iArr};
            ChangeQuickRedirect changeQuickRedirect = f;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "151e98e7182d97f0d81fde01ae3be810", RobustBitConfig.DEFAULT_VALUE)) {
                return (StateListDrawable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "151e98e7182d97f0d81fde01ae3be810");
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

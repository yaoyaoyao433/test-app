package com.sankuai.waimai.store.drug.mach.component.image;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.renderscript.RSRuntimeException;
import android.support.v7.widget.AppCompatImageView;
import android.widget.ImageView;
import com.facebook.yoga.YogaMeasureFunction;
import com.facebook.yoga.YogaMeasureMode;
import com.facebook.yoga.c;
import com.facebook.yoga.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.meituan.mtimageloader.utils.BitmapTransformation;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.waimai.foundation.utils.r;
import com.sankuai.waimai.mach.component.base.a;
import com.sankuai.waimai.store.view.banner.roundview.UniversalImageView;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class CompatImageComponent extends a<AppCompatImageView> implements YogaMeasureFunction {
    public static ChangeQuickRedirect a;
    private static final ImageView.ScaleType[] b = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};
    private int c;
    private int d;
    private String e;
    private ImageView.ScaleType f;
    private int g;
    private float h;
    private float i;
    private float j;
    private String k;
    private float r;

    public CompatImageComponent() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0eac157479fdf4699805f609bf5167a7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0eac157479fdf4699805f609bf5167a7");
            return;
        }
        this.c = -2;
        this.d = -2;
        this.e = null;
        this.g = 0;
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = 1.0f;
        this.k = "0";
        this.r = 0.0f;
    }

    @Override // com.sankuai.waimai.mach.component.base.a
    public final /* synthetic */ void a(AppCompatImageView appCompatImageView) {
        BitmapTransformation[] bitmapTransformationArr;
        final AppCompatImageView appCompatImageView2 = appCompatImageView;
        Object[] objArr = {appCompatImageView2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "087a6218576ba05d26f97573fd87c9a4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "087a6218576ba05d26f97573fd87c9a4");
            return;
        }
        super.a((CompatImageComponent) appCompatImageView2);
        Object[] objArr2 = {appCompatImageView2};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fc1b9754dfa4b5a98fa5fba0f6917b06", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fc1b9754dfa4b5a98fa5fba0f6917b06");
        } else if (!i(this.e) || appCompatImageView2 == null) {
        } else {
            if (this.f != null) {
                appCompatImageView2.setScaleType(this.f);
            }
            ArrayList arrayList = new ArrayList();
            if ("1".equals(this.k)) {
                arrayList.add(new BlurTransformation(appCompatImageView2.getContext().getApplicationContext(), this.j, this.r));
            }
            b.C0608b a2 = com.sankuai.waimai.store.imageloader.a.a(this.e);
            a2.c = this.e;
            Object[] objArr3 = {arrayList};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "0e9a205ec696fa906efbf97b40678d4e", RobustBitConfig.DEFAULT_VALUE)) {
                bitmapTransformationArr = (BitmapTransformation[]) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "0e9a205ec696fa906efbf97b40678d4e");
            } else if (arrayList.isEmpty()) {
                bitmapTransformationArr = new BitmapTransformation[0];
            } else {
                bitmapTransformationArr = (BitmapTransformation[]) arrayList.toArray(new BitmapTransformation[0]);
            }
            a2.a(bitmapTransformationArr).a(new b.a() { // from class: com.sankuai.waimai.store.drug.mach.component.image.CompatImageComponent.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.meituan.mtimageloader.config.b.a
                public final void a() {
                }

                @Override // com.sankuai.meituan.mtimageloader.config.b.a
                public final void a(Bitmap bitmap) {
                    Object[] objArr4 = {bitmap};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "a0e609472713cfa8750331ad190d1de6", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "a0e609472713cfa8750331ad190d1de6");
                    } else if (bitmap != null) {
                        appCompatImageView2.setImageBitmap(bitmap);
                    }
                }
            });
        }
    }

    @Override // com.sankuai.waimai.mach.component.base.a
    public final /* synthetic */ AppCompatImageView b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "76ec964f428ee9d37b6f8afb5d31ec4b", RobustBitConfig.DEFAULT_VALUE)) {
            return (AppCompatImageView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "76ec964f428ee9d37b6f8afb5d31ec4b");
        }
        if (this.g > 0 || this.h > 0.0f || this.i > 0.0f) {
            return new UniversalImageView(context, this.g, this.h, this.i);
        }
        return new AppCompatImageView(context);
    }

    @Override // com.sankuai.waimai.mach.component.base.a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "09bbca3f0bed951202b90812c2bb57af", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "09bbca3f0bed951202b90812c2bb57af");
            return;
        }
        ac_().a((YogaMeasureFunction) this);
        if (this.m == null || this.m.getActivity() == null) {
            return;
        }
        String a2 = a("custom_width");
        if (i(a2)) {
            this.c = h.a(this.m.getActivity(), c(a2));
        }
        String a3 = a("custom_height");
        if (i(a3)) {
            this.d = h.a(this.m.getActivity(), c(a3));
        }
        this.e = a("image_url");
        String a4 = a("scale_type");
        if (i(a4)) {
            this.f = (ImageView.ScaleType) com.sankuai.shangou.stone.util.a.a(b, r.a(a4, 3));
        }
        String a5 = a("border_color");
        if (i(a5)) {
            this.g = h(a5);
        }
        String a6 = a("border_width");
        if (i(a6)) {
            this.h = h.a(this.m.getActivity(), c(a6));
        }
        String a7 = a("corner_radius");
        if (i(a7)) {
            this.i = h.a(this.m.getActivity(), c(a7));
        }
        String a8 = a("radius_percent");
        if (i(a8)) {
            this.j = c(a8);
        }
        String a9 = a("support_blur");
        if (i(a9)) {
            this.k = a9;
        }
        String a10 = a("off_set_top");
        if (i(a10)) {
            this.r = c(a10);
        }
    }

    @Override // com.facebook.yoga.YogaMeasureFunction
    public final long measure(d dVar, float f, YogaMeasureMode yogaMeasureMode, float f2, YogaMeasureMode yogaMeasureMode2) {
        Object[] objArr = {dVar, Float.valueOf(f), yogaMeasureMode, Float.valueOf(f2), yogaMeasureMode2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a5c96096fb639ec39026e59c0d0908a9", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a5c96096fb639ec39026e59c0d0908a9")).longValue() : c.a(this.c, this.d);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    static class BlurTransformation implements BitmapTransformation {
        public static ChangeQuickRedirect a;
        private final Context b;
        private final int c;
        private final float d;

        private BlurTransformation(Context context, float f, float f2) {
            Object[] objArr = {context, Float.valueOf(f), Float.valueOf(f2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c32662d525ae5234b8df1b019f82a0a", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c32662d525ae5234b8df1b019f82a0a");
                return;
            }
            this.b = context;
            this.c = Math.min((int) (f * 25.0f), 25);
            this.d = Math.max(Math.min(f2, 1.0f), -1.0f);
        }

        @Override // com.sankuai.meituan.mtimageloader.utils.BitmapTransformation
        public Bitmap transform(Bitmap bitmap, int i, int i2) {
            Bitmap bitmap2;
            Object[] objArr = {bitmap, Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            try {
            } catch (Throwable unused) {
                bitmap2 = bitmap;
            }
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "62b01bc1a3d46aa9d167c2368e89ea5d", RobustBitConfig.DEFAULT_VALUE)) {
                return (Bitmap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "62b01bc1a3d46aa9d167c2368e89ea5d");
            }
            try {
                bitmap2 = com.facebook.react.views.image.blur.c.a(this.b, bitmap, this.c);
            } catch (RSRuntimeException unused2) {
                bitmap2 = com.facebook.react.views.image.blur.b.a(bitmap, this.c, true);
            }
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            float f = height;
            float f2 = (width * 1.0f) / f;
            Rect rect = new Rect();
            Rect rect2 = new Rect();
            Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            int i3 = (int) ((((-this.d) * 3.0f) * f) / 8.0f);
            int i4 = (width * 3) / 8;
            int i5 = (height * 3) / 8;
            rect.set(i4, i5 + i3, (width / 4) + i4, (height / 4) + i5 + i3);
            rect2.set(0, 0, (int) (f2 * i2), i2);
            new Canvas(createBitmap).drawBitmap(bitmap2, rect, rect2, (Paint) null);
            return createBitmap;
        }
    }
}

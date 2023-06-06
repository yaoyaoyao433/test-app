package com.sankuai.waimai.store.mach.image;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.v7.widget.AppCompatImageView;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.yoga.YogaMeasureFunction;
import com.facebook.yoga.YogaMeasureMode;
import com.facebook.yoga.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.waimai.foundation.utils.r;
import com.sankuai.waimai.mach.parser.d;
import com.sankuai.waimai.store.view.banner.roundview.UniversalImageView;
import java.util.LinkedList;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends com.sankuai.waimai.mach.component.base.a<AppCompatImageView> implements YogaMeasureFunction {
    public static ChangeQuickRedirect a;
    private static final ImageView.ScaleType[] b = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};
    private int c;
    private int d;
    private String e;
    private ImageView.ScaleType f;
    private d g;
    private int h;
    private float i;
    private float j;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bff078be73ecf134b6fc61fc6377282f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bff078be73ecf134b6fc61fc6377282f");
            return;
        }
        this.c = 0;
        this.d = 0;
        this.e = null;
        this.h = 0;
        this.i = 0.0f;
        this.j = 0.0f;
    }

    @Override // com.sankuai.waimai.mach.component.base.a
    public final /* synthetic */ void a(AppCompatImageView appCompatImageView) {
        final AppCompatImageView appCompatImageView2 = appCompatImageView;
        Object[] objArr = {appCompatImageView2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f0d54541b3e0d61375d0493690669812", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f0d54541b3e0d61375d0493690669812");
            return;
        }
        super.a((a) appCompatImageView2);
        Object[] objArr2 = {appCompatImageView2};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "37ea23d6c2885528433bcfa3691ce6c5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "37ea23d6c2885528433bcfa3691ce6c5");
        } else if (!i(this.e) || appCompatImageView2 == null) {
        } else {
            b.C0608b a2 = com.sankuai.waimai.store.imageloader.a.a(this.e);
            a2.c = this.e;
            a2.a(new b.a() { // from class: com.sankuai.waimai.store.mach.image.a.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.meituan.mtimageloader.config.b.a
                public final void a() {
                }

                @Override // com.sankuai.meituan.mtimageloader.config.b.a
                public final void a(Bitmap bitmap) {
                    Object[] objArr3 = {bitmap};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "24ff6ebb8126d1c08764bba3e5598f1f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "24ff6ebb8126d1c08764bba3e5598f1f");
                    } else if (bitmap == null || bitmap.getWidth() <= 0 || bitmap.getHeight() <= 0) {
                    } else {
                        float width = (bitmap.getWidth() * 1.0f) / bitmap.getHeight();
                        ViewGroup.LayoutParams layoutParams = appCompatImageView2.getLayoutParams();
                        if (layoutParams == null) {
                            layoutParams = new ViewGroup.LayoutParams(a.this.c > 0 ? a.this.c : -2, a.this.d > 0 ? a.this.d : -2);
                        }
                        if (a.this.c > 0 || a.this.d <= 0) {
                            if (a.this.c > 0 && a.this.d <= 0) {
                                a.this.d = Math.round(a.this.c / width);
                                layoutParams.width = a.this.c;
                                layoutParams.height = a.this.d;
                            }
                        } else {
                            a.this.c = Math.round(a.this.d * width);
                            layoutParams.width = a.this.c;
                            layoutParams.height = a.this.d;
                        }
                        appCompatImageView2.setLayoutParams(layoutParams);
                        appCompatImageView2.setImageBitmap(bitmap);
                        if (a.this.g == null || a.this.m == null || a.this.m.getV8JSEngine() == null) {
                            return;
                        }
                        LinkedList linkedList = new LinkedList();
                        linkedList.add(Integer.valueOf(h.b(appCompatImageView2.getContext(), a.this.c)));
                        linkedList.add(Integer.valueOf(h.b(appCompatImageView2.getContext(), a.this.d)));
                        a.this.m.asyncCallJSMethod(a.this.g.b, linkedList);
                    }
                }
            }, 1);
        }
    }

    @Override // com.sankuai.waimai.mach.component.base.a
    public final /* synthetic */ AppCompatImageView b(Context context) {
        AppCompatImageView universalImageView;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c3d0c45f59845d81060a7bf7cbf795e7", RobustBitConfig.DEFAULT_VALUE)) {
            return (AppCompatImageView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c3d0c45f59845d81060a7bf7cbf795e7");
        }
        if (this.h > 0 || this.i > 0.0f || this.j > 0.0f) {
            universalImageView = new UniversalImageView(context, this.h, this.i, this.j);
        } else {
            universalImageView = new AppCompatImageView(context);
        }
        universalImageView.setLayoutParams(new ViewGroup.LayoutParams(this.c > 0 ? this.c : -2, this.d > 0 ? this.d : -2));
        if (this.f != null) {
            universalImageView.setScaleType(this.f);
        }
        return universalImageView;
    }

    @Override // com.sankuai.waimai.mach.component.base.a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4eecca8c4d63f489becb0476e6028180", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4eecca8c4d63f489becb0476e6028180");
            return;
        }
        ac_().a((YogaMeasureFunction) this);
        if (this.m == null || this.m.getActivity() == null) {
            return;
        }
        String a2 = a("custom_width");
        if (i(a2)) {
            this.c = h.a(this.m.getActivity(), f(a2));
        }
        String a3 = a("custom_height");
        if (i(a3)) {
            this.d = h.a(this.m.getActivity(), f(a3));
        }
        this.e = a("image_url");
        String a4 = a("scale_type");
        if (i(a4)) {
            this.f = (ImageView.ScaleType) com.sankuai.shangou.stone.util.a.a(b, r.a(a4, 3));
        }
        String a5 = a("border_color");
        if (i(a5)) {
            this.h = h(a5);
        }
        String a6 = a("border_width");
        if (i(a6)) {
            this.i = h.a(this.m.getActivity(), c(a6));
        }
        String a7 = a("corner_radius");
        if (i(a7)) {
            this.j = h.a(this.m.getActivity(), c(a7));
        }
        if (k() == null || !(k().get("@render-finished") instanceof d)) {
            return;
        }
        this.g = (d) k().get("@render-finished");
    }

    @Override // com.facebook.yoga.YogaMeasureFunction
    public final long measure(com.facebook.yoga.d dVar, float f, YogaMeasureMode yogaMeasureMode, float f2, YogaMeasureMode yogaMeasureMode2) {
        Object[] objArr = {dVar, Float.valueOf(f), yogaMeasureMode, Float.valueOf(f2), yogaMeasureMode2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "514a1df02c76df0501d0797e78a493da", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "514a1df02c76df0501d0797e78a493da")).longValue() : c.a(this.c, this.d);
    }
}

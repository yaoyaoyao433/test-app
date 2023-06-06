package com.sankuai.waimai.store.shopping.cart;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.AnimationDrawable;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.config.j;
import com.sankuai.waimai.store.util.monitor.monitor.StoreException;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class f {
    public static ChangeQuickRedirect a;
    private static f e;
    public HashMap<Integer, ImageView> b;
    public HashMap<Integer, WeakReference<ImageView>> c;
    public com.sankuai.waimai.store.platform.domain.manager.poi.a d;
    private boolean f;
    private Map<String, Object> g;

    public f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e5abc5de966027c4227e4082a8e6272", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e5abc5de966027c4227e4082a8e6272");
            return;
        }
        this.b = new HashMap<>();
        this.c = new HashMap<>();
        this.g = new HashMap();
    }

    public static f a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "01edaf5c027d70195c49691d65d721d7", RobustBitConfig.DEFAULT_VALUE)) {
            return (f) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "01edaf5c027d70195c49691d65d721d7");
        }
        if (e == null) {
            f fVar = new f();
            e = fVar;
            fVar.f = j.h().a("shopcart_imageview_leak", true);
        }
        return e;
    }

    public final void a(ImageView imageView, com.sankuai.waimai.store.platform.domain.manager.poi.a aVar) {
        Object[] objArr = {imageView, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f2dcc0cd8092d93adb58a6b121fb8519", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f2dcc0cd8092d93adb58a6b121fb8519");
            return;
        }
        a(imageView, false);
        this.d = aVar;
    }

    public final void a(@NonNull int[] iArr, String str) {
        DisplayMetrics displayMetrics;
        Object[] objArr = {iArr, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "249f6e23832d8e4541f788371c2d9244", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "249f6e23832d8e4541f788371c2d9244");
            return;
        }
        if (this.g == null) {
            this.g = new HashMap();
        }
        this.g.put(str, iArr);
        if (!this.g.containsKey(com.sankuai.waimai.store.order.a.e().s(str))) {
            this.g.put(com.sankuai.waimai.store.order.a.e().s(str), iArr);
        }
        Resources system = Resources.getSystem();
        if (system == null || (displayMetrics = system.getDisplayMetrics()) == null || displayMetrics.heightPixels * 0.6d <= iArr[1]) {
            return;
        }
        com.sankuai.waimai.store.util.monitor.c.a(StoreException.ShopCartAnimateException, "setMrnLocationError", String.format(Locale.CHINESE, "location: (%d,%d), poiId: %s", Integer.valueOf(iArr[0]), Integer.valueOf(iArr[1]), str));
    }

    public final int[] a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "117cd1b22c7e591cc932887e1789aed5", RobustBitConfig.DEFAULT_VALUE)) {
            return (int[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "117cd1b22c7e591cc932887e1789aed5");
        }
        if (t.a(str) || this.g == null) {
            return null;
        }
        int[] iArr = (int[]) this.g.get(str);
        return iArr == null ? (int[]) this.g.get(com.sankuai.waimai.store.order.a.e().s(str)) : iArr;
    }

    public final boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d939c75bea20e47f4e07ec5f12dccfca", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d939c75bea20e47f4e07ec5f12dccfca")).booleanValue() : (this.d == null || com.sankuai.waimai.store.order.a.e().k(this.d.d()) == null || this.d.t()) ? false : true;
    }

    public final void a(ImageView imageView, boolean z) {
        Object[] objArr = {imageView, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c4bf6219c6f43c53a4992d6f4201d4f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c4bf6219c6f43c53a4992d6f4201d4f");
        } else if (this.f) {
            if (this.c == null) {
                this.c = new HashMap<>();
            }
            if (!this.c.containsKey(Integer.valueOf(imageView.getContext().hashCode())) || z) {
                this.c.put(Integer.valueOf(imageView.getContext().hashCode()), new WeakReference<>(imageView));
            }
        } else {
            if (this.b == null) {
                this.b = new HashMap<>();
            }
            if (!this.b.containsKey(Integer.valueOf(imageView.getContext().hashCode())) || z) {
                this.b.put(Integer.valueOf(imageView.getContext().hashCode()), imageView);
            }
        }
    }

    @Deprecated
    public final void a(View view, long j) {
        Object[] objArr = {view, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b6f254506eeabe44c5caf1494a51a294", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b6f254506eeabe44c5caf1494a51a294");
        } else {
            a(view, String.valueOf(j));
        }
    }

    public final void a(View view, String str) {
        Object[] objArr = {view, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ab4d77ed6ca4d77de327e74a791a1044", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ab4d77ed6ca4d77de327e74a791a1044");
        } else if (b()) {
            a(view, (View) b(view.getContext().hashCode()), (ViewGroup) null, false, str);
        } else {
            a(view, b(view.getContext().hashCode()));
        }
    }

    public final void a(View view, int i, String str) {
        Object[] objArr = {view, Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "88e640a6bfa0671f63e4b3adf861793f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "88e640a6bfa0671f63e4b3adf861793f");
        } else if (b()) {
            a(view, (View) b(i), (ViewGroup) null, false, str);
        } else {
            a(view, b(i));
        }
    }

    public final void a(View view, final ImageView imageView) {
        int i;
        float f;
        Object[] objArr = {view, imageView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1761244973c25028ed80d830314ccdd2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1761244973c25028ed80d830314ccdd2");
        } else if (view == null || imageView == null) {
        } else {
            try {
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                imageView.getLocationOnScreen(r0);
                int[] iArr2 = {iArr2[0] + (imageView.getWidth() / 2)};
                Context context = imageView.getContext();
                if (com.sankuai.waimai.store.util.b.a(context)) {
                    return;
                }
                final ImageView imageView2 = new ImageView(context);
                imageView2.setImageResource(R.drawable.wm_sc_common_food_list_count_copy);
                final FrameLayout frameLayout = new FrameLayout(context);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                layoutParams.setMargins(iArr[0], iArr[1], 0, 0);
                frameLayout.addView(imageView2, layoutParams);
                final ViewGroup viewGroup = (ViewGroup) ((Activity) context).getWindow().getDecorView();
                viewGroup.addView(frameLayout, new ViewGroup.LayoutParams(-1, -1));
                int a2 = h.a(context, 20.0f);
                int i2 = iArr2[0] - iArr[0];
                int i3 = iArr2[1] - iArr[1];
                if (Math.abs(i3) < h.a(context, 25.0f)) {
                    i = h.a(context, 40.0f);
                    f = 0.5f;
                } else {
                    i = a2;
                    f = 0.2f;
                }
                imageView2.startAnimation(new com.sankuai.waimai.store.shopping.cart.ui.a(i, i2, i3, f) { // from class: com.sankuai.waimai.store.shopping.cart.f.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.store.shopping.cart.ui.a, android.view.animation.Animation.AnimationListener
                    public final void onAnimationStart(Animation animation) {
                        Object[] objArr2 = {animation};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f051049ffb7d078df9cab590089cc366", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f051049ffb7d078df9cab590089cc366");
                            return;
                        }
                        imageView2.setVisibility(0);
                        if (imageView.getDrawable() instanceof AnimationDrawable) {
                            ((AnimationDrawable) imageView.getDrawable()).start();
                        }
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public final void onAnimationEnd(Animation animation) {
                        Object[] objArr2 = {animation};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7f82ed07f23841373ea8acef73e3975e", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7f82ed07f23841373ea8acef73e3975e");
                            return;
                        }
                        imageView2.setVisibility(8);
                        viewGroup.post(new Runnable() { // from class: com.sankuai.waimai.store.shopping.cart.f.1.1
                            public static ChangeQuickRedirect a;

                            @Override // java.lang.Runnable
                            public final void run() {
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "f14ddc1bbe2ca33640e0a4394f1c5eb6", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "f14ddc1bbe2ca33640e0a4394f1c5eb6");
                                } else {
                                    viewGroup.removeView(frameLayout);
                                }
                            }
                        });
                    }
                });
            } catch (Exception e2) {
                com.sankuai.shangou.stone.util.log.a.a(e2);
            }
        }
    }

    public final boolean a(View view, final View view2, ViewGroup viewGroup) {
        Context context;
        Object[] objArr = {view, view2, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba794e6a643629386b0e7b0eac8a0dd6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba794e6a643629386b0e7b0eac8a0dd6")).booleanValue();
        }
        if (view == null || view2 == null) {
            return false;
        }
        try {
            context = view2.getContext();
        } catch (Exception e2) {
            com.sankuai.shangou.stone.util.log.a.a(e2);
        }
        if (com.sankuai.waimai.store.util.b.a(context)) {
            return false;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        view2.getLocationOnScreen(r0);
        int[] iArr2 = {iArr2[0] + (view2.getWidth() / 2)};
        final ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.wm_sc_common_food_list_count_copy);
        final FrameLayout frameLayout = new FrameLayout(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(iArr[0], iArr[1] - u.a(context), 0, 0);
        frameLayout.addView(imageView, layoutParams);
        final ViewGroup viewGroup2 = viewGroup == null ? (ViewGroup) ((Activity) context).getWindow().getDecorView() : viewGroup;
        viewGroup2.addView(frameLayout, new ViewGroup.LayoutParams(-1, -1));
        final Animation loadAnimation = AnimationUtils.loadAnimation(context, R.anim.wm_st_shopcart_scale);
        imageView.startAnimation(new com.sankuai.waimai.store.shopping.cart.ui.a(h.a(context, 20.0f), iArr2[0] - iArr[0], iArr2[1] - iArr[1]) { // from class: com.sankuai.waimai.store.shopping.cart.f.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.shopping.cart.ui.a, android.view.animation.Animation.AnimationListener
            public final void onAnimationStart(Animation animation) {
                Object[] objArr2 = {animation};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7e206327805eee028a659e2e645be4d9", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7e206327805eee028a659e2e645be4d9");
                } else {
                    imageView.setVisibility(0);
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationEnd(Animation animation) {
                Object[] objArr2 = {animation};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e0299f1e72e99f997b865e92146f304f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e0299f1e72e99f997b865e92146f304f");
                    return;
                }
                imageView.setVisibility(8);
                viewGroup2.post(new Runnable() { // from class: com.sankuai.waimai.store.shopping.cart.f.2.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "769b1132ab10dcb96bb97c4a538a6c7a", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "769b1132ab10dcb96bb97c4a538a6c7a");
                            return;
                        }
                        viewGroup2.removeView(frameLayout);
                        view2.startAnimation(loadAnimation);
                    }
                });
            }
        });
        return true;
    }

    public final void a(int[] iArr, Context context, ViewGroup viewGroup, final boolean z, String str) {
        int[] a2;
        ViewGroup viewGroup2;
        Object[] objArr = {iArr, context, viewGroup, Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "464b750b81ae4ccd0fe4ceeda3fda297", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "464b750b81ae4ccd0fe4ceeda3fda297");
        } else if (com.sankuai.waimai.store.util.b.a(context)) {
        } else {
            try {
                if (this.g != null && (a2 = a(str)) != null && a2.length > 0 && a2[0] > 0) {
                    final ImageView imageView = new ImageView(context);
                    imageView.setImageResource(R.drawable.wm_sc_common_food_list_count_copy);
                    final FrameLayout frameLayout = new FrameLayout(context);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                    if (z) {
                        layoutParams.setMargins(iArr[0], iArr[1] - u.a(context), 0, 0);
                    } else {
                        layoutParams.setMargins(iArr[0], iArr[1], 0, 0);
                    }
                    frameLayout.addView(imageView, layoutParams);
                    if (z) {
                        viewGroup2 = viewGroup == null ? (ViewGroup) ((Activity) context).getWindow().getDecorView() : viewGroup;
                    } else {
                        viewGroup2 = (ViewGroup) ((Activity) context).getWindow().getDecorView();
                    }
                    final ViewGroup viewGroup3 = viewGroup2;
                    viewGroup3.addView(frameLayout, new ViewGroup.LayoutParams(-1, -1));
                    int a3 = h.a(context, 20.0f);
                    int i = a2[0] - iArr[0];
                    int i2 = a2[1] - iArr[1];
                    if (i2 < 0) {
                        String format = String.format(Locale.CHINESE, "to location: (%d,%d), from location: (%d,%d)", Integer.valueOf(a2[0]), Integer.valueOf(a2[1]), Integer.valueOf(iArr[0]), Integer.valueOf(iArr[1]));
                        if (context instanceof Activity) {
                            format = format + ", activity: " + context.getClass().getName();
                        }
                        com.sankuai.waimai.store.util.monitor.c.a(StoreException.ShopCartAnimateException, "animateError", format);
                    }
                    imageView.startAnimation(new com.sankuai.waimai.store.shopping.cart.ui.a(a3, i, i2) { // from class: com.sankuai.waimai.store.shopping.cart.f.3
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.waimai.store.shopping.cart.ui.a, android.view.animation.Animation.AnimationListener
                        public final void onAnimationStart(Animation animation) {
                            Object[] objArr2 = {animation};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5826fb79df20cbd3e7fc1c27c2d9ea1b", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5826fb79df20cbd3e7fc1c27c2d9ea1b");
                                return;
                            }
                            imageView.setVisibility(0);
                            if (z) {
                                return;
                            }
                            com.meituan.android.bus.a.a().c(new com.sankuai.waimai.store.mrn.shopcartbridge.event.a());
                        }

                        @Override // android.view.animation.Animation.AnimationListener
                        public final void onAnimationEnd(Animation animation) {
                            Object[] objArr2 = {animation};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "381b73e473f33a507845a48744af7029", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "381b73e473f33a507845a48744af7029");
                                return;
                            }
                            imageView.setVisibility(8);
                            viewGroup3.post(new Runnable() { // from class: com.sankuai.waimai.store.shopping.cart.f.3.1
                                public static ChangeQuickRedirect a;

                                @Override // java.lang.Runnable
                                public final void run() {
                                    Object[] objArr3 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect3 = a;
                                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "282fafda18b5119006a552ab675bacef", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "282fafda18b5119006a552ab675bacef");
                                        return;
                                    }
                                    viewGroup3.removeView(frameLayout);
                                    if (z) {
                                        com.meituan.android.bus.a.a().c(new com.sankuai.waimai.store.mrn.shopcartbridge.event.a());
                                    }
                                }
                            });
                        }
                    });
                }
            } catch (Exception e2) {
                com.sankuai.shangou.stone.util.log.a.a(e2);
            }
        }
    }

    public final void a(View view, View view2, ViewGroup viewGroup, boolean z, String str) {
        Context context;
        Object[] objArr = {view, view2, viewGroup, Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e39b07180be0cf5c24887879f9ae88d4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e39b07180be0cf5c24887879f9ae88d4");
        } else if (view == null) {
        } else {
            if (view2 == null) {
                if (!b()) {
                    return;
                }
                context = view.getContext();
            } else {
                context = view2.getContext();
            }
            Context context2 = context;
            try {
                if (com.sankuai.waimai.store.util.b.a(context2)) {
                    return;
                }
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                a(iArr, context2, viewGroup, z, str);
            } catch (Exception e2) {
                com.sankuai.shangou.stone.util.log.a.a(e2);
            }
        }
    }

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c2ce9660fcac4e5003fe18f549b1a912", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c2ce9660fcac4e5003fe18f549b1a912");
        } else if (!this.f && this.b != null) {
            this.b.remove(Integer.valueOf(i));
        } else if (!this.f || this.c == null) {
        } else {
            this.c.remove(Integer.valueOf(i));
        }
    }

    public ImageView b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8402f410f0cb0af1fff134143d7f01d7", RobustBitConfig.DEFAULT_VALUE)) {
            return (ImageView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8402f410f0cb0af1fff134143d7f01d7");
        }
        if (this.f) {
            WeakReference<ImageView> weakReference = this.c.get(Integer.valueOf(i));
            if (weakReference == null) {
                return null;
            }
            return weakReference.get();
        }
        return this.b.get(Integer.valueOf(i));
    }
}

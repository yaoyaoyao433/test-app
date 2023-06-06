package com.sankuai.waimai.popup.spfx;

import android.animation.ObjectAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import com.alipay.sdk.app.PayTask;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.aa;
import com.sankuai.waimai.platform.mach.dialog.DynamicDialog;
import com.sankuai.waimai.popup.spfx.helper.c;
import java.util.Map;
import javax.annotation.Nullable;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b {
    public static ChangeQuickRedirect a = null;
    private static int b = 1;
    private static int c = 2;
    private static int d = 3;
    private static String e = "image_show_dish_pic";
    private static String f = "image_template_pic";
    private com.sankuai.waimai.popup.spfx.helper.b g;

    public static /* synthetic */ void a(View view, Drawable[] drawableArr) {
        Object[] objArr = {view, drawableArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7d0a8491a7fd7bd8c43af688dac482f5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7d0a8491a7fd7bd8c43af688dac482f5");
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ImageView imageView = new ImageView(view.getContext());
        ImageView imageView2 = new ImageView(view.getContext());
        imageView2.setLayoutParams(layoutParams);
        imageView2.setAlpha(0.0f);
        imageView2.setImageDrawable(drawableArr[0]);
        imageView.setLayoutParams(layoutParams);
        imageView.setAlpha(0.0f);
        imageView.setImageDrawable(drawableArr[1]);
        viewGroup.addView(imageView2);
        viewGroup.addView(imageView);
        Object[] objArr2 = {imageView2, imageView};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "2d277f403609c5502ee9893b4f0a35cc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "2d277f403609c5502ee9893b4f0a35cc");
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageView2, View.ALPHA.getName(), 0.0f, 1.0f);
        ofFloat.setDuration(1500L);
        ofFloat.start();
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(imageView, View.ALPHA.getName(), 0.0f, 0.0f, 0.5f, 1.0f);
        ofFloat2.setDuration(PayTask.j);
        ofFloat2.start();
    }

    public final void a(DynamicDialog dynamicDialog, long j) {
        Object[] objArr = {dynamicDialog, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b253be00ac0b30414ea5dbc5c324e3bb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b253be00ac0b30414ea5dbc5c324e3bb");
        } else if (dynamicDialog == null || aa.a(a(j))) {
        } else {
            a(a(dynamicDialog, a(j)), j);
        }
    }

    public final void a(com.sankuai.waimai.popup.strategy.b bVar, long j) {
        Object[] objArr = {bVar, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc320559dce5ec8e32e26a75eac60540", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc320559dce5ec8e32e26a75eac60540");
        } else if (bVar == null || aa.a(a(j))) {
        } else {
            a(a(bVar, a(j)), j);
        }
    }

    private String a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "733b10286476450737713aa659485ea0", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "733b10286476450737713aa659485ea0");
        }
        if (b == j) {
            return e;
        }
        if (c == j) {
            return f;
        }
        return ((long) d) == j ? e : "";
    }

    private void a(View view, long j) {
        Object[] objArr = {view, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc94f59b3b1971042d0ff5e1bc13199d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc94f59b3b1971042d0ff5e1bc13199d");
        } else if (view == null) {
        } else {
            try {
                if (b == j) {
                    this.g = new com.sankuai.waimai.popup.spfx.helper.b();
                    this.g.a(view);
                } else if (c == j) {
                    a(view);
                } else if (d == j) {
                    c.a(view);
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2bf98f1384b4a2111e65a097746ffe3e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2bf98f1384b4a2111e65a097746ffe3e");
        } else if (this.g != null) {
            this.g.a();
        }
    }

    @Nullable
    private static View a(DynamicDialog dynamicDialog, String str) {
        Object[] objArr = {dynamicDialog, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2c267daaeb9902baf956deb3f7f36d0b", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2c267daaeb9902baf956deb3f7f36d0b") : a(dynamicDialog.getMachTagViews(), str);
    }

    @Nullable
    private static View a(com.sankuai.waimai.popup.strategy.b bVar, String str) {
        Object[] objArr = {bVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7aa07f093fbf06fcdfdfcf406ee650e3", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7aa07f093fbf06fcdfdfcf406ee650e3") : a(bVar.e(), str);
    }

    @Nullable
    private static View a(Map<String, View> map, String str) {
        Object[] objArr = {map, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "095e67fdedeb98c38c93cef9f373dc53", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "095e67fdedeb98c38c93cef9f373dc53");
        }
        if (map == null || map.size() <= 0 || aa.a(str)) {
            return null;
        }
        View view = map.get(str);
        if (view == null) {
            com.sankuai.waimai.foundation.utils.log.a.b("SPFXHelper", "no tag view,check mach code. view-tag=" + str, new Object[0]);
        }
        return view;
    }

    private static void a(@Nullable final View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "14466938cfe8897b34d415423c9f32f5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "14466938cfe8897b34d415423c9f32f5");
        } else if (view == null) {
        } else {
            view.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.sankuai.waimai.popup.spfx.b.1
                public static ChangeQuickRedirect a;

                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e2d64d9fa0f9542cf37a3af543de0553", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e2d64d9fa0f9542cf37a3af543de0553");
                        return;
                    }
                    view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    final Drawable[] drawableArr = {null, null};
                    com.meituan.roodesign.resfetcher.runtime.c.a(view.getContext(), "waimai_c_page_home_template_ice_cube", new com.meituan.roodesign.resfetcher.runtime.b() { // from class: com.sankuai.waimai.popup.spfx.b.1.1
                        public static ChangeQuickRedirect a;

                        @Override // com.meituan.roodesign.resfetcher.runtime.b
                        public final void a(Drawable drawable, boolean z) {
                            Object[] objArr3 = {drawable, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c216c8b99c22f5882675599bdff3e37e", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c216c8b99c22f5882675599bdff3e37e");
                                return;
                            }
                            drawableArr[0] = drawable;
                            if (drawableArr[0] == null || drawableArr[1] == null) {
                                return;
                            }
                            b.a(view, drawableArr);
                        }
                    });
                    com.meituan.roodesign.resfetcher.runtime.c.a(view.getContext(), "waimai_c_page_home_template_frost", new com.meituan.roodesign.resfetcher.runtime.b() { // from class: com.sankuai.waimai.popup.spfx.b.1.2
                        public static ChangeQuickRedirect a;

                        @Override // com.meituan.roodesign.resfetcher.runtime.b
                        public final void a(Drawable drawable, boolean z) {
                            Object[] objArr3 = {drawable, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "354c0224928422cf1bb5e5e3684a8983", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "354c0224928422cf1bb5e5e3684a8983");
                                return;
                            }
                            drawableArr[1] = drawable;
                            if (drawableArr[0] == null || drawableArr[1] == null) {
                                return;
                            }
                            b.a(view, drawableArr);
                        }
                    });
                }
            });
        }
    }
}

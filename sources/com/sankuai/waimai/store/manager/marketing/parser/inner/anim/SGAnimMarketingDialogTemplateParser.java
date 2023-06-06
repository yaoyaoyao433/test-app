package com.sankuai.waimai.store.manager.marketing.parser.inner.anim;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.e;
import com.airbnb.lottie.f;
import com.airbnb.lottie.h;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.ImageQualityUtil;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.store.manager.marketing.parser.b;
import com.sankuai.waimai.store.manager.marketing.parser.inner.anim.SGAnimMarketingDialogTemplateData;
import com.sankuai.waimai.store.platform.marketing.a;
import com.sankuai.waimai.store.router.d;
import com.sankuai.waimai.store.ui.common.SCBaseDialog;
import com.sankuai.waimai.store.util.i;
import com.sankuai.waimai.store.util.m;
import com.sankuai.waimai.store.view.a;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SGAnimMarketingDialogTemplateParser extends b<Dialog> {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.store.manager.marketing.parser.a
    public final /* synthetic */ Object a(@NonNull Activity activity, @NonNull a aVar, com.sankuai.waimai.store.manager.sequence.a aVar2) {
        Object[] objArr = {activity, aVar, aVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f5292028c0f6023231cf591b5347fd4e", RobustBitConfig.DEFAULT_VALUE)) {
            return (Dialog) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f5292028c0f6023231cf591b5347fd4e");
        }
        SGAnimMarketingDialogTemplateData sGAnimMarketingDialogTemplateData = (SGAnimMarketingDialogTemplateData) i.a(aVar.c, SGAnimMarketingDialogTemplateData.class);
        if (sGAnimMarketingDialogTemplateData == null || sGAnimMarketingDialogTemplateData.responseInfo == 0 || com.sankuai.shangou.stone.util.a.b(((SGAnimMarketingDialogTemplateData.TemplateData) sGAnimMarketingDialogTemplateData.responseInfo).resource)) {
            return null;
        }
        return new SGAnimMarketingDialog(activity, sGAnimMarketingDialogTemplateData);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    static class SGAnimMarketingDialog extends SCBaseDialog {
        public static ChangeQuickRedirect a;
        private FrameLayout b;
        private View c;
        private SGAnimMarketingDialogTemplateData d;

        public SGAnimMarketingDialog(@NonNull Context context, SGAnimMarketingDialogTemplateData sGAnimMarketingDialogTemplateData) {
            super(context, R.style.WmStBaseDialogTheme);
            Object[] objArr = {context, sGAnimMarketingDialogTemplateData};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b216b629cdf25e9e793ed03125850fe8", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b216b629cdf25e9e793ed03125850fe8");
            } else {
                this.d = sGAnimMarketingDialogTemplateData;
            }
        }

        @Override // android.app.Dialog
        public void onCreate(Bundle bundle) {
            ImageView imageView;
            LottieAnimationView lottieAnimationView;
            boolean z = false;
            Object[] objArr = {bundle};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "044cf699b014cc08cf277e838db59be6", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "044cf699b014cc08cf277e838db59be6");
                return;
            }
            super.onCreate(bundle);
            View inflate = LayoutInflater.from(bB_()).inflate(R.layout.wm_sc_common_marketing_anim_native_dialog, (ViewGroup) null);
            setContentView(inflate);
            int i = -1;
            if (getWindow() != null) {
                WindowManager.LayoutParams attributes = getWindow().getAttributes();
                attributes.width = -1;
                attributes.height = -1;
                getWindow().setAttributes(attributes);
                getWindow().setWindowAnimations(R.style.WmStNoneAnimation);
                if (Build.VERSION.SDK_INT >= 23) {
                    Window window = getWindow();
                    window.clearFlags(201326592);
                    window.addFlags(Integer.MIN_VALUE);
                    window.setStatusBarColor(0);
                }
            }
            a(inflate);
            if (this.d != null) {
                final SGAnimMarketingDialogTemplateData.TemplateData templateData = (SGAnimMarketingDialogTemplateData.TemplateData) this.d.responseInfo;
                SGAnimMarketingDialogTemplateData.LogInfo logInfo = (SGAnimMarketingDialogTemplateData.LogInfo) this.d.logInfo;
                int i2 = 2;
                Object[] objArr2 = {templateData, logInfo};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9737bc4b275a28726441b07549b5373a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9737bc4b275a28726441b07549b5373a");
                    return;
                }
                final HashMap hashMap = new HashMap();
                if (logInfo != null) {
                    hashMap.put("cat_id", logInfo.categoryType);
                    hashMap.put("category_code", logInfo.categoryType);
                    hashMap.put("sec_cate_id", logInfo.secondCategoryType);
                }
                this.b.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.manager.marketing.parser.inner.anim.SGAnimMarketingDialogTemplateParser.SGAnimMarketingDialog.1
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr3 = {view};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "49cde1b2b9786268aa67055193cd7cc4", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "49cde1b2b9786268aa67055193cd7cc4");
                            return;
                        }
                        com.sankuai.waimai.store.manager.judas.b.a(SGAnimMarketingDialog.this.bB_(), "b_waimai_az6pka62_mc").b(hashMap).a();
                        if (!t.a(templateData.scheme)) {
                            d.a(view.getContext(), templateData.scheme);
                        }
                        SGAnimMarketingDialog.this.dismiss();
                    }
                });
                this.c.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.manager.marketing.parser.inner.anim.SGAnimMarketingDialogTemplateParser.SGAnimMarketingDialog.2
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr3 = {view};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "32a7146a5809cf5226265b9b553b58e7", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "32a7146a5809cf5226265b9b553b58e7");
                            return;
                        }
                        com.sankuai.waimai.store.manager.judas.b.a(SGAnimMarketingDialog.this.bB_(), "b_waimai_d250drf6_mc").b(hashMap).a();
                        SGAnimMarketingDialog.this.dismiss();
                    }
                });
                for (SGAnimMarketingDialogTemplateData.ResourceItem resourceItem : templateData.resource) {
                    if (resourceItem != null) {
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i);
                        if (i2 == resourceItem.type) {
                            FrameLayout frameLayout = this.b;
                            Object[] objArr3 = new Object[1];
                            objArr3[z ? 1 : 0] = resourceItem;
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ab705c3afec19436f58c230cfaa3a7e9", RobustBitConfig.DEFAULT_VALUE)) {
                                lottieAnimationView = (View) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, z, "ab705c3afec19436f58c230cfaa3a7e9");
                            } else {
                                final LottieAnimationView lottieAnimationView2 = new LottieAnimationView(bB_());
                                lottieAnimationView2.setScaleType(ImageView.ScaleType.CENTER_CROP);
                                lottieAnimationView2.setRepeatMode(1);
                                lottieAnimationView2.setRepeatCount(resourceItem.loop == 1 ? -1 : 0);
                                com.sankuai.waimai.store.manager.preload.a a2 = com.sankuai.waimai.store.manager.preload.a.a();
                                String str = resourceItem.url;
                                Object[] objArr4 = new Object[1];
                                objArr4[z ? 1 : 0] = str;
                                ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.store.manager.preload.a.a;
                                e eVar = PatchProxy.isSupport(objArr4, a2, changeQuickRedirect4, false, "b64d1351a780713a983cf569eb9068bc", RobustBitConfig.DEFAULT_VALUE) ? (e) PatchProxy.accessDispatch(objArr4, a2, changeQuickRedirect4, z, "b64d1351a780713a983cf569eb9068bc") : a2.c.get(str);
                                if (eVar != null) {
                                    lottieAnimationView2.setComposition(eVar);
                                    lottieAnimationView2.a();
                                    lottieAnimationView = lottieAnimationView2;
                                } else {
                                    f.a(bB_(), resourceItem.url).a(new h<e>() { // from class: com.sankuai.waimai.store.manager.marketing.parser.inner.anim.SGAnimMarketingDialogTemplateParser.SGAnimMarketingDialog.3
                                        public static ChangeQuickRedirect a;

                                        @Override // com.airbnb.lottie.h
                                        public final /* synthetic */ void a(e eVar2) {
                                            e eVar3 = eVar2;
                                            Object[] objArr5 = {eVar3};
                                            ChangeQuickRedirect changeQuickRedirect5 = a;
                                            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "5aa485defb820406250649aba664c454", RobustBitConfig.DEFAULT_VALUE)) {
                                                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "5aa485defb820406250649aba664c454");
                                                return;
                                            }
                                            lottieAnimationView2.setComposition(eVar3);
                                            lottieAnimationView2.a();
                                        }
                                    });
                                    lottieAnimationView = lottieAnimationView2;
                                }
                            }
                            frameLayout.addView(lottieAnimationView, layoutParams);
                            i = -1;
                        } else {
                            FrameLayout frameLayout2 = this.b;
                            Object[] objArr5 = new Object[1];
                            objArr5[z ? 1 : 0] = resourceItem;
                            ChangeQuickRedirect changeQuickRedirect5 = a;
                            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "1df9786b8c37718ee4a033fda2dcc713", RobustBitConfig.DEFAULT_VALUE)) {
                                imageView = (View) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "1df9786b8c37718ee4a033fda2dcc713");
                            } else {
                                ImageView imageView2 = new ImageView(bB_());
                                imageView2.setScaleType(ImageView.ScaleType.CENTER_CROP);
                                m.a(resourceItem.url, ImageQualityUtil.a()).a(com.sankuai.shangou.stone.util.h.a((Context) bB_()), com.sankuai.shangou.stone.util.h.d(bB_())).a(imageView2);
                                imageView = imageView2;
                            }
                            frameLayout2.addView(imageView, layoutParams);
                            i = -1;
                            z = false;
                        }
                        i2 = 2;
                    }
                }
                com.sankuai.waimai.store.manager.judas.b.b(bB_(), "b_waimai_2afvxlok_mv").b(hashMap).a();
            }
        }

        @Override // com.sankuai.waimai.store.ui.common.SCBaseDialog, android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            Object[] objArr = {dialogInterface};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f6f68d17ff83c94ae037e49b2bb10276", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f6f68d17ff83c94ae037e49b2bb10276");
                return;
            }
            super.onDismiss(dialogInterface);
            int childCount = this.b.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = this.b.getChildAt(i);
                if (childAt instanceof LottieAnimationView) {
                    ((LottieAnimationView) childAt).e();
                }
            }
        }

        @Override // com.sankuai.waimai.store.ui.common.SCBaseDialog
        public final void a(View view) {
            Object[] objArr = {view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f9306addd2b1bc1e3c42ec162e278258", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f9306addd2b1bc1e3c42ec162e278258");
                return;
            }
            this.b = (FrameLayout) view.findViewById(R.id.fl_resource_container);
            this.c = view.findViewById(R.id.v_dialog_close);
            ((ImageView) view.findViewById(R.id.iv_dialog_close_arrow)).setImageDrawable(com.sankuai.waimai.store.view.a.a(bB_(), (int) R.dimen.wm_sc_common_dimen_4_half, (int) R.dimen.wm_sc_common_dimen_8, (int) R.color.wm_sg_color_C9C5C2, a.EnumC1338a.RIGHT));
        }
    }
}

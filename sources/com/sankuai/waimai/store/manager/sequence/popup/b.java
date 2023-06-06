package com.sankuai.waimai.store.manager.sequence.popup;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import com.meituan.android.recce.views.anim.RecceAnimUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.store.manager.sequence.d;
import com.sankuai.waimai.store.platform.marketing.MarketingModel;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends d<View> {
    public static ChangeQuickRedirect h;
    MarketingModel.MarketingResidentModel i;
    FrameLayout j;
    Handler k;

    public static /* synthetic */ void f(b bVar) {
        ObjectAnimator ofFloat;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "4bab9c30a6075142c8fef14d0f1ae289", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "4bab9c30a6075142c8fef14d0f1ae289");
        } else if (bVar.b == 0 || t.a(bVar.i.enterAnimType) || bVar.i.enterAnimDuration <= 0) {
        } else {
            int a = h.a(((View) bVar.b).getContext());
            int b = h.b(((View) bVar.b).getContext());
            int[] iArr = new int[2];
            ((View) bVar.b).getLocationOnScreen(iArr);
            int a2 = h.a(((View) bVar.b).getContext(), bVar.i.offsetX);
            int a3 = h.a(((View) bVar.b).getContext(), bVar.i.offsetY);
            if (MarketingModel.POPUP_ANIMATION_LEFT_TO_RIGHT.equals(bVar.i.enterAnimType)) {
                ofFloat = ObjectAnimator.ofFloat(bVar.b, RecceAnimUtils.TRANSLATION_X, (-(iArr[0] - a2)) - ((View) bVar.b).getWidth(), ((View) bVar.b).getTranslationX());
            } else if (MarketingModel.POPUP_ANIMATION_RIGHT_TO_LEFT.equals(bVar.i.enterAnimType)) {
                ofFloat = ObjectAnimator.ofFloat(bVar.b, RecceAnimUtils.TRANSLATION_X, a - (iArr[0] - a2), ((View) bVar.b).getTranslationX());
            } else if (MarketingModel.POPUP_ANIMATION_BOTTOM_TO_TOP.equals(bVar.i.enterAnimType)) {
                ofFloat = ObjectAnimator.ofFloat(bVar.b, RecceAnimUtils.TRANSLATION_Y, b - (iArr[1] - a3), ((View) bVar.b).getTranslationY());
            } else if (MarketingModel.POPUP_ANIMATION_TOP_TO_BOTTOM.equals(bVar.i.enterAnimType)) {
                ofFloat = ObjectAnimator.ofFloat(bVar.b, RecceAnimUtils.TRANSLATION_Y, (-(iArr[1] - a3)) - ((View) bVar.b).getHeight(), ((View) bVar.b).getTranslationY());
            } else {
                ofFloat = ObjectAnimator.ofFloat(bVar.b, "alpha", 0.0f, 1.0f);
            }
            ofFloat.setInterpolator(new LinearInterpolator());
            ofFloat.setDuration(bVar.i.enterAnimDuration);
            ofFloat.start();
        }
    }

    public b(Activity activity, @NonNull com.sankuai.waimai.store.manager.marketing.parser.a<View> aVar, View view, MarketingModel.MarketingResidentModel marketingResidentModel) {
        super(activity, aVar);
        Object[] objArr = {activity, aVar, view, marketingResidentModel};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "23d4a2c81b67a2222799c4829015959e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "23d4a2c81b67a2222799c4829015959e");
            return;
        }
        this.k = new Handler(Looper.getMainLooper()) { // from class: com.sankuai.waimai.store.manager.sequence.popup.b.1
            public static ChangeQuickRedirect a;

            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                Object[] objArr2 = {message};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f9d82fc801b93946d517a58acd0cf40d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f9d82fc801b93946d517a58acd0cf40d");
                } else if (b.this.j == null || b.this.b == null || 100 != message.what || !(((View) b.this.b).getTag() instanceof a)) {
                } else {
                    ((a) ((View) b.this.b).getTag()).c();
                }
            }
        };
        if (marketingResidentModel != null) {
            this.i = marketingResidentModel;
            if (this.i.gravity == null || this.i.gravity.horizontal == null || this.i.gravity.vertical == null) {
                this.i.gravity = new MarketingModel.Gravity();
            }
        } else {
            this.i = new MarketingModel.MarketingResidentModel();
            this.i.gravity = new MarketingModel.Gravity();
            this.i.offsetX = 0;
            this.i.offsetY = 0;
        }
        if (view instanceof FrameLayout) {
            this.j = (FrameLayout) view;
        } else if (view == null || !(view.getParent() instanceof ViewGroup)) {
        } else {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if ("popupContainer".equals(viewGroup.getTag())) {
                this.j = (FrameLayout) viewGroup;
                return;
            }
            viewGroup.removeView(view);
            this.j = new FrameLayout(this.d);
            this.j.setLayoutParams(view.getLayoutParams());
            this.j.setTag("popupContainer");
            viewGroup.addView(this.j);
            this.j.addView(view, new FrameLayout.LayoutParams(-1, -1));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a6, code lost:
        if (r2.equals("center") != false) goto L30;
     */
    @Override // com.sankuai.waimai.store.manager.sequence.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f() {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.store.manager.sequence.popup.b.f():void");
    }

    @Override // com.sankuai.waimai.store.manager.sequence.d
    public final long e() {
        return this.i.delayShowTime;
    }

    @Override // com.sankuai.waimai.store.manager.sequence.d
    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b5e4ec1b8d365154ca313fb4e1509331", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b5e4ec1b8d365154ca313fb4e1509331");
        } else if (z) {
        } else {
            if (this.b != 0 && this.i.isLeavePageClose && (((View) this.b).getTag() instanceof a)) {
                ((a) ((View) this.b).getTag()).d();
            }
            if (this.i.ignoreuperMsg) {
                com.sankuai.waimai.touchmatrix.views.b.a().b(null);
            }
        }
    }

    @Override // com.sankuai.waimai.store.manager.sequence.d
    public final void cancel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "800733995bb0f20fa0f4fadd022420d4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "800733995bb0f20fa0f4fadd022420d4");
            return;
        }
        if (this.k.hasMessages(100)) {
            this.k.removeMessages(100);
        }
        if (this.j == null || this.b == 0) {
            return;
        }
        this.j.removeView((View) this.b);
    }
}

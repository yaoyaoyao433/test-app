package com.sankuai.waimai.irmo.render.bean.anim;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Color;
import android.view.View;
import com.meituan.android.recce.views.anim.RecceAnimUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.d;
import com.sankuai.waimai.foundation.utils.log.a;
import com.sankuai.waimai.irmo.render.bean.layers.BaseAnimEffectParams;
import com.sankuai.waimai.irmo.render.i;
import com.sankuai.waimai.irmo.render.monitor.a;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class IrmoPropertyAnimator extends IrmoAnimationDelegate<List<BaseAnimEffectParams.Property>> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public Animator animator;
    public long delay;

    public IrmoPropertyAnimator(List<BaseAnimEffectParams.Property> list, View view) {
        super(list, view);
        Object[] objArr = {list, view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "49dceb82574ad09634d8d316dc384bfc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "49dceb82574ad09634d8d316dc384bfc");
        } else {
            this.delay = 0L;
        }
    }

    @Override // com.sankuai.waimai.irmo.render.bean.anim.IrmoAnimationDelegate
    public boolean prepare() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "348e849fae6fab19e3c4e1e2c432775f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "348e849fae6fab19e3c4e1e2c432775f")).booleanValue();
        }
        if (this.animator == null) {
            this.animator = touchSlicePropertyAnimator();
        }
        if (this.animator == null) {
            return false;
        }
        this.animator.addListener(new AnimatorListenerAdapter() { // from class: com.sankuai.waimai.irmo.render.bean.anim.IrmoPropertyAnimator.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                Object[] objArr2 = {animator};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "664c2e528b477c0ab1e29373aea17a10", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "664c2e528b477c0ab1e29373aea17a10");
                    return;
                }
                super.onAnimationEnd(animator);
                if (IrmoPropertyAnimator.this.endListener != null) {
                    IrmoPropertyAnimator.this.endListener.execute();
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                Object[] objArr2 = {animator};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "d14e6e6494b9c225fe32c22f8888d9a2", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "d14e6e6494b9c225fe32c22f8888d9a2");
                    return;
                }
                super.onAnimationStart(animator);
                if (IrmoPropertyAnimator.this.startListener != null) {
                    IrmoPropertyAnimator.this.startListener.execute();
                }
            }
        });
        return true;
    }

    @Override // com.sankuai.waimai.irmo.render.bean.anim.IrmoAnimationDelegate
    public boolean start() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a57a93311e9f45b1641f83f456f6e280", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a57a93311e9f45b1641f83f456f6e280")).booleanValue();
        }
        if (this.animator == null) {
            return false;
        }
        this.animator.start();
        return true;
    }

    @Override // com.sankuai.waimai.irmo.render.bean.anim.IrmoAnimationDelegate
    public boolean stop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "47b273b3489af2fdc0932b6a7e6403bb", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "47b273b3489af2fdc0932b6a7e6403bb")).booleanValue();
        }
        if (this.animator == null) {
            return false;
        }
        if (this.animator.isRunning()) {
            this.animator.cancel();
            return true;
        }
        return true;
    }

    @Override // com.sankuai.waimai.irmo.render.bean.anim.IrmoAnimationDelegate
    public boolean pause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "99e8e75e708c0975ae59153694454b4d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "99e8e75e708c0975ae59153694454b4d")).booleanValue();
        }
        if (this.animator == null) {
            return false;
        }
        this.animator.pause();
        return true;
    }

    @Override // com.sankuai.waimai.irmo.render.bean.anim.IrmoAnimationDelegate
    public boolean resume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "30e77328e1ef70adca3fc7de98517de7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "30e77328e1ef70adca3fc7de98517de7")).booleanValue();
        }
        if (this.animator == null) {
            return false;
        }
        this.animator.resume();
        return true;
    }

    private Animator touchSlicePropertyAnimator() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4f02f58a796b245b904809093868249d", RobustBitConfig.DEFAULT_VALUE)) {
            return (Animator) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4f02f58a796b245b904809093868249d");
        }
        if (d.a((List) this.animInfo) || this.targetView == null) {
            a.e("IRMO_BASE_ANIM", "slice anim has no info.", new Object[0]);
            if (this.reporter != null) {
                i iVar = this.reporter;
                a.C0976a a = new a.C0976a().a(1007).a("cannot create property animator.");
                Object[] objArr2 = new Object[2];
                objArr2[0] = Boolean.valueOf(d.a((List) this.animInfo));
                objArr2[1] = Boolean.valueOf(this.targetView == null);
                iVar.a(a.b(String.format("缺失创建动画的条件. 1、anim info: %b, 2、target view：%b", objArr2)).a(), false);
                return null;
            }
            return null;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        for (BaseAnimEffectParams.Property property : (List) this.animInfo) {
            Animator obtainAnimator = obtainAnimator(property, this.targetView);
            if (obtainAnimator != null) {
                arrayList.add(obtainAnimator);
            }
        }
        animatorSet.setStartDelay(this.delay);
        animatorSet.playTogether(arrayList);
        return animatorSet;
    }

    private Animator obtainAnimator(BaseAnimEffectParams.Property property, View view) {
        Object[] objArr = {property, view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "778cab3bb549b3f86d3485455e04605e", RobustBitConfig.DEFAULT_VALUE)) {
            return (Animator) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "778cab3bb549b3f86d3485455e04605e");
        }
        ObjectAnimator objectAnimator = null;
        if (property == null || view == null) {
            return null;
        }
        switch (property.type) {
            case translationX:
            case translationY:
            case translationZ:
                objectAnimator = ObjectAnimator.ofFloat(view, property.type.name(), dp2px(safeParseFloat(property.fromValue)), dp2px(safeParseFloat(property.toValue)));
                break;
            case rotationX:
            case rotationY:
            case scaleX:
            case scaleY:
                objectAnimator = ObjectAnimator.ofFloat(view, property.type.name(), safeParseFloat(property.fromValue), safeParseFloat(property.toValue));
                break;
            case rotationZ:
                objectAnimator = ObjectAnimator.ofFloat(view, RecceAnimUtils.ROTATION, safeParseFloat(property.fromValue), safeParseFloat(property.toValue));
                break;
            case opacity:
                objectAnimator = ObjectAnimator.ofFloat(view, "alpha", safeParseFloat(property.fromValue), safeParseFloat(property.toValue));
                break;
            case backgroundColor:
                objectAnimator = ObjectAnimator.ofArgb(view, property.type.name(), safeParseColor(property.fromValue), safeParseColor(property.toValue));
                break;
        }
        if (objectAnimator != null) {
            objectAnimator.setStartDelay(property.delay);
            objectAnimator.setDuration(property.duration);
        }
        return objectAnimator;
    }

    private float safeParseFloat(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a5468b9646ed12689290c6272d2444a4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a5468b9646ed12689290c6272d2444a4")).floatValue();
        }
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException unused) {
            if (this.reporter != null) {
                this.reporter.a(new a.C0976a().a(1007).a("property value invalid when create property animator.").a(), true);
                return 0.0f;
            }
            return 0.0f;
        }
    }

    public float dp2px(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8eb5fe8a9fdbf350b3110e5603f360e3", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8eb5fe8a9fdbf350b3110e5603f360e3")).floatValue() : (this.targetView == null || this.targetView.getResources() == null) ? f : (int) (f * this.targetView.getResources().getDisplayMetrics().density);
    }

    public static int safeParseColor(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "128da58a4305d0226953bb6dca283fda", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "128da58a4305d0226953bb6dca283fda")).intValue();
        }
        try {
            return Color.parseColor(str);
        } catch (Exception unused) {
            return 0;
        }
    }

    public void setStartDelay(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "06be31f23bf7122ed3a7cc5369a25b5b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "06be31f23bf7122ed3a7cc5369a25b5b");
        } else {
            this.delay = j;
        }
    }
}

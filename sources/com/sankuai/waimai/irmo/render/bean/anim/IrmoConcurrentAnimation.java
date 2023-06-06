package com.sankuai.waimai.irmo.render.bean.anim;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.d;
import com.sankuai.waimai.irmo.render.bean.anim.IrmoAnimationDelegate;
import com.sankuai.waimai.irmo.render.bean.layers.BaseAnimEffectParams;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class IrmoConcurrentAnimation extends IrmoAnimationDelegate<BaseAnimEffectParams.AnimSlice> {
    public static ChangeQuickRedirect changeQuickRedirect;
    private List<IrmoAnimationDelegate> animations;
    private IrmoAnimationDelegate.StatusListener oneEnd;
    private int playedAnimCount;

    public static /* synthetic */ int access$004(IrmoConcurrentAnimation irmoConcurrentAnimation) {
        int i = irmoConcurrentAnimation.playedAnimCount + 1;
        irmoConcurrentAnimation.playedAnimCount = i;
        return i;
    }

    public IrmoConcurrentAnimation(BaseAnimEffectParams.AnimSlice animSlice, View view) {
        super(animSlice, view);
        Object[] objArr = {animSlice, view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "06a1582f5ef33c9d2fb377e5dfc7a4b2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "06a1582f5ef33c9d2fb377e5dfc7a4b2");
        } else {
            this.oneEnd = new IrmoAnimationDelegate.StatusListener() { // from class: com.sankuai.waimai.irmo.render.bean.anim.IrmoConcurrentAnimation.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.sankuai.waimai.irmo.render.bean.anim.IrmoAnimationDelegate.StatusListener
                public void execute() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "affefa4000eabafe8baf3521ed4ae4ae", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "affefa4000eabafe8baf3521ed4ae4ae");
                    } else if (IrmoConcurrentAnimation.access$004(IrmoConcurrentAnimation.this) != IrmoConcurrentAnimation.this.animations.size() || IrmoConcurrentAnimation.this.endListener == null) {
                    } else {
                        IrmoConcurrentAnimation.this.endListener.execute();
                    }
                }
            };
        }
    }

    @Override // com.sankuai.waimai.irmo.render.bean.anim.IrmoAnimationDelegate
    public boolean prepare() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2acfff42893e18b7498bfafc0f8b0449", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2acfff42893e18b7498bfafc0f8b0449")).booleanValue();
        }
        if (this.animInfo == 0 || this.targetView == null) {
            return false;
        }
        boolean z = true;
        this.animations = new ArrayList();
        if (!d.a(((BaseAnimEffectParams.AnimSlice) this.animInfo).properties)) {
            IrmoPropertyAnimator irmoPropertyAnimator = new IrmoPropertyAnimator(((BaseAnimEffectParams.AnimSlice) this.animInfo).properties, this.targetView);
            irmoPropertyAnimator.setStartDelay(((BaseAnimEffectParams.AnimSlice) this.animInfo).delay);
            this.animations.add(irmoPropertyAnimator);
        }
        if (!d.a(((BaseAnimEffectParams.AnimSlice) this.animInfo).drawables)) {
            IrmoDrawAnimator irmoDrawAnimator = new IrmoDrawAnimator(((BaseAnimEffectParams.AnimSlice) this.animInfo).drawables, this.targetView);
            irmoDrawAnimator.setStartDelay(((BaseAnimEffectParams.AnimSlice) this.animInfo).delay);
            this.animations.add(irmoDrawAnimator);
        }
        if (this.animations.isEmpty()) {
            return false;
        }
        for (IrmoAnimationDelegate irmoAnimationDelegate : this.animations) {
            irmoAnimationDelegate.setReporter(this.reporter);
            boolean prepare = irmoAnimationDelegate.prepare();
            if (!prepare) {
                return prepare;
            }
            irmoAnimationDelegate.setEndListener(this.oneEnd);
            z = prepare;
        }
        return z;
    }

    @Override // com.sankuai.waimai.irmo.render.bean.anim.IrmoAnimationDelegate
    public boolean start() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d0fe45ea76b86e7ce4d087053d7a156c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d0fe45ea76b86e7ce4d087053d7a156c")).booleanValue();
        }
        if (this.animations == null || this.animations.isEmpty() || this.animInfo == 0 || this.targetView == null) {
            return false;
        }
        this.targetView.setPivotX(((BaseAnimEffectParams.AnimSlice) this.animInfo).pivotXp * this.targetView.getWidth());
        this.targetView.setPivotY(((BaseAnimEffectParams.AnimSlice) this.animInfo).pivotYp * this.targetView.getHeight());
        this.playedAnimCount = 0;
        for (IrmoAnimationDelegate irmoAnimationDelegate : this.animations) {
            irmoAnimationDelegate.start();
        }
        if (this.startListener != null) {
            this.startListener.execute();
            return true;
        }
        return true;
    }

    @Override // com.sankuai.waimai.irmo.render.bean.anim.IrmoAnimationDelegate
    public boolean stop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "43ddafa6fc47857080dbf5f449707cb3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "43ddafa6fc47857080dbf5f449707cb3")).booleanValue();
        }
        if (this.animations == null || this.animations.isEmpty()) {
            return false;
        }
        for (IrmoAnimationDelegate irmoAnimationDelegate : this.animations) {
            irmoAnimationDelegate.stop();
        }
        return true;
    }

    @Override // com.sankuai.waimai.irmo.render.bean.anim.IrmoAnimationDelegate
    public boolean pause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c187af94022f1bfd8bd98a2a22a6530c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c187af94022f1bfd8bd98a2a22a6530c")).booleanValue();
        }
        if (this.animations == null || this.animations.isEmpty()) {
            return false;
        }
        for (IrmoAnimationDelegate irmoAnimationDelegate : this.animations) {
            irmoAnimationDelegate.pause();
        }
        return true;
    }

    @Override // com.sankuai.waimai.irmo.render.bean.anim.IrmoAnimationDelegate
    public boolean resume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c6bc30bb827dd656cfd84c6240ce7b1c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c6bc30bb827dd656cfd84c6240ce7b1c")).booleanValue();
        }
        if (this.animations == null || this.animations.isEmpty()) {
            return false;
        }
        for (IrmoAnimationDelegate irmoAnimationDelegate : this.animations) {
            irmoAnimationDelegate.resume();
        }
        return true;
    }
}

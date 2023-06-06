package com.sankuai.waimai.irmo.render.bean.anim;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.log.a;
import com.sankuai.waimai.irmo.render.bean.anim.IrmoAnimationDelegate;
import com.sankuai.waimai.irmo.render.bean.layers.BaseAnimEffectParams;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class IrmoAnimation extends IrmoAnimationDelegate<BaseAnimEffectParams> {
    public static ChangeQuickRedirect changeQuickRedirect;
    private IrmoAnimationDelegate animationDelegate;
    private long currentIndex;
    private boolean isRunning;
    private boolean prepared;
    private long repeatTime;

    public static /* synthetic */ long access$008(IrmoAnimation irmoAnimation) {
        long j = irmoAnimation.currentIndex;
        irmoAnimation.currentIndex = 1 + j;
        return j;
    }

    public IrmoAnimation(BaseAnimEffectParams baseAnimEffectParams, View view) {
        super(baseAnimEffectParams, view);
        Object[] objArr = {baseAnimEffectParams, view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "28f8ab1ede6c12d4c15741ddd4dfc27a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "28f8ab1ede6c12d4c15741ddd4dfc27a");
            return;
        }
        this.repeatTime = 1L;
        this.currentIndex = 0L;
        this.isRunning = false;
        this.prepared = false;
        if (baseAnimEffectParams != null) {
            this.animationDelegate = new IrmoSerialAnimation(baseAnimEffectParams.baseAnimSlices, view);
            this.repeatTime = baseAnimEffectParams.playCount;
            if (this.repeatTime < 0) {
                this.repeatTime = Long.MAX_VALUE;
            }
        }
    }

    @Override // com.sankuai.waimai.irmo.render.bean.anim.IrmoAnimationDelegate
    public boolean prepare() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "245a966d08706b426e46db71485e69b9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "245a966d08706b426e46db71485e69b9")).booleanValue();
        }
        if (this.prepared) {
            return true;
        }
        if (this.animationDelegate == null || this.repeatTime <= 0) {
            return false;
        }
        a.b("IRMO_BASE_ANIM", "preparing", new Object[0]);
        this.animationDelegate.setReporter(this.reporter);
        this.prepared = this.animationDelegate.prepare();
        this.animationDelegate.setEndListener(new IrmoAnimationDelegate.StatusListener() { // from class: com.sankuai.waimai.irmo.render.bean.anim.IrmoAnimation.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.sankuai.waimai.irmo.render.bean.anim.IrmoAnimationDelegate.StatusListener
            public void execute() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "b329d184ed1aef44076c6fad3b27244b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "b329d184ed1aef44076c6fad3b27244b");
                    return;
                }
                IrmoAnimation.access$008(IrmoAnimation.this);
                if (!IrmoAnimation.this.isRunning || IrmoAnimation.this.currentIndex >= IrmoAnimation.this.repeatTime) {
                    IrmoAnimation.this.isRunning = false;
                    if (IrmoAnimation.this.endListener != null) {
                        IrmoAnimation.this.endListener.execute();
                        return;
                    }
                    return;
                }
                IrmoAnimation.this.animationDelegate.start();
            }
        });
        return this.prepared;
    }

    @Override // com.sankuai.waimai.irmo.render.bean.anim.IrmoAnimationDelegate
    public boolean start() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f6d51969784e38964f016b202d341cfb", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f6d51969784e38964f016b202d341cfb")).booleanValue();
        }
        if (this.animationDelegate == null || !this.prepared) {
            return false;
        }
        this.currentIndex = 0L;
        boolean start = this.animationDelegate.start();
        if (start) {
            this.isRunning = true;
            if (this.startListener != null) {
                this.startListener.execute();
            }
        }
        return start;
    }

    @Override // com.sankuai.waimai.irmo.render.bean.anim.IrmoAnimationDelegate
    public boolean stop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b037da27e1eec1a8e89ca0e4098bfa29", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b037da27e1eec1a8e89ca0e4098bfa29")).booleanValue();
        }
        if (this.animationDelegate == null || !this.prepared) {
            return false;
        }
        this.isRunning = false;
        return this.animationDelegate.stop();
    }

    @Override // com.sankuai.waimai.irmo.render.bean.anim.IrmoAnimationDelegate
    public boolean pause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7576fbddd2e6fb1099cc1f2a66b0634e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7576fbddd2e6fb1099cc1f2a66b0634e")).booleanValue();
        }
        if (this.animationDelegate == null || !this.prepared) {
            return false;
        }
        return this.animationDelegate.pause();
    }

    @Override // com.sankuai.waimai.irmo.render.bean.anim.IrmoAnimationDelegate
    public boolean resume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c12423347c5cca76d4eb3aab97536750", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c12423347c5cca76d4eb3aab97536750")).booleanValue();
        }
        if (this.animationDelegate == null || !this.prepared) {
            return false;
        }
        return this.animationDelegate.resume();
    }

    public boolean isRunning() {
        return this.isRunning;
    }
}

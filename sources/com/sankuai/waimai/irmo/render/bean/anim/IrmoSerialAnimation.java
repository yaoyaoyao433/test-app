package com.sankuai.waimai.irmo.render.bean.anim;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.irmo.render.bean.anim.IrmoAnimationDelegate;
import com.sankuai.waimai.irmo.render.bean.layers.BaseAnimEffectParams;
import com.sankuai.waimai.irmo.render.monitor.a;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class IrmoSerialAnimation extends IrmoAnimationDelegate<List<BaseAnimEffectParams.AnimSlice>> {
    public static ChangeQuickRedirect changeQuickRedirect;
    private List<IrmoAnimationDelegate> animations;
    private int currentAnimIndex;
    private IrmoAnimationDelegate.StatusListener oneEnd;

    public static /* synthetic */ int access$108(IrmoSerialAnimation irmoSerialAnimation) {
        int i = irmoSerialAnimation.currentAnimIndex;
        irmoSerialAnimation.currentAnimIndex = i + 1;
        return i;
    }

    public IrmoSerialAnimation(List<BaseAnimEffectParams.AnimSlice> list, View view) {
        super(list, view);
        Object[] objArr = {list, view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9f4405078e71edad365ea4e8fecb73a9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9f4405078e71edad365ea4e8fecb73a9");
        } else {
            this.oneEnd = new IrmoAnimationDelegate.StatusListener() { // from class: com.sankuai.waimai.irmo.render.bean.anim.IrmoSerialAnimation.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.sankuai.waimai.irmo.render.bean.anim.IrmoAnimationDelegate.StatusListener
                public void execute() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "2fda29cefee5c5dce9bec265b7f96215", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "2fda29cefee5c5dce9bec265b7f96215");
                    } else if (IrmoSerialAnimation.this.animations == null) {
                    } else {
                        IrmoSerialAnimation.access$108(IrmoSerialAnimation.this);
                        if (IrmoSerialAnimation.this.currentAnimIndex < IrmoSerialAnimation.this.animations.size()) {
                            ((IrmoAnimationDelegate) IrmoSerialAnimation.this.animations.get(IrmoSerialAnimation.this.currentAnimIndex)).start();
                        } else if (IrmoSerialAnimation.this.currentAnimIndex == IrmoSerialAnimation.this.animations.size()) {
                            if (IrmoSerialAnimation.this.endListener != null) {
                                IrmoSerialAnimation.this.endListener.execute();
                            }
                        } else {
                            if (IrmoSerialAnimation.this.reporter != null) {
                                IrmoSerialAnimation.this.reporter.a(new a.C0976a().a(1007).a("serial animation end error.").b(String.format("串行动画中动画结束回调异常, 超出: %d.", Integer.valueOf(IrmoSerialAnimation.this.currentAnimIndex - IrmoSerialAnimation.this.animations.size()))).a(true).a(), true);
                            }
                            com.sankuai.waimai.foundation.utils.log.a.e("IRMO_BASE_ANIM", "slice error.", new Object[0]);
                        }
                    }
                }
            };
        }
    }

    @Override // com.sankuai.waimai.irmo.render.bean.anim.IrmoAnimationDelegate
    public boolean prepare() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "06f6437dc62e1cb75691aad430d1d66c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "06f6437dc62e1cb75691aad430d1d66c")).booleanValue();
        }
        boolean z = true;
        this.animations = new ArrayList();
        if (this.animInfo == 0 || ((List) this.animInfo).isEmpty()) {
            return false;
        }
        for (BaseAnimEffectParams.AnimSlice animSlice : (List) this.animInfo) {
            IrmoConcurrentAnimation irmoConcurrentAnimation = new IrmoConcurrentAnimation(animSlice, this.targetView);
            irmoConcurrentAnimation.setEndListener(this.oneEnd);
            irmoConcurrentAnimation.setReporter(this.reporter);
            z = irmoConcurrentAnimation.prepare();
            if (!z) {
                break;
            }
            this.animations.add(irmoConcurrentAnimation);
        }
        return z;
    }

    @Override // com.sankuai.waimai.irmo.render.bean.anim.IrmoAnimationDelegate
    public boolean start() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3bb6aeb2debbcffd53cb0deecdd5c1f3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3bb6aeb2debbcffd53cb0deecdd5c1f3")).booleanValue();
        }
        if (this.animations == null || this.animations.isEmpty()) {
            return false;
        }
        this.currentAnimIndex = 0;
        if (!this.animations.get(this.currentAnimIndex).start() || this.startListener == null) {
            return true;
        }
        this.startListener.execute();
        return true;
    }

    @Override // com.sankuai.waimai.irmo.render.bean.anim.IrmoAnimationDelegate
    public boolean stop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6f4327682ea9e05a3c2613b7c5436745", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6f4327682ea9e05a3c2613b7c5436745")).booleanValue();
        }
        if (this.animations == null || this.animations.isEmpty() || this.currentAnimIndex < 0 || this.currentAnimIndex >= this.animations.size()) {
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2e35b040bef68242f6a984400e21b862", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2e35b040bef68242f6a984400e21b862")).booleanValue();
        }
        if (this.animations == null || this.animations.isEmpty() || this.currentAnimIndex < 0 || this.currentAnimIndex >= this.animations.size()) {
            return false;
        }
        this.animations.get(this.currentAnimIndex).pause();
        return true;
    }

    @Override // com.sankuai.waimai.irmo.render.bean.anim.IrmoAnimationDelegate
    public boolean resume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7991d55346a2502e92c61ed0bb162797", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7991d55346a2502e92c61ed0bb162797")).booleanValue();
        }
        if (this.animations == null || this.animations.isEmpty() || this.currentAnimIndex < 0 || this.currentAnimIndex >= this.animations.size()) {
            return false;
        }
        this.animations.get(this.currentAnimIndex).resume();
        return true;
    }
}

package com.dianping.shield.node.adapter.animator;

import android.os.Build;
import android.support.v7.widget.RecyclerView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class BottomAnimator extends BaseAnimator {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.shield.node.adapter.animator.BaseAnimator
    public void preAnimateAdd(RecyclerView.s sVar) {
        Object[] objArr = {sVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b27a52d94d7261ae9d90e69c09185bc1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b27a52d94d7261ae9d90e69c09185bc1");
            return;
        }
        sVar.itemView.setTranslationY(sVar.itemView.getHeight());
        sVar.itemView.setAlpha(0.0f);
        if (Build.VERSION.SDK_INT >= 21) {
            sVar.itemView.setTranslationZ(-20.0f);
        }
    }

    @Override // com.dianping.shield.node.adapter.animator.BaseAnimator
    public void animateAdd(RecyclerView.s sVar) {
        Object[] objArr = {sVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "04128c4401532b92596bfdedae2c7891", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "04128c4401532b92596bfdedae2c7891");
        } else {
            sVar.itemView.animate().alpha(1.0f).translationY(0.0f).setDuration(this.moveDuration).setListener(this.listener).start();
        }
    }

    @Override // com.dianping.shield.node.adapter.animator.BaseAnimator
    public void preAnimateRemove(RecyclerView.s sVar) {
        Object[] objArr = {sVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6796a5325670ac08a12f3081eafed40e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6796a5325670ac08a12f3081eafed40e");
        } else if (Build.VERSION.SDK_INT >= 21) {
            sVar.itemView.setTranslationZ(-20.0f);
        }
    }

    @Override // com.dianping.shield.node.adapter.animator.BaseAnimator
    public void animateRemove(RecyclerView.s sVar) {
        Object[] objArr = {sVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "11e3a34e670296121310dad0eb1dc26e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "11e3a34e670296121310dad0eb1dc26e");
        } else {
            sVar.itemView.animate().alpha(0.0f).translationY(sVar.itemView.getHeight()).setDuration(this.moveDuration).setListener(this.listener).start();
        }
    }
}

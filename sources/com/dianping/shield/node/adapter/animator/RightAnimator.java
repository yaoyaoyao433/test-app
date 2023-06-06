package com.dianping.shield.node.adapter.animator;

import android.support.v7.widget.RecyclerView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class RightAnimator extends BaseAnimator {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.shield.node.adapter.animator.BaseAnimator
    public void preAnimateRemove(RecyclerView.s sVar) {
    }

    @Override // com.dianping.shield.node.adapter.animator.BaseAnimator
    public void preAnimateAdd(RecyclerView.s sVar) {
        Object[] objArr = {sVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e759233054cb692f82db13f48843a8b4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e759233054cb692f82db13f48843a8b4");
            return;
        }
        sVar.itemView.setTranslationX(sVar.itemView.getWidth());
        sVar.itemView.setAlpha(0.0f);
    }

    @Override // com.dianping.shield.node.adapter.animator.BaseAnimator
    public void animateAdd(RecyclerView.s sVar) {
        Object[] objArr = {sVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e0fba2c4bec1e261f90e6eaa763f2e9a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e0fba2c4bec1e261f90e6eaa763f2e9a");
        } else {
            sVar.itemView.animate().alpha(1.0f).translationX(0.0f).setDuration(this.moveDuration).setListener(this.listener).start();
        }
    }

    @Override // com.dianping.shield.node.adapter.animator.BaseAnimator
    public void animateRemove(RecyclerView.s sVar) {
        Object[] objArr = {sVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7545d72c6c3f3befee67bae8ce5bb541", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7545d72c6c3f3befee67bae8ce5bb541");
        } else {
            sVar.itemView.animate().alpha(0.0f).translationX(sVar.itemView.getWidth()).setDuration(this.moveDuration).setListener(this.listener).start();
        }
    }
}

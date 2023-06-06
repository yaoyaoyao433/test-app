package com.dianping.shield.node.adapter.animator;

import android.support.v7.widget.RecyclerView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class FadeAnimator extends BaseAnimator {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.shield.node.adapter.animator.BaseAnimator
    public void preAnimateRemove(RecyclerView.s sVar) {
    }

    @Override // com.dianping.shield.node.adapter.animator.BaseAnimator
    public void preAnimateAdd(RecyclerView.s sVar) {
        Object[] objArr = {sVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9ede5058d8b57d6231ef246217d5f9c0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9ede5058d8b57d6231ef246217d5f9c0");
        } else {
            sVar.itemView.setAlpha(0.0f);
        }
    }

    @Override // com.dianping.shield.node.adapter.animator.BaseAnimator
    public void animateAdd(RecyclerView.s sVar) {
        Object[] objArr = {sVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2f9114c2cf8e1878083382c447a1e3ee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2f9114c2cf8e1878083382c447a1e3ee");
        } else {
            sVar.itemView.animate().alpha(1.0f).setDuration(this.moveDuration).setListener(this.listener).start();
        }
    }

    @Override // com.dianping.shield.node.adapter.animator.BaseAnimator
    public void animateRemove(RecyclerView.s sVar) {
        Object[] objArr = {sVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e4d14d09412e69a6050c269bfe883598", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e4d14d09412e69a6050c269bfe883598");
        } else {
            sVar.itemView.animate().alpha(0.0f).setDuration(this.moveDuration).setListener(this.listener).start();
        }
    }
}

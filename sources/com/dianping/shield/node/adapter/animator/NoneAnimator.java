package com.dianping.shield.node.adapter.animator;

import android.support.v7.widget.RecyclerView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class NoneAnimator extends BaseAnimator {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.shield.node.adapter.animator.BaseAnimator
    public void preAnimateAdd(RecyclerView.s sVar) {
    }

    @Override // com.dianping.shield.node.adapter.animator.BaseAnimator
    public void animateAdd(RecyclerView.s sVar) {
        Object[] objArr = {sVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a4bc32fa0e0673c6ce0e4c6fd3977907", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a4bc32fa0e0673c6ce0e4c6fd3977907");
        } else {
            sVar.itemView.animate().setDuration(0L).setListener(this.listener).start();
        }
    }

    @Override // com.dianping.shield.node.adapter.animator.BaseAnimator
    public void preAnimateRemove(RecyclerView.s sVar) {
        Object[] objArr = {sVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a5c92d47d2acf052e3165f2350c4c7a7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a5c92d47d2acf052e3165f2350c4c7a7");
        } else {
            sVar.itemView.setAlpha(0.0f);
        }
    }

    @Override // com.dianping.shield.node.adapter.animator.BaseAnimator
    public void animateRemove(RecyclerView.s sVar) {
        Object[] objArr = {sVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "847d6ee8607558d8ec06fa99059daebc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "847d6ee8607558d8ec06fa99059daebc");
        } else {
            sVar.itemView.animate().setDuration(0L).setListener(this.listener).start();
        }
    }
}

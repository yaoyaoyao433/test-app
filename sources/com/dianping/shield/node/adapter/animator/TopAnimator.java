package com.dianping.shield.node.adapter.animator;

import android.os.Build;
import android.support.v7.widget.RecyclerView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class TopAnimator extends BaseAnimator {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.shield.node.adapter.animator.BaseAnimator
    public void preAnimateAdd(RecyclerView.s sVar) {
        Object[] objArr = {sVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "54e25bf32c4df35a7887f66919821ebb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "54e25bf32c4df35a7887f66919821ebb");
            return;
        }
        sVar.itemView.setTranslationY(-sVar.itemView.getHeight());
        if (Build.VERSION.SDK_INT >= 21) {
            sVar.itemView.setTranslationZ(-20.0f);
        }
    }

    @Override // com.dianping.shield.node.adapter.animator.BaseAnimator
    public void animateAdd(RecyclerView.s sVar) {
        Object[] objArr = {sVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "84f313b28c465341d916c880c8ef5407", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "84f313b28c465341d916c880c8ef5407");
        } else {
            sVar.itemView.animate().translationY(0.0f).setDuration(this.moveDuration).setListener(this.listener).start();
        }
    }

    @Override // com.dianping.shield.node.adapter.animator.BaseAnimator
    public void preAnimateRemove(RecyclerView.s sVar) {
        Object[] objArr = {sVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "52d15b06692b38c5b60ab3be498a3c6d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "52d15b06692b38c5b60ab3be498a3c6d");
        } else if (Build.VERSION.SDK_INT >= 21) {
            sVar.itemView.setTranslationZ(-20.0f);
        }
    }

    @Override // com.dianping.shield.node.adapter.animator.BaseAnimator
    public void animateRemove(RecyclerView.s sVar) {
        Object[] objArr = {sVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7e94b55cfb4e9d5518ab1ba07f48230e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7e94b55cfb4e9d5518ab1ba07f48230e");
        } else {
            sVar.itemView.animate().alpha(0.0f).translationY(-sVar.itemView.getHeight()).setDuration(this.moveDuration).setListener(this.listener).start();
        }
    }
}

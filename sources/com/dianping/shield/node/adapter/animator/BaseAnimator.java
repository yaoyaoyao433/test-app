package com.dianping.shield.node.adapter.animator;

import android.animation.AnimatorListenerAdapter;
import android.support.v7.widget.RecyclerView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public abstract class BaseAnimator {
    public static ChangeQuickRedirect changeQuickRedirect;
    protected long addDuration;
    protected AnimatorListenerAdapter listener;
    protected long moveDuration;
    protected long removeDuration;

    public abstract void animateAdd(RecyclerView.s sVar);

    public abstract void animateRemove(RecyclerView.s sVar);

    public abstract void preAnimateAdd(RecyclerView.s sVar);

    public abstract void preAnimateRemove(RecyclerView.s sVar);

    public BaseAnimator() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7d64676dce86fae883b2ac335c15323d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7d64676dce86fae883b2ac335c15323d");
            return;
        }
        this.addDuration = 0L;
        this.removeDuration = 0L;
        this.moveDuration = 0L;
        this.listener = null;
    }

    public void setAddDuration(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7cc096bc6938a2d92208fc25c6390795", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7cc096bc6938a2d92208fc25c6390795");
        } else {
            this.addDuration = j;
        }
    }

    public void setRemoveDuration(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ce9b41df08f4265bd3ad15da641794b7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ce9b41df08f4265bd3ad15da641794b7");
        } else {
            this.removeDuration = j;
        }
    }

    public void setMoveDuration(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2251ab2002f718dd723fa9b32949e55b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2251ab2002f718dd723fa9b32949e55b");
        } else {
            this.moveDuration = j;
        }
    }

    public void setListener(AnimatorListenerAdapter animatorListenerAdapter) {
        this.listener = animatorListenerAdapter;
    }
}

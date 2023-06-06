package com.meituan.android.recce.views.anim;

import android.animation.AnimatorSet;
import android.text.TextUtils;
import android.view.View;
import com.meituan.android.recce.utils.b;
import com.meituan.android.recce.views.anim.node.RecceAnimConfig;
import com.meituan.android.recce.views.anim.node.RecceAnimNode;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class RecceAnimator {
    private static final String TAG = "RecceViewAnimator";
    public static ChangeQuickRedirect changeQuickRedirect;
    private RecceAnimNode animateNode;
    private AnimatorSet animatorSet;
    private UpdateListener updateListener;

    public static String mockAnim() {
        return "{\"translationY\":[1,0],\"alpha\":[0,1],\"interpolator\":\"accelerate_decelerate\",\"duration\":200}";
    }

    public RecceAnimator(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f568704c0ecbca63200ea856a7498505", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f568704c0ecbca63200ea856a7498505");
            return;
        }
        if (this.animateNode == null) {
            this.animateNode = new RecceAnimNode();
        }
        if (this.animateNode.targetView == null) {
            this.animateNode.targetView = view;
        }
    }

    public void config(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ad00b4b08addca64b55037b0ca2251fd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ad00b4b08addca64b55037b0ca2251fd");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            this.animateNode.config = (RecceAnimConfig) b.a().fromJson(str, (Class<Object>) RecceAnimConfig.class);
        }
    }

    public void setUpdateListener(UpdateListener updateListener) {
        this.updateListener = updateListener;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public class AnimatorStart implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        public AnimatorStart() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "97b9a7eec16ca97cb890a8e53e52eb6b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "97b9a7eec16ca97cb890a8e53e52eb6b");
                return;
            }
            if (RecceAnimator.this.animatorSet == null) {
                RecceAnimator.this.animatorSet = getAnimatorSet(RecceAnimator.this.animateNode.config);
            }
            RecceAnimator.this.animatorSet.start();
        }

        public AnimatorSet getAnimatorSet(RecceAnimConfig recceAnimConfig) {
            Object[] objArr = {recceAnimConfig};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "398643b8f0034c6100c513f5585c890d", RobustBitConfig.DEFAULT_VALUE)) {
                return (AnimatorSet) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "398643b8f0034c6100c513f5585c890d");
            }
            AnimatorSet animatorSet = new AnimatorSet();
            if (recceAnimConfig == null) {
                return animatorSet;
            }
            animatorSet.setDuration(recceAnimConfig.duration).setStartDelay(recceAnimConfig.startDelay);
            animatorSet.setInterpolator(RecceAnimUtils.configInterpolator(recceAnimConfig));
            animatorSet.playTogether(RecceAnimUtils.configAnimator(RecceAnimator.this.animateNode.targetView, recceAnimConfig));
            return animatorSet;
        }
    }

    public void start() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1bbc54a58a3b6ddeaafd55f99772dd9a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1bbc54a58a3b6ddeaafd55f99772dd9a");
        } else {
            this.animateNode.targetView.post(new AnimatorStart());
        }
    }

    public void cancel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f36b71310579c192ad06550b7fbc6197", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f36b71310579c192ad06550b7fbc6197");
        } else if (this.animatorSet != null) {
            this.animatorSet.cancel();
        }
    }

    public boolean isRunning() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "607ab5d3ccb6f841ea15f752dabc39db", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "607ab5d3ccb6f841ea15f752dabc39db")).booleanValue();
        }
        if (this.animatorSet != null) {
            return this.animatorSet.isRunning();
        }
        return false;
    }

    public boolean isStarted() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cbec1b10318860fedb8e76ee308b9734", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cbec1b10318860fedb8e76ee308b9734")).booleanValue();
        }
        if (this.animatorSet != null) {
            return this.animatorSet.isStarted();
        }
        return false;
    }

    public void end() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e8a85525e915c150a0b5d0687171d406", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e8a85525e915c150a0b5d0687171d406");
        } else if (this.animatorSet != null) {
            this.animatorSet.end();
        }
    }
}

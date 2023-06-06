package com.sankuai.meituan.mapsdk.maps.model.animation;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.model.animation.Animation;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class AnimationSet extends Animation {
    public static final int SHARE_DURATION_MASK = 2;
    public static final int SHARE_INTERPOLATOR_MASK = 1;
    public static ChangeQuickRedirect changeQuickRedirect;
    private int d;
    public List<Animation> mAnimations;
    public boolean mShareInterpolator;

    public AnimationSet(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "837ba80150051c97b0ae62799e84fda7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "837ba80150051c97b0ae62799e84fda7");
            return;
        }
        this.d = 0;
        this.a = Animation.AnimationType.SET;
        Object[] objArr2 = {1, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "8803ad03aa76f7f6d8ba59b3158e973f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "8803ad03aa76f7f6d8ba59b3158e973f");
        } else if (z) {
            this.d = 1 | this.d;
        } else {
            this.d &= -2;
        }
        this.mShareInterpolator = z;
        this.mAnimations = new ArrayList();
    }

    public boolean addAnimation(Animation animation) {
        Object[] objArr = {animation};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aaf3e34d7f77a8102964e9d0bd7d8280", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aaf3e34d7f77a8102964e9d0bd7d8280")).booleanValue();
        }
        if (animation == null) {
            return false;
        }
        synchronized (this) {
            this.mAnimations.add(animation);
        }
        return true;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.model.animation.Animation
    public void setDuration(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ef9caa8dd5209ed1e03a9666d06f6d00", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ef9caa8dd5209ed1e03a9666d06f6d00");
            return;
        }
        this.d |= 2;
        super.setDuration(j);
    }

    public List<Animation> getAnimationList() {
        return this.mAnimations;
    }

    public void cleanAnimation() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1947e6b62d45a4d1d5a0d161cad77d85", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1947e6b62d45a4d1d5a0d161cad77d85");
            return;
        }
        synchronized (this) {
            this.mAnimations.clear();
        }
    }

    public boolean isShareInterpolator() {
        return this.mShareInterpolator;
    }

    public int getFlag() {
        return this.d;
    }
}

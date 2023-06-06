package com.sankuai.meituan.mapsdk.maps.model.animation;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.animation.Interpolator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class Animation {
    public static ChangeQuickRedirect changeQuickRedirect;
    protected AnimationType a;
    protected long b;
    protected Interpolator c;
    private AnimationListener d;
    private int e;
    private RepeatMode f;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface AnimationListener {
        void onAnimationCancel(Animator animator);

        void onAnimationEnd();

        void onAnimationStart();

        void onAnimationUpdate(ValueAnimator valueAnimator);
    }

    public Animation() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7aaf1f51abe38f431e0e5249a9a24974", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7aaf1f51abe38f431e0e5249a9a24974");
            return;
        }
        this.b = 1L;
        this.e = 0;
        this.f = RepeatMode.RESTART;
        this.a = AnimationType.ALPHA;
        this.b = 1L;
    }

    public AnimationType getType() {
        return this.a;
    }

    public void setDuration(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "076f294754a1d58885bdba3c01c639c5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "076f294754a1d58885bdba3c01c639c5");
        } else {
            this.b = j;
        }
    }

    public long getDuration() {
        return this.b;
    }

    public void setInterpolator(Interpolator interpolator) {
        this.c = interpolator;
    }

    public Interpolator getInterpolator() {
        return this.c;
    }

    public void setRepeatCount(int i) {
        this.e = i;
    }

    public int getRepeatCount() {
        return this.e;
    }

    public void setRepeatMode(RepeatMode repeatMode) {
        this.f = repeatMode;
    }

    public RepeatMode getRepeatMode() {
        return this.f;
    }

    public void setAnimationListener(AnimationListener animationListener) {
        this.d = animationListener;
    }

    public AnimationListener getAnimationListener() {
        return this.d;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public enum AnimationType {
        SET,
        ALPHA,
        ROTATE,
        SCALE,
        TRANSLATE,
        EMERGE,
        FRAME;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        public static AnimationType valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0896d5768161e5f00415009dda352f36", RobustBitConfig.DEFAULT_VALUE) ? (AnimationType) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0896d5768161e5f00415009dda352f36") : (AnimationType) Enum.valueOf(AnimationType.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static AnimationType[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "75e4bf5869fec7d0473bf6fde0e68a0a", RobustBitConfig.DEFAULT_VALUE) ? (AnimationType[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "75e4bf5869fec7d0473bf6fde0e68a0a") : (AnimationType[]) values().clone();
        }

        AnimationType() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e0695b8f862721297fe48f5202477728", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e0695b8f862721297fe48f5202477728");
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public enum RepeatMode {
        RESTART,
        REVERSE;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        RepeatMode() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1e686df3f0dde00ae90920501cacab3a", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1e686df3f0dde00ae90920501cacab3a");
            }
        }

        public static RepeatMode valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "47382ef5e40827882de515fc72752abc", RobustBitConfig.DEFAULT_VALUE) ? (RepeatMode) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "47382ef5e40827882de515fc72752abc") : (RepeatMode) Enum.valueOf(RepeatMode.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static RepeatMode[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8d3cc62a2dc3c08714c8590d63f28fa1", RobustBitConfig.DEFAULT_VALUE) ? (RepeatMode[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8d3cc62a2dc3c08714c8590d63f28fa1") : (RepeatMode[]) values().clone();
        }
    }
}

package com.dianping.shield.components.scrolltab;

import android.content.Context;
import android.view.ViewConfiguration;
import android.view.animation.AnimationUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class FlingHelper {
    private static final float END_TENSION = 1.0f;
    private static final float INFLEXION = 0.35f;
    private static final int NB_SAMPLES = 100;
    private static final float P1 = 0.175f;
    private static final float P2 = 0.35000002f;
    private static final float START_TENSION = 0.5f;
    public static ChangeQuickRedirect changeQuickRedirect;
    private float mDeceleration;
    private int mDistance;
    private int mDuration;
    private boolean mFinished;
    private float mFlingFriction;
    private boolean mInited;
    private float mPhysicalCoeff;
    private final float mPpi;
    private long mStartTime;
    private float mVelocity;
    private static float DECELERATION_RATE = (float) (Math.log(0.78d) / Math.log(0.9d));
    private static final float[] SPLINE_POSITION = new float[101];
    private static final float[] SPLINE_TIME = new float[101];

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    enum FlingHelperState {
        STARTED,
        FINISHED,
        READY;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        FlingHelperState() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a34640e1b03b69245a2cc7adf00d974f", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a34640e1b03b69245a2cc7adf00d974f");
            }
        }

        public static FlingHelperState valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "206bce42e90ee1d53910aa89d9c1140c", RobustBitConfig.DEFAULT_VALUE) ? (FlingHelperState) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "206bce42e90ee1d53910aa89d9c1140c") : (FlingHelperState) Enum.valueOf(FlingHelperState.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static FlingHelperState[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5b0942df40852307c8d1dabdf7b9be45", RobustBitConfig.DEFAULT_VALUE) ? (FlingHelperState[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5b0942df40852307c8d1dabdf7b9be45") : (FlingHelperState[]) values().clone();
        }
    }

    static {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11 = 0.0f;
        int i = 0;
        float f12 = 0.0f;
        while (true) {
            float f13 = 1.0f;
            if (i < 100) {
                float f14 = i / 100.0f;
                float f15 = 1.0f;
                while (true) {
                    f = 2.0f;
                    f2 = ((f15 - f11) / 2.0f) + f11;
                    f3 = 3.0f;
                    f4 = f13 - f2;
                    f5 = f2 * 3.0f * f4;
                    f6 = f2 * f2 * f2;
                    float f16 = (((f4 * P1) + (f2 * P2)) * f5) + f6;
                    float f17 = f15;
                    if (Math.abs(f16 - f14) < 1.0E-5d) {
                        break;
                    }
                    if (f16 > f14) {
                        f15 = f2;
                    } else {
                        f11 = f2;
                        f15 = f17;
                    }
                    f13 = 1.0f;
                }
                SPLINE_POSITION[i] = (f5 * ((f4 * 0.5f) + f2)) + f6;
                float f18 = 1.0f;
                while (true) {
                    f7 = ((f18 - f12) / f) + f12;
                    f8 = 1.0f - f7;
                    f9 = f7 * f3 * f8;
                    f10 = f7 * f7 * f7;
                    float f19 = (((f8 * 0.5f) + f7) * f9) + f10;
                    if (Math.abs(f19 - f14) >= 1.0E-5d) {
                        if (f19 > f14) {
                            f18 = f7;
                        } else {
                            f12 = f7;
                        }
                        f = 2.0f;
                        f3 = 3.0f;
                    }
                }
                SPLINE_TIME[i] = (f9 * ((f8 * P1) + (f7 * P2))) + f10;
                i++;
            } else {
                float[] fArr = SPLINE_POSITION;
                SPLINE_TIME[100] = 1.0f;
                fArr[100] = 1.0f;
                return;
            }
        }
    }

    public FlingHelper(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "623dcd3d9c365faa26e6f428f015643f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "623dcd3d9c365faa26e6f428f015643f");
            return;
        }
        this.mFlingFriction = ViewConfiguration.getScrollFriction();
        this.mPpi = context.getResources().getDisplayMetrics().density * 160.0f;
        this.mDeceleration = computeDeceleration(ViewConfiguration.getScrollFriction());
        this.mPhysicalCoeff = computeDeceleration(0.84f);
    }

    private float computeDeceleration(float f) {
        return this.mPpi * 386.0878f * f;
    }

    public int timePassed() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "49bd7b633cafa37854760cb9b15bc1b5", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "49bd7b633cafa37854760cb9b15bc1b5")).intValue() : (int) (AnimationUtils.currentAnimationTimeMillis() - this.mStartTime);
    }

    public float getVelocity() {
        return this.mVelocity;
    }

    public int getDistance() {
        return this.mDistance;
    }

    public boolean isFinished() {
        return this.mFinished;
    }

    public boolean isInited() {
        return this.mInited;
    }

    public void initFling(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "99907ee11574f39c9e2b66853420e3a4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "99907ee11574f39c9e2b66853420e3a4");
            return;
        }
        this.mFinished = false;
        this.mInited = true;
        this.mVelocity = f;
        this.mDuration = getSplineFlingDuration(f);
        this.mDistance = (int) (getSplineFlingDistance(f) * Math.signum(f));
        this.mStartTime = AnimationUtils.currentAnimationTimeMillis();
    }

    public void finishFling() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fe48617febe90e6eff6dd1880710441b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fe48617febe90e6eff6dd1880710441b");
            return;
        }
        this.mFinished = true;
        this.mInited = false;
        this.mVelocity = 0.0f;
        this.mDuration = 0;
        this.mDistance = 0;
        this.mStartTime = 0L;
    }

    public float getCurrentVelocity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6569a9c077735987d4ef4faa9c1af0dd", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6569a9c077735987d4ef4faa9c1af0dd")).floatValue();
        }
        float f = 0.0f;
        if (this.mFinished) {
            return 0.0f;
        }
        int timePassed = (int) ((timePassed() / this.mDuration) * 100.0f);
        if (timePassed < 100 && timePassed >= 0) {
            int i = timePassed + 1;
            float f2 = SPLINE_POSITION[timePassed];
            f = (SPLINE_POSITION[i] - f2) / ((i / 100.0f) - (timePassed / 100.0f));
        }
        return ((f * this.mDistance) / this.mDuration) * 1000.0f;
    }

    public double getSplineDeceleration(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7f15f76d33d305601173c4e8253199dd", RobustBitConfig.DEFAULT_VALUE) ? ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7f15f76d33d305601173c4e8253199dd")).doubleValue() : Math.log((Math.abs(f) * INFLEXION) / (this.mFlingFriction * this.mPhysicalCoeff));
    }

    public int getSplineFlingDuration(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4a622060aeb6bbcf45f86e0ffe3b2bf1", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4a622060aeb6bbcf45f86e0ffe3b2bf1")).intValue() : (int) (Math.exp(getSplineDeceleration(f) / (DECELERATION_RATE - 1.0d)) * 1000.0d);
    }

    public double getSplineFlingDistance(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "afbeba09bb4d00fc0452b17a4229653a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "afbeba09bb4d00fc0452b17a4229653a")).doubleValue();
        }
        return this.mFlingFriction * this.mPhysicalCoeff * Math.exp((DECELERATION_RATE / (DECELERATION_RATE - 1.0d)) * getSplineDeceleration(f));
    }
}

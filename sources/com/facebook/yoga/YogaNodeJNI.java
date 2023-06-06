package com.facebook.yoga;

import com.facebook.proguard.annotations.DoNotStrip;
/* compiled from: ProGuard */
@DoNotStrip
/* loaded from: classes2.dex */
public class YogaNodeJNI extends YogaNodeJNIBase {
    @DoNotStrip
    private float mBorderBottom;
    @DoNotStrip
    private float mBorderLeft;
    @DoNotStrip
    private float mBorderRight;
    @DoNotStrip
    private float mBorderTop;
    @DoNotStrip
    private boolean mDoesLegacyStretchFlagAffectsLayout;
    @DoNotStrip
    private boolean mHasNewLayout;
    @DoNotStrip
    private float mHeight;
    @DoNotStrip
    private int mLayoutDirection;
    @DoNotStrip
    private float mLeft;
    @DoNotStrip
    private float mMarginBottom;
    @DoNotStrip
    private float mMarginLeft;
    @DoNotStrip
    private float mMarginRight;
    @DoNotStrip
    private float mMarginTop;
    @DoNotStrip
    private float mPaddingBottom;
    @DoNotStrip
    private float mPaddingLeft;
    @DoNotStrip
    private float mPaddingRight;
    @DoNotStrip
    private float mPaddingTop;
    @DoNotStrip
    private float mTop;
    @DoNotStrip
    private float mWidth;

    public YogaNodeJNI() {
        this.mWidth = Float.NaN;
        this.mHeight = Float.NaN;
        this.mTop = Float.NaN;
        this.mLeft = Float.NaN;
        this.mMarginLeft = 0.0f;
        this.mMarginTop = 0.0f;
        this.mMarginRight = 0.0f;
        this.mMarginBottom = 0.0f;
        this.mPaddingLeft = 0.0f;
        this.mPaddingTop = 0.0f;
        this.mPaddingRight = 0.0f;
        this.mPaddingBottom = 0.0f;
        this.mBorderLeft = 0.0f;
        this.mBorderTop = 0.0f;
        this.mBorderRight = 0.0f;
        this.mBorderBottom = 0.0f;
        this.mLayoutDirection = 0;
        this.mHasNewLayout = true;
        this.mDoesLegacyStretchFlagAffectsLayout = false;
    }

    public YogaNodeJNI(a aVar) {
        super(aVar);
        this.mWidth = Float.NaN;
        this.mHeight = Float.NaN;
        this.mTop = Float.NaN;
        this.mLeft = Float.NaN;
        this.mMarginLeft = 0.0f;
        this.mMarginTop = 0.0f;
        this.mMarginRight = 0.0f;
        this.mMarginBottom = 0.0f;
        this.mPaddingLeft = 0.0f;
        this.mPaddingTop = 0.0f;
        this.mPaddingRight = 0.0f;
        this.mPaddingBottom = 0.0f;
        this.mBorderLeft = 0.0f;
        this.mBorderTop = 0.0f;
        this.mBorderRight = 0.0f;
        this.mBorderBottom = 0.0f;
        this.mLayoutDirection = 0;
        this.mHasNewLayout = true;
        this.mDoesLegacyStretchFlagAffectsLayout = false;
    }

    @Override // com.facebook.yoga.YogaNodeJNIBase, com.facebook.yoga.d
    public final void b() {
        super.b();
        this.mHasNewLayout = true;
        this.mWidth = Float.NaN;
        this.mHeight = Float.NaN;
        this.mTop = Float.NaN;
        this.mLeft = Float.NaN;
        this.mMarginLeft = 0.0f;
        this.mMarginTop = 0.0f;
        this.mMarginRight = 0.0f;
        this.mMarginBottom = 0.0f;
        this.mPaddingLeft = 0.0f;
        this.mPaddingTop = 0.0f;
        this.mPaddingRight = 0.0f;
        this.mPaddingBottom = 0.0f;
        this.mBorderLeft = 0.0f;
        this.mBorderTop = 0.0f;
        this.mBorderRight = 0.0f;
        this.mBorderBottom = 0.0f;
        this.mLayoutDirection = 0;
        this.mDoesLegacyStretchFlagAffectsLayout = false;
    }

    @Override // com.facebook.yoga.d
    public final boolean e() {
        return this.mHasNewLayout;
    }

    @Override // com.facebook.yoga.d
    public final void i() {
        this.mHasNewLayout = false;
    }

    @Override // com.facebook.yoga.d
    public final float q() {
        return this.mLeft;
    }

    @Override // com.facebook.yoga.d
    public final float r() {
        return this.mTop;
    }

    @Override // com.facebook.yoga.d
    public final float s() {
        return this.mWidth;
    }

    @Override // com.facebook.yoga.d
    public final float t() {
        return this.mHeight;
    }

    @Override // com.facebook.yoga.d
    public final float e(YogaEdge yogaEdge) {
        switch (yogaEdge) {
            case LEFT:
                return this.mMarginLeft;
            case TOP:
                return this.mMarginTop;
            case RIGHT:
                return this.mMarginRight;
            case BOTTOM:
                return this.mMarginBottom;
            case START:
                return YogaDirection.a(this.mLayoutDirection) == YogaDirection.RTL ? this.mMarginRight : this.mMarginLeft;
            case END:
                return YogaDirection.a(this.mLayoutDirection) == YogaDirection.RTL ? this.mMarginLeft : this.mMarginRight;
            default:
                throw new IllegalArgumentException("Cannot get layout margins of multi-edge shorthands");
        }
    }

    @Override // com.facebook.yoga.d
    public final float f(YogaEdge yogaEdge) {
        switch (yogaEdge) {
            case LEFT:
                return this.mPaddingLeft;
            case TOP:
                return this.mPaddingTop;
            case RIGHT:
                return this.mPaddingRight;
            case BOTTOM:
                return this.mPaddingBottom;
            case START:
                return YogaDirection.a(this.mLayoutDirection) == YogaDirection.RTL ? this.mPaddingRight : this.mPaddingLeft;
            case END:
                return YogaDirection.a(this.mLayoutDirection) == YogaDirection.RTL ? this.mPaddingLeft : this.mPaddingRight;
            default:
                throw new IllegalArgumentException("Cannot get layout paddings of multi-edge shorthands");
        }
    }

    @Override // com.facebook.yoga.d
    public final float g(YogaEdge yogaEdge) {
        switch (yogaEdge) {
            case LEFT:
                return this.mBorderLeft;
            case TOP:
                return this.mBorderTop;
            case RIGHT:
                return this.mBorderRight;
            case BOTTOM:
                return this.mBorderBottom;
            case START:
                return YogaDirection.a(this.mLayoutDirection) == YogaDirection.RTL ? this.mBorderRight : this.mBorderLeft;
            case END:
                return YogaDirection.a(this.mLayoutDirection) == YogaDirection.RTL ? this.mBorderLeft : this.mBorderRight;
            default:
                throw new IllegalArgumentException("Cannot get layout border of multi-edge shorthands");
        }
    }

    @Override // com.facebook.yoga.d
    public final YogaDirection u() {
        return YogaDirection.a(this.mLayoutDirection);
    }
}

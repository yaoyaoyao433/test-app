package android.support.constraint;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;
import android.view.ViewGroup;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class Constraints extends ViewGroup {
    android.support.constraint.a a;

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    public Constraints(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public Constraints(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        super.setVisibility(8);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class a extends ConstraintLayout.a {
        public float an;
        public boolean ao;
        public float ap;
        public float aq;
        public float ar;
        public float as;
        public float at;
        public float au;
        public float av;
        public float aw;
        public float ax;
        public float ay;
        public float az;

        public a(int i, int i2) {
            super(-2, -2);
            this.an = 1.0f;
            this.ao = false;
            this.ap = 0.0f;
            this.aq = 0.0f;
            this.ar = 0.0f;
            this.as = 0.0f;
            this.at = 1.0f;
            this.au = 1.0f;
            this.av = 0.0f;
            this.aw = 0.0f;
            this.ax = 0.0f;
            this.ay = 0.0f;
            this.az = 0.0f;
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.an = 1.0f;
            this.ao = false;
            this.ap = 0.0f;
            this.aq = 0.0f;
            this.ar = 0.0f;
            this.as = 0.0f;
            this.at = 1.0f;
            this.au = 1.0f;
            this.av = 0.0f;
            this.aw = 0.0f;
            this.ax = 0.0f;
            this.ay = 0.0f;
            this.az = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ConstraintSet);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == R.styleable.ConstraintSet_android_alpha) {
                    this.an = obtainStyledAttributes.getFloat(index, this.an);
                } else if (index == R.styleable.ConstraintSet_android_elevation) {
                    this.ap = obtainStyledAttributes.getFloat(index, this.ap);
                    this.ao = true;
                } else if (index == R.styleable.ConstraintSet_android_rotationX) {
                    this.ar = obtainStyledAttributes.getFloat(index, this.ar);
                } else if (index == R.styleable.ConstraintSet_android_rotationY) {
                    this.as = obtainStyledAttributes.getFloat(index, this.as);
                } else if (index == R.styleable.ConstraintSet_android_rotation) {
                    this.aq = obtainStyledAttributes.getFloat(index, this.aq);
                } else if (index == R.styleable.ConstraintSet_android_scaleX) {
                    this.at = obtainStyledAttributes.getFloat(index, this.at);
                } else if (index == R.styleable.ConstraintSet_android_scaleY) {
                    this.au = obtainStyledAttributes.getFloat(index, this.au);
                } else if (index == R.styleable.ConstraintSet_android_transformPivotX) {
                    this.av = obtainStyledAttributes.getFloat(index, this.av);
                } else if (index == R.styleable.ConstraintSet_android_transformPivotY) {
                    this.aw = obtainStyledAttributes.getFloat(index, this.aw);
                } else if (index == R.styleable.ConstraintSet_android_translationX) {
                    this.ax = obtainStyledAttributes.getFloat(index, this.ax);
                } else if (index == R.styleable.ConstraintSet_android_translationY) {
                    this.ay = obtainStyledAttributes.getFloat(index, this.ay);
                } else if (index == R.styleable.ConstraintSet_android_translationZ) {
                    this.ax = obtainStyledAttributes.getFloat(index, this.az);
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ConstraintLayout.a(layoutParams);
    }

    public android.support.constraint.a getConstraintSet() {
        if (this.a == null) {
            this.a = new android.support.constraint.a();
        }
        this.a.a(this);
        return this.a;
    }

    @Override // android.view.ViewGroup
    protected /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new a(-2, -2);
    }

    @Override // android.view.ViewGroup
    public /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }
}

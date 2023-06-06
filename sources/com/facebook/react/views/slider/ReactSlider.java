package com.facebook.react.views.slider;

import android.content.Context;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.v7.widget.AppCompatSeekBar;
import android.util.AttributeSet;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class ReactSlider extends AppCompatSeekBar {
    private static int a = 128;
    private double b;
    private double c;
    private double d;
    private double e;
    private double f;

    public ReactSlider(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = 0.0d;
        this.c = 0.0d;
        this.d = 0.0d;
        this.e = 0.0d;
        this.f = 0.0d;
        if (Build.VERSION.SDK_INT < 23 || Build.VERSION.SDK_INT >= 26) {
            return;
        }
        super.setStateListAnimator(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setMaxValue(double d) {
        this.c = d;
        a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setMinValue(double d) {
        this.b = d;
        a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setValue(double d) {
        this.d = d;
        b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setStep(double d) {
        this.e = d;
        a();
    }

    public final double a(int i) {
        if (i == getMax()) {
            return this.c;
        }
        return (i * getStepValue()) + this.b;
    }

    private void a() {
        if (this.e == 0.0d) {
            this.f = (this.c - this.b) / a;
        }
        setMax(getTotalSteps());
        b();
    }

    private void b() {
        setProgress((int) Math.round(((this.d - this.b) / (this.c - this.b)) * getTotalSteps()));
    }

    private int getTotalSteps() {
        return (int) Math.ceil((this.c - this.b) / getStepValue());
    }

    private double getStepValue() {
        return this.e > 0.0d ? this.e : this.f;
    }
}

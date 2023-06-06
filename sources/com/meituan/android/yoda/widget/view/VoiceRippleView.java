package com.meituan.android.yoda.widget.view;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.view.animation.LinearInterpolator;
import com.meituan.android.yoda.util.c;
import com.meituan.android.yoda.util.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class VoiceRippleView extends BaseImageView implements ValueAnimator.AnimatorUpdateListener, c.a {
    public static ChangeQuickRedirect b;
    boolean c;
    ValueAnimator d;
    private Paint e;
    private float f;
    private float g;
    private float h;
    private int i;
    private float j;
    private long k;

    public VoiceRippleView(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d983bcd62ac7d8a503b125ebfd693c3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d983bcd62ac7d8a503b125ebfd693c3");
        }
    }

    public VoiceRippleView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "019a576c8a0462b8fdbcad62ebf5b485", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "019a576c8a0462b8fdbcad62ebf5b485");
        }
    }

    public VoiceRippleView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e8d65988bd6ccc2ea4f1dcdf91b37374", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e8d65988bd6ccc2ea4f1dcdf91b37374");
            return;
        }
        this.c = false;
        this.f = 0.0f;
        this.g = 0.0f;
        this.h = 0.0f;
        this.i = 805291776;
        this.j = 2.0f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.yodaVoiceVerifyRippleColor}, i, 0);
        if (obtainStyledAttributes != null) {
            this.i = obtainStyledAttributes.getColor(0, 16764928);
            obtainStyledAttributes.recycle();
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = b;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8c7e05d48a882dc9d2ba8dea6b9602d3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8c7e05d48a882dc9d2ba8dea6b9602d3");
            return;
        }
        this.e = new Paint(5);
        this.e.setStyle(Paint.Style.STROKE);
        this.e.setStrokeJoin(Paint.Join.ROUND);
        this.e.setStrokeCap(Paint.Cap.ROUND);
        this.e.setStrokeWidth(x.a(this.j));
        this.e.setColor(this.i);
        this.d = ValueAnimator.ofFloat(0.0f, this.f);
        this.d.setInterpolator(new LinearInterpolator());
        this.d.setDuration(200L);
        this.d.addListener(new Animator.AnimatorListener() { // from class: com.meituan.android.yoda.widget.view.VoiceRippleView.1
            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
            }
        });
        this.d.addUpdateListener(this);
    }

    public void setSampleRate(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a5245fc24cb6f62ad43ab3a27351f58c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a5245fc24cb6f62ad43ab3a27351f58c");
        } else {
            this.k = j;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f3df95f61393a3fb952124e81c67fc5c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f3df95f61393a3fb952124e81c67fc5c");
        } else {
            super.onMeasure(i, i2);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d90332dd228f0dc0db11540119b974e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d90332dd228f0dc0db11540119b974e");
            return;
        }
        int width = getWidth();
        int height = getHeight();
        super.onDraw(canvas);
        if (!this.c || this.e == null) {
            return;
        }
        canvas.drawCircle(width / 2.0f, height / 2.0f, x.a(this.h), this.e);
    }

    @Override // com.meituan.android.yoda.util.c.a
    public final void a(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac5851f6e179d89d6256c633d28f8fe5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac5851f6e179d89d6256c633d28f8fe5");
        } else {
            post(e.a(this, d));
        }
    }

    public static /* synthetic */ void a(VoiceRippleView voiceRippleView, double d) {
        Object[] objArr = {voiceRippleView, Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6d65a5e4e6329bdc1a319e184960e0ed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6d65a5e4e6329bdc1a319e184960e0ed");
            return;
        }
        voiceRippleView.d.cancel();
        voiceRippleView.g = voiceRippleView.f;
        voiceRippleView.f = (float) (d * 1.600000023841858d);
        voiceRippleView.d.setFloatValues(voiceRippleView.g, voiceRippleView.f);
        voiceRippleView.d.start();
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        Object[] objArr = {valueAnimator};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3cd10fef95e7579bbe163428ff60acb5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3cd10fef95e7579bbe163428ff60acb5");
            return;
        }
        this.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        invalidate();
    }
}

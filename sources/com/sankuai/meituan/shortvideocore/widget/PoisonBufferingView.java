package com.sankuai.meituan.shortvideocore.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.shortvideocore.utils.b;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class PoisonBufferingView extends View {
    public static ChangeQuickRedirect a;
    public final String b;
    public RectF c;
    private Paint d;
    private ValueAnimator e;
    private LinearGradient f;
    private int g;
    private float h;
    private boolean i;
    private int j;
    private a k;

    public PoisonBufferingView(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "958d73086696c458d68617248fd28665", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "958d73086696c458d68617248fd28665");
        }
    }

    public PoisonBufferingView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6fb7b40af139c82d7f5750088daf1995", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6fb7b40af139c82d7f5750088daf1995");
            return;
        }
        this.b = getClass().getSimpleName();
        this.c = new RectF();
        this.d = new Paint();
        this.k = new a(this);
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "40fdbdda7f8f4d443ce938a1e4655950", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "40fdbdda7f8f4d443ce938a1e4655950");
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        this.h = getY();
        this.j = getMeasuredWidth();
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a51c61214c9c1ba40c79c227125cccb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a51c61214c9c1ba40c79c227125cccb");
        } else if (isAttachedToWindow()) {
            new StringBuilder("START Buffer mValueAnimator is null:").append(this.e == null);
            if (this.e == null) {
                this.g = this.j / 2;
                this.e = ValueAnimator.ofInt(this.j / 2, 0);
                this.f = new LinearGradient(this.g, this.h, this.j / 2, this.h, Color.parseColor("#00FFFFFF"), Color.parseColor("#FFFFFFFF"), Shader.TileMode.MIRROR);
                this.e.setDuration(1000L);
                this.e.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.sankuai.meituan.shortvideocore.widget.PoisonBufferingView.1
                    public static ChangeQuickRedirect a;

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        Object[] objArr2 = {valueAnimator};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "71382705b1ad164b4f4fe2eb3249b10b", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "71382705b1ad164b4f4fe2eb3249b10b");
                            return;
                        }
                        PoisonBufferingView.this.g = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                        PoisonBufferingView.this.f = new LinearGradient(PoisonBufferingView.this.g, PoisonBufferingView.this.h, PoisonBufferingView.this.j / 2, PoisonBufferingView.this.h, Color.parseColor("#00FFFFFF"), Color.parseColor("#FFFFFFFF"), Shader.TileMode.MIRROR);
                        PoisonBufferingView.this.d.setShader(PoisonBufferingView.this.f);
                        PoisonBufferingView.this.invalidate();
                    }
                });
                this.e.addListener(new AnimatorListenerAdapter() { // from class: com.sankuai.meituan.shortvideocore.widget.PoisonBufferingView.2
                    public static ChangeQuickRedirect a;

                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public final void onAnimationEnd(Animator animator) {
                        Object[] objArr2 = {animator};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "61cb9e37ddf915fde7ed12bf4aaf10d9", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "61cb9e37ddf915fde7ed12bf4aaf10d9");
                            return;
                        }
                        super.onAnimationEnd(animator);
                        PoisonBufferingView.this.i = false;
                        PoisonBufferingView.this.invalidate();
                        if (PoisonBufferingView.this.k != null) {
                            PoisonBufferingView.this.k.sendEmptyMessageDelayed(0, 200L);
                        }
                    }

                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public final void onAnimationStart(Animator animator) {
                        Object[] objArr2 = {animator};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6deae70473fe9eb984f181e1a2563c33", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6deae70473fe9eb984f181e1a2563c33");
                            return;
                        }
                        super.onAnimationStart(animator);
                        PoisonBufferingView.this.i = true;
                        PoisonBufferingView.this.invalidate();
                    }
                });
            }
            this.e.start();
            this.i = true;
            invalidate();
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dcc6aebb061a0fd256c1936ff504bfcd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dcc6aebb061a0fd256c1936ff504bfcd");
            return;
        }
        new StringBuilder("STOP Buffer mValueAnimator is null:").append(this.e == null);
        if (this.e != null) {
            this.e.cancel();
            this.e.removeAllUpdateListeners();
            this.e.removeAllListeners();
            this.e = null;
        }
        if (this.k != null) {
            this.k.removeCallbacksAndMessages(null);
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "283301214d175b755b6fbfd61daa6b93", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "283301214d175b755b6fbfd61daa6b93");
            return;
        }
        super.onDetachedFromWindow();
        b();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9750dfc3e641939d83a9d78c99e5ded4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9750dfc3e641939d83a9d78c99e5ded4");
        } else if (this.i) {
            this.c.left = this.g;
            this.c.top = 0.0f;
            this.c.right = getWidth() - this.g;
            this.c.bottom = b.a(getContext(), 1.0f);
            canvas.drawRect(this.c, this.d);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a extends Handler {
        public static ChangeQuickRedirect a;
        private WeakReference<PoisonBufferingView> b;

        public a(PoisonBufferingView poisonBufferingView) {
            Object[] objArr = {poisonBufferingView};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3cd1b851c52f3fc3885d1f6388d6bbcf", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3cd1b851c52f3fc3885d1f6388d6bbcf");
            } else {
                this.b = new WeakReference<>(poisonBufferingView);
            }
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            PoisonBufferingView poisonBufferingView;
            Object[] objArr = {message};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed22aaae75cf71da41b7b208b1c60756", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed22aaae75cf71da41b7b208b1c60756");
                return;
            }
            super.handleMessage(message);
            if (message.what != 0 || (poisonBufferingView = this.b.get()) == null || poisonBufferingView.e == null) {
                return;
            }
            poisonBufferingView.e.start();
        }
    }
}

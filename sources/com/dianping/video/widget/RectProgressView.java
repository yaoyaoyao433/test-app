package com.dianping.video.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import com.dianping.util.j;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
import java.util.Vector;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class RectProgressView extends View {
    public static ChangeQuickRedirect a;
    private int b;
    private int c;
    private int d;
    private int e;
    private float f;
    private float g;
    private long h;
    private boolean i;
    private Paint j;
    private List<Runnable> k;

    public RectProgressView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b1409e89d236a6880493048f265dd61b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b1409e89d236a6880493048f265dd61b");
            return;
        }
        this.d = 0;
        this.g = -1.0f;
        this.i = false;
        this.k = new Vector();
        a();
    }

    public RectProgressView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "775f605c8d354b00e81b7ccfe30e9c85", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "775f605c8d354b00e81b7ccfe30e9c85");
            return;
        }
        this.d = 0;
        this.g = -1.0f;
        this.i = false;
        this.k = new Vector();
        a();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "87f0cd786500d549ed42effd9254a65b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "87f0cd786500d549ed42effd9254a65b");
            return;
        }
        super.onDraw(canvas);
        if (this.b <= 0 || this.c <= 0) {
            this.b = getWidth();
            this.c = getHeight();
            this.e = (this.b + this.c) * 2;
        }
        if (this.d < this.b) {
            canvas.drawLine(0.0f, 0.0f, this.d, 0.0f, this.j);
        } else if (this.d < this.b + this.c) {
            canvas.drawLine(0.0f, 0.0f, this.b, 0.0f, this.j);
            canvas.drawLine(this.b, 0.0f, this.b, this.d - this.b, this.j);
        } else if (this.d < (this.b * 2) + this.c) {
            canvas.drawLine(0.0f, 0.0f, this.b, 0.0f, this.j);
            canvas.drawLine(this.b, 0.0f, this.b, this.c, this.j);
            canvas.drawLine(this.b, this.c, ((this.b * 2) + this.c) - this.d, this.c, this.j);
        } else {
            canvas.drawLine(0.0f, 0.0f, this.b, 0.0f, this.j);
            canvas.drawLine(this.b, 0.0f, this.b, this.c, this.j);
            canvas.drawLine(this.b, this.c, 0.0f, this.c, this.j);
            canvas.drawLine(0.0f, this.c, 0.0f, this.e - this.d, this.j);
        }
    }

    public void setProgress(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f4842eae276c408a39f9bc83212e70ea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f4842eae276c408a39f9bc83212e70ea");
        } else if (f == this.g || this.i) {
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            if (this.g < 0.0f) {
                this.h = currentTimeMillis;
            }
            this.g = f;
            if (currentTimeMillis != this.h) {
                a aVar = new a(this, null);
                aVar.b = this.f;
                aVar.c = f;
                aVar.d = currentTimeMillis - this.h;
                if (this.k.size() == 0) {
                    aVar.run();
                }
                this.k.add(aVar);
            }
            this.f = f;
            this.h = currentTimeMillis;
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.dianping.video.widget.RectProgressView$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass1 implements ValueAnimator.AnimatorUpdateListener {
        public static ChangeQuickRedirect a;
        public final /* synthetic */ RectProgressView b;

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            Object[] objArr = {valueAnimator};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f8342f65c9266e5c7784308e2fa0b877", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f8342f65c9266e5c7784308e2fa0b877");
                return;
            }
            this.b.d = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            this.b.invalidate();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    class a implements Runnable {
        public static ChangeQuickRedirect a;
        public float b;
        public float c;
        public long d;
        public ValueAnimator e;

        private a() {
            Object[] objArr = {RectProgressView.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "38e47e341f1adaeb472c12bcd8956635", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "38e47e341f1adaeb472c12bcd8956635");
            }
        }

        public /* synthetic */ a(RectProgressView rectProgressView, AnonymousClass1 anonymousClass1) {
            this();
        }

        @Override // java.lang.Runnable
        public final void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "36075d1dbaf27028543aea1ac23d0591", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "36075d1dbaf27028543aea1ac23d0591");
                return;
            }
            this.e = ValueAnimator.ofFloat(this.b, this.c);
            this.d = this.d >= 0 ? this.d : 0L;
            this.e.setDuration(this.d);
            this.e.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.dianping.video.widget.RectProgressView.a.1
                public static ChangeQuickRedirect a;

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    Object[] objArr2 = {valueAnimator};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "60da680fc58a575446303d00c3564690", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "60da680fc58a575446303d00c3564690");
                    } else if (RectProgressView.this.i) {
                    } else {
                        RectProgressView.this.d = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * RectProgressView.this.e);
                        RectProgressView.this.invalidate();
                    }
                }
            });
            this.e.addListener(new Animator.AnimatorListener() { // from class: com.dianping.video.widget.RectProgressView.a.2
                public static ChangeQuickRedirect a;

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationCancel(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationRepeat(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    Object[] objArr2 = {animator};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bee39f0b22ade642450b313211ad8e4b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bee39f0b22ade642450b313211ad8e4b");
                        return;
                    }
                    try {
                        RectProgressView.this.k.remove(0);
                        if (RectProgressView.this.k.size() > 0) {
                            ((Runnable) RectProgressView.this.k.get(0)).run();
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
            this.e.start();
        }
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae21af5878e020fa43d679760cd79794", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae21af5878e020fa43d679760cd79794");
            return;
        }
        this.j = new Paint();
        this.j.setColor(Color.parseColor("#FF6527"));
        this.j.setStyle(Paint.Style.STROKE);
        this.j.setStrokeWidth(j.a(getContext(), 8.0f));
    }
}

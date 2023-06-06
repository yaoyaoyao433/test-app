package android.support.v7.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.support.annotation.VisibleForTesting;
import android.support.v4.view.ViewCompat;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/* compiled from: ProGuard */
@VisibleForTesting
/* loaded from: classes.dex */
public final class FastScroller extends RecyclerView.f implements RecyclerView.j {
    private static final int[] p = {16842919};
    private static final int[] q = new int[0];
    final int a;
    @VisibleForTesting
    int b;
    @VisibleForTesting
    int c;
    @VisibleForTesting
    float d;
    @VisibleForTesting
    int e;
    @VisibleForTesting
    int f;
    @VisibleForTesting
    float g;
    RecyclerView j;
    private final int r;
    private final StateListDrawable s;
    private final Drawable t;
    private final int u;
    private final int v;
    private final StateListDrawable w;
    private final Drawable x;
    private final int y;
    private final int z;
    int h = 0;
    int i = 0;
    boolean k = false;
    boolean l = false;
    int m = 0;
    private int A = 0;
    private final int[] B = new int[2];
    private final int[] C = new int[2];
    final ValueAnimator n = ValueAnimator.ofFloat(0.0f, 1.0f);
    int o = 0;
    private final Runnable D = new Runnable() { // from class: android.support.v7.widget.FastScroller.1
        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // java.lang.Runnable
        public final void run() {
            FastScroller fastScroller = FastScroller.this;
            switch (fastScroller.o) {
                case 1:
                    fastScroller.n.cancel();
                    break;
                case 2:
                    break;
                default:
                    return;
            }
            fastScroller.o = 3;
            fastScroller.n.setFloatValues(((Float) fastScroller.n.getAnimatedValue()).floatValue(), 0.0f);
            fastScroller.n.setDuration(500L);
            fastScroller.n.start();
        }
    };
    private final RecyclerView.k E = new RecyclerView.k() { // from class: android.support.v7.widget.FastScroller.2
        @Override // android.support.v7.widget.RecyclerView.k
        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            FastScroller fastScroller = FastScroller.this;
            int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
            int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
            int computeVerticalScrollRange = fastScroller.j.computeVerticalScrollRange();
            int i3 = fastScroller.i;
            fastScroller.k = computeVerticalScrollRange - i3 > 0 && fastScroller.i >= fastScroller.a;
            int computeHorizontalScrollRange = fastScroller.j.computeHorizontalScrollRange();
            int i4 = fastScroller.h;
            fastScroller.l = computeHorizontalScrollRange - i4 > 0 && fastScroller.h >= fastScroller.a;
            if (!fastScroller.k && !fastScroller.l) {
                if (fastScroller.m != 0) {
                    fastScroller.a(0);
                    return;
                }
                return;
            }
            if (fastScroller.k) {
                float f = i3;
                fastScroller.c = (int) ((f * (computeVerticalScrollOffset + (f / 2.0f))) / computeVerticalScrollRange);
                fastScroller.b = Math.min(i3, (i3 * i3) / computeVerticalScrollRange);
            }
            if (fastScroller.l) {
                float f2 = computeHorizontalScrollOffset;
                float f3 = i4;
                fastScroller.f = (int) ((f3 * (f2 + (f3 / 2.0f))) / computeHorizontalScrollRange);
                fastScroller.e = Math.min(i4, (i4 * i4) / computeHorizontalScrollRange);
            }
            if (fastScroller.m == 0 || fastScroller.m == 1) {
                fastScroller.a(1);
            }
        }
    };

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    @interface AnimationState {
    }

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    @interface DragState {
    }

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    @interface State {
    }

    @Override // android.support.v7.widget.RecyclerView.j
    public final void onRequestDisallowInterceptTouchEvent(boolean z) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public FastScroller(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        this.s = stateListDrawable;
        this.t = drawable;
        this.w = stateListDrawable2;
        this.x = drawable2;
        this.u = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.v = Math.max(i, drawable.getIntrinsicWidth());
        this.y = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.z = Math.max(i, drawable2.getIntrinsicWidth());
        this.a = i2;
        this.r = i3;
        this.s.setAlpha(255);
        this.t.setAlpha(255);
        this.n.addListener(new a());
        this.n.addUpdateListener(new b());
        if (this.j != recyclerView) {
            if (this.j != null) {
                this.j.removeItemDecoration(this);
                this.j.removeOnItemTouchListener(this);
                this.j.removeOnScrollListener(this.E);
                c();
            }
            this.j = recyclerView;
            if (this.j != null) {
                this.j.addItemDecoration(this);
                this.j.addOnItemTouchListener(this);
                this.j.addOnScrollListener(this.E);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int i) {
        if (i == 2 && this.m != 2) {
            this.s.setState(p);
            c();
        }
        if (i != 0) {
            b();
        } else {
            this.j.invalidate();
        }
        if (this.m == 2 && i != 2) {
            this.s.setState(q);
            b(1200);
        } else if (i == 1) {
            b(1500);
        }
        this.m = i;
    }

    private boolean a() {
        return ViewCompat.getLayoutDirection(this.j) == 1;
    }

    private void b() {
        int i = this.o;
        if (i != 0) {
            if (i != 3) {
                return;
            }
            this.n.cancel();
        }
        this.o = 1;
        this.n.setFloatValues(((Float) this.n.getAnimatedValue()).floatValue(), 1.0f);
        this.n.setDuration(500L);
        this.n.setStartDelay(0L);
        this.n.start();
    }

    private void c() {
        this.j.removeCallbacks(this.D);
    }

    private void b(int i) {
        c();
        this.j.postDelayed(this.D, i);
    }

    @Override // android.support.v7.widget.RecyclerView.f
    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        if (this.h != this.j.getWidth() || this.i != this.j.getHeight()) {
            this.h = this.j.getWidth();
            this.i = this.j.getHeight();
            a(0);
        } else if (this.o != 0) {
            if (this.k) {
                int i = this.h - this.u;
                int i2 = this.c - (this.b / 2);
                this.s.setBounds(0, 0, this.u, this.b);
                this.t.setBounds(0, 0, this.v, this.i);
                if (a()) {
                    this.t.draw(canvas);
                    canvas.translate(this.u, i2);
                    canvas.scale(-1.0f, 1.0f);
                    this.s.draw(canvas);
                    canvas.scale(1.0f, 1.0f);
                    canvas.translate(-this.u, -i2);
                } else {
                    canvas.translate(i, 0.0f);
                    this.t.draw(canvas);
                    canvas.translate(0.0f, i2);
                    this.s.draw(canvas);
                    canvas.translate(-i, -i2);
                }
            }
            if (this.l) {
                int i3 = this.i - this.y;
                int i4 = this.f - (this.e / 2);
                this.w.setBounds(0, 0, this.e, this.y);
                this.x.setBounds(0, 0, this.h, this.z);
                canvas.translate(0.0f, i3);
                this.x.draw(canvas);
                canvas.translate(i4, 0.0f);
                this.w.draw(canvas);
                canvas.translate(-i4, -i3);
            }
        }
    }

    @Override // android.support.v7.widget.RecyclerView.j
    public final boolean onInterceptTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.m == 1) {
            boolean a2 = a(motionEvent.getX(), motionEvent.getY());
            boolean b2 = b(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() != 0) {
                return false;
            }
            if (!a2 && !b2) {
                return false;
            }
            if (b2) {
                this.A = 1;
                this.g = (int) motionEvent.getX();
            } else if (a2) {
                this.A = 2;
                this.d = (int) motionEvent.getY();
            }
            a(2);
        } else if (this.m != 2) {
            return false;
        }
        return true;
    }

    @Override // android.support.v7.widget.RecyclerView.j
    public final void onTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.m == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean a2 = a(motionEvent.getX(), motionEvent.getY());
            boolean b2 = b(motionEvent.getX(), motionEvent.getY());
            if (a2 || b2) {
                if (b2) {
                    this.A = 1;
                    this.g = (int) motionEvent.getX();
                } else if (a2) {
                    this.A = 2;
                    this.d = (int) motionEvent.getY();
                }
                a(2);
            }
        } else if (motionEvent.getAction() == 1 && this.m == 2) {
            this.d = 0.0f;
            this.g = 0.0f;
            a(1);
            this.A = 0;
        } else if (motionEvent.getAction() == 2 && this.m == 2) {
            b();
            if (this.A == 1) {
                float x = motionEvent.getX();
                this.C[0] = this.r;
                this.C[1] = this.h - this.r;
                int[] iArr = this.C;
                float max = Math.max(iArr[0], Math.min(iArr[1], x));
                if (Math.abs(this.f - max) >= 2.0f) {
                    int a3 = a(this.g, max, iArr, this.j.computeHorizontalScrollRange(), this.j.computeHorizontalScrollOffset(), this.h);
                    if (a3 != 0) {
                        this.j.scrollBy(a3, 0);
                    }
                    this.g = max;
                }
            }
            if (this.A == 2) {
                float y = motionEvent.getY();
                this.B[0] = this.r;
                this.B[1] = this.i - this.r;
                int[] iArr2 = this.B;
                float max2 = Math.max(iArr2[0], Math.min(iArr2[1], y));
                if (Math.abs(this.c - max2) >= 2.0f) {
                    int a4 = a(this.d, max2, iArr2, this.j.computeVerticalScrollRange(), this.j.computeVerticalScrollOffset(), this.i);
                    if (a4 != 0) {
                        this.j.scrollBy(0, a4);
                    }
                    this.d = max2;
                }
            }
        }
    }

    private static int a(float f, float f2, int[] iArr, int i, int i2, int i3) {
        int i4 = iArr[1] - iArr[0];
        if (i4 == 0) {
            return 0;
        }
        int i5 = i - i3;
        int i6 = (int) (((f2 - f) / i4) * i5);
        int i7 = i2 + i6;
        if (i7 >= i5 || i7 < 0) {
            return 0;
        }
        return i6;
    }

    @VisibleForTesting
    private boolean a(float f, float f2) {
        if (a()) {
            if (f > this.u / 2) {
                return false;
            }
        } else if (f < this.h - this.u) {
            return false;
        }
        return f2 >= ((float) (this.c - (this.b / 2))) && f2 <= ((float) (this.c + (this.b / 2)));
    }

    @VisibleForTesting
    private boolean b(float f, float f2) {
        return f2 >= ((float) (this.i - this.y)) && f >= ((float) (this.f - (this.e / 2))) && f <= ((float) (this.f + (this.e / 2)));
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    class a extends AnimatorListenerAdapter {
        private boolean b;

        private a() {
            this.b = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            if (!this.b) {
                if (((Float) FastScroller.this.n.getAnimatedValue()).floatValue() == 0.0f) {
                    FastScroller.this.o = 0;
                    FastScroller.this.a(0);
                    return;
                }
                FastScroller.this.o = 2;
                FastScroller.b(FastScroller.this);
                return;
            }
            this.b = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            this.b = true;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    class b implements ValueAnimator.AnimatorUpdateListener {
        private b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            FastScroller.this.s.setAlpha(floatValue);
            FastScroller.this.t.setAlpha(floatValue);
            FastScroller.b(FastScroller.this);
        }
    }

    static /* synthetic */ void b(FastScroller fastScroller) {
        fastScroller.j.invalidate();
    }
}

package android.support.design.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.annotation.IntRange;
import android.support.annotation.RestrictTo;
import android.support.constraint.R;
import android.support.design.widget.BaseTransientBottomBar;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.SwipeDismissBehavior;
import android.support.design.widget.k;
import android.support.v4.view.OnApplyWindowInsetsListener;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.WindowInsetsCompat;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import com.tencent.rtmp.TXLiveConstants;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public abstract class BaseTransientBottomBar<B extends BaseTransientBottomBar<B>> {
    static final Handler a;
    private static final boolean e;
    final ViewGroup b;
    final d c;
    final k.a d;
    private final a f;
    private List<BaseCallback<B>> g;
    private final AccessibilityManager h;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static abstract class BaseCallback<B> {

        /* compiled from: ProGuard */
        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* loaded from: classes.dex */
        public @interface DismissEvent {
        }
    }

    /* compiled from: ProGuard */
    @IntRange(from = 1)
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes.dex */
    public @interface Duration {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface a {
        void a(int i, int i2);

        void b(int i, int i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes.dex */
    public interface b {
        void a(View view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes.dex */
    public interface c {
        void a(View view, int i, int i2, int i3, int i4);
    }

    static {
        e = Build.VERSION.SDK_INT >= 16 && Build.VERSION.SDK_INT <= 19;
        a = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: android.support.design.widget.BaseTransientBottomBar.1
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                switch (message.what) {
                    case 0:
                        final BaseTransientBottomBar baseTransientBottomBar = (BaseTransientBottomBar) message.obj;
                        if (baseTransientBottomBar.c.getParent() == null) {
                            ViewGroup.LayoutParams layoutParams = baseTransientBottomBar.c.getLayoutParams();
                            if (layoutParams instanceof CoordinatorLayout.c) {
                                CoordinatorLayout.c cVar = (CoordinatorLayout.c) layoutParams;
                                Behavior behavior = new Behavior();
                                behavior.f = SwipeDismissBehavior.a(0.0f, 0.1f, 1.0f);
                                behavior.g = SwipeDismissBehavior.a(0.0f, 0.6f, 1.0f);
                                behavior.d = 0;
                                behavior.c = new SwipeDismissBehavior.a() { // from class: android.support.design.widget.BaseTransientBottomBar.6
                                    @Override // android.support.design.widget.SwipeDismissBehavior.a
                                    public final void a(View view) {
                                        view.setVisibility(8);
                                        BaseTransientBottomBar.this.a(0);
                                    }

                                    @Override // android.support.design.widget.SwipeDismissBehavior.a
                                    public final void a(int i) {
                                        switch (i) {
                                            case 0:
                                                k.a().c(BaseTransientBottomBar.this.d);
                                                return;
                                            case 1:
                                            case 2:
                                                k.a().b(BaseTransientBottomBar.this.d);
                                                return;
                                            default:
                                                return;
                                        }
                                    }
                                };
                                cVar.a(behavior);
                                cVar.g = 80;
                            }
                            baseTransientBottomBar.b.addView(baseTransientBottomBar.c);
                        }
                        baseTransientBottomBar.c.setOnAttachStateChangeListener(new b() { // from class: android.support.design.widget.BaseTransientBottomBar.7
                            @Override // android.support.design.widget.BaseTransientBottomBar.b
                            public final void a(View view) {
                                if (k.a().d(BaseTransientBottomBar.this.d)) {
                                    BaseTransientBottomBar.a.post(new Runnable() { // from class: android.support.design.widget.BaseTransientBottomBar.7.1
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            BaseTransientBottomBar.this.b(3);
                                        }
                                    });
                                }
                            }
                        });
                        if (ViewCompat.isLaidOut(baseTransientBottomBar.c)) {
                            if (baseTransientBottomBar.c()) {
                                baseTransientBottomBar.a();
                            } else {
                                baseTransientBottomBar.b();
                            }
                        } else {
                            baseTransientBottomBar.c.setOnLayoutChangeListener(new c() { // from class: android.support.design.widget.BaseTransientBottomBar.8
                                @Override // android.support.design.widget.BaseTransientBottomBar.c
                                public final void a(View view, int i, int i2, int i3, int i4) {
                                    BaseTransientBottomBar.this.c.setOnLayoutChangeListener(null);
                                    if (BaseTransientBottomBar.this.c()) {
                                        BaseTransientBottomBar.this.a();
                                    } else {
                                        BaseTransientBottomBar.this.b();
                                    }
                                }
                            });
                        }
                        return true;
                    case 1:
                        final BaseTransientBottomBar baseTransientBottomBar2 = (BaseTransientBottomBar) message.obj;
                        final int i = message.arg1;
                        if (!baseTransientBottomBar2.c() || baseTransientBottomBar2.c.getVisibility() != 0) {
                            baseTransientBottomBar2.b(i);
                        } else if (Build.VERSION.SDK_INT >= 12) {
                            ValueAnimator valueAnimator = new ValueAnimator();
                            valueAnimator.setIntValues(0, baseTransientBottomBar2.c.getHeight());
                            valueAnimator.setInterpolator(android.support.design.widget.a.b);
                            valueAnimator.setDuration(250L);
                            valueAnimator.addListener(new AnimatorListenerAdapter() { // from class: android.support.design.widget.BaseTransientBottomBar.3
                                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                                public final void onAnimationStart(Animator animator) {
                                    BaseTransientBottomBar.this.f.b(0, TXLiveConstants.RENDER_ROTATION_180);
                                }

                                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                                public final void onAnimationEnd(Animator animator) {
                                    BaseTransientBottomBar.this.b(i);
                                }
                            });
                            valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: android.support.design.widget.BaseTransientBottomBar.4
                                private int b = 0;

                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                    int intValue = ((Integer) valueAnimator2.getAnimatedValue()).intValue();
                                    if (BaseTransientBottomBar.e) {
                                        ViewCompat.offsetTopAndBottom(BaseTransientBottomBar.this.c, intValue - this.b);
                                    } else {
                                        BaseTransientBottomBar.this.c.setTranslationY(intValue);
                                    }
                                    this.b = intValue;
                                }
                            });
                            valueAnimator.start();
                        } else {
                            Animation loadAnimation = AnimationUtils.loadAnimation(baseTransientBottomBar2.c.getContext(), R.anim.design_snackbar_out);
                            loadAnimation.setInterpolator(android.support.design.widget.a.b);
                            loadAnimation.setDuration(250L);
                            loadAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: android.support.design.widget.BaseTransientBottomBar.5
                                @Override // android.view.animation.Animation.AnimationListener
                                public final void onAnimationRepeat(Animation animation) {
                                }

                                @Override // android.view.animation.Animation.AnimationListener
                                public final void onAnimationStart(Animation animation) {
                                }

                                @Override // android.view.animation.Animation.AnimationListener
                                public final void onAnimationEnd(Animation animation) {
                                    BaseTransientBottomBar.this.b(i);
                                }
                            });
                            baseTransientBottomBar2.c.startAnimation(loadAnimation);
                        }
                        return true;
                    default:
                        return false;
                }
            }
        });
    }

    /* compiled from: ProGuard */
    /* renamed from: android.support.design.widget.BaseTransientBottomBar$2  reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass2 implements OnApplyWindowInsetsListener {
        @Override // android.support.v4.view.OnApplyWindowInsetsListener
        public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
            view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), windowInsetsCompat.getSystemWindowInsetBottom());
            return windowInsetsCompat;
        }
    }

    final void a(int i) {
        k a2 = k.a();
        k.a aVar = this.d;
        synchronized (a2.a) {
            if (a2.e(aVar)) {
                a2.a(a2.b, 0);
            } else if (a2.f(aVar)) {
                a2.a(a2.c, 0);
            }
        }
    }

    final void a() {
        if (Build.VERSION.SDK_INT >= 12) {
            final int height = this.c.getHeight();
            if (e) {
                ViewCompat.offsetTopAndBottom(this.c, height);
            } else {
                this.c.setTranslationY(height);
            }
            ValueAnimator valueAnimator = new ValueAnimator();
            valueAnimator.setIntValues(height, 0);
            valueAnimator.setInterpolator(android.support.design.widget.a.b);
            valueAnimator.setDuration(250L);
            valueAnimator.addListener(new AnimatorListenerAdapter() { // from class: android.support.design.widget.BaseTransientBottomBar.9
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
                    BaseTransientBottomBar.this.f.a(70, TXLiveConstants.RENDER_ROTATION_180);
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    BaseTransientBottomBar.this.b();
                }
            });
            valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: android.support.design.widget.BaseTransientBottomBar.10
                private int c;

                {
                    this.c = height;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    int intValue = ((Integer) valueAnimator2.getAnimatedValue()).intValue();
                    if (BaseTransientBottomBar.e) {
                        ViewCompat.offsetTopAndBottom(BaseTransientBottomBar.this.c, intValue - this.c);
                    } else {
                        BaseTransientBottomBar.this.c.setTranslationY(intValue);
                    }
                    this.c = intValue;
                }
            });
            valueAnimator.start();
            return;
        }
        Animation loadAnimation = AnimationUtils.loadAnimation(this.c.getContext(), R.anim.design_snackbar_in);
        loadAnimation.setInterpolator(android.support.design.widget.a.b);
        loadAnimation.setDuration(250L);
        loadAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: android.support.design.widget.BaseTransientBottomBar.11
            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationStart(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationEnd(Animation animation) {
                BaseTransientBottomBar.this.b();
            }
        });
        this.c.startAnimation(loadAnimation);
    }

    final void b() {
        k.a().a(this.d);
        if (this.g != null) {
            for (int size = this.g.size() - 1; size >= 0; size--) {
                this.g.get(size);
            }
        }
    }

    final void b(int i) {
        k a2 = k.a();
        k.a aVar = this.d;
        synchronized (a2.a) {
            if (a2.e(aVar)) {
                a2.b = null;
                if (a2.c != null && a2.c != null) {
                    a2.b = a2.c;
                    a2.c = null;
                    if (a2.b.a.get() == null) {
                        a2.b = null;
                    }
                }
            }
        }
        if (this.g != null) {
            for (int size = this.g.size() - 1; size >= 0; size--) {
                this.g.get(size);
            }
        }
        if (Build.VERSION.SDK_INT < 11) {
            this.c.setVisibility(8);
        }
        ViewParent parent = this.c.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.c);
        }
    }

    final boolean c() {
        return !this.h.isEnabled();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes.dex */
    public static class d extends FrameLayout {
        private c a;
        private b b;

        /* JADX INFO: Access modifiers changed from: package-private */
        public d(Context context) {
            this(context, null);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public d(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16843039, R.attr.elevation, R.attr.maxActionInlineWidth});
            if (obtainStyledAttributes.hasValue(1)) {
                ViewCompat.setElevation(this, obtainStyledAttributes.getDimensionPixelSize(1, 0));
            }
            obtainStyledAttributes.recycle();
            setClickable(true);
        }

        @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            if (this.a != null) {
                this.a.a(this, i, i2, i3, i4);
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            ViewCompat.requestApplyInsets(this);
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            if (this.b != null) {
                this.b.a(this);
            }
        }

        void setOnLayoutChangeListener(c cVar) {
            this.a = cVar;
        }

        void setOnAttachStateChangeListener(b bVar) {
            this.b = bVar;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public final class Behavior extends SwipeDismissBehavior<d> {
        Behavior() {
        }

        @Override // android.support.design.widget.SwipeDismissBehavior
        public final boolean a(View view) {
            return view instanceof d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // android.support.design.widget.SwipeDismissBehavior, android.support.design.widget.CoordinatorLayout.a
        /* renamed from: a */
        public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, d dVar, MotionEvent motionEvent) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 3) {
                switch (actionMasked) {
                    case 0:
                        if (coordinatorLayout.a(dVar, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                            k.a().b(BaseTransientBottomBar.this.d);
                            break;
                        }
                        break;
                }
                return super.onInterceptTouchEvent(coordinatorLayout, dVar, motionEvent);
            }
            k.a().c(BaseTransientBottomBar.this.d);
            return super.onInterceptTouchEvent(coordinatorLayout, dVar, motionEvent);
        }
    }
}

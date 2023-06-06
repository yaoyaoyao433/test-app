package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewCompat;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class f extends Transition {
    private static final String[] i = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    private static final Property<Drawable, PointF> j = new Property<Drawable, PointF>(PointF.class, "boundsOrigin") { // from class: android.support.transition.f.1
        private Rect a = new Rect();

        @Override // android.util.Property
        public final /* synthetic */ PointF get(Drawable drawable) {
            drawable.copyBounds(this.a);
            return new PointF(this.a.left, this.a.top);
        }

        @Override // android.util.Property
        public final /* synthetic */ void set(Drawable drawable, PointF pointF) {
            Drawable drawable2 = drawable;
            PointF pointF2 = pointF;
            drawable2.copyBounds(this.a);
            this.a.offsetTo(Math.round(pointF2.x), Math.round(pointF2.y));
            drawable2.setBounds(this.a);
        }
    };
    private static final Property<a, PointF> k = new Property<a, PointF>(PointF.class, "topLeft") { // from class: android.support.transition.f.3
        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(a aVar) {
            return null;
        }

        @Override // android.util.Property
        public final /* synthetic */ void set(a aVar, PointF pointF) {
            a aVar2 = aVar;
            PointF pointF2 = pointF;
            aVar2.a = Math.round(pointF2.x);
            aVar2.b = Math.round(pointF2.y);
            aVar2.e++;
            if (aVar2.e == aVar2.f) {
                aVar2.a();
            }
        }
    };
    private static final Property<a, PointF> l = new Property<a, PointF>(PointF.class, "bottomRight") { // from class: android.support.transition.f.4
        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(a aVar) {
            return null;
        }

        @Override // android.util.Property
        public final /* synthetic */ void set(a aVar, PointF pointF) {
            a aVar2 = aVar;
            PointF pointF2 = pointF;
            aVar2.c = Math.round(pointF2.x);
            aVar2.d = Math.round(pointF2.y);
            aVar2.f++;
            if (aVar2.e == aVar2.f) {
                aVar2.a();
            }
        }
    };
    private static final Property<View, PointF> m = new Property<View, PointF>(PointF.class, "bottomRight") { // from class: android.support.transition.f.5
        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        public final /* synthetic */ void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            ak.a(view2, view2.getLeft(), view2.getTop(), Math.round(pointF2.x), Math.round(pointF2.y));
        }
    };
    private static final Property<View, PointF> n = new Property<View, PointF>(PointF.class, "topLeft") { // from class: android.support.transition.f.6
        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        public final /* synthetic */ void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            ak.a(view2, Math.round(pointF2.x), Math.round(pointF2.y), view2.getRight(), view2.getBottom());
        }
    };
    private static final Property<View, PointF> o = new Property<View, PointF>(PointF.class, "position") { // from class: android.support.transition.f.7
        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        public final /* synthetic */ void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            int round = Math.round(pointF2.x);
            int round2 = Math.round(pointF2.y);
            ak.a(view2, round, round2, view2.getWidth() + round, view2.getHeight() + round2);
        }
    };
    private static r s = new r();
    private int[] p = new int[2];
    private boolean q = false;
    private boolean r = false;

    @Override // android.support.transition.Transition
    @Nullable
    public final String[] a() {
        return i;
    }

    private void d(x xVar) {
        View view = xVar.b;
        if (!ViewCompat.isLaidOut(view) && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        xVar.a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        xVar.a.put("android:changeBounds:parent", xVar.b.getParent());
        if (this.r) {
            xVar.b.getLocationInWindow(this.p);
            xVar.a.put("android:changeBounds:windowX", Integer.valueOf(this.p[0]));
            xVar.a.put("android:changeBounds:windowY", Integer.valueOf(this.p[1]));
        }
        if (this.q) {
            xVar.a.put("android:changeBounds:clip", ViewCompat.getClipBounds(view));
        }
    }

    @Override // android.support.transition.Transition
    public final void a(@NonNull x xVar) {
        d(xVar);
    }

    @Override // android.support.transition.Transition
    public final void b(@NonNull x xVar) {
        d(xVar);
    }

    @Override // android.support.transition.Transition
    @Nullable
    public final Animator a(@NonNull final ViewGroup viewGroup, @Nullable x xVar, @Nullable x xVar2) {
        int i2;
        final View view;
        int i3;
        Rect rect;
        int i4;
        Animator animator;
        boolean z;
        Animator animator2;
        AnimatorSet animatorSet;
        x b;
        if (xVar == null || xVar2 == null) {
            return null;
        }
        Map<String, Object> map = xVar.a;
        Map<String, Object> map2 = xVar2.a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        final View view2 = xVar2.b;
        if (!this.r || ((b = b(viewGroup2, true)) != null ? viewGroup3 == b.b : viewGroup2 == viewGroup3)) {
            Rect rect2 = (Rect) xVar.a.get("android:changeBounds:bounds");
            Rect rect3 = (Rect) xVar2.a.get("android:changeBounds:bounds");
            int i5 = rect2.left;
            final int i6 = rect3.left;
            int i7 = rect2.top;
            final int i8 = rect3.top;
            int i9 = rect2.right;
            final int i10 = rect3.right;
            int i11 = rect2.bottom;
            final int i12 = rect3.bottom;
            int i13 = i9 - i5;
            int i14 = i11 - i7;
            int i15 = i10 - i6;
            int i16 = i12 - i8;
            Rect rect4 = (Rect) xVar.a.get("android:changeBounds:clip");
            final Rect rect5 = (Rect) xVar2.a.get("android:changeBounds:clip");
            if ((i13 == 0 || i14 == 0) && (i15 == 0 || i16 == 0)) {
                i2 = 0;
            } else {
                i2 = (i5 == i6 && i7 == i8) ? 0 : 1;
                if (i9 != i10 || i11 != i12) {
                    i2++;
                }
            }
            if ((rect4 != null && !rect4.equals(rect5)) || (rect4 == null && rect5 != null)) {
                i2++;
            }
            if (i2 > 0) {
                if (!this.q) {
                    view = view2;
                    ak.a(view, i5, i7, i9, i11);
                    if (i2 == 2) {
                        if (i13 == i15 && i14 == i16) {
                            animator = h.a(view, o, this.h.a(i5, i7, i6, i8));
                        } else {
                            final a aVar = new a(view);
                            Animator a2 = h.a(aVar, k, this.h.a(i5, i7, i6, i8));
                            Animator a3 = h.a(aVar, l, this.h.a(i9, i11, i10, i12));
                            AnimatorSet animatorSet2 = new AnimatorSet();
                            animatorSet2.playTogether(a2, a3);
                            animatorSet2.addListener(new AnimatorListenerAdapter() { // from class: android.support.transition.f.8
                                private a c;

                                {
                                    this.c = aVar;
                                }
                            });
                            animatorSet = animatorSet2;
                            z = true;
                            animator2 = animatorSet;
                        }
                    } else if (i5 != i6 || i7 != i8) {
                        animator = h.a(view, n, this.h.a(i5, i7, i6, i8));
                    } else {
                        animator = h.a(view, m, this.h.a(i9, i11, i10, i12));
                    }
                    animatorSet = animator;
                    z = true;
                    animator2 = animatorSet;
                } else {
                    view = view2;
                    ak.a(view, i5, i7, Math.max(i13, i15) + i5, Math.max(i14, i16) + i7);
                    Animator a4 = (i5 == i6 && i7 == i8) ? null : h.a(view, o, this.h.a(i5, i7, i6, i8));
                    if (rect4 == null) {
                        i3 = 0;
                        rect = new Rect(0, 0, i13, i14);
                    } else {
                        i3 = 0;
                        rect = rect4;
                    }
                    Rect rect6 = rect5 == null ? new Rect(i3, i3, i15, i16) : rect5;
                    if (rect.equals(rect6)) {
                        i4 = 2;
                        animator = null;
                    } else {
                        ViewCompat.setClipBounds(view, rect);
                        r rVar = s;
                        Object[] objArr = new Object[2];
                        objArr[i3] = rect;
                        objArr[1] = rect6;
                        ObjectAnimator ofObject = ObjectAnimator.ofObject(view, "clipBounds", rVar, objArr);
                        i4 = 2;
                        ofObject.addListener(new AnimatorListenerAdapter() { // from class: android.support.transition.f.9
                            private boolean h;

                            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                            public final void onAnimationCancel(Animator animator3) {
                                this.h = true;
                            }

                            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                            public final void onAnimationEnd(Animator animator3) {
                                if (this.h) {
                                    return;
                                }
                                ViewCompat.setClipBounds(view, rect5);
                                ak.a(view, i6, i8, i10, i12);
                            }
                        });
                        animator = ofObject;
                    }
                    if (a4 != null) {
                        if (animator == null) {
                            animatorSet = a4;
                            z = true;
                            animator2 = animatorSet;
                        } else {
                            AnimatorSet animatorSet3 = new AnimatorSet();
                            Animator[] animatorArr = new Animator[i4];
                            animatorArr[0] = a4;
                            z = true;
                            animatorArr[1] = animator;
                            animatorSet3.playTogether(animatorArr);
                            animator2 = animatorSet3;
                        }
                    }
                    animatorSet = animator;
                    z = true;
                    animator2 = animatorSet;
                }
                if (view.getParent() instanceof ViewGroup) {
                    final ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                    ad.a(viewGroup4, z);
                    a(new t() { // from class: android.support.transition.f.10
                        boolean a = false;

                        @Override // android.support.transition.t, android.support.transition.Transition.b
                        public final void a(@NonNull Transition transition) {
                            ad.a(viewGroup4, false);
                            this.a = true;
                        }

                        @Override // android.support.transition.t, android.support.transition.Transition.b
                        public final void b(@NonNull Transition transition) {
                            if (!this.a) {
                                ad.a(viewGroup4, false);
                            }
                            transition.b(this);
                        }

                        @Override // android.support.transition.t, android.support.transition.Transition.b
                        public final void c(@NonNull Transition transition) {
                            ad.a(viewGroup4, false);
                        }

                        @Override // android.support.transition.t, android.support.transition.Transition.b
                        public final void d(@NonNull Transition transition) {
                            ad.a(viewGroup4, true);
                        }
                    });
                }
                return animator2;
            }
            return null;
        }
        int intValue = ((Integer) xVar.a.get("android:changeBounds:windowX")).intValue();
        int intValue2 = ((Integer) xVar.a.get("android:changeBounds:windowY")).intValue();
        int intValue3 = ((Integer) xVar2.a.get("android:changeBounds:windowX")).intValue();
        int intValue4 = ((Integer) xVar2.a.get("android:changeBounds:windowY")).intValue();
        if (intValue == intValue3 && intValue2 == intValue4) {
            return null;
        }
        viewGroup.getLocationInWindow(this.p);
        Bitmap createBitmap = Bitmap.createBitmap(view2.getWidth(), view2.getHeight(), Bitmap.Config.ARGB_8888);
        view2.draw(new Canvas(createBitmap));
        final BitmapDrawable bitmapDrawable = new BitmapDrawable(createBitmap);
        final float c = ak.c(view2);
        ak.a(view2, 0.0f);
        ak.a(viewGroup).a(bitmapDrawable);
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(bitmapDrawable, n.a(j, this.h.a(intValue - this.p[0], intValue2 - this.p[1], intValue3 - this.p[0], intValue4 - this.p[1])));
        ofPropertyValuesHolder.addListener(new AnimatorListenerAdapter() { // from class: android.support.transition.f.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator3) {
                ak.a(viewGroup).b(bitmapDrawable);
                ak.a(view2, c);
            }
        });
        return ofPropertyValuesHolder;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    static class a {
        int a;
        int b;
        int c;
        int d;
        int e;
        int f;
        private View g;

        a(View view) {
            this.g = view;
        }

        void a() {
            ak.a(this.g, this.a, this.b, this.c, this.d);
            this.e = 0;
            this.f = 0;
        }
    }
}

package android.support.v7.widget.helper;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.view.GestureDetectorCompat;
import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.ViewCompat;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.c;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.Interpolator;
import com.dianping.shield.entity.ExposeAction;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a extends RecyclerView.f implements RecyclerView.h {
    private List<Integer> A;
    float c;
    float d;
    float e;
    float f;
    float g;
    float h;
    float i;
    float j;
    AbstractC0012a l;
    int n;
    RecyclerView p;
    VelocityTracker r;
    GestureDetectorCompat u;
    Rect v;
    long w;
    private int y;
    private List<RecyclerView.s> z;
    final List<View> a = new ArrayList();
    private final float[] x = new float[2];
    RecyclerView.s b = null;
    int k = -1;
    int m = 0;
    List<c> o = new ArrayList();
    final Runnable q = new Runnable() { // from class: android.support.v7.widget.helper.a.1
        /* JADX WARN: Code restructure failed: missing block: B:34:0x00cc, code lost:
            if (r2 > 0) goto L23;
         */
        /* JADX WARN: Removed duplicated region for block: B:27:0x008d  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00d2  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00ec  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x0108  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x010b A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:47:0x0113  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x0120  */
        /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void run() {
            /*
                Method dump skipped, instructions count: 322
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.helper.a.AnonymousClass1.run():void");
        }
    };
    private RecyclerView.d B = null;
    View s = null;
    int t = -1;
    private final RecyclerView.j C = new RecyclerView.j() { // from class: android.support.v7.widget.helper.a.2
        @Override // android.support.v7.widget.RecyclerView.j
        public final boolean onInterceptTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
            int findPointerIndex;
            a.this.u.onTouchEvent(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            c cVar = null;
            if (actionMasked == 0) {
                a.this.k = motionEvent.getPointerId(0);
                a.this.c = motionEvent.getX();
                a.this.d = motionEvent.getY();
                a aVar = a.this;
                if (aVar.r != null) {
                    aVar.r.recycle();
                }
                aVar.r = VelocityTracker.obtain();
                if (a.this.b == null) {
                    a aVar2 = a.this;
                    if (!aVar2.o.isEmpty()) {
                        View a = aVar2.a(motionEvent);
                        int size = aVar2.o.size() - 1;
                        while (true) {
                            if (size < 0) {
                                break;
                            }
                            c cVar2 = aVar2.o.get(size);
                            if (cVar2.h.itemView == a) {
                                cVar = cVar2;
                                break;
                            }
                            size--;
                        }
                    }
                    if (cVar != null) {
                        a.this.c -= cVar.m;
                        a.this.d -= cVar.n;
                        a.this.a(cVar.h, true);
                        if (a.this.a.remove(cVar.h.itemView)) {
                            a.this.l.c(a.this.p, cVar.h);
                        }
                        a.this.a(cVar.h, cVar.i);
                        a.this.a(motionEvent, a.this.n, 0);
                    }
                }
            } else if (actionMasked == 3 || actionMasked == 1) {
                a.this.k = -1;
                a.this.a((RecyclerView.s) null, 0);
            } else if (a.this.k != -1 && (findPointerIndex = motionEvent.findPointerIndex(a.this.k)) >= 0) {
                a.this.a(actionMasked, motionEvent, findPointerIndex);
            }
            if (a.this.r != null) {
                a.this.r.addMovement(motionEvent);
            }
            return a.this.b != null;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // android.support.v7.widget.RecyclerView.j
        public final void onTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
            a.this.u.onTouchEvent(motionEvent);
            if (a.this.r != null) {
                a.this.r.addMovement(motionEvent);
            }
            if (a.this.k == -1) {
                return;
            }
            int actionMasked = motionEvent.getActionMasked();
            int findPointerIndex = motionEvent.findPointerIndex(a.this.k);
            if (findPointerIndex >= 0) {
                a.this.a(actionMasked, motionEvent, findPointerIndex);
            }
            RecyclerView.s sVar = a.this.b;
            if (sVar == null) {
                return;
            }
            if (actionMasked != 6) {
                switch (actionMasked) {
                    case 1:
                        break;
                    case 2:
                        if (findPointerIndex >= 0) {
                            a.this.a(motionEvent, a.this.n, findPointerIndex);
                            a.this.a(sVar);
                            a.this.p.removeCallbacks(a.this.q);
                            a.this.q.run();
                            a.this.p.invalidate();
                            return;
                        }
                        return;
                    case 3:
                        if (a.this.r != null) {
                            a.this.r.clear();
                            break;
                        }
                        break;
                    default:
                        return;
                }
                a.this.a((RecyclerView.s) null, 0);
                a.this.k = -1;
                return;
            }
            int actionIndex = motionEvent.getActionIndex();
            if (motionEvent.getPointerId(actionIndex) == a.this.k) {
                a.this.k = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                a.this.a(motionEvent, a.this.n, actionIndex);
            }
        }

        @Override // android.support.v7.widget.RecyclerView.j
        public final void onRequestDisallowInterceptTouchEvent(boolean z) {
            if (z) {
                a.this.a((RecyclerView.s) null, 0);
            }
        }
    };

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface d {
        void prepareForDrop(View view, View view2, int i, int i2);
    }

    @Override // android.support.v7.widget.RecyclerView.h
    public final void onChildViewAttachedToWindow(View view) {
    }

    public a(AbstractC0012a abstractC0012a) {
        this.l = abstractC0012a;
    }

    private static boolean a(View view, float f, float f2, float f3, float f4) {
        return f >= f3 && f <= f3 + ((float) view.getWidth()) && f2 >= f4 && f2 <= f4 + ((float) view.getHeight());
    }

    public final void a(@Nullable RecyclerView recyclerView) {
        if (this.p == recyclerView) {
            return;
        }
        if (this.p != null) {
            this.p.removeItemDecoration(this);
            this.p.removeOnItemTouchListener(this.C);
            this.p.removeOnChildAttachStateChangeListener(this);
            for (int size = this.o.size() - 1; size >= 0; size--) {
                this.l.c(this.p, this.o.get(0).h);
            }
            this.o.clear();
            this.s = null;
            this.t = -1;
            a();
        }
        this.p = recyclerView;
        if (this.p != null) {
            Resources resources = recyclerView.getResources();
            this.e = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_velocity);
            this.f = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_max_velocity);
            this.y = ViewConfiguration.get(this.p.getContext()).getScaledTouchSlop();
            this.p.addItemDecoration(this);
            this.p.addOnItemTouchListener(this.C);
            this.p.addOnChildAttachStateChangeListener(this);
            if (this.u == null) {
                this.u = new GestureDetectorCompat(this.p.getContext(), new b());
            }
        }
    }

    private void a(float[] fArr) {
        if ((this.n & 12) != 0) {
            fArr[0] = (this.i + this.g) - this.b.itemView.getLeft();
        } else {
            fArr[0] = this.b.itemView.getTranslationX();
        }
        if ((this.n & 3) != 0) {
            fArr[1] = (this.j + this.h) - this.b.itemView.getTop();
        } else {
            fArr[1] = this.b.itemView.getTranslationY();
        }
    }

    @Override // android.support.v7.widget.RecyclerView.f
    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        boolean z = false;
        if (this.b != null) {
            a(this.x);
            float f = this.x[0];
            float f2 = this.x[1];
        }
        AbstractC0012a abstractC0012a = this.l;
        RecyclerView.s sVar = this.b;
        List<c> list = this.o;
        int i = this.m;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            list.get(i2);
            canvas.restoreToCount(canvas.save());
        }
        if (sVar != null) {
            canvas.restoreToCount(canvas.save());
        }
        for (int i3 = size - 1; i3 >= 0; i3--) {
            c cVar = list.get(i3);
            if (cVar.p && !cVar.l) {
                list.remove(i3);
            } else if (!cVar.p) {
                z = true;
            }
        }
        if (z) {
            recyclerView.invalidate();
        }
    }

    @Override // android.support.v7.widget.RecyclerView.f
    public final void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        float f;
        float f2;
        this.t = -1;
        if (this.b != null) {
            a(this.x);
            f = this.x[0];
            f2 = this.x[1];
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        AbstractC0012a abstractC0012a = this.l;
        RecyclerView.s sVar = this.b;
        List<c> list = this.o;
        int i = this.m;
        int i2 = 0;
        for (int size = list.size(); i2 < size; size = size) {
            c cVar = list.get(i2);
            if (cVar.d == cVar.f) {
                cVar.m = cVar.h.itemView.getTranslationX();
            } else {
                cVar.m = cVar.d + (cVar.q * (cVar.f - cVar.d));
            }
            if (cVar.e == cVar.g) {
                cVar.n = cVar.h.itemView.getTranslationY();
            } else {
                cVar.n = cVar.e + (cVar.q * (cVar.g - cVar.e));
            }
            int save = canvas.save();
            abstractC0012a.a(canvas, recyclerView, cVar.h, cVar.m, cVar.n, cVar.i, false);
            canvas.restoreToCount(save);
            i2++;
        }
        if (sVar != null) {
            int save2 = canvas.save();
            abstractC0012a.a(canvas, recyclerView, sVar, f, f2, i, true);
            canvas.restoreToCount(save2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x009c, code lost:
        if (r0 > 0) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0102  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void a(android.support.v7.widget.RecyclerView.s r24, int r25) {
        /*
            Method dump skipped, instructions count: 466
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.helper.a.a(android.support.v7.widget.RecyclerView$s, int):void");
    }

    final void a(RecyclerView.s sVar) {
        int i;
        int i2;
        if (!this.p.isLayoutRequested() && this.m == 2) {
            int i3 = (int) (this.i + this.g);
            int i4 = (int) (this.j + this.h);
            if (Math.abs(i4 - sVar.itemView.getTop()) >= sVar.itemView.getHeight() * 0.5f || Math.abs(i3 - sVar.itemView.getLeft()) >= sVar.itemView.getWidth() * 0.5f) {
                if (this.z == null) {
                    this.z = new ArrayList();
                    this.A = new ArrayList();
                } else {
                    this.z.clear();
                    this.A.clear();
                }
                int round = Math.round(this.i + this.g) - 0;
                int round2 = Math.round(this.j + this.h) - 0;
                int width = sVar.itemView.getWidth() + round + 0;
                int height = sVar.itemView.getHeight() + round2 + 0;
                int i5 = (round + width) / 2;
                int i6 = (round2 + height) / 2;
                RecyclerView.LayoutManager layoutManager = this.p.getLayoutManager();
                int childCount = layoutManager.getChildCount();
                int i7 = 0;
                while (i7 < childCount) {
                    View childAt = layoutManager.getChildAt(i7);
                    if (childAt == sVar.itemView || childAt.getBottom() < round2 || childAt.getTop() > height || childAt.getRight() < round || childAt.getLeft() > width) {
                        i = round;
                        i2 = round2;
                    } else {
                        RecyclerView.s childViewHolder = this.p.getChildViewHolder(childAt);
                        int abs = Math.abs(i5 - ((childAt.getLeft() + childAt.getRight()) / 2));
                        int abs2 = Math.abs(i6 - ((childAt.getTop() + childAt.getBottom()) / 2));
                        int i8 = (abs * abs) + (abs2 * abs2);
                        int size = this.z.size();
                        i = round;
                        i2 = round2;
                        int i9 = 0;
                        int i10 = 0;
                        while (i9 < size) {
                            int i11 = size;
                            if (i8 <= this.A.get(i9).intValue()) {
                                break;
                            }
                            i10++;
                            i9++;
                            size = i11;
                        }
                        this.z.add(i10, childViewHolder);
                        this.A.add(i10, Integer.valueOf(i8));
                    }
                    i7++;
                    round = i;
                    round2 = i2;
                }
                List<RecyclerView.s> list = this.z;
                if (list.size() == 0) {
                    return;
                }
                RecyclerView.s a = AbstractC0012a.a(sVar, list, i3, i4);
                if (a == null) {
                    this.z.clear();
                    this.A.clear();
                    return;
                }
                int adapterPosition = a.getAdapterPosition();
                int adapterPosition2 = sVar.getAdapterPosition();
                if (this.l.a(this.p, sVar, a)) {
                    AbstractC0012a.a(this.p, sVar, adapterPosition2, a, adapterPosition, i3, i4);
                }
            }
        }
    }

    @Override // android.support.v7.widget.RecyclerView.h
    public final void onChildViewDetachedFromWindow(View view) {
        a(view);
        RecyclerView.s childViewHolder = this.p.getChildViewHolder(view);
        if (childViewHolder == null) {
            return;
        }
        if (this.b != null && childViewHolder == this.b) {
            a((RecyclerView.s) null, 0);
            return;
        }
        a(childViewHolder, false);
        if (this.a.remove(childViewHolder.itemView)) {
            this.l.c(this.p, childViewHolder);
        }
    }

    final int a(RecyclerView.s sVar, boolean z) {
        for (int size = this.o.size() - 1; size >= 0; size--) {
            c cVar = this.o.get(size);
            if (cVar.h == sVar) {
                cVar.o |= z;
                if (!cVar.p) {
                    cVar.cancel();
                }
                this.o.remove(size);
                return cVar.k;
            }
        }
        return 0;
    }

    @Override // android.support.v7.widget.RecyclerView.f
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        rect.setEmpty();
    }

    private void a() {
        if (this.r != null) {
            this.r.recycle();
            this.r = null;
        }
    }

    final boolean a(int i, MotionEvent motionEvent, int i2) {
        int b2;
        View a;
        if (this.b == null && i == 2 && this.m != 2 && this.l.a() && this.p.getScrollState() != 1) {
            RecyclerView.LayoutManager layoutManager = this.p.getLayoutManager();
            RecyclerView.s sVar = null;
            if (this.k != -1) {
                int findPointerIndex = motionEvent.findPointerIndex(this.k);
                float abs = Math.abs(motionEvent.getX(findPointerIndex) - this.c);
                float abs2 = Math.abs(motionEvent.getY(findPointerIndex) - this.d);
                if ((abs >= this.y || abs2 >= this.y) && ((abs <= abs2 || !layoutManager.canScrollHorizontally()) && ((abs2 <= abs || !layoutManager.canScrollVertically()) && (a = a(motionEvent)) != null))) {
                    sVar = this.p.getChildViewHolder(a);
                }
            }
            if (sVar == null || (b2 = (this.l.b(this.p, sVar) & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8) == 0) {
                return false;
            }
            float x = motionEvent.getX(i2);
            float y = motionEvent.getY(i2);
            float f = x - this.c;
            float f2 = y - this.d;
            float abs3 = Math.abs(f);
            float abs4 = Math.abs(f2);
            if (abs3 >= this.y || abs4 >= this.y) {
                if (abs3 > abs4) {
                    if (f < 0.0f && (b2 & 4) == 0) {
                        return false;
                    }
                    if (f > 0.0f && (b2 & 8) == 0) {
                        return false;
                    }
                } else if (f2 < 0.0f && (b2 & 1) == 0) {
                    return false;
                } else {
                    if (f2 > 0.0f && (b2 & 2) == 0) {
                        return false;
                    }
                }
                this.h = 0.0f;
                this.g = 0.0f;
                this.k = motionEvent.getPointerId(0);
                a(sVar, 1);
                return true;
            }
            return false;
        }
        return false;
    }

    final View a(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (this.b != null) {
            View view = this.b.itemView;
            if (a(view, x, y, this.i + this.g, this.j + this.h)) {
                return view;
            }
        }
        for (int size = this.o.size() - 1; size >= 0; size--) {
            c cVar = this.o.get(size);
            View view2 = cVar.h.itemView;
            if (a(view2, x, y, cVar.m, cVar.n)) {
                return view2;
            }
        }
        return this.p.findChildViewUnder(x, y);
    }

    final void a(MotionEvent motionEvent, int i, int i2) {
        float x = motionEvent.getX(i2);
        float y = motionEvent.getY(i2);
        this.g = x - this.c;
        this.h = y - this.d;
        if ((i & 4) == 0) {
            this.g = Math.max(0.0f, this.g);
        }
        if ((i & 8) == 0) {
            this.g = Math.min(0.0f, this.g);
        }
        if ((i & 1) == 0) {
            this.h = Math.max(0.0f, this.h);
        }
        if ((i & 2) == 0) {
            this.h = Math.min(0.0f, this.h);
        }
    }

    private int b(RecyclerView.s sVar, int i) {
        if ((i & 12) != 0) {
            int i2 = this.g > 0.0f ? 8 : 4;
            if (this.r != null && this.k >= 0) {
                this.r.computeCurrentVelocity(1000, AbstractC0012a.b(this.f));
                float xVelocity = this.r.getXVelocity(this.k);
                float yVelocity = this.r.getYVelocity(this.k);
                int i3 = xVelocity > 0.0f ? 8 : 4;
                float abs = Math.abs(xVelocity);
                if ((i3 & i) != 0 && i2 == i3 && abs >= AbstractC0012a.a(this.e) && abs > Math.abs(yVelocity)) {
                    return i3;
                }
            }
            float width = this.p.getWidth() * 0.5f;
            if ((i & i2) == 0 || Math.abs(this.g) <= width) {
                return 0;
            }
            return i2;
        }
        return 0;
    }

    private int c(RecyclerView.s sVar, int i) {
        if ((i & 3) != 0) {
            int i2 = this.h > 0.0f ? 2 : 1;
            if (this.r != null && this.k >= 0) {
                this.r.computeCurrentVelocity(1000, AbstractC0012a.b(this.f));
                float xVelocity = this.r.getXVelocity(this.k);
                float yVelocity = this.r.getYVelocity(this.k);
                int i3 = yVelocity > 0.0f ? 2 : 1;
                float abs = Math.abs(yVelocity);
                if ((i3 & i) != 0 && i3 == i2 && abs >= AbstractC0012a.a(this.e) && abs > Math.abs(xVelocity)) {
                    return i3;
                }
            }
            float height = this.p.getHeight() * 0.5f;
            if ((i & i2) == 0 || Math.abs(this.h) <= height) {
                return 0;
            }
            return i2;
        }
        return 0;
    }

    final void a(View view) {
        if (view == this.s) {
            this.s = null;
            if (this.B != null) {
                this.p.setChildDrawingOrderCallback(null);
            }
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: android.support.v7.widget.helper.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0012a {
        private static final android.support.v7.widget.helper.b a;
        private static final Interpolator b = new Interpolator() { // from class: android.support.v7.widget.helper.a.a.1
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f) {
                return f * f * f * f * f;
            }
        };
        private static final Interpolator c = new Interpolator() { // from class: android.support.v7.widget.helper.a.a.2
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f) {
                float f2 = f - 1.0f;
                return (f2 * f2 * f2 * f2 * f2) + 1.0f;
            }
        };
        private int d = -1;

        public static float a(float f) {
            return f;
        }

        public static int a(int i, int i2) {
            int i3 = i & 789516;
            if (i3 == 0) {
                return i;
            }
            int i4 = i & (~i3);
            if (i2 == 0) {
                return i4 | (i3 << 2);
            }
            int i5 = i3 << 1;
            return i4 | ((-789517) & i5) | ((i5 & 789516) << 2);
        }

        public static float b(float f) {
            return f;
        }

        public static int b(int i, int i2) {
            return 196611;
        }

        public static int c(int i, int i2) {
            int i3 = i & 3158064;
            if (i3 == 0) {
                return i;
            }
            int i4 = i & (~i3);
            if (i2 == 0) {
                return i4 | (i3 >> 2);
            }
            int i5 = i3 >> 1;
            return i4 | ((-3158065) & i5) | ((i5 & 3158064) >> 2);
        }

        public abstract int a(RecyclerView recyclerView, RecyclerView.s sVar);

        public abstract void a(RecyclerView.s sVar, int i);

        public boolean a() {
            return true;
        }

        public abstract boolean a(RecyclerView recyclerView, RecyclerView.s sVar, RecyclerView.s sVar2);

        public void b(RecyclerView.s sVar, int i) {
        }

        static {
            if (Build.VERSION.SDK_INT >= 21) {
                a = new c.a();
            } else {
                a = new c.b();
            }
        }

        final int b(RecyclerView recyclerView, RecyclerView.s sVar) {
            return c(a(recyclerView, sVar), ViewCompat.getLayoutDirection(recyclerView));
        }

        public static RecyclerView.s a(RecyclerView.s sVar, List<RecyclerView.s> list, int i, int i2) {
            int bottom;
            int abs;
            int top;
            int abs2;
            int left;
            int abs3;
            int right;
            int abs4;
            int width = sVar.itemView.getWidth() + i;
            int height = sVar.itemView.getHeight() + i2;
            int left2 = i - sVar.itemView.getLeft();
            int top2 = i2 - sVar.itemView.getTop();
            int size = list.size();
            RecyclerView.s sVar2 = null;
            int i3 = -1;
            for (int i4 = 0; i4 < size; i4++) {
                RecyclerView.s sVar3 = list.get(i4);
                if (left2 > 0 && (right = sVar3.itemView.getRight() - width) < 0 && sVar3.itemView.getRight() > sVar.itemView.getRight() && (abs4 = Math.abs(right)) > i3) {
                    sVar2 = sVar3;
                    i3 = abs4;
                }
                if (left2 < 0 && (left = sVar3.itemView.getLeft() - i) > 0 && sVar3.itemView.getLeft() < sVar.itemView.getLeft() && (abs3 = Math.abs(left)) > i3) {
                    sVar2 = sVar3;
                    i3 = abs3;
                }
                if (top2 < 0 && (top = sVar3.itemView.getTop() - i2) > 0 && sVar3.itemView.getTop() < sVar.itemView.getTop() && (abs2 = Math.abs(top)) > i3) {
                    sVar2 = sVar3;
                    i3 = abs2;
                }
                if (top2 > 0 && (bottom = sVar3.itemView.getBottom() - height) < 0 && sVar3.itemView.getBottom() > sVar.itemView.getBottom() && (abs = Math.abs(bottom)) > i3) {
                    sVar2 = sVar3;
                    i3 = abs;
                }
            }
            return sVar2;
        }

        public static void a(RecyclerView recyclerView, RecyclerView.s sVar, int i, RecyclerView.s sVar2, int i2, int i3, int i4) {
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof d) {
                ((d) layoutManager).prepareForDrop(sVar.itemView, sVar2.itemView, i3, i4);
                return;
            }
            if (layoutManager.canScrollHorizontally()) {
                if (layoutManager.getDecoratedLeft(sVar2.itemView) <= recyclerView.getPaddingLeft()) {
                    recyclerView.scrollToPosition(i2);
                }
                if (layoutManager.getDecoratedRight(sVar2.itemView) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                    recyclerView.scrollToPosition(i2);
                }
            }
            if (layoutManager.canScrollVertically()) {
                if (layoutManager.getDecoratedTop(sVar2.itemView) <= recyclerView.getPaddingTop()) {
                    recyclerView.scrollToPosition(i2);
                }
                if (layoutManager.getDecoratedBottom(sVar2.itemView) >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                    recyclerView.scrollToPosition(i2);
                }
            }
        }

        public void c(RecyclerView recyclerView, RecyclerView.s sVar) {
            a.a(sVar.itemView);
        }

        public void a(Canvas canvas, RecyclerView recyclerView, RecyclerView.s sVar, float f, float f2, int i, boolean z) {
            a.a(canvas, recyclerView, sVar.itemView, f, f2, i, z);
        }

        public static long a(RecyclerView recyclerView, int i, float f, float f2) {
            RecyclerView.ItemAnimator itemAnimator = recyclerView.getItemAnimator();
            if (itemAnimator == null) {
                return i == 8 ? 200L : 250L;
            } else if (i == 8) {
                return itemAnimator.getMoveDuration();
            } else {
                return itemAnimator.getRemoveDuration();
            }
        }

        public int a(RecyclerView recyclerView, int i, int i2, int i3, long j) {
            if (this.d == -1) {
                this.d = recyclerView.getResources().getDimensionPixelSize(R.dimen.item_touch_helper_max_drag_scroll_per_frame);
            }
            int signum = (int) (((int) (((int) Math.signum(i2)) * this.d * c.getInterpolation(Math.min(1.0f, (Math.abs(i2) * 1.0f) / i)))) * b.getInterpolation(j <= ExposeAction.DEFAULT_DELAY_FOR_AUTO_EXPOSE ? ((float) j) / 2000.0f : 1.0f));
            return signum == 0 ? i2 > 0 ? 1 : -1 : signum;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public class b extends GestureDetector.SimpleOnGestureListener {
        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        b() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final void onLongPress(MotionEvent motionEvent) {
            RecyclerView.s childViewHolder;
            View a = a.this.a(motionEvent);
            if (a == null || (childViewHolder = a.this.p.getChildViewHolder(a)) == null) {
                return;
            }
            if (((a.this.l.b(a.this.p, childViewHolder) & 16711680) != 0) && motionEvent.getPointerId(0) == a.this.k) {
                int findPointerIndex = motionEvent.findPointerIndex(a.this.k);
                float x = motionEvent.getX(findPointerIndex);
                float y = motionEvent.getY(findPointerIndex);
                a.this.c = x;
                a.this.d = y;
                a aVar = a.this;
                a.this.h = 0.0f;
                aVar.g = 0.0f;
                a.this.a(childViewHolder, 2);
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class c implements Animator.AnimatorListener {
        final float d;
        final float e;
        final float f;
        final float g;
        final RecyclerView.s h;
        final int i;
        final int k;
        public boolean l;
        float m;
        float n;
        float q;
        boolean o = false;
        boolean p = false;
        final ValueAnimator j = ValueAnimator.ofFloat(0.0f, 1.0f);

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }

        c(RecyclerView.s sVar, int i, int i2, float f, float f2, float f3, float f4) {
            this.i = i2;
            this.k = i;
            this.h = sVar;
            this.d = f;
            this.e = f2;
            this.f = f3;
            this.g = f4;
            this.j.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: android.support.v7.widget.helper.a.c.1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    c.this.q = valueAnimator.getAnimatedFraction();
                }
            });
            this.j.setTarget(sVar.itemView);
            this.j.addListener(this);
            this.q = 0.0f;
        }

        public void cancel() {
            this.j.cancel();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.p) {
                this.h.setIsRecyclable(true);
            }
            this.p = true;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.q = 1.0f;
        }
    }
}

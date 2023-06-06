package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.support.annotation.AttrRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RestrictTo;
import android.support.annotation.StyleRes;
import android.support.constraint.R;
import android.support.v4.view.ViewCompat;
import android.support.v4.widget.PopupWindowCompat;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import java.lang.reflect.Method;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class ListPopupWindow implements android.support.v7.view.menu.n {
    private static Method a;
    private static Method b;
    private static Method c;
    private boolean A;
    private View B;
    private DataSetObserver C;
    private Drawable D;
    private AdapterView.OnItemSelectedListener E;
    private final d F;
    private final c G;
    private final a H;
    private Runnable I;
    private final Rect J;
    private Context d;
    public y e;
    int f;
    public int g;
    public int h;
    int i;
    int j;
    public View k;
    public AdapterView.OnItemClickListener l;
    final e m;
    final Handler n;
    public Rect o;
    public boolean p;
    public PopupWindow q;
    private ListAdapter r;
    private int s;
    private int t;
    private int u;
    private boolean v;
    private boolean w;
    private boolean x;
    private boolean y;
    private boolean z;

    static {
        try {
            a = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
        } catch (NoSuchMethodException unused) {
        }
        try {
            b = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, Boolean.TYPE);
        } catch (NoSuchMethodException unused2) {
        }
        try {
            c = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
        } catch (NoSuchMethodException unused3) {
        }
    }

    public ListPopupWindow(@NonNull Context context) {
        this(context, null, R.attr.listPopupWindowStyle);
    }

    public ListPopupWindow(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i) {
        this(context, attributeSet, i, 0);
    }

    public ListPopupWindow(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i, @StyleRes int i2) {
        this.s = -2;
        this.f = -2;
        this.u = 1002;
        this.w = true;
        this.h = 0;
        this.z = false;
        this.A = false;
        this.i = Integer.MAX_VALUE;
        this.j = 0;
        this.m = new e();
        this.F = new d();
        this.G = new c();
        this.H = new a();
        this.J = new Rect();
        this.d = context;
        this.n = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16843436, 16843437}, i, i2);
        this.g = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        this.t = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        if (this.t != 0) {
            this.v = true;
        }
        obtainStyledAttributes.recycle();
        this.q = new AppCompatPopupWindow(context, attributeSet, i, i2);
        this.q.setInputMethodMode(1);
    }

    public void a(@Nullable ListAdapter listAdapter) {
        if (this.C == null) {
            this.C = new b();
        } else if (this.r != null) {
            this.r.unregisterDataSetObserver(this.C);
        }
        this.r = listAdapter;
        if (this.r != null) {
            listAdapter.registerDataSetObserver(this.C);
        }
        if (this.e != null) {
            this.e.setAdapter(this.r);
        }
    }

    public final void a(boolean z) {
        this.p = true;
        this.q.setFocusable(true);
    }

    public final void a(@Nullable Drawable drawable) {
        this.q.setBackgroundDrawable(drawable);
    }

    public final int b() {
        if (this.v) {
            return this.t;
        }
        return 0;
    }

    public final void a(int i) {
        this.t = i;
        this.v = true;
    }

    public final void b(int i) {
        Drawable background = this.q.getBackground();
        if (background != null) {
            background.getPadding(this.J);
            this.f = this.J.left + this.J.right + i;
            return;
        }
        this.f = i;
    }

    @Override // android.support.v7.view.menu.n
    public final void e() {
        com.sankuai.waimai.platform.utils.p.b(this.q);
        a();
        this.q.setContentView(null);
        this.e = null;
        this.n.removeCallbacks(this.m);
    }

    public final void a(@Nullable PopupWindow.OnDismissListener onDismissListener) {
        this.q.setOnDismissListener(onDismissListener);
    }

    private void a() {
        if (this.B != null) {
            ViewParent parent = this.B.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.B);
            }
        }
    }

    public final void c(int i) {
        this.q.setInputMethodMode(2);
    }

    public final void c() {
        y yVar = this.e;
        if (yVar != null) {
            yVar.setListSelectionHidden(true);
            yVar.requestLayout();
        }
    }

    @Override // android.support.v7.view.menu.n
    public final boolean f() {
        return this.q.isShowing();
    }

    public final boolean h() {
        return this.q.getInputMethodMode() == 2;
    }

    @Override // android.support.v7.view.menu.n
    @Nullable
    public final ListView g() {
        return this.e;
    }

    @NonNull
    y a(Context context, boolean z) {
        return new y(context, z);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void b(boolean z) {
        this.y = true;
        this.x = true;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public class b extends DataSetObserver {
        b() {
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            if (ListPopupWindow.this.q.isShowing()) {
                ListPopupWindow.this.d();
            }
        }

        @Override // android.database.DataSetObserver
        public final void onInvalidated() {
            ListPopupWindow.this.e();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ListPopupWindow.this.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (ListPopupWindow.this.e == null || !ViewCompat.isAttachedToWindow(ListPopupWindow.this.e) || ListPopupWindow.this.e.getCount() <= ListPopupWindow.this.e.getChildCount() || ListPopupWindow.this.e.getChildCount() > ListPopupWindow.this.i) {
                return;
            }
            ListPopupWindow.this.q.setInputMethodMode(2);
            ListPopupWindow.this.d();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public class d implements View.OnTouchListener {
        d() {
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (action == 0 && ListPopupWindow.this.q != null && ListPopupWindow.this.q.isShowing() && x >= 0 && x < ListPopupWindow.this.q.getWidth() && y >= 0 && y < ListPopupWindow.this.q.getHeight()) {
                ListPopupWindow.this.n.postDelayed(ListPopupWindow.this.m, 250L);
                return false;
            } else if (action == 1) {
                ListPopupWindow.this.n.removeCallbacks(ListPopupWindow.this.m);
                return false;
            } else {
                return false;
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public class c implements AbsListView.OnScrollListener {
        @Override // android.widget.AbsListView.OnScrollListener
        public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        }

        c() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public final void onScrollStateChanged(AbsListView absListView, int i) {
            if (i != 1 || ListPopupWindow.this.h() || ListPopupWindow.this.q.getContentView() == null) {
                return;
            }
            ListPopupWindow.this.n.removeCallbacks(ListPopupWindow.this.m);
            ListPopupWindow.this.m.run();
        }
    }

    private int a(View view, int i, boolean z) {
        if (b != null) {
            try {
                return ((Integer) b.invoke(this.q, view, Integer.valueOf(i), Boolean.valueOf(z))).intValue();
            } catch (Exception unused) {
            }
        }
        return this.q.getMaxAvailableHeight(view, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.support.v7.view.menu.n
    public void d() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int makeMeasureSpec;
        int i6;
        int i7;
        boolean z = true;
        if (this.e == null) {
            Context context = this.d;
            this.I = new Runnable() { // from class: android.support.v7.widget.ListPopupWindow.1
                @Override // java.lang.Runnable
                public final void run() {
                    View view = ListPopupWindow.this.k;
                    if (view == null || view.getWindowToken() == null) {
                        return;
                    }
                    ListPopupWindow.this.d();
                }
            };
            this.e = a(context, !this.p);
            if (this.D != null) {
                this.e.setSelector(this.D);
            }
            this.e.setAdapter(this.r);
            this.e.setOnItemClickListener(this.l);
            this.e.setFocusable(true);
            this.e.setFocusableInTouchMode(true);
            this.e.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() { // from class: android.support.v7.widget.ListPopupWindow.2
                @Override // android.widget.AdapterView.OnItemSelectedListener
                public final void onNothingSelected(AdapterView<?> adapterView) {
                }

                @Override // android.widget.AdapterView.OnItemSelectedListener
                public final void onItemSelected(AdapterView<?> adapterView, View view, int i8, long j) {
                    y yVar;
                    if (i8 == -1 || (yVar = ListPopupWindow.this.e) == null) {
                        return;
                    }
                    yVar.setListSelectionHidden(false);
                }
            });
            this.e.setOnScrollListener(this.G);
            if (this.E != null) {
                this.e.setOnItemSelectedListener(this.E);
            }
            y yVar = this.e;
            View view = this.B;
            if (view != null) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0, 1.0f);
                switch (this.j) {
                    case 0:
                        linearLayout.addView(view);
                        linearLayout.addView(yVar, layoutParams);
                        break;
                    case 1:
                        linearLayout.addView(yVar, layoutParams);
                        linearLayout.addView(view);
                        break;
                    default:
                        Log.e("ListPopupWindow", "Invalid hint position " + this.j);
                        break;
                }
                if (this.f >= 0) {
                    i6 = this.f;
                    i7 = Integer.MIN_VALUE;
                } else {
                    i6 = 0;
                    i7 = 0;
                }
                view.measure(View.MeasureSpec.makeMeasureSpec(i6, i7), 0);
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) view.getLayoutParams();
                i = view.getMeasuredHeight() + layoutParams2.topMargin + layoutParams2.bottomMargin;
                yVar = linearLayout;
            } else {
                i = 0;
            }
            this.q.setContentView(yVar);
        } else {
            this.q.getContentView();
            View view2 = this.B;
            if (view2 != null) {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) view2.getLayoutParams();
                i = view2.getMeasuredHeight() + layoutParams3.topMargin + layoutParams3.bottomMargin;
            } else {
                i = 0;
            }
        }
        Drawable background = this.q.getBackground();
        if (background != null) {
            background.getPadding(this.J);
            i2 = this.J.top + this.J.bottom;
            if (!this.v) {
                this.t = -this.J.top;
            }
        } else {
            this.J.setEmpty();
            i2 = 0;
        }
        int a2 = a(this.k, this.t, this.q.getInputMethodMode() == 2);
        if (this.z || this.s == -1) {
            i3 = a2 + i2;
        } else {
            switch (this.f) {
                case -2:
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.d.getResources().getDisplayMetrics().widthPixels - (this.J.left + this.J.right), Integer.MIN_VALUE);
                    break;
                case -1:
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.d.getResources().getDisplayMetrics().widthPixels - (this.J.left + this.J.right), 1073741824);
                    break;
                default:
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f, 1073741824);
                    break;
            }
            int a3 = this.e.a(makeMeasureSpec, 0, -1, a2 - i, -1);
            if (a3 > 0) {
                i += i2 + this.e.getPaddingTop() + this.e.getPaddingBottom();
            }
            i3 = a3 + i;
        }
        boolean h = h();
        PopupWindowCompat.setWindowLayoutType(this.q, this.u);
        if (this.q.isShowing()) {
            if (ViewCompat.isAttachedToWindow(this.k)) {
                if (this.f == -1) {
                    i5 = -1;
                } else if (this.f == -2) {
                    i5 = this.k.getWidth();
                } else {
                    i5 = this.f;
                }
                if (this.s == -1) {
                    if (!h) {
                        i3 = -1;
                    }
                    if (h) {
                        this.q.setWidth(this.f == -1 ? -1 : 0);
                        this.q.setHeight(0);
                    } else {
                        this.q.setWidth(this.f == -1 ? -1 : 0);
                        this.q.setHeight(-1);
                    }
                } else if (this.s != -2) {
                    i3 = this.s;
                }
                this.q.setOutsideTouchable((this.A || this.z) ? false : false);
                this.q.update(this.k, this.g, this.t, i5 < 0 ? -1 : i5, i3 < 0 ? -1 : i3);
                return;
            }
            return;
        }
        if (this.f == -1) {
            i4 = -1;
        } else if (this.f == -2) {
            i4 = this.k.getWidth();
        } else {
            i4 = this.f;
        }
        if (this.s == -1) {
            i3 = -1;
        } else if (this.s != -2) {
            i3 = this.s;
        }
        this.q.setWidth(i4);
        this.q.setHeight(i3);
        if (a != null) {
            try {
                a.invoke(this.q, Boolean.TRUE);
            } catch (Exception unused) {
            }
        }
        this.q.setOutsideTouchable((this.A || this.z) ? false : true);
        this.q.setTouchInterceptor(this.F);
        if (this.y) {
            PopupWindowCompat.setOverlapAnchor(this.q, this.x);
        }
        if (c != null) {
            try {
                c.invoke(this.q, this.o);
            } catch (Exception e2) {
                Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e2);
            }
        }
        PopupWindowCompat.showAsDropDown(this.q, this.k, this.g, this.t, this.h);
        this.e.setSelection(-1);
        if (!this.p || this.e.isInTouchMode()) {
            c();
        }
        if (this.p) {
            return;
        }
        this.n.post(this.H);
    }
}

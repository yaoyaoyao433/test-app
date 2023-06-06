package com.sankuai.waimai.restaurant.shopcart.widget.draglist;

import android.annotation.SuppressLint;
import android.graphics.Point;
import android.support.constraint.R;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class a extends d implements GestureDetector.OnGestureListener, View.OnTouchListener {
    public static ChangeQuickRedirect a;
    private int A;
    private GestureDetector.OnGestureListener B;
    public int b;
    public int c;
    boolean d;
    boolean e;
    private int f;
    private int g;
    private int j;
    private boolean k;
    private GestureDetector l;
    private GestureDetector m;
    private int n;
    private int[] o;
    private int p;
    private int q;
    private int r;
    private int s;
    private boolean t;
    private float u;
    private int v;
    private int w;
    private int x;
    private boolean y;
    private DragSortListView z;

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onShowPress(MotionEvent motionEvent) {
    }

    public static /* synthetic */ boolean a(a aVar, boolean z) {
        aVar.k = false;
        return false;
    }

    public a(DragSortListView dragSortListView, int i, int i2, int i3) {
        this(dragSortListView, R.id.layout_food_item, 0, 0, 0);
        Object[] objArr = {dragSortListView, Integer.valueOf((int) R.id.layout_food_item), 0, 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e75de430c47d4c88948847d71d28ebf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e75de430c47d4c88948847d71d28ebf");
        }
    }

    private a(DragSortListView dragSortListView, int i, int i2, int i3, int i4) {
        this(dragSortListView, i, i2, i3, 0, 0);
        Object[] objArr = {dragSortListView, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "64045ef33d89c76ae000f0fac3f98443", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "64045ef33d89c76ae000f0fac3f98443");
        }
    }

    public a(DragSortListView dragSortListView, int i, int i2, int i3, int i4, int i5) {
        super(dragSortListView);
        Object[] objArr = {dragSortListView, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e27864fd6931411dad27a6fe1d65b932", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e27864fd6931411dad27a6fe1d65b932");
            return;
        }
        this.b = 0;
        this.c = -1;
        this.f = -1;
        this.g = -1;
        this.d = true;
        this.e = false;
        this.k = false;
        this.o = new int[2];
        this.t = false;
        this.u = 500.0f;
        this.B = new GestureDetector.SimpleOnGestureListener() { // from class: com.sankuai.waimai.restaurant.shopcart.widget.draglist.a.1
            public static ChangeQuickRedirect a;

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                Object[] objArr2 = {motionEvent, motionEvent2, Float.valueOf(f), Float.valueOf(f2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e2181ab4a7a72aff7a9a2dfcc2fecf86", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e2181ab4a7a72aff7a9a2dfcc2fecf86")).booleanValue();
                }
                if (a.this.e && a.this.k) {
                    int width = a.this.z.getWidth() / 5;
                    if (f > a.this.u) {
                        if (a.this.A > (-width)) {
                            a.this.z.a(true, f);
                        }
                    } else if (f < (-a.this.u) && a.this.A < width) {
                        a.this.z.a(true, f);
                    }
                    a.a(a.this, false);
                }
                return false;
            }
        };
        this.z = dragSortListView;
        this.l = new GestureDetector(dragSortListView.getContext(), this);
        this.m = new GestureDetector(dragSortListView.getContext(), this.B);
        this.m.setIsLongpressEnabled(false);
        this.n = ViewConfiguration.get(dragSortListView.getContext()).getScaledTouchSlop();
        this.v = i;
        this.w = i4;
        this.x = i5;
        this.j = i3;
        this.b = i2;
    }

    private boolean a(int i, int i2, int i3) {
        View a2;
        boolean z = false;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec209ab6cd63a7068253367c27a4e13e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec209ab6cd63a7068253367c27a4e13e")).booleanValue();
        }
        int i4 = (!this.d || this.k) ? 0 : 12;
        if (this.e && this.k) {
            i4 = i4 | 1 | 2;
        }
        int i5 = i4;
        DragSortListView dragSortListView = this.z;
        int headerViewsCount = i - this.z.getHeaderViewsCount();
        Object[] objArr2 = {Integer.valueOf(headerViewsCount), Integer.valueOf(i5), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect2 = DragSortListView.a;
        if (PatchProxy.isSupport(objArr2, dragSortListView, changeQuickRedirect2, false, "1443d5ae3dcb77bd87513a9394675233", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, dragSortListView, changeQuickRedirect2, false, "1443d5ae3dcb77bd87513a9394675233")).booleanValue();
        } else if (dragSortListView.c && dragSortListView.d != null && (a2 = dragSortListView.d.a(headerViewsCount)) != null) {
            z = dragSortListView.a(headerViewsCount, a2, i5, i2, i3);
        }
        this.t = z;
        return this.t;
    }

    @Override // android.view.View.OnTouchListener
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouch(View view, MotionEvent motionEvent) {
        Object[] objArr = {view, motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f82fdbd1f3512f5dd0443c9afb96d1c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f82fdbd1f3512f5dd0443c9afb96d1c")).booleanValue();
        }
        if (!this.z.b || this.z.f) {
            return false;
        }
        this.l.onTouchEvent(motionEvent);
        if (this.e && this.t && this.j == 1) {
            this.m.onTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction() & 255;
        if (action != 3) {
            switch (action) {
                case 0:
                    this.r = (int) motionEvent.getX();
                    this.s = (int) motionEvent.getY();
                    break;
                case 1:
                    if (this.e && this.k) {
                        if ((this.A >= 0 ? this.A : -this.A) > this.z.getWidth() / 2) {
                            this.z.a(true, 0.0f);
                            break;
                        }
                    }
                    break;
            }
            return false;
        }
        this.k = false;
        this.t = false;
        return false;
    }

    @Override // com.sankuai.waimai.restaurant.shopcart.widget.draglist.d, com.sankuai.waimai.restaurant.shopcart.widget.draglist.DragSortListView.i
    public void a(View view, Point point, Point point2) {
        if (this.e && this.k) {
            this.A = point.x;
        }
    }

    public int a(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c22426408397a621606a50ce799f638b", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c22426408397a621606a50ce799f638b")).intValue() : b(motionEvent);
    }

    public final int b(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c94d9373c64ae6c3925c523a59bdc001", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c94d9373c64ae6c3925c523a59bdc001")).intValue() : a(motionEvent, this.v);
    }

    private int a(MotionEvent motionEvent, int i) {
        Object[] objArr = {motionEvent, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "23a34d28e717082495300bf17ad36151", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "23a34d28e717082495300bf17ad36151")).intValue();
        }
        int pointToPosition = this.z.pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        int headerViewsCount = this.z.getHeaderViewsCount();
        int footerViewsCount = this.z.getFooterViewsCount();
        int count = this.z.getCount();
        if (pointToPosition != -1 && pointToPosition >= headerViewsCount && pointToPosition < count - footerViewsCount) {
            DragSortListView dragSortListView = this.z;
            View childAt = dragSortListView.getChildAt(pointToPosition - dragSortListView.getFirstVisiblePosition());
            int rawX = (int) motionEvent.getRawX();
            int rawY = (int) motionEvent.getRawY();
            View findViewById = i == 0 ? childAt : childAt.findViewById(i);
            if (findViewById != null) {
                findViewById.getLocationOnScreen(this.o);
                if (rawX > this.o[0] && rawY > this.o[1] && rawX < this.o[0] + findViewById.getWidth() && rawY < this.o[1] + findViewById.getHeight()) {
                    this.p = childAt.getLeft();
                    this.q = childAt.getTop();
                    return pointToPosition;
                }
            }
        }
        return -1;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "000093f10f51161813ccf86d210a9aa8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "000093f10f51161813ccf86d210a9aa8")).booleanValue();
        }
        if (this.e && this.j == 0) {
            this.g = a(motionEvent, this.w);
        }
        this.c = a(motionEvent);
        int i = -1;
        if (this.c != -1 && this.b == 0) {
            a(this.c, ((int) motionEvent.getX()) - this.p, ((int) motionEvent.getY()) - this.q);
        }
        this.k = false;
        this.y = true;
        this.A = 0;
        Object[] objArr2 = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5632883a8c0b5e10ea3789dc9231211c", RobustBitConfig.DEFAULT_VALUE)) {
            i = ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5632883a8c0b5e10ea3789dc9231211c")).intValue();
        } else if (this.j == 1) {
            Object[] objArr3 = {motionEvent};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            i = PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "f846fe792b86c585af39ec389d10e8ed", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "f846fe792b86c585af39ec389d10e8ed")).intValue() : a(motionEvent, this.x);
        }
        this.f = i;
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        Object[] objArr = {motionEvent, motionEvent2, Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "70f6bef4459be3626cb0c882cb795500", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "70f6bef4459be3626cb0c882cb795500")).booleanValue();
        }
        if (motionEvent == null || motionEvent2 == null) {
            return false;
        }
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        int x2 = (int) motionEvent2.getX();
        int y2 = (int) motionEvent2.getY();
        int i = x2 - this.p;
        int i2 = y2 - this.q;
        if (this.y && !this.t && (this.c != -1 || this.f != -1)) {
            if (this.c != -1) {
                if (this.b == 1 && Math.abs(y2 - y) > this.n && this.d) {
                    a(this.c, i, i2);
                } else if (this.b != 0 && Math.abs(x2 - x) > this.n && this.e) {
                    this.k = true;
                    a(this.f, i, i2);
                }
            } else if (this.f != -1) {
                if (Math.abs(x2 - x) > this.n && this.e) {
                    this.k = true;
                    a(this.f, i, i2);
                } else if (Math.abs(y2 - y) > this.n) {
                    this.y = false;
                }
            }
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onLongPress(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e334bf52ad2e8bb94c13241fd5893f5c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e334bf52ad2e8bb94c13241fd5893f5c");
        } else if (this.c == -1 || this.b != 2) {
        } else {
            this.z.performHapticFeedback(0);
            a(this.c, this.r - this.p, this.s - this.q);
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2caed7df87a3e0f4a8d76ccd1addf82a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2caed7df87a3e0f4a8d76ccd1addf82a")).booleanValue();
        }
        if (this.e && this.j == 0 && this.g != -1) {
            DragSortListView dragSortListView = this.z;
            int headerViewsCount = this.g - this.z.getHeaderViewsCount();
            Object[] objArr2 = {Integer.valueOf(headerViewsCount)};
            ChangeQuickRedirect changeQuickRedirect2 = DragSortListView.a;
            if (PatchProxy.isSupport(objArr2, dragSortListView, changeQuickRedirect2, false, "93e9b277fcd894ec68ad4f10ca22a258", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, dragSortListView, changeQuickRedirect2, false, "93e9b277fcd894ec68ad4f10ca22a258");
            } else {
                dragSortListView.e = false;
                dragSortListView.a(headerViewsCount, 0.0f);
            }
        }
        return true;
    }
}

package com.meituan.android.base.ui.widget;

import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SectionIndexer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class PinnedSectionListView extends ListView {
    public static ChangeQuickRedirect a;
    public AbsListView.OnScrollListener b;
    public a c;
    public int d;
    private final Rect e;
    private final PointF f;
    private int g;
    private View h;
    private MotionEvent i;
    private GradientDrawable j;
    private int k;
    private int l;
    private int m;
    private final AbsListView.OnScrollListener n;
    private final DataSetObserver o;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class a {
        public View a;
        public int b;
        public long c;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface b extends ListAdapter {
        boolean a(int i);
    }

    public PinnedSectionListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "61a2fdc39fe95113cff157e60b5021ee", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "61a2fdc39fe95113cff157e60b5021ee");
            return;
        }
        this.e = new Rect();
        this.f = new PointF();
        this.n = new AbsListView.OnScrollListener() { // from class: com.meituan.android.base.ui.widget.PinnedSectionListView.1
            public static ChangeQuickRedirect a;

            @Override // android.widget.AbsListView.OnScrollListener
            public final void onScrollStateChanged(AbsListView absListView, int i2) {
                Object[] objArr2 = {absListView, Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "dfdd1c53e117f945c45da998ee7a09bc", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "dfdd1c53e117f945c45da998ee7a09bc");
                } else if (PinnedSectionListView.this.b != null) {
                    PinnedSectionListView.this.b.onScrollStateChanged(absListView, i2);
                }
            }

            @Override // android.widget.AbsListView.OnScrollListener
            public final void onScroll(AbsListView absListView, int i2, int i3, int i4) {
                Object[] objArr2 = {absListView, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b1cff18e3a3100d043200d35ef69f0f2", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b1cff18e3a3100d043200d35ef69f0f2");
                    return;
                }
                if (PinnedSectionListView.this.b != null) {
                    PinnedSectionListView.this.b.onScroll(absListView, i2, i3, i4);
                }
                ListAdapter adapter = PinnedSectionListView.this.getAdapter();
                if (adapter == null || i3 == 0) {
                    return;
                }
                if (PinnedSectionListView.a(adapter, adapter.getItemViewType(i2))) {
                    if (PinnedSectionListView.this.getChildAt(0).getTop() == PinnedSectionListView.this.getPaddingTop()) {
                        PinnedSectionListView.this.a();
                        return;
                    } else {
                        PinnedSectionListView.this.a(i2, i2, i3);
                        return;
                    }
                }
                int a2 = PinnedSectionListView.this.a(i2);
                if (a2 >= 0) {
                    PinnedSectionListView.this.a(a2, i2, i3);
                } else {
                    PinnedSectionListView.this.a();
                }
            }
        };
        this.o = new DataSetObserver() { // from class: com.meituan.android.base.ui.widget.PinnedSectionListView.2
            public static ChangeQuickRedirect a;

            @Override // android.database.DataSetObserver
            public final void onChanged() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c5660589dd86acf3f18db97036e3966f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c5660589dd86acf3f18db97036e3966f");
                } else {
                    PinnedSectionListView.this.b();
                }
            }

            @Override // android.database.DataSetObserver
            public final void onInvalidated() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b74aca31510380a4c90c7ca3916297c8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b74aca31510380a4c90c7ca3916297c8");
                } else {
                    PinnedSectionListView.this.b();
                }
            }
        };
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d95bf0d43a0324777718eda6562c0df1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d95bf0d43a0324777718eda6562c0df1");
            return;
        }
        setOnScrollListener(this.n);
        this.g = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        a(true);
    }

    public void setShadowVisible(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "494142f159bdfbea2156283939cf95ba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "494142f159bdfbea2156283939cf95ba");
            return;
        }
        a(z);
        if (this.c != null) {
            View view = this.c.a;
            invalidate(view.getLeft(), view.getTop(), view.getRight(), view.getBottom() + this.l);
        }
    }

    private void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "65edf5e4fbdb243411447d818c3fd560", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "65edf5e4fbdb243411447d818c3fd560");
        } else if (z) {
            if (this.j == null) {
                this.j = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{Color.parseColor("#ffa0a0a0"), Color.parseColor("#50a0a0a0"), Color.parseColor("#00a0a0a0")});
                this.l = (int) (getResources().getDisplayMetrics().density * 8.0f);
            }
        } else if (this.j != null) {
            this.j = null;
            this.l = 0;
        }
    }

    public final void a() {
        if (this.c != null) {
            this.c = null;
        }
    }

    public final void a(int i, int i2, int i3) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "84ee688b1e38c7b89b8d753b473f725c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "84ee688b1e38c7b89b8d753b473f725c");
        } else if (i3 <= 0) {
            a();
        } else {
            if (this.c != null && this.c.b != i) {
                a();
            }
            if (this.c == null) {
                Object[] objArr2 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a47d5c589b257594146075d93f1a394c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a47d5c589b257594146075d93f1a394c");
                } else {
                    a aVar = new a();
                    View view = getAdapter().getView(i, aVar.a, this);
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    if (layoutParams == null) {
                        layoutParams = generateDefaultLayoutParams();
                        view.setLayoutParams(layoutParams);
                    }
                    int mode = View.MeasureSpec.getMode(layoutParams.height);
                    int size = View.MeasureSpec.getSize(layoutParams.height);
                    if (mode == 0) {
                        mode = 1073741824;
                    }
                    int height = (getHeight() - getListPaddingTop()) - getListPaddingBottom();
                    if (size > height) {
                        size = height;
                    }
                    view.measure(View.MeasureSpec.makeMeasureSpec((getWidth() - getListPaddingLeft()) - getListPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec(size, mode));
                    view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                    this.d = 0;
                    aVar.a = view;
                    aVar.b = i;
                    aVar.c = getAdapter().getItemId(i);
                    this.c = aVar;
                }
            }
            int i4 = i + 1;
            if (i4 < getCount()) {
                int a2 = a(i4, i3 - (i4 - i2));
                if (a2 >= 0) {
                    this.k = getChildAt(a2 - i2).getTop() - (this.c.a.getBottom() + getPaddingTop());
                    if (this.k < 0) {
                        this.d = this.k;
                        return;
                    } else {
                        this.d = 0;
                        return;
                    }
                }
                this.d = 0;
                this.k = Integer.MAX_VALUE;
            }
        }
    }

    private int a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "09918c2f5c903e4540e4bb9cc3eb5a40", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "09918c2f5c903e4540e4bb9cc3eb5a40")).intValue();
        }
        ListAdapter adapter = getAdapter();
        int count = adapter.getCount();
        if (getLastVisiblePosition() >= count) {
            return -1;
        }
        if (i + i2 >= count) {
            i2 = count - i;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = i + i3;
            if (a(adapter, adapter.getItemViewType(i4))) {
                return i4;
            }
        }
        return -1;
    }

    public final int a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "28dd39290ce6d8a7899c317c6953e499", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "28dd39290ce6d8a7899c317c6953e499")).intValue();
        }
        ListAdapter adapter = getAdapter();
        if (i >= adapter.getCount()) {
            return -1;
        }
        if (adapter instanceof SectionIndexer) {
            SectionIndexer sectionIndexer = (SectionIndexer) adapter;
            int positionForSection = sectionIndexer.getPositionForSection(sectionIndexer.getSectionForPosition(i));
            if (a(adapter, adapter.getItemViewType(positionForSection))) {
                return positionForSection;
            }
        }
        while (i >= 0) {
            if (a(adapter, adapter.getItemViewType(i))) {
                return i;
            }
            i--;
        }
        return -1;
    }

    public final void b() {
        int firstVisiblePosition;
        int a2;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "308894151532d3d494bd425102ce5c15", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "308894151532d3d494bd425102ce5c15");
            return;
        }
        a();
        ListAdapter adapter = getAdapter();
        if (adapter == null || adapter.getCount() <= 0 || (a2 = a((firstVisiblePosition = getFirstVisiblePosition()))) == -1) {
            return;
        }
        a(a2, firstVisiblePosition, getLastVisiblePosition() - firstVisiblePosition);
    }

    @Override // android.widget.AbsListView
    public void setOnScrollListener(AbsListView.OnScrollListener onScrollListener) {
        Object[] objArr = {onScrollListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "67e4e7e7637a1e437efb690d75bc6988", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "67e4e7e7637a1e437efb690d75bc6988");
        } else if (onScrollListener == this.n) {
            super.setOnScrollListener(onScrollListener);
        } else {
            this.b = onScrollListener;
        }
    }

    @Override // android.widget.AbsListView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        Object[] objArr = {parcelable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f86d88f1d84f23ced8cb4e57b996fa90", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f86d88f1d84f23ced8cb4e57b996fa90");
            return;
        }
        super.onRestoreInstanceState(parcelable);
        post(new Runnable() { // from class: com.meituan.android.base.ui.widget.PinnedSectionListView.3
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "03a2d30d9e228178531200fd2eb47814", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "03a2d30d9e228178531200fd2eb47814");
                } else {
                    PinnedSectionListView.this.b();
                }
            }
        });
    }

    @Override // android.widget.AdapterView
    public void setAdapter(ListAdapter listAdapter) {
        Object[] objArr = {listAdapter};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "db93bd19276e5ea41771e29250cb9bee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "db93bd19276e5ea41771e29250cb9bee");
            return;
        }
        if (listAdapter != null) {
            if (!(listAdapter instanceof b)) {
                throw new IllegalArgumentException("Does your adapter implement PinnedSectionListAdapter?");
            }
            if (listAdapter.getViewTypeCount() < 2) {
                throw new IllegalArgumentException("Does your adapter handle at least two types of views in getViewTypeCount() method: items and sections?");
            }
        }
        ListAdapter adapter = getAdapter();
        if (adapter != null) {
            adapter.unregisterDataSetObserver(this.o);
        }
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.o);
        }
        if (adapter != listAdapter) {
            a();
        }
        super.setAdapter(listAdapter);
    }

    @Override // android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fec375cf0af114d80149caa4f4f4011e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fec375cf0af114d80149caa4f4f4011e");
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        if (this.c == null || ((i3 - i) - getPaddingLeft()) - getPaddingRight() == this.c.a.getWidth()) {
            return;
        }
        b();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ce7e941d60cac2a01fccdef170f5f0f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ce7e941d60cac2a01fccdef170f5f0f");
            return;
        }
        super.dispatchDraw(canvas);
        if (this.c != null) {
            int listPaddingLeft = getListPaddingLeft();
            int listPaddingTop = getListPaddingTop();
            View view = this.c.a;
            canvas.save();
            canvas.clipRect(listPaddingLeft, listPaddingTop, view.getWidth() + listPaddingLeft, view.getHeight() + (this.j != null ? Math.min(this.l, this.k) : 0) + listPaddingTop);
            canvas.translate(listPaddingLeft, listPaddingTop + this.d);
            drawChild(canvas, this.c.a, getDrawingTime());
            if (this.j != null && this.k > 0) {
                this.j.setBounds(this.c.a.getLeft() + this.m, this.c.a.getBottom(), this.c.a.getRight() - this.m, this.c.a.getBottom() + this.l);
                this.j.draw(canvas);
            }
            canvas.restore();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "82cf18c5767ff3120dee1ef3757d944f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "82cf18c5767ff3120dee1ef3757d944f")).booleanValue();
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int action = motionEvent.getAction();
        if (action == 0 && this.h == null && this.c != null && a(this.c.a, x, y)) {
            this.h = this.c.a;
            this.f.x = x;
            this.f.y = y;
            this.i = MotionEvent.obtain(motionEvent);
        }
        if (this.h != null) {
            if (a(this.h, x, y)) {
                this.h.dispatchTouchEvent(motionEvent);
            }
            if (action == 1) {
                super.dispatchTouchEvent(motionEvent);
                d();
                c();
            } else if (action == 3) {
                c();
            } else if (action == 2 && Math.abs(y - this.f.y) > this.g) {
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                obtain.setAction(3);
                this.h.dispatchTouchEvent(obtain);
                obtain.recycle();
                super.dispatchTouchEvent(this.i);
                super.dispatchTouchEvent(motionEvent);
                c();
            }
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    private boolean a(View view, float f, float f2) {
        Object[] objArr = {view, Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc909a354f26c04ebafe69fed2df07ae", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc909a354f26c04ebafe69fed2df07ae")).booleanValue();
        }
        view.getHitRect(this.e);
        this.e.top += this.d;
        this.e.bottom += this.d + getPaddingTop();
        this.e.left += getPaddingLeft();
        this.e.right -= getPaddingRight();
        return this.e.contains((int) f, (int) f2);
    }

    private void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea71aca7ff6c98afa71ca35bdf7eca1a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea71aca7ff6c98afa71ca35bdf7eca1a");
            return;
        }
        this.h = null;
        if (this.i != null) {
            this.i.recycle();
            this.i = null;
        }
    }

    private boolean d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7aa3ea009f51e2e36c63003db7400193", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7aa3ea009f51e2e36c63003db7400193")).booleanValue();
        }
        if (this.c == null) {
            return false;
        }
        AdapterView.OnItemClickListener onItemClickListener = getOnItemClickListener();
        if (getAdapter().isEnabled(this.c.b)) {
            if (onItemClickListener != null) {
                View view = this.c.a;
                playSoundEffect(0);
                if (view != null) {
                    view.sendAccessibilityEvent(1);
                }
                onItemClickListener.onItemClick(this, view, this.c.b, this.c.c);
                return true;
            } else if (Build.VERSION.SDK_INT >= 24 && this.c.a != null) {
                try {
                    Method declaredMethod = View.class.getDeclaredMethod("getListenerInfo", new Class[0]);
                    declaredMethod.setAccessible(true);
                    Object invoke = declaredMethod.invoke(this.c.a, new Object[0]);
                    Field declaredField = invoke.getClass().getDeclaredField("mOnClickListener");
                    declaredField.setAccessible(true);
                    ((View.OnClickListener) declaredField.get(invoke)).onClick(this.c.a);
                    return true;
                } catch (Exception unused) {
                }
            }
        }
        return false;
    }

    public static boolean a(ListAdapter listAdapter, int i) {
        Object[] objArr = {listAdapter, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3f0a2270d1733c99083081cec62eefcd", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3f0a2270d1733c99083081cec62eefcd")).booleanValue();
        }
        if (listAdapter instanceof HeaderViewListAdapter) {
            listAdapter = ((HeaderViewListAdapter) listAdapter).getWrappedAdapter();
        }
        return ((b) listAdapter).a(i);
    }
}

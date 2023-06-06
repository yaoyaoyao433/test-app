package com.sankuai.waimai.business.page.kingkong.future.tabfeed.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ScrollView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.widget.pullrefresh.AbsScrollPullRefresh;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class NestedPullToRefreshView extends AbsScrollPullRefresh {
    public static ChangeQuickRedirect a;
    public c b;
    private int h;
    private int i;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    static class b implements c {
        public static final b a = new b();

        @Override // com.sankuai.waimai.business.page.kingkong.future.tabfeed.view.NestedPullToRefreshView.c
        public final boolean a() {
            return false;
        }

        @Override // com.sankuai.waimai.business.page.kingkong.future.tabfeed.view.NestedPullToRefreshView.c
        public final boolean b() {
            return false;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface c {
        boolean a();

        boolean b();
    }

    public NestedPullToRefreshView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e36b4a170f8557c177d28f405bf2e73", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e36b4a170f8557c177d28f405bf2e73");
        } else {
            a(context);
        }
    }

    public NestedPullToRefreshView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b56f21ff3aefc21acffde0e42849b3b1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b56f21ff3aefc21acffde0e42849b3b1");
        } else {
            a(context);
        }
    }

    public NestedPullToRefreshView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b6f26974e733961a6301552edaa6d5bd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b6f26974e733961a6301552edaa6d5bd");
        } else {
            a(context);
        }
    }

    public NestedPullToRefreshView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "43e3fa2838f2682a09e57fd0f9f08d37", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "43e3fa2838f2682a09e57fd0f9f08d37");
        } else {
            a(context);
        }
    }

    private void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a4a580afe61454bfbc03f785a75d150", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a4a580afe61454bfbc03f785a75d150");
        } else {
            this.i = ViewConfiguration.get(context).getScaledTouchSlop();
        }
    }

    @Override // com.sankuai.waimai.platform.widget.pullrefresh.AbsScrollPullRefresh, android.view.View
    public void onFinishInflate() {
        c cVar;
        c dVar;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4fd7cf7f8f9595a541daaa1310b98c1c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4fd7cf7f8f9595a541daaa1310b98c1c");
            return;
        }
        super.onFinishInflate();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (!PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0c41a5b71e79e01c99250700e662d4ec", RobustBitConfig.DEFAULT_VALUE)) {
            ScrollView b2 = b(this);
            if (b2 != null) {
                dVar = new e(b2);
            } else {
                AdapterView<?> a2 = a(this);
                if (a2 != null) {
                    dVar = new a(a2);
                } else {
                    RecyclerView recyclerView = (RecyclerView) a(this, RecyclerView.class);
                    if (recyclerView != null) {
                        dVar = new d(recyclerView);
                    } else {
                        cVar = b.a;
                    }
                }
            }
            this.b = dVar;
        }
        cVar = (c) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0c41a5b71e79e01c99250700e662d4ec");
        dVar = cVar;
        this.b = dVar;
    }

    public void setContentView(c cVar) {
        this.b = cVar;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "576ad92f020f45901515a5f0f143aa41", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "576ad92f020f45901515a5f0f143aa41")).booleanValue();
        }
        int rawY = (int) motionEvent.getRawY();
        int action = motionEvent.getAction();
        if (action == 0) {
            this.h = rawY;
        } else if (action == 2) {
            int i = rawY - this.h;
            if (this.b != null && this.f && i >= this.i && this.b.a()) {
                setPullTarget(1);
                return true;
            } else if (this.b != null && this.g && i <= (-this.i) && this.b.b()) {
                setPullTarget(2);
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5576d9d392d11f5722027f8d94871132", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5576d9d392d11f5722027f8d94871132")).booleanValue();
        }
        int rawY = (int) motionEvent.getRawY();
        switch (motionEvent.getAction()) {
            case 1:
            case 3:
                if (b()) {
                    this.d.d();
                } else if (c()) {
                    this.e.d();
                }
                setPullTarget(0);
                break;
            case 2:
                int i = rawY - this.h;
                if (b()) {
                    this.d.c(i);
                    break;
                } else if (c()) {
                    this.e.c(-i);
                    break;
                }
                break;
        }
        return super.onTouchEvent(motionEvent);
    }

    private static AdapterView<?> a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "24b11a6d9fd52dc67c4d4eb8418b1219", RobustBitConfig.DEFAULT_VALUE)) {
            return (AdapterView) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "24b11a6d9fd52dc67c4d4eb8418b1219");
        }
        if (view instanceof AdapterView) {
            return (AdapterView) view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                AdapterView<?> a2 = a(viewGroup.getChildAt(i));
                if (a2 != null) {
                    return a2;
                }
            }
        }
        return null;
    }

    private static ScrollView b(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "309e6df0e777c18841049cd7714bacb3", RobustBitConfig.DEFAULT_VALUE)) {
            return (ScrollView) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "309e6df0e777c18841049cd7714bacb3");
        }
        if (view instanceof ScrollView) {
            return (ScrollView) view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                ScrollView b2 = b(viewGroup.getChildAt(i));
                if (b2 != null) {
                    return b2;
                }
            }
        }
        return null;
    }

    private static <T> T a(View view, Class<T> cls) {
        T t;
        int i = 0;
        Object[] objArr = {view, cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d20c285dbe3ae699f3134dd9c0c153cb", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d20c285dbe3ae699f3134dd9c0c153cb");
        }
        if (view == 0 || !cls.isAssignableFrom(view.getClass())) {
            if (view instanceof ViewGroup) {
                while (true) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    if (i >= viewGroup.getChildCount()) {
                        break;
                    }
                    View childAt = viewGroup.getChildAt(i);
                    if ((childAt instanceof ViewGroup) && (t = (T) a(childAt, cls)) != null) {
                        return t;
                    }
                    i++;
                }
            }
            return null;
        }
        return view;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    class e implements c {
        public static ChangeQuickRedirect a;
        @NonNull
        private final ScrollView c;

        public e(@NonNull ScrollView scrollView) {
            Object[] objArr = {NestedPullToRefreshView.this, scrollView};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ad194664c6060548c3df266d36a4396", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ad194664c6060548c3df266d36a4396");
            } else {
                this.c = scrollView;
            }
        }

        @Override // com.sankuai.waimai.business.page.kingkong.future.tabfeed.view.NestedPullToRefreshView.c
        public final boolean a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f97741f44c55d8eada9031f471d0bb81", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f97741f44c55d8eada9031f471d0bb81")).booleanValue() : this.c.getScrollY() == 0;
        }

        @Override // com.sankuai.waimai.business.page.kingkong.future.tabfeed.view.NestedPullToRefreshView.c
        public final boolean b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6f3aa5260d47b47f5f9a028349c99958", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6f3aa5260d47b47f5f9a028349c99958")).booleanValue();
            }
            View childAt = this.c.getChildAt(0);
            return childAt != null && childAt.getMeasuredHeight() <= NestedPullToRefreshView.this.getHeight() + this.c.getScrollY();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    static class a implements c {
        public static ChangeQuickRedirect a;
        @NonNull
        private final AdapterView b;

        public a(@NonNull AdapterView adapterView) {
            Object[] objArr = {adapterView};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3b9ededed1251bf6c7df60268d08753a", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3b9ededed1251bf6c7df60268d08753a");
            } else {
                this.b = adapterView;
            }
        }

        @Override // com.sankuai.waimai.business.page.kingkong.future.tabfeed.view.NestedPullToRefreshView.c
        public final boolean a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff8b65fd5b972d0af8a46393a7260e58", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff8b65fd5b972d0af8a46393a7260e58")).booleanValue();
            }
            View childAt = this.b.getChildAt(0);
            if (childAt != null && this.b.getFirstVisiblePosition() == 0) {
                if (childAt.getTop() >= this.b.getPaddingTop() - 1) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.sankuai.waimai.business.page.kingkong.future.tabfeed.view.NestedPullToRefreshView.c
        public final boolean b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a14443ad358efc7398b44add810f867e", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a14443ad358efc7398b44add810f867e")).booleanValue();
            }
            View childAt = this.b.getChildAt(this.b.getChildCount() - 1);
            if (childAt != null && this.b.getLastVisiblePosition() == this.b.getCount() - 1) {
                if (childAt.getBottom() <= (this.b.getHeight() - this.b.getPaddingBottom()) + 1) {
                    return true;
                }
            }
            return false;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class d implements c {
        public static ChangeQuickRedirect a;
        private final RecyclerView b;

        @Override // com.sankuai.waimai.business.page.kingkong.future.tabfeed.view.NestedPullToRefreshView.c
        public final boolean b() {
            return false;
        }

        public d(RecyclerView recyclerView) {
            Object[] objArr = {recyclerView};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8fce88e47811bb324a44dd20f7bd9d28", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8fce88e47811bb324a44dd20f7bd9d28");
            } else {
                this.b = recyclerView;
            }
        }

        @Override // com.sankuai.waimai.business.page.kingkong.future.tabfeed.view.NestedPullToRefreshView.c
        public final boolean a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bbe6bb3c357bc36ae5659f245e2afd52", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bbe6bb3c357bc36ae5659f245e2afd52")).booleanValue();
            }
            RecyclerView recyclerView = this.b;
            Object[] objArr2 = {recyclerView};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e127ec3e9c522985921ef0b13a8a5095", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e127ec3e9c522985921ef0b13a8a5095")).booleanValue() : !recyclerView.canScrollVertically(-1);
        }
    }
}

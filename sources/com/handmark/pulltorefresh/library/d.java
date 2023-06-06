package com.handmark.pulltorefresh.library;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.view.ContextMenu;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.handmark.pulltorefresh.library.c;
import com.handmark.pulltorefresh.library.internal.LoadingView;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class d extends com.handmark.pulltorefresh.library.b<ListView> {
    protected FrameLayout c;
    private LoadingView d;
    private LoadingView e;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface b {
    }

    public d(Context context) {
        super(context);
        setDisableScrollingWhileRefreshing(false);
    }

    @Override // com.handmark.pulltorefresh.library.b, android.view.View
    public final ContextMenu.ContextMenuInfo getContextMenuInfo() {
        return ((a) getRefreshableView()).getContextMenuInfo();
    }

    @Override // com.handmark.pulltorefresh.library.c
    public final void a(String str, c.a aVar) {
        super.a(str, aVar);
        if (this.d != null && aVar.a()) {
            this.d.setPullLabel(str);
        }
        if (this.e == null || !aVar.b()) {
            return;
        }
        this.e.setPullLabel(str);
    }

    @Override // com.handmark.pulltorefresh.library.c
    public final void b(String str, c.a aVar) {
        super.b(str, aVar);
        if (this.d != null && aVar.a()) {
            this.d.setRefreshingLabel(str);
        }
        if (this.e == null || !aVar.b()) {
            return;
        }
        this.e.setRefreshingLabel(str);
    }

    @Override // com.handmark.pulltorefresh.library.c
    public final void c(String str, c.a aVar) {
        super.c(str, aVar);
        if (this.d != null && aVar.a()) {
            this.d.setReleaseLabel(str);
        }
        if (this.e == null || !aVar.b()) {
            return;
        }
        this.e.setReleaseLabel(str);
    }

    public final void setHeaderBackground(Drawable drawable) {
        this.d.setBackgroundDrawable(drawable);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.handmark.pulltorefresh.library.b, com.handmark.pulltorefresh.library.c
    public final void e() {
        LoadingView footerLayout;
        LoadingView loadingView;
        int count;
        ListAdapter adapter = ((ListView) this.b).getAdapter();
        if (!getShowViewWhileRefreshing() || adapter == null || adapter.isEmpty()) {
            super.e();
            return;
        }
        int headerHeight = getHeaderHeight();
        if (AnonymousClass1.a[getCurrentMode().ordinal()] == 1) {
            footerLayout = getFooterLayout();
            loadingView = this.e;
            count = ((ListView) this.b).getCount() - 1;
            if (((ListView) this.b).getLastVisiblePosition() != count) {
                r3 = false;
            }
        } else {
            footerLayout = getHeaderLayout();
            loadingView = this.d;
            headerHeight *= -1;
            r3 = ((ListView) this.b).getFirstVisiblePosition() == 0;
            count = 0;
        }
        footerLayout.setVisibility(0);
        if (r3 && getState() != 3) {
            ((ListView) this.b).setSelection(count);
            setHeaderScroll(headerHeight);
        }
        loadingView.setVisibility(8);
        loadingView.a();
        super.e();
    }

    /* compiled from: ProGuard */
    /* renamed from: com.handmark.pulltorefresh.library.d$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[c.a.values().length];

        static {
            try {
                a[c.a.PULL_UP_TO_REFRESH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[c.a.PULL_DOWN_TO_REFRESH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.handmark.pulltorefresh.library.b, com.handmark.pulltorefresh.library.c
    public final void setRefreshingInternal(boolean z) {
        LoadingView footerLayout;
        int count;
        LoadingView loadingView;
        int scrollY;
        ListAdapter adapter = ((ListView) this.b).getAdapter();
        if (!getShowViewWhileRefreshing() || adapter == null || adapter.isEmpty()) {
            super.setRefreshingInternal(z);
            return;
        }
        super.setRefreshingInternal(false);
        if (AnonymousClass1.a[getCurrentMode().ordinal()] == 1) {
            footerLayout = getFooterLayout();
            LoadingView loadingView2 = this.e;
            count = ((ListView) this.b).getCount() - 1;
            loadingView = loadingView2;
            scrollY = getScrollY() - getHeaderHeight();
        } else {
            footerLayout = getHeaderLayout();
            loadingView = this.d;
            scrollY = getScrollY() + getHeaderHeight();
            count = 0;
        }
        if (z) {
            setHeaderScroll(scrollY);
        }
        footerLayout.setVisibility(4);
        loadingView.setVisibility(0);
        loadingView.b();
        if (z) {
            ((ListView) this.b).setSelection(count);
            a(0);
        }
    }

    public final void setLayoutChildrenListener(b bVar) {
        T t = this.b;
        if (t == 0 || !(t instanceof a)) {
            return;
        }
        ((a) t).c = bVar;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public class a extends ListView implements com.handmark.pulltorefresh.library.internal.b {
        private boolean b;
        private b c;

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.b = false;
        }

        @Override // android.widget.ListView, android.widget.AbsListView
        protected final void layoutChildren() {
            try {
                super.layoutChildren();
            } catch (Exception e) {
                if (this.c == null) {
                    throw e;
                }
            }
        }

        @Override // android.widget.AbsListView, android.view.View
        public final void draw(Canvas canvas) {
            try {
                super.draw(canvas);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override // android.widget.AbsListView, android.view.View
        public final ContextMenu.ContextMenuInfo getContextMenuInfo() {
            return super.getContextMenuInfo();
        }

        @Override // android.widget.AdapterView
        public final void setAdapter(ListAdapter listAdapter) {
            if (!this.b) {
                addFooterView(d.this.c, null, false);
                this.b = true;
            }
            super.setAdapter(listAdapter);
        }

        @Override // android.widget.AdapterView
        public final void setEmptyView(View view) {
            d.this.setEmptyView(view);
        }

        @Override // com.handmark.pulltorefresh.library.internal.b
        public final void setEmptyViewInternal(View view) {
            super.setEmptyView(view);
        }
    }

    public final void setPullImageDrawable(Drawable drawable) {
        getHeaderLayout().setPullImageDrawable(drawable);
        this.d.setPullImageDrawable(drawable);
        j();
    }

    public final void setFrameImageBackground(Drawable drawable) {
        getHeaderLayout().setFrameImageBackground(drawable);
        this.d.setFrameImageBackground(drawable);
        j();
    }

    @Override // com.handmark.pulltorefresh.library.c
    public final void setLoadingDrawable(Drawable drawable) {
        getHeaderLayout().setLoadingDrawable(drawable);
        this.d.setLoadingDrawable(drawable);
        j();
    }

    public final void setTextColor(int i) {
        getHeaderLayout().setTextColor(i);
        this.d.setTextColor(i);
    }

    public final void setPullImageVisibility(int i) {
        getHeaderLayout().setPullImageVisibility(i);
        this.d.setPullImageVisibility(i);
    }

    public final void setFrameImageVisibility(int i) {
        getHeaderLayout().setFrameImageVisibility(i);
        this.d.setFrameImageVisibility(i);
    }

    public final void setHeaderTextVisibility(int i) {
        getHeaderLayout().setHeaderTextVisibility(i);
        this.d.setHeaderTextVisibility(i);
    }

    public final void setLoadingVisibility(int i) {
        getHeaderLayout().setLoadingVisibility(i);
        this.d.setLoadingVisibility(i);
    }

    @Override // com.handmark.pulltorefresh.library.c
    protected final LoadingView a(Context context, c.a aVar, TypedArray typedArray) {
        return new com.handmark.pulltorefresh.library.internal.a(context, aVar, typedArray);
    }

    @Override // com.handmark.pulltorefresh.library.c
    protected final /* synthetic */ View a(Context context, AttributeSet attributeSet) {
        a aVar = new a(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.ptrAdapterViewBackground, R.attr.ptrHeaderBackground, R.attr.ptrHeaderTextColor, R.attr.ptrHeaderSubTextColor, R.attr.ptrMode, R.attr.ptrShowIndicator, R.attr.ptrDrawable});
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = a(context, c.a.PULL_DOWN_TO_REFRESH, obtainStyledAttributes);
        frameLayout.addView(this.d, -1, -2);
        this.d.setVisibility(8);
        aVar.addHeaderView(frameLayout, null, false);
        this.c = new FrameLayout(context);
        this.e = a(context, c.a.PULL_UP_TO_REFRESH, obtainStyledAttributes);
        this.c.addView(this.e, -1, -2);
        this.e.setVisibility(8);
        obtainStyledAttributes.recycle();
        aVar.setId(16908298);
        return aVar;
    }
}

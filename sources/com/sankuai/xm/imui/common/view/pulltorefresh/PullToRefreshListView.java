package com.sankuai.xm.imui.common.view.pulltorefresh;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.imui.common.view.pulltorefresh.c;
import com.sankuai.xm.imui.common.view.pulltorefresh.e;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class PullToRefreshListView extends d<ListView> {
    public static ChangeQuickRedirect f;
    private com.sankuai.xm.imui.common.view.pulltorefresh.internal.c g;
    private com.sankuai.xm.imui.common.view.pulltorefresh.internal.c h;
    private FrameLayout i;
    private boolean j;

    @Override // com.sankuai.xm.imui.common.view.pulltorefresh.e
    public final /* synthetic */ View a(Context context, AttributeSet attributeSet) {
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0427edabc10cd1b4e8d2fcfd458e3308", 6917529027641081856L)) {
            return (ListView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0427edabc10cd1b4e8d2fcfd458e3308");
        }
        Object[] objArr2 = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect2 = f;
        ListView bVar = PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d836d115816cd6ed387d3e48ca347fb3", 6917529027641081856L) ? (ListView) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d836d115816cd6ed387d3e48ca347fb3") : new b(context, attributeSet);
        bVar.setId(16908298);
        return bVar;
    }

    public PullToRefreshListView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "31ccfb903943ebb304adf4a4428a17a5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "31ccfb903943ebb304adf4a4428a17a5");
        }
    }

    public PullToRefreshListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9633dd45d6426b599c1fd2abfa4c2f00", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9633dd45d6426b599c1fd2abfa4c2f00");
        }
    }

    public PullToRefreshListView(Context context, e.c cVar) {
        super(context, cVar);
        Object[] objArr = {context, cVar};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be185a71c9be6c64276294654c652497", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be185a71c9be6c64276294654c652497");
        }
    }

    public PullToRefreshListView(Context context, e.c cVar, e.a aVar) {
        super(context, cVar, aVar);
        Object[] objArr = {context, cVar, aVar};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d99d0b2e0c76d73edfcd79ef646d83c9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d99d0b2e0c76d73edfcd79ef646d83c9");
        }
    }

    public void setSelection(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c9ebc7daaedc9bb9af6adf747092bcd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c9ebc7daaedc9bb9af6adf747092bcd");
        } else {
            ((ListView) this.d).setSelection(i);
        }
    }

    public int getDividerHeight() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bda302fd67babb809e82815b6bffeed3", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bda302fd67babb809e82815b6bffeed3")).intValue() : ((ListView) this.d).getDividerHeight();
    }

    public void setTranscriptMode(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "466584b76c2c6f7c1effe04fe98e0a4f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "466584b76c2c6f7c1effe04fe98e0a4f");
        } else {
            ((ListView) this.d).setTranscriptMode(i);
        }
    }

    public void setStackFromBottom(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a01285e9b8660f6ffdf95f7fc1beb2c5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a01285e9b8660f6ffdf95f7fc1beb2c5");
        } else {
            ((ListView) this.d).setStackFromBottom(z);
        }
    }

    @Override // com.sankuai.xm.imui.common.view.pulltorefresh.e
    public final e.i getPullToRefreshScrollDirection() {
        return e.i.VERTICAL;
    }

    @Override // com.sankuai.xm.imui.common.view.pulltorefresh.d, com.sankuai.xm.imui.common.view.pulltorefresh.e
    public final void a(boolean z) {
        com.sankuai.xm.imui.common.view.pulltorefresh.internal.c footerLayout;
        com.sankuai.xm.imui.common.view.pulltorefresh.internal.c cVar;
        com.sankuai.xm.imui.common.view.pulltorefresh.internal.c cVar2;
        int count;
        int scrollY;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c1e3fb7203f13cfc55195c7cdc275252", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c1e3fb7203f13cfc55195c7cdc275252");
            return;
        }
        ListAdapter adapter = ((ListView) this.d).getAdapter();
        if (!this.j || !getShowViewWhileRefreshing() || adapter == null || adapter.isEmpty()) {
            super.a(z);
            return;
        }
        super.a(false);
        switch (getCurrentMode()) {
            case MANUAL_REFRESH_ONLY:
            case PULL_FROM_END:
                footerLayout = getFooterLayout();
                cVar = this.h;
                cVar2 = this.g;
                count = ((ListView) this.d).getCount() - 1;
                scrollY = getScrollY() - getFooterSize();
                break;
            default:
                footerLayout = getHeaderLayout();
                cVar = this.g;
                cVar2 = this.h;
                scrollY = getHeaderSize() + getScrollY();
                count = 0;
                break;
        }
        footerLayout.e();
        footerLayout.a();
        cVar2.setVisibility(8);
        cVar.setVisibility(0);
        cVar.c();
        if (z) {
            this.e = false;
            setHeaderScroll(scrollY);
            ((ListView) this.d).setSelection(count);
            a(0);
        }
    }

    @Override // com.sankuai.xm.imui.common.view.pulltorefresh.d, com.sankuai.xm.imui.common.view.pulltorefresh.e
    public final void c() {
        com.sankuai.xm.imui.common.view.pulltorefresh.internal.c footerLayout;
        com.sankuai.xm.imui.common.view.pulltorefresh.internal.c cVar;
        int count;
        int footerSize;
        boolean z = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0604507a478d0cc531d89b4b66a6cd22", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0604507a478d0cc531d89b4b66a6cd22");
        } else if (!this.j) {
            super.c();
        } else {
            switch (getCurrentMode()) {
                case MANUAL_REFRESH_ONLY:
                case PULL_FROM_END:
                    footerLayout = getFooterLayout();
                    cVar = this.h;
                    count = ((ListView) this.d).getCount() - 1;
                    footerSize = getFooterSize();
                    if (Math.abs(((ListView) this.d).getLastVisiblePosition() - count) <= 1) {
                        z = true;
                        break;
                    }
                    break;
                default:
                    footerLayout = getHeaderLayout();
                    cVar = this.g;
                    footerSize = -getHeaderSize();
                    z = Math.abs(((ListView) this.d).getFirstVisiblePosition() - 0) <= 1;
                    count = 0;
                    break;
            }
            if (cVar.getVisibility() == 0) {
                footerLayout.f();
                cVar.setVisibility(8);
                if (z && getState() != e.k.MANUAL_REFRESHING) {
                    ((ListView) this.d).setSelection(count);
                    setHeaderScroll(footerSize);
                }
            }
            super.c();
        }
    }

    @Override // com.sankuai.xm.imui.common.view.pulltorefresh.e
    public final com.sankuai.xm.imui.common.view.pulltorefresh.b b(boolean z, boolean z2) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ec651d574f82db2fcd21aff8c7c33d6", 6917529027641081856L)) {
            return (com.sankuai.xm.imui.common.view.pulltorefresh.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ec651d574f82db2fcd21aff8c7c33d6");
        }
        com.sankuai.xm.imui.common.view.pulltorefresh.b b2 = super.b(z, z2);
        if (this.j) {
            e.c mode = getMode();
            if (z && mode.c()) {
                b2.a(this.g);
            }
            if (z2 && mode.d()) {
                b2.a(this.h);
            }
        }
        return b2;
    }

    @Override // com.sankuai.xm.imui.common.view.pulltorefresh.d, com.sankuai.xm.imui.common.view.pulltorefresh.e
    public final void a(TypedArray typedArray) {
        Object[] objArr = {typedArray};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "004922c2d9b9905d77ec0d47c530ef27", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "004922c2d9b9905d77ec0d47c530ef27");
            return;
        }
        super.a(typedArray);
        this.j = typedArray.getBoolean(14, true);
        if (this.j) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2, 1);
            FrameLayout frameLayout = new FrameLayout(getContext());
            this.g = a(getContext(), e.c.PULL_FROM_START, typedArray);
            this.g.setVisibility(8);
            frameLayout.addView(this.g, layoutParams);
            ((ListView) this.d).addHeaderView(frameLayout, null, false);
            this.i = new FrameLayout(getContext());
            this.h = a(getContext(), e.c.PULL_FROM_END, typedArray);
            this.h.setVisibility(8);
            this.i.addView(this.h, layoutParams);
            if (typedArray.hasValue(13)) {
                return;
            }
            setScrollingWhileRefreshingEnabled(true);
        }
    }

    /* compiled from: ProGuard */
    @TargetApi(9)
    /* loaded from: classes6.dex */
    final class b extends a {
        public static ChangeQuickRedirect c;

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            Object[] objArr = {PullToRefreshListView.this, context, attributeSet};
            ChangeQuickRedirect changeQuickRedirect = c;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "458224ddcfd905a2dcd94a1d7ec84acb", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "458224ddcfd905a2dcd94a1d7ec84acb");
            }
        }

        @Override // android.view.View
        public final boolean overScrollBy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
            int i9;
            int i10;
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = c;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b991a88d5d633214c60d32252dcbe573", 6917529027641081856L)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b991a88d5d633214c60d32252dcbe573")).booleanValue();
            }
            int max = Math.max(-30, Math.min(30, i2));
            boolean overScrollBy = super.overScrollBy(i, max, i3, i4, i5, i6, i7, i8, z);
            PullToRefreshListView pullToRefreshListView = PullToRefreshListView.this;
            Object[] objArr2 = {pullToRefreshListView, Integer.valueOf(i), Integer.valueOf(i3), Integer.valueOf(max), Integer.valueOf(i4), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect2 = c.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "6fd0453f35b5275f3ccc1331c0f876e3", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "6fd0453f35b5275f3ccc1331c0f876e3");
            } else {
                Object[] objArr3 = {pullToRefreshListView, Integer.valueOf(i), Integer.valueOf(i3), Integer.valueOf(max), Integer.valueOf(i4), 0, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect3 = c.a;
                if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "c0a64e49dab3ad07d7e622e0a251f658", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "c0a64e49dab3ad07d7e622e0a251f658");
                } else {
                    Object[] objArr4 = {pullToRefreshListView, Integer.valueOf(i), Integer.valueOf(i3), Integer.valueOf(max), Integer.valueOf(i4), 0, 0, Float.valueOf(1.0f), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                    ChangeQuickRedirect changeQuickRedirect4 = c.a;
                    if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "0af5c205770f7ebabf6f4c09bbe6389c", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "0af5c205770f7ebabf6f4c09bbe6389c");
                    } else {
                        int[] iArr = c.AnonymousClass1.a;
                        pullToRefreshListView.getPullToRefreshScrollDirection().ordinal();
                        int scrollY = pullToRefreshListView.getScrollY();
                        if (pullToRefreshListView.h() && !pullToRefreshListView.i()) {
                            e.c mode = pullToRefreshListView.getMode();
                            if (mode.b() && !z && max != 0) {
                                int i11 = max + i4;
                                if (e.c) {
                                    StringBuilder sb = new StringBuilder("OverscrollHelper.OverScroll. DeltaX: ");
                                    sb.append(i);
                                    sb.append(", ScrollX: ");
                                    sb.append(i3);
                                    sb.append(", DeltaY: ");
                                    sb.append(max);
                                    sb.append(", ScrollY: ");
                                    sb.append(i4);
                                    sb.append(", NewY: ");
                                    sb.append(i11);
                                    sb.append(", ScrollRange: ");
                                    i9 = 0;
                                    sb.append(0);
                                    sb.append(", CurrentScroll: ");
                                    sb.append(scrollY);
                                    com.sankuai.xm.imui.common.util.d.a(sb.toString(), new Object[0]);
                                } else {
                                    i9 = 0;
                                }
                                if (i11 < 0) {
                                    if (mode.c()) {
                                        if (scrollY == 0) {
                                            pullToRefreshListView.a(e.k.OVERSCROLLING, new boolean[i9]);
                                        }
                                        pullToRefreshListView.setHeaderScroll((int) ((scrollY + i11) * 1.0f));
                                    }
                                } else if (i11 > 0) {
                                    if (mode.d()) {
                                        if (scrollY == 0) {
                                            i10 = 0;
                                            pullToRefreshListView.a(e.k.OVERSCROLLING, new boolean[0]);
                                        } else {
                                            i10 = 0;
                                        }
                                        pullToRefreshListView.setHeaderScroll((int) (((scrollY + i11) - i10) * 1.0f));
                                    }
                                } else if (Math.abs(i11) <= 0 || Math.abs(i11 - 0) <= 0) {
                                    pullToRefreshListView.a(e.k.RESET, new boolean[0]);
                                }
                            } else if (z && e.k.OVERSCROLLING == pullToRefreshListView.getState()) {
                                pullToRefreshListView.a(e.k.RESET, new boolean[0]);
                            }
                        }
                    }
                }
            }
            return overScrollBy;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public class a extends ListView implements com.sankuai.xm.imui.common.view.pulltorefresh.internal.a {
        public static ChangeQuickRedirect a;
        private boolean c;

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            Object[] objArr = {PullToRefreshListView.this, context, attributeSet};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d8c81a0fa23c31531ef3554cd8a2e2f", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d8c81a0fa23c31531ef3554cd8a2e2f");
            } else {
                this.c = false;
            }
        }

        @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
        public void dispatchDraw(Canvas canvas) {
            Object[] objArr = {canvas};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "559cb6782dcc43513d273b22dd0472fd", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "559cb6782dcc43513d273b22dd0472fd");
                return;
            }
            try {
                super.dispatchDraw(canvas);
            } catch (Exception e) {
                com.sankuai.xm.monitor.statistics.a.a("imui", "PullToRefreshListView::InternalListView::dispatchDraw", e);
                com.sankuai.xm.imui.common.util.d.a(e);
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            Object[] objArr = {motionEvent};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "942fe4dfca5231f4a71deba049df7465", 6917529027641081856L)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "942fe4dfca5231f4a71deba049df7465")).booleanValue();
            }
            try {
                return super.dispatchTouchEvent(motionEvent);
            } catch (Exception e) {
                com.sankuai.xm.monitor.statistics.a.a("imui", "PullToRefreshListView::InternalListView::dispatchTouchEvent", e);
                com.sankuai.xm.imui.common.util.d.a(e);
                return false;
            }
        }

        @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
        public void onDetachedFromWindow() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "67394ebce44699f9e9770d45672fc6a1", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "67394ebce44699f9e9770d45672fc6a1");
                return;
            }
            try {
                super.onDetachedFromWindow();
            } catch (Exception e) {
                com.sankuai.xm.imui.common.util.d.a(e);
            }
        }

        @Override // android.widget.AdapterView
        public void setAdapter(ListAdapter listAdapter) {
            Object[] objArr = {listAdapter};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "69533d6aaf2723410ee640e84911746b", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "69533d6aaf2723410ee640e84911746b");
                return;
            }
            if (PullToRefreshListView.this.i != null && !this.c) {
                addFooterView(PullToRefreshListView.this.i, null, false);
                this.c = true;
            }
            super.setAdapter(listAdapter);
        }

        @Override // android.widget.AdapterView
        public void setEmptyView(View view) {
            Object[] objArr = {view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b14914650a70427d95a816260efe09b", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b14914650a70427d95a816260efe09b");
            } else {
                PullToRefreshListView.this.setEmptyView(view);
            }
        }

        @Override // com.sankuai.xm.imui.common.view.pulltorefresh.internal.a
        public void setEmptyViewInternal(View view) {
            Object[] objArr = {view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec95f86a85d394fe23dea3733b55fcee", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec95f86a85d394fe23dea3733b55fcee");
            } else {
                super.setEmptyView(view);
            }
        }
    }
}

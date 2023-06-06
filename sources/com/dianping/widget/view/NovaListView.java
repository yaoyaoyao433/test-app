package com.dianping.widget.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ListView;
import com.dianping.judas.interfaces.c;
import com.meituan.android.common.statistics.entity.EventInfo;
import com.meituan.android.common.statistics.entity.EventName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class NovaListView extends ListView implements com.dianping.judas.interfaces.c {
    public static ChangeQuickRedirect a;
    public d b;
    private String c;
    private boolean d;
    private com.dianping.judas.b e;
    private AbsListView.OnScrollListener f;
    private AbsListView.OnScrollListener g;
    private boolean h;

    public static /* synthetic */ boolean a(NovaListView novaListView, boolean z) {
        novaListView.d = true;
        return true;
    }

    @Override // android.widget.ListView, android.view.View
    public void onFinishInflate() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b8dae44a190de2f3865cb6e34030fcd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b8dae44a190de2f3865cb6e34030fcd");
        } else {
            super.onFinishInflate();
        }
    }

    @Override // android.widget.AbsListView
    public void setOnScrollListener(AbsListView.OnScrollListener onScrollListener) {
        Object[] objArr = {onScrollListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f65766c892d71895f10e147ef364979", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f65766c892d71895f10e147ef364979");
            return;
        }
        super.setOnScrollListener(this.g);
        this.f = onScrollListener;
    }

    public NovaListView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c12a20e9dd9cce4276a0bb596433b6a0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c12a20e9dd9cce4276a0bb596433b6a0");
            return;
        }
        this.d = false;
        this.b = new d();
        this.e = new com.dianping.judas.b(this, this.b);
        this.f = null;
        this.g = new AbsListView.OnScrollListener() { // from class: com.dianping.widget.view.NovaListView.1
            public static ChangeQuickRedirect a;

            @Override // android.widget.AbsListView.OnScrollListener
            public final void onScrollStateChanged(AbsListView absListView, int i) {
                int i2 = 0;
                Object[] objArr2 = {absListView, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d32b3e6bc7eeef9660d5ee6c98ceaeba", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d32b3e6bc7eeef9660d5ee6c98ceaeba");
                    return;
                }
                switch (i) {
                    case 0:
                        int headerViewsCount = NovaListView.this.getHeaderViewsCount();
                        int firstVisiblePosition = NovaListView.this.getFirstVisiblePosition();
                        if (firstVisiblePosition < headerViewsCount) {
                            if (absListView instanceof NovaListView) {
                                ((NovaListView) absListView).a(firstVisiblePosition);
                            }
                        } else {
                            i2 = NovaListView.this.getFirstVisiblePosition() - NovaListView.this.getHeaderViewsCount();
                        }
                        a.a().a(NovaListView.this.c, i2, NovaListView.this.getLastVisiblePosition() - NovaListView.this.getHeaderViewsCount());
                        break;
                }
                if (NovaListView.this.f != null) {
                    NovaListView.this.f.onScrollStateChanged(absListView, i);
                }
            }

            @Override // android.widget.AbsListView.OnScrollListener
            public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
                Object[] objArr2 = {absListView, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c70b7fe1ed010f1030e302c93f92c965", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c70b7fe1ed010f1030e302c93f92c965");
                    return;
                }
                final int firstVisiblePosition = NovaListView.this.getFirstVisiblePosition() >= NovaListView.this.getHeaderViewsCount() ? NovaListView.this.getFirstVisiblePosition() - NovaListView.this.getHeaderViewsCount() : 0;
                final int lastVisiblePosition = NovaListView.this.getLastVisiblePosition() - NovaListView.this.getHeaderViewsCount();
                if (!NovaListView.this.d && lastVisiblePosition > 0) {
                    NovaListView.a(NovaListView.this, true);
                    NovaListView.this.postDelayed(new Runnable() { // from class: com.dianping.widget.view.NovaListView.1.1
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "696d136ef54a5f382a43cdeda2dd38b7", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "696d136ef54a5f382a43cdeda2dd38b7");
                            } else {
                                a.a().a(NovaListView.this.c, firstVisiblePosition, lastVisiblePosition);
                            }
                        }
                    }, 500L);
                }
                if (NovaListView.this.f != null) {
                    NovaListView.this.f.onScroll(absListView, i, i2, i3);
                }
            }
        };
        this.h = true;
        super.setOnScrollListener(this.g);
    }

    public NovaListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ab6aa0261b12cfe3630058720b20583c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ab6aa0261b12cfe3630058720b20583c");
            return;
        }
        this.d = false;
        this.b = new d();
        this.e = new com.dianping.judas.b(this, this.b);
        this.f = null;
        this.g = new AbsListView.OnScrollListener() { // from class: com.dianping.widget.view.NovaListView.1
            public static ChangeQuickRedirect a;

            @Override // android.widget.AbsListView.OnScrollListener
            public final void onScrollStateChanged(AbsListView absListView, int i) {
                int i2 = 0;
                Object[] objArr2 = {absListView, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d32b3e6bc7eeef9660d5ee6c98ceaeba", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d32b3e6bc7eeef9660d5ee6c98ceaeba");
                    return;
                }
                switch (i) {
                    case 0:
                        int headerViewsCount = NovaListView.this.getHeaderViewsCount();
                        int firstVisiblePosition = NovaListView.this.getFirstVisiblePosition();
                        if (firstVisiblePosition < headerViewsCount) {
                            if (absListView instanceof NovaListView) {
                                ((NovaListView) absListView).a(firstVisiblePosition);
                            }
                        } else {
                            i2 = NovaListView.this.getFirstVisiblePosition() - NovaListView.this.getHeaderViewsCount();
                        }
                        a.a().a(NovaListView.this.c, i2, NovaListView.this.getLastVisiblePosition() - NovaListView.this.getHeaderViewsCount());
                        break;
                }
                if (NovaListView.this.f != null) {
                    NovaListView.this.f.onScrollStateChanged(absListView, i);
                }
            }

            @Override // android.widget.AbsListView.OnScrollListener
            public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
                Object[] objArr2 = {absListView, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c70b7fe1ed010f1030e302c93f92c965", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c70b7fe1ed010f1030e302c93f92c965");
                    return;
                }
                final int firstVisiblePosition = NovaListView.this.getFirstVisiblePosition() >= NovaListView.this.getHeaderViewsCount() ? NovaListView.this.getFirstVisiblePosition() - NovaListView.this.getHeaderViewsCount() : 0;
                final int lastVisiblePosition = NovaListView.this.getLastVisiblePosition() - NovaListView.this.getHeaderViewsCount();
                if (!NovaListView.this.d && lastVisiblePosition > 0) {
                    NovaListView.a(NovaListView.this, true);
                    NovaListView.this.postDelayed(new Runnable() { // from class: com.dianping.widget.view.NovaListView.1.1
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "696d136ef54a5f382a43cdeda2dd38b7", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "696d136ef54a5f382a43cdeda2dd38b7");
                            } else {
                                a.a().a(NovaListView.this.c, firstVisiblePosition, lastVisiblePosition);
                            }
                        }
                    }, 500L);
                }
                if (NovaListView.this.f != null) {
                    NovaListView.this.f.onScroll(absListView, i, i2, i3);
                }
            }
        };
        this.h = true;
        super.setOnScrollListener(this.g);
        a(context, attributeSet);
    }

    public NovaListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d57f5000ec42ced3bbc1fba982edd7de", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d57f5000ec42ced3bbc1fba982edd7de");
            return;
        }
        this.d = false;
        this.b = new d();
        this.e = new com.dianping.judas.b(this, this.b);
        this.f = null;
        this.g = new AbsListView.OnScrollListener() { // from class: com.dianping.widget.view.NovaListView.1
            public static ChangeQuickRedirect a;

            @Override // android.widget.AbsListView.OnScrollListener
            public final void onScrollStateChanged(AbsListView absListView, int i2) {
                int i22 = 0;
                Object[] objArr2 = {absListView, Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d32b3e6bc7eeef9660d5ee6c98ceaeba", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d32b3e6bc7eeef9660d5ee6c98ceaeba");
                    return;
                }
                switch (i2) {
                    case 0:
                        int headerViewsCount = NovaListView.this.getHeaderViewsCount();
                        int firstVisiblePosition = NovaListView.this.getFirstVisiblePosition();
                        if (firstVisiblePosition < headerViewsCount) {
                            if (absListView instanceof NovaListView) {
                                ((NovaListView) absListView).a(firstVisiblePosition);
                            }
                        } else {
                            i22 = NovaListView.this.getFirstVisiblePosition() - NovaListView.this.getHeaderViewsCount();
                        }
                        a.a().a(NovaListView.this.c, i22, NovaListView.this.getLastVisiblePosition() - NovaListView.this.getHeaderViewsCount());
                        break;
                }
                if (NovaListView.this.f != null) {
                    NovaListView.this.f.onScrollStateChanged(absListView, i2);
                }
            }

            @Override // android.widget.AbsListView.OnScrollListener
            public final void onScroll(AbsListView absListView, int i2, int i22, int i3) {
                Object[] objArr2 = {absListView, Integer.valueOf(i2), Integer.valueOf(i22), Integer.valueOf(i3)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c70b7fe1ed010f1030e302c93f92c965", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c70b7fe1ed010f1030e302c93f92c965");
                    return;
                }
                final int firstVisiblePosition = NovaListView.this.getFirstVisiblePosition() >= NovaListView.this.getHeaderViewsCount() ? NovaListView.this.getFirstVisiblePosition() - NovaListView.this.getHeaderViewsCount() : 0;
                final int lastVisiblePosition = NovaListView.this.getLastVisiblePosition() - NovaListView.this.getHeaderViewsCount();
                if (!NovaListView.this.d && lastVisiblePosition > 0) {
                    NovaListView.a(NovaListView.this, true);
                    NovaListView.this.postDelayed(new Runnable() { // from class: com.dianping.widget.view.NovaListView.1.1
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "696d136ef54a5f382a43cdeda2dd38b7", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "696d136ef54a5f382a43cdeda2dd38b7");
                            } else {
                                a.a().a(NovaListView.this.c, firstVisiblePosition, lastVisiblePosition);
                            }
                        }
                    }, 500L);
                }
                if (NovaListView.this.f != null) {
                    NovaListView.this.f.onScroll(absListView, i2, i22, i3);
                }
            }
        };
        this.h = true;
        super.setOnScrollListener(this.g);
        a(context, attributeSet);
    }

    private void a(Context context, AttributeSet attributeSet) {
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "205effc9c9e8a399beeadeb6c14311ba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "205effc9c9e8a399beeadeb6c14311ba");
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.exposeBlockId});
        this.c = obtainStyledAttributes.getString(0);
        obtainStyledAttributes.recycle();
    }

    @Override // android.widget.AbsListView, android.widget.AdapterView
    public boolean performItemClick(View view, int i, long j) {
        Object[] objArr = {view, Integer.valueOf(i), new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a9508562b69bb8074462e7c495082589", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a9508562b69bb8074462e7c495082589")).booleanValue();
        }
        if (super.performItemClick(view, i, j)) {
            if (view instanceof com.dianping.judas.interfaces.c) {
                com.dianping.judas.interfaces.c cVar = (com.dianping.judas.interfaces.c) view;
                if (cVar.b(c.a.CLICK) == null && b(c.a.CLICK) != null) {
                    cVar.a(b(c.a.CLICK), c.a.CLICK);
                }
                if (cVar.a(c.a.CLICK) == null && a(c.a.CLICK) != null) {
                    cVar.a(a(c.a.CLICK), c.a.CLICK);
                }
            }
            if (com.dianping.judas.util.b.a(view) == Integer.MAX_VALUE) {
                a.a().a(view, i, "click", EventName.MGE);
            } else {
                a.a().a(view, "click", EventName.MGE);
            }
            return true;
        }
        return false;
    }

    public void setGAString(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "09d6ac3fc13103a7c509327cef51fea4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "09d6ac3fc13103a7c509327cef51fea4");
        } else {
            this.e.b = str;
        }
    }

    @Override // com.dianping.judas.interfaces.c
    public String getGAString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c0d27eec7c000165e8d5e7ceb826809e", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c0d27eec7c000165e8d5e7ceb826809e") : this.e.getGAString();
    }

    @Override // com.dianping.judas.interfaces.c
    public d getGAUserInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e680a4e78a7e6e47e9998da48f516ff5", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e680a4e78a7e6e47e9998da48f516ff5") : this.e.getGAUserInfo();
    }

    @Override // com.dianping.judas.interfaces.c
    public final void a(String str, c.a aVar) {
        Object[] objArr = {str, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e347b743fecca523aeb25dded1d3dbf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e347b743fecca523aeb25dded1d3dbf");
        } else {
            this.e.a(str, aVar);
        }
    }

    @Override // com.dianping.judas.interfaces.c
    public final String a(c.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c61de8d89a7ebcd906477305d6547f0", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c61de8d89a7ebcd906477305d6547f0") : this.e.a(aVar);
    }

    @Override // com.dianping.judas.interfaces.c
    public final void a(EventInfo eventInfo, c.a aVar) {
        Object[] objArr = {eventInfo, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8899ff4136f05a67e5e444f7516a5a5d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8899ff4136f05a67e5e444f7516a5a5d");
        } else {
            this.e.a(eventInfo, aVar);
        }
    }

    @Override // com.dianping.judas.interfaces.c
    public final EventInfo b(c.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "920a848546d4a6581ff68e81d74c9478", RobustBitConfig.DEFAULT_VALUE) ? (EventInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "920a848546d4a6581ff68e81d74c9478") : this.e.b(aVar);
    }

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b2722e51970cbee5d3bfd2cb5f5cf164", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b2722e51970cbee5d3bfd2cb5f5cf164");
        } else if (i >= 0) {
            while (i < getHeaderViewsCount()) {
                if (getChildAt(i) instanceof com.dianping.judas.interfaces.d) {
                    ((com.dianping.judas.interfaces.d) getChildAt(i)).a(this);
                }
                i++;
            }
        }
    }

    public void setExposeBlockId(String str) {
        this.c = str;
    }

    public void setIsVisibleToUser(boolean z) {
        this.h = z;
    }
}

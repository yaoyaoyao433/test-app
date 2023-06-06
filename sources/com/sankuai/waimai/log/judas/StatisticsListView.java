package com.sankuai.waimai.log.judas;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ListView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.ah;
import com.sankuai.waimai.log.judas.f;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class StatisticsListView extends ListView {
    public static ChangeQuickRedirect a;
    public f b;
    public boolean c;
    private AbsListView.OnScrollListener d;
    private AbsListView.OnScrollListener e;
    private f.a f;

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View
    public void onMeasure(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "455ba5e61aa040f4a576062217e258c6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "455ba5e61aa040f4a576062217e258c6");
            return;
        }
        this.c = true;
        super.onMeasure(i, i2);
    }

    @Override // android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d69a1c8bebe068feeb00c3787a944d71", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d69a1c8bebe068feeb00c3787a944d71");
            return;
        }
        this.c = false;
        super.onLayout(z, i, i2, i3, i4);
    }

    public StatisticsListView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd566fe87a9f7ec33417f60a315e8993", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd566fe87a9f7ec33417f60a315e8993");
            return;
        }
        this.b = new f();
        this.d = null;
        this.e = new AbsListView.OnScrollListener() { // from class: com.sankuai.waimai.log.judas.StatisticsListView.1
            public static ChangeQuickRedirect a;

            @Override // android.widget.AbsListView.OnScrollListener
            public final void onScrollStateChanged(AbsListView absListView, int i) {
                Object[] objArr2 = {absListView, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "22e4ef59262c72ad2fb415b6ddf06496", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "22e4ef59262c72ad2fb415b6ddf06496");
                    return;
                }
                switch (i) {
                    case 0:
                        StatisticsListView.this.b.c();
                        break;
                }
                if (StatisticsListView.this.d != null) {
                    StatisticsListView.this.d.onScrollStateChanged(absListView, i);
                }
            }

            @Override // android.widget.AbsListView.OnScrollListener
            public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
                Object[] objArr2 = {absListView, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "13bbd70092a4b677e702e3c125f626ed", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "13bbd70092a4b677e702e3c125f626ed");
                    return;
                }
                int firstVisiblePosition = StatisticsListView.this.getFirstVisiblePosition() >= StatisticsListView.this.getHeaderViewsCount() ? StatisticsListView.this.getFirstVisiblePosition() - StatisticsListView.this.getHeaderViewsCount() : 0;
                int lastVisiblePosition = StatisticsListView.this.getLastVisiblePosition() - StatisticsListView.this.getHeaderViewsCount();
                StatisticsListView.this.b.b = firstVisiblePosition;
                StatisticsListView.this.b.c = lastVisiblePosition;
                if (StatisticsListView.this.d != null) {
                    StatisticsListView.this.d.onScroll(absListView, i, i2, i3);
                }
                if (StatisticsListView.this.b.d) {
                    StatisticsListView.this.a();
                    StatisticsListView.this.b.d = false;
                }
            }
        };
        this.f = new f.a() { // from class: com.sankuai.waimai.log.judas.StatisticsListView.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.log.judas.f.a
            public final boolean a(int i) {
                Object[] objArr2 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "03bdd0746aa8772ae0a8a8f52246d7a3", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "03bdd0746aa8772ae0a8a8f52246d7a3")).booleanValue();
                }
                View childAt = StatisticsListView.this.getChildAt((i + StatisticsListView.this.getHeaderViewsCount()) - StatisticsListView.this.getFirstVisiblePosition());
                return childAt != null && childAt.getVisibility() == 0 && ah.b(childAt);
            }
        };
        super.setOnScrollListener(this.e);
        this.b.f = this.f;
    }

    public StatisticsListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a3f3831a4b2f21725b5edf15456da040", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a3f3831a4b2f21725b5edf15456da040");
            return;
        }
        this.b = new f();
        this.d = null;
        this.e = new AbsListView.OnScrollListener() { // from class: com.sankuai.waimai.log.judas.StatisticsListView.1
            public static ChangeQuickRedirect a;

            @Override // android.widget.AbsListView.OnScrollListener
            public final void onScrollStateChanged(AbsListView absListView, int i) {
                Object[] objArr2 = {absListView, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "22e4ef59262c72ad2fb415b6ddf06496", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "22e4ef59262c72ad2fb415b6ddf06496");
                    return;
                }
                switch (i) {
                    case 0:
                        StatisticsListView.this.b.c();
                        break;
                }
                if (StatisticsListView.this.d != null) {
                    StatisticsListView.this.d.onScrollStateChanged(absListView, i);
                }
            }

            @Override // android.widget.AbsListView.OnScrollListener
            public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
                Object[] objArr2 = {absListView, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "13bbd70092a4b677e702e3c125f626ed", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "13bbd70092a4b677e702e3c125f626ed");
                    return;
                }
                int firstVisiblePosition = StatisticsListView.this.getFirstVisiblePosition() >= StatisticsListView.this.getHeaderViewsCount() ? StatisticsListView.this.getFirstVisiblePosition() - StatisticsListView.this.getHeaderViewsCount() : 0;
                int lastVisiblePosition = StatisticsListView.this.getLastVisiblePosition() - StatisticsListView.this.getHeaderViewsCount();
                StatisticsListView.this.b.b = firstVisiblePosition;
                StatisticsListView.this.b.c = lastVisiblePosition;
                if (StatisticsListView.this.d != null) {
                    StatisticsListView.this.d.onScroll(absListView, i, i2, i3);
                }
                if (StatisticsListView.this.b.d) {
                    StatisticsListView.this.a();
                    StatisticsListView.this.b.d = false;
                }
            }
        };
        this.f = new f.a() { // from class: com.sankuai.waimai.log.judas.StatisticsListView.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.log.judas.f.a
            public final boolean a(int i) {
                Object[] objArr2 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "03bdd0746aa8772ae0a8a8f52246d7a3", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "03bdd0746aa8772ae0a8a8f52246d7a3")).booleanValue();
                }
                View childAt = StatisticsListView.this.getChildAt((i + StatisticsListView.this.getHeaderViewsCount()) - StatisticsListView.this.getFirstVisiblePosition());
                return childAt != null && childAt.getVisibility() == 0 && ah.b(childAt);
            }
        };
        super.setOnScrollListener(this.e);
        this.b.f = this.f;
    }

    public StatisticsListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e014396f58a9cac93bf4fbdf91f872a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e014396f58a9cac93bf4fbdf91f872a");
            return;
        }
        this.b = new f();
        this.d = null;
        this.e = new AbsListView.OnScrollListener() { // from class: com.sankuai.waimai.log.judas.StatisticsListView.1
            public static ChangeQuickRedirect a;

            @Override // android.widget.AbsListView.OnScrollListener
            public final void onScrollStateChanged(AbsListView absListView, int i2) {
                Object[] objArr2 = {absListView, Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "22e4ef59262c72ad2fb415b6ddf06496", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "22e4ef59262c72ad2fb415b6ddf06496");
                    return;
                }
                switch (i2) {
                    case 0:
                        StatisticsListView.this.b.c();
                        break;
                }
                if (StatisticsListView.this.d != null) {
                    StatisticsListView.this.d.onScrollStateChanged(absListView, i2);
                }
            }

            @Override // android.widget.AbsListView.OnScrollListener
            public final void onScroll(AbsListView absListView, int i2, int i22, int i3) {
                Object[] objArr2 = {absListView, Integer.valueOf(i2), Integer.valueOf(i22), Integer.valueOf(i3)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "13bbd70092a4b677e702e3c125f626ed", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "13bbd70092a4b677e702e3c125f626ed");
                    return;
                }
                int firstVisiblePosition = StatisticsListView.this.getFirstVisiblePosition() >= StatisticsListView.this.getHeaderViewsCount() ? StatisticsListView.this.getFirstVisiblePosition() - StatisticsListView.this.getHeaderViewsCount() : 0;
                int lastVisiblePosition = StatisticsListView.this.getLastVisiblePosition() - StatisticsListView.this.getHeaderViewsCount();
                StatisticsListView.this.b.b = firstVisiblePosition;
                StatisticsListView.this.b.c = lastVisiblePosition;
                if (StatisticsListView.this.d != null) {
                    StatisticsListView.this.d.onScroll(absListView, i2, i22, i3);
                }
                if (StatisticsListView.this.b.d) {
                    StatisticsListView.this.a();
                    StatisticsListView.this.b.d = false;
                }
            }
        };
        this.f = new f.a() { // from class: com.sankuai.waimai.log.judas.StatisticsListView.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.log.judas.f.a
            public final boolean a(int i2) {
                Object[] objArr2 = {Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "03bdd0746aa8772ae0a8a8f52246d7a3", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "03bdd0746aa8772ae0a8a8f52246d7a3")).booleanValue();
                }
                View childAt = StatisticsListView.this.getChildAt((i2 + StatisticsListView.this.getHeaderViewsCount()) - StatisticsListView.this.getFirstVisiblePosition());
                return childAt != null && childAt.getVisibility() == 0 && ah.b(childAt);
            }
        };
        super.setOnScrollListener(this.e);
        this.b.f = this.f;
    }

    @Override // android.widget.ListView, android.view.View
    public void onFinishInflate() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "361ae4ecc5c206ff3f6e50b4e61307ce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "361ae4ecc5c206ff3f6e50b4e61307ce");
        } else {
            super.onFinishInflate();
        }
    }

    @Override // android.widget.AbsListView
    public void setOnScrollListener(AbsListView.OnScrollListener onScrollListener) {
        Object[] objArr = {onScrollListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "452dc2eba1c3f021ab66c10b3cbaa3d5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "452dc2eba1c3f021ab66c10b3cbaa3d5");
            return;
        }
        super.setOnScrollListener(this.e);
        this.d = onScrollListener;
    }

    @Override // android.widget.AbsListView, android.widget.AdapterView
    public boolean performItemClick(View view, int i, long j) {
        Object[] objArr = {view, Integer.valueOf(i), new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b384dbe4b31efca25f599a5e25a9d913", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b384dbe4b31efca25f599a5e25a9d913")).booleanValue();
        }
        if (super.performItemClick(view, i, j)) {
            this.b.a(i - getHeaderViewsCount());
            return true;
        }
        return false;
    }

    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "57f4a65fcbecbf70c0014c11ada9bea6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "57f4a65fcbecbf70c0014c11ada9bea6");
        } else {
            this.b.b();
        }
    }

    public void setOnLogReportListener(f.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "301c7b5f7b0029166945d95328c6edae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "301c7b5f7b0029166945d95328c6edae");
        } else {
            this.b.e = bVar;
        }
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a5e282cd802d9d6b3d24f7c5f6a8f4a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a5e282cd802d9d6b3d24f7c5f6a8f4a");
            return;
        }
        try {
            super.dispatchDraw(canvas);
        } catch (IndexOutOfBoundsException e) {
            com.sankuai.waimai.foundation.utils.log.a.b(e);
        }
    }

    public void setInitReport(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b97cee970020021a578417b010ed4313", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b97cee970020021a578417b010ed4313");
        } else if (this.b != null) {
            this.b.d = z;
        }
    }
}

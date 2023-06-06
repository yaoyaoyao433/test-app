package com.sankuai.waimai.business.page.kingkong.future.tabfeed.view;

import android.annotation.SuppressLint;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.utils.c;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public RecyclerView b;
    protected int c;
    protected int d;
    public InterfaceC0810a e;
    @SuppressLint({"UseSparseArrays"})
    private SparseArray<Integer> f;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.business.page.kingkong.future.tabfeed.view.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public interface InterfaceC0810a {
        void a(int i);
    }

    public static /* synthetic */ void a(a aVar) {
        int i;
        int i2;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "ac974b8efd9f5ad6b3b63ffd726f0987", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "ac974b8efd9f5ad6b3b63ffd726f0987");
        } else if (aVar.b != null && aVar.b.getChildCount() > 0 && (aVar.b.getLayoutManager() instanceof LinearLayoutManager)) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) aVar.b.getLayoutManager();
            int findLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
            for (int findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition(); findFirstVisibleItemPosition <= findLastVisibleItemPosition; findFirstVisibleItemPosition++) {
                View findViewByPosition = linearLayoutManager.findViewByPosition(findFirstVisibleItemPosition);
                if (findViewByPosition == null) {
                    return;
                }
                ViewGroup.LayoutParams layoutParams = findViewByPosition.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i2 = marginLayoutParams.topMargin;
                    i = marginLayoutParams.bottomMargin;
                } else {
                    i = 0;
                    i2 = 0;
                }
                aVar.f.put(findFirstVisibleItemPosition, Integer.valueOf(i2 + i + findViewByPosition.getHeight()));
            }
        }
    }

    public a(RecyclerView recyclerView) {
        Object[] objArr = {recyclerView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b8a878fd9fc2be7c16f63a1a5a0189c6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b8a878fd9fc2be7c16f63a1a5a0189c6");
            return;
        }
        this.c = 0;
        this.d = 0;
        this.f = new SparseArray<>();
        this.b = recyclerView;
        if (this.b == null) {
            return;
        }
        this.b.addOnScrollListener(new RecyclerView.k() { // from class: com.sankuai.waimai.business.page.kingkong.future.tabfeed.view.a.1
            public static ChangeQuickRedirect a;

            @Override // android.support.v7.widget.RecyclerView.k
            public final void onScrollStateChanged(RecyclerView recyclerView2, int i) {
                Object[] objArr2 = {recyclerView2, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6b8a9d82f592d2837048a57e475aebfd", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6b8a9d82f592d2837048a57e475aebfd");
                } else {
                    super.onScrollStateChanged(recyclerView2, i);
                }
            }

            @Override // android.support.v7.widget.RecyclerView.k
            public final void onScrolled(RecyclerView recyclerView2, int i, int i2) {
                Object[] objArr2 = {recyclerView2, Integer.valueOf(i), Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b6394f71ebd4e4016fa50b2283c44110", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b6394f71ebd4e4016fa50b2283c44110");
                    return;
                }
                super.onScrolled(recyclerView2, i, i2);
                a.a(a.this);
                a.this.c = a.this.b();
                if (a.this.c < 0) {
                    a.this.c = 0;
                    a.this.d = 0;
                }
                a.this.a(a.this.c, a.this.d);
                a.this.d = a.this.c;
            }
        });
    }

    public final void a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "49963ba920c126a866b3d57052ad0e35", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "49963ba920c126a866b3d57052ad0e35");
        } else if (this.b == null || this.e == null) {
        } else {
            this.e.a(i);
        }
    }

    public final void b(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "02b7ad8dfaaea372b028b08a80776561", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "02b7ad8dfaaea372b028b08a80776561");
        } else if (this.b != null && (this.b.getLayoutManager() instanceof LinearLayoutManager)) {
            ((LinearLayoutManager) this.b.getLayoutManager()).scrollToPositionWithOffset(i, i2);
            a();
        }
    }

    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "02401b4ff763cdbfa20c6cea3e3748d3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "02401b4ff763cdbfa20c6cea3e3748d3");
        } else if (this.b == null) {
        } else {
            c.a(this.b, new Runnable() { // from class: com.sankuai.waimai.business.page.kingkong.future.tabfeed.view.a.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c81222996d087b3f755ec2c631832a0e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c81222996d087b3f755ec2c631832a0e");
                        return;
                    }
                    a.this.c = a.this.b();
                    a.this.a(a.this.c, a.this.d);
                    a.this.d = a.this.c;
                }
            }, null);
        }
    }

    public final int b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c1d399981d785dd980d40e231f59c939", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c1d399981d785dd980d40e231f59c939")).intValue();
        }
        if (this.b != null && this.b.getChildCount() != 0 && (this.b.getLayoutManager() instanceof LinearLayoutManager) && this.f.size() > 0) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.b.getLayoutManager();
            try {
                int findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
                int i = -((int) linearLayoutManager.findViewByPosition(findFirstVisibleItemPosition).getY());
                for (int i2 = 0; i2 < findFirstVisibleItemPosition; i2++) {
                    i += this.f.indexOfKey(i2) < 0 ? 0 : this.f.get(i2).intValue();
                }
                return i;
            } catch (Exception unused) {
                return 0;
            }
        }
        return 0;
    }
}

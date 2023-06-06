package com.sankuai.xm.imui.common.widget;

import android.widget.ListView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.trace.j;
import com.sankuai.xm.imui.common.widget.ListViewWidgetPanel;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public abstract class a<D> extends b<ListViewWidgetPanel.a<D>> {
    public static ChangeQuickRedirect a;
    public int b;

    public void a(ListViewWidgetPanel.b<D> bVar) {
    }

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bef54b78b79a8005862e4af13093bcf1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bef54b78b79a8005862e4af13093bcf1");
        } else {
            this.b = 30;
        }
    }

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b36e8fad79e7ec30c777fba3283d5c9d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b36e8fad79e7ec30c777fba3283d5c9d");
            return;
        }
        if (i > this.b) {
            i = this.b;
        }
        if (this.h != 0) {
            ((ListViewWidgetPanel.a) this.h).a(i);
        }
    }

    public final int c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5aa3708f4ce2e84bb0403f0d50c7f47e", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5aa3708f4ce2e84bb0403f0d50c7f47e")).intValue();
        }
        if (e() != null) {
            return e().getFirstVisiblePosition() - e().getHeaderViewsCount();
        }
        return 0;
    }

    public final int d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e4db68ca8b7e7a2754cde0adf8675675", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e4db68ca8b7e7a2754cde0adf8675675")).intValue();
        }
        if (e() != null) {
            return e().getLastVisiblePosition() - e().getHeaderViewsCount();
        }
        return 0;
    }

    public final void b(final int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bdd3a9634d5de349a1937b1cccb1d8be", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bdd3a9634d5de349a1937b1cccb1d8be");
        } else if (e() != null) {
            e().post(j.a(new Runnable() { // from class: com.sankuai.xm.imui.common.widget.a.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c4a744256657772e2293eacec8e566df", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c4a744256657772e2293eacec8e566df");
                    } else {
                        a.this.e().setSelection(i);
                    }
                }
            }));
        }
    }

    public final int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7b1ebb837905a93f842de28adfc1d954", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7b1ebb837905a93f842de28adfc1d954")).intValue() : com.sankuai.xm.base.util.b.b(((ListViewWidgetPanel.a) this.h).b());
    }

    public final boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "84c4a775256622f755634385fb8db72b", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "84c4a775256622f755634385fb8db72b")).booleanValue() : this.h != 0 && com.sankuai.xm.base.util.b.b(((ListViewWidgetPanel.a) this.h).b()) > 0;
    }

    ListView e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "929dc07ac3c608f4552da90229df330f", 6917529027641081856L)) {
            return (ListView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "929dc07ac3c608f4552da90229df330f");
        }
        if (this.h == 0) {
            return null;
        }
        ListView a2 = ((ListViewWidgetPanel.a) this.h).a();
        if (a2 instanceof ListView) {
            return a2;
        }
        return null;
    }
}

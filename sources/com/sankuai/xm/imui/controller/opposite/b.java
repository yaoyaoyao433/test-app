package com.sankuai.xm.imui.controller.opposite;

import android.view.View;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.WrapperListAdapter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.trace.annotation.Trace;
import com.sankuai.xm.base.trace.i;
import com.sankuai.xm.base.trace.j;
import com.sankuai.xm.base.util.b;
import com.sankuai.xm.im.IMClient;
import com.sankuai.xm.imui.common.widget.ListViewWidgetPanel;
import com.sankuai.xm.imui.session.view.BaseCommonView;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public abstract class b implements IMClient.d {
    public static ChangeQuickRedirect b;
    ListViewWidgetPanel.a<com.sankuai.xm.imui.session.entity.b> c;

    @Override // com.sankuai.xm.im.IMClient.d
    public final void a(int i) {
    }

    @Override // com.sankuai.xm.im.IMClient.d
    public final void a(long j, int i) {
    }

    @Override // com.sankuai.xm.im.IMClient.d
    public void a(long j, String str, String str2, String str3) {
    }

    @Override // com.sankuai.xm.im.IMClient.d
    public final void a(com.sankuai.xm.im.connection.b bVar) {
    }

    public void a(ListViewWidgetPanel.b<com.sankuai.xm.imui.session.entity.b> bVar) {
    }

    @Override // com.sankuai.xm.im.IMClient.d
    public final void a(boolean z) {
    }

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "55eadeb8d983b894f6b0cefa59ea2cf5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "55eadeb8d983b894f6b0cefa59ea2cf5");
        } else {
            this.c = null;
        }
    }

    public void a(ListViewWidgetPanel.a<com.sankuai.xm.imui.session.entity.b> aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "89e3ccca9468eaf2a8faa9699c5bc8d4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "89e3ccca9468eaf2a8faa9699c5bc8d4");
            return;
        }
        this.c = aVar;
        IMClient.a().a(this);
    }

    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "206249cf9f2b5da17bd06668fe22da78", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "206249cf9f2b5da17bd06668fe22da78");
        } else {
            IMClient.a().b(this);
        }
    }

    public final List<com.sankuai.xm.imui.session.entity.b> c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1baa99221c3d6caa081d55daabd141a0", 6917529027641081856L)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1baa99221c3d6caa081d55daabd141a0");
        }
        ArrayList arrayList = new ArrayList();
        ListView a = this.c.a();
        int childCount = a.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = a.getChildAt(i);
            if (childAt instanceof BaseCommonView) {
                arrayList.add(((BaseCommonView) childAt).getMessage());
            }
        }
        return arrayList;
    }

    @Trace(name = "update_ui", type = i.end)
    public final void a(final List<com.sankuai.xm.imui.session.entity.b> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "17de487955ac4616fa79b6241fd504b9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "17de487955ac4616fa79b6241fd504b9");
            return;
        }
        try {
            j.a(i.end, "update_ui", (String[]) null, new Object[]{list});
            com.sankuai.xm.threadpool.scheduler.a.b().a(j.a(new Runnable() { // from class: com.sankuai.xm.imui.controller.opposite.b.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "45c5b21a60eecce56a03a91ae377cf1c", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "45c5b21a60eecce56a03a91ae377cf1c");
                    } else if (b.this.c == null) {
                    } else {
                        ListViewWidgetPanel.a<com.sankuai.xm.imui.session.entity.b> aVar = b.this.c;
                        ListViewWidgetPanel.c<com.sankuai.xm.imui.session.entity.b> cVar = new ListViewWidgetPanel.c<>(1);
                        cVar.c = list;
                        aVar.a(cVar);
                    }
                }
            }));
            j.a((Object) null);
        } catch (Throwable th) {
            j.a(th);
            throw th;
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f5149c7fc3a9d09f3beb9ca740605803", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f5149c7fc3a9d09f3beb9ca740605803");
            return;
        }
        final ListAdapter adapter = this.c.a().getAdapter();
        if (adapter instanceof WrapperListAdapter) {
            com.sankuai.xm.threadpool.scheduler.a.b().a(j.a(new Runnable() { // from class: com.sankuai.xm.imui.controller.opposite.b.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2dd2ff0f59122188c504b7ffd3092718", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2dd2ff0f59122188c504b7ffd3092718");
                    } else {
                        ((BaseAdapter) ((WrapperListAdapter) adapter).getWrappedAdapter()).notifyDataSetChanged();
                    }
                }
            }));
        }
    }

    public final void a(b.a<BaseCommonView> aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "70eef2ff91d431a6c6d80b198d48f949", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "70eef2ff91d431a6c6d80b198d48f949");
            return;
        }
        ListView a = this.c.a();
        int childCount = a.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = a.getChildAt(i);
            if (childAt instanceof BaseCommonView) {
                aVar.a((BaseCommonView) childAt);
            }
        }
    }
}

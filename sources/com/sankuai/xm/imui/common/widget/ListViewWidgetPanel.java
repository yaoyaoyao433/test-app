package com.sankuai.xm.imui.common.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ListView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.imui.common.widget.WidgetPanel;
import com.sankuai.xm.imui.session.widget.j;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class ListViewWidgetPanel<D> extends WidgetPanel<com.sankuai.xm.imui.common.widget.b> {
    public static ChangeQuickRedirect a;

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface a<D> extends j {
        ListView a();

        void a(int i);

        void a(c<D> cVar);

        List<D> b();
    }

    public ListViewWidgetPanel(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7864a4de6cc00df4bc76ad749414e7f5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7864a4de6cc00df4bc76ad749414e7f5");
        }
    }

    public ListViewWidgetPanel(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "162233ab8e5ac70d4761abc994dda9c7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "162233ab8e5ac70d4761abc994dda9c7");
        }
    }

    public ListViewWidgetPanel(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff0e588ad8f98612db1a1ae1db6f186d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff0e588ad8f98612db1a1ae1db6f186d");
        }
    }

    public final void a(b<D> bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ab2f3c7e51b0ea1e45120ecbd90225e1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ab2f3c7e51b0ea1e45120ecbd90225e1");
            return;
        }
        for (com.sankuai.xm.imui.common.widget.b bVar2 : getInstalledWidgets()) {
            if (bVar2 instanceof com.sankuai.xm.imui.common.widget.a) {
                ((com.sankuai.xm.imui.common.widget.a) bVar2).a(bVar);
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class b<D> extends WidgetPanel.a {
        public static ChangeQuickRedirect a;
        public List<D> b;

        public b(int i) {
            super(i);
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "abe49c3750954296411a43708b5b5392", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "abe49c3750954296411a43708b5b5392");
            }
        }

        public b<D> a(List<D> list) {
            this.b = list;
            return this;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class c<D> {
        public static ChangeQuickRedirect a;
        public int b;
        public List<D> c;
        private Map<String, Object> d;

        public c(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c855a7aa7661f66cf97d894c87ba61e3", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c855a7aa7661f66cf97d894c87ba61e3");
                return;
            }
            this.d = new HashMap();
            this.b = i;
        }
    }
}

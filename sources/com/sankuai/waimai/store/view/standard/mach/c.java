package com.sankuai.waimai.store.view.standard.mach;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.component.scroller.ScrollerContainer;
import com.sankuai.waimai.mach.utils.e;
import com.sankuai.waimai.store.config.i;
import com.sankuai.waimai.store.newwidgets.list.o;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class c extends com.sankuai.waimai.mach.component.scroller.b {
    public static ChangeQuickRedirect c;
    boolean d;
    private com.sankuai.waimai.mach.expose.c e;

    public static /* synthetic */ List a(c cVar, com.sankuai.waimai.mach.node.a aVar) {
        List<com.sankuai.waimai.mach.node.a> b;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "3df9b70907f24c9b39baafc367cfe7cc", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "3df9b70907f24c9b39baafc367cfe7cc");
        }
        ArrayList arrayList = new ArrayList();
        if (aVar != null && aVar.j() && (b = aVar.b()) != null) {
            for (int i = 0; i < b.size(); i++) {
                com.sankuai.waimai.mach.node.a aVar2 = aVar.b().get(i);
                if (aVar2 != null) {
                    arrayList.add(aVar2);
                }
            }
        }
        return arrayList;
    }

    @Override // com.sankuai.waimai.mach.component.scroller.b, com.sankuai.waimai.mach.component.base.a
    /* renamed from: a */
    public final ScrollerContainer b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc2495a347f2fa7105066e60aecd4257", RobustBitConfig.DEFAULT_VALUE)) {
            return (ScrollerContainer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc2495a347f2fa7105066e60aecd4257");
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = o.a;
        final boolean booleanValue = PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "ee96d7982b326ba06171a7baa5859abc", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "ee96d7982b326ba06171a7baa5859abc")).booleanValue() : i.h().a("optimize/use_sg_scroller_new", true);
        if (com.sankuai.waimai.store.util.b.a(context)) {
            return null;
        }
        ScrollerContainer b = super.b(context);
        for (int i = 0; i < b.getChildCount(); i++) {
            try {
                View childAt = b.getChildAt(i);
                if (childAt instanceof RecyclerView) {
                    ((RecyclerView) childAt).addOnScrollListener(new RecyclerView.k() { // from class: com.sankuai.waimai.store.view.standard.mach.c.1
                        public static ChangeQuickRedirect a;

                        @Override // android.support.v7.widget.RecyclerView.k
                        public final void onScrolled(RecyclerView recyclerView, int i2, int i3) {
                            List<com.sankuai.waimai.mach.node.a> b2;
                            Object[] objArr3 = {recyclerView, Integer.valueOf(i2), Integer.valueOf(i3)};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "5a13701caa8989c7431b890d7dbca4c7", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "5a13701caa8989c7431b890d7dbca4c7");
                            } else if (c.this.d || i2 != 0 || i3 != 0) {
                                if (c.this.e == null) {
                                    c.this.e = new com.sankuai.waimai.mach.expose.c(c.this.m);
                                }
                                int findLastVisibleItemPosition = ((LinearLayoutManager) recyclerView.getLayoutManager()).findLastVisibleItemPosition();
                                if (booleanValue) {
                                    b2 = c.a(c.this, c.this.n);
                                } else {
                                    b2 = c.this.e.b(c.this.n);
                                }
                                for (int i4 = 0; i4 <= findLastVisibleItemPosition; i4++) {
                                    com.sankuai.waimai.mach.node.a aVar = (com.sankuai.waimai.mach.node.a) com.sankuai.shangou.stone.util.a.a((List<Object>) b2, i4);
                                    if (e.a(aVar, c.class)) {
                                        c.this.e.a(aVar);
                                    }
                                }
                            }
                        }
                    });
                }
            } catch (Exception e) {
                com.sankuai.waimai.store.base.log.a.a(e);
            }
        }
        return b;
    }
}

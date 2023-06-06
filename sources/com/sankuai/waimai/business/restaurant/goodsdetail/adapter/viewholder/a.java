package com.sankuai.waimai.business.restaurant.goodsdetail.adapter.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.waimai.business.restaurant.base.manager.order.g;
import com.sankuai.waimai.business.restaurant.base.repository.model.RecommendPackage;
import com.sankuai.waimai.restaurant.shopcart.ui.ab;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class a extends RecyclerView.s {
    public static ChangeQuickRedirect a;
    public g b;
    public InterfaceC0833a c;
    public boolean d;
    public int e;
    public String f;
    public ab g;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.business.restaurant.goodsdetail.adapter.viewholder.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public interface InterfaceC0833a {
        void a(RecommendPackage.a aVar, int i);
    }

    public void a(RecommendPackage.a aVar, int i, boolean z) {
    }

    public a(View view, g gVar, InterfaceC0833a interfaceC0833a, boolean z, int i, String str, ab abVar) {
        super(view);
        Object[] objArr = {view, gVar, interfaceC0833a, Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), str, abVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a16f3afb8806ff2e3c14d21ecf37a05", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a16f3afb8806ff2e3c14d21ecf37a05");
            return;
        }
        this.b = gVar;
        this.c = interfaceC0833a;
        this.d = z;
        this.e = i;
        this.f = str;
        this.g = abVar;
    }

    public final String a() {
        return this.d ? "c_CijEL" : "c_u4fk4kw";
    }
}

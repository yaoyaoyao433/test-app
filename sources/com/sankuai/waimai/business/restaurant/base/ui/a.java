package com.sankuai.waimai.business.restaurant.base.ui;

import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.waimai.platform.domain.core.goods.SpuPackageItem;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class a {
    public static ChangeQuickRedirect a;
    public ViewGroup b;
    public SpuPackageItem c;
    private View d;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.business.restaurant.base.ui.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public interface InterfaceC0828a {
        void a(SpuPackageItem spuPackageItem);
    }

    public a(View view, ViewGroup viewGroup) {
        Object[] objArr = {view, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9facb8c5718f9818ebfbd7b285ad6528", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9facb8c5718f9818ebfbd7b285ad6528");
            return;
        }
        this.d = view;
        this.b = viewGroup;
    }

    public View a() {
        return this.d;
    }

    public void a(SpuPackageItem spuPackageItem, InterfaceC0828a interfaceC0828a) {
        this.c = spuPackageItem;
    }
}

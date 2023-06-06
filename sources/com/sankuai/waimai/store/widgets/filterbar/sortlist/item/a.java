package com.sankuai.waimai.store.widgets.filterbar.sortlist.item;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.platform.shop.model.SGSortModel;
import com.sankuai.waimai.store.widgets.filterbar.sortlist.item.c;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class a extends com.sankuai.waimai.store.base.b implements c.b {
    public static ChangeQuickRedirect a;
    @NonNull
    public c.a b;
    public int c;
    public int d;
    public int e;
    private b f;

    public a(@NonNull Context context, b bVar) {
        super(context);
        Object[] objArr = {context, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f0462075f35f9dd9f51352122b7d04e7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f0462075f35f9dd9f51352122b7d04e7");
            return;
        }
        this.b = new d(this);
        this.f = bVar;
    }

    public final void a(long j, SGSortModel sGSortModel) {
        Object[] objArr = {new Long(j), sGSortModel};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "94557cd9953f78e4d9396d06a3595c9d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "94557cd9953f78e4d9396d06a3595c9d");
            return;
        }
        this.b.a(j, sGSortModel);
        if (sGSortModel == null || this.f == null) {
            return;
        }
        this.f.a(getView(), sGSortModel.category);
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.sortlist.item.c.b
    public final void a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1409149fb458ecdecef3ce7f8ef3866a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1409149fb458ecdecef3ce7f8ef3866a");
        } else if (this.f != null) {
            this.f.a(i, i2);
        }
    }

    public final int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a4e86854f1b41ec338d402dc4902de5", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a4e86854f1b41ec338d402dc4902de5")).intValue() : this.c > 0 ? this.c : getContext().getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_textsize_12);
    }

    public final int a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f52efbdbaf206c5e780093d4ab44b65f", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f52efbdbaf206c5e780093d4ab44b65f")).intValue() : z ? this.e != 0 ? this.e : com.sankuai.waimai.store.util.b.b(getContext(), R.color.wm_st_common_text_title) : this.d != 0 ? this.d : com.sankuai.waimai.store.util.b.b(getContext(), R.color.wm_sg_color_999999);
    }
}

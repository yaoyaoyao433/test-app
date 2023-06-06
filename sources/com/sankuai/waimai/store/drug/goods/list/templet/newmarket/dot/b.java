package com.sankuai.waimai.store.drug.goods.list.templet.newmarket.dot;

import android.content.Context;
import android.support.annotation.NonNull;
import android.util.SparseArray;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends a {
    public static ChangeQuickRedirect d;
    private final SparseArray<com.sankuai.waimai.store.expose.v2.entity.b> e;

    public b(@NonNull Context context, String str) {
        super(context, str);
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2cea56dcf50d9762172a3647cad98311", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2cea56dcf50d9762172a3647cad98311");
        } else {
            this.e = new SparseArray<>();
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.dot.a
    public final void a(@NonNull String str, @NonNull Map<String, Object> map, View view, String str2) {
        Object[] objArr = {str, map, view, str2};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2325d97c31a15229c1e4e659a8613706", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2325d97c31a15229c1e4e659a8613706");
        } else if (this.b instanceof com.sankuai.waimai.store.expose.v2.a) {
            com.sankuai.waimai.store.expose.v2.entity.b bVar = this.e.get(view.hashCode());
            if (bVar == null) {
                bVar = new com.sankuai.waimai.store.expose.v2.entity.b(str, view);
                this.e.put(view.hashCode(), bVar);
                com.sankuai.waimai.store.expose.v2.b.a().a((com.sankuai.waimai.store.expose.v2.a) this.b, bVar);
            } else {
                bVar.g();
            }
            bVar.e = str2;
            bVar.b(map);
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.dot.a
    public final void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "95ed0d8831263b998a03829ae67d77c9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "95ed0d8831263b998a03829ae67d77c9");
        } else if (view == null) {
        } else {
            this.e.remove(view.hashCode());
        }
    }
}

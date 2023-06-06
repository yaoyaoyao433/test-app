package com.sankuai.waimai.store.goods.list.statistics;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.expose.v2.entity.b;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a implements com.sankuai.waimai.store.base.statistic.a {
    public static ChangeQuickRedirect a;
    private final Map<String, Object> b;
    private final SCBaseActivity c;
    private final String d;

    public a(@NonNull SCBaseActivity sCBaseActivity, @NonNull String str, @Nullable Map<String, Object> map) {
        Object[] objArr = {sCBaseActivity, str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bcef4b75071ff72802334bff3db82eb2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bcef4b75071ff72802334bff3db82eb2");
            return;
        }
        this.c = sCBaseActivity;
        this.d = str;
        this.b = map;
    }

    @Override // com.sankuai.waimai.store.base.statistic.a
    @NonNull
    public final b a(@NonNull View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4627e81c1f99a2a364d284f0a63727f4", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4627e81c1f99a2a364d284f0a63727f4") : new b("b_waimai_kize365c_mv", view);
    }

    @Override // com.sankuai.waimai.store.base.statistic.a
    public final void a(@Nullable b bVar, int i, Map<String, Object> map) {
        Object[] objArr = {bVar, Integer.valueOf(i), map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a45019eee037d64f727bfee1ac1fe2a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a45019eee037d64f727bfee1ac1fe2a");
        } else if (bVar != null) {
            bVar.e = "_on_sale_statistics_" + i;
            bVar.b(this.b);
            bVar.b(map);
            com.sankuai.waimai.store.expose.v2.b.a().a(this.c, bVar);
        }
    }

    @Override // com.sankuai.waimai.store.base.statistic.a
    public final void a(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "716da60e299a465d4f79068db5872633", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "716da60e299a465d4f79068db5872633");
        } else {
            com.sankuai.waimai.store.manager.judas.b.a(this.c, "b_waimai_kize365c_mc").a(this.d).b(this.b).b(map).a();
        }
    }
}

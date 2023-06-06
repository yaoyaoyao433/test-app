package com.sankuai.waimai.store.poi.list.logreport;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b implements com.sankuai.waimai.store.poi.list.widget.kingkong.home.a {
    public static ChangeQuickRedirect a = null;
    private static String b = "KingKong";
    private final com.sankuai.waimai.store.expose.v2.a c;
    private final String d;
    private final String e;
    private final long f;

    public b(@NonNull com.sankuai.waimai.store.expose.v2.a aVar, @NonNull String str, @NonNull String str2, long j) {
        Object[] objArr = {aVar, str, str2, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2cb79af41b66266e68dd86676700c812", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2cb79af41b66266e68dd86676700c812");
            return;
        }
        this.c = aVar;
        this.d = str;
        this.e = str2;
        this.f = j;
    }

    @Override // com.sankuai.waimai.store.poi.list.widget.kingkong.home.a
    @NonNull
    public final com.sankuai.waimai.store.expose.v2.entity.b a(@NonNull View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "37a8529ec424e95efdd7ddf3d9db8c20", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.expose.v2.entity.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "37a8529ec424e95efdd7ddf3d9db8c20") : new com.sankuai.waimai.store.expose.v2.entity.b("b_waimai_4kb1dtba_mv", view);
    }

    @Override // com.sankuai.waimai.store.poi.list.widget.kingkong.home.a
    public final void a(@Nullable com.sankuai.waimai.store.expose.v2.entity.b bVar, long j, int i, int i2) {
        Object[] objArr = {bVar, new Long(j), Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d059d1facf70aa46c85f4b637738e7c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d059d1facf70aa46c85f4b637738e7c");
        } else if (bVar != null) {
            bVar.e = Integer.toString(i) + b;
            bVar.a("cat_id", Long.valueOf(j)).a("is_gray", Integer.valueOf(i2)).a("stid", this.e).a("page_cat_id", Long.valueOf(this.f)).a("index", Integer.valueOf(i));
            com.sankuai.waimai.store.expose.v2.b.a().a(this.c, bVar);
        }
    }

    @Override // com.sankuai.waimai.store.poi.list.widget.kingkong.home.a
    public final void a(long j, int i, int i2) {
        Object[] objArr = {new Long(j), Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "75a84cf9a082cf2ab08a2b88bc1db6b9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "75a84cf9a082cf2ab08a2b88bc1db6b9");
        } else {
            com.sankuai.waimai.store.manager.judas.b.a(this.d, "b_waimai_xtlkgwpd_mc").a("cat_id", Long.valueOf(j)).a("index", Integer.valueOf(i)).a("is_gray", Integer.valueOf(i2)).a("stid", this.e).a();
        }
    }
}

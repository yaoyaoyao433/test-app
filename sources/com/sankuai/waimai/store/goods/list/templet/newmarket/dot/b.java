package com.sankuai.waimai.store.goods.list.templet.newmarket.dot;

import android.app.Activity;
import android.content.ContextWrapper;
import android.util.SparseArray;
import android.view.View;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.platform.shop.model.GoodsPoiCategory;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b {
    public static ChangeQuickRedirect a;
    public final com.sankuai.waimai.store.platform.domain.manager.poi.a b;
    public final String c;
    public final GoodsPoiCategory d;
    private final SparseArray<com.sankuai.waimai.store.expose.v2.entity.b> e;
    private final a f;
    private final String g;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a extends ContextWrapper implements com.sankuai.waimai.store.expose.v2.a {
        public static ChangeQuickRedirect a;
        private final Activity b;
        private final View c;

        public a(Activity activity, View view) {
            super(activity);
            Object[] objArr = {activity, view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad6a836e507e54fdad04665dfc1b1008", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad6a836e507e54fdad04665dfc1b1008");
                return;
            }
            this.b = activity;
            this.c = view;
        }

        @Override // com.sankuai.waimai.store.expose.v2.a
        public final View f() {
            return this.c;
        }

        @Override // com.sankuai.waimai.store.expose.v2.a
        public final Activity bB_() {
            return this.b;
        }
    }

    public b(GoodsPoiCategory goodsPoiCategory, com.sankuai.waimai.store.platform.domain.manager.poi.a aVar, a aVar2, String str, String str2) {
        Object[] objArr = {goodsPoiCategory, aVar, aVar2, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "35de7a44f90522f63ae0689730691e6a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "35de7a44f90522f63ae0689730691e6a");
            return;
        }
        this.e = new SparseArray<>();
        this.d = goodsPoiCategory;
        this.b = aVar;
        this.c = str2;
        this.g = str;
        this.f = aVar2;
    }

    public void a(String str, Map<String, Object> map, View view, String str2) {
        Object[] objArr = {str, map, view, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "07b336dc2c431fa19ec89defe5052154", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "07b336dc2c431fa19ec89defe5052154");
            return;
        }
        com.sankuai.waimai.store.expose.v2.entity.b bVar = this.e.get(view.hashCode());
        if (bVar == null) {
            bVar = new com.sankuai.waimai.store.expose.v2.entity.b(this.g, str, AppUtil.generatePageInfoKey(this.f.b), view, str2);
            this.e.put(view.hashCode(), bVar);
            com.sankuai.waimai.store.expose.v2.b.a().a(this.f, bVar);
        } else {
            bVar.g();
        }
        bVar.e = str2;
        bVar.b(map);
    }

    public void a(String str, Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f7512fed2612ae7c48079ae42350dc5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f7512fed2612ae7c48079ae42350dc5");
        } else {
            com.sankuai.waimai.store.manager.judas.b.a(this.g, str).b(map).a(AppUtil.generatePageInfoKey(this.f.b)).a();
        }
    }
}

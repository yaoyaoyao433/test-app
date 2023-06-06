package com.sankuai.waimai.bussiness.order.crossconfirm.request;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonObject;
import com.meituan.android.common.locate.locator.GearsLocator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.bussiness.order.crossconfirm.model.preview.param.PoiAddressParam;
import com.sankuai.waimai.bussiness.order.crossconfirm.model.preview.param.PoiOrderParam;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d {
    public static ChangeQuickRedirect a;
    private b b;
    private Gson c;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class b {
        public PoiAddressParam a;
        public List<PoiOrderParam> b;
        public com.sankuai.waimai.bussiness.order.crossconfirm.request.b c;
        public String d;
        public boolean e;
        public long f;
        public String g;
    }

    private d(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "36020d4c3f2f5f2e2d252d950d78adf4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "36020d4c3f2f5f2e2d252d950d78adf4");
            return;
        }
        this.c = new Gson();
        this.b = bVar;
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "504f368ba831959a4230f7490caaed90", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "504f368ba831959a4230f7490caaed90");
        } else if (this.b.c != null) {
            this.b.c.a(b());
        }
    }

    private String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b2c09a97d452b9d1de4e7b13b27c422b", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b2c09a97d452b9d1de4e7b13b27c422b");
        }
        JsonObject jsonObject = new JsonObject();
        try {
            this.b.a.ignoreAddressRecommend = com.sankuai.waimai.business.order.submit.b.a();
            jsonObject.add(GearsLocator.ADDRESS, this.c.toJsonTree(this.b.a));
            jsonObject.add("poi_orders", this.c.toJsonTree(this.b.b));
            jsonObject.addProperty("push_token", this.b.d);
            jsonObject.addProperty("check_shipping_area", Integer.valueOf(this.b.e ? 1 : 0));
            jsonObject.addProperty("trigger_risk_wm_poi_id", Long.valueOf(this.b.f));
            jsonObject.addProperty("trigger_risk_wm_poi_id_str", this.b.g);
        } catch (JsonIOException e) {
            e.printStackTrace();
        }
        return jsonObject.toString();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        public b b;

        public a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e2d752586058c03bf3f89e61b1fd6c0a", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e2d752586058c03bf3f89e61b1fd6c0a");
            } else {
                this.b = new b();
            }
        }

        public final a a(PoiAddressParam poiAddressParam) {
            this.b.a = poiAddressParam;
            return this;
        }

        public final a a(List<PoiOrderParam> list) {
            this.b.b = list;
            return this;
        }

        public final a a(com.sankuai.waimai.bussiness.order.crossconfirm.request.b bVar) {
            this.b.c = bVar;
            return this;
        }

        public final a a(boolean z) {
            this.b.e = z;
            return this;
        }

        public final a a(long j) {
            Object[] objArr = {new Long(j)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a86f2b56d53c60139ab3ac245bdc8f5", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a86f2b56d53c60139ab3ac245bdc8f5");
            }
            this.b.f = j;
            return this;
        }

        public final a a(String str) {
            this.b.g = str;
            return this;
        }

        public final d a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "749a3f6f2da5d1da93500fb0bad8da91", RobustBitConfig.DEFAULT_VALUE)) {
                return (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "749a3f6f2da5d1da93500fb0bad8da91");
            }
            String str = com.dianping.mainboard.a.b().h;
            b bVar = this.b;
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            bVar.d = str;
            return new d(this.b);
        }
    }
}

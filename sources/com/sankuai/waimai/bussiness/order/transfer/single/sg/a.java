package com.sankuai.waimai.bussiness.order.transfer.single.sg;

import android.app.Activity;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.bussiness.order.confirm.request.b;
import com.sankuai.waimai.bussiness.order.transfer.single.d;
import com.sankuai.waimai.bussiness.order.transfer.single.f;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends com.sankuai.waimai.bussiness.order.transfer.single.b {
    public static ChangeQuickRedirect c;

    public a(Activity activity) {
        super(activity);
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3ed72fc146e127cfe93c2801eaf7a654", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3ed72fc146e127cfe93c2801eaf7a654");
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.sankuai.waimai.bussiness.order.transfer.single.b, com.sankuai.waimai.bussiness.order.transfer.base.d
    public final void a(d dVar, f fVar, b.C0904b c0904b, com.sankuai.waimai.bussiness.order.transfer.base.c cVar) {
        String a;
        String str;
        boolean z;
        JsonPrimitive a2;
        Object[] objArr = {dVar, fVar, c0904b, cVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "42ddccdcd7284562bdf3ef0b63182376", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "42ddccdcd7284562bdf3ef0b63182376");
            return;
        }
        com.sankuai.waimai.bussiness.order.confirm.request.preview.a aVar = new com.sankuai.waimai.bussiness.order.confirm.request.preview.a(this.b);
        aVar.h = cVar;
        aVar.e = new com.sankuai.waimai.platform.domain.core.response.a();
        Object[] objArr2 = {dVar};
        ChangeQuickRedirect changeQuickRedirect2 = c;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ac663d572008ca63ba9d0c8dc92e0173", RobustBitConfig.DEFAULT_VALUE)) {
            a = (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ac663d572008ca63ba9d0c8dc92e0173");
        } else {
            JsonElement a3 = dVar.c("common_param") == 1 ? dVar.a(1, "common_param") : null;
            String str2 = "";
            if (a3 != null && (a3.isJsonObject() || a3.isJsonArray())) {
                str2 = new Gson().toJson(a3);
            }
            a = com.sankuai.waimai.bussiness.order.transfer.single.c.a(str2, "drug_extra");
        }
        String str3 = a;
        if ("1".equals(com.sankuai.waimai.bussiness.order.transfer.single.c.a(str3, "drug_tag"))) {
            str = str3;
        } else {
            Object[] objArr3 = {dVar};
            ChangeQuickRedirect changeQuickRedirect3 = c;
            str = str3;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "3a8367b3a9cef94b283f0dfacf89853c", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "3a8367b3a9cef94b283f0dfacf89853c")).booleanValue();
            } else {
                z = dVar.c("login_from") == 1 && (a2 = dVar.a("login_from")) != null && a2.isNumber() && a2.getAsInt() == 7;
            }
            if (!z) {
                com.sankuai.waimai.bussiness.order.confirm.request.b a4 = com.sankuai.waimai.bussiness.order.confirm.request.b.a(0, fVar, c0904b.h);
                a4.e = c0904b;
                a4.f = aVar;
                a4.a();
                return;
            }
        }
        com.sankuai.waimai.bussiness.order.confirm.request.a a5 = com.sankuai.waimai.bussiness.order.confirm.request.a.a(this.b, fVar, c0904b.h);
        a5.c = c0904b;
        a5.e = aVar;
        a5.g = cVar;
        a5.a(str);
    }
}

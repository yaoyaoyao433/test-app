package com.sankuai.waimai.business.page.home.list.future;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d extends com.sankuai.waimai.platform.dynamic.b {
    public static ChangeQuickRedirect a;
    private final a b;
    private final com.sankuai.waimai.business.page.common.list.ai.c d;
    private final com.sankuai.waimai.business.page.home.list.future.complex.f e;
    private final com.sankuai.waimai.rocks.view.recyclerview.b f;
    private final com.sankuai.waimai.business.page.home.list.future.user_prefer_collect.a g;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
        String a();
    }

    public d(String str, String str2, a aVar, com.sankuai.waimai.business.page.common.list.ai.c cVar, com.sankuai.waimai.business.page.home.list.future.complex.f fVar, com.sankuai.waimai.rocks.view.recyclerview.b bVar, com.sankuai.waimai.business.page.home.list.future.user_prefer_collect.a aVar2) {
        super(str, str2);
        Object[] objArr = {str, str2, aVar, cVar, fVar, bVar, aVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cde618647346eef68a3e67156288815d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cde618647346eef68a3e67156288815d");
            return;
        }
        this.b = aVar;
        this.d = cVar;
        this.e = fVar;
        this.f = bVar;
        this.g = aVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x0349 A[Catch: Exception -> 0x03d8, TryCatch #2 {Exception -> 0x03d8, blocks: (B:7:0x0043, B:9:0x004e, B:16:0x005f, B:18:0x006a, B:20:0x0073, B:23:0x0089, B:24:0x0090, B:26:0x00a8, B:28:0x00da, B:40:0x010f, B:42:0x011c, B:44:0x0141, B:60:0x017e, B:62:0x0187, B:64:0x01b6, B:130:0x03d2, B:65:0x01bc, B:67:0x01c1, B:69:0x01d8, B:90:0x022a, B:92:0x0232, B:94:0x023a, B:102:0x028f, B:103:0x0296, B:70:0x01e4, B:72:0x01ec, B:74:0x01f4, B:76:0x01fc, B:78:0x0204, B:80:0x020c, B:82:0x0214, B:84:0x021c, B:104:0x02a3, B:106:0x02aa, B:108:0x02b3, B:110:0x0305, B:111:0x0317, B:113:0x0324, B:114:0x0338, B:115:0x0349, B:117:0x0352, B:119:0x0371, B:120:0x037e, B:123:0x038e, B:126:0x0395, B:46:0x0148, B:48:0x014c, B:50:0x0153, B:52:0x015b, B:59:0x017b, B:29:0x00eb, B:31:0x00f4, B:33:0x00fe, B:97:0x023f, B:99:0x0274, B:54:0x016b, B:56:0x0173), top: B:141:0x0043, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0187 A[Catch: Exception -> 0x03d8, TryCatch #2 {Exception -> 0x03d8, blocks: (B:7:0x0043, B:9:0x004e, B:16:0x005f, B:18:0x006a, B:20:0x0073, B:23:0x0089, B:24:0x0090, B:26:0x00a8, B:28:0x00da, B:40:0x010f, B:42:0x011c, B:44:0x0141, B:60:0x017e, B:62:0x0187, B:64:0x01b6, B:130:0x03d2, B:65:0x01bc, B:67:0x01c1, B:69:0x01d8, B:90:0x022a, B:92:0x0232, B:94:0x023a, B:102:0x028f, B:103:0x0296, B:70:0x01e4, B:72:0x01ec, B:74:0x01f4, B:76:0x01fc, B:78:0x0204, B:80:0x020c, B:82:0x0214, B:84:0x021c, B:104:0x02a3, B:106:0x02aa, B:108:0x02b3, B:110:0x0305, B:111:0x0317, B:113:0x0324, B:114:0x0338, B:115:0x0349, B:117:0x0352, B:119:0x0371, B:120:0x037e, B:123:0x038e, B:126:0x0395, B:46:0x0148, B:48:0x014c, B:50:0x0153, B:52:0x015b, B:59:0x017b, B:29:0x00eb, B:31:0x00f4, B:33:0x00fe, B:97:0x023f, B:99:0x0274, B:54:0x016b, B:56:0x0173), top: B:141:0x0043, inners: #0, #1 }] */
    @Override // com.sankuai.waimai.platform.dynamic.b, com.sankuai.waimai.mach.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.lang.String r26, java.lang.String r27, int r28, java.util.Map<java.lang.String, java.lang.Object> r29, com.sankuai.waimai.mach.node.a r30) {
        /*
            Method dump skipped, instructions count: 1038
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.business.page.home.list.future.d.a(java.lang.String, java.lang.String, int, java.util.Map, com.sankuai.waimai.mach.node.a):void");
    }

    private int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "693f6f1d43362703c2be296aa2c82d9e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "693f6f1d43362703c2be296aa2c82d9e")).intValue();
        }
        if (this.e.e == -1 && this.f != null && this.f.G() != null && !com.sankuai.waimai.foundation.utils.d.a(this.f.G().o)) {
            for (int i = 0; i < this.f.G().o.size(); i++) {
                com.sankuai.waimai.rocks.view.viewmodel.e eVar = this.f.G().o.get(i);
                if (eVar != null && eVar.s != null && !TextUtils.isEmpty(eVar.s.c) && TextUtils.equals(eVar.s.c, "waimai_mach_usercenter_homepage_feed_card")) {
                    this.e.e = i - this.g.b();
                    return this.e.e;
                }
            }
        }
        return this.e.e != -1 ? this.e.e : this.e.d;
    }

    public static void a(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5892581d6eb2af119142bf05b4971c86", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5892581d6eb2af119142bf05b4971c86");
        } else if (jSONObject == null) {
        } else {
            try {
                if (jSONObject.has("poi_id")) {
                    long optLong = jSONObject.optLong("poi_id", 0L);
                    if (optLong != 0) {
                        jSONObject.remove("poi_id");
                        jSONObject.put("poi_id", String.valueOf(optLong));
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

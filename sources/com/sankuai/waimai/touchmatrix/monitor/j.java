package com.sankuai.waimai.touchmatrix.monitor;

import android.content.Context;
import com.dianping.monitor.impl.m;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.uuid.GetUUID;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.touchmatrix.rebuild.ab.a;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class j {
    public static ChangeQuickRedirect a;
    public e b;
    public h c;

    public j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "95681ccd8d3e9c6d566516e6e5710fbc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "95681ccd8d3e9c6d566516e6e5710fbc");
            return;
        }
        this.b = new i();
        this.c = new h("wmtm_msg_process_metric");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a {
        private static j a = new j();
    }

    public static j a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cdc89e8108b6b2a50942e3922c6a84b7", RobustBitConfig.DEFAULT_VALUE) ? (j) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cdc89e8108b6b2a50942e3922c6a84b7") : a.a;
    }

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a9f13df6539aba03acfbcbaa9b48eba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a9f13df6539aba03acfbcbaa9b48eba");
            return;
        }
        this.b.a(i, "tmatrix/status/dialog", 0);
        b(i);
    }

    public final void a(int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "15c6cd3ac92927766e4c629b2973ca02", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "15c6cd3ac92927766e4c629b2973ca02");
            return;
        }
        this.b.a(i, "tmatrix/status/dialog", 0);
        this.b.a("touch_matrix_showlimit", str, String.valueOf(i), null);
        b(i);
    }

    public final void a(int i, String str, String str2, Map<String, Object> map) {
        Object[] objArr = {Integer.valueOf(i), str, str2, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9384f55768a9b1aa603b8f04f2ce9bc6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9384f55768a9b1aa603b8f04f2ce9bc6");
            return;
        }
        this.b.a(i, "tmatrix/status/dialog", 0);
        this.b.a("touch_matrix_showlimit", str, str2, map);
        b(i);
    }

    public void b(final int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe18f982ba91c506d2aec73958de5c62", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe18f982ba91c506d2aec73958de5c62");
        } else {
            com.sankuai.waimai.touchmatrix.rebuild.ab.a.a().a(new a.b() { // from class: com.sankuai.waimai.touchmatrix.monitor.j.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.touchmatrix.rebuild.ab.a.b
                public final void a(boolean z) {
                    Object[] objArr2 = {(byte) 1};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f1e48c57d7209e1945ce05042baaca02", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f1e48c57d7209e1945ce05042baaca02");
                    } else if (j.this.b == null) {
                    } else {
                        j.this.b.a(i, "tmatrix/status/dialog/new", 0);
                    }
                }
            });
        }
    }

    public final void a(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be64fcde32be57b867fea0c63a9e4aad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be64fcde32be57b867fea0c63a9e4aad");
            return;
        }
        if (!map.containsKey("biz")) {
            map.put("biz", com.sankuai.waimai.touchmatrix.rebuild.biz.a.a());
        }
        JudasManualManager.b("b_waimai_ln1wcevo_mv").b(map).a();
    }

    public final void c(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2404504499c1ed38c5f7dd2376eb9141", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2404504499c1ed38c5f7dd2376eb9141");
            return;
        }
        this.b.a(i, "tmatrix/status/dialog", 0);
        b(i);
    }

    public final void b(int i, String str) {
        Object[] objArr = {12001, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "01f9e69ab02130cffd6b8a47fd1a83b8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "01f9e69ab02130cffd6b8a47fd1a83b8");
            return;
        }
        this.b.a(12001, "tmatrix/message/local", 0);
        this.b.a("touch_matrix_message", str, "12001", null);
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "341f5afa6d3e8818eeffbe18f7c55150", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "341f5afa6d3e8818eeffbe18f7c55150");
        } else if (this.b != null) {
            this.b.a(str, this.c);
        }
    }

    public final void a(boolean z, String str, String str2) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a9d524ac505c119867f132db5c03f89d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a9d524ac505c119867f132db5c03f89d");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("TouchMatrixPopupSuccess", Integer.valueOf(z ? 1 : 0));
        HashMap hashMap2 = new HashMap();
        hashMap2.put("biz", str);
        hashMap2.put("page_id", str2);
        a(hashMap, hashMap2);
    }

    public final void a(int i, String str, String str2) {
        Object[] objArr = {Integer.valueOf(i), str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6739f21271bca75284a4a62cf9c9093e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6739f21271bca75284a4a62cf9c9093e");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("TouchMatrixPopupClose", Integer.valueOf(i));
        HashMap hashMap2 = new HashMap();
        hashMap2.put("biz", str);
        hashMap2.put("page_id", str2);
        a(hashMap, hashMap2);
    }

    private void a(Map<String, Number> map, Map<String, String> map2) {
        int i = 1;
        Object[] objArr = {map, map2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6f68b1c30a9ae93f93aefe26d759cd75", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6f68b1c30a9ae93f93aefe26d759cd75");
            return;
        }
        Context context = com.meituan.android.singleton.b.a;
        Object[] objArr2 = {context};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "50f6f4a549b067900fd6e68b9afe006f", RobustBitConfig.DEFAULT_VALUE)) {
            i = ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "50f6f4a549b067900fd6e68b9afe006f")).intValue();
        } else {
            String packageName = context.getPackageName();
            if ("com.sankuai.meituan.takeoutnew".equals(packageName)) {
                i = 11;
            } else if ("com.sankuai.meituan".equals(packageName) || !"com.dianping.v1".equals(packageName)) {
                i = 10;
            }
        }
        m mVar = new m(i, context, GetUUID.getInstance().getUUID(context));
        if (map.size() > 0) {
            for (Map.Entry<String, Number> entry : map.entrySet()) {
                mVar.a(entry.getKey(), Collections.singletonList(Float.valueOf(entry.getValue().floatValue())));
            }
        }
        if (map2.size() > 0) {
            for (Map.Entry<String, String> entry2 : map2.entrySet()) {
                mVar.a(entry2.getKey(), entry2.getValue());
            }
        }
        mVar.a();
    }
}

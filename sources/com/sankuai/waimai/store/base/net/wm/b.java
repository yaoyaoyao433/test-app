package com.sankuai.waimai.store.base.net.wm;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.util.v;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends com.sankuai.waimai.store.base.net.a {
    public static ChangeQuickRedirect c;

    @Override // com.sankuai.waimai.store.base.net.a
    public final String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "42fc54b9115e3a11b814c992331e39e8", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "42fc54b9115e3a11b814c992331e39e8") : (String) v.a(new v.a<String>() { // from class: com.sankuai.waimai.store.base.net.wm.b.1
            @Override // com.sankuai.waimai.store.util.v.a
            public final /* bridge */ /* synthetic */ String a() {
                return "http://dpapi.waimai.meituan.com";
            }

            @Override // com.sankuai.waimai.store.util.v.a
            public final /* bridge */ /* synthetic */ String b() {
                return "http://wmapi.meituan.com";
            }

            @Override // com.sankuai.waimai.store.util.v.a
            public final /* bridge */ /* synthetic */ String c() {
                return "http://wmapi-mt.meituan.com";
            }
        });
    }
}

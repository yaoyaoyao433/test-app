package com.sankuai.waimai.store.mrn.preload;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d {
    public static ChangeQuickRedirect a;
    private static final Map<String, String> b;

    static {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        b = concurrentHashMap;
        concurrentHashMap.put(com.sankuai.shangou.stone.util.m.a("sc_base1"), "http://scapi.waimai.meituan.com/dp/");
        b.put(com.sankuai.shangou.stone.util.m.a("wm_base1"), "https://dpapi.waimai.meituan.com/dp/");
        b.put(com.sankuai.shangou.stone.util.m.a("drug_base1"), "https://hcapi.waimai.meituan.com/dp/");
        b.put(com.sankuai.shangou.stone.util.m.a("sc_base10"), "http://scapi.waimai.meituan.com/mtapi/");
        b.put(com.sankuai.shangou.stone.util.m.a("wm_base10"), "https://wmapi-mt.meituan.com/mtapi/");
        b.put(com.sankuai.shangou.stone.util.m.a("drug_base10"), "https://hcapi.waimai.meituan.com/mtapi/");
        b.put(com.sankuai.shangou.stone.util.m.a("sc_base11"), "http://scapi.waimai.meituan.com/api/");
        b.put(com.sankuai.shangou.stone.util.m.a("wm_base11"), "http://wmapi.meituan.com/api/");
        b.put(com.sankuai.shangou.stone.util.m.a("drug_base11"), "http://hcapi.waimai.meituan.com/api/");
        b.put(com.sankuai.shangou.stone.util.m.a("sc_base169"), "http://scapi.waimai.meituan.com/sgapi/");
        b.put(com.sankuai.shangou.stone.util.m.a("wm_base169"), "https://wmapi-sg.meituan.com/sgapi/");
    }

    public static String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6b3b5ae76c12d7cfbeba12f76b5c00e8", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6b3b5ae76c12d7cfbeba12f76b5c00e8");
        }
        Context a2 = com.sankuai.waimai.store.util.b.a();
        if ("sc_host".equals(str)) {
            Map<String, String> map = b;
            String str2 = map.get(com.sankuai.shangou.stone.util.m.a("sc_base" + com.sankuai.waimai.config.a.a().d()));
            return a2 == null ? str2 : com.sankuai.meituan.switchtestenv.a.a(com.sankuai.waimai.store.util.b.a(), str2);
        } else if ("wm_host".equals(str)) {
            Map<String, String> map2 = b;
            String str3 = map2.get(com.sankuai.shangou.stone.util.m.a("wm_base" + com.sankuai.waimai.config.a.a().d()));
            return a2 == null ? str3 : com.sankuai.meituan.switchtestenv.a.a(com.sankuai.waimai.store.util.b.a(), str3);
        } else if ("drug_host".equals(str)) {
            Map<String, String> map3 = b;
            String str4 = map3.get(com.sankuai.shangou.stone.util.m.a("drug_base" + com.sankuai.waimai.config.a.a().d()));
            return a2 == null ? str4 : com.sankuai.meituan.switchtestenv.a.a(com.sankuai.waimai.store.util.b.a(), str4);
        } else {
            return null;
        }
    }
}

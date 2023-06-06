package com.meituan.msc.modules.api.report;

import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.msc.common.utils.ad;
import com.meituan.msc.common.utils.am;
import com.meituan.msc.modules.reporter.g;
import com.meituan.msc.modules.update.bean.PackageInfoWrapper;
import com.meituan.msi.annotations.MsiSupport;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class MSCReportBizTagsManager {
    public static ChangeQuickRedirect a;
    private static volatile MSCReportBizTagsManager d;
    public final Map<String, Map<String, String>> b;
    public final Map<String, Map<String, Map<String, String>>> c;

    public MSCReportBizTagsManager() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e9c6f7d1afd34b38182006374bec39f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e9c6f7d1afd34b38182006374bec39f");
            return;
        }
        this.b = new ad();
        this.c = new ad();
    }

    public static MSCReportBizTagsManager a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "aeff5d4afea92c6b6bff195144d76799", RobustBitConfig.DEFAULT_VALUE)) {
            return (MSCReportBizTagsManager) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "aeff5d4afea92c6b6bff195144d76799");
        }
        if (d == null) {
            synchronized (MSCReportBizTagsManager.class) {
                if (d == null) {
                    d = new MSCReportBizTagsManager();
                }
            }
        }
        return d;
    }

    public final boolean a(String str, String str2, Map<String, String> map) {
        Map<String, Map<String, String>> map2;
        Object[] objArr = {str, str2, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "02e28afe5d1f25bb38a55b56b2d3fc18", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "02e28afe5d1f25bb38a55b56b2d3fc18")).booleanValue();
        }
        g.d("MSCReportBizTagsManager", "putBizTags", str, str2, map);
        if (TextUtils.isEmpty(str)) {
            g.a("MSCReportBizTagsManager", "putBizTags appId null");
            return false;
        } else if (b(str, str2, map)) {
            return false;
        } else {
            String b = am.b(str2);
            if (TextUtils.isEmpty(b)) {
                Map<String, String> map3 = this.b.get(str);
                if (map3 == null) {
                    map3 = new ad<>();
                }
                map3.putAll(map);
                this.b.put(str, map3);
            } else {
                if (!this.c.containsKey(str)) {
                    map2 = new ad<>();
                    this.c.put(str, map2);
                } else {
                    map2 = this.c.get(str);
                }
                Map<String, String> map4 = map2.get(b);
                if (map4 == null) {
                    map4 = new ad<>();
                    map2.put(b, map4);
                }
                map4.putAll(map);
            }
            return true;
        }
    }

    private boolean b(String str, String str2, Map<String, String> map) {
        Object[] objArr = {str, str2, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ef43c5802b96e15533b4245e5aac16f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ef43c5802b96e15533b4245e5aac16f")).booleanValue();
        }
        if (map == null) {
            return false;
        }
        if (TextUtils.isEmpty(str2)) {
            BizTagsData a2 = a(str, null);
            if (a(a2 != null ? a2.getBizTagsForAppId() : null, map, com.meituan.msc.common.config.b.J())) {
                return true;
            }
        } else {
            BizTagsData a3 = a(str, str2);
            if (a(a3 != null ? a3.getBizTagsForPage(str2) : null, map, com.meituan.msc.common.config.b.K())) {
                return true;
            }
        }
        for (String str3 : map.values()) {
            if (str3 != null && str3.length() > com.meituan.msc.common.config.b.L()) {
                return true;
            }
        }
        return false;
    }

    private boolean a(Map<String, String> map, Map<String, String> map2, int i) {
        Object[] objArr = {map, map2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f190a7b0c41466e289ee81481a0ba28b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f190a7b0c41466e289ee81481a0ba28b")).booleanValue();
        }
        HashSet hashSet = new HashSet();
        if (map != null) {
            hashSet.addAll(map.keySet());
        }
        hashSet.addAll(map2.keySet());
        return hashSet.size() > i;
    }

    @Nullable
    public final BizTagsData a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c50744ce72c212c613979c214899b8d", RobustBitConfig.DEFAULT_VALUE)) {
            return (BizTagsData) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c50744ce72c212c613979c214899b8d");
        }
        if (TextUtils.isEmpty(str)) {
            g.a("MSCReportBizTagsManager", "getBizTags appId null");
            return null;
        }
        if (!TextUtils.equals(str, PackageInfoWrapper.PACKAGE_TYPE_STR_BASE)) {
            g.d("MSCReportBizTagsManager", "getBizTags", str, str2);
        }
        String b = am.b(str2);
        Map<String, String> map = this.b.get(str);
        if (TextUtils.isEmpty(b)) {
            return new BizTagsData(map != null ? new HashMap(map) : null, null);
        }
        Map<String, Map<String, String>> map2 = this.c.get(str);
        HashMap hashMap = new HashMap();
        if (map2 != null) {
            hashMap.put(b, map2.get(b));
        }
        return new BizTagsData(null, hashMap);
    }

    /* compiled from: ProGuard */
    @MsiSupport
    /* loaded from: classes3.dex */
    public static class BizTagsData {
        public static ChangeQuickRedirect changeQuickRedirect;
        private final Map<String, String> bizTagsForAppId;
        private final Map<String, Map<String, String>> bizTagsForPage;

        public BizTagsData(Map<String, String> map, Map<String, Map<String, String>> map2) {
            Object[] objArr = {map, map2};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b9738d6a1329ea8fbb64999617180601", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b9738d6a1329ea8fbb64999617180601");
                return;
            }
            this.bizTagsForAppId = map;
            this.bizTagsForPage = map2;
        }

        @Nullable
        public Map<String, String> getBizTagsForAppId() {
            return this.bizTagsForAppId;
        }

        @Nullable
        public Map<String, Map<String, String>> getBizTagsForPage() {
            return this.bizTagsForPage;
        }

        @Nullable
        public Map<String, String> getBizTagsForPage(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6e4c6f689b8e6c0cae1f953e3113ffb4", RobustBitConfig.DEFAULT_VALUE)) {
                return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6e4c6f689b8e6c0cae1f953e3113ffb4");
            }
            g.d("MSCReportBizTagsManager", "getBizTagsForPage", str);
            if (TextUtils.isEmpty(str) || this.bizTagsForPage == null) {
                return null;
            }
            return this.bizTagsForPage.get(am.b(str));
        }
    }
}

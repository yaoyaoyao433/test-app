package com.sankuai.waimai.drug;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.environment.b;
import com.sankuai.waimai.store.util.monitor.monitor.IMonitor;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class MEDQualityMonitorReporter {
    public static ChangeQuickRedirect a;
    public int b;
    public int c;
    public int d;

    private boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e546635ce2de496aa4d9131aeb4616b", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e546635ce2de496aa4d9131aeb4616b")).booleanValue() : !b.c.RELEASE.equals(com.sankuai.shangou.stone.util.environment.a.a());
    }

    private Map<String, String> a(Map<String, Object> map) {
        String key;
        Object value;
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b359793cb7594df39395ea261e833dbf", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b359793cb7594df39395ea261e833dbf");
        }
        HashMap hashMap = null;
        if (map != null && !map.isEmpty()) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                if (entry != null && (key = entry.getKey()) != null && (value = entry.getValue()) != null) {
                    if (hashMap == null) {
                        hashMap = new HashMap();
                    }
                    hashMap.put(key, String.valueOf(value));
                }
            }
        }
        return hashMap;
    }

    public boolean a() {
        return this.b == 1;
    }

    public boolean b() {
        return this.b == 1 && this.d == 0;
    }

    public final void a(String str, Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "57cfe70a643c2ada4d16d84f50c34021", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "57cfe70a643c2ada4d16d84f50c34021");
        } else if (!TextUtils.isEmpty(str)) {
            com.sankuai.waimai.store.util.monitor.c.a(new RaptorMonitorImpl(str), null, null, a(map));
        } else if (c()) {
            throw new RuntimeException("MEDQualityMonitorReporter => key值不能为空！");
        }
    }

    public final void b(String str, Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "35fa9c49fdfe3bb0fe08e20a536da15a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "35fa9c49fdfe3bb0fe08e20a536da15a");
        } else if (!TextUtils.isEmpty(str)) {
            com.sankuai.waimai.store.util.monitor.c.b(new RaptorMonitorImpl(str), null, null, a(map));
        } else if (c()) {
            throw new RuntimeException("MEDQualityMonitorReporter => key值不能为空！");
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class RaptorMonitorImpl implements IMonitor {
        public static ChangeQuickRedirect a;
        private String b;

        @Override // com.sankuai.waimai.store.util.monitor.monitor.IMonitor
        public final boolean a() {
            return false;
        }

        @Override // com.sankuai.waimai.store.util.monitor.monitor.IMonitor
        public String name() {
            return "";
        }

        public RaptorMonitorImpl(@NonNull String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5852aa690803f58e5b4b1e3f3df6dec7", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5852aa690803f58e5b4b1e3f3df6dec7");
            } else {
                this.b = str;
            }
        }

        @Override // com.sankuai.waimai.store.util.monitor.monitor.IMonitor
        public final com.sankuai.waimai.store.util.monitor.monitor.c b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4635dd6450b7af4c3aba31079ade3c9f", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.util.monitor.monitor.c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4635dd6450b7af4c3aba31079ade3c9f") : new com.sankuai.waimai.store.util.monitor.monitor.c() { // from class: com.sankuai.waimai.drug.MEDQualityMonitorReporter.RaptorMonitorImpl.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.util.monitor.monitor.c
                public final String a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "999232d3d5b7db7aed7d8470ccf7cb40", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "999232d3d5b7db7aed7d8470ccf7cb40") : RaptorMonitorImpl.this.b;
                }
            };
        }
    }
}

package com.sankuai.waimai.platform.capacity.deeplink;

import android.os.SystemClock;
import com.meituan.android.common.babel.Babel;
import com.meituan.android.common.kitefly.Log;
import com.meituan.android.common.unionid.oneid.util.DeviceInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class e implements Serializable {
    public static ChangeQuickRedirect a;
    private static final Executor d = com.sankuai.android.jarvis.c.b();
    final long b;
    public boolean c;
    private final Map<String, Object> e;
    private final Set<String> f;

    public e(long j, String str, boolean z) {
        Object[] objArr = {new Long(j), str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "26bded0be587e2e2e6f1cb4bf23773e1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "26bded0be587e2e2e6f1cb4bf23773e1");
            return;
        }
        this.f = new CopyOnWriteArraySet();
        this.b = j;
        this.e = new ConcurrentHashMap();
        this.e.put("originalURL", str);
        this.e.put("launchType", "old");
        this.e.put(DeviceInfo.PRIVACYMODE, Integer.valueOf(com.sankuai.waimai.platform.model.c.a().b()));
        this.e.put("launchStatus", Integer.valueOf(z ? 2 : 1));
    }

    public final void a(final String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b210e893343a56734ce6ebe6eb532ab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b210e893343a56734ce6ebe6eb532ab");
        } else if (this.c) {
            new StringBuilder("ignore cancelled task for step:").append(str);
        } else if (!this.f.add(str)) {
            new StringBuilder("duplicated step:").append(str);
        } else {
            new StringBuilder("add step:").append(str);
            final long elapsedRealtime = SystemClock.elapsedRealtime() - this.b;
            com.sankuai.waimai.launcher.util.aop.b.a(d, new Runnable() { // from class: com.sankuai.waimai.platform.capacity.deeplink.e.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "de08dc3c57c85277cd0450c79e1d60b1", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "de08dc3c57c85277cd0450c79e1d60b1");
                    } else {
                        e.this.a(str, elapsedRealtime, null);
                    }
                }
            });
        }
    }

    public final boolean b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "31e597b404c5b8e0ef8cf00d3400ee86", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "31e597b404c5b8e0ef8cf00d3400ee86")).booleanValue() : this.f.add(str);
    }

    public final void a(String str, long j, Map<String, Object> map) {
        Map<String, Object> map2;
        Object[] objArr = {str, new Long(j), map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da8a18df3037ce71e046d9b2ebcb1520", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da8a18df3037ce71e046d9b2ebcb1520");
            return;
        }
        Log.Builder a2 = b.a("waimai_deeplink", "mobile.waimai.deeplink." + str, j);
        if (map != null) {
            map2 = new HashMap<>(this.e);
            map2.putAll(map);
        } else {
            map2 = this.e;
        }
        a2.optional(map2);
        new StringBuilder("HotLaunchTask reportStep: ").append(str);
        Babel.log(a2.build());
    }
}

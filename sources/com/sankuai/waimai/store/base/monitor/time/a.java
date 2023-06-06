package com.sankuai.waimai.store.base.monitor.time;

import android.app.Activity;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.ArrayMap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.config.k;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static final Map<String, String> b = new ArrayMap();
    private final Map<String, Map<String, Long>> c;

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ebf25b15cc9c2a8a567175bfaa7eef2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ebf25b15cc9c2a8a567175bfaa7eef2");
        }
    }

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "65258904148d47409aa477c91bbddd3c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "65258904148d47409aa477c91bbddd3c");
        } else {
            this.c = new ConcurrentHashMap();
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.store.base.monitor.time.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C1139a {
        private static final a a = new a();
    }

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f9ddbdc16476c60ad2600d74cc04f76e", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f9ddbdc16476c60ad2600d74cc04f76e") : C1139a.a;
    }

    public final void a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0145ad07d5d050d9e6eed6600e61f1f4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0145ad07d5d050d9e6eed6600e61f1f4");
            return;
        }
        Map<String, Long> b2 = b(c(activity));
        if (b2 == null || b2.containsKey("onLocationStart")) {
            return;
        }
        b2.put("onLocationStart", Long.valueOf(SystemClock.elapsedRealtime()));
    }

    public final void b(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cda8fca57709e8c54dbdf9b083aaba1c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cda8fca57709e8c54dbdf9b083aaba1c");
            return;
        }
        Map<String, Long> b2 = b(c(activity));
        if (b2 == null || b2.containsKey("onLocationFinish")) {
            return;
        }
        b2.put("onLocationFinish", Long.valueOf(SystemClock.elapsedRealtime()));
    }

    public Map<String, Long> b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b6bbee0b0c56aaa336e84832eb8c1f9", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b6bbee0b0c56aaa336e84832eb8c1f9");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Map<String, Long> map = this.c.get(str);
        if (map == null) {
            Map<String, Long> synchronizedMap = Collections.synchronizedMap(new LinkedHashMap());
            this.c.put(str, synchronizedMap);
            return synchronizedMap;
        }
        return map;
    }

    public String c(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa45928003dd7758504b7fcd43e47008", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa45928003dd7758504b7fcd43e47008") : (b() || activity == null) ? "" : activity.getClass().getSimpleName();
    }

    private boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f590c9423511394209c7284cbd3c4f7c", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f590c9423511394209c7284cbd3c4f7c")).booleanValue() : !k.a();
    }

    public final void d(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b3155a722e99511f1fc2fd2ce2b6c0d8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b3155a722e99511f1fc2fd2ce2b6c0d8");
            return;
        }
        String c = c(activity);
        if (TextUtils.isEmpty(c)) {
            return;
        }
        this.c.remove(c);
    }
}

package com.meituan.android.neohybrid.core.horn;

import android.os.Build;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.android.common.horn.Horn;
import com.meituan.android.common.horn.HornCallback;
import com.meituan.android.common.unionid.oneid.util.DeviceInfo;
import com.meituan.android.neohybrid.util.p;
import com.meituan.metrics.util.DeviceUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a {
    public static ChangeQuickRedirect a;
    Map<Class, Object> b;
    public Map<Class, List<b>> c;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface b<T> {
        void a(Class cls, T t);
    }

    public static /* synthetic */ void a(a aVar, Class cls) {
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "4f2db50cfee94d3bb010d6bf819d9be4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "4f2db50cfee94d3bb010d6bf819d9be4");
            return;
        }
        List<b> list = aVar.c.get(cls);
        if (list == null || list.isEmpty()) {
            return;
        }
        for (b bVar : list) {
            if (bVar != null) {
                bVar.a(cls, aVar.a(cls));
            }
        }
    }

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf5e3698dcab7d74d362f649042b2c0e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf5e3698dcab7d74d362f649042b2c0e");
            return;
        }
        this.b = new ConcurrentHashMap();
        this.c = new HashMap();
    }

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "766236d7db714b164bdbb55c30f16fd2", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "766236d7db714b164bdbb55c30f16fd2") : C0303a.a;
    }

    public final void a(String str, Class cls) {
        Object[] objArr = {str, cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b295b563a0ba9b5a6eb0a9503e44d26", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b295b563a0ba9b5a6eb0a9503e44d26");
            return;
        }
        b(str, cls);
        com.meituan.android.neohybrid.init.a.c().s().a(com.meituan.android.neohybrid.core.horn.b.a(this, str, cls));
    }

    public final <T> T a(@NonNull Class<T> cls) {
        T newInstance;
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "23a7d611b9f95ffca75b62bb6f5aaa4f", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "23a7d611b9f95ffca75b62bb6f5aaa4f");
        }
        T t = (T) this.b.get(cls);
        if (t == null) {
            try {
                newInstance = cls.newInstance();
            } catch (Exception e) {
                e = e;
            }
            try {
                if (Build.VERSION.SDK_INT >= 24) {
                    this.b.putIfAbsent(cls, newInstance);
                } else if (this.b.get(cls) == null) {
                    this.b.put(cls, newInstance);
                }
                return newInstance;
            } catch (Exception e2) {
                e = e2;
                t = newInstance;
                com.meituan.android.neohybrid.neo.report.b.a(e, "HornConfigService_getConfig", (Map<String, Object>) null);
                return t;
            }
        }
        return t;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public <T> void b(String str, Class<T> cls) {
        Object[] objArr = {str, cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c8f5920412e23613bba10b841ad2268", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c8f5920412e23613bba10b841ad2268");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("hybrid_user_id", com.meituan.android.neohybrid.init.a.c().i());
        hashMap.put("pay_sdk_version", com.meituan.android.neohybrid.init.a.c().q());
        hashMap.put("hybrid_net_type", com.meituan.android.paybase.utils.b.a());
        hashMap.put("channel", com.meituan.android.neohybrid.init.a.c().c());
        hashMap.put("debug", com.meituan.android.neohybrid.init.a.h() ? "1" : "0");
        hashMap.put("manufacture", Build.MANUFACTURER);
        hashMap.put(DeviceInfo.DEVICE_MODEL, Build.MODEL);
        hashMap.put("device_level", String.valueOf(DeviceUtil.getDeviceLevel(com.meituan.android.neohybrid.init.a.d())));
        hashMap.put("chrome_version", p.b(com.meituan.android.neohybrid.init.a.d()));
        hashMap.put("chrome_version_core", p.a(com.meituan.android.neohybrid.init.a.d()));
        Horn.register(str, new c(cls), hashMap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public class c<T> implements HornCallback {
        public static ChangeQuickRedirect a;
        private final Class<T> c;

        public c(Class<T> cls) {
            Object[] objArr = {a.this, cls};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ffab2f886df67ab628dc091fe5bfe1d3", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ffab2f886df67ab628dc091fe5bfe1d3");
            } else {
                this.c = cls;
            }
        }

        @Override // com.meituan.android.common.horn.HornCallback
        public final void onChanged(boolean z, String str) {
            Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d8358d6ea9254800f834ef30793836a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d8358d6ea9254800f834ef30793836a");
            } else if (!z || TextUtils.isEmpty(str)) {
            } else {
                try {
                    a.this.b.put(this.c, com.meituan.android.neohybrid.util.gson.b.a().fromJson(str, (Class<Object>) this.c));
                    a.a(a.this, this.c);
                } catch (Exception e) {
                    com.meituan.android.neohybrid.neo.report.b.a(e, "HornConfigService_onChanged", (Map<String, Object>) null);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* renamed from: com.meituan.android.neohybrid.core.horn.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0303a {
        private static final a a = new a();
    }
}

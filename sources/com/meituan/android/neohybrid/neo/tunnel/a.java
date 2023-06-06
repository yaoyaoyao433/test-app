package com.meituan.android.neohybrid.neo.tunnel;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.google.gson.JsonObject;
import com.meituan.android.neohybrid.base.param.c;
import com.meituan.android.neohybrid.core.config.NeoConfig;
import com.meituan.android.neohybrid.util.gson.b;
import com.meituan.android.neohybrid.util.l;
import com.meituan.android.paybase.utils.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a extends c {
    public static ChangeQuickRedirect e;
    private static final List<String> f = Arrays.asList(NeoConfig.NEO_SCENE, "neo_nsr", NeoConfig.NEO_CONFIG);

    public a() {
    }

    @Override // com.meituan.android.neohybrid.base.param.c
    public final synchronized void a(Object obj, String str, Object obj2) {
        Object[] objArr = {obj, str, obj2};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c6647b96dc1e77dfb169325e1ff1729", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c6647b96dc1e77dfb169325e1ff1729");
            return;
        }
        if (com.meituan.android.neohybrid.init.a.h() && d(str)) {
            throw new IllegalArgumentException("Prefix of key like app_/neo_/device_/usr_ is reserved");
        }
        super.a(obj, str, obj2);
    }

    @Override // com.meituan.android.neohybrid.base.param.c
    public final synchronized void a(Object obj, Map<String, ?> map) {
        Object[] objArr = {obj, map};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e1e83149549093751a3b1534a87ca36", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e1e83149549093751a3b1534a87ca36");
            return;
        }
        if (com.meituan.android.neohybrid.init.a.h() && !i.a(map)) {
            for (String str : map.keySet()) {
                if (d(str)) {
                    throw new IllegalArgumentException("Prefix of key like app_/neo_/device_/usr_ is reserved");
                }
            }
        }
        super.a(obj, map);
    }

    private boolean d(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ceeda8a10ff025bc5c8df7cf6a8a24a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ceeda8a10ff025bc5c8df7cf6a8a24a")).booleanValue();
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (str.startsWith("usr_") || str.startsWith("device_") || str.startsWith("app_")) {
                return true;
            }
            return str.startsWith("neo_") && !f.contains(str);
        }
        return true;
    }

    public final synchronized JsonObject c(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "44a903a18a1a7ad262b3842c77e21966", RobustBitConfig.DEFAULT_VALUE)) {
            return (JsonObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "44a903a18a1a7ad262b3842c77e21966");
        }
        return (JsonObject) b.a().fromJson(b.a().toJson(b(obj)), (Class<Object>) JsonObject.class);
    }

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "67f2f85bd30a5716c058694c75957592", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "67f2f85bd30a5716c058694c75957592") : C0310a.a;
    }

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.android.neohybrid.neo.tunnel.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0310a {
        private static final a a = new a();
    }

    public final synchronized void a(Object obj, Intent intent) {
        Object[] objArr = {obj, intent};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d5ce5620d8c9f72b7690ad27facdc1ec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d5ce5620d8c9f72b7690ad27facdc1ec");
        } else if (obj == null || intent == null) {
        } else {
            Uri data = intent.getData();
            if (data == null) {
                return;
            }
            HashMap hashMap = new HashMap();
            l.a(data, hashMap);
            if (!i.a(hashMap)) {
                a().a(obj, hashMap);
            }
        }
    }

    public final synchronized void b(Object obj, Intent intent) {
        Object[] objArr = {obj, intent};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a16f596ed7cc79d2c4a3d9917abab54", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a16f596ed7cc79d2c4a3d9917abab54");
        } else if (obj == null || intent == null) {
        } else {
            Bundle bundleExtra = intent.getBundleExtra("_neo_data");
            if (bundleExtra == null) {
                return;
            }
            a(obj, bundleExtra.getBundle("neo_json_data"), bundleExtra.getBundle("neo_string_data"));
        }
    }

    public final synchronized void a(Object obj, Bundle bundle) {
        Object[] objArr = {obj, bundle};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ecff2b5427481adc3f888f355146abe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ecff2b5427481adc3f888f355146abe");
        } else if (obj == null || bundle == null) {
        } else {
            a(obj, bundle.getBundle("neo_json_data"), bundle.getBundle("neo_string_data"));
        }
    }

    private synchronized void a(Object obj, Bundle bundle, Bundle bundle2) {
        Object[] objArr = {obj, bundle, bundle2};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bdecf811086f1aa4608f2ff2cf617ef3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bdecf811086f1aa4608f2ff2cf617ef3");
            return;
        }
        HashMap hashMap = new HashMap();
        if (bundle != null && !bundle.isEmpty()) {
            for (String str : bundle.keySet()) {
                try {
                    hashMap.put(str, b.a().fromJson(String.valueOf(bundle.get(str)), (Class<Object>) JsonObject.class));
                } catch (Exception unused) {
                }
            }
        }
        if (bundle2 != null && !bundle2.isEmpty()) {
            for (String str2 : bundle2.keySet()) {
                try {
                    hashMap.put(str2, String.valueOf(bundle2.get(str2)));
                } catch (Exception unused2) {
                }
            }
        }
        if (!i.a(hashMap)) {
            a().a(obj, hashMap);
        }
    }
}

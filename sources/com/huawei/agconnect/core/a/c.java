package com.huawei.agconnect.core.a;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import com.huawei.agconnect.core.ServiceDiscovery;
import com.meituan.robust.common.CommonConstant;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class c {
    private Context a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(Context context) {
        this.a = context;
    }

    private static <T extends com.huawei.agconnect.core.b> T a(String str) {
        StringBuilder sb;
        String localizedMessage;
        try {
            Class<?> cls = Class.forName(str);
            if (com.huawei.agconnect.core.b.class.isAssignableFrom(cls)) {
                return (T) Class.forName(str).newInstance();
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(cls);
            sb2.append(" must extends from ServiceRegistrar.");
            Log.e("ServiceRegistrarParser", sb2.toString());
            return null;
        } catch (ClassNotFoundException e) {
            sb = new StringBuilder("Can not found service class, ");
            localizedMessage = e.getMessage();
            sb.append(localizedMessage);
            Log.e("ServiceRegistrarParser", sb.toString());
            return null;
        } catch (IllegalAccessException e2) {
            sb = new StringBuilder("instantiate service class exception ");
            localizedMessage = e2.getLocalizedMessage();
            sb.append(localizedMessage);
            Log.e("ServiceRegistrarParser", sb.toString());
            return null;
        } catch (InstantiationException e3) {
            sb = new StringBuilder("instantiate service class exception ");
            localizedMessage = e3.getLocalizedMessage();
            sb.append(localizedMessage);
            Log.e("ServiceRegistrarParser", sb.toString());
            return null;
        }
    }

    private List<String> b() {
        StringBuilder sb;
        ArrayList arrayList = new ArrayList();
        Bundle c = c();
        if (c == null) {
            return arrayList;
        }
        HashMap hashMap = new HashMap(10);
        for (String str : c.keySet()) {
            if ("com.huawei.agconnect.core.ServiceRegistrar".equals(c.getString(str))) {
                String[] split = str.split(CommonConstant.Symbol.COLON);
                if (split.length == 2) {
                    try {
                        hashMap.put(split[0], Integer.valueOf(split[1]));
                    } catch (NumberFormatException e) {
                        sb = new StringBuilder("registrar configuration format error:");
                        str = e.getMessage();
                    }
                } else if (split.length == 1) {
                    hashMap.put(split[0], 1000);
                } else {
                    sb = new StringBuilder("registrar configuration error, ");
                    sb.append(str);
                    Log.e("ServiceRegistrarParser", sb.toString());
                }
            }
        }
        ArrayList<Map.Entry> arrayList2 = new ArrayList(hashMap.entrySet());
        Collections.sort(arrayList2, new b());
        for (Map.Entry entry : arrayList2) {
            arrayList.add(entry.getKey());
        }
        return arrayList;
    }

    private Bundle c() {
        ServiceInfo serviceInfo;
        PackageManager packageManager = this.a.getPackageManager();
        if (packageManager == null) {
            return null;
        }
        try {
            serviceInfo = packageManager.getServiceInfo(new ComponentName(this.a, ServiceDiscovery.class), 128);
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("ServiceRegistrarParser", "get ServiceDiscovery exception." + e.getLocalizedMessage());
        }
        if (serviceInfo == null) {
            Log.e("ServiceRegistrarParser", "Can not found ServiceDiscovery service.");
            return null;
        }
        return serviceInfo.metaData;
    }

    public final List<com.huawei.agconnect.core.a> a() {
        List<com.huawei.agconnect.core.a> a2;
        List<String> b2 = b();
        ArrayList arrayList = new ArrayList();
        for (String str : b2) {
            com.huawei.agconnect.core.b a3 = a(str);
            if (a3 != null && (a2 = a3.a(this.a)) != null) {
                arrayList.addAll(a2);
            }
        }
        new StringBuilder("services:").append(Integer.valueOf(arrayList.size()));
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class b implements Serializable, Comparator<Map.Entry<String, Integer>> {
        private b() {
        }

        @Override // java.util.Comparator
        public final /* synthetic */ int compare(Map.Entry<String, Integer> entry, Map.Entry<String, Integer> entry2) {
            return entry.getValue().intValue() - entry2.getValue().intValue();
        }
    }
}

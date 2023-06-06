package com.meituan.android.mrn.containerplugin;

import android.text.TextUtils;
import com.meituan.android.mrn.containerplugin.config.PluginBean;
import com.meituan.android.mrn.containerplugin.plugin.MinVersionPlugin;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b {
    public static ChangeQuickRedirect a;
    private static Map<String, Class<? extends com.meituan.android.mrn.containerplugin.plugincore.a>> b = new HashMap();
    private static Map<String, Class<? extends com.meituan.android.mrn.containerplugin.plugincore.a>> c = new HashMap();

    static {
        b.put(MinVersionPlugin.NAME, MinVersionPlugin.class);
    }

    public static List<com.meituan.android.mrn.containerplugin.plugincore.a> a(String str) {
        List<PluginBean> arrayList;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a9fab0ac5ffea87629377fc5d3a646d8", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a9fab0ac5ffea87629377fc5d3a646d8");
        }
        com.meituan.android.mrn.containerplugin.config.a aVar = com.meituan.android.mrn.containerplugin.config.a.b;
        Object[] objArr2 = {str};
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.mrn.containerplugin.config.a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "dd45c61e8dde96d81a111456d2909ef2", RobustBitConfig.DEFAULT_VALUE)) {
            arrayList = (List) PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "dd45c61e8dde96d81a111456d2909ef2");
        } else if (TextUtils.isEmpty(str) || aVar.c == null) {
            arrayList = new ArrayList<>();
        } else {
            arrayList = aVar.c.get(str);
        }
        if (arrayList == null) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        for (PluginBean pluginBean : arrayList) {
            String str2 = pluginBean.name;
            if (b.containsKey(str2)) {
                try {
                    com.meituan.android.mrn.containerplugin.plugincore.a newInstance = b.get(str2).newInstance();
                    newInstance.a(pluginBean.config);
                    arrayList2.add(newInstance);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InstantiationException e2) {
                    e2.printStackTrace();
                }
            } else {
                List a2 = com.sankuai.meituan.serviceloader.b.a(com.meituan.android.mrn.containerplugin.plugincore.a.class, str2);
                if (a2 != null && a2.size() > 0) {
                    arrayList2.add(a2.get(0));
                    if (a2.size() > 1) {
                        throw new RuntimeException(str2 + " is not exist");
                    }
                } else {
                    throw new RuntimeException(str2 + " is not exist");
                }
            }
        }
        if (arrayList2.size() <= 0) {
            return arrayList2;
        }
        Iterator it = arrayList2.iterator();
        HashMap hashMap = new HashMap();
        while (it.hasNext()) {
            com.meituan.android.mrn.containerplugin.plugincore.a aVar2 = (com.meituan.android.mrn.containerplugin.plugincore.a) it.next();
            if (!TextUtils.isEmpty(null)) {
                if (((com.meituan.android.mrn.containerplugin.plugincore.a) hashMap.get(null)) == null) {
                    hashMap.put(null, aVar2);
                }
                it.remove();
            }
        }
        arrayList2.addAll(hashMap.values());
        if (hashMap.containsKey("Loading")) {
            for (Map.Entry<String, Class<? extends com.meituan.android.mrn.containerplugin.plugincore.a>> entry : c.entrySet()) {
                if (!hashMap.containsKey(entry.getKey())) {
                    try {
                        arrayList2.add(entry.getValue().newInstance());
                    } catch (IllegalAccessException e3) {
                        e3.printStackTrace();
                    } catch (InstantiationException e4) {
                        e4.printStackTrace();
                    }
                }
            }
        }
        return arrayList2;
    }
}

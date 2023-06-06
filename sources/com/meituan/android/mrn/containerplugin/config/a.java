package com.meituan.android.mrn.containerplugin.config;

import android.content.Context;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import com.meituan.android.cipstorage.q;
import com.meituan.android.common.horn.Horn;
import com.meituan.android.common.horn.HornCallback;
import com.meituan.android.mrn.config.c;
import com.meituan.android.mrn.utils.b;
import com.meituan.android.mrn.utils.k;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public static a b = new a();
    public Map<String, List<PluginBean>> c;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "46b9b39eceb1ccce0edcd107728c8d64", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "46b9b39eceb1ccce0edcd107728c8d64");
        } else {
            this.c = new HashMap();
        }
    }

    public final synchronized void a(Context context) {
        boolean b2;
        String str;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c2b29de45ce1d07bd52b6f4a4b66922", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c2b29de45ce1d07bd52b6f4a4b66922");
            return;
        }
        List<PluginConfigBean> list = null;
        Object[] objArr2 = {context};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f7070625ea019e2ed4b0774b6d3503a9", RobustBitConfig.DEFAULT_VALUE)) {
            b2 = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f7070625ea019e2ed4b0774b6d3503a9")).booleanValue();
        } else {
            b2 = q.a(context, "mrn_cache", 0).b(b.a(context) + b.b(context) + "plugin_init", false);
        }
        if (!b2) {
            String a2 = k.a(context, "mrnbundle/mrn_container_plugin.json", true);
            if (!TextUtils.isEmpty(a2)) {
                List<PluginConfigBean> list2 = (List) new Gson().fromJson(a2, new TypeToken<List<PluginConfigBean>>() { // from class: com.meituan.android.mrn.containerplugin.config.a.1
                }.getType());
                a(list2);
                list = list2;
            }
            Object[] objArr3 = {context, (byte) 1};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "385a4f68636a4a8ecaa538a9330b704f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "385a4f68636a4a8ecaa538a9330b704f");
            } else {
                q.a(context, "mrn_cache", 0).a(b.a(context) + b.b(context) + "plugin_init", true);
            }
        }
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = a;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "5361d994487e4c5c2277247b2ae43524", RobustBitConfig.DEFAULT_VALUE)) {
            str = (String) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "5361d994487e4c5c2277247b2ae43524");
        } else {
            str = "mrn-container-plugin_android_" + c.a().e();
        }
        HornCallback hornCallback = new HornCallback() { // from class: com.meituan.android.mrn.containerplugin.config.a.2
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.common.horn.HornCallback
            public final void onChanged(boolean z, String str2) {
                Object[] objArr5 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str2};
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "83368fb436d28bdcb9308ef1e2b65f00", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "83368fb436d28bdcb9308ef1e2b65f00");
                } else if (!z || TextUtils.isEmpty(str2)) {
                } else {
                    try {
                        JsonElement parse = new JsonParser().parse(str2);
                        if (parse.isJsonNull()) {
                            return;
                        }
                        JsonObject asJsonObject = parse.getAsJsonObject();
                        if (asJsonObject.has("bundles")) {
                            a.this.a((List) new Gson().fromJson(asJsonObject.get("bundles"), new TypeToken<List<PluginConfigBean>>() { // from class: com.meituan.android.mrn.containerplugin.config.a.2.1
                            }.getType()));
                        }
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
            }
        };
        Horn.register(str, hornCallback);
        if (list == null || list.size() <= 0) {
            String accessCache = Horn.accessCache(str);
            if (!TextUtils.isEmpty(accessCache)) {
                hornCallback.onChanged(true, accessCache);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(List<PluginConfigBean> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "661e4ba2dc92a8034501a0ffcc00a83c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "661e4ba2dc92a8034501a0ffcc00a83c");
        } else if (list != null && list.size() > 0) {
            for (PluginConfigBean pluginConfigBean : list) {
                this.c.put(pluginConfigBean.name, pluginConfigBean.plugins);
            }
        }
    }
}

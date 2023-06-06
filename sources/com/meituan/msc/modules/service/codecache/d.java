package com.meituan.msc.modules.service.codecache;

import android.content.Context;
import com.google.gson.reflect.TypeToken;
import com.meituan.met.mercury.load.bean.DDLoadConstants;
import com.meituan.msc.extern.MSCEnvHelper;
import com.meituan.msc.modules.reporter.MSCReporter;
import com.meituan.msc.modules.reporter.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class d {
    public static ChangeQuickRedirect a;
    com.meituan.msc.common.utils.collection.a<String, CodeCacheUsageInfo> b;
    private final com.meituan.msc.modules.preload.executor.e c;

    public d(final Context context, com.meituan.msc.modules.preload.executor.e eVar) {
        Object[] objArr = {context, eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e9158ad928044b1364aaf4801bc7ba8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e9158ad928044b1364aaf4801bc7ba8");
            return;
        }
        this.b = new com.meituan.msc.common.utils.collection.a<String, CodeCacheUsageInfo>(context, com.meituan.msc.common.utils.e.a(context), "CodeCacheUsageInfo", new TypeToken<Map<String, CodeCacheUsageInfo>>() { // from class: com.meituan.msc.modules.service.codecache.d.2
        }.getType()) { // from class: com.meituan.msc.modules.service.codecache.d.1
            public static ChangeQuickRedirect l;

            @Override // com.meituan.msc.common.utils.collection.a, com.meituan.msc.common.utils.collection.b
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = l;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0e44cd30a1f825436b3535a5e56f36e7", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0e44cd30a1f825436b3535a5e56f36e7");
                    return;
                }
                super.a();
                for (CodeCacheUsageInfo codeCacheUsageInfo : this.b.values()) {
                    codeCacheUsageInfo.attachLocalCacheMap(d.this.b);
                }
            }
        };
        this.c = eVar;
        this.c.b(new com.meituan.msc.modules.preload.executor.c("initCodeCacheUsageInfo") { // from class: com.meituan.msc.modules.service.codecache.d.3
            public static ChangeQuickRedirect a;

            @Override // com.meituan.msc.modules.preload.executor.c
            public final void a(com.meituan.msc.modules.preload.executor.d dVar) {
                Object[] objArr2 = {dVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e7e82b5bbd46138981fce2a5ad054e92", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e7e82b5bbd46138981fce2a5ad054e92");
                    return;
                }
                d dVar2 = d.this;
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = d.a;
                if (PatchProxy.isSupport(objArr3, dVar2, changeQuickRedirect3, false, "f8199d5ffd3e5d16bfdde53f0c65ad69", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, dVar2, changeQuickRedirect3, false, "f8199d5ffd3e5d16bfdde53f0c65ad69");
                } else {
                    for (CodeCacheUsageInfo codeCacheUsageInfo : dVar2.b.values()) {
                        if (!new File(codeCacheUsageInfo.getCodeCacheFile()).exists()) {
                            codeCacheUsageInfo.setMarkedToRemove(true);
                        }
                    }
                }
                d.this.a(context);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String a(String str, String str2, String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "90f44906a341d6e7fc4a837a6dae0a3f", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "90f44906a341d6e7fc4a837a6dae0a3f");
        }
        return str + str2 + str3;
    }

    public final void b(String str, String str2, String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f1e9c8b6dec22dc4ad8b2d02ae389416", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f1e9c8b6dec22dc4ad8b2d02ae389416");
            return;
        }
        CodeCacheUsageInfo codeCacheUsageInfo = this.b.get(a(str, str2, str3));
        if (codeCacheUsageInfo == null) {
            return;
        }
        codeCacheUsageInfo.usageCountIncrement();
        codeCacheUsageInfo.setLastUseTimeInMs(System.currentTimeMillis());
    }

    public final void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "20f87acd9f27a25993e4cce50188ce26", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "20f87acd9f27a25993e4cce50188ce26");
            return;
        }
        long b = com.meituan.msc.common.utils.e.a(context).b("codecache_last_report_time", 0L);
        CodeCacheConfig codeCacheConfig = CodeCacheConfig.d;
        if (System.currentTimeMillis() - b < CodeCacheConfig.f() * DDLoadConstants.TIME_HOURS_MILLIS) {
            return;
        }
        HashMap hashMap = new HashMap();
        for (CodeCacheUsageInfo codeCacheUsageInfo : this.b.values()) {
            String str = codeCacheUsageInfo.getAppId() + codeCacheUsageInfo.getAppVersion();
            List list = (List) hashMap.get(str);
            if (list == null) {
                list = new ArrayList();
                hashMap.put(str, list);
            }
            list.add(codeCacheUsageInfo);
        }
        MSCReporter mSCReporter = new MSCReporter();
        ArrayList arrayList = new ArrayList();
        for (List<CodeCacheUsageInfo> list2 : hashMap.values()) {
            CodeCacheUsageInfo codeCacheUsageInfo2 = (CodeCacheUsageInfo) list2.get(0);
            JSONObject jSONObject = new JSONObject();
            try {
                for (CodeCacheUsageInfo codeCacheUsageInfo3 : list2) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("fileSize", codeCacheUsageInfo3.getFileSize());
                    jSONObject2.put("lastUseTime", codeCacheUsageInfo3.getLastUseTimeInMs());
                    jSONObject2.put("usageCount", codeCacheUsageInfo3.getUsageCount());
                    jSONObject2.put("createTime", codeCacheUsageInfo3.getCreateTimeInMs());
                    jSONObject.put(codeCacheUsageInfo3.getPackageName() + "/" + codeCacheUsageInfo3.getJsFileRelativePath(), jSONObject2);
                }
            } catch (JSONException e) {
                g.a(" CodeCacheUsageInfo", e);
            }
            arrayList.add(mSCReporter.b("msc.codecache.usage").a("env", MSCEnvHelper.getEnvInfo().isProdEnv() ? "prod" : "test").a("mscAppId", codeCacheUsageInfo2.getAppId()).a("mscAppVersion", codeCacheUsageInfo2.getAppVersion()).a("USAGE", jSONObject));
        }
        Object[] objArr2 = {arrayList};
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msc.common.report.a.a;
        if (PatchProxy.isSupport(objArr2, mSCReporter, changeQuickRedirect2, false, "6270244cc967c2e0dab1a852b1a3a085", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, mSCReporter, changeQuickRedirect2, false, "6270244cc967c2e0dab1a852b1a3a085");
        } else if (!arrayList.isEmpty()) {
            mSCReporter.a((List<com.meituan.msc.common.report.d>) arrayList, false);
        }
        com.meituan.msc.common.utils.e.a(context).a("codecache_last_report_time", System.currentTimeMillis());
        a();
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c152d1da2cdf27e6417ab732520d0cd1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c152d1da2cdf27e6417ab732520d0cd1");
            return;
        }
        ArrayList<String> arrayList = new ArrayList();
        for (Map.Entry<String, CodeCacheUsageInfo> entry : this.b.entrySet()) {
            if (entry.getValue().isMarkedToRemove()) {
                arrayList.add(entry.getKey());
            }
        }
        for (String str : arrayList) {
            this.b.remove(str);
        }
    }
}

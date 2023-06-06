package com.sankuai.waimai.bussiness.order.list.knb;

import com.dianping.titans.js.jshandler.BaseJsHandler;
import com.meituan.android.singleton.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.h;
import com.sankuai.waimai.foundation.utils.log.a;
import com.sankuai.waimai.platform.utils.l;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class GetAppCacheSize extends BaseJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public String getSignature() {
        return "ECmism6dEChKVl7R/y59crXQiCjpp2cffWlrJYV0KQaPi3p5393grSapeF/D8rlPXm/srTPWHcFAzVS0vWnmHw==";
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "76f77265b299641f4c4e41eed640770c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "76f77265b299641f4c4e41eed640770c");
        } else {
            getCacheSize();
        }
    }

    public void getCacheSize() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7ee0276960425eda8d3a927cd7a0560d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7ee0276960425eda8d3a927cd7a0560d");
        } else {
            l.a(new l.c<Long>() { // from class: com.sankuai.waimai.bussiness.order.list.knb.GetAppCacheSize.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.platform.utils.l.c
                public final /* synthetic */ void a(Long l) {
                    Long l2 = l;
                    Object[] objArr2 = {l2};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "a1e233a85130113826317644c190db2c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "a1e233a85130113826317644c190db2c");
                        return;
                    }
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("sizeCallback", GetAppCacheSize.this.getCacheSizeTxt(l2.longValue()));
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    GetAppCacheSize.this.jsCallback(jSONObject);
                }

                private long a(File file) {
                    Object[] objArr2 = {file};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "24e0496283cee8f6475df0b71b433c6f", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Long) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "24e0496283cee8f6475df0b71b433c6f")).longValue();
                    }
                    long j = 0;
                    if (file == null) {
                        return 0L;
                    }
                    if (!file.isDirectory()) {
                        return file.length();
                    }
                    File[] listFiles = file.listFiles();
                    if (listFiles == null) {
                        return 0L;
                    }
                    for (File file2 : listFiles) {
                        j += a(file2);
                    }
                    return j;
                }

                /* JADX INFO: Access modifiers changed from: private */
                @Override // com.sankuai.waimai.platform.utils.l.c
                /* renamed from: b */
                public Long a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "28686e2483df2991792f29d9c68483db", RobustBitConfig.DEFAULT_VALUE)) {
                        return (Long) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "28686e2483df2991792f29d9c68483db");
                    }
                    try {
                        return Long.valueOf(a(b.a.getCacheDir()));
                    } catch (Exception e) {
                        a.a(e);
                        return 0L;
                    }
                }
            }, "SettingsActivity");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getCacheSizeTxt(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9456455738f72592093e1275a922305b", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9456455738f72592093e1275a922305b");
        }
        if (j <= 0) {
            return "0MB";
        }
        double d = (j / 1024.0d) / 1024.0d;
        if (h.b(Double.valueOf(d), Double.valueOf(0.01d))) {
            return "0MB";
        }
        return h.a(Double.valueOf(d), 2, 2) + "MB";
    }
}

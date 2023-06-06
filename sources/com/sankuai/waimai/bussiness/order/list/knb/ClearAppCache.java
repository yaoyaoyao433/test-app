package com.sankuai.waimai.bussiness.order.list.knb;

import android.app.Activity;
import com.dianping.titans.js.jshandler.BaseJsHandler;
import com.meituan.android.singleton.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.loader.a;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.platform.utils.l;
import java.io.File;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class ClearAppCache extends BaseJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;
    private boolean isClearingCache;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public String getSignature() {
        return "RRSRe9PUZHT9mteVcXdwR+Z1g4J/eItXtVZXIVpFroWB8PW78e1OoTSTJV0X2ERFstH6KaEgutAGSgGmcumHuA==";
    }

    public ClearAppCache() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6c71f8ef8c5b063de8bad39f1776ada6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6c71f8ef8c5b063de8bad39f1776ada6");
        } else {
            this.isClearingCache = false;
        }
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d0e01065e588e4de5a6043ac2c5c8d80", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d0e01065e588e4de5a6043ac2c5c8d80");
        } else {
            clearCache();
        }
    }

    public void clearCache() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "297c7f22cf891f344a5441d1e857965e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "297c7f22cf891f344a5441d1e857965e");
            return;
        }
        final Activity activity = jsHost().getActivity();
        if (activity == null || activity.isFinishing()) {
            return;
        }
        if (this.isClearingCache) {
            ae.a(activity, "正在清除缓存...");
            return;
        }
        this.isClearingCache = true;
        l.a(new Runnable() { // from class: com.sankuai.waimai.bussiness.order.list.knb.ClearAppCache.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "70e6cb089ec2fc074609208155624bfe", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "70e6cb089ec2fc074609208155624bfe");
                } else {
                    a.b();
                }
            }
        }, "SettingsActivity");
        l.a(new l.a() { // from class: com.sankuai.waimai.bussiness.order.list.knb.ClearAppCache.2
            public static ChangeQuickRedirect a;

            private void a(File file) throws IOException {
                Object[] objArr2 = {file};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "f9b65c4061b03590078a1e557fbf1613", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "f9b65c4061b03590078a1e557fbf1613");
                    return;
                }
                File[] listFiles = file.listFiles();
                if (listFiles == null) {
                    throw new IOException("not a readable directory: " + file);
                }
                for (File file2 : listFiles) {
                    if (file2.isDirectory()) {
                        a(file2);
                    }
                    if (!file2.delete()) {
                        throw new IOException("failed to delete file: " + file2);
                    }
                }
            }

            @Override // com.sankuai.waimai.platform.utils.l.a
            public final void b() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "c0863c2891446dedd2f8acadb1df884d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "c0863c2891446dedd2f8acadb1df884d");
                    return;
                }
                ae.a(activity, "缓存已清空");
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("sizeCallback", "0MB");
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                ClearAppCache.this.jsCallback(jSONObject);
                ClearAppCache.this.isClearingCache = false;
            }

            @Override // com.sankuai.waimai.platform.utils.l.a
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "1ed9687416cfdb22ddb250c99bb80d19", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "1ed9687416cfdb22ddb250c99bb80d19");
                    return;
                }
                try {
                    a(b.a.getCacheDir());
                } catch (IOException unused) {
                }
            }
        }, "SettingsActivity");
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler, com.dianping.titans.js.jshandler.JsHandler
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7afe73c4a9b59805e371a38e192b1912", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7afe73c4a9b59805e371a38e192b1912");
            return;
        }
        super.onDestroy();
        this.isClearingCache = false;
    }
}

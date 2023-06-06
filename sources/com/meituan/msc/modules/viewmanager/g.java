package com.meituan.msc.modules.viewmanager;

import android.text.TextUtils;
import com.meituan.dio.easy.DioFile;
import com.meituan.msc.common.utils.r;
import com.meituan.msc.mmpviews.list.msclist.view.TemplateInfo;
import com.meituan.msc.modules.engine.MSCHornRollbackConfig;
import com.meituan.msc.modules.manager.ModuleName;
import com.meituan.msc.modules.manager.k;
import com.meituan.msc.util.perf.PerfTrace;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
@ModuleName(name = "RenderPreloadModule")
/* loaded from: classes3.dex */
public class g extends k {
    public static ChangeQuickRedirect a;
    public final Map<String, List<String>> b;
    public final Map<String, TemplateInfo> c;
    public boolean d;

    public g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d93d56586613687d0d00dbc719ed17cc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d93d56586613687d0d00dbc719ed17cc");
            return;
        }
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = false;
    }

    public final void a(String str, List<String> list) {
        Object[] objArr = {str, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a6b5aca2bc9041e7de759ef9251cb27", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a6b5aca2bc9041e7de759ef9251cb27");
            return;
        }
        synchronized (this.b) {
            this.b.put(str, list);
        }
    }

    public final TemplateInfo a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "196fb063364311fd79a77422d76f16e1", RobustBitConfig.DEFAULT_VALUE)) {
            return (TemplateInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "196fb063364311fd79a77422d76f16e1");
        }
        synchronized (this.c) {
            if (this.c.containsKey(str)) {
                com.meituan.msc.modules.reporter.g.b("optimize-ffp", "Use templates data to render list view from cache for file:", str);
                return this.c.get(str);
            }
            TemplateInfo b = b(str);
            this.c.put(str, b);
            com.meituan.msc.modules.reporter.g.b("optimize-ffp", "Use templates data to render list view from original file:", str);
            return b;
        }
    }

    public final void a(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "415762fa3c3ac8a1febf9196199236c8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "415762fa3c3ac8a1febf9196199236c8");
        } else if (!MSCHornRollbackConfig.i()) {
            try {
                String optString = new JSONObject(str).optString("path", null);
                if (TextUtils.isEmpty(optString)) {
                    com.meituan.msc.modules.reporter.g.b("RenderPreloadModule", "page path is null");
                } else if (U_().r.o(optString) != com.meituan.msc.b.NATIVE) {
                    com.meituan.msc.modules.reporter.g.b("RenderPreloadModule", "renderer type is not mp-native");
                } else {
                    synchronized (this.b) {
                        List<String> list = this.b.get(optString);
                        if (list != null && list.size() != 0) {
                            synchronized (this.c) {
                                for (String str2 : list) {
                                    if (!this.c.containsKey(str2)) {
                                        TemplateInfo b = b(str2);
                                        com.meituan.msc.modules.reporter.g.b("optimize-ffp", "Succeeded to load, parse and cache templates data from file ", str2);
                                        this.c.put(str2, b);
                                    }
                                }
                            }
                            return;
                        }
                        com.meituan.msc.modules.reporter.g.b("RenderPreloadModule", "no templates info");
                    }
                }
            } catch (JSONException e) {
                com.meituan.msc.modules.reporter.g.b("RenderPreloadModule", "get page path error", e);
            }
        }
    }

    private TemplateInfo b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b5a4e553d3ce14d675d03937a396a457", RobustBitConfig.DEFAULT_VALUE)) {
            return (TemplateInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b5a4e553d3ce14d675d03937a396a457");
        }
        TemplateInfo templateInfo = new TemplateInfo();
        try {
            JSONArray jSONArray = new JSONArray(r.a(new DioFile(str)));
            com.meituan.msc.mmpviews.list.debug.a.a(jSONArray);
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                if (jSONObject != null) {
                    String string = jSONObject.getString("itemType");
                    JSONObject jSONObject2 = jSONObject.getJSONObject("dsl");
                    templateInfo.b.put(string, jSONObject.getJSONObject("expression"));
                    PerfTrace.begin("list_load_expression");
                    templateInfo.a.a(templateInfo.b);
                    PerfTrace.end("list_load_expression");
                    templateInfo.c.put(string, new com.meituan.msc.mmpviews.list.msclist.e(jSONObject2, string));
                }
            }
        } catch (IOException | JSONException e) {
            com.meituan.msc.modules.reporter.g.a("[RenderPreloadModule@loadAndCompileTemplate]", e);
        }
        return templateInfo;
    }
}

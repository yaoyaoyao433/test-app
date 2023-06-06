package com.meituan.shadowsong.mss;

import com.meituan.android.common.metricx.helpers.UrlFactory;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.q;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class c {
    public static ChangeQuickRedirect a;
    public static final UrlFactory.MetricxUrl b = UrlFactory.getInstance().createUrl("https://dd.zservey.com/api/trace/s", "https://dd.meituan.com/api/trace/s");

    public static String a(String str, String str2, String str3, String str4, List<q> list, String str5) throws Exception {
        Object[] objArr = {str, str2, str3, str4, list, str5};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8a8c341740ca85fa53c10d7844001ca3", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8a8c341740ca85fa53c10d7844001ca3");
        }
        JSONArray jSONArray = new JSONArray();
        for (q qVar : list) {
            String lowerCase = qVar.a().toLowerCase();
            if (lowerCase.startsWith("x-amz-")) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("name", lowerCase);
                jSONObject.put("value", qVar.b());
                jSONArray.put(jSONObject);
            }
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("url", str);
        jSONObject2.put("method", str2);
        jSONObject2.put("contentMd5", str3);
        jSONObject2.put("contentType", str4);
        jSONObject2.put("date", str5);
        jSONObject2.put("headers", jSONArray);
        return a(jSONObject2.toString());
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    private static java.lang.String a(java.lang.String r13) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.shadowsong.mss.c.a(java.lang.String):java.lang.String");
    }
}

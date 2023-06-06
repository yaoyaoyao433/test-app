package com.meituan.mmp.lib.api.report;

import com.meituan.mmp.lib.api.ServiceApi;
import com.meituan.mmp.lib.api.d;
import com.meituan.mmp.lib.trace.b;
import com.meituan.mmp.lib.trace.f;
import com.meituan.mmp.lib.w;
import com.meituan.mmp.main.IApiCallback;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.smtt.sdk.TbsReaderView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Queue;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class PerformanceReportApi extends ServiceApi {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.mmp.lib.api.InternalApi
    public final String[] b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ffb6b06155abc8f76c286e02373bfd0", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ffb6b06155abc8f76c286e02373bfd0") : new String[]{"getPerformanceData"};
    }

    @Override // com.meituan.mmp.lib.api.AbsApi
    public void invoke(String str, JSONObject jSONObject, IApiCallback iApiCallback) throws d {
        List<f> list;
        Object[] objArr = {str, jSONObject, iApiCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "246e32ae61e42e2b1a52238811d957e2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "246e32ae61e42e2b1a52238811d957e2");
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            long j = getAppConfig().h.j;
            Queue<f> queue = getAppConfig().h.m;
            Queue<f> queue2 = w.a().d;
            Object[] objArr2 = {queue, queue2};
            ChangeQuickRedirect changeQuickRedirect2 = f.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "f18ce46420744a478735e79c441f1638", RobustBitConfig.DEFAULT_VALUE)) {
                list = (List) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "f18ce46420744a478735e79c441f1638");
            } else {
                ArrayList arrayList = new ArrayList(queue.size() + queue2.size());
                arrayList.addAll(queue);
                arrayList.addAll(queue2);
                Collections.sort(arrayList, new Comparator<f>() { // from class: com.meituan.mmp.lib.trace.f.1
                    public static ChangeQuickRedirect a;

                    @Override // java.util.Comparator
                    public final /* synthetic */ int compare(f fVar, f fVar2) {
                        f fVar3 = fVar;
                        f fVar4 = fVar2;
                        Object[] objArr3 = {fVar3, fVar4};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "001519646c6076928f876db31bdcc141", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "001519646c6076928f876db31bdcc141")).intValue() : Long.compare(fVar3.c, fVar4.c);
                    }
                });
                list = arrayList;
            }
            JSONObject jSONObject3 = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            for (f fVar : list) {
                if (fVar instanceof f.b) {
                    jSONObject3.put(fVar.b, fVar.c);
                } else if (fVar instanceof f.a) {
                    JSONObject jSONObject4 = new JSONObject();
                    if (fVar instanceof f.a.C0425a) {
                        jSONObject4.put(TbsReaderView.KEY_FILE_PATH, fVar.b);
                    } else {
                        jSONObject4.put("name", fVar.b);
                    }
                    jSONObject4.put("start", fVar.a());
                    jSONObject4.put("end", fVar.c);
                    jSONObject4.put("duration", ((f.a) fVar).e);
                    jSONArray.put(jSONObject4);
                }
            }
            jSONObject2.put("marks", jSONObject3);
            jSONObject2.put("events", jSONArray);
            jSONObject2.put("launchTime", j);
            iApiCallback.onSuccess(jSONObject2);
        } catch (JSONException e) {
            b.a(e);
            iApiCallback.onFail(codeJson(-1, e.toString()));
        }
    }
}

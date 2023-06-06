package com.meituan.msc.modules.apploader.launchtasks;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.android.common.statistics.Constants;
import com.meituan.dio.easy.DioFile;
import com.meituan.msc.common.config.MSCRenderConfig;
import com.meituan.msc.mmpviews.perflist.PerfListInfoWrapper;
import com.meituan.msc.modules.engine.MSCHornRollbackConfig;
import com.meituan.msc.modules.update.bean.PackageInfoWrapper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class k extends com.meituan.msc.common.aov_task.task.d<Void> {
    public static ChangeQuickRedirect d;
    private final com.meituan.msc.modules.engine.h e;

    public k(@NonNull com.meituan.msc.modules.engine.h hVar) {
        super("MSCRenderTask");
        Object[] objArr = {hVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc936516832d87b0fb2db0f41622f738", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc936516832d87b0fb2db0f41622f738");
        } else {
            this.e = hVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.meituan.msc.common.aov_task.task.d
    /* renamed from: c */
    public Void b(com.meituan.msc.common.aov_task.context.a aVar) {
        JSONArray optJSONArray;
        int i;
        JSONArray jSONArray;
        ArrayList arrayList;
        String localPath;
        int i2 = 1;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "37e305d809facb40b132795fe8fb2cb7", RobustBitConfig.DEFAULT_VALUE)) {
            return (Void) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "37e305d809facb40b132795fe8fb2cb7");
        }
        String str = null;
        try {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = d;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9d7e501ccbe03cf36ef7eb383d12ecbc", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9d7e501ccbe03cf36ef7eb383d12ecbc");
            } else if (!MSCHornRollbackConfig.i()) {
                com.meituan.msc.modules.viewmanager.g gVar = (com.meituan.msc.modules.viewmanager.g) this.e.c(com.meituan.msc.modules.viewmanager.g.class);
                if (!gVar.d) {
                    JSONObject jSONObject = this.e.s != null ? this.e.s.d : null;
                    if (jSONObject != null) {
                        Iterator<String> keys = jSONObject.keys();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            JSONObject optJSONObject = jSONObject.optJSONObject(next);
                            if (optJSONObject != null && optJSONObject.has("mscLists") && (optJSONArray = optJSONObject.optJSONArray("mscLists")) != null && optJSONArray.length() != 0) {
                                ArrayList arrayList2 = new ArrayList();
                                int i3 = 0;
                                while (i3 < optJSONArray.length()) {
                                    JSONObject optJSONObject2 = optJSONArray.optJSONObject(i3);
                                    if (optJSONObject2 != null) {
                                        String optString = optJSONObject2.optString("templatePath", str);
                                        if (!TextUtils.isEmpty(optString)) {
                                            String optString2 = optJSONObject2.optString("packageName", "main_app");
                                            StringBuilder sb = new StringBuilder();
                                            Object[] objArr3 = new Object[i2];
                                            objArr3[0] = optString2;
                                            ChangeQuickRedirect changeQuickRedirect3 = d;
                                            i = i3;
                                            jSONArray = optJSONArray;
                                            ArrayList arrayList3 = arrayList2;
                                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "4f519857169ddb67effe20827c8059d5", RobustBitConfig.DEFAULT_VALUE)) {
                                                localPath = (String) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "4f519857169ddb67effe20827c8059d5");
                                            } else {
                                                com.meituan.msc.modules.update.f fVar = this.e.r;
                                                PackageInfoWrapper subPackageByName = fVar.h == null ? null : fVar.h.getSubPackageByName(optString2);
                                                if (subPackageByName == null) {
                                                    localPath = fVar.e();
                                                } else {
                                                    localPath = subPackageByName.getLocalPath();
                                                }
                                            }
                                            sb.append(localPath);
                                            sb.append(optString);
                                            String sb2 = sb.toString();
                                            arrayList = arrayList3;
                                            arrayList.add(sb2);
                                            i3 = i + 1;
                                            arrayList2 = arrayList;
                                            optJSONArray = jSONArray;
                                            i2 = 1;
                                            str = null;
                                        }
                                    }
                                    i = i3;
                                    jSONArray = optJSONArray;
                                    arrayList = arrayList2;
                                    i3 = i + 1;
                                    arrayList2 = arrayList;
                                    optJSONArray = jSONArray;
                                    i2 = 1;
                                    str = null;
                                }
                                ArrayList arrayList4 = arrayList2;
                                if (arrayList4.size() != 0) {
                                    gVar.a(next, arrayList4);
                                }
                                i2 = 1;
                                str = null;
                            }
                        }
                        gVar.d = true;
                    }
                }
            }
        } catch (Throwable th) {
            com.meituan.msc.modules.reporter.g.a("MSCRendererTask", th);
        }
        try {
            d(aVar);
        } catch (JSONException e) {
            com.meituan.msc.modules.reporter.g.a("MSCRendererTask", e);
        }
        boolean r = MSCRenderConfig.r();
        com.meituan.msc.modules.reporter.g.d("MSCRendererTask", "preCreateShadows: " + r);
        if (r) {
            com.meituan.msc.views.precreate.b a = com.meituan.msc.views.precreate.b.a();
            Object[] objArr4 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect4 = com.meituan.msc.views.precreate.b.a;
            if (PatchProxy.isSupport(objArr4, a, changeQuickRedirect4, false, "9fe7a24046c14f5df4c7da2eedb44f62", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, a, changeQuickRedirect4, false, "9fe7a24046c14f5df4c7da2eedb44f62");
                return null;
            }
            a.a("MSCView", a.b);
            a.a("MSCText", a.c);
            a.a("MSCVirtualText", a.d);
            a.a("MSCRawText", a.e);
            a.a("MSCRichText", a.f);
            a.a("MSCImage", a.k);
            a.a("MSCScrollView", a.j);
            a.a("MSCSwiper", a.h);
            a.a("MSCSwiperItem", a.g);
            a.a("MSCRList", a.n);
            a.a("MSCRListItem", a.i);
            a.a("MSCListView", a.l);
            a.a("MSCListCell", a.m);
            return null;
        }
        return null;
    }

    private void d(com.meituan.msc.common.aov_task.context.a aVar) throws JSONException {
        int i = 1;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d630789f7369ab9f45fcbcec36ce61fb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d630789f7369ab9f45fcbcec36ce61fb");
            return;
        }
        PackageInfoWrapper packageInfoWrapper = (PackageInfoWrapper) aVar.a(e.class);
        PackageInfoWrapper E = this.e.r.E();
        com.meituan.msc.modules.engine.k kVar = (com.meituan.msc.modules.engine.k) this.e.c(com.meituan.msc.modules.engine.k.class);
        JSONObject jSONObject = this.e.s != null ? this.e.s.d : null;
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                if (jSONObject2.has("rLists")) {
                    JSONArray jSONArray = jSONObject2.getJSONArray("rLists");
                    ArrayList arrayList = new ArrayList();
                    for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                        JSONObject jSONObject3 = jSONArray.getJSONObject(i2);
                        String optString = jSONObject3.optString("renderItem");
                        if (TextUtils.isEmpty(optString)) {
                            Object[] objArr2 = new Object[i];
                            objArr2[0] = "rlist info dont contains renderItem Info";
                            com.meituan.msc.modules.reporter.g.b("MainThreadJsEngine", objArr2);
                        } else {
                            PerfListInfoWrapper.a aVar2 = new PerfListInfoWrapper.a(optString);
                            aVar2.c = jSONObject3.optString("scrollType", "scroll-y");
                            aVar2.d = jSONObject3.optString("layoutType", Constants.EventInfoConsts.KEY_LX_INNER_DATAS_LIST);
                            aVar2.e = jSONObject3.optInt("columnCount", i);
                            aVar2.f = jSONObject3.optString("columnGap", "");
                            aVar2.g = jSONObject3.optString("rowGap", "");
                            arrayList.add(aVar2);
                        }
                    }
                    Object[] objArr3 = new Object[2];
                    objArr3[0] = next;
                    objArr3[i] = arrayList;
                    ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msc.modules.engine.k.a;
                    if (PatchProxy.isSupport(objArr3, kVar, changeQuickRedirect2, false, "2303ec1d79a2a4cf7a154d045c3891d1", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, kVar, changeQuickRedirect2, false, "2303ec1d79a2a4cf7a154d045c3891d1");
                    } else {
                        PerfListInfoWrapper perfListInfoWrapper = kVar.g;
                        Object[] objArr4 = {next, arrayList};
                        ChangeQuickRedirect changeQuickRedirect3 = PerfListInfoWrapper.a;
                        if (PatchProxy.isSupport(objArr4, perfListInfoWrapper, changeQuickRedirect3, false, "f080eca7b64c97cc9dbb9381209f60b5", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, perfListInfoWrapper, changeQuickRedirect3, false, "f080eca7b64c97cc9dbb9381209f60b5");
                        } else {
                            perfListInfoWrapper.c.put(next, arrayList);
                        }
                    }
                    i = 1;
                }
            }
        }
        DioFile dioFile = new DioFile(packageInfoWrapper.getLocalPath(), "rlist-runtime.js");
        kVar.h = packageInfoWrapper;
        kVar.i = dioFile;
        String localPath = E == null ? null : E.getLocalPath();
        if (localPath == null) {
            com.meituan.msc.modules.reporter.g.b("MainThreadJsEngine", "main package or main package's local path is null");
            return;
        }
        DioFile dioFile2 = new DioFile(localPath, "app-service.list.js");
        kVar.j = E;
        kVar.k = dioFile2;
    }
}

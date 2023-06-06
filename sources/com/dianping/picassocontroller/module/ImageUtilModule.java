package com.dianping.picassocontroller.module;

import android.support.annotation.Keep;
import com.dianping.imagemanager.image.loader.e;
import com.dianping.imagemanager.utils.downloadphoto.c;
import com.dianping.imagemanager.utils.downloadphoto.i;
import com.dianping.imagemanager.utils.k;
import com.dianping.picassocontroller.annotation.PCSBMethod;
import com.dianping.picassocontroller.annotation.PCSBModule;
import com.dianping.picassocontroller.vc.b;
import com.dianping.picassocontroller.vc.g;
import com.meituan.msc.modules.update.PackageLoadReporter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
@PCSBModule(name = "imageUtil", stringify = true)
/* loaded from: classes.dex */
public class ImageUtilModule extends a {
    public static ChangeQuickRedirect a;

    @Keep
    @PCSBMethod(name = PackageLoadReporter.Source.PREFETCH)
    public void prefetch(b bVar, JSONObject jSONObject) {
        JSONArray optJSONArray;
        Object[] objArr = {bVar, jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a40e708db229d35a87c2fc11c4d577d5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a40e708db229d35a87c2fc11c4d577d5");
            return;
        }
        boolean z = bVar instanceof g;
        if (!z || bVar.b() == null || jSONObject == null || !z || jSONObject == null || (optJSONArray = jSONObject.optJSONArray("urls")) == null || optJSONArray.length() == 0) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < optJSONArray.length(); i++) {
            try {
                arrayList.add(optJSONArray.getString(i));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        c cVar = c.a.a;
        com.dianping.imagemanager.utils.downloadphoto.g gVar = new com.dianping.imagemanager.utils.downloadphoto.g() { // from class: com.dianping.picassocontroller.module.ImageUtilModule.1
            public static ChangeQuickRedirect a;

            @Override // com.dianping.imagemanager.utils.downloadphoto.g
            public final void a(String str) {
                Object[] objArr2 = {str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0dcda5e6e0bc28e5339ba1dcb7ac4b51", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0dcda5e6e0bc28e5339ba1dcb7ac4b51");
                    return;
                }
                super.a(str);
                com.dianping.codelog.b.a(ImageUtilModule.class, "DPImageDownloader is failed !!! url is " + str);
            }
        };
        Object[] objArr2 = {arrayList, gVar};
        ChangeQuickRedirect changeQuickRedirect2 = c.a;
        if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "04120fe3a86ff98c1714ef9aa1fe3194", RobustBitConfig.DEFAULT_VALUE)) {
            i iVar = (i) PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "04120fe3a86ff98c1714ef9aa1fe3194");
            return;
        }
        e eVar = e.a.a;
        Object[] objArr3 = {arrayList, gVar, (byte) 0, (byte) 0};
        ChangeQuickRedirect changeQuickRedirect3 = e.a;
        if (PatchProxy.isSupport(objArr3, eVar, changeQuickRedirect3, false, "07bec4abd62fe0aa76db1db5ca28a324", RobustBitConfig.DEFAULT_VALUE)) {
            i iVar2 = (i) PatchProxy.accessDispatch(objArr3, eVar, changeQuickRedirect3, false, "07bec4abd62fe0aa76db1db5ca28a324");
        } else if (!com.dianping.imagemanager.base.a.a().b) {
            k.d("GenericImageLoader", "Download environment is not inited yet. Please init download environment with ImageManagerInitHelper or DPImageEnvironment.ensureInit(context) first.");
        } else {
            i iVar3 = new i(arrayList, gVar);
            iVar3.b = false;
            iVar3.c = false;
            Object[] objArr4 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect4 = i.a;
            if (PatchProxy.isSupport(objArr4, iVar3, changeQuickRedirect4, false, "dc364f6208c9cf6de450def63cd4b9f1", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, iVar3, changeQuickRedirect4, false, "dc364f6208c9cf6de450def63cd4b9f1");
            } else {
                i.d.execute(iVar3);
            }
        }
    }
}

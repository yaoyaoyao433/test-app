package com.meituan.msc.modules.reporter.preformance;

import android.support.annotation.NonNull;
import com.meituan.android.common.statistics.Constants;
import com.meituan.msc.jse.bridge.NativeModuleCallExceptionHandler;
import com.meituan.msc.modules.api.legacy.appstate.AppListener;
import com.meituan.msc.modules.engine.h;
import com.meituan.msc.modules.reporter.g;
import com.meituan.msc.modules.update.bean.PackageInfoWrapper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class c {
    public static ChangeQuickRedirect a;
    public final h b;
    public final List<b> c;

    public c(@NonNull h hVar) {
        Object[] objArr = {hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "217235a019f63a9b68c0f75c224db5ac", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "217235a019f63a9b68c0f75c224db5ac");
            return;
        }
        this.c = new CopyOnWriteArrayList();
        this.b = hVar;
    }

    public void a(JSONArray jSONArray) {
        Object[] objArr = {jSONArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb2ad59a9691337b12ee18aecf35adf9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb2ad59a9691337b12ee18aecf35adf9");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(Constants.EventInfoConsts.KEY_LX_INNER_DATAS_LIST, jSONArray);
            ((AppListener) this.b.a(AppListener.class, (NativeModuleCallExceptionHandler) null)).onPerformanceDataChange(jSONObject.toString());
        } catch (JSONException e) {
            g.a("PerformanceManager", e);
        }
    }

    public void a(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cfbd736dd9492753eb4667b91f98987c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cfbd736dd9492753eb4667b91f98987c");
        } else if (bVar == null) {
        } else {
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(bVar);
            a(jSONArray);
        }
    }

    public final void a(PackageInfoWrapper packageInfoWrapper) {
        Object[] objArr = {packageInfoWrapper};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "334f26414c9906c1c6920cef5eb6dd78", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "334f26414c9906c1c6920cef5eb6dd78");
        } else if (packageInfoWrapper == null || !packageInfoWrapper.isFromNet()) {
        } else {
            b b = new b().a("loadPackage").b("downloadPackage").a(packageInfoWrapper.getDownloadStartTimeInMs()).b(packageInfoWrapper.getDownloadEndTimeInMs());
            try {
                b.put("packageName", packageInfoWrapper.getPackageName());
                b.put("packageSize", packageInfoWrapper.getPackageSize());
            } catch (JSONException e) {
                g.a("PerformanceManager", e);
            }
            this.c.add(b);
        }
    }
}

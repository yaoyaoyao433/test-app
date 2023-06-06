package com.meituan.android.mrn.update;

import android.support.annotation.Keep;
import android.text.TextUtils;
import com.meituan.android.mrn.engine.MRNBundleManager;
import com.meituan.android.mrn.engine.e;
import com.meituan.android.mrn.update.h;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes2.dex */
public class RequestBundleInfo {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final String id;
    public final List<RequestBundleInfo> meta;

    public RequestBundleInfo(String str, List<RequestBundleInfo> list) {
        Object[] objArr = {str, list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ffc1b7837ecff87fabe4421c039f9382", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ffc1b7837ecff87fabe4421c039f9382");
            return;
        }
        this.id = str;
        this.meta = list;
    }

    public static RequestBundleInfo fromMRNBundle(com.meituan.android.mrn.engine.e eVar, h.a aVar) {
        ArrayList arrayList;
        Object[] objArr = {eVar, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c13968f9d2e4d441c3f07206ac8b3dfb", RobustBitConfig.DEFAULT_VALUE)) {
            return (RequestBundleInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c13968f9d2e4d441c3f07206ac8b3dfb");
        }
        if (eVar == null) {
            return null;
        }
        if (eVar.n == null || eVar.n.size() <= 0) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (e.a aVar2 : eVar.n) {
                RequestBundleInfo fromMRNBundleDependency = fromMRNBundleDependency(aVar2, aVar);
                if (fromMRNBundleDependency != null) {
                    arrayList.add(fromMRNBundleDependency);
                }
            }
        }
        if (aVar != null) {
            String str = aVar.b(eVar.c, eVar.f).a;
            if (!TextUtils.isEmpty(str)) {
                return new RequestBundleInfo(str, arrayList);
            }
        }
        return null;
    }

    public static RequestBundleInfo fromMRNBundleDependency(e.a aVar, h.a aVar2) {
        com.meituan.android.mrn.engine.e bundle;
        Object[] objArr = {aVar, aVar2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "99ddecb20edc384911ff387a4d343769", RobustBitConfig.DEFAULT_VALUE)) {
            return (RequestBundleInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "99ddecb20edc384911ff387a4d343769");
        }
        if (aVar != null && (bundle = MRNBundleManager.sharedInstance().getBundle(aVar.b, aVar.c)) != null && aVar2 != null) {
            String str = aVar2.b(bundle.c, bundle.f).a;
            if (!TextUtils.isEmpty(str)) {
                return new RequestBundleInfo(str, null);
            }
        }
        return null;
    }
}

package com.meituan.android.neohybrid.kernel.wasai;

import android.text.TextUtils;
import com.facebook.react.uimanager.ViewManager;
import com.meituan.android.recce.ReccePackage;
import com.meituan.android.recce.bridge.RecceCustomApi;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a implements ReccePackage {
    public static ChangeQuickRedirect a;
    public List<ReccePackage> b;

    public a(String str, String... strArr) {
        Object[] objArr = {str, strArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a87743b1afc7a8f0bf25cfcdaeb095c8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a87743b1afc7a8f0bf25cfcdaeb095c8");
            return;
        }
        this.b = new ArrayList();
        if (!TextUtils.isEmpty(str)) {
            if (strArr != null && strArr.length > 0) {
                for (String str2 : strArr) {
                    if (!TextUtils.equals(str, str2)) {
                        this.b.addAll(com.sankuai.meituan.serviceloader.b.a(ReccePackage.class, str2));
                    }
                }
            }
            this.b.addAll(com.sankuai.meituan.serviceloader.b.a(ReccePackage.class, str));
            return;
        }
        this.b.addAll(com.sankuai.meituan.serviceloader.b.a(ReccePackage.class, (String) null));
    }

    @Override // com.meituan.android.recce.ReccePackage
    public final List<ViewManager> registerViewManagers(com.meituan.android.recce.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a51ba5acd998f9619bb9ed25bbb6519a", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a51ba5acd998f9619bb9ed25bbb6519a");
        }
        ArrayList arrayList = new ArrayList();
        for (ReccePackage reccePackage : this.b) {
            arrayList.addAll(reccePackage.registerViewManagers(bVar));
        }
        return arrayList;
    }

    @Override // com.meituan.android.recce.ReccePackage
    public final Map<String, RecceCustomApi> getCustomApis() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "44da04587b68c5af3866ca2cfe8e7b47", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "44da04587b68c5af3866ca2cfe8e7b47");
        }
        HashMap hashMap = new HashMap();
        for (ReccePackage reccePackage : this.b) {
            hashMap.putAll(reccePackage.getCustomApis());
        }
        return hashMap;
    }
}

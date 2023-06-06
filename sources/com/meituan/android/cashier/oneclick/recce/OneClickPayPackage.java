package com.meituan.android.cashier.oneclick.recce;

import android.support.annotation.NonNull;
import com.facebook.react.uimanager.ViewManager;
import com.meituan.android.cashier.oneclick.recce.bridge.a;
import com.meituan.android.cashier.oneclick.recce.view.draglist.RecceDragListViewManager;
import com.meituan.android.recce.ReccePackage;
import com.meituan.android.recce.b;
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
public class OneClickPayPackage implements ReccePackage {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.android.recce.ReccePackage
    @NonNull
    public List<ViewManager> registerViewManagers(@NonNull b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ceec7c07072ee24a2a32e3fc68af13f", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ceec7c07072ee24a2a32e3fc68af13f");
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new RecceDragListViewManager());
        return arrayList;
    }

    @Override // com.meituan.android.recce.ReccePackage
    public Map<String, RecceCustomApi> getCustomApis() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2cd5213934324bf552123234313ce2b9", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2cd5213934324bf552123234313ce2b9");
        }
        HashMap hashMap = new HashMap();
        hashMap.put("openOneClickPay", new a());
        return hashMap;
    }
}

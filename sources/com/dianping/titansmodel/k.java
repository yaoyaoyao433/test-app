package com.dianping.titansmodel;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONArray;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class k {
    public static ChangeQuickRedirect a;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface a<T> {
    }

    public static JSONArray a(com.dianping.titansmodel.a[] aVarArr) {
        Object[] objArr = {aVarArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7b9bea73e76e6cee02f451b0d978772d", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONArray) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7b9bea73e76e6cee02f451b0d978772d");
        }
        JSONArray jSONArray = new JSONArray();
        if (aVarArr != null && aVarArr.length > 0) {
            for (com.dianping.titansmodel.a aVar : aVarArr) {
                if (aVar != null) {
                    jSONArray.put(aVar.writeToJSON());
                }
            }
        }
        return jSONArray;
    }
}

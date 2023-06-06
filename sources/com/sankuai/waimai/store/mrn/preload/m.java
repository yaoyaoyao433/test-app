package com.sankuai.waimai.store.mrn.preload;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class m<T> {
    public static ChangeQuickRedirect a;
    public String b;
    public JSONObject c;
    public T d;
    public String e;
    public String f;
    public Throwable g;
    public JSONObject h;

    public static m a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d3f0d90daabba6be19fd6a37ea322f22", RobustBitConfig.DEFAULT_VALUE)) {
            return (m) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d3f0d90daabba6be19fd6a37ea322f22");
        }
        m mVar = new m();
        mVar.d = obj;
        return mVar;
    }
}

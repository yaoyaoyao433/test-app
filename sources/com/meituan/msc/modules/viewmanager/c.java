package com.meituan.msc.modules.viewmanager;

import com.meituan.msc.jse.bridge.MSCReadableArray;
import com.meituan.msc.jse.bridge.ReactApplicationContext;
import com.meituan.msc.modules.manager.MSCMethod;
import com.meituan.msc.modules.manager.ModuleName;
import com.meituan.msc.modules.manager.k;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONArray;
/* compiled from: ProGuard */
@ModuleName(name = "IntersectionObserver")
/* loaded from: classes3.dex */
public final class c extends k {
    public static ChangeQuickRedirect a;
    private com.meituan.msc.uimanager.intersection.a b;

    public c(ReactApplicationContext reactApplicationContext) {
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b8e848cc58363135509d1c517a11e71a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b8e848cc58363135509d1c517a11e71a");
        } else {
            this.b = new com.meituan.msc.uimanager.intersection.a(reactApplicationContext);
        }
    }

    @MSCMethod
    public final void start(int i, JSONArray jSONArray, JSONArray jSONArray2, JSONArray jSONArray3, int i2) {
        Object[] objArr = {Integer.valueOf(i), jSONArray, jSONArray2, jSONArray3, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b4479d12cee674bcae322fcd927a81e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b4479d12cee674bcae322fcd927a81e");
        } else {
            this.b.a(i, new MSCReadableArray(jSONArray), new MSCReadableArray(jSONArray2), new MSCReadableArray(jSONArray3), i2);
        }
    }

    @MSCMethod
    public final void disconnect(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ab02aa56ef12b6eef391e9b673752c6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ab02aa56ef12b6eef391e9b673752c6");
            return;
        }
        com.meituan.msc.uimanager.intersection.a aVar = this.b;
        Object[] objArr2 = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msc.uimanager.intersection.a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "7c35197c4cef3572a5efedf8ee2511c5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "7c35197c4cef3572a5efedf8ee2511c5");
        } else {
            aVar.b.remove(Integer.valueOf(i));
        }
    }
}

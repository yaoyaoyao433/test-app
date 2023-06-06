package com.meituan.android.mrn.config;

import com.google.gson.reflect.TypeToken;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class n {
    public static ChangeQuickRedirect a;
    public static n b = new n();

    public static n a() {
        return b;
    }

    public n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e420acea8fc6b8b01f4cead3e9a9af43", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e420acea8fc6b8b01f4cead3e9a9af43");
            return;
        }
        a("MRNCommon.disableViewOperationsOnCatalystDestroy", Boolean.TYPE, Boolean.FALSE, "引擎销毁时，是否禁止 UI 队列操作(createView 等)继续执行");
        a("MRNCommon.mrnListMRTBundles", new TypeToken<List<String>>() { // from class: com.meituan.android.mrn.config.n.1
        }.getType(), Collections.emptyList(), "MRNListView 采集 MRNLMRT 指标的 bundle 白名单");
        a("MRNCommon.mrnListMRTEnable", Boolean.TYPE, Boolean.FALSE, "MRNListView 是否采集 MRNLMRT 指标");
        a("MRNCommon.mrnListFSPBundles", new TypeToken<List<String>>() { // from class: com.meituan.android.mrn.config.n.2
        }.getType(), Collections.emptyList(), "MRNListView 采集 MRNLFSP 指标的 bundle 白名单");
        a("MRNCommon.mrnListFSPEnable", Boolean.TYPE, Boolean.FALSE, "MRNListView 是否采集 MRNLFSP 指标");
    }

    private void a(String str, Type type, Object obj, String str2) {
        Object[] objArr = {str, type, obj, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a8771ce783d9cab1a0bcc1e07a5bd3ac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a8771ce783d9cab1a0bcc1e07a5bd3ac");
        } else {
            t.a(str, type, obj, "mrn_common_config_android", str2);
        }
    }

    public final boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2332e85fa28542c5f1eb1c6349322493", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2332e85fa28542c5f1eb1c6349322493")).booleanValue() : ((Boolean) t.b.a("MRNCommon.disableViewOperationsOnCatalystDestroy")).booleanValue();
    }

    public final boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e7175dd15a0d1eede4f72cd0773c8bc", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e7175dd15a0d1eede4f72cd0773c8bc")).booleanValue() : ((Boolean) t.b.a("MRNCommon.mrnListMRTEnable")).booleanValue();
    }

    public final boolean d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ffc297b53cbb6bdd477ad90d344a3ba", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ffc297b53cbb6bdd477ad90d344a3ba")).booleanValue() : ((Boolean) t.b.a("MRNCommon.mrnListFSPEnable")).booleanValue();
    }

    public final boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8615fcc437c07a4b7d93c7d522c78e28", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8615fcc437c07a4b7d93c7d522c78e28")).booleanValue();
        }
        List list = (List) t.b.a("MRNCommon.mrnListMRTBundles");
        if (list == null || list.isEmpty()) {
            return false;
        }
        return list.contains(str);
    }
}

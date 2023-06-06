package com.sankuai.waimai.store.im.base.net;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.base.net.i;
import com.sankuai.waimai.store.base.net.j;
import com.sankuai.waimai.store.im.medical.model.DrugEnterInfo;
import com.sankuai.waimai.store.im.poi.model.IMServiceEvaluationInfo;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class a extends com.sankuai.waimai.store.base.net.d<SGIMApiService> {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.store.base.net.d
    @NonNull
    public final i a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a0f8c9221adf0aa71579f0a9b97a7e1", RobustBitConfig.DEFAULT_VALUE) ? (i) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a0f8c9221adf0aa71579f0a9b97a7e1") : new com.sankuai.waimai.store.base.net.drug.d();
    }

    public static a a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5a2ecaae150bc8ede388f8af456c491e", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5a2ecaae150bc8ede388f8af456c491e");
        }
        a aVar = (a) com.sankuai.waimai.store.base.net.c.a(obj, a.class);
        if (aVar == null) {
            a aVar2 = new a();
            com.sankuai.waimai.store.base.net.c.a(obj, aVar2);
            return aVar2;
        }
        return aVar;
    }

    public final void a(int i, long j, String str, String str2, j<DrugEnterInfo> jVar) {
        Object[] objArr = {Integer.valueOf(i), new Long(j), str, str2, jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b4ac2062d25f93c983a3d01ab28aa70b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b4ac2062d25f93c983a3d01ab28aa70b");
        } else {
            a(jVar, ((SGIMApiService) this.d).getDrugEnterScheme(i, j, str, str2));
        }
    }

    public final void a(long j, String str, j<IMServiceEvaluationInfo> jVar) {
        Object[] objArr = {new Long(j), str, jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1bfc231fb9f95f67379c3f180a84bc77", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1bfc231fb9f95f67379c3f180a84bc77");
        } else {
            a(jVar, ((SGIMApiService) this.d).drugIsSendMsg(j, str));
        }
    }
}

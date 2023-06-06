package com.sankuai.waimai.store.drug.init;

import android.app.Application;
import com.meituan.msc.modules.engine.h;
import com.meituan.msc.modules.preload.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.init.AbsInit;
import com.sankuai.waimai.store.base.remote.a;
import com.sankuai.waimai.store.base.vessel.b;
import com.sankuai.waimai.store.config.d;
import com.sankuai.waimai.store.drug.HHDoctorInit;
import com.sankuai.waimai.store.drug.alita.a;
import com.sankuai.waimai.store.drug.config.DrugConfigPath;
import com.sankuai.waimai.store.drug.vessel.creator.a;
import com.sankuai.waimai.store.util.ae;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class DrugInit extends AbsInit {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    public static boolean sIsColdRunning = true;

    @Override // com.sankuai.waimai.foundation.core.init.a
    public String tag() {
        return "DrugInit";
    }

    @Override // com.sankuai.waimai.foundation.core.init.AbsInit
    public void init(Application application) {
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "91e68f8a7fa2e47e2377def01dc1efa5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "91e68f8a7fa2e47e2377def01dc1efa5");
            return;
        }
        sIsColdRunning = true;
        d.h().a();
        a.a();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.store.drug.vessel.a.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "c475926b62180c47f860e409693a8e15", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "c475926b62180c47f860e409693a8e15");
        } else {
            com.sankuai.waimai.store.base.remote.a.a("/takeout/mscHalfPage", b.class, new a.AbstractC1141a<b>() { // from class: com.sankuai.waimai.store.drug.vessel.a.1
                public static ChangeQuickRedirect b;

                @Override // com.sankuai.waimai.store.base.remote.a.AbstractC1141a
                public final /* synthetic */ b b() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = b;
                    return PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "ca3447e4d7950967bb0af1026aeabb85", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "ca3447e4d7950967bb0af1026aeabb85") : new a.C1170a();
                }
            });
        }
        com.sankuai.waimai.store.drug.util.b bVar = new com.sankuai.waimai.store.drug.util.b();
        com.sankuai.waimai.store.drug.monitor.poiid.a aVar = new com.sankuai.waimai.store.drug.monitor.poiid.a();
        Object[] objArr3 = {aVar};
        ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.store.drug.util.b.a;
        if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect4, false, "fb94f692c6caaf088fa6a072dd946baa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect4, false, "fb94f692c6caaf088fa6a072dd946baa");
        } else {
            bVar.b.add(aVar);
        }
        com.sankuai.waimai.foundation.router.impl.a.a().a("DrugInit", bVar);
    }

    @Override // com.sankuai.waimai.foundation.core.init.AbsInit
    public void asyncInit(Application application) {
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4da31181b24b32973be4632fd1bb3df5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4da31181b24b32973be4632fd1bb3df5");
            return;
        }
        super.asyncInit(application);
        if (d.h().a("hh/newPlay", true)) {
            return;
        }
        HHDoctorInit.a(application, true);
    }

    @Override // com.sankuai.waimai.foundation.core.init.AbsInit
    public void idleInit(Application application) {
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "89c28041501758a0138660ac3b20bf08", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "89c28041501758a0138660ac3b20bf08");
        } else if (d.h().a(DrugConfigPath.DRUG_PRELOAD_MINPROGRAM, false)) {
            com.sankuai.waimai.store.drug.b.a(application);
        }
    }

    @Override // com.sankuai.waimai.foundation.core.init.AbsInit
    public void idleAsyncInit(Application application) {
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4facde729a6dbbe7ba652f768a85a749", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4facde729a6dbbe7ba652f768a85a749");
            return;
        }
        super.idleAsyncInit(application);
        ae.a("Drug_MSC_Preload", "idleAsyncInit");
        if (d.h().a(DrugConfigPath.MSC_PRELOAD, false)) {
            ae.a("Drug_MSC_Preload", "Begin");
            try {
                e.a().a("61cbdaae3b504b9b", "/pages/msc/drug-goods-detail/index", new com.meituan.msc.common.framework.a<h>() { // from class: com.sankuai.waimai.store.drug.init.DrugInit.1
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.msc.common.framework.a
                    public final /* synthetic */ void a(h hVar) {
                        h hVar2 = hVar;
                        Object[] objArr2 = {hVar2};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "b7951ad16df7b8fcc5b64f33a4cd62d1", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "b7951ad16df7b8fcc5b64f33a4cd62d1");
                            return;
                        }
                        com.dianping.judas.util.a.a("msc_preload_success", hVar2);
                        ae.a("Drug_MSC_Preload", "success");
                    }

                    @Override // com.meituan.msc.common.framework.a
                    public final void a(String str, Exception exc) {
                        Object[] objArr2 = {str, exc};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "43f20e98a2740c77673b66e4cdf700dd", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "43f20e98a2740c77673b66e4cdf700dd");
                            return;
                        }
                        ae.a("Drug_MSC_Preload", "Fail");
                        com.dianping.judas.util.a.a("msc_preload_fail", str, exc.getMessage());
                    }

                    @Override // com.meituan.msc.common.framework.a
                    public final void a() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "08071730288b524abbcc30a484e850b5", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "08071730288b524abbcc30a484e850b5");
                        } else {
                            ae.a("Drug_MSC_Preload", "cancel");
                        }
                    }
                });
            } catch (Exception e) {
                com.dianping.judas.util.a.a(e);
            }
        }
    }
}

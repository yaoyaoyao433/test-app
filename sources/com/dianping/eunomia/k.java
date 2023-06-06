package com.dianping.eunomia;

import com.dianping.archive.DPObject;
import com.dianping.model.SimpleMsg;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public abstract class k<MODEL> implements com.dianping.dataservice.d<com.dianping.dataservice.mapi.e, com.dianping.dataservice.mapi.f> {
    public static ChangeQuickRedirect a;

    public abstract void a(com.dianping.dataservice.mapi.e<MODEL> eVar, SimpleMsg simpleMsg, int i);

    public abstract void a(com.dianping.dataservice.mapi.e<MODEL> eVar, MODEL model, int i);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.dianping.dataservice.d
    public /* synthetic */ void onRequestFinish(com.dianping.dataservice.mapi.e eVar, com.dianping.dataservice.mapi.f fVar) {
        String str;
        com.dianping.dataservice.mapi.e eVar2 = eVar;
        com.dianping.dataservice.mapi.f fVar2 = fVar;
        Object[] objArr = {eVar2, fVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b3d6cabd9dd97007394bd7c7dd9bb91", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b3d6cabd9dd97007394bd7c7dd9bb91");
        } else if (fVar2.a() != null) {
            Object a2 = fVar2.a();
            if (!(a2 instanceof DPObject)) {
                str = "decode to model require response result is DPObject.";
            } else if (eVar2.f() != null) {
                try {
                    a((com.dianping.dataservice.mapi.e<com.dianping.dataservice.mapi.e>) eVar2, (com.dianping.dataservice.mapi.e) ((DPObject) a2).a(eVar2.f()), fVar2.b());
                    return;
                } catch (com.dianping.archive.a e) {
                    e.printStackTrace();
                    str = e;
                }
            } else {
                str = "request decoder is null,can not decode to module.";
            }
            a(eVar2, com.dianping.dataservice.mapi.impl.a.a(fVar2.b(), str), fVar2.b());
        } else {
            onRequestFailed(eVar2, fVar2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.dianping.dataservice.d
    /* renamed from: a */
    public void onRequestFailed(com.dianping.dataservice.mapi.e eVar, com.dianping.dataservice.mapi.f fVar) {
        Object[] objArr = {eVar, fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e9436030e259d96794457bf4a0b846b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e9436030e259d96794457bf4a0b846b");
        } else {
            a(eVar, fVar.c(), fVar.b());
        }
    }
}

package com.meituan.android.customerservice.cscallsdk.inner;

import com.google.gson.Gson;
import com.meituan.android.customerservice.callbase.base.e;
import com.meituan.android.customerservice.callbase.bean.proto.CSCallPing;
import com.meituan.android.pike.PikeClient;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.smtt.sdk.TbsListener;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a extends e {
    public static ChangeQuickRedirect h;
    private com.meituan.android.customerservice.callbase.protohelper.b i;

    public a(com.meituan.android.customerservice.callbase.protohelper.b bVar, e.a aVar) {
        super(aVar);
        Object[] objArr = {bVar, aVar};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae1129c81baa40f7ab18e6189255b71b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae1129c81baa40f7ab18e6189255b71b");
        } else {
            this.i = bVar;
        }
    }

    @Override // com.meituan.android.customerservice.callbase.base.e
    public final void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b269990e65f5190d781599c104e270e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b269990e65f5190d781599c104e270e");
            return;
        }
        com.meituan.android.customerservice.callbase.protohelper.b bVar = this.i;
        Object[] objArr2 = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.customerservice.callbase.protohelper.b.a;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "9583a2d17d3c2b7844e24669f7fc5772", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "9583a2d17d3c2b7844e24669f7fc5772");
        } else {
            CSCallPing cSCallPing = new CSCallPing();
            cSCallPing.setSid(str);
            cSCallPing.setLegid(str2);
            cSCallPing.setUid(bVar.b.e());
            cSCallPing.setTs(PikeClient.c.a.a(System.currentTimeMillis()));
            cSCallPing.setdType(bVar.b.d());
            bVar.a(new Gson().toJson(cSCallPing));
        }
        Object[] objArr3 = {str, str2};
        ChangeQuickRedirect changeQuickRedirect3 = e.a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "34728ae0dd0ece143a2717fdb3bc7814", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "34728ae0dd0ece143a2717fdb3bc7814");
            return;
        }
        this.f = str;
        this.g = str2;
        this.b.schedule(111, e.e);
        this.b.schedule(333, e.d);
        this.b.schedule(TbsListener.ErrorCode.UNLZMA_FAIURE, e.c);
    }
}

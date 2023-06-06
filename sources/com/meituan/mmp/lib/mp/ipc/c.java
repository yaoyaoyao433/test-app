package com.meituan.mmp.lib.mp.ipc;

import android.support.annotation.NonNull;
import com.meituan.mmp.lib.api.AbsApi;
import com.meituan.mmp.lib.mp.b;
import com.meituan.mmp.main.IApiCallback;
import com.meituan.mmp.main.MMPEnvHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class c<Params> extends d<Params, Void> {
    public static ChangeQuickRedirect b;
    private final b.a a;
    public IApiCallback c;

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ddadcbc4478b9ffc65b7dd8a47cd43e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ddadcbc4478b9ffc65b7dd8a47cd43e");
        } else {
            this.a = new b.a() { // from class: com.meituan.mmp.lib.mp.ipc.c.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.mmp.lib.mp.b.a
                public final void a(com.meituan.mmp.lib.mp.a aVar) {
                    Object[] objArr2 = {aVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "263f662321122c4a7c42039d40193036", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "263f662321122c4a7c42039d40193036");
                        return;
                    }
                    HashMap hashMap = new HashMap();
                    com.meituan.mmp.lib.mp.a e = com.meituan.mmp.lib.mp.a.e();
                    hashMap.put("process", e == null ? "" : e.b());
                    hashMap.put("remoteProcess", aVar.b());
                    hashMap.put("task", "api: " + c.this.getClass().getName());
                    MMPEnvHelper.getLogger().log("mmp.stability.count.remote.process.die.when.ipc", null, hashMap);
                    c cVar = c.this;
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = c.b;
                    if (PatchProxy.isSupport(objArr3, cVar, changeQuickRedirect3, false, "8870ebec338e158d63b1ff5d28b85f07", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, cVar, changeQuickRedirect3, false, "8870ebec338e158d63b1ff5d28b85f07");
                    } else if (cVar.c != null) {
                        cVar.c.onFail(AbsApi.codeJson(-1, "remote process died"));
                    }
                }
            };
        }
    }

    @Override // com.meituan.mmp.lib.mp.ipc.d
    public final d<Params, Void> a(@NonNull com.meituan.mmp.lib.mp.a aVar, Params... paramsArr) {
        Object[] objArr = {aVar, paramsArr};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c1b62bd535a42bd4e616984702da5db5", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c1b62bd535a42bd4e616984702da5db5");
        }
        com.meituan.mmp.lib.mp.b.a(aVar, this.a);
        return super.a(aVar, paramsArr);
    }

    @Override // com.meituan.mmp.lib.mp.ipc.d
    public final void a(Exception exc) {
        Object[] objArr = {exc};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d9f1044f2864ff8177112a44091e3b1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d9f1044f2864ff8177112a44091e3b1");
        } else if (this.c != null) {
            this.c.onFail(AbsApi.codeJson(-1, exc.toString()));
        }
    }
}

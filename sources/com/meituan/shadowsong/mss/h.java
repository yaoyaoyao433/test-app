package com.meituan.shadowsong.mss;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.shadowsong.mss.g;
import com.sankuai.meituan.retrofit2.Response;
import com.sankuai.meituan.retrofit2.ak;
import com.sankuai.meituan.retrofit2.al;
import com.sankuai.meituan.retrofit2.ar;
import java.io.File;
import java.io.PrintStream;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class h {
    public static ChangeQuickRedirect a;
    private final ar b;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a {
        public static h a = new h();
    }

    public h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6cded7a74ae06bc8dd64af6279965223", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6cded7a74ae06bc8dd64af6279965223");
            return;
        }
        com.meituan.shadowsong.mss.a aVar = new com.meituan.shadowsong.mss.a();
        this.b = new ar.a().a("https://s3plus.sankuai.com").a(aVar).a(com.sankuai.meituan.retrofit2.callfactory.urlconnection.a.a()).a();
    }

    public final void a(File file, e eVar) {
        Object[] objArr = {file, eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b6919e67de7e16dfde2ee3dfdf62716d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b6919e67de7e16dfde2ee3dfdf62716d");
        } else if (file != null && file.exists()) {
            String name = file.getName();
            g.a aVar = new g.a();
            aVar.e = file.getAbsolutePath();
            aVar.b = "simple-perf";
            aVar.g = true;
            aVar.c = name;
            aVar.h = eVar;
            a(aVar.a());
        }
    }

    private void a(final g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de60e7787ed558fb2722d157079c3c93", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de60e7787ed558fb2722d157079c3c93");
        } else if (gVar == null) {
        } else {
            String str = gVar.d;
            final e eVar = gVar.g;
            ak a2 = al.a(new File(str), b.a(str));
            HashMap hashMap = new HashMap();
            if (gVar.f) {
                hashMap.put("Content-MD5", b.a(b.a(new File(str))));
            }
            ((IMssService) this.b.a(IMssService.class)).putObject("https://s3plus.sankuai.com/" + gVar.b + "/" + gVar.c, a2, hashMap).a(new d<Void>() { // from class: com.meituan.shadowsong.mss.h.1
                public static ChangeQuickRedirect b;

                @Override // com.meituan.shadowsong.mss.d
                public final void a(Response<Void> response) {
                    Object[] objArr2 = {response};
                    ChangeQuickRedirect changeQuickRedirect2 = b;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3b5fd2b5227aa5ece409498806a3096e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3b5fd2b5227aa5ece409498806a3096e");
                        return;
                    }
                    System.out.println("UploadManager:upload success");
                    gVar.e = 3;
                    if (eVar != null) {
                        eVar.onSuccess();
                    }
                }

                @Override // com.meituan.shadowsong.mss.d
                public final void a(Throwable th) {
                    Object[] objArr2 = {th};
                    ChangeQuickRedirect changeQuickRedirect2 = b;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9b9d9ccf49883ea819a308b67669fe37", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9b9d9ccf49883ea819a308b67669fe37");
                        return;
                    }
                    PrintStream printStream = System.out;
                    printStream.println("UploadManager:" + th);
                    gVar.e = 4;
                    if (eVar != null) {
                        eVar.onFailure();
                    }
                }
            });
        }
    }
}

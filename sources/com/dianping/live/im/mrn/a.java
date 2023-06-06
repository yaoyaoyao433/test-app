package com.dianping.live.im.mrn;

import com.dianping.sharkpush.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static a c = new a();
    List<b> b;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b115d5fed41224b3e2b1367e8f58510", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b115d5fed41224b3e2b1367e8f58510");
            return;
        }
        this.b = new CopyOnWriteArrayList();
        com.dianping.sharkpush.b.a("dzu_live_push", false, true, new d.a() { // from class: com.dianping.live.im.mrn.a.1
            public static ChangeQuickRedirect a;

            @Override // com.dianping.sharkpush.d.a, dianping.com.nvlinker.stub.ISharkPushReceiver
            public final void onReceive(String str, byte[] bArr) {
                Object[] objArr2 = {str, bArr};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9914a3b74cd0f94a9bb616160e9811ea", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9914a3b74cd0f94a9bb616160e9811ea");
                } else if (a.this.b.size() > 0) {
                    for (b bVar : a.this.b) {
                        bVar.onReceive(str, bArr);
                    }
                }
            }

            @Override // dianping.com.nvlinker.stub.ISharkPushReceiver
            public final void onError(String str, int i, String str2) {
                Object[] objArr2 = {str, Integer.valueOf(i), str2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4c73a791297d56a3e664a7611b7d95b9", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4c73a791297d56a3e664a7611b7d95b9");
                } else if (a.this.b.size() > 0) {
                    for (b bVar : a.this.b) {
                        bVar.onError(str, i, str2);
                    }
                }
            }
        });
    }

    public static a a() {
        return c;
    }
}

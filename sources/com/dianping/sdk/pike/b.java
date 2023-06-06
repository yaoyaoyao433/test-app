package com.dianping.sdk.pike;

import android.content.Context;
import android.content.Intent;
import com.dianping.sdk.pike.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.nio.charset.Charset;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class b {
    public static ChangeQuickRedirect a;
    private static volatile b d;
    final d b;
    String c;

    public static b a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ad431fbb0cd2e353603d6c19ed35cb86", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ad431fbb0cd2e353603d6c19ed35cb86");
        }
        if (d == null) {
            synchronized (b.class) {
                if (d == null) {
                    d = new b(context.getApplicationContext());
                }
            }
        }
        return d;
    }

    private b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8068380cfa253bcbf90fc5ac07ab2710", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8068380cfa253bcbf90fc5ac07ab2710");
            return;
        }
        this.c = "";
        this.c = f.j();
        this.b = d.a(context, new e.a().a("logan.push").b(this.c).a());
        this.b.r = new com.dianping.sdk.pike.message.b() { // from class: com.dianping.sdk.pike.b.1
            public static ChangeQuickRedirect a;

            @Override // com.dianping.sdk.pike.message.b
            public final void a(List<com.dianping.sdk.pike.message.e> list) {
                Object[] objArr2 = {list};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "056e7f81452d16e0942f59d417431616", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "056e7f81452d16e0942f59d417431616");
                    return;
                }
                try {
                    Context b = f.b();
                    if (b == null) {
                        i.a("InnerClient", "logan push received, but context is null!");
                        return;
                    }
                    for (com.dianping.sdk.pike.message.e eVar : list) {
                        if (eVar.d == null) {
                            i.a("InnerClient", "logan.push received: msg body is null.");
                        } else {
                            String str = new String(eVar.d, Charset.defaultCharset());
                            i.a("InnerClient", "logan.push received: ", str);
                            Intent intent = new Intent("com.dianping.dpmtpush.RECEIVE_PASS_THROUGH_MESSAGE.SHARK_PUSH_LOGAN");
                            intent.setFlags(32);
                            intent.putExtra("message", str);
                            intent.setPackage(b.getPackageName());
                            com.sankuai.meituan.takeoutnew.util.aop.b.a(b, intent);
                        }
                    }
                } catch (Exception e) {
                    i.a("InnerClient", "logan push err!", e);
                }
            }
        };
    }
}

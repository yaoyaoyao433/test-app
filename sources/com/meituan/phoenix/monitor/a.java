package com.meituan.phoenix.monitor;

import android.content.Context;
import android.text.TextUtils;
import com.dianping.monitor.impl.m;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Collections;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a implements c {
    public static ChangeQuickRedirect a;
    private Context b;

    public a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cac7b2e95af81afaef9002c6460a5909", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cac7b2e95af81afaef9002c6460a5909");
        } else {
            this.b = context;
        }
    }

    @Override // com.meituan.phoenix.monitor.c
    public final void a(e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da9cd3f610ffc2dc17204b98544b6f26", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da9cd3f610ffc2dc17204b98544b6f26");
        } else if (eVar != null) {
            if (com.meituan.phoenix.a.a) {
                com.meituan.phoenix.util.b.a("Phoenix", "--->Default: Entry Default Monitor", new Object[0]);
            }
            m mVar = new m(348, this.b);
            mVar.a("cityId", eVar.q);
            mVar.a("phoenixKey", eVar.s);
            mVar.a("projectKey", com.meituan.phoenix.b.b);
            StringBuilder sb = new StringBuilder();
            sb.append(eVar.i);
            mVar.a("reason", sb.toString());
            mVar.a("phoenix_entry", Collections.singletonList(Float.valueOf(1.0f)));
            if (!eVar.f || TextUtils.isEmpty(eVar.j)) {
                mVar.a("phoenix_retrieve", Collections.singletonList(Float.valueOf(0.0f)));
                mVar.a("retryCount", "0");
                if (com.meituan.phoenix.a.a) {
                    com.meituan.phoenix.util.b.a("Phoenix", "--->Default: Entry Default Monitor Failed", new Object[0]);
                }
            } else {
                if (com.meituan.phoenix.a.a) {
                    com.meituan.phoenix.util.b.a("Phoenix", "--->Default: Entry Default Monitor Success", new Object[0]);
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(eVar.r);
                mVar.a("retryCount", sb2.toString());
                mVar.a("successHost", eVar.j);
                mVar.a(eVar.j + "_1", Collections.singletonList(Float.valueOf(1.0f)));
                mVar.a("phoenix_retrieve", Collections.singletonList(Float.valueOf(1.0f)));
            }
            if (eVar.n != null && eVar.n.size() > 0) {
                mVar.a("phoenix_failed_detail", Collections.singletonList(Float.valueOf(1.0f)));
                for (int i = 0; i < eVar.n.size(); i++) {
                    mVar.a(eVar.n.get(i) + "_0", Collections.singletonList(Float.valueOf(1.0f)));
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(eVar.o.get(i));
                    mVar.a(eVar.n.get(i), sb3.toString());
                }
            }
            mVar.a();
        }
    }
}

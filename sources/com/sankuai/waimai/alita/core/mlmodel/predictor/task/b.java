package com.sankuai.waimai.alita.core.mlmodel.predictor.task;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class b {
    public static ChangeQuickRedirect a;
    private static volatile b c;
    private AtomicLong b;
    private final ArrayList<a> d;
    private final Map<String, Long> e;

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a1737653d57b0bc6d69e33003e5546a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a1737653d57b0bc6d69e33003e5546a");
            return;
        }
        this.b = new AtomicLong(0L);
        this.d = new ArrayList<>();
        this.e = new HashMap();
    }

    public static b a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3b55e2c9a0da5a1e6fc9ab7c3e8ad77a", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3b55e2c9a0da5a1e6fc9ab7c3e8ad77a");
        }
        if (c == null) {
            synchronized (b.class) {
                if (c == null) {
                    c = new b();
                }
            }
        }
        return c;
    }

    private a a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "568ecb76f859f0b44c39fa1f7d675877", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "568ecb76f859f0b44c39fa1f7d675877");
        }
        int i = (int) ((j - 1) % 3);
        if (this.d.size() < i + 1) {
            a aVar = new a(j);
            this.d.add(aVar);
            return aVar;
        }
        return this.d.get(i);
    }

    public final a a(com.sankuai.waimai.alita.bundle.model.a aVar) {
        String str;
        String str2;
        String str3;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a3cf2b02113791e423f1b6f774f8c15", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a3cf2b02113791e423f1b6f774f8c15");
        }
        if (aVar != null && !TextUtils.isEmpty(aVar.c)) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.alita.bundle.model.a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "01587d6d72720e9e1e58f15e2258dc81", RobustBitConfig.DEFAULT_VALUE)) {
                str = (String) PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "01587d6d72720e9e1e58f15e2258dc81");
            } else {
                str = "";
                if (aVar.e != null) {
                    str = aVar.e.d;
                }
            }
            if (!TextUtils.isEmpty(str)) {
                synchronized (this) {
                    Object[] objArr3 = {aVar.c};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "77e1c2aeaf88c0c52d1aa6ee13fefa84", RobustBitConfig.DEFAULT_VALUE)) {
                        str3 = (String) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "77e1c2aeaf88c0c52d1aa6ee13fefa84");
                    } else {
                        str3 = "AlitaML_" + str2.replaceAll(CommonConstant.Symbol.MINUS, CommonConstant.Symbol.UNDERLINE);
                    }
                    if (this.e.containsKey(str3)) {
                        return a(this.e.get(str3).longValue());
                    }
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    long longValue = PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "7408bdac9d2986c75b48ec8e551a110a", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "7408bdac9d2986c75b48ec8e551a110a")).longValue() : this.b.incrementAndGet();
                    a a2 = a(longValue);
                    this.e.put(str3, Long.valueOf(longValue));
                    return a2;
                }
            }
        }
        return null;
    }
}

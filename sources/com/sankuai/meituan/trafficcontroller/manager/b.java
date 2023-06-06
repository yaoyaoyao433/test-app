package com.sankuai.meituan.trafficcontroller.manager;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.trafficcontroller.bean.TrafficStrategy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;
    protected volatile List<TrafficStrategy> b;
    protected volatile Map<String, com.sankuai.meituan.trafficcontroller.manager.a> c;
    protected volatile a d;
    protected volatile boolean e;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
    }

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e57b6ff1da530ce4f3da311c7d78f746", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e57b6ff1da530ce4f3da311c7d78f746");
        } else {
            this.c = new HashMap();
        }
    }

    public final boolean a() {
        return this.e;
    }

    public final synchronized boolean a(String str) {
        com.sankuai.meituan.trafficcontroller.manager.a aVar;
        String str2;
        boolean z;
        boolean z2;
        char c = 1;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "037336419875651c6e14a1f1cb61d9ab", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "037336419875651c6e14a1f1cb61d9ab")).booleanValue();
        }
        Object[] objArr2 = {str};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4afcf4e8c1554491e619c5e3bc77a8ba", RobustBitConfig.DEFAULT_VALUE)) {
            aVar = (com.sankuai.meituan.trafficcontroller.manager.a) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4afcf4e8c1554491e619c5e3bc77a8ba");
        } else {
            if (!TextUtils.isEmpty(str) && this.b != null && !this.b.isEmpty()) {
                for (TrafficStrategy trafficStrategy : this.b) {
                    if (trafficStrategy != null && trafficStrategy.urls != null) {
                        for (String str3 : trafficStrategy.urls) {
                            Object[] objArr3 = new Object[2];
                            objArr3[0] = str;
                            objArr3[c] = str3;
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "658678b4200d55f0093732ebec5eea8f", RobustBitConfig.DEFAULT_VALUE)) {
                                z = ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "658678b4200d55f0093732ebec5eea8f")).booleanValue();
                                str2 = str3;
                            } else {
                                if (TextUtils.isEmpty(str3)) {
                                    str2 = str3;
                                } else {
                                    str2 = str3;
                                    if (str.startsWith(str2)) {
                                        z = true;
                                    }
                                }
                                z = false;
                            }
                            if (z) {
                                com.sankuai.meituan.trafficcontroller.manager.a aVar2 = this.c.get(str2);
                                if (aVar2 == null) {
                                    aVar2 = new com.sankuai.meituan.trafficcontroller.manager.a(trafficStrategy);
                                    this.c.put(str2, aVar2);
                                }
                                aVar = aVar2;
                            } else {
                                c = 1;
                            }
                        }
                        continue;
                    }
                }
            }
            aVar = null;
        }
        if (aVar != null) {
            Object[] objArr4 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.meituan.trafficcontroller.manager.a.a;
            if (PatchProxy.isSupport(objArr4, aVar, changeQuickRedirect4, false, "d0afd7de1b7971e6484f1d5d4f6110cd", RobustBitConfig.DEFAULT_VALUE)) {
                z2 = ((Boolean) PatchProxy.accessDispatch(objArr4, aVar, changeQuickRedirect4, false, "d0afd7de1b7971e6484f1d5d4f6110cd")).booleanValue();
            } else if (aVar.c == null) {
                z2 = false;
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                boolean z3 = currentTimeMillis - aVar.b < ((long) aVar.c.timeInterval);
                if (!z3) {
                    aVar.b = currentTimeMillis;
                }
                z2 = z3;
            }
            Object[] objArr5 = {str, Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect5 = a;
            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "6cb0489771daa63f03c624294e5382c8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "6cb0489771daa63f03c624294e5382c8");
            } else if (this.d != null) {
                a aVar3 = this.d;
            }
        } else {
            z2 = false;
        }
        return z2;
    }

    public final synchronized void a(TrafficStrategy trafficStrategy) {
        Object[] objArr = {trafficStrategy};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3ca798e7ba552dd69eebe9c82a596100", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3ca798e7ba552dd69eebe9c82a596100");
            return;
        }
        if (this.b == null) {
            this.b = new ArrayList();
        }
        this.b.clear();
        this.b.add(trafficStrategy);
    }
}

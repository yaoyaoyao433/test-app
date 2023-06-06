package com.sankuai.waimai.platform.net.networkdiagnose;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.net.networkdiagnose.strategy.BasicInfoStrategy;
import com.sankuai.waimai.platform.net.networkdiagnose.strategy.CheckApiStrategy;
import com.sankuai.waimai.platform.net.networkdiagnose.strategy.CheckCDNStrategy;
import com.sankuai.waimai.platform.net.networkdiagnose.strategy.CheckDnsStrategy;
import com.sankuai.waimai.platform.net.networkdiagnose.strategy.CheckHttpsStrategy;
import com.sankuai.waimai.platform.net.networkdiagnose.strategy.PingDomainStrategy;
import com.sankuai.waimai.platform.net.networkdiagnose.strategy.UploadLoganStrategy;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b {
    public static ChangeQuickRedirect a;
    private static List<Class<? extends com.sankuai.waimai.platform.net.networkdiagnose.strategy.a>> f;
    private static Map<Class<? extends com.sankuai.waimai.platform.net.networkdiagnose.strategy.a>, a> g;
    private static String h;
    public List<a> b;
    public Set<com.sankuai.waimai.platform.net.networkdiagnose.strategy.a> c;
    Context d;
    int e;
    private JSONArray i;

    public b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "385a6455cbe267a0c69d21ab48f383d2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "385a6455cbe267a0c69d21ab48f383d2");
            return;
        }
        this.e = 0;
        if (context != null) {
            this.d = context.getApplicationContext();
        }
        this.c = new HashSet();
        g = new HashMap();
        this.i = new JSONArray();
        this.b = new ArrayList();
        Object[] objArr2 = {context};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "833ba957bc858cd877cac65f6ae5d3bb", RobustBitConfig.DEFAULT_VALUE)) {
            b bVar = (b) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "833ba957bc858cd877cac65f6ae5d3bb");
        } else {
            a(new BasicInfoStrategy(context));
            a(new PingDomainStrategy(context));
            a(new CheckHttpsStrategy(context));
            a(new CheckCDNStrategy(context));
            a(new CheckApiStrategy(context));
            a(new CheckDnsStrategy(context));
            a(new UploadLoganStrategy(context));
        }
        if (f == null || f.isEmpty()) {
            return;
        }
        for (Class<? extends com.sankuai.waimai.platform.net.networkdiagnose.strategy.a> cls : f) {
            try {
                com.sankuai.waimai.platform.net.networkdiagnose.strategy.a newInstance = cls.getConstructor(Context.class).newInstance(context);
                if (g != null && g.containsKey(cls)) {
                    newInstance.setDiagnosticCallback(g.get(cls));
                }
                this.c.add(newInstance);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InstantiationException e2) {
                e2.printStackTrace();
            } catch (NoSuchMethodException e3) {
                e3.printStackTrace();
            } catch (InvocationTargetException e4) {
                e4.printStackTrace();
            }
        }
    }

    private b a(com.sankuai.waimai.platform.net.networkdiagnose.strategy.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "950e2071735ba352eb103a93201053e2", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "950e2071735ba352eb103a93201053e2");
        }
        this.c.add(aVar);
        aVar.setNetworkDiagnostic(this);
        return this;
    }

    public final void a() {
        int i = 0;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8163438c0c211cc4f7361269fc286b94", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8163438c0c211cc4f7361269fc286b94");
            return;
        }
        boolean z = false;
        for (com.sankuai.waimai.platform.net.networkdiagnose.strategy.a aVar : this.c) {
            if (aVar.isFinished() || aVar.isErrored()) {
                i++;
            }
            if (aVar.isFinished()) {
                z = true;
            }
        }
        if (i >= (this.c != null ? this.c.size() : -1)) {
            if (z) {
                for (com.sankuai.waimai.platform.net.networkdiagnose.strategy.a aVar2 : this.c) {
                    this.i.put(aVar2.getDiagnosticResult());
                }
                b(this.i.toString());
            } else {
                b(null);
            }
            this.e = 2;
        }
    }

    private void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "baddbe54b840ce7c70ccd1ea944e8147", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "baddbe54b840ce7c70ccd1ea944e8147");
            return;
        }
        for (a aVar : this.b) {
            aVar.d(str);
        }
    }

    public final void a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f03b4ed41d1ffb48ea9186cf27721742", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f03b4ed41d1ffb48ea9186cf27721742");
            return;
        }
        if (aVar != null) {
            this.b.add(aVar);
        }
        if (this.c != null) {
            for (com.sankuai.waimai.platform.net.networkdiagnose.strategy.a aVar2 : this.c) {
                if (aVar2 != null && !aVar2.hasDiagnosticCallback()) {
                    aVar2.setDiagnosticCallback(aVar);
                }
            }
        }
    }

    public static synchronized void a(String str) {
        synchronized (b.class) {
            h = str;
        }
    }

    public static synchronized String b() {
        String str;
        synchronized (b.class) {
            str = h;
        }
        return str;
    }
}

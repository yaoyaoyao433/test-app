package com.sankuai.waimai.platform.net;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.MainThread;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.base.activity.BaseActivity;
import com.sankuai.waimai.foundation.core.service.abtest.ABStrategy;
import com.sankuai.waimai.foundation.utils.ad;
import com.sankuai.waimai.platform.capacity.abtest.ABTestManager;
import com.sankuai.waimai.platform.net.weaknetwork.d;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d implements d.a {
    public static ChangeQuickRedirect a;
    HashMap<String, HashMap<String, SoftReference<b>>> b;
    HashMap<String, LinkedList<b>> c;
    public boolean d;
    public com.sankuai.waimai.platform.net.a e;
    private boolean f;
    private ABStrategy g;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface b {
        void a(com.sankuai.waimai.platform.net.a aVar);

        void a(boolean z);
    }

    public d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a85bad1b32c59087c82c9c163ceedd0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a85bad1b32c59087c82c9c163ceedd0");
            return;
        }
        this.b = new HashMap<>();
        this.c = new HashMap<>();
        this.f = false;
        this.d = false;
        this.e = com.sankuai.waimai.platform.net.a.EXCELLENT;
        this.g = ABTestManager.getInstance(com.meituan.android.singleton.b.a).getStrategy("weak_network_optimize", null);
    }

    @Override // com.sankuai.waimai.platform.net.weaknetwork.d.a
    public final void a(boolean z, com.sankuai.waimai.platform.net.a aVar) {
        b bVar;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ade1af3c82ef7f8ca2a7a0e30bdd2a7c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ade1af3c82ef7f8ca2a7a0e30bdd2a7c");
            return;
        }
        boolean z2 = this.d != z;
        this.d = z;
        boolean z3 = !this.e.equals(aVar);
        this.e = aVar;
        com.sankuai.waimai.foundation.utils.log.a.c("NetMonitoredManager", "onNetStateChanged isWeakState : %b ,  quality : %s ", Boolean.valueOf(this.d), this.e.name());
        com.sankuai.waimai.foundation.utils.log.a.c("NetMonitoredManager", "onNetStateChanged doNetStateChangeNotice : %b , doNetQualityChangeNotice : %b ", Boolean.valueOf(z2), Boolean.valueOf(z3));
        if (z2 || z3) {
            for (HashMap<String, SoftReference<b>> hashMap : this.b.values()) {
                if (hashMap != null) {
                    for (SoftReference<b> softReference : hashMap.values()) {
                        if (softReference != null && (bVar = softReference.get()) != null) {
                            if (z2) {
                                try {
                                    bVar.a(!this.d);
                                } catch (Exception e) {
                                    com.sankuai.waimai.foundation.utils.log.a.a(e);
                                }
                            }
                            if (z3) {
                                try {
                                    bVar.a(this.e);
                                } catch (Exception e2) {
                                    com.sankuai.waimai.foundation.utils.log.a.a(e2);
                                }
                            }
                        }
                    }
                }
            }
            for (LinkedList<b> linkedList : this.c.values()) {
                if (linkedList != null) {
                    Iterator<b> it = linkedList.iterator();
                    while (it.hasNext()) {
                        b next = it.next();
                        if (next != null) {
                            if (z2) {
                                try {
                                    next.a(!this.d);
                                } catch (Exception e3) {
                                    com.sankuai.waimai.foundation.utils.log.a.a(e3);
                                }
                            }
                            if (z3) {
                                try {
                                    next.a(this.e);
                                } catch (Exception e4) {
                                    com.sankuai.waimai.foundation.utils.log.a.a(e4);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class c {
        private static d a = new d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c1964deda9b84e83aaed99034903b9d8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c1964deda9b84e83aaed99034903b9d8");
        } else if (this.f) {
        } else {
            synchronized (this) {
                if (this.f) {
                    return;
                }
                com.sankuai.waimai.platform.net.weaknetwork.d b2 = com.sankuai.waimai.platform.net.weaknetwork.d.b();
                Object[] objArr2 = {context};
                ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.platform.net.weaknetwork.d.a;
                if (PatchProxy.isSupport(objArr2, b2, changeQuickRedirect2, false, "fc537b1941c5128453877a33c15e589c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, b2, changeQuickRedirect2, false, "fc537b1941c5128453877a33c15e589c");
                } else {
                    b2.a(context);
                }
                com.sankuai.waimai.platform.net.weaknetwork.d.b().j = this;
                this.f = true;
            }
        }
    }

    public static d a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fa3dadfc994019224b6cd42cab4a8990", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fa3dadfc994019224b6cd42cab4a8990") : c.a;
    }

    @MainThread
    public final void a(Activity activity, b bVar) {
        Object[] objArr = {activity, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a270bb29f4af31bb792c31ad55a8910", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a270bb29f4af31bb792c31ad55a8910");
            return;
        }
        ad.a();
        if (activity == null || !(activity instanceof BaseActivity) || bVar == null) {
            return;
        }
        a(activity.getApplicationContext());
        String obj = activity.toString();
        com.sankuai.waimai.foundation.utils.log.a.c("NetMonitoredManager", "registerSoftReferenceObserver activity : %s ", obj);
        HashMap<String, SoftReference<b>> hashMap = this.b.get(obj);
        if (hashMap == null) {
            hashMap = new HashMap<>();
            this.b.put(obj, hashMap);
        }
        hashMap.put(bVar.toString(), new SoftReference<>(bVar));
    }

    @MainThread
    public final void a(b bVar) {
        HashMap<String, SoftReference<b>> next;
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "35456ace7ee033eef310fa91373f260b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "35456ace7ee033eef310fa91373f260b");
        } else if (bVar != null) {
            ad.a();
            Iterator<HashMap<String, SoftReference<b>>> it = this.b.values().iterator();
            while (it.hasNext() && ((next = it.next()) == null || next.remove(Integer.valueOf(bVar.hashCode())) == null)) {
            }
            for (LinkedList<b> linkedList : this.c.values()) {
                if (linkedList != null && linkedList.remove(bVar)) {
                    return;
                }
            }
        }
    }

    public final boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4752d941c08c27289b807711288e5610", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4752d941c08c27289b807711288e5610")).booleanValue();
        }
        if (this.g == null) {
            return false;
        }
        return "true".equals(this.g.getParamWithKey("complex_image_close"));
    }

    public final boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f2b888c30ffa0ef61e1da3b94ebcc47b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f2b888c30ffa0ef61e1da3b94ebcc47b")).booleanValue();
        }
        if (this.g == null) {
            return false;
        }
        return "true".equals(this.g.getParamWithKey("error_data_reload"));
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a implements b {
        public static ChangeQuickRedirect c;

        @Override // com.sankuai.waimai.platform.net.d.b
        public void a(boolean z) {
            Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = c;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7708e9dd8b1b2c47a92dd6607a679510", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7708e9dd8b1b2c47a92dd6607a679510");
                return;
            }
            com.sankuai.waimai.foundation.utils.log.a.c("NetMonitoredManager", "onNetStateChange healthyNetwork : " + z, new Object[0]);
        }

        @Override // com.sankuai.waimai.platform.net.d.b
        public final void a(com.sankuai.waimai.platform.net.a aVar) {
            Object[] objArr = {aVar};
            ChangeQuickRedirect changeQuickRedirect = c;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d6ccd024d93d7247465866a8405aff8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d6ccd024d93d7247465866a8405aff8");
                return;
            }
            com.sankuai.waimai.foundation.utils.log.a.c("NetMonitoredManager", "onNetQualityChange quality : " + aVar, new Object[0]);
        }
    }
}

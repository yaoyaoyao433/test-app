package com.sankuai.waimai.touchmatrix;

import android.app.Application;
import android.os.Bundle;
import android.support.annotation.NonNull;
import com.meituan.android.common.metricx.helpers.AppBus;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.touchmatrix.dialog.gesture.f;
import com.sankuai.waimai.touchmatrix.rebuild.factory.TypeViewFactory;
import com.sankuai.waimai.touchmatrix.rebuild.utils.d;
import com.sankuai.waimai.touchmatrix.show.e;
import com.sankuai.waimai.touchmatrix.utils.g;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public ConcurrentHashMap<String, C1348a> b;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface c {
        void a(String str);

        void a(String str, Bundle bundle);

        void b(String str);
    }

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e4488971c728c7dc097923fa45c4642a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e4488971c728c7dc097923fa45c4642a");
            return;
        }
        final d a2 = d.a();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = d.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "b56bf10e5770be9681378431f716a93f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "b56bf10e5770be9681378431f716a93f");
        } else if (a2.d) {
            com.sankuai.waimai.touchmatrix.rebuild.utils.c.b("TMatrixLifecycleManager 已经启动", new Object[0]);
        } else {
            try {
                com.sankuai.waimai.touchmatrix.rebuild.utils.c.b("TMatrixLifecycleManager 注册生命周期回调", new Object[0]);
                ((Application) com.meituan.android.singleton.b.a).registerActivityLifecycleCallbacks(a2);
                AppBus.getInstance().register(new AppBus.OnForegroundListener() { // from class: com.sankuai.waimai.touchmatrix.rebuild.utils.d.1
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.android.common.metricx.helpers.AppBus.OnForegroundListener
                    public final void onForeground() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "2673ef28d8d7379f764c8645364733bc", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "2673ef28d8d7379f764c8645364733bc");
                        } else {
                            d.a(d.this);
                        }
                    }
                });
                AppBus.getInstance().register(new AppBus.OnBackgroundListener() { // from class: com.sankuai.waimai.touchmatrix.rebuild.utils.d.2
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.android.common.metricx.helpers.AppBus.OnBackgroundListener
                    public final void onBackground() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "daadadde643ab32d80512ebf97bcc552", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "daadadde643ab32d80512ebf97bcc552");
                        } else {
                            d.b(d.this);
                        }
                    }
                });
                a2.d = true;
            } catch (Exception e) {
                com.sankuai.waimai.touchmatrix.rebuild.utils.c.e("TMatrixLifecycleManager 注册生命周期回调失败: " + e.getMessage(), new Object[0]);
            }
        }
        this.b = new ConcurrentHashMap<>();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class b {
        private static final a a = new a();
    }

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0eb1a785cd4f9e3e4218a74c901e1e18", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0eb1a785cd4f9e3e4218a74c901e1e18") : b.a;
    }

    public final void a(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea7bdb542127e7aa5ad9aea05183abb3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea7bdb542127e7aa5ad9aea05183abb3");
            return;
        }
        try {
            com.sankuai.waimai.touchmatrix.rebuild.biz.a.a(str);
            com.sankuai.waimai.touchmatrix.rebuild.utils.c.d("TMatrix startByBiz 新方案 注册sharPush 业务Biz: " + str, new Object[0]);
            com.sankuai.waimai.touchmatrix.rebuild.message.c.a().a(str);
        } catch (Exception e) {
            com.sankuai.waimai.touchmatrix.rebuild.utils.c.d("TMatrix startByBiz 失败 :" + e.getMessage(), new Object[0]);
        }
    }

    public final C1348a b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "91efe78b026f5e37708c29ab08f8dbfe", RobustBitConfig.DEFAULT_VALUE)) {
            return (C1348a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "91efe78b026f5e37708c29ab08f8dbfe");
        }
        if (g.a(str)) {
            return null;
        }
        return this.b.get(str);
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.touchmatrix.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C1348a {
        public static ChangeQuickRedirect a;
        public c b;
        public String c;
        public HashMap<String, String> d;
        public com.sankuai.waimai.touchmatrix.show.c e;
        public e f;
        public TypeViewFactory g;
        public String h;
        public String i;
        public List<String> j;
        public f k;
        public com.sankuai.waimai.touchmatrix.rebuild.biz.b l;
        public com.sankuai.waimai.touchmatrix.monitor.d m;
        public com.sankuai.waimai.touchmatrix.show.d n;
        public com.sankuai.waimai.touchmatrix.show.g o;

        public C1348a(String str, HashMap<String, String> hashMap) {
            Object[] objArr = {str, hashMap};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "535bce45e8d4b592ef7748766bd85a8a", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "535bce45e8d4b592ef7748766bd85a8a");
                return;
            }
            this.c = str;
            this.d = hashMap;
        }
    }

    public final void a(com.sankuai.waimai.touchmatrix.event.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc2c1e502dfd05cfab9f081cb48bfa2c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc2c1e502dfd05cfab9f081cb48bfa2c");
        } else {
            com.sankuai.waimai.touchmatrix.rebuild.message.b.a().a(aVar);
        }
    }
}

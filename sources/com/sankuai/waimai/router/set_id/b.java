package com.sankuai.waimai.router.set_id;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.gson.JsonSyntaxException;
import com.meituan.passport.UserCenter;
import com.meituan.passport.pojo.User;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.exception.c;
import com.sankuai.waimai.router.set_id.setIdRequest.SetIdRequest;
import java.util.Map;
import org.json.JSONException;
import rx.d;
import rx.j;
import rx.k;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class b {
    public static ChangeQuickRedirect a;
    private static volatile b e;
    public com.dianping.monitor.impl.a b;
    public SetIdRequest c;
    public Context d;
    private k f;
    private boolean g;

    public static /* synthetic */ long a(b bVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "94d25cdcf3afe183dba459e2ebd601f0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "94d25cdcf3afe183dba459e2ebd601f0")).longValue();
        }
        User user = UserCenter.getInstance(bVar.d).getUser();
        if (user != null) {
            return user.id;
        }
        return 0L;
    }

    public static /* synthetic */ k a(b bVar, k kVar) {
        bVar.f = null;
        return null;
    }

    public static /* synthetic */ void a(b bVar, int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "1eb7ecf84ffa60061bc7c8f89ab5d0df", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "1eb7ecf84ffa60061bc7c8f89ab5d0df");
            return;
        }
        try {
            if (bVar.b != null) {
                bVar.b.pv(0L, "waimai_setid_download", 0, 0, i, 0, 0, 0);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e4782cb958fa0541aca5ea920435012b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e4782cb958fa0541aca5ea920435012b");
        } else {
            this.g = false;
        }
    }

    public static b a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c932fb9c0fc958c33239522b85eeea15", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c932fb9c0fc958c33239522b85eeea15");
        }
        if (e == null) {
            synchronized (b.class) {
                if (e == null) {
                    e = new b();
                }
            }
        }
        return e;
    }

    public final Map<String, String> b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a21694ed19d0d34dd74c1e8fbc3ab8fe", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a21694ed19d0d34dd74c1e8fbc3ab8fe") : com.sankuai.waimai.router.set_id.a.a(this.d, this);
    }

    public final Map<String, String> a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d86a9a39681d574e57f0595f4062fa4", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d86a9a39681d574e57f0595f4062fa4");
        }
        b bVar = null;
        if (str == null || !str.endsWith("v6/set/info")) {
            bVar = this;
        }
        return com.sankuai.waimai.router.set_id.a.a(this.d, bVar);
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3780f95f4bdc4801988bb866488e65ec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3780f95f4bdc4801988bb866488e65ec");
            return;
        }
        k kVar = this.f;
        if (kVar != null) {
            kVar.unsubscribe();
        }
        com.sankuai.waimai.router.set_id.a.b(this.d);
    }

    public final void a(boolean z, int i) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a2b5a842b10a09c3ec136eb650c36e9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a2b5a842b10a09c3ec136eb650c36e9");
            return;
        }
        try {
            if (this.g != z) {
                this.g = z;
                if (!z || this.b == null) {
                    return;
                }
                this.b.pv(0L, "waimai_setid_upload", 0, 0, i, 0, 0, 0);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ad8fd6ed82607fa71b6072696aab91f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ad8fd6ed82607fa71b6072696aab91f");
            return;
        }
        this.f = d.a(new j<com.sankuai.waimai.router.set_id.model.a<com.sankuai.waimai.router.set_id.model.b>>() { // from class: com.sankuai.waimai.router.set_id.b.2
            public static ChangeQuickRedirect a;
            public long b;

            {
                this.b = b.a(b.this);
            }

            @Override // rx.e
            public final /* synthetic */ void onNext(Object obj) {
                com.sankuai.waimai.router.set_id.model.a aVar = (com.sankuai.waimai.router.set_id.model.a) obj;
                Object[] objArr2 = {aVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "106994531f50411fd2988bca97e9b12c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "106994531f50411fd2988bca97e9b12c");
                } else if (aVar == null) {
                    b.a(b.this, 15004);
                } else if (aVar.a != 0) {
                    b.a(b.this, 15003);
                } else {
                    com.sankuai.waimai.router.set_id.model.b bVar = (com.sankuai.waimai.router.set_id.model.b) aVar.c;
                    if (bVar == null || (TextUtils.isEmpty(bVar.a) && TextUtils.isEmpty(bVar.b))) {
                        b.a(b.this, 15012);
                    } else if (TextUtils.isEmpty(bVar.a)) {
                        b.a(b.this, 15010);
                    } else if (TextUtils.isEmpty(bVar.b)) {
                        b.a(b.this, 15011);
                    } else {
                        b.a(b.this, 15000);
                    }
                    long a2 = b.a(b.this);
                    if (a2 <= 0 || a2 != this.b || bVar == null || bVar.a == null || bVar.b == null) {
                        return;
                    }
                    Context context = b.this.d;
                    String str = bVar.a;
                    String str2 = bVar.b;
                    long j = this.b;
                    Object[] objArr3 = {context, str, str2, new Long(j)};
                    ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.router.set_id.a.a;
                    if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "79ca465ad7b802dfe31304e3e7200de4", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "79ca465ad7b802dfe31304e3e7200de4");
                    } else {
                        com.sankuai.waimai.router.set_id.a.a(context, str, str2, j);
                    }
                }
            }

            @Override // rx.e
            public final void onCompleted() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3c102f8042cb872d513650fcbab2be4c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3c102f8042cb872d513650fcbab2be4c");
                } else {
                    b.a(b.this, (k) null);
                }
            }

            @Override // rx.e
            public final void onError(Throwable th) {
                Object[] objArr2 = {th};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "249f8716989a821b7bcad7448b26fe4e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "249f8716989a821b7bcad7448b26fe4e");
                    return;
                }
                th.printStackTrace();
                if ((th instanceof com.sankuai.meituan.retrofit2.exception.b) || (th.getCause() instanceof JsonSyntaxException) || (th.getCause() instanceof JSONException)) {
                    b.a(b.this, 15002);
                } else if (th instanceof c) {
                    b.a(b.this, 15001);
                } else {
                    b.a(b.this, 15020);
                }
            }
        }, this.c.getSetId().b(rx.schedulers.a.e()));
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public class a implements Application.ActivityLifecycleCallbacks {
        public static ChangeQuickRedirect a;
        public boolean b;
        public int c;
        public Runnable d;
        public Handler e;

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
            Object[] objArr = {activity, bundle};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ca295e579033c65911517973ea29c11", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ca295e579033c65911517973ea29c11");
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
        }

        private a() {
            Object[] objArr = {b.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "00a536fc2ba3342df25702f2ace6a971", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "00a536fc2ba3342df25702f2ace6a971");
                return;
            }
            this.c = 0;
            this.d = new Runnable() { // from class: com.sankuai.waimai.router.set_id.b.a.1
                @Override // java.lang.Runnable
                public final void run() {
                    a.this.b = true;
                }
            };
            this.e = new Handler(Looper.getMainLooper());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
            Object[] objArr = {activity};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "59a18c315a29a28c02065fb4fc391bc6", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "59a18c315a29a28c02065fb4fc391bc6");
                return;
            }
            this.e.removeCallbacks(this.d);
            this.c = activity.hashCode();
            if (this.b && UserCenter.getInstance(b.this.d).isLogin()) {
                b.this.d();
            }
            this.b = false;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
            Object[] objArr = {activity};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0451aa594e3d426017dc91827162df8e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0451aa594e3d426017dc91827162df8e");
            } else if (activity.hashCode() == this.c) {
                this.e.postDelayed(this.d, 300L);
            }
        }
    }
}

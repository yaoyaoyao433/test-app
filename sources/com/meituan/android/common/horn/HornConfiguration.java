package com.meituan.android.common.horn;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.android.common.horn.extra.lifecycle.ILifecycleListener;
import com.meituan.android.common.horn.extra.lifecycle.ILifecycleService;
import com.meituan.android.common.horn.extra.monitor.IHornMonitorService;
import com.meituan.android.common.horn.extra.sharkpush.ISharkPushService;
import com.meituan.android.common.horn.extra.uuid.IUUIDService;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.meituan.retrofit2.raw.a;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class HornConfiguration {
    public static ChangeQuickRedirect changeQuickRedirect;
    private a.InterfaceC0637a callFactory;
    private ISharkPushService sharkPushService;
    private IUUIDService uuidService;

    public String baseUrl() {
        return "https://portal-portm.meituan.com/";
    }

    @Nullable
    public Map<String, ?> extraQuery() {
        return null;
    }

    public int getDeviceLevel() {
        return 3;
    }

    @Nullable
    public IHornMonitorService monitorService() {
        return null;
    }

    public HornConfiguration() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a81692457da3769461fd184313d456fb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a81692457da3769461fd184313d456fb");
            return;
        }
        this.callFactory = null;
        this.uuidService = null;
        this.sharkPushService = null;
    }

    public a.InterfaceC0637a callFactory() {
        return this.callFactory;
    }

    public IUUIDService uuidService() {
        return this.uuidService;
    }

    public ISharkPushService sharkPushService() {
        return this.sharkPushService;
    }

    @NonNull
    public ILifecycleService lifecycleService() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dd5aa3c554e31d7a390ba011c5c9e2dd", 6917529027641081856L) ? (ILifecycleService) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dd5aa3c554e31d7a390ba011c5c9e2dd") : new ILifecycleService() { // from class: com.meituan.android.common.horn.HornConfiguration.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.meituan.android.common.horn.extra.lifecycle.ILifecycleService
            public void register(@NonNull Application application, @NonNull final ILifecycleListener iLifecycleListener) {
                Object[] objArr2 = {application, iLifecycleListener};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "f30f2b751347205491661475371e0161", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "f30f2b751347205491661475371e0161");
                } else {
                    application.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: com.meituan.android.common.horn.HornConfiguration.1.1
                        public static ChangeQuickRedirect changeQuickRedirect;
                        private int num;

                        @Override // android.app.Application.ActivityLifecycleCallbacks
                        public void onActivityCreated(Activity activity, Bundle bundle) {
                            Object[] objArr3 = {activity, bundle};
                            ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "40316e457d080b54b63dc88e32472825", 6917529027641081856L)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "40316e457d080b54b63dc88e32472825");
                            }
                        }

                        @Override // android.app.Application.ActivityLifecycleCallbacks
                        public void onActivityDestroyed(Activity activity) {
                        }

                        @Override // android.app.Application.ActivityLifecycleCallbacks
                        public void onActivityPaused(Activity activity) {
                        }

                        @Override // android.app.Application.ActivityLifecycleCallbacks
                        public void onActivityResumed(Activity activity) {
                        }

                        @Override // android.app.Application.ActivityLifecycleCallbacks
                        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                        }

                        @Override // android.app.Application.ActivityLifecycleCallbacks
                        public void onActivityStarted(Activity activity) {
                            Object[] objArr3 = {activity};
                            ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "251a7bf59cc881c17ba1b9976ea89b0e", 6917529027641081856L)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "251a7bf59cc881c17ba1b9976ea89b0e");
                                return;
                            }
                            int i = this.num + 1;
                            this.num = i;
                            if (i == 1) {
                                iLifecycleListener.onForeground();
                            }
                        }

                        @Override // android.app.Application.ActivityLifecycleCallbacks
                        public void onActivityStopped(Activity activity) {
                            Object[] objArr3 = {activity};
                            ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "363421e76b8f67824fac684c7f5dda59", 6917529027641081856L)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "363421e76b8f67824fac684c7f5dda59");
                                return;
                            }
                            int i = this.num - 1;
                            this.num = i;
                            if (i == 0) {
                                iLifecycleListener.onBackground();
                            }
                        }
                    });
                }
            }
        };
    }

    public void setCallFactory(a.InterfaceC0637a interfaceC0637a) {
        this.callFactory = interfaceC0637a;
    }

    public void setUUIDService(IUUIDService iUUIDService) {
        this.uuidService = iUUIDService;
    }

    public void setSharkPushService(ISharkPushService iSharkPushService) {
        this.sharkPushService = iSharkPushService;
    }
}

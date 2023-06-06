package com.meituan.mmp.lib.api;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.Pair;
import com.meituan.mmp.lib.DebugHelper;
import com.meituan.mmp.lib.api.audio.AudioPlayerApi;
import com.meituan.mmp.lib.api.auth.SettingModule;
import com.meituan.mmp.lib.api.canvas.CanvasApi;
import com.meituan.mmp.lib.api.coverview.AnimateCoverViewApi;
import com.meituan.mmp.lib.api.coverview.ImageViewApi;
import com.meituan.mmp.lib.api.coverview.ScrollViewApi;
import com.meituan.mmp.lib.api.coverview.TextViewApi;
import com.meituan.mmp.lib.api.device.AccelerometerModule;
import com.meituan.mmp.lib.api.device.CompassModule;
import com.meituan.mmp.lib.api.device.DeviceMotionModule;
import com.meituan.mmp.lib.api.device.GyroscopeModule;
import com.meituan.mmp.lib.api.device.MenuButtonModule;
import com.meituan.mmp.lib.api.device.NetInfoModule;
import com.meituan.mmp.lib.api.device.RecorderModule;
import com.meituan.mmp.lib.api.device.ScreenCaptureModule;
import com.meituan.mmp.lib.api.device.ScreenModule;
import com.meituan.mmp.lib.api.device.ScreenRecordModule;
import com.meituan.mmp.lib.api.device.SystemInfoModule;
import com.meituan.mmp.lib.api.device.WifiModule;
import com.meituan.mmp.lib.api.file.FileModule;
import com.meituan.mmp.lib.api.info.CanIUseApi;
import com.meituan.mmp.lib.api.input.TextAreaApi;
import com.meituan.mmp.lib.api.location.RequestLocationModule;
import com.meituan.mmp.lib.api.mdns.MDNSApi;
import com.meituan.mmp.lib.api.media.ImageCompressModule;
import com.meituan.mmp.lib.api.media.ImageInfoModule;
import com.meituan.mmp.lib.api.media.ImageModule;
import com.meituan.mmp.lib.api.media.MediaModule;
import com.meituan.mmp.lib.api.network.DownloadModule;
import com.meituan.mmp.lib.api.network.RequestModule;
import com.meituan.mmp.lib.api.network.RequestPrefetchApi;
import com.meituan.mmp.lib.api.network.UploadModule;
import com.meituan.mmp.lib.api.network.WebSocketModule;
import com.meituan.mmp.lib.api.report.MetricsModule;
import com.meituan.mmp.lib.api.report.PerformanceReportApi;
import com.meituan.mmp.lib.api.route.RouteApi;
import com.meituan.mmp.lib.api.share.ShareUiApi;
import com.meituan.mmp.lib.api.storage.RenderingCacheModule;
import com.meituan.mmp.lib.api.storage.StorageModule;
import com.meituan.mmp.lib.api.ui.ApiOpenLink;
import com.meituan.mmp.lib.api.ui.DialogModule;
import com.meituan.mmp.lib.api.ui.MiniProgramApi;
import com.meituan.mmp.lib.api.ui.PageModule;
import com.meituan.mmp.lib.api.ui.PageScrollApi;
import com.meituan.mmp.lib.api.ui.PickerModule;
import com.meituan.mmp.lib.api.update.UpdateManageApi;
import com.meituan.mmp.lib.api.video.VideoPickerModule;
import com.meituan.mmp.lib.api.video.VideoPlayerApi;
import com.meituan.mmp.lib.api.web.MTWebViewModule;
import com.meituan.mmp.lib.api.web.WebViewModule;
import com.meituan.mmp.lib.api.widget.WidgetEventApi;
import com.meituan.mmp.lib.engine.b;
import com.meituan.mmp.lib.executor.a;
import com.meituan.mmp.lib.model.Event;
import com.meituan.mmp.lib.trace.b;
import com.meituan.mmp.lib.utils.ah;
import com.meituan.mmp.lib.utils.v;
import com.meituan.mmp.main.IApiCallback;
import com.meituan.mmp.main.MMPEnvHelper;
import com.meituan.mmp.main.ab;
import com.meituan.msi.privacy.permission.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class n implements k {
    public static ChangeQuickRedirect a;
    public static final Map<String, String> k = com.sankuai.meituan.serviceloader.b.b().get(ActivityApi.class.getName());
    public static final Map<String, String> l = com.sankuai.meituan.serviceloader.b.b().get(ServiceApi.class.getName());
    public final Set<ServiceApi> b;
    public volatile Set<ActivityApi> c;
    public Handler d;
    public com.meituan.msi.privacy.permission.a e;
    public ConcurrentHashMap<Integer, b> f;
    public boolean g;
    public boolean h;
    public com.meituan.mmp.lib.api.auth.f i;
    public Map<String, c> j;
    private final Map<String, ServiceApi> m;
    private final Map<com.meituan.mmp.lib.a, Map<String, ActivityApi>> n;
    private volatile Map<String, ActivityApi> o;
    private final Queue<Object> p;
    private final Map<com.meituan.mmp.lib.a, Set<ActivityApi>> q;
    private final Map<String[], Pair<Event, IApiCallback>> r;
    private b s;
    private final com.meituan.mmp.lib.engine.m t;
    private final com.meituan.mmp.lib.config.a u;
    @Nullable
    private com.meituan.mmp.lib.a v;
    private com.meituan.mmp.lib.interfaces.c w;
    private b.a x;
    private h y;

    @Override // com.meituan.mmp.lib.api.k
    public final void a(Configuration configuration) {
    }

    public n(h hVar, com.meituan.mmp.lib.engine.m mVar, com.meituan.mmp.lib.interfaces.c cVar, b.a aVar) {
        Object[] objArr = {hVar, mVar, cVar, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "05598024992951e5442a305a7841ecb0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "05598024992951e5442a305a7841ecb0");
            return;
        }
        this.m = new ah();
        this.n = new ah();
        this.o = new ah();
        this.p = new ConcurrentLinkedQueue();
        this.b = new CopyOnWriteArraySet();
        this.q = new ah();
        this.c = new CopyOnWriteArraySet();
        this.r = new ah();
        this.d = new Handler(Looper.getMainLooper());
        this.y = null;
        this.f = new ConcurrentHashMap<>();
        this.i = com.meituan.mmp.lib.api.auth.d.a();
        this.j = MMPEnvHelper.getUserDefinedApis();
        this.y = hVar;
        this.t = mVar;
        this.u = this.t.d;
        this.w = cVar;
        this.x = aVar;
        this.e = new com.meituan.msi.privacy.permission.a(107, new com.meituan.mmp.lib.msi.i(hVar, this.t.r), hVar.k);
        ab.a("addServiceApis");
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "dcab7a7149c8639c6d2c971269c690c8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "dcab7a7149c8639c6d2c971269c690c8");
        } else {
            a(new CanIUseApi(this));
            a(new SystemInfoModule());
            a(new UpdateManageApi(this.x));
            a(new NetInfoModule());
            a(new ScreenCaptureModule());
            a(new ScreenRecordModule());
            a(new AccelerometerModule());
            a(new CompassModule());
            a(new GyroscopeModule());
            a(new DeviceMotionModule());
            a(new WifiModule());
            a(new RecorderModule());
            a(new RequestLocationModule());
            a(new MetricsModule());
            a(new StorageModule());
            a(new RenderingCacheModule());
            a(new FileModule());
            a(new RequestModule());
            a(new DownloadModule());
            a(new UploadModule());
            a(new RequestPrefetchApi(this.t.f));
            a(new WebSocketModule());
            a(new MDNSApi());
            a(new AudioPlayerApi());
            a(new ImageInfoModule());
            a(new ImageCompressModule());
            a(new PerformanceReportApi());
        }
        ab.a();
    }

    @Override // com.meituan.mmp.lib.api.k
    public final void a(@NonNull com.meituan.mmp.lib.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f0138454e0202ef742d520cff52e4b5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f0138454e0202ef742d520cff52e4b5");
            return;
        }
        this.v = aVar;
        for (ServiceApi serviceApi : this.b) {
            serviceApi.a(aVar);
        }
        this.o = this.n.get(this.v);
        this.c = this.q.get(this.v);
        if (this.o == null) {
            ab.a("addActivityApis");
            this.o = new ah();
            this.c = new CopyOnWriteArraySet();
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "20246c84bcda3ada5f51ed350445a7da", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "20246c84bcda3ada5f51ed350445a7da");
            } else {
                a(new ScreenModule());
                a(new ImageModule());
                a(new VideoPickerModule());
                a(new PageModule());
                a(new MiniProgramApi());
                a(new RouteApi());
                a(new ApiOpenLink());
                a(new MenuButtonModule());
                a(new ShareUiApi());
                a(new PageScrollApi());
                a(new DialogModule());
                a(new PickerModule());
                a(new SettingModule(this));
                a(new TextAreaApi());
                a(new CanvasApi());
                a((this.t.j.c() && com.meituan.mtwebkit.internal.l.f()) ? new MTWebViewModule(this.y, this.t.o) : new WebViewModule(this.y, this.t.o));
                a(new VideoPlayerApi());
                a(new ImageViewApi());
                a(new TextViewApi());
                a(new ScrollViewApi());
                a(new AnimateCoverViewApi());
                a(new MediaModule());
                a(new WidgetEventApi());
            }
            this.n.put(this.v, this.o);
            this.q.put(this.v, this.c);
            ab.a();
        }
    }

    @Override // com.meituan.mmp.lib.api.k
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d6075935c5ba89c657dcf48a6bc10ee5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d6075935c5ba89c657dcf48a6bc10ee5");
            return;
        }
        ab.a("ApisManager.onCreate");
        this.g = true;
        for (ActivityApi activityApi : this.c) {
            activityApi.onCreate();
        }
        ab.a();
    }

    @Override // com.meituan.mmp.lib.api.k
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b0b8050345e6c6ac86600e7748a9219b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b0b8050345e6c6ac86600e7748a9219b");
            return;
        }
        for (ServiceApi serviceApi : this.b) {
            serviceApi.i();
        }
        this.d.removeCallbacksAndMessages(null);
        this.v = null;
    }

    @Override // com.meituan.mmp.lib.api.k
    public final void b(com.meituan.mmp.lib.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f727b77018bb75ce216d2e992f9bbf8d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f727b77018bb75ce216d2e992f9bbf8d");
            return;
        }
        this.n.remove(aVar);
        if (this.n.size() == 0) {
            this.g = false;
        }
        Set<ActivityApi> remove = this.q.remove(aVar);
        if (remove != null) {
            for (ActivityApi activityApi : remove) {
                activityApi.onDestroy();
            }
        }
        if (this.v == aVar) {
            this.v = null;
        }
    }

    @Override // com.meituan.mmp.lib.api.k
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "390da38e95eacdb715cd8881ae04d7b4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "390da38e95eacdb715cd8881ae04d7b4");
            return;
        }
        this.h = false;
        for (ActivityApi activityApi : this.c) {
            activityApi.onPause();
        }
        for (ServiceApi serviceApi : this.b) {
            serviceApi.onPause();
        }
    }

    @Override // com.meituan.mmp.lib.api.k
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a4907400e2fc7b75077a3adb4a54e792", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a4907400e2fc7b75077a3adb4a54e792");
            return;
        }
        this.h = true;
        for (ActivityApi activityApi : this.c) {
            activityApi.onResume();
        }
        for (ServiceApi serviceApi : this.b) {
            serviceApi.onResume();
        }
    }

    @Override // com.meituan.mmp.lib.api.k
    public final void a(int i, int i2, Intent intent) {
        b remove;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e162b6e97ca88e02de08187fe6e0f97", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e162b6e97ca88e02de08187fe6e0f97");
        } else if (this.v == null || (remove = this.f.remove(Integer.valueOf(this.v.L))) == null || remove.b == null || i != 97) {
        } else {
            remove.b.onActivityResult(i2, intent, remove.c);
        }
    }

    private static boolean a(String[] strArr, String str) {
        Object[] objArr = {strArr, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5a64efad0bd92517fb0041fe9fb051cb", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5a64efad0bd92517fb0041fe9fb051cb")).booleanValue();
        }
        for (String str2 : strArr) {
            if (!com.meituan.msi.privacy.permission.a.a(MMPEnvHelper.getContext(), str2, str)) {
                return false;
            }
        }
        return true;
    }

    private boolean b(Event event, InternalApi internalApi, IApiCallback iApiCallback) {
        Object[] objArr = {event, internalApi, iApiCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee600fa4c84ce9241d7a6d70c77bbc7b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee600fa4c84ce9241d7a6d70c77bbc7b")).booleanValue();
        }
        if (internalApi instanceof ActivityApi) {
            if (this.v == null || this.v.g()) {
                try {
                    iApiCallback.onSuccess(((ActivityApi) internalApi).a(event.b));
                    b.a.b("no activity attached, api " + event.b + " returns fallback value");
                } catch (d e) {
                    b.a.b(event.b + " api call failed, " + e.getMessage());
                    iApiCallback.onFail(AbsApi.codeJson(-1, event.b + " api call failed, " + e.getMessage()));
                }
                return false;
            }
            return true;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(final Event event, final InternalApi internalApi, final IApiCallback iApiCallback) {
        String[] a2;
        Object[] objArr = {event, internalApi, iApiCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f7e7248f7087c86feacdc0e959528d6e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f7e7248f7087c86feacdc0e959528d6e");
            return;
        }
        String token = AbsApi.getToken(event.a());
        if (internalApi != null && !internalApi.c(event.b) && (a2 = internalApi.a(event.b, event.a())) != null && a2.length > 0 && !a(a2, token)) {
            if (!f()) {
                iApiCallback.onFail(null);
                return;
            } else {
                a(a2, token, new a.InterfaceC0498a() { // from class: com.meituan.mmp.lib.api.n.2
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.msi.privacy.permission.a.InterfaceC0498a
                    public final void onResult(String str, String[] strArr, int[] iArr, String str2) {
                        Object[] objArr2 = {str, strArr, iArr, str2};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a75eb65aa30415b64e37c72d3947d28f", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a75eb65aa30415b64e37c72d3947d28f");
                            return;
                        }
                        if (strArr != null && strArr.length > 0) {
                            com.meituan.mmp.lib.trace.b.b("MMPPrivacy", "MMP requestPermissions result " + strArr[0]);
                        }
                        if (com.meituan.msi.privacy.permission.a.a(iArr)) {
                            n.this.a(event, internalApi, iApiCallback);
                            return;
                        }
                        iApiCallback.onFail(AbsApi.codeJson(-401001, event.b + ": " + str2));
                    }
                });
                return;
            }
        }
        a(event, internalApi, iApiCallback);
    }

    private boolean f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "443012031515d7949c05fce2e667b016", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "443012031515d7949c05fce2e667b016")).booleanValue();
        }
        if (this.v == null || this.v.g()) {
            return false;
        }
        return !this.v.b() || this.v.f();
    }

    public final void a(@NonNull String[] strArr, String str, a.InterfaceC0498a interfaceC0498a) {
        Object[] objArr = {strArr, str, interfaceC0498a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fce2289b235d504974687096fec8b5f7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fce2289b235d504974687096fec8b5f7");
            return;
        }
        if (this.y.e()) {
            this.y.a(strArr, str, interfaceC0498a);
        } else {
            com.meituan.mmp.lib.trace.b.b("MMPPrivacy", "requestPermission " + strArr[0]);
            if (this.v != null) {
                this.e.a(this.v.f, strArr, str, interfaceC0498a);
            } else {
                com.meituan.mmp.lib.trace.b.d("MMPApisManager", "requestPermissionsOrEnqueue mCurrController is null");
                interfaceC0498a.onResult(str, strArr, null, "requestPermissionsOrEnqueue mCurrController is null");
            }
        }
        this.u.h.b("mmp.permission.count.request", (Map<String, Object>) v.a("permissionCount", Integer.valueOf(strArr.length), "permission0", strArr[0]));
    }

    public final void a(final Event event, final InternalApi internalApi, final IApiCallback iApiCallback) {
        Object[] objArr = {event, internalApi, iApiCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a8cb6943985f59abdd975c4ce08daa0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a8cb6943985f59abdd975c4ce08daa0");
        } else if (internalApi != null) {
            Runnable runnable = new Runnable() { // from class: com.meituan.mmp.lib.api.n.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "41451f7e1eed4bfc576af4cf08a0b911", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "41451f7e1eed4bfc576af4cf08a0b911");
                        return;
                    }
                    ab.a("invoke async: " + event.b, DebugHelper.x);
                    n.this.a(event, (AbsApi) internalApi, iApiCallback);
                    ab.a(DebugHelper.x);
                }
            };
            if (internalApi.d()) {
                a.c.a(runnable);
            } else {
                this.d.post(runnable);
            }
        } else {
            iApiCallback.onFail(AbsApi.codeJson(-1, "api not found"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Event event, AbsApi absApi, IApiCallback iApiCallback) {
        Object[] objArr = {event, absApi, iApiCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "92dbe7ef7fb100459397f1a8d78a14b2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "92dbe7ef7fb100459397f1a8d78a14b2");
            return;
        }
        absApi.setApiContext(new a(absApi));
        try {
            absApi.invoke(event, iApiCallback);
        } catch (d e) {
            String str = null;
            if (e instanceof s) {
                if (DebugHelper.q) {
                    com.meituan.mmp.lib.trace.b.c("ApisManager", "API " + event.b + " not supported in widget but ignored");
                    iApiCallback.onSuccess(null);
                    return;
                } else if (TextUtils.isEmpty(e.getMessage())) {
                    str = "API " + event.b + " not supported in widget";
                }
            }
            if (e.getClass() == d.class) {
                if (e.getCause() != null) {
                    str = e.getCause().toString();
                } else {
                    str = e.getMessage();
                }
            }
            if (str == null) {
                str = e.toString();
            }
            com.meituan.mmp.lib.trace.b.d("ApisManager", "API " + event.b + " failed : " + str);
            iApiCallback.onFail(AbsApi.codeJson(-1, str));
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class b {
        public static ChangeQuickRedirect a;
        AbsApi b;
        @Nullable
        IApiCallback c;

        public b(AbsApi absApi, @Nullable IApiCallback iApiCallback) {
            Object[] objArr = {absApi, iApiCallback};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4968adf0815e7be2027489aad2d45026", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4968adf0815e7be2027489aad2d45026");
                return;
            }
            this.b = absApi;
            this.c = iApiCallback;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public class a implements com.meituan.mmp.main.e {
        public static ChangeQuickRedirect a;
        private AbsApi c;

        public a(AbsApi absApi) {
            Object[] objArr = {n.this, absApi};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "51cfa2f5baa96f1e8a168d4b8f5f0e4f", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "51cfa2f5baa96f1e8a168d4b8f5f0e4f");
            } else {
                this.c = absApi;
            }
        }

        @Override // com.meituan.mmp.main.e
        public final Activity a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a4e902922070ba6263e5a82d3367d23b", RobustBitConfig.DEFAULT_VALUE)) {
                return (Activity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a4e902922070ba6263e5a82d3367d23b");
            }
            if (n.this.v != null) {
                return n.this.v.f;
            }
            return null;
        }

        @Override // com.meituan.mmp.main.e
        public final com.meituan.mmp.lib.ab b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b8d198074888b9493ac58ec9bddfd2b0", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.mmp.lib.ab) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b8d198074888b9493ac58ec9bddfd2b0") : n.this.y.c;
        }

        @Override // com.meituan.mmp.main.e
        public final com.meituan.mmp.lib.page.e a(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e6515fc346b55de4e709e73d91439a3", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.mmp.lib.page.e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e6515fc346b55de4e709e73d91439a3") : n.this.t.a(i);
        }

        @Override // com.meituan.mmp.main.e
        public final com.meituan.mmp.lib.config.a c() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "45920d405221a0528dc44701bd5887b2", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.mmp.lib.config.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "45920d405221a0528dc44701bd5887b2") : n.this.u;
        }

        @Override // com.meituan.mmp.main.e
        public final com.meituan.mmp.lib.devtools.e d() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d86ed9d2132f40e1017e1d0433ade84", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.mmp.lib.devtools.e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d86ed9d2132f40e1017e1d0433ade84") : n.this.t.m;
        }

        @Override // com.meituan.mmp.main.e
        public final void a(Intent intent, int i, @Nullable IApiCallback iApiCallback) {
            Object[] objArr = {intent, Integer.valueOf(i), iApiCallback};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a67ff0950184f6553f17ed7036e3cdb", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a67ff0950184f6553f17ed7036e3cdb");
            } else if (n.this.v != null) {
                b bVar = n.this.f.get(Integer.valueOf(n.this.v.L));
                if (bVar != null && bVar.b != null) {
                    this.c.onActivityResult(0, new Intent(), iApiCallback);
                } else {
                    bVar = new b(this.c, iApiCallback);
                }
                n.this.f.put(Integer.valueOf(n.this.v.L), bVar);
                n.this.v.a(intent, i);
            }
        }
    }

    @Override // com.meituan.mmp.lib.api.k
    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f5e44a90f366e260745d1d6d8e5af14f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f5e44a90f366e260745d1d6d8e5af14f");
        } else if (this.s == null || this.s.c == null) {
        } else {
            this.s.c.onFail(AbsApi.codeJson(-1, "canceled by popped activity"));
        }
    }

    private ActivityApi a(ActivityApi activityApi) {
        Object[] objArr = {activityApi};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd310ada1913324251cb63d6ff74f547", RobustBitConfig.DEFAULT_VALUE)) {
            return (ActivityApi) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd310ada1913324251cb63d6ff74f547");
        }
        if (activityApi == null) {
            return null;
        }
        a((n) activityApi, (Map<String, n>) this.o, (Set<n>) this.c);
        return activityApi;
    }

    private ServiceApi a(ServiceApi serviceApi) {
        Object[] objArr = {serviceApi};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "65bec29bb21eb6edf45ecdcb3d8d6e5d", RobustBitConfig.DEFAULT_VALUE)) {
            return (ServiceApi) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "65bec29bb21eb6edf45ecdcb3d8d6e5d");
        }
        if (serviceApi == null) {
            return null;
        }
        boolean contains = this.b.contains(serviceApi);
        a((n) serviceApi, (Map<String, n>) this.m, (Set<n>) this.b);
        if (!contains) {
            serviceApi.h();
        }
        return serviceApi;
    }

    private <T extends InternalApi> void a(T t, Map<String, T> map, Set<T> set) {
        Object[] objArr = {t, map, set};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c9994cd081fdc1ea6f581d68ceb7119", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c9994cd081fdc1ea6f581d68ceb7119");
        } else if (t != null) {
            t.a(this.v);
            t.d = this.w;
            t.e = this.t.n;
            String[] b2 = t.b();
            if (b2 != null) {
                for (String str : b2) {
                    if (!TextUtils.isEmpty(str)) {
                        map.put(str, t);
                    }
                }
            }
            set.add(t);
        }
    }

    public final InternalApi a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a55045adbd87e0824f2fbaf516a0658", RobustBitConfig.DEFAULT_VALUE)) {
            return (InternalApi) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a55045adbd87e0824f2fbaf516a0658");
        }
        InternalApi c = c(str);
        return c != null ? c : b(str);
    }

    private InternalApi b(String str) {
        c cVar;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a5012b2f233a04903b4dcfe4b6f691e", RobustBitConfig.DEFAULT_VALUE)) {
            return (InternalApi) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a5012b2f233a04903b4dcfe4b6f691e");
        }
        InternalApi internalApi = null;
        if (k != null && k.containsKey(str)) {
            internalApi = a((ActivityApi) com.sankuai.meituan.serviceloader.b.a(ActivityApi.class, str).get(0));
        } else if (l != null && l.containsKey(str)) {
            internalApi = a((ServiceApi) com.sankuai.meituan.serviceloader.b.a(ServiceApi.class, str).get(0));
        }
        if (this.j.containsKey(str) && (cVar = this.j.get(str)) != null) {
            internalApi = a(cVar);
        }
        if (internalApi != null) {
            if (this.g) {
                internalApi.onCreate();
            }
            if (this.h) {
                internalApi.onResume();
            }
        }
        return internalApi;
    }

    private InternalApi c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5083df24e7e2d88aeb9dbd840306ca2d", RobustBitConfig.DEFAULT_VALUE)) {
            return (InternalApi) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5083df24e7e2d88aeb9dbd840306ca2d");
        }
        ActivityApi activityApi = this.o != null ? this.o.get(str) : null;
        return activityApi == null ? this.m.get(str) : activityApi;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:12:0x0052
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:81)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:47)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public final java.lang.String a(com.meituan.mmp.lib.model.Event r19, com.meituan.mmp.lib.interfaces.a r20) {
        /*
            Method dump skipped, instructions count: 627
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.mmp.lib.api.n.a(com.meituan.mmp.lib.model.Event, com.meituan.mmp.lib.interfaces.a):java.lang.String");
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.meituan.mmp.lib.api.ApiFunction, com.meituan.mmp.lib.api.AbsApi] */
    private InternalApi a(@NonNull final c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3ca6bf51be8abc04d2bf547ee0ba1770", RobustBitConfig.DEFAULT_VALUE)) {
            return (InternalApi) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3ca6bf51be8abc04d2bf547ee0ba1770");
        }
        final ?? a2 = cVar.e.a();
        if (a2.isActivityApi()) {
            ActivityApi activityApi = new ActivityApi() { // from class: com.meituan.mmp.lib.api.MMPApisManager$4
                public static ChangeQuickRedirect h;

                @Override // com.meituan.mmp.lib.api.InternalApi
                public final String[] b() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = h;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cace811cf2ca2c6a7b2de5f241e67f2f", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cace811cf2ca2c6a7b2de5f241e67f2f") : new String[]{cVar.b};
                }

                @Override // com.meituan.mmp.lib.api.InternalApi
                public final String[] a(String str, JSONObject jSONObject) {
                    Object[] objArr2 = {str, jSONObject};
                    ChangeQuickRedirect changeQuickRedirect2 = h;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bcfa5ebf0d93b9d674854bd3036e88e4", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bcfa5ebf0d93b9d674854bd3036e88e4") : cVar.d;
                }

                @Override // com.meituan.mmp.lib.api.AbsApi
                public void invoke(Event event, IApiCallback iApiCallback) {
                    Object[] objArr2 = {event, iApiCallback};
                    ChangeQuickRedirect changeQuickRedirect2 = h;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ebcd6c2a395797c9088ff00adea1834a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ebcd6c2a395797c9088ff00adea1834a");
                    } else {
                        n.this.a(new Event(cVar.c, event.c, event.d), a2, iApiCallback);
                    }
                }

                @Override // com.meituan.mmp.lib.api.AbsApi
                public void onCreate() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = h;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "965f2b7daf3b00acec6c3cbc3fbadc32", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "965f2b7daf3b00acec6c3cbc3fbadc32");
                    } else {
                        a2.onCreate();
                    }
                }

                @Override // com.meituan.mmp.lib.api.AbsApi
                public void onPause() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = h;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "eb8ad927a5c5bfa90e55fa24e2fb5a35", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "eb8ad927a5c5bfa90e55fa24e2fb5a35");
                    } else {
                        a2.onPause();
                    }
                }

                @Override // com.meituan.mmp.lib.api.AbsApi
                public void onResume() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = h;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c6e216f55faae00fc71ab1c673719a26", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c6e216f55faae00fc71ab1c673719a26");
                    } else {
                        a2.onResume();
                    }
                }

                @Override // com.meituan.mmp.lib.api.AbsApi
                public void onDestroy() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = h;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "97bf9ce826af5f98b00bd43a47c461fe", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "97bf9ce826af5f98b00bd43a47c461fe");
                        return;
                    }
                    a2.onDestroy();
                    a2.setApiContext(null);
                }

                @Override // com.meituan.mmp.lib.api.AbsApi
                public void onActivityResult(int i, Intent intent, IApiCallback iApiCallback) {
                    Object[] objArr2 = {Integer.valueOf(i), intent, iApiCallback};
                    ChangeQuickRedirect changeQuickRedirect2 = h;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bf95b20920c3fe2207ab9cf5bd68339d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bf95b20920c3fe2207ab9cf5bd68339d");
                    } else {
                        a2.onActivityResult(i, intent, iApiCallback);
                    }
                }
            };
            a(activityApi);
            return activityApi;
        }
        ServiceApi serviceApi = new ServiceApi() { // from class: com.meituan.mmp.lib.api.MMPApisManager$5
            public static ChangeQuickRedirect a;

            @Override // com.meituan.mmp.lib.api.InternalApi
            public final String[] b() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7ec766c71bb3162d444b29e20831a6cd", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7ec766c71bb3162d444b29e20831a6cd") : new String[]{cVar.b};
            }

            @Override // com.meituan.mmp.lib.api.InternalApi
            public final String[] a(String str, JSONObject jSONObject) {
                Object[] objArr2 = {str, jSONObject};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c290a67822ba5e192aee4b7edaca2c8a", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c290a67822ba5e192aee4b7edaca2c8a") : cVar.d;
            }

            @Override // com.meituan.mmp.lib.api.AbsApi
            public void invoke(Event event, IApiCallback iApiCallback) throws d {
                Object[] objArr2 = {event, iApiCallback};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8281317b26b0c6b1af67268a1b210ba5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8281317b26b0c6b1af67268a1b210ba5");
                } else {
                    n.this.a(new Event(cVar.c, event.c, event.d), a2, iApiCallback);
                }
            }
        };
        a(serviceApi);
        return serviceApi;
    }
}

package com.meituan.msi;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.text.TextUtils;
import android.view.View;
import com.meituan.msi.api.ApiRequest;
import com.meituan.msi.api.ApiResponse;
import com.meituan.msi.api.c;
import com.meituan.msi.api.d;
import com.meituan.msi.api.e;
import com.meituan.msi.api.f;
import com.meituan.msi.api.p;
import com.meituan.msi.bean.BroadcastEvent;
import com.meituan.msi.bean.ContainerInfo;
import com.meituan.msi.bean.MsiContext;
import com.meituan.msi.bean.StringRequestData;
import com.meituan.msi.component.IMsiComponent;
import com.meituan.msi.context.h;
import com.meituan.msi.context.i;
import com.meituan.msi.interceptor.e;
import com.meituan.msi.metrics.b;
import com.meituan.msi.privacy.permission.a;
import com.meituan.msi.util.w;
import com.meituan.msi.view.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class ApiPortal {
    public static ChangeQuickRedirect a;
    @NonNull
    public final com.meituan.msi.b b;
    @NonNull
    private final b c;
    @NonNull
    private final g d;
    @NonNull
    private final com.meituan.msi.api.b e;
    @NonNull
    private final d f;
    private final Executor g;
    private com.meituan.msi.privacy.permission.a h;

    private ApiPortal(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "387877e87e94127accc351f86ccdff07", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "387877e87e94127accc351f86ccdff07");
            return;
        }
        this.c = aVar.b;
        this.g = aVar.c;
        this.d = new g();
        this.e = new com.meituan.msi.api.b(this.d, aVar.f);
        this.f = new d(this.c, this.c.f, this.c.p, this.e);
        this.b = new com.meituan.msi.b(this.e, this.f);
        e.a(this.c.d.a().name, this.c.o);
        this.h = new com.meituan.msi.privacy.permission.a(109, this.c.l, aVar.d);
        this.c.m = this.h;
        if (com.meituan.msi.a.b()) {
            return;
        }
        List a2 = com.sankuai.meituan.serviceloader.b.a(com.meituan.msi.init.a.class, (String) null);
        if (a2 != null && a2.size() > 0) {
            a2.get(0);
            this.c.b.b();
            return;
        }
        a(this.c.b.b());
    }

    @NonNull
    public final com.meituan.msi.lifecycle.a a() {
        return this.b;
    }

    @NonNull
    public final com.meituan.msi.lifecycle.b b() {
        return this.b;
    }

    public final void a(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        Object[] objArr = {Integer.valueOf(i), strArr, iArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de3838f8208b40bec9d45f3e83b7bfbd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de3838f8208b40bec9d45f3e83b7bfbd");
        } else {
            this.h.a(i, strArr, iArr);
        }
    }

    public final void a(@NonNull Activity activity, @NonNull String[] strArr, String str, a.InterfaceC0498a interfaceC0498a) {
        Object[] objArr = {activity, strArr, str, interfaceC0498a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3341a5ca6a826773de94a0174378d297", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3341a5ca6a826773de94a0174378d297");
        } else {
            this.h.a(activity, strArr, str, interfaceC0498a);
        }
    }

    public final String a(@Nullable StringRequestData stringRequestData) {
        Exception e;
        ApiRequest<?> apiRequest;
        p pVar;
        Object[] objArr = {stringRequestData};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "84ff01df970c486590657cc149d159a6", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "84ff01df970c486590657cc149d159a6");
        }
        try {
            pVar = new p();
            apiRequest = com.meituan.msi.parser.a.a(stringRequestData, (c<String>) null);
        } catch (Exception e2) {
            e = e2;
            apiRequest = null;
        }
        try {
            apiRequest.setContainerContext(this.c);
            apiRequest.setApiCallback(pVar);
            b.a aVar = new b.a();
            aVar.b = b.EnumC0496b.MSI;
            aVar.c = apiRequest.getSource();
            aVar.d = apiRequest.getName();
            com.meituan.msi.metrics.b.a(aVar);
            com.meituan.msi.interceptor.d a2 = com.meituan.msi.interceptor.d.a(apiRequest, this.c.n, this.e, this.h);
            a2.c = this.c.o;
            a2.a(apiRequest);
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = p.a;
            if (PatchProxy.isSupport(objArr2, pVar, changeQuickRedirect2, false, "b58ba9a7ce1ebd927f5197dd336578db", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr2, pVar, changeQuickRedirect2, false, "b58ba9a7ce1ebd927f5197dd336578db");
            }
            if (!TextUtils.isEmpty(pVar.c)) {
                return pVar.c;
            }
            return pVar.b;
        } catch (Exception e3) {
            e = e3;
            ApiResponse<?> negativeResponse = ApiResponse.negativeResponse(apiRequest, e, ApiResponse.a.returnValue);
            ApiResponse.notifyNegativeResultSync(negativeResponse);
            return negativeResponse.toJson();
        }
    }

    public final void a(@Nullable StringRequestData stringRequestData, @NonNull c<String> cVar) {
        Object[] objArr = {stringRequestData, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d8ed2b208631cbd558768ab47254bf08", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d8ed2b208631cbd558768ab47254bf08");
            return;
        }
        try {
            ApiRequest<?> a2 = com.meituan.msi.parser.a.a(stringRequestData, cVar);
            a2.setContainerContext(this.c);
            a2.setApiCallback(cVar);
            b.a aVar = new b.a();
            aVar.b = b.EnumC0496b.MSI;
            aVar.c = a2.getSource();
            aVar.d = a2.getName();
            com.meituan.msi.metrics.b.a(aVar);
            e.a aVar2 = new e.a(a2, this.c.n, this.e, this.h, this.g);
            aVar2.a(this.c.o);
            aVar2.a();
        } catch (Exception e) {
            com.meituan.msi.log.a.a(stringRequestData + e.getMessage());
            cVar.a(ApiResponse.negativeResponse(null, ApiResponse.API_EXCEPTION, e.getMessage(), ApiResponse.a.callbackValue).toJson());
        }
    }

    @RequiresApi(api = 19)
    public final View a(String str, String str2, String str3, JSONObject jSONObject, com.meituan.msi.dispather.d dVar) {
        Object[] objArr = {str, str2, str3, jSONObject, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cca4bcdc78404205a4aff634956d62c4", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cca4bcdc78404205a4aff634956d62c4");
        }
        IMsiComponent a2 = f.a(str);
        if (a2 != null) {
            w.a a3 = w.a(jSONObject, f.b(str));
            Object obj = (a3 == null || !a3.a()) ? null : a3.b;
            MsiContext msiContext = new MsiContext(null, com.meituan.msi.parser.a.a(this.c, (c<String>) null), null);
            msiContext.setEventDispatcher(new com.meituan.msi.dispather.b(dVar, this.c, str2, str3));
            View a4 = a2.a(str2, str3, obj, msiContext);
            com.meituan.msi.log.a.a(String.format("MSIView createView %s; viewId & pageId : %s & %s", str, str2, str3));
            return a4;
        }
        com.meituan.msi.log.a.a("MSIView getMSINativeView Failed. the componentName " + str);
        return null;
    }

    public final void a(View view, String str, String str2, JSONObject jSONObject) {
        Object[] objArr = {view, str, str2, jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8888efc33dacd0af80ca725b43b437fa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8888efc33dacd0af80ca725b43b437fa");
        } else if (view == null || str == null || str2 == null) {
            com.meituan.msi.log.a.a("view || viewId || pageId is null");
        } else if (view instanceof IMsiComponent) {
            IMsiComponent iMsiComponent = (IMsiComponent) view;
            w.a a2 = w.a(jSONObject, f.a(iMsiComponent));
            Object obj = null;
            if (a2 != null && a2.a()) {
                obj = a2.b;
            }
            com.meituan.msi.log.a.a(String.format("start to update %s; viewId & pageId : %s & %s ; properties : ", view.toString(), str, str2, jSONObject.toString()));
            iMsiComponent.a(str, str2, obj);
        }
    }

    public final void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e12ed879d5b80cc1586d9eaf65dd7dc3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e12ed879d5b80cc1586d9eaf65dd7dc3");
            return;
        }
        com.meituan.msi.api.b bVar = this.e;
        Object[] objArr2 = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msi.api.b.a;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "4c3b8ccb10f7e8322dde30b12db131ba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "4c3b8ccb10f7e8322dde30b12db131ba");
            return;
        }
        for (Object obj : bVar.b.values()) {
            if (obj instanceof com.meituan.msi.dispather.c) {
                ((com.meituan.msi.dispather.c) obj).a(str, str2);
            }
        }
    }

    public final void a(String str, Object obj) {
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "848bd3b16ce42abc019ed6f5f1b7d5df", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "848bd3b16ce42abc019ed6f5f1b7d5df");
            return;
        }
        this.e.a(str, obj);
        this.f.a(str, obj);
    }

    public final void b(String str, Object obj) {
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ee7c274f5cdeec4d915721c9a8b3178", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ee7c274f5cdeec4d915721c9a8b3178");
        } else {
            this.c.f.a(new BroadcastEvent(str, obj));
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class b {
        public static ChangeQuickRedirect a;
        public com.meituan.msi.context.a b;
        public com.meituan.msi.context.g c;
        public com.meituan.msi.context.d d;
        public com.meituan.msi.context.c e;
        public com.meituan.msi.dispather.e f;
        public Map<String, Object> g;
        public h h;
        public i i;
        public com.meituan.msi.provider.a j;
        public com.meituan.msi.provider.f k;
        com.meituan.msi.provider.e l;
        public com.meituan.msi.privacy.permission.a m;
        List<com.meituan.msi.interceptor.b> n;
        Map<String, com.meituan.msi.interceptor.a<?>> o;
        com.meituan.msi.api.h p;
        @Nullable
        public com.meituan.msi.location.c q;

        public b() {
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        final b b;
        public Executor c;
        @Nullable
        com.meituan.msi.privacy.permission.c d;
        public com.meituan.msi.dispather.d e;
        com.meituan.msi.view.a f;

        public a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cfff189569aedc4f1e490881ea77180c", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cfff189569aedc4f1e490881ea77180c");
            } else {
                this.b = new b();
            }
        }

        public final a a(com.meituan.msi.location.c cVar) {
            Object[] objArr = {cVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "22b18d7b3dbb6951e8a0026e0a780e30", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "22b18d7b3dbb6951e8a0026e0a780e30");
            }
            this.b.q = cVar;
            return this;
        }

        public final a a(com.meituan.msi.context.a aVar) {
            Object[] objArr = {aVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "455b4554739a2b0011c5133849ad6112", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "455b4554739a2b0011c5133849ad6112");
            }
            this.b.b = aVar;
            return this;
        }

        public final a a(com.meituan.msi.context.g gVar) {
            Object[] objArr = {gVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "15740c028e52e25fa38644e4de2010b3", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "15740c028e52e25fa38644e4de2010b3");
            }
            this.b.c = gVar;
            return this;
        }

        public final a a(com.meituan.msi.dispather.d dVar) {
            this.e = dVar;
            return this;
        }

        public final a a(h hVar) {
            Object[] objArr = {hVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "865c23a3630997d57f0cb125221a9d17", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "865c23a3630997d57f0cb125221a9d17");
            }
            this.b.h = hVar;
            return this;
        }

        public final a a(Map<String, Object> map) {
            Object[] objArr = {map};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a549079c381daa807652a9c57ab354f4", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a549079c381daa807652a9c57ab354f4");
            }
            this.b.g = map;
            return this;
        }

        public final a a(com.meituan.msi.context.d dVar) {
            Object[] objArr = {dVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7366813c86ba9f86557ff01dfa1b3029", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7366813c86ba9f86557ff01dfa1b3029");
            }
            this.b.d = dVar;
            return this;
        }

        public final a a(com.meituan.msi.context.c cVar) {
            Object[] objArr = {cVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b83e585919f2eaf9ae1dbc7c7a77cd7f", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b83e585919f2eaf9ae1dbc7c7a77cd7f");
            }
            this.b.e = new com.meituan.msi.defaultcontext.a(cVar, this.b.d.a());
            return this;
        }

        public final a a(com.meituan.msi.provider.a aVar) {
            Object[] objArr = {aVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2fb1c5df3599ff2edd83a48ec78d4c09", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2fb1c5df3599ff2edd83a48ec78d4c09");
            }
            this.b.j = aVar;
            return this;
        }

        public final a a(com.meituan.msi.provider.f fVar) {
            Object[] objArr = {fVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "abe387deed1eb505eb18bd95f8768772", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "abe387deed1eb505eb18bd95f8768772");
            }
            this.b.k = fVar;
            return this;
        }

        public final a a(com.meituan.msi.interceptor.b bVar) {
            Object[] objArr = {bVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "83b8d9be8afcfbab414226ffc9df1690", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "83b8d9be8afcfbab414226ffc9df1690");
            }
            if (this.b.n == null) {
                this.b.n = new ArrayList();
            }
            this.b.n.add(bVar);
            return this;
        }

        public final a a(String str, com.meituan.msi.interceptor.a<?> aVar) {
            Object[] objArr = {str, aVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ccc9a3dbc51eb7784672873bf354f35e", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ccc9a3dbc51eb7784672873bf354f35e");
            }
            if (this.b.o == null) {
                this.b.o = new HashMap();
            }
            this.b.o.put(str, aVar);
            return this;
        }

        public final a a(com.meituan.msi.api.h hVar) {
            Object[] objArr = {hVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "516f32ae3dd9d2dca865e0c6c7bed53f", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "516f32ae3dd9d2dca865e0c6c7bed53f");
            }
            this.b.p = hVar;
            return this;
        }

        public final a a(com.meituan.msi.provider.e eVar) {
            Object[] objArr = {eVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0526f9daa6fb3a385a06b9077ed3a506", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0526f9daa6fb3a385a06b9077ed3a506");
            }
            this.b.l = eVar;
            return this;
        }

        public final a a(i iVar) {
            Object[] objArr = {iVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f80a83957050ecc05d760253a1db3737", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f80a83957050ecc05d760253a1db3737");
            }
            this.b.i = iVar;
            return this;
        }

        public final a a(com.meituan.msi.privacy.permission.c cVar) {
            this.d = cVar;
            return this;
        }

        public final a a(com.meituan.msi.view.a aVar) {
            this.f = aVar;
            return this;
        }

        public final ApiPortal a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d87cc1fa5ec579239511a8a1df4efa77", RobustBitConfig.DEFAULT_VALUE)) {
                return (ApiPortal) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d87cc1fa5ec579239511a8a1df4efa77");
            }
            if (this.b.d == null) {
                throw new IllegalArgumentException("containerInfoContext is null");
            }
            if (this.b.b == null) {
                throw new IllegalArgumentException("activityContext is null");
            }
            if (this.e == null) {
                throw new IllegalArgumentException("eventDispatcher is null");
            }
            this.b.f = new com.meituan.msi.dispather.b(this.e, this.b);
            if (this.b.k == null) {
                ContainerInfo a2 = this.b.d.a();
                this.b.k = new com.meituan.msi.defaultcontext.c(a2.name, a2.containerId);
            }
            if (this.b.j == null) {
                this.b.j = new com.meituan.msi.provider.b();
            }
            if (this.b.i == null) {
                this.b.i = new com.meituan.msi.defaultcontext.b();
            }
            if (this.b.e == null) {
                this.b.e = new com.meituan.msi.defaultcontext.a();
            }
            return new ApiPortal(this);
        }
    }

    public final void a(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d38d20592aeccc9325622e68494673e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d38d20592aeccc9325622e68494673e");
        } else {
            this.c.g = map;
        }
    }

    private static synchronized void a(@NonNull Context context) {
        synchronized (ApiPortal.class) {
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d34e5b70a1f15e4e2e9c21ba527bd6b3", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d34e5b70a1f15e4e2e9c21ba527bd6b3");
                return;
            }
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            com.meituan.msi.a.a(context);
            com.meituan.msi.a.a(new com.meituan.msi.provider.d() { // from class: com.meituan.msi.ApiPortal.1
                @Override // com.meituan.msi.provider.d
                public final String a() {
                    return "-1";
                }

                @Override // com.meituan.msi.provider.d
                public final String b() {
                    return "-1";
                }

                @Override // com.meituan.msi.provider.d
                public final String c() {
                    return "-1";
                }

                @Override // com.meituan.msi.provider.d
                public final String d() {
                    return "-1";
                }

                @Override // com.meituan.msi.provider.d
                public final String e() {
                    return "-1";
                }
            });
        }
    }
}

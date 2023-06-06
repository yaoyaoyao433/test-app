package com.meituan.mmp.lib.msi;

import android.app.Dialog;
import android.content.DialogInterface;
import com.google.gson.annotations.SerializedName;
import com.meituan.mmp.main.MMPEnvHelper;
import com.meituan.msi.api.ApiRequest;
import com.meituan.msi.api.ApiResponse;
import com.meituan.msi.api.authorize.AuthorizeApi;
import com.meituan.msi.api.authorize.AuthorizeParam;
import com.meituan.msi.api.setting.SettingApi;
import com.meituan.msi.api.setting.SettingParam;
import com.meituan.msi.api.setting.SettingResponse;
import com.meituan.msi.bean.ApiException;
import com.meituan.msi.bean.MsiContext;
import com.meituan.msi.interceptor.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class e implements com.meituan.msi.interceptor.b {
    public static ChangeQuickRedirect a;
    com.meituan.mmp.lib.config.a b;
    com.meituan.mmp.lib.engine.m c;
    public com.meituan.mmp.lib.api.auth.f d;
    private b e;
    private c f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a extends SettingResponse.AuthSetting {
        @SerializedName("scope.invoiceTitle")
        public boolean a;
        @SerializedName("scope.invoice")
        public boolean b;
        @SerializedName("scope.werun")
        public boolean c;
    }

    @Override // com.meituan.msi.interceptor.b
    public final int a() {
        return 50;
    }

    public e(com.meituan.mmp.lib.config.a aVar, com.meituan.mmp.lib.engine.m mVar) {
        Object[] objArr = {aVar, mVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ebe2ad523824b9a211e123768934a421", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ebe2ad523824b9a211e123768934a421");
            return;
        }
        this.e = new b();
        this.f = new c();
        this.b = null;
        this.c = null;
        this.d = com.meituan.mmp.lib.api.auth.d.a();
        this.b = aVar;
        this.c = mVar;
    }

    @Override // com.meituan.msi.interceptor.b
    public final ApiResponse<?> a(b.a aVar) throws ApiException {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7aedba8e199ccb29e9c21f49137c4102", RobustBitConfig.DEFAULT_VALUE)) {
            return (ApiResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7aedba8e199ccb29e9c21f49137c4102");
        }
        ApiRequest<?> a2 = aVar.a();
        if (a2.getApiImpl() instanceof AuthorizeApi) {
            ((AuthorizeApi) a2.getApiImpl()).a(this.e);
        }
        if (a2.getApiImpl() instanceof SettingApi) {
            ((SettingApi) a2.getApiImpl()).a(this.f);
        }
        return aVar.a(a2);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public class b implements com.meituan.msi.api.authorize.a {
        public static ChangeQuickRedirect a;

        private b() {
            Object[] objArr = {e.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d289a1bdd823dc1f751d549dfa99dfd5", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d289a1bdd823dc1f751d549dfa99dfd5");
            }
        }

        @Override // com.meituan.msi.api.authorize.a
        public final boolean a(AuthorizeParam authorizeParam, final MsiContext msiContext) {
            Object[] objArr = {authorizeParam, msiContext};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a74362e6a5edf3323047b47e24f3340", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a74362e6a5edf3323047b47e24f3340")).booleanValue();
            }
            if (e.this.b == null || e.this.b.a()) {
                return false;
            }
            if (e.this.d == null) {
                msiContext.onError("This Native App version won't support external miniApp");
                return true;
            }
            e.this.d.a(msiContext.getActivity(), e.this.b, authorizeParam.scope, new com.meituan.mmp.lib.api.auth.i() { // from class: com.meituan.mmp.lib.msi.e.b.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.mmp.lib.api.auth.i
                public final void a(int i) {
                    Object[] objArr2 = {Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2343a359985accd4faaf00a9a324ac80", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2343a359985accd4faaf00a9a324ac80");
                        return;
                    }
                    switch (i) {
                        case -1:
                            msiContext.onError("refuse");
                            return;
                        case 0:
                            msiContext.onError("cancel");
                            return;
                        case 1:
                            msiContext.onSuccess("");
                            return;
                        default:
                            return;
                    }
                }
            });
            return true;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    class c implements com.meituan.msi.api.setting.b {
        public static ChangeQuickRedirect a;

        private c() {
            Object[] objArr = {e.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be77cbc3ae7b1285726b05d274dabb5d", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be77cbc3ae7b1285726b05d274dabb5d");
            }
        }

        @Override // com.meituan.msi.api.setting.b
        public final boolean a(final SettingParam settingParam, final MsiContext msiContext) {
            com.meituan.mmp.lib.interfaces.c cVar;
            Object[] objArr = {settingParam, msiContext};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a4c0eca0fbcfc2d5c75aab89514d9017", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a4c0eca0fbcfc2d5c75aab89514d9017")).booleanValue();
            }
            if (e.this.b == null || e.this.b.a()) {
                return false;
            }
            String str = "";
            if (settingParam != null && settingParam._mt != null) {
                str = settingParam._mt.from;
            }
            if (!"button".equals(str) && !"event".equals(str)) {
                msiContext.onError("from should be button or event");
                return true;
            } else if (e.this.d == null) {
                msiContext.onError("This Native App version won't support external miniApp");
                return true;
            } else {
                Dialog a2 = e.this.d.a(msiContext.getActivity(), e.this.b);
                a2.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.meituan.mmp.lib.msi.e.c.1
                    public static ChangeQuickRedirect a;

                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        com.meituan.mmp.lib.interfaces.c cVar2;
                        Object[] objArr2 = {dialogInterface};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "22f6b5ff296f70f0fc3859b146b8ac39", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "22f6b5ff296f70f0fc3859b146b8ac39");
                            return;
                        }
                        if (e.this.c != null && e.this.c.l != null && (cVar2 = e.this.c.l.d) != null) {
                            cVar2.a("onAppEnterForeground", (String) null, 0);
                        }
                        if (settingParam != null) {
                            settingParam.withPersonalization = false;
                        }
                        c.this.c(settingParam, msiContext);
                    }
                });
                a2.show();
                if (e.this.c != null && e.this.c.l != null && (cVar = e.this.c.l.d) != null) {
                    cVar.a("onAppEnterBackground", "{\"mode\":\"hang\"}", 0);
                }
                return true;
            }
        }

        @Override // com.meituan.msi.api.setting.b
        public final boolean b(SettingParam settingParam, MsiContext msiContext) {
            Object[] objArr = {settingParam, msiContext};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a7becc413048132ea02d011ce40c5baf", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a7becc413048132ea02d011ce40c5baf")).booleanValue();
            }
            if (e.this.b == null || e.this.b.a()) {
                return false;
            }
            c(settingParam, msiContext);
            return true;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        void c(SettingParam settingParam, MsiContext msiContext) {
            char c;
            Object[] objArr = {settingParam, msiContext};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3fe713b911102c3c8915f98f3098c22b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3fe713b911102c3c8915f98f3098c22b");
            } else if (e.this.d == null) {
                msiContext.onError("This Native App version won't support external miniApp");
            } else {
                a aVar = new a();
                for (Map.Entry<String, Boolean> entry : e.this.d.a(MMPEnvHelper.getContext(), e.this.b.c()).entrySet()) {
                    boolean booleanValue = entry.getValue() == null ? false : entry.getValue().booleanValue();
                    String key = entry.getKey();
                    switch (key.hashCode()) {
                        case -653473286:
                            if (key.equals("scope.userLocation")) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        case -267985274:
                            if (key.equals("scope.contact")) {
                                c = '\n';
                                break;
                            }
                            c = 65535;
                            break;
                        case -21617665:
                            if (key.equals("scope.camera")) {
                                c = '\t';
                                break;
                            }
                            c = 65535;
                            break;
                        case 411225387:
                            if (key.equals("scope.record")) {
                                c = 7;
                                break;
                            }
                            c = 65535;
                            break;
                        case 421939912:
                            if (key.equals("scope.userLocationBackground")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case 583039347:
                            if (key.equals("scope.userInfo")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case 740687251:
                            if (key.equals("scope.invoice")) {
                                c = 5;
                                break;
                            }
                            c = 65535;
                            break;
                        case 986629481:
                            if (key.equals("scope.writePhotosAlbum")) {
                                c = '\b';
                                break;
                            }
                            c = 65535;
                            break;
                        case 1264823523:
                            if (key.equals("scope.werun")) {
                                c = 6;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1555675269:
                            if (key.equals("scope.invoiceTitle")) {
                                c = 4;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1927763546:
                            if (key.equals("scope.address")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    switch (c) {
                        case 0:
                            aVar.userInfo = booleanValue;
                            break;
                        case 1:
                            aVar.userLocation = booleanValue;
                            break;
                        case 2:
                            aVar.userLocationBackground = booleanValue;
                            break;
                        case 3:
                            aVar.address = booleanValue;
                            break;
                        case 4:
                            aVar.a = booleanValue;
                            break;
                        case 5:
                            aVar.b = booleanValue;
                            break;
                        case 6:
                            aVar.c = booleanValue;
                            break;
                        case 7:
                            aVar.record = booleanValue;
                            break;
                        case '\b':
                            aVar.writePhotosAlbum = booleanValue;
                            break;
                        case '\t':
                            aVar.camera = booleanValue;
                            break;
                        case '\n':
                            aVar.contact = booleanValue;
                            break;
                    }
                }
                SettingResponse settingResponse = new SettingResponse();
                settingResponse.authSetting = aVar;
                msiContext.onSuccess(settingResponse);
            }
        }
    }
}

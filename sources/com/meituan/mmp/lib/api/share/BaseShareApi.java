package com.meituan.mmp.lib.api.share;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.View;
import com.meituan.dio.easy.DioFile;
import com.meituan.mmp.lib.ab;
import com.meituan.mmp.lib.api.AbsApi;
import com.meituan.mmp.lib.api.ApiFunction;
import com.meituan.mmp.lib.api.share.AbsShareApi;
import com.meituan.mmp.lib.update.MMPAppProp;
import com.meituan.mmp.lib.utils.f;
import com.meituan.mmp.lib.utils.s;
import com.meituan.mmp.main.IApiCallback;
import com.meituan.mmp.main.MMPEnvHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class BaseShareApi extends AbsShareApi {
    public static ChangeQuickRedirect a;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a {
        public String a;
        public String b;
        public String c;
        public String d;
        public String e;
        public String f;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class b extends a {
        public String g;
        public String h;
        public boolean i;
        public int j;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class c extends a {
        public String g;
        public String h;
        public int i;
        public Bitmap j;
        public boolean k;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class d extends a {
        public String g;
        public String h;
        public String i;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class e {
        public String a;
        public boolean b;
        public String c;
        public String d;
        public String e;
        public String f;
    }

    public abstract void a(int i, Intent intent, IApiCallback iApiCallback);

    public abstract void a(ApiFunction<?, ?> apiFunction, b bVar, IApiCallback iApiCallback);

    public abstract void a(ApiFunction<?, ?> apiFunction, c cVar, IApiCallback iApiCallback);

    public abstract void a(ApiFunction<?, ?> apiFunction, d dVar, IApiCallback iApiCallback);

    public abstract void a(ApiFunction<?, ?> apiFunction, e eVar, IApiCallback iApiCallback);

    public abstract void b(ApiFunction<?, ?> apiFunction, b bVar, IApiCallback iApiCallback);

    public abstract void b(ApiFunction<?, ?> apiFunction, e eVar, IApiCallback iApiCallback);

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public class Share extends AbsShareApi.AbsShare {
        public static ChangeQuickRedirect b;

        @Override // com.meituan.mmp.lib.api.AbsApi
        public boolean needBlockPipWhenStartActivity() {
            return true;
        }

        @Override // com.meituan.mmp.lib.api.ApiFunction
        public final /* synthetic */ void a(String str, AbsShareApi.ShareApiParams shareApiParams, IApiCallback iApiCallback) {
            AbsShareApi.ShareApiParams shareApiParams2 = shareApiParams;
            Object[] objArr = {str, shareApiParams2, iApiCallback};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "314785f438249ba7591f5dee50120c57", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "314785f438249ba7591f5dee50120c57");
            } else {
                BaseShareApi.this.a(this, str, shareApiParams2, iApiCallback);
            }
        }

        public Share() {
            Object[] objArr = {BaseShareApi.this};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6bb1d54ddc9d6f4e4cbe0ec3a9303ce4", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6bb1d54ddc9d6f4e4cbe0ec3a9303ce4");
            }
        }

        @Override // com.meituan.mmp.lib.api.ApiFunction, com.meituan.mmp.lib.api.AbsApi
        public void onActivityResult(int i, Intent intent, IApiCallback iApiCallback) {
            Object[] objArr = {Integer.valueOf(i), intent, iApiCallback};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6945c07e776759e5d6bb02082d93d3f7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6945c07e776759e5d6bb02082d93d3f7");
            } else {
                BaseShareApi.this.a(i, intent, iApiCallback);
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public class MTShare extends AbsShareApi.AbsMtShare {
        public static ChangeQuickRedirect b;

        @Override // com.meituan.mmp.lib.api.AbsApi
        public boolean needBlockPipWhenStartActivity() {
            return true;
        }

        @Override // com.meituan.mmp.lib.api.ApiFunction
        public final /* synthetic */ void a(String str, AbsShareApi.ShareApiParams shareApiParams, IApiCallback iApiCallback) {
            AbsShareApi.ShareApiParams shareApiParams2 = shareApiParams;
            Object[] objArr = {str, shareApiParams2, iApiCallback};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e104c084cf803f3ff3f6cb819f96e78b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e104c084cf803f3ff3f6cb819f96e78b");
            } else {
                BaseShareApi.this.a(this, str, shareApiParams2, iApiCallback);
            }
        }

        public MTShare() {
            Object[] objArr = {BaseShareApi.this};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a69a0cf025efc824516c4573ae188b2", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a69a0cf025efc824516c4573ae188b2");
            }
        }

        @Override // com.meituan.mmp.lib.api.ApiFunction, com.meituan.mmp.lib.api.AbsApi
        public void onActivityResult(int i, Intent intent, IApiCallback iApiCallback) {
            Object[] objArr = {Integer.valueOf(i), intent, iApiCallback};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b8426b2974092b8995af004310d753ad", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b8426b2974092b8995af004310d753ad");
            } else {
                BaseShareApi.this.a(i, intent, iApiCallback);
            }
        }
    }

    public final void a(ApiFunction<?, ?> apiFunction, String str, AbsShareApi.ShareApiParams shareApiParams, IApiCallback iApiCallback) {
        Object[] objArr = {apiFunction, str, shareApiParams, iApiCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd957f0d9214f3ba53690c4d0db044d3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd957f0d9214f3ba53690c4d0db044d3");
            return;
        }
        if (shareApiParams.cid == null) {
            shareApiParams.cid = "c_group_fv80awch";
        }
        char c2 = 65535;
        int hashCode = str.hashCode();
        if (hashCode != 109400031) {
            if (hashCode == 1354482296 && str.equals("mtShare")) {
                c2 = 0;
            }
        } else if (str.equals("share")) {
            c2 = 1;
        }
        switch (c2) {
            case 0:
                Object[] objArr2 = {apiFunction, shareApiParams, iApiCallback};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f2d2ce1565d91199328a9f44b3d53fa9", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f2d2ce1565d91199328a9f44b3d53fa9");
                    return;
                }
                if (TextUtils.isEmpty(shareApiParams.type)) {
                    shareApiParams.type = "0";
                }
                if (TextUtils.isEmpty(shareApiParams.path)) {
                    shareApiParams.path = shareApiParams.miniProgramPath;
                }
                if ("1".contentEquals(shareApiParams.type) && TextUtils.isEmpty(shareApiParams.path)) {
                    iApiCallback.onFail(null);
                    return;
                } else {
                    a(apiFunction, shareApiParams, iApiCallback);
                    return;
                }
            case 1:
                if (apiFunction.isInnerApp()) {
                    Object[] objArr3 = {apiFunction, shareApiParams, iApiCallback};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "9c2e86547dbf0dda420fc3cd7f5b97be", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "9c2e86547dbf0dda420fc3cd7f5b97be");
                        return;
                    }
                    if (TextUtils.isEmpty(shareApiParams.type)) {
                        shareApiParams.type = "1";
                    }
                    if ("1".contentEquals(shareApiParams.type) && TextUtils.isEmpty(shareApiParams.url)) {
                        shareApiParams.url = "http://i.meituan.com/";
                    }
                    a(apiFunction, shareApiParams, iApiCallback);
                    return;
                }
                Object[] objArr4 = {apiFunction, shareApiParams, iApiCallback};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "8366f967ea6b0a7acc2a3a018597410f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "8366f967ea6b0a7acc2a3a018597410f");
                    return;
                }
                MMPAppProp mMPAppProp = apiFunction.getAppConfig().l;
                if (mMPAppProp == null || mMPAppProp.extraConfig == null || mMPAppProp.extraConfig.shareUrl == null) {
                    iApiCallback.onFail(null);
                    return;
                }
                a aVar = new a();
                aVar.a = mMPAppProp.extraConfig.shareUrl;
                aVar.b = shareApiParams.title;
                aVar.c = mMPAppProp.extraConfig.shareSummary;
                aVar.d = apiFunction.getAppIcon();
                aVar.e = shareApiParams.cid;
                aVar.f = shareApiParams.sceneToken;
                return;
            default:
                return;
        }
    }

    private void a(ApiFunction<?, ?> apiFunction, AbsShareApi.ShareApiParams shareApiParams, IApiCallback iApiCallback) {
        Object[] objArr = {apiFunction, shareApiParams, iApiCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e5c175466764009cc642cba2fc8903d9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e5c175466764009cc642cba2fc8903d9");
        } else if ("0".contentEquals(shareApiParams.type)) {
            b(apiFunction, shareApiParams, iApiCallback);
        } else if ("1".contentEquals(shareApiParams.type)) {
            c(apiFunction, shareApiParams, iApiCallback);
        } else if ("2".contentEquals(shareApiParams.type)) {
            d(apiFunction, shareApiParams, iApiCallback);
        } else if ("3".contentEquals(shareApiParams.type)) {
            e(apiFunction, shareApiParams, iApiCallback);
        }
    }

    private void b(ApiFunction<?, ?> apiFunction, AbsShareApi.ShareApiParams shareApiParams, IApiCallback iApiCallback) {
        String a2;
        Object[] objArr = {apiFunction, shareApiParams, iApiCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "580875a306d6b5675aa3fca148f02753", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "580875a306d6b5675aa3fca148f02753");
        } else if (TextUtils.isEmpty(shareApiParams.url) || TextUtils.isEmpty(shareApiParams.content)) {
            iApiCallback.onFail(AbsApi.codeJson(-1, "url and content should not be null!"));
        } else {
            b bVar = new b();
            bVar.a = shareApiParams.url;
            bVar.b = shareApiParams.title;
            bVar.c = shareApiParams.content;
            bVar.d = shareApiParams.imageUrl;
            bVar.e = shareApiParams.cid;
            if (!TextUtils.isEmpty(shareApiParams.path)) {
                bVar.h = shareApiParams.path;
                bVar.g = apiFunction.getAppId();
                if (!TextUtils.isEmpty(shareApiParams.imageUrl) && shareApiParams.imageUrl.startsWith("wdfile://") && (a2 = s.a(apiFunction.getContext(), shareApiParams.imageUrl, apiFunction.getAppConfig())) != null && new File(a2).exists()) {
                    bVar.i = true;
                    bVar.d = a2;
                }
                bVar.j = a(apiFunction);
            }
            if (TextUtils.equals(shareApiParams.channel, "WXSceneSession")) {
                b(apiFunction, bVar, iApiCallback);
            } else {
                a(apiFunction, bVar, iApiCallback);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ac, code lost:
        if (r2.exists() == false) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void c(com.meituan.mmp.lib.api.ApiFunction<?, ?> r12, com.meituan.mmp.lib.api.share.AbsShareApi.ShareApiParams r13, com.meituan.mmp.main.IApiCallback r14) {
        /*
            r11 = this;
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r8 = 0
            r0[r8] = r12
            r1 = 1
            r0[r1] = r13
            r1 = 2
            r0[r1] = r14
            com.meituan.robust.ChangeQuickRedirect r9 = com.meituan.mmp.lib.api.share.BaseShareApi.a
            java.lang.String r10 = "0abd77c6f155009bb22bf2cd5f9c8e95"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r0
            r2 = r11
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L21
            com.meituan.robust.PatchProxy.accessDispatch(r0, r11, r9, r8, r10)
            return
        L21:
            com.meituan.mmp.lib.api.share.BaseShareApi$c r0 = new com.meituan.mmp.lib.api.share.BaseShareApi$c
            r0.<init>()
            java.lang.String r1 = r13.url
            r0.a = r1
            java.lang.String r1 = r13.title
            r0.b = r1
            java.lang.String r1 = r13.content
            r0.c = r1
            java.lang.String r1 = r13.imageUrl
            r0.d = r1
            java.lang.String r1 = r13.cid
            r0.e = r1
            java.lang.String r1 = r13.appId
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L4d
            boolean r1 = r12.isInnerApp()
            if (r1 == 0) goto L4d
            java.lang.String r1 = r13.appId
            r0.g = r1
            goto L53
        L4d:
            java.lang.String r1 = r12.getAppId()
            r0.g = r1
        L53:
            java.lang.String r1 = r13.path
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L71
            com.meituan.mmp.lib.ab r1 = r12.getPageManager()
            if (r1 == 0) goto L71
            com.meituan.mmp.lib.ab r1 = r12.getPageManager()     // Catch: java.lang.Exception -> L70
            com.meituan.mmp.lib.page.e r1 = r1.e()     // Catch: java.lang.Exception -> L70
            java.lang.String r1 = r1.getPagePath()     // Catch: java.lang.Exception -> L70
            r13.path = r1     // Catch: java.lang.Exception -> L70
            goto L71
        L70:
        L71:
            java.lang.String r1 = r13.path
            r0.h = r1
            int r1 = r11.a(r12)
            r0.i = r1
            java.lang.String r1 = r13.imageUrl
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto Lc0
            java.lang.String r1 = r13.imageUrl
            java.lang.String r2 = "wdfile://"
            boolean r1 = r1.startsWith(r2)
            if (r1 == 0) goto Lc0
            android.content.Context r1 = r12.getContext()
            java.lang.String r2 = r13.imageUrl
            com.meituan.mmp.lib.config.a r3 = r12.getAppConfig()
            java.lang.String r1 = com.meituan.mmp.lib.utils.s.a(r1, r2, r3)
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            r3 = 0
            if (r2 != 0) goto Lae
            java.io.File r2 = new java.io.File
            r2.<init>(r1)
            boolean r1 = r2.exists()
            if (r1 != 0) goto Laf
        Lae:
            r2 = r3
        Laf:
            if (r2 == 0) goto Lbc
            java.lang.String r1 = r2.getAbsolutePath()
            android.graphics.Bitmap r1 = com.sankuai.waimai.launcher.util.image.a.a(r1)
            r0.j = r1
            goto Ld9
        Lbc:
            r14.onFail(r3)
            return
        Lc0:
            java.lang.String r1 = r13.imageUrl
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto Ld3
            java.lang.String r1 = r13.imageUrl
            java.lang.String r2 = "http"
            boolean r1 = r1.startsWith(r2)
            if (r1 != 0) goto Ld9
        Ld3:
            android.graphics.Bitmap r1 = a(r12)
            r0.j = r1
        Ld9:
            boolean r13 = r13.withShareTicket
            r0.k = r13
            r11.a(r12, r0, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.mmp.lib.api.share.BaseShareApi.c(com.meituan.mmp.lib.api.ApiFunction, com.meituan.mmp.lib.api.share.AbsShareApi$ShareApiParams, com.meituan.mmp.main.IApiCallback):void");
    }

    private int a(ApiFunction<?, ?> apiFunction) {
        Object[] objArr = {apiFunction};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c2d89a5e9f004c930c090a7b9c7653aa", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c2d89a5e9f004c930c090a7b9c7653aa")).intValue();
        }
        String shareEnvironment = apiFunction.getShareEnvironment();
        if (!TextUtils.isEmpty(shareEnvironment)) {
            if ("test".equals(shareEnvironment)) {
                return 1;
            }
            if ("preview".equals(shareEnvironment)) {
                return 2;
            }
        }
        return 0;
    }

    private void d(ApiFunction<?, ?> apiFunction, AbsShareApi.ShareApiParams shareApiParams, IApiCallback iApiCallback) {
        Object[] objArr = {apiFunction, shareApiParams, iApiCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "048a2cbf4d9926b96e24555a63a3c34b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "048a2cbf4d9926b96e24555a63a3c34b");
            return;
        }
        e eVar = new e();
        if (TextUtils.isEmpty(shareApiParams.imageUrl)) {
            iApiCallback.onFail(AbsApi.codeJson(-1, "url should not be null!"));
            return;
        }
        if (shareApiParams.imageUrl.startsWith("wdfile://") || shareApiParams.imageUrl.startsWith(File.separator)) {
            String str = "";
            if (shareApiParams.imageUrl.startsWith(File.separator)) {
                DioFile a2 = apiFunction.getAppConfig().a(apiFunction.getContext(), shareApiParams.imageUrl);
                if (a2 != null) {
                    str = a2.h();
                }
            } else {
                str = s.a(apiFunction.getContext(), shareApiParams.imageUrl, apiFunction.getAppConfig());
            }
            if (TextUtils.isEmpty(str)) {
                iApiCallback.onFail();
                return;
            }
            DioFile dioFile = new DioFile(str);
            if (dioFile.c()) {
                eVar.b = true;
                File d2 = f.d(MMPEnvHelper.getContext(), "Pictures");
                StringBuilder sb = new StringBuilder();
                sb.append(d2.getAbsolutePath());
                sb.append(File.separator);
                sb.append(dioFile.e());
                if (s.a(str, sb.toString())) {
                    eVar.a = sb.toString();
                } else {
                    iApiCallback.onFail();
                }
            } else {
                iApiCallback.onFail();
            }
        } else {
            eVar.a = shareApiParams.imageUrl;
        }
        eVar.c = shareApiParams.channel;
        if (TextUtils.equals("WXTimeline", shareApiParams.channel)) {
            b(apiFunction, eVar, iApiCallback);
            return;
        }
        if (!TextUtils.isEmpty(shareApiParams.title)) {
            eVar.d = shareApiParams.title;
        }
        if (!TextUtils.isEmpty(shareApiParams.content)) {
            eVar.e = shareApiParams.content;
        }
        if (!TextUtils.isEmpty(shareApiParams.url)) {
            eVar.f = shareApiParams.url;
        }
        a(apiFunction, eVar, iApiCallback);
    }

    private void e(ApiFunction<?, ?> apiFunction, AbsShareApi.ShareApiParams shareApiParams, IApiCallback iApiCallback) {
        Object[] objArr = {apiFunction, shareApiParams, iApiCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "445b9a2ec6e955b7a6349fd71f04812a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "445b9a2ec6e955b7a6349fd71f04812a");
            return;
        }
        d dVar = new d();
        dVar.b = shareApiParams.title;
        dVar.g = shareApiParams.imageUrl;
        dVar.a = shareApiParams.url;
        dVar.h = shareApiParams.btnText;
        dVar.i = shareApiParams.channel;
        if (TextUtils.isEmpty(dVar.b)) {
            iApiCallback.onFail(AbsApi.codeJson(-1, "param title must not be null!"));
        } else if (TextUtils.isEmpty(dVar.g)) {
            iApiCallback.onFail(AbsApi.codeJson(-1, "param imgUrl must not be null!"));
        } else if (TextUtils.isEmpty(dVar.a)) {
            iApiCallback.onFail(AbsApi.codeJson(-1, "param url must not be null!"));
        } else if (TextUtils.isEmpty(dVar.i)) {
            iApiCallback.onFail(AbsApi.codeJson(-1, "param channel must not be null!"));
        } else {
            a(apiFunction, dVar, iApiCallback);
        }
    }

    @Nullable
    private static Bitmap a(AbsApi absApi) {
        com.meituan.mmp.lib.page.e e2;
        Object[] objArr = {absApi};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b3fe1f8550b65f52c1648a6a4f462e64", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bitmap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b3fe1f8550b65f52c1648a6a4f462e64");
        }
        ab pageManager = absApi.getPageManager();
        if (pageManager == null || (e2 = pageManager.e()) == null) {
            return null;
        }
        return a(e2.getSwipeRefreshLayout());
    }

    private static Bitmap a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        Bitmap bitmap = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ac174ea95dafb7093112a9726fed4834", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bitmap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ac174ea95dafb7093112a9726fed4834");
        }
        if (view == null) {
            return null;
        }
        view.setDrawingCacheEnabled(true);
        try {
            Bitmap drawingCache = view.getDrawingCache();
            if (drawingCache != null) {
                Bitmap createBitmap = Bitmap.createBitmap(drawingCache);
                while (createBitmap.getByteCount() > 131072) {
                    Matrix matrix = new Matrix();
                    matrix.setScale(0.9f, 0.9f);
                    createBitmap = Bitmap.createBitmap(createBitmap, 0, 0, createBitmap.getWidth(), createBitmap.getHeight(), matrix, true);
                }
                bitmap = createBitmap;
            }
            return bitmap;
        } catch (OutOfMemoryError unused) {
            return null;
        } finally {
            view.setDrawingCacheEnabled(false);
            view.destroyDrawingCache();
        }
    }
}

package com.meituan.passport.plugins;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Handler;
import android.os.Looper;
import android.support.constraint.R;
import android.text.TextUtils;
import com.meituan.passport.pojo.AppInfo;
import com.meituan.passport.pojo.LoggedInAppsResult;
import com.meituan.passport.pojo.OAuthItem;
import com.meituan.passport.sso.SSOInfo;
import com.meituan.passport.utils.Utils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.Response;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class l {
    public static ChangeQuickRedirect a;
    private static l e;
    public Context b;
    public List<SSOInfo> c;
    public OAuthItem d;

    public static /* synthetic */ List a(l lVar, LoggedInAppsResult loggedInAppsResult) {
        Object[] objArr = {loggedInAppsResult};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, lVar, changeQuickRedirect, false, "eafdc21aa4a80946613e0af344900441", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, lVar, changeQuickRedirect, false, "eafdc21aa4a80946613e0af344900441");
        }
        if (loggedInAppsResult == null || loggedInAppsResult.data == null || loggedInAppsResult.data.size() <= 0) {
            return null;
        }
        List<LoggedInAppsResult.AppInfo> list = loggedInAppsResult.data;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size() <= 2 ? list.size() : 2;
        for (int i = 0; i < size; i++) {
            LoggedInAppsResult.AppInfo appInfo = list.get(i);
            if (appInfo != null && !TextUtils.isEmpty(appInfo.ticket) && !TextUtils.isEmpty(appInfo.mobile) && !TextUtils.isEmpty(appInfo.nickName) && !TextUtils.isEmpty(appInfo.appShowName)) {
                arrayList.add(new SSOInfo(appInfo.appName, appInfo.nickName, appInfo.mobile, appInfo.iconUrl, appInfo.ticket, appInfo.appShowName, appInfo.hasClickedSinkIcon, appInfo.unClickedSinkIcon));
            }
        }
        return arrayList;
    }

    public static /* synthetic */ void b(l lVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, lVar, changeQuickRedirect, false, "87a2703458cc70b24f864d57faae3045", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, lVar, changeQuickRedirect, false, "87a2703458cc70b24f864d57faae3045");
        } else if (a().c == null || a().c.size() <= 0) {
        } else {
            SSOInfo sSOInfo = a().c.get(0);
            StateListDrawable stateListDrawable = new StateListDrawable();
            OAuthItem oAuthItem = OAuthItem.SAME_ACCOUNT;
            oAuthItem.listDrawable = stateListDrawable;
            if (!TextUtils.isEmpty(sSOInfo.unClickedSinkIcon)) {
                q.a().f().a(sSOInfo.unClickedSinkIcon, (u) new a(false, stateListDrawable, oAuthItem));
            } else {
                stateListDrawable.addState(new int[]{-16842919}, lVar.b.getResources().getDrawable(R.drawable.passsport_third_login_default_icon));
                oAuthItem.listDrawable = stateListDrawable;
                lVar.d = oAuthItem;
            }
            if (!TextUtils.isEmpty(sSOInfo.hasClickedSinkIcon)) {
                q.a().f().a(sSOInfo.hasClickedSinkIcon, (u) new a(true, stateListDrawable, oAuthItem));
                return;
            }
            stateListDrawable.addState(new int[]{16842919}, lVar.b.getResources().getDrawable(R.drawable.passsport_third_login_default_icon));
            oAuthItem.listDrawable = stateListDrawable;
            lVar.d = oAuthItem;
        }
    }

    public static l a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "96324a14c1c61be32d5e7b047e333af0", RobustBitConfig.DEFAULT_VALUE)) {
            return (l) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "96324a14c1c61be32d5e7b047e333af0");
        }
        if (e == null) {
            synchronized (l.class) {
                if (e == null) {
                    e = new l();
                }
            }
        }
        return e;
    }

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.passport.plugins.l$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public class AnonymousClass1 implements Runnable {
        public static ChangeQuickRedirect a;
        public final /* synthetic */ String b;

        public AnonymousClass1(String str) {
            this.b = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c866ec1f82870e2d1ff8079fe149b064", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c866ec1f82870e2d1ff8079fe149b064");
                return;
            }
            final String f = com.meituan.passport.utils.s.f();
            if (TextUtils.isEmpty(f)) {
                return;
            }
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.meituan.passport.plugins.l.1.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6085a49ee34650f98a211986504c9270", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6085a49ee34650f98a211986504c9270");
                    } else {
                        com.meituan.passport.utils.s.e().getLoggedInApps(f, AnonymousClass1.this.b, l.this.b()).a(new com.sankuai.meituan.retrofit2.f<LoggedInAppsResult>() { // from class: com.meituan.passport.plugins.l.1.1.1
                            public static ChangeQuickRedirect a;

                            @Override // com.sankuai.meituan.retrofit2.f
                            public final void onResponse(Call<LoggedInAppsResult> call, Response<LoggedInAppsResult> response) {
                                boolean z = true;
                                Object[] objArr3 = {call, response};
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "7ac001d25c314ed934a8579fc2577928", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "7ac001d25c314ed934a8579fc2577928");
                                    return;
                                }
                                if ((response == null || !response.f() || response.e() == null) ? false : false) {
                                    LoggedInAppsResult e = response.e();
                                    l.this.c = l.a(l.this, e);
                                    com.meituan.passport.utils.n.a("NewSSOLoginInfoHook.requestNewSSOUserInfo", "response succeed", e.toString());
                                    l.b(l.this);
                                }
                            }

                            @Override // com.sankuai.meituan.retrofit2.f
                            public final void onFailure(Call<LoggedInAppsResult> call, Throwable th) {
                                Object[] objArr3 = {call, th};
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "f37959e0d2165cc24e3afbfc8e15ce06", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "f37959e0d2165cc24e3afbfc8e15ce06");
                                    return;
                                }
                                l.this.c = null;
                                com.meituan.passport.utils.n.a("NewSSOLoginInfoHook.requestNewSSOUserInfo", "response error", th != null ? th.getMessage() : "");
                            }
                        });
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public class a extends u {
        public static ChangeQuickRedirect a;
        private StateListDrawable c;
        private OAuthItem d;
        private boolean e;

        public a(boolean z, StateListDrawable stateListDrawable, OAuthItem oAuthItem) {
            Object[] objArr = {l.this, Byte.valueOf(z ? (byte) 1 : (byte) 0), stateListDrawable, oAuthItem};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d3186203b110f364befa17eedae19c4", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d3186203b110f364befa17eedae19c4");
                return;
            }
            this.e = z;
            this.c = stateListDrawable;
            this.d = oAuthItem;
        }

        @Override // com.meituan.passport.plugins.g.a
        public final void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6cdc218a7f8e3d66e8bf93d183c4b59e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6cdc218a7f8e3d66e8bf93d183c4b59e");
                return;
            }
            StateListDrawable stateListDrawable = this.c;
            int[] iArr = new int[1];
            iArr[0] = this.e ? 16842919 : -16842919;
            stateListDrawable.addState(iArr, l.this.b.getResources().getDrawable(R.drawable.passsport_third_login_default_icon));
            this.d.listDrawable = this.c;
            l.this.d = this.d;
        }

        @Override // com.meituan.passport.plugins.g.a
        public final void a(Bitmap bitmap) {
            Object[] objArr = {bitmap};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d94a4c9e6008a9eadcfec0dfe8287ad9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d94a4c9e6008a9eadcfec0dfe8287ad9");
            } else if (bitmap != null) {
                StateListDrawable stateListDrawable = this.c;
                int[] iArr = new int[1];
                iArr[0] = this.e ? 16842919 : -16842919;
                stateListDrawable.addState(iArr, new BitmapDrawable(bitmap));
                this.d.listDrawable = this.c;
                l.this.d = this.d;
            }
        }
    }

    public String b() {
        AppInfo.App[] valuesCustom;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e943a5773d7845d139d3d625d4d1dac8", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e943a5773d7845d139d3d625d4d1dac8");
        }
        StringBuilder sb = new StringBuilder();
        if (this.b == null) {
            return "";
        }
        for (AppInfo.App app : AppInfo.App.valuesCustom()) {
            if (!TextUtils.equals(app.getPackageName(), this.b.getPackageName()) && Utils.a(this.b, app.getPackageName())) {
                sb.append(app.getPackageName());
                sb.append(CommonConstant.Symbol.COMMA);
            }
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }
}

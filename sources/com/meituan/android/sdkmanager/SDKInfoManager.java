package com.meituan.android.sdkmanager;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.ApplicationInfo;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.android.common.babel.Babel;
import com.meituan.android.common.statistics.pageinfo.PageInfo;
import com.meituan.android.common.statistics.pageinfo.PageInfoManager;
import com.meituan.android.sdkmanager.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.Response;
import com.sankuai.meituan.retrofit2.f;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class SDKInfoManager {
    public static ChangeQuickRedirect a;
    private static final Map<String, SDKInfoManager> b = new HashMap();
    private boolean c;
    private final String d;
    private a.C0367a e;
    private a f;
    private WeakReference<Activity> g;
    private final f<com.meituan.android.sdkmanager.a> h;

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface TypeInfo {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a {
        public boolean a() {
            return true;
        }

        public boolean a(String str) {
            return false;
        }

        public String b() {
            return null;
        }

        public boolean b(String str) {
            return false;
        }

        public void c(String str) {
        }

        public void d(String str) {
        }
    }

    public static /* synthetic */ boolean a(SDKInfoManager sDKInfoManager, boolean z) {
        sDKInfoManager.c = true;
        return true;
    }

    public static /* synthetic */ void b(SDKInfoManager sDKInfoManager, a.C0367a c0367a) {
        Activity activity;
        Object[] objArr = {c0367a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, sDKInfoManager, changeQuickRedirect, false, "6bbc1a4ca29f30acff229e793b34f000", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, sDKInfoManager, changeQuickRedirect, false, "6bbc1a4ca29f30acff229e793b34f000");
            return;
        }
        switch (c0367a.a) {
            case 0:
                return;
            case 1:
                activity = sDKInfoManager.g != null ? sDKInfoManager.g.get() : null;
                if (activity == null || activity.isFinishing()) {
                    return;
                }
                new com.sankuai.meituan.android.ui.widget.a(activity, c0367a.b, 0).a();
                return;
            case 2:
                if (sDKInfoManager.f == null || sDKInfoManager.f.b(sDKInfoManager.d)) {
                    return;
                }
                activity = sDKInfoManager.g != null ? sDKInfoManager.g.get() : null;
                if (activity == null || activity.isFinishing()) {
                    return;
                }
                sDKInfoManager.a(activity, c0367a.a, c0367a.b);
                return;
            case 3:
                if (sDKInfoManager.f == null || sDKInfoManager.f.a(sDKInfoManager.d)) {
                    return;
                }
                activity = sDKInfoManager.g != null ? sDKInfoManager.g.get() : null;
                if (activity == null || activity.isFinishing()) {
                    return;
                }
                sDKInfoManager.a(activity, c0367a.a, c0367a.b);
                return;
            default:
                return;
        }
    }

    public static synchronized SDKInfoManager a(String str) {
        synchronized (SDKInfoManager.class) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "aeb185a4acd47c22a865f77045dc2371", RobustBitConfig.DEFAULT_VALUE)) {
                return (SDKInfoManager) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "aeb185a4acd47c22a865f77045dc2371");
            } else if (TextUtils.isEmpty(str)) {
                return null;
            } else {
                SDKInfoManager sDKInfoManager = b.get(str);
                if (sDKInfoManager == null) {
                    sDKInfoManager = new SDKInfoManager(str);
                    b.put(str, sDKInfoManager);
                }
                return sDKInfoManager;
            }
        }
    }

    private SDKInfoManager(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ae7ec7e45663f99c63c62b835c6a1c3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ae7ec7e45663f99c63c62b835c6a1c3");
            return;
        }
        this.h = new f<com.meituan.android.sdkmanager.a>() { // from class: com.meituan.android.sdkmanager.SDKInfoManager.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.meituan.retrofit2.f
            public final void onFailure(Call<com.meituan.android.sdkmanager.a> call, Throwable th) {
            }

            @Override // com.sankuai.meituan.retrofit2.f
            public final void onResponse(Call<com.meituan.android.sdkmanager.a> call, Response<com.meituan.android.sdkmanager.a> response) {
                com.meituan.android.sdkmanager.a e;
                Object[] objArr2 = {call, response};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ca29b354334fff5bfdd8c82b95cd4c30", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ca29b354334fff5bfdd8c82b95cd4c30");
                } else if (response == null || !response.f() || (e = response.e()) == null || e.a == null) {
                } else {
                    SDKInfoManager.this.e = e.a;
                    SDKInfoManager.b(SDKInfoManager.this, e.a);
                    SDKInfoManager.a(SDKInfoManager.this, true);
                }
            }
        };
        this.d = str;
    }

    public final void a(@NonNull Context context, @NonNull String str, int i, @Nullable a aVar) {
        Object[] objArr = {context, str, Integer.valueOf(i), aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "73c57f599623a8b20b985d29351acc86", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "73c57f599623a8b20b985d29351acc86");
            return;
        }
        this.f = aVar;
        if (context instanceof Activity) {
            this.g = new WeakReference<>((Activity) context);
        }
        try {
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            String packageName = context.getPackageName();
            int i2 = applicationInfo.flags & 2;
            HashMap hashMap = new HashMap();
            hashMap.put("appName", packageName);
            hashMap.put("appVersion", "");
            hashMap.put("busSdkName", this.d);
            hashMap.put("busSdkVersion", str);
            hashMap.put("client", "android");
            hashMap.put("pageName", "");
            hashMap.put("isDebug", Integer.valueOf(i2));
            hashMap.put("cid", a(i));
            if (this.f != null && !TextUtils.isEmpty(this.f.b())) {
                hashMap.put("extra", this.f.b());
            }
            if (i2 != 0) {
                b.a().a(hashMap).a(this.h);
            } else if (this.f == null || this.f.a()) {
                Babel.init(context);
                Babel.log("connor", "connor log", hashMap);
            }
        } catch (Exception unused) {
        }
    }

    private void a(Activity activity, final int i, String str) {
        Object[] objArr = {activity, Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b32e752d73c97263d0af2b39f0f12e6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b32e752d73c97263d0af2b39f0f12e6");
            return;
        }
        AlertDialog create = new AlertDialog.Builder(activity).setMessage(str).setPositiveButton("我已知晓", new DialogInterface.OnClickListener() { // from class: com.meituan.android.sdkmanager.SDKInfoManager.2
            public static ChangeQuickRedirect a;

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                Object[] objArr2 = {dialogInterface, Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "15c57e90140ce25c503610dae8e68276", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "15c57e90140ce25c503610dae8e68276");
                    return;
                }
                dialogInterface.dismiss();
                if (SDKInfoManager.this.f != null) {
                    if (i == 2) {
                        SDKInfoManager.this.f.c(SDKInfoManager.this.d);
                    } else if (i == 3) {
                        SDKInfoManager.this.f.d(SDKInfoManager.this.d);
                    }
                }
            }
        }).create();
        create.setCancelable(false);
        create.setCanceledOnTouchOutside(false);
        create.show();
        create.getButton(-1).setTextColor(Color.parseColor("#6E3f58"));
    }

    private String a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e95d40997324f617a0e93489096d98e", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e95d40997324f617a0e93489096d98e");
        }
        PageInfoManager pageInfoManager = PageInfoManager.getInstance();
        if (pageInfoManager == null) {
            return "unknown";
        }
        PageInfo pageInfo = null;
        switch (i) {
            case 0:
                pageInfo = a(pageInfoManager);
                break;
            case 1:
                pageInfo = pageInfoManager.getCurrentPageInfo();
                break;
        }
        return pageInfo == null ? "unknown" : pageInfo.getCid();
    }

    private PageInfo a(PageInfoManager pageInfoManager) {
        int i = 0;
        Object[] objArr = {pageInfoManager};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "25039771089e620e473314f8d8b4f9af", RobustBitConfig.DEFAULT_VALUE)) {
            return (PageInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "25039771089e620e473314f8d8b4f9af");
        }
        PageInfo pageInfo = null;
        LinkedHashMap<String, PageInfo> b2 = b(pageInfoManager);
        if (b2 != null) {
            try {
                int size = b2.size();
                for (Map.Entry<String, PageInfo> entry : b2.entrySet()) {
                    i++;
                    if (i == size - 1) {
                        pageInfo = entry.getValue();
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return pageInfo;
    }

    private LinkedHashMap<String, PageInfo> b(PageInfoManager pageInfoManager) {
        Object[] objArr = {pageInfoManager};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "367b76388af87a9ed8041ea32258c04f", RobustBitConfig.DEFAULT_VALUE)) {
            return (LinkedHashMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "367b76388af87a9ed8041ea32258c04f");
        }
        try {
            Field declaredField = pageInfoManager.getClass().getDeclaredField("mPageInfoMap");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(pageInfoManager);
            if (obj instanceof LinkedHashMap) {
                return (LinkedHashMap) obj;
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }
}

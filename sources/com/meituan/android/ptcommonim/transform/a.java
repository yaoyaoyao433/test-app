package com.meituan.android.ptcommonim.transform;

import android.app.Activity;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import com.meituan.android.ptcommonim.base.network.model.BaseDataEntity;
import com.meituan.android.ptcommonim.model.PTSessionInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.Call;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public static final String[] b = {"imeituan://www.meituan.com/chat/1057"};
    Call<BaseDataEntity<PTSessionInfo>> c;

    public static /* synthetic */ void a(Throwable th) {
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "50ba914086946fa0c794fb6b9f763af6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "50ba914086946fa0c794fb6b9f763af6");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e710834cf988bc73b26bd9c9f10e86a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e710834cf988bc73b26bd9c9f10e86a");
            return;
        }
        com.meituan.android.ptcommonim.base.util.b.a(activity, "网络异常，请稍后再试");
        new Handler(Looper.getMainLooper()).postDelayed(b.a(activity), 1000L);
    }

    public static /* synthetic */ void b(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d673d0cae5bdf7c3b38d41a129215345", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d673d0cae5bdf7c3b38d41a129215345");
        } else if (activity.isFinishing()) {
        } else {
            activity.finish();
        }
    }

    public static /* synthetic */ void a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7c584fe1f90cdef9f00b31f23338fbbf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7c584fe1f90cdef9f00b31f23338fbbf");
        } else {
            com.sankuai.waimai.mach.manager.load.c.a("platform", "platform-imchat-page");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String a(Uri uri, String str) {
        Object[] objArr = {uri, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ddb7c4793a0ccb61aa65ed784a058871", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ddb7c4793a0ccb61aa65ed784a058871");
        }
        String queryParameter = uri.getQueryParameter(str);
        return queryParameter == null ? "" : queryParameter;
    }
}

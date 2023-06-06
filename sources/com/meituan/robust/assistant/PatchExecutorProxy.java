package com.meituan.robust.assistant;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.Patch;
import com.meituan.robust.PatchExecutor;
import com.meituan.robust.PatchManipulate;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.RobustCallBack;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.so.loader.a;
import com.sankuai.meituan.so.loader.d;
import com.sankuai.meituan.so.loader.e;
import com.sankuai.meituan.so.loader.f;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class PatchExecutorProxy extends PatchExecutor {
    private PatchExecutorStartEndCallBack patchExecutorStartEndCallBack;

    public PatchExecutorProxy(Context context, PatchManipulate patchManipulate, RobustCallBack robustCallBack, PatchExecutorStartEndCallBack patchExecutorStartEndCallBack) {
        super(context, patchManipulate, robustCallBack);
        this.patchExecutorStartEndCallBack = patchExecutorStartEndCallBack;
    }

    @Override // com.meituan.robust.PatchExecutor, java.lang.Thread, java.lang.Runnable
    public void run() {
        try {
            if (this.patchExecutorStartEndCallBack != null) {
                this.patchExecutorStartEndCallBack.start();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        super.run();
        try {
            if (this.patchExecutorStartEndCallBack != null) {
                this.patchExecutorStartEndCallBack.end();
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    @Override // com.meituan.robust.PatchExecutor
    public boolean patch(Context context, Patch patch) {
        if (isVerified(patch)) {
            if (hasDex(patch)) {
                return patchClass(context, patch);
            }
            d a = d.a();
            String tempPath = patch.getTempPath();
            Object[] objArr = {tempPath};
            ChangeQuickRedirect changeQuickRedirect = d.a;
            if (PatchProxy.isSupport(objArr, a, changeQuickRedirect, false, "f48b1583d0cb1498ec8d5c7d2078b073", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, a, changeQuickRedirect, false, "f48b1583d0cb1498ec8d5c7d2078b073")).booleanValue() : f.a(tempPath)) {
                final d a2 = d.a();
                final String tempPath2 = patch.getTempPath();
                final String md5 = patch.getMd5();
                final String appHash = patch.getAppHash();
                Object[] objArr2 = {context, tempPath2, md5, appHash};
                ChangeQuickRedirect changeQuickRedirect2 = d.a;
                if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "8a95efab994b3b40134d555c144a1450", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "8a95efab994b3b40134d555c144a1450");
                    return true;
                } else if (context == null || TextUtils.isEmpty(tempPath2) || TextUtils.isEmpty(md5) || TextUtils.isEmpty(appHash)) {
                    return true;
                } else {
                    a2.b = context.getApplicationContext();
                    a2.e = md5;
                    a2.f = appHash;
                    if (TextUtils.isEmpty(a2.c)) {
                        String[] a3 = a.a();
                        if (a3 != null) {
                            if (a3.length > 0) {
                                a2.c = a3[0];
                            }
                            if (a3.length > 1) {
                                a2.d = a3[1];
                            }
                        } else {
                            a2.c = "armeabi";
                        }
                        e.b("so-loader", a2.c + StringUtil.SPACE + a2.d, new Object[0]);
                    }
                    new Thread(new Runnable() { // from class: com.sankuai.meituan.so.loader.d.1
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e1d7c2a5b3a82566083ffa5baf7cf360", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e1d7c2a5b3a82566083ffa5baf7cf360");
                                return;
                            }
                            try {
                                d.a(a2, tempPath2, md5, appHash);
                            } catch (Exception unused) {
                            }
                        }
                    }).start();
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public void setPatchExecutorStartEndCallBack(PatchExecutorStartEndCallBack patchExecutorStartEndCallBack) {
        this.patchExecutorStartEndCallBack = patchExecutorStartEndCallBack;
    }
}

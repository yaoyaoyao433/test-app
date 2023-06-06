package com.dianping.vivopush;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.dianping.base.push.pushservice.c;
import com.dianping.base.push.pushservice.f;
import com.dianping.base.push.pushservice.n;
import com.dianping.base.push.pushservice.util.d;
import com.dianping.base.push.pushservice.util.e;
import com.dianping.base.push.pushservice.util.h;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.launcher.util.aop.b;
import com.vivo.push.IPushActionListener;
import com.vivo.push.PushClient;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a implements f.a {
    public static ChangeQuickRedirect a;

    @Override // com.dianping.base.push.pushservice.f.a
    public final int a() {
        return 9;
    }

    @Override // com.dianping.base.push.pushservice.f.a
    public final void b(final Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4eb8008af56a167c6076179993e31b1e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4eb8008af56a167c6076179993e31b1e");
        } else {
            b.a(h.a(), new Runnable() { // from class: com.dianping.vivopush.a.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "58105af30e9fe9da2fea5b15199da291", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "58105af30e9fe9da2fea5b15199da291");
                        return;
                    }
                    if (f.b(context)) {
                        Context context2 = context;
                        a aVar = a.this;
                        n.a(context2, 9);
                    }
                    try {
                        PushClient.getInstance(context.getApplicationContext()).initialize();
                        d.a(context, VIVOReceiverImpl.class);
                        PushClient.getInstance(context.getApplicationContext()).turnOnPush(new IPushActionListener() { // from class: com.dianping.vivopush.a.1.1
                            public static ChangeQuickRedirect a;

                            @Override // com.vivo.push.IPushActionListener
                            public final void onStateChanged(int i) {
                                Object[] objArr3 = {Integer.valueOf(i)};
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "001f691d75db2f1e2010f7096ac54ed7", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "001f691d75db2f1e2010f7096ac54ed7");
                                } else if (i != 0) {
                                    a.a("Vivo 手机版本异常，走默认通道 ：" + i);
                                } else {
                                    a.a("打开Vivo push成功  " + PushClient.getInstance(context).getRegId());
                                    VIVOReceiverImpl.onReceiveVIVOId(context, PushClient.getInstance(context).getRegId());
                                }
                            }
                        });
                    } catch (Exception e) {
                        a.a("VivoPush vivo初始化异常 " + e.toString());
                    }
                }
            });
        }
    }

    @Override // com.dianping.base.push.pushservice.f.a
    public final boolean a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7dc90e935db8763513a3487be577f386", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7dc90e935db8763513a3487be577f386")).booleanValue();
        }
        if (Build.VERSION.SDK_INT >= 23 && e.d()) {
            try {
                return !TextUtils.isEmpty(context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getString("com.vivo.push.api_key"));
            } catch (Throwable th) {
                Object[] objArr2 = {"api_key", th};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "34a1e5bd1ce1189e9d6a94094141d7be", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "34a1e5bd1ce1189e9d6a94094141d7be");
                } else {
                    c.a("VivoPush", "api_key", th);
                }
            }
        }
        return false;
    }

    public static void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "189d22d5470647d9997315deff0167bb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "189d22d5470647d9997315deff0167bb");
        } else {
            c.b("VivoPush", str);
        }
    }
}

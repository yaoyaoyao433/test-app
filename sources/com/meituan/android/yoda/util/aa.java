package com.meituan.android.yoda.util;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.meituan.android.yoda.YodaResponseListener;
import com.meituan.android.yoda.activity.YodaKNBActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class aa {
    public static ChangeQuickRedirect a;
    private static rx.subjects.b b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a {
        public Context a;
        public String b;
        public int c;
        public int d;
        public YodaResponseListener e;

        public a(Context context, String str, int i, int i2, YodaResponseListener yodaResponseListener) {
            this.a = context;
            this.b = str;
            this.c = i;
            this.d = i2;
            this.e = yodaResponseListener;
        }
    }

    public static void a(Context context, String str, int i, int i2, YodaResponseListener yodaResponseListener) {
        Object[] objArr = {context, str, Integer.valueOf(i), -1, yodaResponseListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6aa7c408d9fc7ecf4cf0e04c40078235", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6aa7c408d9fc7ecf4cf0e04c40078235");
        } else {
            a().onNext(new a(context, str, i, -1, yodaResponseListener));
        }
    }

    public static void a(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "14284359cf3dae5dec09716f281b5441", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "14284359cf3dae5dec09716f281b5441");
        } else if (context == null || TextUtils.isEmpty(str)) {
        } else {
            com.meituan.android.yoda.monitor.log.a.a("SchemeUtil", "startYodaKNBPage, url = " + str, true);
            Intent intent = new Intent(context, YodaKNBActivity.class);
            intent.putExtra("url", str);
            context.startActivity(intent);
        }
    }

    private static synchronized rx.subjects.b a() {
        synchronized (aa.class) {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "afa597f8ffbfc4175cf6adf695f98485", RobustBitConfig.DEFAULT_VALUE)) {
                return (rx.subjects.b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "afa597f8ffbfc4175cf6adf695f98485");
            }
            if (b == null) {
                rx.subjects.b g = rx.subjects.b.g();
                b = g;
                g.c().c(500L, TimeUnit.MILLISECONDS).a(rx.android.schedulers.a.a()).a(ab.a(), new rx.functions.b<Throwable>() { // from class: com.meituan.android.yoda.util.aa.1
                    public static ChangeQuickRedirect a;

                    @Override // rx.functions.b
                    public final /* synthetic */ void call(Throwable th) {
                        Throwable th2 = th;
                        Object[] objArr2 = {th2};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8f4b54c4f6626cd2c5dd6c6b8b89397c", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8f4b54c4f6626cd2c5dd6c6b8b89397c");
                        } else {
                            com.meituan.android.yoda.monitor.log.a.a("SchemeUtil", th2.getMessage(), true);
                        }
                    }
                });
            }
            return b;
        }
    }
}

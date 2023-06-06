package com.sankuai.waimai.lottie;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.lottie.b;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class e {
    public static ChangeQuickRedirect a;
    private static volatile e b;
    private final b c;

    public static e a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a679a87d5b4862ee8dd378f877aa767f", RobustBitConfig.DEFAULT_VALUE)) {
            return (e) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a679a87d5b4862ee8dd378f877aa767f");
        }
        if (b == null) {
            synchronized (e.class) {
                if (b == null) {
                    b = new e();
                }
            }
        }
        return b;
    }

    public e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ab7a03e744e378035788cf17f84716f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ab7a03e744e378035788cf17f84716f");
        } else {
            this.c = b.a();
        }
    }

    public final void a(SafeLottieAnimationView safeLottieAnimationView, String str, String str2, String str3, c cVar) {
        Object[] objArr = {safeLottieAnimationView, str, str2, str3, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7b0ff46b0b684439d3c856c83814463f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7b0ff46b0b684439d3c856c83814463f");
        } else if (TextUtils.isEmpty(str) || safeLottieAnimationView == null) {
        } else {
            b.a a2 = this.c.a(str);
            if (!a2.a(str2, str, str3)) {
                cVar.a();
                return;
            }
            com.sankuai.waimai.foundation.utils.log.a.b("Lottie", "lottie缓存准备就绪，开始加载：" + str2, new Object[0]);
            safeLottieAnimationView.a(a2, str2, cVar);
        }
    }
}

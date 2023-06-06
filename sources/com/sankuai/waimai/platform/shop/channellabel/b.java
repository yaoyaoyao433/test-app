package com.sankuai.waimai.platform.shop.channellabel;

import android.app.Activity;
import android.app.Application;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b {
    public static ChangeQuickRedirect a;
    ChannelLabelController b;
    View c;
    com.sankuai.waimai.platform.domain.core.channel.a d;
    boolean e;
    String f;

    public static /* synthetic */ void a(b bVar, Activity activity, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        Object[] objArr = {activity, activityLifecycleCallbacks};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "7a669e1f16c056b34f87a3642e114229", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "7a669e1f16c056b34f87a3642e114229");
            return;
        }
        try {
            if (bVar.b == null || !activity.equals(bVar.b.b)) {
                return;
            }
            bVar.b.a();
            ((Application) com.meituan.android.singleton.b.a).unregisterActivityLifecycleCallbacks(activityLifecycleCallbacks);
            Object[] objArr2 = {activity};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "4d4f02ccfbe7deb3f3e2830f2d5d1f4c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "4d4f02ccfbe7deb3f3e2830f2d5d1f4c");
            } else if (!activity.isFinishing() && !activity.isDestroyed() && activity.getWindow() != null && activity.getWindow().getDecorView() != null) {
                try {
                    ((ViewGroup) activity.getWindow().getDecorView()).removeView(bVar.c);
                } catch (Exception unused) {
                }
            }
        } catch (Exception unused2) {
        }
    }

    public b(String str, String str2) {
        boolean z = false;
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c5877389407038793af776f52c6d52e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c5877389407038793af776f52c6d52e");
            return;
        }
        this.d = com.sankuai.waimai.platform.domain.core.channel.a.a(str);
        Object[] objArr2 = {str2};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ae6f45c160485fb4858da72431dd841a", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ae6f45c160485fb4858da72431dd841a")).booleanValue();
        } else if ("/pois".equals(str2) || "/content".equals(str2) || "/orders".equals(str2) || "/mine".equals(str2)) {
            z = true;
        }
        this.e = z;
        this.f = str2;
    }
}

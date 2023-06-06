package com.sankuai.waimai.launcher.config;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.router.core.i;
import com.sankuai.waimai.share.b;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public InterfaceC0986a b;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.launcher.config.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public interface InterfaceC0986a {
        i a();

        void a(long j, long j2);

        void a(Application application);

        void a(Context context, String str, String str2, String str3, int i, JSONObject jSONObject);

        boolean a(Activity activity);

        boolean a(Class<? extends Activity> cls);

        b.a b();

        boolean b(Activity activity);

        boolean b(Class<? extends Activity> cls);

        void c();

        boolean c(Activity activity);
    }

    public a() {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class b {
        private static final a a = new a();
    }

    public static final a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2242dedaac8427b0ad6321d29b35a2fe", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2242dedaac8427b0ad6321d29b35a2fe") : b.a;
    }

    public final boolean a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ddbb375b9bd41265c1d1cef22521e33c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ddbb375b9bd41265c1d1cef22521e33c")).booleanValue();
        }
        if (this.b != null) {
            return this.b.b(activity);
        }
        return false;
    }
}

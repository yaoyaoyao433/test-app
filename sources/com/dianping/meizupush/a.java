package com.dianping.meizupush;

import android.content.Context;
import com.dianping.base.push.pushservice.c;
import com.dianping.base.push.pushservice.f;
import com.dianping.base.push.pushservice.n;
import com.dianping.base.push.pushservice.util.d;
import com.dianping.base.push.pushservice.util.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meizu.cloud.pushsdk.PushManager;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a implements f.a {
    public static ChangeQuickRedirect a;
    private String b;
    private String c;

    @Override // com.dianping.base.push.pushservice.f.a
    public final int a() {
        return 6;
    }

    public a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c76e1043dd4c566e9a66738a307a7d09", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c76e1043dd4c566e9a66738a307a7d09");
            return;
        }
        this.b = str;
        this.c = str2;
    }

    @Override // com.dianping.base.push.pushservice.f.a
    public final void b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "094ff5343342d40ebec71fc89f319764", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "094ff5343342d40ebec71fc89f319764");
            return;
        }
        if (f.b(context)) {
            n.a(context, 6);
        }
        d.a(context, MZPushReceiver.class);
        PushManager.register(context, this.b, this.c);
    }

    @Override // com.dianping.base.push.pushservice.f.a
    public final boolean a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0395f8939c2742472cd785add1444031", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0395f8939c2742472cd785add1444031")).booleanValue() : e.e();
    }

    public static void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7de12b24f8c6e7b29605fc50615a5174", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7de12b24f8c6e7b29605fc50615a5174");
        } else {
            c.b("MeizuPush", str);
        }
    }

    public static void a(String str, Throwable th) {
        Object[] objArr = {str, th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "858df77524ecc526c9d1ea588829b1a9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "858df77524ecc526c9d1ea588829b1a9");
        } else {
            c.a("MeizuPush", str, th);
        }
    }
}

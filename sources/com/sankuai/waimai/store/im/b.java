package com.sankuai.waimai.store.im;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.r;
import com.sankuai.waimai.store.im.base.k;
import com.sankuai.waimai.store.im.medical.model.IMDoctorSessionPageParams;
import com.sankuai.xm.im.IMClient;
import com.sankuai.xm.im.session.SessionId;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b {
    public static ChangeQuickRedirect a;
    private static b c;
    public final IMDoctorSessionPageParams b;

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "810325bc812def87869780817faacfbf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "810325bc812def87869780817faacfbf");
        } else {
            this.b = new IMDoctorSessionPageParams();
        }
    }

    public static b a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "219d73d2cf6f5617d2afbc2953335232", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "219d73d2cf6f5617d2afbc2953335232");
        }
        if (c == null) {
            c = new b();
        }
        return c;
    }

    public final boolean a(Activity activity, long j, long j2, @NonNull Intent intent) {
        com.sankuai.xm.im.session.entry.a a2;
        Object[] objArr = {activity, new Long(j), new Long(j2), intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b812f861f09ad91d4f91b7c2ab78fcd", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b812f861f09ad91d4f91b7c2ab78fcd")).booleanValue();
        }
        this.b.inquiryId = j2;
        this.b.isDoctorSession = com.sankuai.waimai.store.router.d.a(intent, "sessionType", "sessionType", 0);
        SessionId a3 = SessionId.a(j, 0L, 3, (short) 0, (short) 1024);
        k kVar = k.a.a;
        Object[] objArr2 = {activity, a3, (byte) 1};
        ChangeQuickRedirect changeQuickRedirect2 = k.a;
        if (PatchProxy.isSupport(objArr2, kVar, changeQuickRedirect2, false, "31731001e8f361eab0172bb0530317aa", RobustBitConfig.DEFAULT_VALUE)) {
            a2 = (com.sankuai.xm.im.session.entry.a) PatchProxy.accessDispatch(objArr2, kVar, changeQuickRedirect2, false, "31731001e8f361eab0172bb0530317aa");
        } else if (!kVar.a(activity, "query session")) {
            a2 = new com.sankuai.xm.im.session.entry.a();
        } else {
            a2 = IMClient.a().a(a3, true);
        }
        if (a2 != null && a2.b != null) {
            String extension = a2.b.getExtension();
            if (!TextUtils.isEmpty(extension)) {
                try {
                    JSONObject jSONObject = new JSONObject(extension);
                    if (this.b.inquiryId <= 0) {
                        this.b.inquiryId = r.a(jSONObject.optString("inquiryId"), 0L);
                    }
                } catch (Exception e) {
                    com.sankuai.waimai.store.base.log.a.a(e);
                }
            }
        }
        return this.b.inquiryId > 0 || this.b.isDoctorSession == 1;
    }
}

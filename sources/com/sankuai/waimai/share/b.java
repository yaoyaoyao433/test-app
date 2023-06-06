package com.sankuai.waimai.share;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Bundle;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.domain.core.Share.ShareTip;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b {
    public static ChangeQuickRedirect a;
    public static a b;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
        void a(Activity activity, ShareTip shareTip, int i, com.sankuai.waimai.foundation.core.service.share.listener.b bVar, Bundle bundle);

        void a(Activity activity, ShareTip shareTip, com.sankuai.waimai.foundation.core.service.share.listener.a aVar, com.sankuai.waimai.foundation.core.service.share.listener.b bVar, Bundle bundle);

        boolean a(Activity activity);

        boolean a(Activity activity, Bitmap bitmap, int i, int i2, com.sankuai.waimai.foundation.core.service.share.listener.b bVar, String str);

        boolean a(Activity activity, ShareTip shareTip, Bitmap bitmap, com.sankuai.waimai.foundation.core.service.share.listener.b bVar);

        boolean a(Activity activity, String str, String str2, String str3, String str4, String str5);

        boolean a(Activity activity, boolean z, String str, int i, int i2, com.sankuai.waimai.foundation.core.service.share.listener.b bVar, String str2);
    }

    public static void a(Activity activity, Bitmap bitmap, int i, int i2, com.sankuai.waimai.foundation.core.service.share.listener.b bVar, String str) {
        Object[] objArr = {activity, bitmap, Integer.valueOf(i), Integer.valueOf(i2), bVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "646f37d644f129f30b884f4ce1412879", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "646f37d644f129f30b884f4ce1412879");
        } else if (i != 2 && i != 1) {
            bVar.a(i, 2);
        } else if (b.a(activity, bitmap, i, i2, bVar, str)) {
        } else {
            bVar.a(i, 2);
        }
    }

    public static void a(Activity activity, ShareTip shareTip, com.sankuai.waimai.foundation.core.service.share.listener.a aVar, com.sankuai.waimai.foundation.core.service.share.listener.b bVar, Bundle bundle) {
        Object[] objArr = {activity, shareTip, aVar, bVar, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "915ea28c5eb9fa05ced83441d1ec5f71", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "915ea28c5eb9fa05ced83441d1ec5f71");
        } else {
            b.a(activity, shareTip, aVar, bVar, bundle);
        }
    }

    public static void a(Activity activity, ShareTip shareTip, int i, com.sankuai.waimai.foundation.core.service.share.listener.b bVar, Bundle bundle) {
        Object[] objArr = {activity, shareTip, Integer.valueOf(i), bVar, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "be6fa6cd504274afd32a28876e6e3c97", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "be6fa6cd504274afd32a28876e6e3c97");
        } else {
            b.a(activity, shareTip, i, bVar, bundle);
        }
    }

    public static boolean a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5af3922a370ad0a612237fd80467cdb5", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5af3922a370ad0a612237fd80467cdb5")).booleanValue() : b.a(activity);
    }

    public static void a(Activity activity, boolean z, String str, int i, int i2, com.sankuai.waimai.foundation.core.service.share.listener.b bVar, String str2) {
        Object[] objArr = {activity, Byte.valueOf(z ? (byte) 1 : (byte) 0), str, 1, 1, bVar, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "169d82cfbe723bcda48a65d81cc52da2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "169d82cfbe723bcda48a65d81cc52da2");
        } else if (b.a(activity, z, str, 1, 1, bVar, str2) || bVar == null) {
        } else {
            bVar.a(1, 2);
        }
    }

    public static void a(Activity activity, ShareTip shareTip, Bitmap bitmap, com.sankuai.waimai.foundation.core.service.share.listener.b bVar) {
        Object[] objArr = {activity, shareTip, bitmap, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bad8fa1b5e676494ac24e0c51eddb242", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bad8fa1b5e676494ac24e0c51eddb242");
        } else {
            b.a(activity, shareTip, bitmap, bVar);
        }
    }
}

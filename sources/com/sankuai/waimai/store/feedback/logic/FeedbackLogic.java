package com.sankuai.waimai.store.feedback.logic;

import android.content.Context;
import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.g;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.store.manager.user.a;
import com.sankuai.waimai.store.util.ab;
import com.sankuai.waimai.store.util.i;
import java.io.Serializable;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class FeedbackLogic {
    public static ChangeQuickRedirect a;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class ShowRecordInfo implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("showCount")
        public int showCount;
        @SerializedName("showTime")
        public String showTime;
    }

    public static String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b5e1187bcfb0cf20840e96dad027dd41", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b5e1187bcfb0cf20840e96dad027dd41");
        }
        return "feedback_close_guide_tip_timestamp" + a.a().c();
    }

    public static String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9b8c07af9c8285791b9d74e582c87fb0", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9b8c07af9c8285791b9d74e582c87fb0");
        }
        return "feedback_show_time" + a.a().c();
    }

    public static boolean a(@NonNull Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "83fd84c57ddbba684f9c16f6d7597f6a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "83fd84c57ddbba684f9c16f6d7597f6a")).booleanValue();
        }
        if (System.currentTimeMillis() - ab.b().b(context, a(), -1L) < 86400000) {
            return false;
        }
        ShowRecordInfo b = b(context);
        if (b != null) {
            String str = b.showTime;
            String b2 = g.b();
            return b2 == null || !b2.equals(str) || b.showCount < 2;
        }
        return true;
    }

    public static ShowRecordInfo b(@NonNull Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c7e37f9dda97004481c8583a74b0b6f5", RobustBitConfig.DEFAULT_VALUE)) {
            return (ShowRecordInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c7e37f9dda97004481c8583a74b0b6f5");
        }
        String b = ab.b().b(context, b(), (String) null);
        if (t.a(b)) {
            return null;
        }
        return (ShowRecordInfo) i.a(b, ShowRecordInfo.class);
    }
}

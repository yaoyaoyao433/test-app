package com.sankuai.waimai.ugc.creator.judas;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.ugc.creator.utils.g;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class e {
    public static ChangeQuickRedirect a;
    public b b;

    public e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f3a6b5a0ddc9113470f93b885b126751", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f3a6b5a0ddc9113470f93b885b126751");
        } else {
            this.b = new com.sankuai.waimai.ugc.creator.judas.a();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class a {
        private static e a = new e();
    }

    public static e a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "894111ad1006e1ab9afce2035c96dc0c", RobustBitConfig.DEFAULT_VALUE) ? (e) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "894111ad1006e1ab9afce2035c96dc0c") : a.a;
    }

    public final void a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ce6412816d6a013a636beadbebb2e88", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ce6412816d6a013a636beadbebb2e88");
        } else if (this.b != null) {
            a(this.b.r, this.b.h, (Map<String, Object>) null, obj);
        }
    }

    public final void a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "644a67b86e45b0d3a59ae17d60703fd5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "644a67b86e45b0d3a59ae17d60703fd5");
        } else if (this.b != null) {
            a(activity, this.b.d, null);
        }
    }

    public final void a(Fragment fragment) {
        Object[] objArr = {fragment};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e2a2c2a9b248c38537e34be9e79ad93", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e2a2c2a9b248c38537e34be9e79ad93");
        } else if (this.b != null) {
            a((Object) fragment, this.b.b, true, (Map<String, Object>) null);
        }
    }

    public final void b(Fragment fragment) {
        Object[] objArr = {fragment};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "78e7f59133ce911c36af9f43eb808598", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "78e7f59133ce911c36af9f43eb808598");
        } else if (this.b != null) {
            a((Object) fragment, this.b.c, true, (Map<String, Object>) null);
        }
    }

    public final void a(Activity activity, boolean z) {
        Object[] objArr = {activity, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "137723acc8c1b0d54599b32aa32b7469", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "137723acc8c1b0d54599b32aa32b7469");
        } else if (this.b != null) {
            a(activity, this.b.h, z, (Map<String, Object>) null);
        }
    }

    public final void a(Activity activity, String str, Map<String, Object> map) {
        Object[] objArr = {activity, str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c10e32bba04366c45b9d2c08cd9d959", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c10e32bba04366c45b9d2c08cd9d959");
        } else if (TextUtils.isEmpty(str) || activity == null) {
        } else {
            Statistics.setValLab(AppUtil.generatePageInfoKey(activity), map);
            g.a(str, activity);
        }
    }

    private void a(Object obj, String str, boolean z, Map<String, Object> map) {
        Object[] objArr = {obj, str, Byte.valueOf(z ? (byte) 1 : (byte) 0), null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ccc1388f9ca5aa1b7e73076f54eca4ce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ccc1388f9ca5aa1b7e73076f54eca4ce");
        } else if (TextUtils.isEmpty(str) || obj == null) {
        } else {
            String generatePageInfoKey = AppUtil.generatePageInfoKey(obj);
            if (z) {
                Statistics.getChannel().writePageView(generatePageInfoKey, str, null);
            } else {
                Statistics.getChannel().writePageDisappear(generatePageInfoKey, str, null);
            }
        }
    }

    public void a(String str, String str2, Map<String, Object> map, Object obj) {
        Object[] objArr = {str, str2, map, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec6793e219afca19b44ccd399f455d73", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec6793e219afca19b44ccd399f455d73");
        } else if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || obj == null) {
        } else {
            g.a(str, str2, obj).a(map).a();
        }
    }
}

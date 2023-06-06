package com.sankuai.meituan.takeoutnew.util.aop;

import android.content.ContentResolver;
import android.provider.Settings;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.manipulator.annotation.ClassLevelScope;
/* compiled from: ProGuard */
@ClassLevelScope(exclude = {"com.meituan.android.common.unionid.oneid.util.*", "com.sankuai.meituan.location.collector.*", "com.meituan.android.common.locate.*"})
/* loaded from: classes4.dex */
public final class l {
    public static ChangeQuickRedirect a;

    public static String a(ContentResolver contentResolver, String str) {
        Object[] objArr = {contentResolver, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6a9c6513c853ef69f18548713bc1a600", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6a9c6513c853ef69f18548713bc1a600") : ("android_id".equals(str) && Privacy.createPermissionGuard().a(com.meituan.android.singleton.b.a)) ? "" : Settings.Secure.getString(contentResolver, str);
    }
}

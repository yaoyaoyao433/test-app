package com.meituan.mmp.lib.api.auth;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import com.meituan.mmp.lib.model.Event;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class e implements f {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.mmp.lib.api.auth.f
    public final /* synthetic */ Dialog a(Context context, com.meituan.mmp.lib.config.a aVar) {
        Object[] objArr = {context, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a68622ae2ed8c24a0b37c6e2bce5e3b5", RobustBitConfig.DEFAULT_VALUE) ? (SettingDialog) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a68622ae2ed8c24a0b37c6e2bce5e3b5") : new SettingDialog(context, aVar);
    }

    @Override // com.meituan.mmp.lib.api.auth.f
    public final String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c1afbd784303a9529b78818d26048f98", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c1afbd784303a9529b78818d26048f98") : c.a(str);
    }

    @Override // com.meituan.mmp.lib.api.auth.f
    public final Map<String, Boolean> a(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "002685492c78b32318c4befa49c6efc3", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "002685492c78b32318c4befa49c6efc3") : c.a(context, str);
    }

    @Override // com.meituan.mmp.lib.api.auth.f
    public final boolean a(com.meituan.mmp.lib.config.a aVar, String str) {
        Object[] objArr = {aVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "63548fe07e2ecfde08bdac7b22c73964", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "63548fe07e2ecfde08bdac7b22c73964")).booleanValue() : c.a(aVar, str);
    }

    @Override // com.meituan.mmp.lib.api.auth.f
    public final void a(Activity activity, com.meituan.mmp.lib.config.a aVar, Event event, i iVar) {
        Object[] objArr = {activity, aVar, event, iVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d1f0bd4cafb5730abc66f7af888ca49", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d1f0bd4cafb5730abc66f7af888ca49");
        } else {
            c.a(activity, aVar, event, iVar);
        }
    }

    @Override // com.meituan.mmp.lib.api.auth.f
    public final void a(Activity activity, com.meituan.mmp.lib.config.a aVar, String str, i iVar) {
        Object[] objArr = {activity, aVar, str, iVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b9129d065ef5f63d6824fe64ddd9f970", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b9129d065ef5f63d6824fe64ddd9f970");
        } else {
            c.a(activity, aVar, str, iVar);
        }
    }

    @Override // com.meituan.mmp.lib.api.auth.f
    public final void a(Activity activity, com.meituan.mmp.lib.config.a aVar, String str, String str2, i iVar) {
        Object[] objArr = {activity, aVar, str, str2, iVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5feeedeb8232f4fa20540123a307413c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5feeedeb8232f4fa20540123a307413c");
        } else {
            c.a(activity, aVar, str, str2, iVar);
        }
    }
}

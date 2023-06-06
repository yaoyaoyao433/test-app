package com.meituan.android.ptcommonim.video;

import android.app.Activity;
import android.support.v4.app.FragmentManager;
import com.meituan.android.ptcommonim.base.bean.PTIMCommonBean;
import com.meituan.android.ptcommonim.video.model.VideoBaseParam;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.spawn.base.BaseActivity;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b {
    public static ChangeQuickRedirect a;

    VideoBaseParam a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f974973db21adb048095269d8fe8588", RobustBitConfig.DEFAULT_VALUE)) {
            return (VideoBaseParam) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f974973db21adb048095269d8fe8588");
        }
        try {
            return (VideoBaseParam) activity.getIntent().getParcelableExtra("video_operate_param");
        } catch (Throwable unused) {
            return null;
        }
    }

    PTIMCommonBean b(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "898ff9e39ea673059392627d92ad4861", RobustBitConfig.DEFAULT_VALUE)) {
            return (PTIMCommonBean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "898ff9e39ea673059392627d92ad4861");
        }
        try {
            return (PTIMCommonBean) activity.getIntent().getParcelableExtra("video_common_bean");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public FragmentManager a(BaseActivity baseActivity) {
        Object[] objArr = {baseActivity};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a8292893a2043a796d63c886d7a55de", RobustBitConfig.DEFAULT_VALUE) ? (FragmentManager) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a8292893a2043a796d63c886d7a55de") : baseActivity.getSupportFragmentManager();
    }
}

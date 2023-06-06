package com.meituan.android.ptcommonim.video;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import com.meituan.android.ptcommonim.base.bean.PTIMCommonBean;
import com.meituan.android.ptcommonim.video.model.VideoPreviewParam;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static void a(@NonNull Context context, @NonNull VideoPreviewParam videoPreviewParam, PTIMCommonBean pTIMCommonBean) {
        Object[] objArr = {context, videoPreviewParam, pTIMCommonBean};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "39a77c3ee240bdb2d6e84e70d2c186fe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "39a77c3ee240bdb2d6e84e70d2c186fe");
            return;
        }
        try {
            Intent a2 = a(context);
            a2.putExtra("video_operate_param", videoPreviewParam);
            a2.putExtra("video_common_bean", pTIMCommonBean);
            context.startActivity(a2);
        } catch (Throwable unused) {
        }
    }

    public static Intent a(@NonNull Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f29e02b6096eef449849a04f47e1498a", RobustBitConfig.DEFAULT_VALUE)) {
            return (Intent) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f29e02b6096eef449849a04f47e1498a");
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("imeituan://www.meituan.com/ptcommonim/container"));
        intent.setPackage(context.getPackageName());
        return intent;
    }
}

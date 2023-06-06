package com.meituan.android.mtplayer.audio;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static void a(@NonNull Context context, @NonNull String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b86a1c0f0573e54935e83b0b7ced3d1b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b86a1c0f0573e54935e83b0b7ced3d1b");
        } else if (context == null) {
        } else {
            Intent intent = new Intent();
            intent.setClass(context, MTAudioPlayerService.class);
            intent.setPackage(context.getPackageName());
            intent.setAction(str);
            c.a(context, intent);
        }
    }

    public static void a(Context context, String str, Bundle bundle) {
        Object[] objArr = {context, str, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6a5568ce9a3a0cf9fc886e685443d465", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6a5568ce9a3a0cf9fc886e685443d465");
        } else if (context == null) {
        } else {
            Intent intent = new Intent();
            intent.setClass(context, MTAudioPlayerService.class);
            intent.setPackage(context.getPackageName());
            intent.setAction(str);
            intent.putExtras(bundle);
            c.a(context, intent);
        }
    }
}

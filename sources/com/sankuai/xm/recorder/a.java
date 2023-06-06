package com.sankuai.xm.recorder;

import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static boolean a(Context context) {
        AudioManager audioManager;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7e3b10cabad843617bba08fd16012ecf", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7e3b10cabad843617bba08fd16012ecf")).booleanValue() : (context == null || (audioManager = (AudioManager) context.getSystemService("audio")) == null || Build.VERSION.SDK_INT < 24 || com.sankuai.xm.base.util.b.a(audioManager.getActiveRecordingConfigurations())) ? false : true;
    }
}

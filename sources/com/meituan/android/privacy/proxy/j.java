package com.meituan.android.privacy.proxy;

import android.content.Context;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.waimai.reactnative.modules.WmChooseMediaModule;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class j implements com.meituan.android.privacy.interfaces.q {
    public static ChangeQuickRedirect a;
    private CameraManager b;
    private u c;
    private String d;

    public j(@NonNull Context context, @NonNull String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2d2495cc18d566644d6afc568b7794b3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2d2495cc18d566644d6afc568b7794b3");
        } else if (Build.VERSION.SDK_INT < 21) {
        } else {
            this.d = str;
            this.c = new u();
            try {
                this.b = (CameraManager) context.getSystemService(WmChooseMediaModule.TYPE_CAMERA);
            } catch (Exception unused) {
            }
        }
    }
}

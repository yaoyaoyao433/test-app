package com.meituan.android.privacy.interfaces.def;

import android.content.Context;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.waimai.reactnative.modules.WmChooseMediaModule;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class k extends c implements com.meituan.android.privacy.interfaces.q {
    public static ChangeQuickRedirect c;
    private CameraManager d;

    public k(Context context, String str) {
        super(context, str);
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b96baf044539b1cc74cc7228059924c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b96baf044539b1cc74cc7228059924c");
        } else if (Build.VERSION.SDK_INT >= 21 && this.a != null) {
            try {
                this.d = (CameraManager) this.a.getSystemService(WmChooseMediaModule.TYPE_CAMERA);
            } catch (Exception unused) {
            }
        }
    }
}

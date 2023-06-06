package com.meituan.passport.plugins;

import android.graphics.Bitmap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class g {
    public static ChangeQuickRedirect a;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface a {
        void a();

        void a(Bitmap bitmap);
    }

    public void a(String str, a aVar) {
        Object[] objArr = {str, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c70cbdf653c3d9b8026ef8f828af9d9c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c70cbdf653c3d9b8026ef8f828af9d9c");
        } else if (aVar != null) {
            aVar.a();
        }
    }

    public final void a(String str, u uVar) {
        Object[] objArr = {str, uVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "680725263caebc0f008e66e3ac7076b3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "680725263caebc0f008e66e3ac7076b3");
        } else {
            a(str, (a) uVar);
        }
    }
}

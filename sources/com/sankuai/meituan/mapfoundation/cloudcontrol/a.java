package com.sankuai.meituan.mapfoundation.cloudcontrol;

import com.meituan.android.common.horn.Horn;
import com.meituan.android.common.horn.HornCallback;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static void a(String str, final b bVar) {
        Object[] objArr = {str, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "86e57efa37e49b485e666dc1278ec7f2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "86e57efa37e49b485e666dc1278ec7f2");
            return;
        }
        try {
            Horn.register(str, new HornCallback() { // from class: com.sankuai.meituan.mapfoundation.cloudcontrol.a.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.common.horn.HornCallback
                public final void onChanged(boolean z, String str2) {
                    Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b6c545f87f5914123f0f8311c798f6e3", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b6c545f87f5914123f0f8311c798f6e3");
                    } else if (z) {
                        if (str2 == null) {
                            str2 = "";
                        }
                        if (b.this != null) {
                            b.this.a(str2);
                        }
                    }
                }
            });
        } catch (Exception unused) {
        }
    }
}

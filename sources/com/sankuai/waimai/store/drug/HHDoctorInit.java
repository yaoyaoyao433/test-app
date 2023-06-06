package com.sankuai.waimai.store.drug;

import android.content.Context;
import android.support.annotation.Keep;
import android.widget.ImageView;
import com.hhmedic.android.sdk.HHDoctor;
import com.hhmedic.android.sdk.config.HHImageEngine;
import com.hhmedic.android.sdk.config.HHSDKOptions;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.waimai.store.drug.TxEngine;
import com.sankuai.waimai.store.util.m;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class HHDoctorInit {
    public static ChangeQuickRedirect a = null;
    private static volatile boolean b = false;

    public static void a(Context context, boolean z) {
        boolean z2;
        Object[] objArr = {context, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "622554b94c22b1fd8efa45fa6c08cb1f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "622554b94c22b1fd8efa45fa6c08cb1f");
        } else if (b) {
        } else {
            try {
                Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "cb72db526545a0b3c53d6960658f559d", RobustBitConfig.DEFAULT_VALUE)) {
                    z2 = ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "cb72db526545a0b3c53d6960658f559d")).booleanValue();
                } else {
                    if (z) {
                        initTxEngine();
                    }
                    if (!com.sankuai.waimai.foundation.core.a.c()) {
                        String b2 = com.sankuai.waimai.store.base.net.sg.c.a().b();
                        if (!"prod".equals(b2) && !"st".equals(b2)) {
                            z2 = true;
                        }
                    }
                    z2 = false;
                }
                HHDoctor.init(context, new HHSDKOptions("10350", z2, new HHImageEngine() { // from class: com.sankuai.waimai.store.drug.HHDoctorInit.1
                    public static ChangeQuickRedirect a;

                    @Override // com.hhmedic.android.sdk.config.HHImageEngine
                    public final void loadImage(Context context2, int i, String str, ImageView imageView) {
                        Object[] objArr3 = {context2, Integer.valueOf(i), str, imageView};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "05dae96a1006486b43618392ac5ef904", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "05dae96a1006486b43618392ac5ef904");
                            return;
                        }
                        b.C0608b a2 = m.a(str);
                        a2.b = context2;
                        a2.i = i;
                        a2.a(imageView);
                    }
                }));
                b = true;
            } catch (Throwable th) {
                com.sankuai.shangou.stone.util.log.a.a(th);
                b = false;
            }
        }
    }

    @Keep
    public static void initTxEngine() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6225c1fd0e9ae89ffaa7e0be3d5c2530", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6225c1fd0e9ae89ffaa7e0be3d5c2530");
        } else {
            new TxEngine().checkEngine(new TxEngine.a() { // from class: com.sankuai.waimai.store.drug.HHDoctorInit.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.drug.TxEngine.a
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b0c771088802748c301ef98d272295f5", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b0c771088802748c301ef98d272295f5");
                    } else {
                        com.sankuai.shangou.stone.util.log.a.a("TxEngineInitial", "onInitialSucceed", new Object[0]);
                    }
                }

                @Override // com.sankuai.waimai.store.drug.TxEngine.a
                public final void a(int i) {
                    Object[] objArr2 = {202};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d508d18d95288017e30e98a4a8fb1598", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d508d18d95288017e30e98a4a8fb1598");
                    } else {
                        com.sankuai.shangou.stone.util.log.a.a("TxEngineInitial", "onInitialFailed", new Object[0]);
                    }
                }
            });
        }
    }
}

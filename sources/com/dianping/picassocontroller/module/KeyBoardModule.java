package com.dianping.picassocontroller.module;

import android.support.annotation.Keep;
import com.dianping.picasso.view.keyboard.PicassoKeyboardCenter;
import com.dianping.picassocontroller.annotation.PCSBMethod;
import com.dianping.picassocontroller.annotation.PCSBModule;
import com.dianping.picassocontroller.vc.b;
import com.dianping.picassocontroller.vc.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@Keep
@PCSBModule(name = "keyboard")
/* loaded from: classes.dex */
public class KeyBoardModule {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Keep
    @PCSBMethod(name = "hide")
    public void hide(final b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d99dcde6a759863a9214db644031262c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d99dcde6a759863a9214db644031262c");
        } else if (bVar instanceof g) {
            ((g) bVar).a(new Runnable() { // from class: com.dianping.picassocontroller.module.KeyBoardModule.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "2de6cf80356c5f13f3355b9e083954d2", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "2de6cf80356c5f13f3355b9e083954d2");
                    } else {
                        PicassoKeyboardCenter.instance().hideKeyboard(bVar.b());
                    }
                }
            });
        }
    }
}

package com.sankuai.waimai.platform.mach.lottieextend;

import android.content.Context;
import com.airbnb.lottie.LottieAnimationView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.Mach;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class f extends com.sankuai.waimai.mach.component.base.a<MachSafeLottieAnimView> {
    public static ChangeQuickRedirect a;
    private b b;

    @Override // com.sankuai.waimai.mach.component.base.a
    public final /* synthetic */ MachSafeLottieAnimView b(Context context) {
        com.sankuai.waimai.mach.manager.cache.e machBundle;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7dde7444688524d70ee923532fde0107", RobustBitConfig.DEFAULT_VALUE)) {
            return (MachSafeLottieAnimView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7dde7444688524d70ee923532fde0107");
        }
        MachSafeLottieAnimView machSafeLottieAnimView = new MachSafeLottieAnimView(context);
        if (this.b != null) {
            Object[] objArr2 = {machSafeLottieAnimView};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b139a53060b5e892f9ff07f698e363e5", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b139a53060b5e892f9ff07f698e363e5");
            } else {
                machSafeLottieAnimView.setLottieUrl(this.b.b);
                Object[] objArr3 = {machSafeLottieAnimView};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "165a3e66706a7b992631e15aff41992b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "165a3e66706a7b992631e15aff41992b");
                } else {
                    Mach mach = this.m;
                    if (mach != null && (machBundle = mach.getMachBundle()) != null) {
                        machSafeLottieAnimView.setTemplateId(machBundle.j);
                    }
                }
                Object[] objArr4 = {machSafeLottieAnimView};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "adb337c820301fcfccf52a8412e10070", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "adb337c820301fcfccf52a8412e10070");
                } else {
                    if (this.b.d) {
                        machSafeLottieAnimView.setRepeatMode(2);
                    } else {
                        machSafeLottieAnimView.setRepeatMode(1);
                    }
                    if (this.b.c) {
                        machSafeLottieAnimView.setRepeatCount(-1);
                    } else {
                        machSafeLottieAnimView.setRepeatCount(0);
                    }
                    machSafeLottieAnimView.setIsAutoPlay(true);
                    machSafeLottieAnimView.setAnimStatus(this.b.h);
                    machSafeLottieAnimView.setSpeed(this.b.g);
                    ((LottieAnimationView) machSafeLottieAnimView).b.a(this.b.f, this.b.e);
                }
                d.a().b();
                d.a().a(machSafeLottieAnimView, this.b.b);
            }
        }
        return machSafeLottieAnimView;
    }

    @Override // com.sankuai.waimai.mach.component.base.a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "70b9171421b467ab62303b51f09e47cf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "70b9171421b467ab62303b51f09e47cf");
        } else {
            this.b = new b(k());
        }
    }
}

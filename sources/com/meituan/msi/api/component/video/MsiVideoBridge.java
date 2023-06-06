package com.meituan.msi.api.component.video;

import android.view.View;
import com.meituan.msi.annotations.MsiApiMethod;
import com.meituan.msi.api.IMsiApi;
import com.meituan.msi.api.component.video.bean.FullScreenParam;
import com.meituan.msi.bean.MsiContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class MsiVideoBridge implements IMsiApi {
    public static ChangeQuickRedirect a;

    @MsiApiMethod(name = "createVideoContext")
    public void createVideoContext(MsiContext msiContext) {
    }

    @MsiApiMethod(name = "VideoContext.play", onUiThread = true)
    public void play(MsiContext msiContext) {
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cf222f02227540739e05287148808522", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cf222f02227540739e05287148808522");
            return;
        }
        b a2 = a(msiContext);
        if (a2 != null) {
            a2.a();
        }
    }

    @MsiApiMethod(name = "VideoContext.pause", onUiThread = true)
    public void pause(MsiContext msiContext) {
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b479ccbc0b66a49b668324c48667679a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b479ccbc0b66a49b668324c48667679a");
            return;
        }
        b a2 = a(msiContext);
        if (a2 != null) {
            a2.d();
        }
    }

    @MsiApiMethod(name = "VideoContext.stop", onUiThread = true)
    public void stop(MsiContext msiContext) {
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee621ba71f74dd5ec2a79821aef02527", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee621ba71f74dd5ec2a79821aef02527");
            return;
        }
        b a2 = a(msiContext);
        if (a2 != null) {
            a2.e();
        }
    }

    @MsiApiMethod(name = "VideoContext.requestFullScreen", onUiThread = true, request = FullScreenParam.class)
    public void requestFullScreen(FullScreenParam fullScreenParam, MsiContext msiContext) {
        Object[] objArr = {fullScreenParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b7a70009a682ae89de39747bfc0a952", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b7a70009a682ae89de39747bfc0a952");
            return;
        }
        b a2 = a(msiContext);
        if (a2 != null) {
            a2.c(fullScreenParam != null ? fullScreenParam.direction : -1);
        }
    }

    @MsiApiMethod(name = "VideoContext.exitFullScreen", onUiThread = true)
    public void exitFullScreen(MsiContext msiContext) {
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c2e3d604528a0788ab2e436f1fbb5b9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c2e3d604528a0788ab2e436f1fbb5b9");
            return;
        }
        b a2 = a(msiContext);
        if (a2 != null) {
            a2.f();
        }
    }

    private b a(MsiContext msiContext) {
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0263dced1e37ee36592d04f14380c4c6", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0263dced1e37ee36592d04f14380c4c6");
        }
        View findCoverView = msiContext.findCoverView();
        if (findCoverView instanceof b) {
            return (b) findCoverView;
        }
        msiContext.onError("view not found");
        return null;
    }
}

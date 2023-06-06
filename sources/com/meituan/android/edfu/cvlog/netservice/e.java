package com.meituan.android.edfu.cvlog.netservice;

import android.content.Context;
import com.meituan.android.edfu.cvlog.netservice.bean.ImageResult;
import com.meituan.android.edfu.cvlog.netservice.bean.ImageSaveRequest;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.ar;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class e {
    public static ChangeQuickRedirect a;
    public Context b;
    public ar c;
    public ScanService d;
    public String e;
    public String f;
    public String g;
    public boolean h;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        public String b;
        public String c;
        public boolean d;
    }

    public e(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d07a5d5ac30647a66d28801fc3e59384", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d07a5d5ac30647a66d28801fc3e59384");
            return;
        }
        this.e = "https://mop.meituan.com/";
        this.f = "https://mop.meituan.com/";
        this.h = false;
        this.f = aVar.b;
        this.g = aVar.c;
        this.h = aVar.d;
    }

    public final rx.d<ImageResult> a(ImageSaveRequest imageSaveRequest) {
        Object[] objArr = {imageSaveRequest};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c46ab25d3cca93caa5c56615a30bacc", RobustBitConfig.DEFAULT_VALUE) ? (rx.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c46ab25d3cca93caa5c56615a30bacc") : this.d.saveImage(imageSaveRequest).b(rx.schedulers.a.d()).a(rx.schedulers.a.d());
    }
}

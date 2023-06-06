package com.meituan.android.loader.impl;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class k extends m<Boolean> {
    public static ChangeQuickRedirect a;
    private File b;
    private String c;

    @Override // com.meituan.android.loader.impl.m
    public final /* synthetic */ Boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "573b378588810be2457731999799745e", RobustBitConfig.DEFAULT_VALUE)) {
            return (Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "573b378588810be2457731999799745e");
        }
        if (this.b.exists()) {
            if (this.b.isDirectory()) {
                return Boolean.valueOf(j.a(this.b));
            }
            return Boolean.valueOf(this.b.delete());
        }
        return Boolean.TRUE;
    }

    @Override // com.meituan.android.loader.impl.m
    public final /* synthetic */ Boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "378c7327d658d0ed0b4ba1921d610b0b", RobustBitConfig.DEFAULT_VALUE) ? (Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "378c7327d658d0ed0b4ba1921d610b0b") : Boolean.FALSE;
    }

    @Override // com.meituan.android.loader.impl.m
    public final /* synthetic */ Boolean d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "797e8fcb6b1d7ca8527e9eda9c654dd2", RobustBitConfig.DEFAULT_VALUE) ? (Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "797e8fcb6b1d7ca8527e9eda9c654dd2") : Boolean.FALSE;
    }

    public k(File file, String str) {
        Object[] objArr = {file, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed5da75089461e9c702aa06ac9b0a1f7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed5da75089461e9c702aa06ac9b0a1f7");
            return;
        }
        this.b = file;
        this.c = str;
    }

    @Override // com.meituan.android.loader.impl.m
    public final String b() {
        return this.c;
    }
}

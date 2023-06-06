package com.sankuai.xm.imui;

import android.content.Context;
import android.content.pm.ProviderInfo;
import android.support.annotation.NonNull;
import android.support.v4.content.FileProvider;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.imui.common.util.d;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class DxFileProvider extends FileProvider {
    public static ChangeQuickRedirect a;
    private static DxFileProvider b;
    private static ProviderInfo c;

    @Override // android.support.v4.content.FileProvider, android.content.ContentProvider
    public void attachInfo(@NonNull Context context, @NonNull ProviderInfo providerInfo) {
        Object[] objArr = {context, providerInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "129db85bc3b6d6b6330d4180d9259052", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "129db85bc3b6d6b6330d4180d9259052");
            return;
        }
        try {
            super.attachInfo(context, providerInfo);
        } catch (Throwable th) {
            b = this;
            c = providerInfo;
            d.a(th, "DxFileProvider::attachInfo failed.", new Object[0]);
        }
    }

    public static String a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a39a6b14c5ac11210f79b4765eb94537", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a39a6b14c5ac11210f79b4765eb94537");
        }
        if (c != null && b != null) {
            b.attachInfo(context, c);
            c = null;
            b = null;
        }
        return context.getPackageName() + ".DxFileProvider";
    }
}

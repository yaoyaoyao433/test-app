package com.meituan.android.picassohelper;

import com.meituan.dio.easy.DioFile;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.InputStream;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b implements com.squareup.picasso.load.data.b<DioFile, InputStream> {
    public static ChangeQuickRedirect a;

    @Override // com.squareup.picasso.load.data.b
    public final /* synthetic */ com.squareup.picasso.load.data.a<InputStream> a(DioFile dioFile, int i, int i2) {
        DioFile dioFile2 = dioFile;
        Object[] objArr = {dioFile2, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9321425a6f2bb474de92df4e1aba437b", RobustBitConfig.DEFAULT_VALUE) ? (com.squareup.picasso.load.data.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9321425a6f2bb474de92df4e1aba437b") : new a(dioFile2);
    }
}

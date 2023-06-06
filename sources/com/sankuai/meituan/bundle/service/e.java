package com.sankuai.meituan.bundle.service;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class e extends FilterInputStream {
    public static ChangeQuickRedirect e;
    private long a;

    public abstract void a();

    public abstract void a(long j);

    public e(InputStream inputStream) {
        super(inputStream);
        Object[] objArr = {inputStream};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2291decc33486ab9e6e83b7e931f40d7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2291decc33486ab9e6e83b7e931f40d7");
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(@NonNull byte[] bArr, int i, int i2) throws IOException {
        Object[] objArr = {bArr, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b34933a42a9b841414c6aff03d45dbbe", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b34933a42a9b841414c6aff03d45dbbe")).intValue();
        }
        int read = super.read(bArr, i, i2);
        if (read != -1) {
            this.a += read;
            a(this.a);
        } else {
            a();
        }
        return read;
    }
}

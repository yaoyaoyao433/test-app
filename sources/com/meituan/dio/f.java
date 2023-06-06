package com.meituan.dio;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class f implements g {
    public static ChangeQuickRedirect a;
    protected final File b;

    public f(File file) {
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9685b46e4599bd76ed2075767fe50e01", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9685b46e4599bd76ed2075767fe50e01");
        } else {
            this.b = file;
        }
    }

    @Override // com.meituan.dio.g
    /* renamed from: a */
    public final FileInputStream c() throws IOException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "939ee8227c624afe4b382d041855a8bc", RobustBitConfig.DEFAULT_VALUE)) {
            return (FileInputStream) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "939ee8227c624afe4b382d041855a8bc");
        }
        if (this.b == null) {
            throw new FileNotFoundException();
        }
        return new FileInputStream(this.b);
    }

    public final File b() {
        return this.b;
    }
}

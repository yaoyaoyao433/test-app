package com.meituan.msc.modules.update;

import com.meituan.dio.easy.DioFile;
import com.meituan.msc.modules.update.bean.PackageInfoWrapper;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class e {
    public PackageInfoWrapper a;
    public DioFile b;
    public String c;

    public e(DioFile dioFile) {
        this.b = dioFile;
    }

    public e(PackageInfoWrapper packageInfoWrapper, DioFile dioFile, String str) {
        this.a = packageInfoWrapper;
        this.b = dioFile;
        this.c = str;
    }
}

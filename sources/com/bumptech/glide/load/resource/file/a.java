package com.bumptech.glide.load.resource.file;

import com.bumptech.glide.load.e;
import com.bumptech.glide.load.engine.l;
import java.io.File;
import java.io.IOException;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a implements e<File, File> {
    @Override // com.bumptech.glide.load.e
    public final String a() {
        return "";
    }

    @Override // com.bumptech.glide.load.e
    public final /* synthetic */ l<File> a(File file, int i, int i2) throws IOException {
        return new b(file);
    }
}

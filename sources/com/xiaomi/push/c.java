package com.xiaomi.push;

import java.io.File;
import java.io.FileFilter;
/* loaded from: classes6.dex */
public final class c implements FileFilter {
    @Override // java.io.FileFilter
    public final boolean accept(File file) {
        return file.isDirectory();
    }
}

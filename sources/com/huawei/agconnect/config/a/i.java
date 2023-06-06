package com.huawei.agconnect.config.a;

import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class i {
    public static void a(Reader reader, Writer writer, char[] cArr) throws IOException {
        while (true) {
            int read = reader.read(cArr);
            if (-1 == read) {
                return;
            }
            writer.write(cArr, 0, read);
        }
    }
}

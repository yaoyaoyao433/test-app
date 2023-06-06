package com.meizu.cloud.pushsdk.b;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Comparator;
/* loaded from: classes3.dex */
public final class e {
    final SimpleDateFormat a = new SimpleDateFormat("yyyy-MM-dd");
    final d b = new d("lo");
    BufferedWriter c;

    public final void a() throws IOException {
        if (this.c != null) {
            this.c.flush();
            this.c.close();
            this.c = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(File file) {
        File[] listFiles = file.listFiles(new FileFilter() { // from class: com.meizu.cloud.pushsdk.b.e.1
            @Override // java.io.FileFilter
            public final boolean accept(File file2) {
                return file2.getName().endsWith(".log.txt");
            }
        });
        if (listFiles != null) {
            if (listFiles.length > 7) {
                Arrays.sort(listFiles, new a());
                for (int i = 7; i < listFiles.length; i++) {
                    listFiles[i].delete();
                }
            }
        }
    }

    /* loaded from: classes3.dex */
    class a implements Comparator<File> {
        a() {
        }

        @Override // java.util.Comparator
        public final /* synthetic */ int compare(File file, File file2) {
            int i = ((file.lastModified() - file2.lastModified()) > 0L ? 1 : ((file.lastModified() - file2.lastModified()) == 0L ? 0 : -1));
            if (i > 0) {
                return -1;
            }
            return i == 0 ? 0 : 1;
        }
    }
}

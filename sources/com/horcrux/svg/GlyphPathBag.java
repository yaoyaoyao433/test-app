package com.horcrux.svg;

import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class GlyphPathBag {
    private final Paint paint;
    private final ArrayList<Path> paths = new ArrayList<>();
    private final int[][] data = new int[256];

    /* JADX INFO: Access modifiers changed from: package-private */
    public GlyphPathBag(Paint paint) {
        this.paint = paint;
        this.paths.add(new Path());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Path getOrCreateAndCache(char c, String str) {
        Path path;
        int index = getIndex(c);
        if (index != 0) {
            path = this.paths.get(index);
        } else {
            Path path2 = new Path();
            this.paint.getTextPath(str, 0, 1, 0.0f, 0.0f, path2);
            int i = c >> '\b';
            int[] iArr = this.data[i];
            if (iArr == null) {
                int[] iArr2 = new int[256];
                this.data[i] = iArr2;
                iArr = iArr2;
            }
            iArr[c & 255] = this.paths.size();
            this.paths.add(path2);
            path = path2;
        }
        Path path3 = new Path();
        path3.addPath(path);
        return path3;
    }

    private int getIndex(char c) {
        int[] iArr = this.data[c >> '\b'];
        if (iArr == null) {
            return 0;
        }
        return iArr[c & 255];
    }
}

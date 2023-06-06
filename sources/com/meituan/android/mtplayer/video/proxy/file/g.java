package com.meituan.android.mtplayer.video.proxy.file;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.File;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class g extends e {
    public static ChangeQuickRedirect b;
    private final int c;

    public g(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c1a8f1bd22305aece6e4a38cd0f499e8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c1a8f1bd22305aece6e4a38cd0f499e8");
        } else if (i <= 0) {
            throw new IllegalArgumentException("Max count must be positive number!");
        } else {
            this.c = i;
        }
    }

    @Override // com.meituan.android.mtplayer.video.proxy.file.e
    public final boolean a(File file, long j, int i) {
        return i <= this.c;
    }
}

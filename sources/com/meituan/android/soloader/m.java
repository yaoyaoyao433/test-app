package com.meituan.android.soloader;

import android.os.StrictMode;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.io.IOException;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class m {
    public static ChangeQuickRedirect j;

    public abstract int a(String str, int i, StrictMode.ThreadPolicy threadPolicy) throws IOException;

    @Nullable
    public abstract File a(String str) throws IOException;

    public void a(int i) throws IOException {
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = j;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c6320bee7fd88a76dab825b352d74a9c", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c6320bee7fd88a76dab825b352d74a9c") : getClass().getName();
    }
}

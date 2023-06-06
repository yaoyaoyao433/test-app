package com.meituan.android.mtplayer.video.proxy;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class s {
    public static ChangeQuickRedirect a;
    public final String b;
    public final long c;
    public final String d;

    public s(String str, long j, String str2) {
        Object[] objArr = {str, new Long(j), str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b3a3e3add4a473fdfba756a724a30a99", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b3a3e3add4a473fdfba756a724a30a99");
            return;
        }
        this.b = str;
        this.c = j;
        this.d = str2;
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aabf1a26af5b3ce82d5836ae14486165", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aabf1a26af5b3ce82d5836ae14486165");
        }
        return "SourceInfo{url='" + this.b + "', length=" + this.c + ", mime='" + this.d + "'}";
    }
}

package com.meituan.android.legwork.utils;

import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.provider.MediaStore;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class aa {
    public static ChangeQuickRedirect a = null;
    public static boolean b = true;
    public a c;
    public Context d;

    public aa(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "81cfe27d3c7d68fa66e9c4a7b8455f51", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "81cfe27d3c7d68fa66e9c4a7b8455f51");
        } else {
            this.d = context;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class a extends ContentObserver {
        public static ChangeQuickRedirect a;

        public a(Handler handler) {
            super(handler);
            Object[] objArr = {handler};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "db1f9f0b7e1bceff6daee770f6b569cf", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "db1f9f0b7e1bceff6daee770f6b569cf");
            }
        }

        @Override // android.database.ContentObserver
        public final void onChange(boolean z, Uri uri) {
            Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), uri};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "529ac8bfe3410ffb9c3175b857270b17", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "529ac8bfe3410ffb9c3175b857270b17");
                return;
            }
            super.onChange(z, uri);
            if (uri == null || !uri.toString().contains(MediaStore.Images.Media.EXTERNAL_CONTENT_URI.toString())) {
                return;
            }
            x.a("screenshot");
        }
    }
}

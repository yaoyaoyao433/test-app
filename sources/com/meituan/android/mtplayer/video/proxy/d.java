package com.meituan.android.mtplayer.video.proxy;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class d {
    public static ChangeQuickRedirect a;
    final File b;
    final File c;
    final com.meituan.android.mtplayer.video.proxy.file.c d;
    final com.meituan.android.mtplayer.video.proxy.file.a e;
    final com.meituan.android.mtplayer.video.proxy.sourcestorage.b f;

    private d(File file, File file2, com.meituan.android.mtplayer.video.proxy.file.c cVar, com.meituan.android.mtplayer.video.proxy.file.a aVar, com.meituan.android.mtplayer.video.proxy.sourcestorage.b bVar) {
        Object[] objArr = {file, file2, cVar, aVar, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc2b63e8fe614a9f5ed4887ad754834a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc2b63e8fe614a9f5ed4887ad754834a");
            return;
        }
        this.b = file;
        this.c = file2;
        this.d = cVar;
        this.e = aVar;
        this.f = bVar;
    }

    public final File a(String str, String str2) {
        String str3;
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1af00a6c5b47ee5ec68b93ea4b9eaf1c", RobustBitConfig.DEFAULT_VALUE)) {
            return (File) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1af00a6c5b47ee5ec68b93ea4b9eaf1c");
        }
        String a2 = this.d.a(str);
        StringBuilder sb = new StringBuilder();
        sb.append(this.b);
        if (TextUtils.isEmpty(str2)) {
            str3 = "";
        } else {
            str3 = File.separator + str2;
        }
        sb.append(str3);
        return new File(sb.toString(), a2);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static final class a {
        public static ChangeQuickRedirect a;
        public File b;
        public File c;
        private com.meituan.android.mtplayer.video.proxy.file.c d;
        private com.meituan.android.mtplayer.video.proxy.file.a e;
        private com.meituan.android.mtplayer.video.proxy.sourcestorage.b f;

        public a(Context context) {
            File a2;
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "73f6550af043bac607a9864cb7014830", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "73f6550af043bac607a9864cb7014830");
                return;
            }
            n.a(context);
            Context applicationContext = context.getApplicationContext();
            Object[] objArr2 = {applicationContext};
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.mtplayer.video.proxy.sourcestorage.c.a;
            File file = null;
            this.f = PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "64c4cd09f62b01377dea25352d410278", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.mtplayer.video.proxy.sourcestorage.b) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "64c4cd09f62b01377dea25352d410278") : com.meituan.android.mtplayer.video.proxy.sourcestorage.a.a(applicationContext.getApplicationContext());
            Object[] objArr3 = {context};
            ChangeQuickRedirect changeQuickRedirect3 = v.a;
            if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "2f42a819d384ce5ab2d6770f5b14e292", RobustBitConfig.DEFAULT_VALUE)) {
                file = (File) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "2f42a819d384ce5ab2d6770f5b14e292");
            } else if (context != null && (a2 = com.meituan.android.cipstorage.q.a(context, "homepage_mtplayer", "", com.meituan.android.cipstorage.u.b)) != null && (a2.exists() || a2.mkdirs())) {
                File file2 = new File(a2, "video-cache");
                if (file2.exists() || file2.mkdir()) {
                    file = file2;
                }
            }
            this.c = file;
            this.b = v.a(context);
            if (this.b == null) {
                this.b = this.c;
            }
            this.e = new com.meituan.android.mtplayer.video.proxy.file.h(134217728L);
            this.d = new com.meituan.android.mtplayer.video.proxy.file.f();
        }

        public final a a(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "287302c88717544873714878153b5da1", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "287302c88717544873714878153b5da1");
            }
            this.e = new com.meituan.android.mtplayer.video.proxy.file.g(i);
            return this;
        }

        public final d a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d40a8ae0f2706a7f90feccb340e28fe6", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d40a8ae0f2706a7f90feccb340e28fe6") : new d(this.b, this.c, this.d, this.e, this.f);
        }
    }
}

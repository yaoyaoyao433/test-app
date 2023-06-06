package com.meituan.android.mtplayer.video.proxy;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.dianping.titans.service.FileUtil;
import com.meituan.metrics.traffic.hurl.HttpURLWrapper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class m {
    public static ChangeQuickRedirect a;
    private static final ExecutorService b = com.sankuai.android.jarvis.c.a("mtplayer_video-predownload", 4);
    private static final List<String> c = Collections.synchronizedList(new ArrayList());

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface b {
        void a(String str);

        void a(String str, int i);

        void a(String str, Exception exc);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface c extends b {
        void a(String str, int i, long j);
    }

    public static void a(k kVar, String str, String str2, @Nullable b bVar, @NonNull d dVar) {
        Object[] objArr = {kVar, str, str2, bVar, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8a6024f889344ff535d52a11184ca004", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8a6024f889344ff535d52a11184ca004");
        } else if (dVar == null) {
        } else {
            if (str2.startsWith("file://")) {
                b(bVar, str, dVar);
            } else if (c.contains(str)) {
            } else {
                c.add(str);
                b.submit(new a(kVar, str, str2, bVar, dVar));
            }
        }
    }

    public static void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0cd955bf346863a1ed73ee9298298176", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0cd955bf346863a1ed73ee9298298176");
        } else if (c.contains(str)) {
            com.meituan.android.mtplayer.video.utils.c.b("PreDownload", "stop pre download");
            c.remove(str);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    static class a implements com.meituan.android.mtplayer.video.proxy.b, Runnable {
        public static ChangeQuickRedirect a;
        private final k b;
        private final String c;
        private final String d;
        private final WeakReference<b> e;
        private final d f;
        private boolean g;

        private a(k kVar, String str, String str2, b bVar, @NonNull d dVar) {
            Object[] objArr = {kVar, str, str2, bVar, dVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d5932a59ec33cb8458a4549ac4f27ec5", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d5932a59ec33cb8458a4549ac4f27ec5");
                return;
            }
            this.b = kVar;
            this.c = str;
            this.d = str2;
            this.e = new WeakReference<>(bVar);
            this.f = dVar;
            this.g = false;
        }

        @Override // com.meituan.android.mtplayer.video.proxy.b
        public final void a(String str, int i, long j) {
            Object[] objArr = {str, Integer.valueOf(i), new Long(j)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "23e594722ef4164c3fb061258218f3ed", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "23e594722ef4164c3fb061258218f3ed");
            } else if (this.f != null) {
                com.meituan.android.mtplayer.video.utils.c.b("PreDownload", "pre download cache percent:" + i + "%，cache size：" + j);
                if (this.f.b <= 0 || i < this.f.b) {
                    if (this.f.c <= 0) {
                        return;
                    }
                    if (j < this.f.c && i < 100) {
                        return;
                    }
                }
                this.g = true;
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            InputStream inputStream;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "70058e13500d6474bf2b0b9a5385ded1", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "70058e13500d6474bf2b0b9a5385ded1");
                return;
            }
            this.b.a(this);
            InputStream inputStream2 = null;
            try {
                try {
                    try {
                        inputStream = HttpURLWrapper.wrapOpenStream(new URL(this.d));
                    } catch (Throwable th) {
                        th = th;
                        inputStream = null;
                    }
                } catch (Exception e) {
                    e = e;
                }
            } catch (IOException unused) {
            }
            try {
                byte[] bArr = new byte[FileUtil.DEFAULT_STREAM_BUFFER_SIZE];
                while (inputStream.read(bArr, 0, FileUtil.DEFAULT_STREAM_BUFFER_SIZE) != -1 && !this.g && m.c.contains(this.c)) {
                }
                b bVar = this.e.get();
                if (bVar != null) {
                    if (m.c.contains(this.c)) {
                        m.b(bVar, this.c, this.f);
                    } else {
                        bVar.a(this.c);
                    }
                }
            } catch (Exception e2) {
                e = e2;
                inputStream2 = inputStream;
                b bVar2 = this.e.get();
                if (bVar2 != null) {
                    bVar2.a(this.c, e);
                }
                if (inputStream2 != null) {
                    inputStream2.close();
                }
                m.c.remove(this.c);
                this.b.b(this);
            } catch (Throwable th2) {
                th = th2;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused2) {
                    }
                }
                m.c.remove(this.c);
                this.b.b(this);
                throw th;
            }
            if (inputStream != null) {
                inputStream.close();
            }
            m.c.remove(this.c);
            this.b.b(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(@Nullable b bVar, String str, @NonNull d dVar) {
        Object[] objArr = {bVar, str, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bd8c924b05df7c065576fdec0a92f096", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bd8c924b05df7c065576fdec0a92f096");
        } else if (dVar != null) {
            if (bVar instanceof c) {
                ((c) bVar).a(str, dVar.b, dVar.c);
            } else if (bVar instanceof b) {
                bVar.a(str, dVar.b);
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class d {
        public static ChangeQuickRedirect a;
        final int b;
        final long c;

        private d(int i, long j) {
            Object[] objArr = {Integer.valueOf(i), new Long(j)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d123f31021b58d0c148953d4b91ac4a6", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d123f31021b58d0c148953d4b91ac4a6");
                return;
            }
            this.b = i;
            this.c = j;
        }

        public static d a(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "af6b1bc8dc233825e905f0443aff796f", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "af6b1bc8dc233825e905f0443aff796f") : new d(i, -1L);
        }

        public static d a(long j) {
            Object[] objArr = {new Long(j)};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "77ba76627bbe3a1d42b81378eb8f7936", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "77ba76627bbe3a1d42b81378eb8f7936") : new d(-1, j);
        }
    }
}

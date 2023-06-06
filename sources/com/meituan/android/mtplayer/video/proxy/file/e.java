package com.meituan.android.mtplayer.video.proxy.file;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class e implements com.meituan.android.mtplayer.video.proxy.file.a {
    public static ChangeQuickRedirect a;
    private final ExecutorService b;

    public abstract boolean a(File file, long j, int i);

    public e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "993202f8a8a61f42371b5ba9b1fb6a95", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "993202f8a8a61f42371b5ba9b1fb6a95");
        } else {
            this.b = com.sankuai.android.jarvis.c.a("mtplayer_video-cacheLruDisk");
        }
    }

    @Override // com.meituan.android.mtplayer.video.proxy.file.a
    public final void a(File file) {
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "38e209c36780e0687243e123736dcd42", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "38e209c36780e0687243e123736dcd42");
        } else {
            this.b.submit(new a(file));
        }
    }

    void a(List<File> list) {
        long j;
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eec651ca6562852ecf75ea309d0a3600", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eec651ca6562852ecf75ea309d0a3600");
            return;
        }
        Object[] objArr2 = {list};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cc85a230bc704a22ffaef5701caa2d0f", RobustBitConfig.DEFAULT_VALUE)) {
            j = ((Long) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cc85a230bc704a22ffaef5701caa2d0f")).longValue();
        } else {
            j = 0;
            for (File file : list) {
                j += file.length();
            }
        }
        int size = list.size();
        for (File file2 : list) {
            if (!a(file2, j, size)) {
                long length = file2.length();
                if (file2.delete()) {
                    size--;
                    j -= length;
                    com.meituan.android.mtplayer.video.utils.c.a("Proxy", "Cache file " + file2 + " is deleted because it exceeds cache limit");
                } else {
                    com.meituan.android.mtplayer.video.utils.c.c("Proxy", "Error deleting file " + file2 + " for trimming cache");
                }
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public class a implements Callable<Void> {
        public static ChangeQuickRedirect a;
        private final File c;

        public a(File file) {
            Object[] objArr = {e.this, file};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4853b21f212991f4eb93a21d33a1a8c2", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4853b21f212991f4eb93a21d33a1a8c2");
            } else {
                this.c = file;
            }
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
            	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
            	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
            */
        /* JADX INFO: Access modifiers changed from: private */
        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public java.lang.Void call() throws java.lang.Exception {
            /*
                Method dump skipped, instructions count: 363
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.mtplayer.video.proxy.file.e.a.call():java.lang.Void");
        }
    }
}

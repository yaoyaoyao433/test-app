package com.facebook.soloader;

import android.content.Context;
import com.facebook.soloader.l;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class d extends l {
    public d(Context context, String str) {
        super(context, str);
    }

    @Override // com.facebook.soloader.l
    protected final l.e a() throws IOException {
        return new a(this, this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public final class a extends l.e {
        final b[] a;
        final /* synthetic */ d b;

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
            	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
            	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
            */
        a(com.facebook.soloader.d r18, com.facebook.soloader.l r19) throws java.io.IOException {
            /*
                Method dump skipped, instructions count: 310
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.d.a.<init>(com.facebook.soloader.d, com.facebook.soloader.l):void");
        }

        @Override // com.facebook.soloader.l.e
        protected final l.b a() throws IOException {
            return new l.b(this.a);
        }

        @Override // com.facebook.soloader.l.e
        protected final l.d b() throws IOException {
            return new C0154a();
        }

        /* compiled from: ProGuard */
        /* renamed from: com.facebook.soloader.d$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public final class C0154a extends l.d {
            private int b;

            private C0154a() {
            }

            @Override // com.facebook.soloader.l.d
            public final boolean a() {
                return this.b < a.this.a.length;
            }

            @Override // com.facebook.soloader.l.d
            public final l.c b() throws IOException {
                b[] bVarArr = a.this.a;
                int i = this.b;
                this.b = i + 1;
                b bVar = bVarArr[i];
                FileInputStream fileInputStream = new FileInputStream(bVar.a);
                try {
                    return new l.c(bVar, fileInputStream);
                } catch (Throwable th) {
                    fileInputStream.close();
                    throw th;
                }
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    static final class b extends l.a {
        final File a;

        b(String str, String str2, File file) {
            super(str, str2);
            this.a = file;
        }
    }
}

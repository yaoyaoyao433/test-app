package com.sankuai.waimai.order.confirm.image.upload;

import android.annotation.SuppressLint;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import org.apache.http.HttpEntity;
import org.apache.http.entity.HttpEntityWrapper;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c extends HttpEntityWrapper {
    public static ChangeQuickRedirect a;
    private final long b;
    private final b c;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface b {
        void a(long j, long j2);
    }

    public final void writeTo(OutputStream outputStream) throws IOException {
        Object[] objArr = {outputStream};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "90dbe4ba20660e3a12b459b56f0dc014", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "90dbe4ba20660e3a12b459b56f0dc014");
            return;
        }
        HttpEntity httpEntity = this.wrappedEntity;
        if (!(outputStream instanceof a)) {
            outputStream = new a(outputStream, this.b, this.c);
        }
        httpEntity.writeTo(outputStream);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a extends FilterOutputStream {
        public static ChangeQuickRedirect a;
        private final b b;
        private final long c;
        private long d;

        public a(OutputStream outputStream, long j, b bVar) {
            super(outputStream);
            Object[] objArr = {outputStream, new Long(j), bVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e64796a3353c645f76f67e5e2ee80f6b", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e64796a3353c645f76f67e5e2ee80f6b");
                return;
            }
            this.c = j;
            this.b = bVar;
            this.d = 0L;
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        @SuppressLint({"DefaultLocale"})
        public final void write(@NonNull byte[] bArr, int i, int i2) throws IOException {
            Object[] objArr = {bArr, Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7294fe7358cd08d1f1143aea338ac83a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7294fe7358cd08d1f1143aea338ac83a");
                return;
            }
            String.format("upload bytes: transferred = %d, offset = %d, length = %d", Long.valueOf(this.d), Integer.valueOf(i), Integer.valueOf(i2));
            int i3 = i;
            while (i3 < i2) {
                int min = Math.min(1024, i2 - i3);
                String.format("upload block: transferred = %d, offset = %d, length = %d", Long.valueOf(this.d), Integer.valueOf(i3), Integer.valueOf(min));
                this.out.write(bArr, i3, min);
                i3 += min;
                this.d += min;
                this.b.a(this.d, this.c);
            }
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        @SuppressLint({"DefaultLocale"})
        public final void write(int i) throws IOException {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dcb8884bd3c2c479e6f0b8787e9de7bb", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dcb8884bd3c2c479e6f0b8787e9de7bb");
                return;
            }
            String.format("upload one byte: transferred = %d", Long.valueOf(this.d));
            this.out.write(i);
            this.d++;
            this.b.a(this.d, this.c);
        }
    }
}

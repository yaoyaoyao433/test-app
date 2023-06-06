package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.resource.bitmap.a;
import java.io.IOException;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class h implements com.bumptech.glide.load.e<ParcelFileDescriptor, Bitmap> {
    private final s a;
    private final com.bumptech.glide.load.engine.bitmap_recycle.c b;
    private com.bumptech.glide.load.a c;

    @Override // com.bumptech.glide.load.e
    public final String a() {
        return "FileDescriptorBitmapDecoder.com.bumptech.glide.load.data.bitmap";
    }

    @Override // com.bumptech.glide.load.e
    public final /* synthetic */ com.bumptech.glide.load.engine.l<Bitmap> a(ParcelFileDescriptor parcelFileDescriptor, int i, int i2) throws IOException {
        Bitmap frameAtTime;
        ParcelFileDescriptor parcelFileDescriptor2 = parcelFileDescriptor;
        s sVar = this.a;
        com.bumptech.glide.load.engine.bitmap_recycle.c cVar = this.b;
        com.bumptech.glide.load.a aVar = this.c;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        mediaMetadataRetriever.setDataSource(parcelFileDescriptor2.getFileDescriptor());
        if (sVar.a >= 0) {
            frameAtTime = mediaMetadataRetriever.getFrameAtTime(sVar.a);
        } else {
            frameAtTime = mediaMetadataRetriever.getFrameAtTime();
        }
        mediaMetadataRetriever.release();
        parcelFileDescriptor2.close();
        a.C0044a c0044a = new a.C0044a(frameAtTime, null);
        return c.a(c0044a.a, c0044a.b, this.b);
    }

    public h(com.bumptech.glide.load.engine.bitmap_recycle.c cVar, com.bumptech.glide.load.a aVar) {
        this(new s(), cVar, aVar);
    }

    public h(s sVar, com.bumptech.glide.load.engine.bitmap_recycle.c cVar, com.bumptech.glide.load.a aVar) {
        this.a = sVar;
        this.b = cVar;
        this.c = aVar;
    }
}

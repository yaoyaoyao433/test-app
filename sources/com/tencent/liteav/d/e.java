package com.tencent.liteav.d;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.List;
/* compiled from: ProGuard */
@TargetApi(16)
/* loaded from: classes6.dex */
public class e implements Serializable {
    private int audioBitRate;
    private List bitmapList;
    private float blurLevel;
    private int bufferIndex;
    private MediaCodec.BufferInfo bufferInfo;
    private ByteBuffer byteBuffer;
    private int channelCount;
    private int frameFormat;
    private int frameRate;
    private int height;
    private float mCropOffsetRatio;
    private String mime;
    private long originSampleTime;
    private long reverseSampleTime;
    private int rotation;
    private int sampleRate;
    private long speedSampleTime;
    private boolean tailFrame;
    private int textureId;
    private int trackId;
    private int width;

    public String toString() {
        return "";
    }

    public e() {
        this.bufferInfo = new MediaCodec.BufferInfo();
        this.frameFormat = 4;
    }

    public e(ByteBuffer byteBuffer, int i, long j, int i2, int i3, int i4) {
        this.bufferInfo = new MediaCodec.BufferInfo();
        this.frameFormat = 4;
        this.byteBuffer = byteBuffer;
        this.trackId = i4;
        this.bufferInfo.flags = i3;
        this.bufferInfo.presentationTimeUs = j;
        this.bufferIndex = i2;
        this.bufferInfo.size = i;
    }

    public e(String str, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        this.bufferInfo = new MediaCodec.BufferInfo();
        this.frameFormat = 4;
        this.mime = str;
        this.byteBuffer = byteBuffer;
        this.bufferInfo = new MediaCodec.BufferInfo();
        this.bufferInfo.set(bufferInfo.offset, bufferInfo.size, bufferInfo.presentationTimeUs, bufferInfo.flags);
    }

    public String a() {
        return this.mime;
    }

    public void a(String str) {
        this.mime = str;
    }

    public ByteBuffer b() {
        return this.byteBuffer;
    }

    public int c() {
        return this.trackId;
    }

    public int d() {
        return this.bufferIndex;
    }

    public void a(ByteBuffer byteBuffer) {
        this.byteBuffer = byteBuffer;
    }

    public void a(int i) {
        this.trackId = i;
    }

    public void b(int i) {
        this.bufferIndex = i;
    }

    public void a(long j) {
        this.bufferInfo.presentationTimeUs = j;
    }

    public long e() {
        return this.bufferInfo.presentationTimeUs;
    }

    public void c(int i) {
        this.bufferInfo.flags = i;
    }

    public void d(int i) {
        this.bufferInfo.size = i;
    }

    public int f() {
        return this.bufferInfo.flags;
    }

    public int g() {
        return this.bufferInfo.size;
    }

    public int h() {
        return this.rotation;
    }

    public void e(int i) {
        this.rotation = i;
    }

    public int i() {
        return this.frameRate;
    }

    public void f(int i) {
        this.frameRate = i;
    }

    public int j() {
        return this.sampleRate;
    }

    public void g(int i) {
        this.sampleRate = i;
    }

    public int k() {
        return this.channelCount;
    }

    public void h(int i) {
        this.channelCount = i;
    }

    public int l() {
        return this.audioBitRate;
    }

    public void i(int i) {
        this.audioBitRate = i;
    }

    public int m() {
        return this.width;
    }

    public void j(int i) {
        this.width = i;
    }

    public int n() {
        return this.height;
    }

    public void k(int i) {
        this.height = i;
    }

    public MediaCodec.BufferInfo o() {
        return this.bufferInfo;
    }

    public boolean p() {
        return (f() & 4) != 0;
    }

    public boolean q() {
        return g() == 0 || f() == 2;
    }

    public boolean r() {
        return this.tailFrame;
    }

    public void a(boolean z) {
        this.tailFrame = z;
    }

    public void a(float f) {
        this.blurLevel = f;
    }

    public float s() {
        return this.blurLevel;
    }

    public void b(long j) {
        this.speedSampleTime = j;
    }

    public long t() {
        return this.speedSampleTime;
    }

    public long u() {
        return this.reverseSampleTime;
    }

    public void c(long j) {
        this.reverseSampleTime = j;
    }

    public long v() {
        return this.originSampleTime;
    }

    public void d(long j) {
        this.originSampleTime = j;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0010  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List w() {
        /*
            r2 = this;
            java.util.List r0 = r2.bitmapList
            if (r0 == 0) goto L20
            java.util.List r0 = r2.bitmapList
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L20
            java.lang.Object r1 = r0.next()
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            if (r1 == 0) goto L1e
            boolean r1 = r1.isRecycled()
            if (r1 == 0) goto La
        L1e:
            r0 = 0
            return r0
        L20:
            java.util.List r0 = r2.bitmapList
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.d.e.w():java.util.List");
    }

    public void a(List list) {
        this.bitmapList = list;
    }

    public int x() {
        return this.textureId;
    }

    public void l(int i) {
        this.textureId = i;
    }

    public int y() {
        return this.frameFormat;
    }

    public void m(int i) {
        this.frameFormat = i;
    }
}

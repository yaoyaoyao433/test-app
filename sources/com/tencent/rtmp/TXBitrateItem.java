package com.tencent.rtmp;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class TXBitrateItem implements Comparable<TXBitrateItem> {
    public int bitrate;
    public int height;
    public int index;
    public int width;

    @Override // java.lang.Comparable
    public int compareTo(TXBitrateItem tXBitrateItem) {
        return this.bitrate - tXBitrateItem.bitrate;
    }
}

package com.tencent.liteav.basic.structs;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class a implements Cloneable {
    public byte[] audioData;
    public int audioType;
    public int bitsPerChannel;
    public int channelsPerSample;
    public int codecFormat;
    public int packetType;
    public int sampleRate;
    public long sequenceNum;
    public long timestamp;
    public long timestampInSample;

    public Object clone() {
        try {
            return (a) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}

package com.tencent.liteav.b;

import android.media.MediaFormat;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.videoediter.audio.TXSkpResample;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class a {
    private int b;
    private int c;
    private ArrayList<Float> a = new ArrayList<>();
    private ArrayList<MediaFormat> d = new ArrayList<>();
    private ArrayList<com.tencent.liteav.videoediter.audio.e> e = new ArrayList<>();
    private ArrayList<TXSkpResample> f = new ArrayList<>();
    private ArrayList<short[]> g = new ArrayList<>();
    private volatile boolean h = false;

    public void a(int i, int i2) {
        this.b = i;
        this.c = i2;
    }

    public void a(MediaFormat mediaFormat, int i) {
        this.d.add(i, mediaFormat);
        if (!this.h) {
            this.a.add(i, Float.valueOf(1.0f));
        }
        this.g.add(i, null);
    }

    public void a(List<Float> list) {
        if (list == null) {
            TXCLog.i("CombineAudioMixer", "setVideoVolumes volumes is null !");
            return;
        }
        this.h = true;
        if (this.a.size() == 0) {
            Iterator<Float> it = list.iterator();
            while (it.hasNext()) {
                Float next = it.next();
                if (next.floatValue() < 0.0f) {
                    next = Float.valueOf(0.0f);
                }
                if (next.floatValue() > 1.0f) {
                    next = Float.valueOf(1.0f);
                }
                this.a.add(next);
            }
        } else if (this.a.size() != list.size()) {
            TXCLog.i("CombineAudioMixer", "setVideoVolumes size not match!");
        } else {
            for (int i = 0; i < list.size(); i++) {
                Float f = list.get(i);
                if (f.floatValue() < 0.0f) {
                    f = Float.valueOf(0.0f);
                }
                if (f.floatValue() > 1.0f) {
                    f = Float.valueOf(1.0f);
                }
                this.a.set(i, f);
            }
        }
    }

    private boolean c() {
        if (this.d == null || this.d.size() == 0) {
            return false;
        }
        for (int i = 0; i < this.d.size(); i++) {
            if (this.d.get(i) != null) {
                return true;
            }
        }
        return false;
    }

    public void a() {
        if (!c()) {
            TXCLog.e("CombineAudioMixer", "not have audio format :");
        } else if (this.b == 0) {
            TXCLog.e("CombineAudioMixer", "Target Audio SampleRate is not set!!!");
        } else {
            for (int i = 0; i < this.d.size(); i++) {
                MediaFormat mediaFormat = this.d.get(i);
                if (mediaFormat != null) {
                    if (mediaFormat.containsKey("channel-count")) {
                        int integer = mediaFormat.getInteger("channel-count");
                        if (integer != 1) {
                            com.tencent.liteav.videoediter.audio.e eVar = new com.tencent.liteav.videoediter.audio.e();
                            eVar.a(integer, 1);
                            this.e.add(i, eVar);
                        } else {
                            this.e.add(i, null);
                        }
                    }
                    if (mediaFormat.containsKey("sample-rate")) {
                        int integer2 = mediaFormat.getInteger("sample-rate");
                        if (integer2 != this.b) {
                            TXSkpResample tXSkpResample = new TXSkpResample();
                            tXSkpResample.init(integer2, this.b);
                            this.f.add(i, tXSkpResample);
                        } else {
                            this.f.add(i, null);
                        }
                    }
                } else {
                    this.f.add(i, null);
                }
            }
        }
    }

    public void b(int i, int i2) {
        if (i != this.b) {
            TXSkpResample tXSkpResample = this.f.get(i2);
            if (tXSkpResample == null) {
                tXSkpResample = new TXSkpResample();
                this.f.set(i2, tXSkpResample);
            }
            tXSkpResample.init(i, this.b);
        }
    }

    public void b() {
        this.g.clear();
    }

    public com.tencent.liteav.d.e a(ArrayList<com.tencent.liteav.d.e> arrayList) {
        ArrayList<short[]> arrayList2 = new ArrayList<>();
        int i = 0;
        boolean z = true;
        int i2 = -1;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            short[] sArr = this.g.get(i3);
            com.tencent.liteav.d.e eVar = arrayList.get(i3);
            if (eVar != null) {
                short[] a = com.tencent.liteav.videoediter.audio.b.a(eVar.b(), eVar.g());
                com.tencent.liteav.videoediter.audio.e eVar2 = this.e.get(i3);
                if (eVar2 != null) {
                    a = eVar2.a(a);
                }
                TXSkpResample tXSkpResample = this.f.get(i3);
                if (tXSkpResample != null) {
                    a = tXSkpResample.doResample(a);
                }
                if (a != null) {
                    arrayList2.add(i3, a(sArr, a));
                } else {
                    arrayList2.add(i3, sArr);
                }
            } else {
                arrayList2.add(i3, sArr);
            }
            short[] sArr2 = arrayList2.get(i3);
            if (z) {
                if (i2 == -1) {
                    i2 = sArr2 == null ? 0 : sArr2.length;
                } else if ((sArr2 == null ? 0 : sArr2.length) != i2) {
                    z = false;
                }
            }
        }
        for (int i4 = 0; i4 < arrayList2.size(); i4++) {
            short[] sArr3 = arrayList2.get(i4);
            if (sArr3 == null || sArr3.length == 0) {
                TXCLog.i("CombineAudioMixer", "one row reach end " + i4);
                return null;
            }
        }
        if (z) {
            short[] b = b(arrayList2);
            for (int i5 = 0; i5 < arrayList2.size(); i5++) {
                this.g.set(i5, null);
            }
            ByteBuffer a2 = com.tencent.liteav.videoediter.audio.b.a(b);
            com.tencent.liteav.d.e eVar3 = arrayList.get(this.c);
            while (i < arrayList.size() && eVar3 == null) {
                TXCLog.d("CombineAudioMixer", "AUDIO PTS " + i);
                eVar3 = arrayList.get(i);
                i++;
            }
            eVar3.a(a2);
            eVar3.d(b.length * 2);
            return eVar3;
        }
        short[] b2 = b(arrayList2);
        for (int i6 = 0; i6 < arrayList2.size(); i6++) {
            short[] sArr4 = arrayList2.get(i6);
            if (sArr4 != null) {
                this.g.set(i6, a(sArr4, b2.length, sArr4.length - b2.length));
            } else {
                this.g.set(i6, null);
            }
        }
        com.tencent.liteav.d.e eVar4 = arrayList.get(this.c);
        while (i < arrayList.size() && eVar4 == null) {
            TXCLog.d("CombineAudioMixer", "AUDIO PTS ss " + i);
            eVar4 = arrayList.get(i);
            i++;
        }
        eVar4.a(com.tencent.liteav.videoediter.audio.b.a(b2));
        eVar4.d(b2.length * 2);
        return eVar4;
    }

    private short[] a(short[] sArr, short[] sArr2) {
        if (sArr == null || sArr.length == 0) {
            return sArr2;
        }
        short[] sArr3 = new short[sArr.length + sArr2.length];
        System.arraycopy(sArr, 0, sArr3, 0, sArr.length);
        System.arraycopy(sArr2, 0, sArr3, sArr.length, sArr2.length);
        return sArr3;
    }

    private short[] a(short[] sArr, int i, int i2) {
        short[] sArr2 = new short[i2];
        System.arraycopy(sArr, i, sArr2, 0, i2);
        return sArr2;
    }

    private short[] b(ArrayList<short[]> arrayList) {
        short[] sArr;
        short[] sArr2 = null;
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            short[] sArr3 = arrayList.get(i2);
            if (sArr3 != null && sArr3.length < i) {
                i = sArr3.length;
                sArr2 = sArr3;
            }
        }
        for (int i3 = 0; i3 < i; i3++) {
            float f = 0.0f;
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                if (arrayList.get(i4) != null) {
                    f += sArr[i3] * this.a.get(i4).floatValue();
                }
            }
            int i5 = (int) f;
            short s = Short.MIN_VALUE;
            if (i5 > 32767) {
                s = Short.MAX_VALUE;
            } else if (i5 >= -32768) {
                s = (short) i5;
            }
            sArr2[i3] = s;
        }
        return sArr2;
    }
}

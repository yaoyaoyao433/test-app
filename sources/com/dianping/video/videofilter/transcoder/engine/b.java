package com.dianping.video.videofilter.transcoder.engine;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ShortBuffer;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class b {
    public static ChangeQuickRedirect a;
    float b;
    float c;
    FileInputStream d;
    a e;
    private String f;
    private byte[] g;
    private short[] h;

    private short a(short s, float f, short s2, float f2) {
        Object[] objArr = {Short.valueOf(s), Float.valueOf(f), Short.valueOf(s2), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c1b295fa5ba4838413e75e57f43fee02", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Short) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c1b295fa5ba4838413e75e57f43fee02")).shortValue();
        }
        if (f > 1.0f) {
            if (s > 0) {
                float f3 = s;
                if ((((f - 1.0f) * f3) - 32767.0f) + f3 > 0.0f) {
                    return Short.MAX_VALUE;
                }
            }
            if (s < 0) {
                float f4 = s;
                if ((((f - 1.0f) * f4) - (-32768.0f)) + f4 < 0.0f) {
                    return Short.MIN_VALUE;
                }
            }
        }
        if (f2 > 1.0f) {
            if (s2 > 0) {
                float f5 = s2;
                if ((((f2 - 1.0f) * f5) - 32767.0f) + f5 > 0.0f) {
                    return Short.MAX_VALUE;
                }
            }
            if (s2 < 0) {
                float f6 = s2;
                if ((((f2 - 1.0f) * f6) - (-32768.0f)) + f6 < 0.0f) {
                    return Short.MIN_VALUE;
                }
            }
        }
        if (s <= 0 || s2 <= 0 || (32767.0f - (s * f)) - (s2 * f2) >= 0.0f) {
            if (s >= 0 || s2 >= 0 || ((-32768.0f) - (s * f)) - (s2 * f2) <= 0.0f) {
                return (short) ((s * f) + (s2 * f2));
            }
            return Short.MIN_VALUE;
        }
        return Short.MAX_VALUE;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public enum a {
        CLEARAUDIO,
        ADDBGM,
        REPLACE;
        
        public static ChangeQuickRedirect a;

        a() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e3167bd64e72688af72fd1fb778b4f4", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e3167bd64e72688af72fd1fb778b4f4");
            }
        }

        public static a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "be0f16cb329da5cfacc5e472a9bfa88f", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "be0f16cb329da5cfacc5e472a9bfa88f") : (a) Enum.valueOf(a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "681174a5fa587624d7b73697f5a82c4d", RobustBitConfig.DEFAULT_VALUE) ? (a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "681174a5fa587624d7b73697f5a82c4d") : (a[]) values().clone();
        }
    }

    public b(String str, a aVar) {
        Object[] objArr = {str, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c750a84abe5f0e41160abe527e60f01b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c750a84abe5f0e41160abe527e60f01b");
            return;
        }
        this.b = 1.5f;
        this.c = 0.5f;
        this.f = str;
        this.e = aVar;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            this.d = new FileInputStream(str);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            com.dianping.video.log.c.a().a(b.class, com.dianping.util.exception.a.a(e));
        }
    }

    public final void a(ShortBuffer shortBuffer) {
        Object[] objArr = {shortBuffer};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f5e323d7dcb14d8ebb854337924eebc0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f5e323d7dcb14d8ebb854337924eebc0");
        } else if (this.e == a.CLEARAUDIO) {
            c(shortBuffer);
        } else if (this.e == a.ADDBGM) {
            b(shortBuffer);
        } else if (this.e == a.REPLACE) {
            d(shortBuffer);
        }
    }

    private void b(ShortBuffer shortBuffer) {
        Object[] objArr = {shortBuffer};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "772d42376c7af044f39902b74481754b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "772d42376c7af044f39902b74481754b");
        } else if (this.d != null && shortBuffer != null) {
            if (this.g == null) {
                this.g = new byte[shortBuffer.capacity() * 2];
            }
            if (this.h == null) {
                this.h = new short[shortBuffer.capacity()];
            }
            shortBuffer.flip();
            int limit = shortBuffer.limit();
            shortBuffer.get(this.h, 0, limit);
            try {
                int i = limit * 2;
                int read = this.d.read(this.g, 0, i);
                if (read < 0) {
                    this.d.close();
                    this.d = new FileInputStream(this.f);
                    read = this.d.read(this.g, 0, i);
                }
                for (int i2 = 0; i2 < read / 2; i2++) {
                    int i3 = i2 * 2;
                    this.h[i2] = a(this.h[i2], this.b, com.dianping.video.util.b.a(this.g[i3], this.g[i3 + 1], com.dianping.video.audio.a.a), this.c);
                }
                shortBuffer.clear();
                shortBuffer.put(this.h, 0, limit);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void c(ShortBuffer shortBuffer) {
        Object[] objArr = {shortBuffer};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c4ee3b8473b1e49491ef75d808034549", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c4ee3b8473b1e49491ef75d808034549");
        } else if (shortBuffer == null) {
        } else {
            if (this.h == null) {
                this.h = new short[shortBuffer.capacity()];
            }
            int position = shortBuffer.position();
            shortBuffer.clear();
            shortBuffer.put(this.h, 0, position);
        }
    }

    private void d(ShortBuffer shortBuffer) {
        Object[] objArr = {shortBuffer};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e6c420f7d2852998e48fed66814501ee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e6c420f7d2852998e48fed66814501ee");
        } else if (shortBuffer != null && this.d != null) {
            if (this.g == null) {
                this.g = new byte[shortBuffer.capacity() * 2];
            }
            if (this.h == null) {
                this.h = new short[shortBuffer.capacity()];
            }
            shortBuffer.flip();
            shortBuffer.get(this.h, 0, shortBuffer.limit());
            int limit = shortBuffer.limit();
            try {
                int read = this.d.read(this.g, 0, shortBuffer.limit() * 2);
                if (read < 0) {
                    this.d.close();
                    this.d = new FileInputStream(this.f);
                    read = this.d.read(this.g, 0, shortBuffer.limit() * 2);
                }
                for (int i = 0; i < read / 2; i++) {
                    int i2 = i * 2;
                    this.h[i] = com.dianping.video.util.b.a(this.g[i2], this.g[i2 + 1], com.dianping.video.audio.a.a);
                }
                shortBuffer.clear();
                shortBuffer.put(this.h, 0, limit);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

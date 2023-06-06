package com.dianping.imagemanager.utils.downloadphoto;

import android.graphics.Bitmap;
import android.text.TextUtils;
import com.dianping.imagemanager.utils.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class d {
    public static ChangeQuickRedirect a;
    public int b;
    public float c;
    public int d;
    public int e;
    public int f;
    public int g;
    public boolean h;
    public int i;
    public long j;
    public String k;
    public Bitmap l;
    public com.dianping.imagemanager.animated.b m;
    public byte[] n;
    public int o;
    public i.a p;
    public long q;

    public d(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec16efa35ac548158de0a565f6fd7c41", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec16efa35ac548158de0a565f6fd7c41");
            return;
        }
        this.o = -1;
        this.p = i.a.UNKNOWN;
        this.i = i;
        this.h = false;
    }

    public d(boolean z, int i) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "48831126025f9aed73ab649ed50ae321", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "48831126025f9aed73ab649ed50ae321");
            return;
        }
        this.o = -1;
        this.p = i.a.UNKNOWN;
        this.h = z;
        if (z) {
            this.b = i;
        } else {
            this.i = i;
        }
    }

    @Deprecated
    public final Object a() {
        if (this.b == 0 || this.b == -1) {
            return this.l;
        }
        if (this.b == 1 || this.b == 2) {
            return this.n;
        }
        return this.k;
    }

    public final d a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "11f8cd8e4c6f7860a802328ab060c594", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "11f8cd8e4c6f7860a802328ab060c594");
        }
        this.k = str;
        if (!TextUtils.isEmpty(str)) {
            File file = new File(str);
            if (file.exists() && file.isFile()) {
                this.j = file.length();
            }
        }
        return this;
    }

    public final d a(Bitmap bitmap) {
        Object[] objArr = {bitmap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8438bc98295ba5f203732f6d64c7eff1", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8438bc98295ba5f203732f6d64c7eff1");
        }
        this.l = bitmap;
        if (bitmap != null) {
            this.d = bitmap.getWidth();
            this.e = bitmap.getHeight();
        }
        return this;
    }

    public final d a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0266c507423dded19616fe58c5b1b64f", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0266c507423dded19616fe58c5b1b64f");
        }
        this.q = j;
        return this;
    }
}

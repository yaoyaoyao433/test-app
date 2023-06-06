package com.squareup.picasso.progressive;

import java.lang.reflect.Field;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class b {
    private Field a;
    private Class b;
    private Field c;
    private Field d;
    private Field e;
    private Field f;

    public b() {
        try {
            this.a = okio.c.class.getDeclaredField("a");
            this.a.setAccessible(true);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        if (this.a == null) {
            return;
        }
        try {
            this.b = Class.forName("okio.Segment");
        } catch (ClassNotFoundException e2) {
            e2.printStackTrace();
        }
        if (this.b == null) {
            return;
        }
        try {
            this.c = this.b.getDeclaredField("data");
            this.d = this.b.getDeclaredField("pos");
            this.e = this.b.getDeclaredField("limit");
            this.f = this.b.getDeclaredField("next");
            this.c.setAccessible(true);
            this.d.setAccessible(true);
            this.e.setAccessible(true);
            this.f.setAccessible(true);
        } catch (NoSuchFieldException e3) {
            e3.printStackTrace();
        }
    }

    public final j a(okio.c cVar) {
        Object obj;
        byte[] bArr;
        int i;
        int i2;
        if (this.c == null || this.d == null || this.e == null || this.f == null || cVar == null) {
            return null;
        }
        try {
            obj = this.a.get(cVar);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            obj = null;
        }
        if (obj != null && this.b.isInstance(obj)) {
            try {
                bArr = (byte[]) this.c.get(obj);
                int i3 = this.e.getInt(obj);
                i = this.d.getInt(obj);
                i2 = i3 - i;
            } catch (IllegalAccessException unused) {
                bArr = null;
                i = 0;
                i2 = 0;
            }
            if (bArr == null || i2 <= 0) {
                return null;
            }
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, i, bArr2, 0, i2);
            return new j(bArr2, i2);
        }
        return null;
    }
}

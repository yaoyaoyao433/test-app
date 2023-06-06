package com.sankuai.meituan.mapsdk.core.render.egl;

import android.opengl.GLSurfaceView;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Collections;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLDisplay;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a implements GLSurfaceView.EGLConfigChooser {
    public static ChangeQuickRedirect a;
    private boolean b;

    public a(boolean z) {
        Object[] objArr = {(byte) 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7bd22d0b3274f282820f81866a827a86", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7bd22d0b3274f282820f81866a827a86");
        } else {
            this.b = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x025e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0243  */
    @Override // android.opengl.GLSurfaceView.EGLConfigChooser
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final javax.microedition.khronos.egl.EGLConfig chooseConfig(javax.microedition.khronos.egl.EGL10 r24, javax.microedition.khronos.egl.EGLDisplay r25) {
        /*
            Method dump skipped, instructions count: 745
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.meituan.mapsdk.core.render.egl.a.chooseConfig(javax.microedition.khronos.egl.EGL10, javax.microedition.khronos.egl.EGLDisplay):javax.microedition.khronos.egl.EGLConfig");
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.meituan.mapsdk.core.render.egl.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public class C0605a implements Comparable<C0605a> {
        public static ChangeQuickRedirect a;
        private final b c;
        private final c d;
        private final boolean e;
        private final boolean f;
        private final int g;
        private final EGLConfig h;

        @Override // java.lang.Comparable
        public final /* synthetic */ int compareTo(@NonNull C0605a c0605a) {
            C0605a c0605a2 = c0605a;
            Object[] objArr = {c0605a2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ee3ce5def63dab73514ebb644fde7d3", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ee3ce5def63dab73514ebb644fde7d3")).intValue();
            }
            int a2 = e.a(this.c.g, c0605a2.c.g);
            if (a2 != 0) {
                return a2;
            }
            int a3 = e.a(this.d.d, c0605a2.d.d);
            if (a3 != 0) {
                return a3;
            }
            int a4 = e.a(Boolean.valueOf(this.e), Boolean.valueOf(c0605a2.e));
            if (a4 != 0) {
                return a4;
            }
            int a5 = e.a(Boolean.valueOf(this.f), Boolean.valueOf(c0605a2.f));
            if (a5 != 0) {
                return a5;
            }
            int a6 = e.a(this.g, c0605a2.g);
            if (a6 != 0) {
                return a6;
            }
            return 0;
        }

        public C0605a(b bVar, c cVar, boolean z, boolean z2, int i, EGLConfig eGLConfig) {
            Object[] objArr = {a.this, bVar, cVar, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Integer.valueOf(i), eGLConfig};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "15f68035f5f7b501eb8d8a50c85a3e70", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "15f68035f5f7b501eb8d8a50c85a3e70");
                return;
            }
            this.c = bVar;
            this.d = cVar;
            this.e = z;
            this.f = z2;
            this.g = i;
            this.h = eGLConfig;
        }
    }

    private EGLConfig a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr) {
        int i;
        b bVar;
        c cVar;
        a aVar = this;
        EGLConfig[] eGLConfigArr2 = eGLConfigArr;
        Object[] objArr = {egl10, eGLDisplay, eGLConfigArr2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "946ce666a7b7c93d1fdf3ab24d320bad", RobustBitConfig.DEFAULT_VALUE)) {
            return (EGLConfig) PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "946ce666a7b7c93d1fdf3ab24d320bad");
        }
        ArrayList arrayList = new ArrayList();
        int length = eGLConfigArr2.length;
        int i2 = 0;
        int i3 = 0;
        while (i3 < length) {
            EGLConfig eGLConfig = eGLConfigArr2[i3];
            int i4 = i2 + 1;
            int a2 = aVar.a(egl10, eGLDisplay, eGLConfig, 12327);
            int a3 = aVar.a(egl10, eGLDisplay, eGLConfig, 12354);
            int a4 = aVar.a(egl10, eGLDisplay, eGLConfig, 12320);
            int a5 = aVar.a(egl10, eGLDisplay, eGLConfig, 12324);
            int a6 = aVar.a(egl10, eGLDisplay, eGLConfig, 12323);
            int a7 = aVar.a(egl10, eGLDisplay, eGLConfig, 12322);
            int a8 = aVar.a(egl10, eGLDisplay, eGLConfig, 12321);
            aVar.a(egl10, eGLDisplay, eGLConfig, 12350);
            int a9 = aVar.a(egl10, eGLDisplay, eGLConfig, 12325);
            int i5 = i3;
            int a10 = aVar.a(egl10, eGLDisplay, eGLConfig, 12326);
            int i6 = length;
            if ((a9 == 24 || a9 == 16) & (a10 == 8) & (aVar.a(egl10, eGLDisplay, eGLConfig, 12338) >= 0) & (aVar.a(egl10, eGLDisplay, eGLConfig, 12337) >= 0)) {
                if (a4 == 16 && a5 == 5 && a6 == 6 && a7 == 5 && a8 == 0) {
                    bVar = b.Format16Bit;
                } else if (a4 == 32 && a5 == 8 && a6 == 8 && a7 == 8 && a8 == 0) {
                    bVar = b.Format32BitNoAlpha;
                } else if (a4 == 32 && a5 == 8 && a6 == 8 && a7 == 8 && a8 == 8) {
                    bVar = b.Format32BitAlpha;
                } else if (a4 == 24 && a5 == 8 && a6 == 8 && a7 == 8 && a8 == 0) {
                    bVar = b.Format24Bit;
                } else {
                    bVar = b.Unknown;
                }
                if (a9 == 16 && a10 == 8) {
                    cVar = c.Format16Depth8Stencil;
                } else {
                    cVar = c.Format24Depth8Stencil;
                }
                boolean z = (a3 & 4) != 4;
                boolean z2 = a2 != 12344;
                if (bVar != b.Unknown) {
                    i = i5;
                    arrayList.add(new C0605a(bVar, cVar, z, z2, i4, eGLConfig));
                    i3 = i + 1;
                    i2 = i4;
                    length = i6;
                    aVar = this;
                    eGLConfigArr2 = eGLConfigArr;
                }
            }
            i = i5;
            i3 = i + 1;
            i2 = i4;
            length = i6;
            aVar = this;
            eGLConfigArr2 = eGLConfigArr;
        }
        Collections.sort(arrayList);
        if (arrayList.size() == 0) {
            throw new RuntimeException("No matching configurations after filtering");
        }
        C0605a c0605a = (C0605a) arrayList.get(0);
        if (c0605a.f) {
            com.sankuai.meituan.mapsdk.mapcore.utils.c.d("Chosen config has a caveat.");
        }
        if (c0605a.e) {
            com.sankuai.meituan.mapsdk.mapcore.utils.c.d("Chosen config is not conformant.");
        }
        return c0605a.h;
    }

    private int a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i) {
        Object[] objArr = {egl10, eGLDisplay, eGLConfig, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6509c12e388f92273ecc24c5e1d529b8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6509c12e388f92273ecc24c5e1d529b8")).intValue();
        }
        int[] iArr = new int[1];
        if (!egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, i, iArr)) {
            com.sankuai.meituan.mapsdk.mapcore.utils.c.e("eglGetConfigAttrib(" + i + ") returned error " + egl10.eglGetError());
            throw new RuntimeException("eglGetConfigAttrib() failed");
        }
        return iArr[0];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public enum b {
        Format16Bit(3),
        Format32BitNoAlpha(1),
        Format32BitAlpha(2),
        Format24Bit(0),
        Unknown(4);
        
        public static ChangeQuickRedirect a;
        public int g;

        public static b valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3f4fec0db9757030aca2c75ba4c19a0f", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3f4fec0db9757030aca2c75ba4c19a0f") : (b) Enum.valueOf(b.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static b[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b7c6677caddc4192f566842b4c1b109d", RobustBitConfig.DEFAULT_VALUE) ? (b[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b7c6677caddc4192f566842b4c1b109d") : (b[]) values().clone();
        }

        b(int i) {
            Object[] objArr = {r10, Integer.valueOf(r11), Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e71a73475ee167a2a22682db2593f73", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e71a73475ee167a2a22682db2593f73");
            } else {
                this.g = i;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public enum c {
        Format16Depth8Stencil(1),
        Format24Depth8Stencil(0);
        
        public static ChangeQuickRedirect a;
        public int d;

        public static c valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "19eaab0924afb6e08648dd8dd2b9a24e", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "19eaab0924afb6e08648dd8dd2b9a24e") : (c) Enum.valueOf(c.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static c[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "218059935b71d6f0ce313a363bc4ac98", RobustBitConfig.DEFAULT_VALUE) ? (c[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "218059935b71d6f0ce313a363bc4ac98") : (c[]) values().clone();
        }

        c(int i) {
            Object[] objArr = {r10, Integer.valueOf(r11), Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "731b2e4d1e003ede28d42fe2be904d31", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "731b2e4d1e003ede28d42fe2be904d31");
            } else {
                this.d = i;
            }
        }
    }
}

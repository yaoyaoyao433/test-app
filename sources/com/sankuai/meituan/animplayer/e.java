package com.sankuai.meituan.animplayer;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.TextureView;
import android.view.View;
import com.meituan.android.common.babel.Babel;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class e extends TextureView {
    public static ChangeQuickRedirect a;
    private c b;
    private a c;
    private final Handler d;
    private int e;
    private int f;
    private com.sankuai.meituan.animplayer.utils.a g;
    private boolean h;
    private volatile boolean i;
    private b j;
    private d k;
    private String l;
    private boolean m;
    private final i n;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
        void a(int i);

        void a(Map<String, Object> map);

        void a(boolean z, Map<String, Object> map);

        void b(int i);
    }

    public static /* synthetic */ void a(e eVar, Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, eVar, changeQuickRedirect, false, "758ccb2ae0b935cb6588bf7a080b64cd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, eVar, changeQuickRedirect, false, "758ccb2ae0b935cb6588bf7a080b64cd");
        } else if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
        } else {
            eVar.d.post(runnable);
        }
    }

    public e(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f7db75d9f7e53c019bed3a22a2881258", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f7db75d9f7e53c019bed3a22a2881258");
        }
    }

    private e(Context context, AttributeSet attributeSet) {
        super(context, null);
        Object[] objArr = {context, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8108d3d987fed7fb1bcbe44b36a136f6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8108d3d987fed7fb1bcbe44b36a136f6");
            return;
        }
        this.d = new Handler(Looper.getMainLooper());
        this.e = 1;
        this.g = com.sankuai.meituan.animplayer.utils.a.ScaleAspectFill;
        this.h = true;
        this.i = true;
        this.n = new i() { // from class: com.sankuai.meituan.animplayer.e.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.meituan.animplayer.i
            public final void a(final int i) {
                Object[] objArr2 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1177951a57bd0ce8d19440cf936ccbce", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1177951a57bd0ce8d19440cf936ccbce");
                } else {
                    e.a(e.this, new Runnable() { // from class: com.sankuai.meituan.animplayer.e.1.1
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "923a554b41b36b5ffb88959471a7cb2a", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "923a554b41b36b5ffb88959471a7cb2a");
                            } else if (e.this.c != null) {
                                e.this.c.a(i);
                            }
                        }
                    });
                }
            }

            @Override // com.sankuai.meituan.animplayer.i
            public final void b(final int i) {
                Object[] objArr2 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "aaee1c3615d77c328cce72e9c462f926", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "aaee1c3615d77c328cce72e9c462f926");
                } else {
                    e.a(e.this, new Runnable() { // from class: com.sankuai.meituan.animplayer.e.1.2
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "0bab4ff46e0f4f3c31fb3c3f6ecea0a5", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "0bab4ff46e0f4f3c31fb3c3f6ecea0a5");
                            } else if (e.this.c != null) {
                                e.this.c.b(i);
                            }
                        }
                    });
                }
            }

            @Override // com.sankuai.meituan.animplayer.i
            public final void a(final Map<String, Object> map) {
                Object[] objArr2 = {map};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bc8d2f2662c7969ba71a954289a5490e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bc8d2f2662c7969ba71a954289a5490e");
                    return;
                }
                Babel.log("anim-player", null, map);
                e.a(e.this, new Runnable() { // from class: com.sankuai.meituan.animplayer.e.1.3
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ee7542f5fd1a2677976ac3c08c7cb2b7", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "ee7542f5fd1a2677976ac3c08c7cb2b7");
                            return;
                        }
                        e.this.setVisibility(e.this.h ? 0 : 8);
                        if (e.this.c != null) {
                            e.this.c.a(map);
                        }
                    }
                });
            }

            @Override // com.sankuai.meituan.animplayer.i
            public final void a(final boolean z, final Map<String, Object> map) {
                Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), map};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7adcefd81aa07b164374c1e4e87ca0a4", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7adcefd81aa07b164374c1e4e87ca0a4");
                    return;
                }
                Babel.log("anim-player", null, map);
                e.a(e.this, new Runnable() { // from class: com.sankuai.meituan.animplayer.e.1.4
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "f97cab05536954243e5b266ac372d063", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "f97cab05536954243e5b266ac372d063");
                        } else if (e.this.c != null) {
                            e.this.c.a(z, map);
                        }
                    }
                });
            }

            @Override // com.sankuai.meituan.animplayer.i
            public final void a(TextureView.SurfaceTextureListener surfaceTextureListener) {
                Object[] objArr2 = {surfaceTextureListener};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e82640d0be2490672f5905a97f1f5989", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e82640d0be2490672f5905a97f1f5989");
                } else {
                    e.this.setSurfaceTextureListener(surfaceTextureListener);
                }
            }

            @Override // com.sankuai.meituan.animplayer.i
            public final Bitmap a(int i, int i2) {
                Object[] objArr2 = {13, 13};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "df16d29021da2b832ae37f7cd3579e92", RobustBitConfig.DEFAULT_VALUE)) {
                    return (Bitmap) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "df16d29021da2b832ae37f7cd3579e92");
                }
                if (e.this.f == 0) {
                    return e.this.getBitmap(13, 13);
                }
                return null;
            }
        };
        e();
    }

    private void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27100e852701f1dd1fa90ea456c81d3a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27100e852701f1dd1fa90ea456c81d3a");
            return;
        }
        this.b = new c(getContext(), this.n);
        this.b.a(this.j);
        this.b.a(this.g);
        this.b.a(this.e);
        this.b.a(this.k);
        setOpaque(false);
    }

    private void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fad10599bd986996256a99b85672e76b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fad10599bd986996256a99b85672e76b");
        } else if (g()) {
            e();
        }
    }

    private boolean g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d9f911dfa51fb80a08344db6c715cb3", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d9f911dfa51fb80a08344db6c715cb3")).booleanValue() : this.b == null || this.b.c;
    }

    public void setConfig(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d1c7da07cd5f15e8f7528a869689a345", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d1c7da07cd5f15e8f7528a869689a345");
            return;
        }
        this.j = bVar;
        if (this.b != null) {
            this.b.a(bVar);
        }
        if (bVar != null) {
            this.h = bVar.d;
            this.i = bVar.e;
        }
    }

    @Override // android.view.TextureView, android.view.View
    public void onAttachedToWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "962da823c23b888cfb22a23dbfc30bbb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "962da823c23b888cfb22a23dbfc30bbb");
            return;
        }
        f();
        super.onAttachedToWindow();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "06341577c725aff90042481467f44bb0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "06341577c725aff90042481467f44bb0");
            return;
        }
        super.onDetachedFromWindow();
        if (this.b != null) {
            b();
        }
    }

    @Override // android.view.TextureView, android.view.View
    public void onVisibilityChanged(View view, int i) {
        Object[] objArr = {view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "420ee920b8d560df1759bb4b77562ad6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "420ee920b8d560df1759bb4b77562ad6");
            return;
        }
        super.onVisibilityChanged(view, i);
        this.f = i;
    }

    public void setLoopCount(int i) {
        this.e = i;
    }

    public final void a(final float f, final float f2) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "30394bb57afbed733240c3c84fce7765", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "30394bb57afbed733240c3c84fce7765");
        } else if (this.b != null) {
            final c cVar = this.b;
            Object[] objArr2 = {Float.valueOf(f), Float.valueOf(f2)};
            ChangeQuickRedirect changeQuickRedirect2 = c.a;
            if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "9ab041c07613358e4fbf9107604debd1", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "9ab041c07613358e4fbf9107604debd1");
            } else {
                cVar.a(new Runnable() { // from class: com.sankuai.meituan.animplayer.c.8
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "67d865dafe4118cf5a7fc3d86f21d0ef", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "67d865dafe4118cf5a7fc3d86f21d0ef");
                            return;
                        }
                        j jVar = cVar.f;
                        if (jVar != null) {
                            jVar.a(f, f2);
                        }
                    }
                });
            }
        }
    }

    public void setAnimPlayerListener(a aVar) {
        this.c = aVar;
    }

    public void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9f80b5628509f0fee80a56d9d804efd9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9f80b5628509f0fee80a56d9d804efd9");
        } else {
            a(str, false);
        }
    }

    private void a(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c2b90763ecbe7735fce1d125747b120a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c2b90763ecbe7735fce1d125747b120a");
            return;
        }
        setVisibility(0);
        this.l = str;
        this.m = z;
        f();
        if (this.b != null) {
            this.b.a(this.e);
            this.b.a(str, z);
        }
    }

    public void setScaleType(com.sankuai.meituan.animplayer.utils.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce64e521871b01301914dc3bd5d9bc53", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce64e521871b01301914dc3bd5d9bc53");
        } else if (this.b != null) {
            this.b.a(aVar);
        }
    }

    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c4f18602b88e6ee71057d749b74918d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c4f18602b88e6ee71057d749b74918d");
        } else if (this.b != null) {
            setVisibility(this.h ? 0 : 8);
            final c cVar = this.b;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = c.a;
            if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "b1fe565178230141295c9ff8f8a3cc57", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "b1fe565178230141295c9ff8f8a3cc57");
            } else {
                cVar.a(new Runnable() { // from class: com.sankuai.meituan.animplayer.c.7
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "169df0bfdb60a3b9c55523ed6aca52e8", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "169df0bfdb60a3b9c55523ed6aca52e8");
                        } else if (cVar.f == null || !cVar.e()) {
                        } else {
                            c cVar2 = cVar;
                            cVar.d = 8;
                            cVar2.y = 8;
                            cVar.f.d();
                        }
                    }
                });
            }
        }
    }

    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "052a250db1b651497df3de377e88b970", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "052a250db1b651497df3de377e88b970");
        } else if (this.b != null) {
            c cVar = this.b;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = c.a;
            if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "bb253e26141003e6abee451bd6d564f0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "bb253e26141003e6abee451bd6d564f0");
            } else {
                cVar.c();
                i iVar = cVar.b;
                if (iVar != null) {
                    iVar.a((TextureView.SurfaceTextureListener) null);
                    cVar.b = null;
                }
                cVar.b();
            }
            this.b = null;
        }
    }

    public void setAnimPlayerStatistics(d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a246432a97f1a4118f60ea3e87016ed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a246432a97f1a4118f60ea3e87016ed");
            return;
        }
        this.k = dVar;
        if (this.b != null) {
            this.b.a(dVar);
        }
    }

    public void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ac02a22c883f7821ec0af53b75eba6f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ac02a22c883f7821ec0af53b75eba6f");
        } else if (this.b != null) {
            final c cVar = this.b;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = c.a;
            if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "faa2c2cff0ddc8964511b4e742b709b9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "faa2c2cff0ddc8964511b4e742b709b9");
            } else {
                cVar.a(new Runnable() { // from class: com.sankuai.meituan.animplayer.c.15
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "24169665630772585849e6afde58f7cd", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "24169665630772585849e6afde58f7cd");
                            return;
                        }
                        if (cVar.y != 4 && cVar.e()) {
                            cVar.f.c();
                            cVar.y = 4;
                        }
                        cVar.d = 4;
                        if (cVar.y == 5) {
                            cVar.y = 6;
                        }
                    }
                });
            }
        }
    }

    public void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "00f006e6e331528b03f1ac37dfb1b69d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "00f006e6e331528b03f1ac37dfb1b69d");
        } else if (g() && !TextUtils.isEmpty(this.l)) {
            a(this.l, this.m);
        } else if (this.b != null) {
            final c cVar = this.b;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = c.a;
            if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "32acc588a01bcd9cbad3bc7c8e8209df", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "32acc588a01bcd9cbad3bc7c8e8209df");
            } else {
                cVar.a(new Runnable() { // from class: com.sankuai.meituan.animplayer.c.14
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "55a1a1c5c749d1485cb605208ce86389", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "55a1a1c5c749d1485cb605208ce86389");
                        } else if (cVar.e()) {
                            cVar.a((String) null, false);
                        }
                    }
                });
            }
        }
    }
}

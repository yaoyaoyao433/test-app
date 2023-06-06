package com.meituan.android.mtplayer.video;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.os.Build;
import android.support.annotation.FloatRange;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.meituan.android.mtplayer.video.callback.DisplayMode;
import com.meituan.android.mtplayer.video.callback.IPlayerStateCallback;
import com.meituan.android.mtplayer.video.player.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class MTVideoPlayerView extends FrameLayout implements com.meituan.android.mtplayer.video.callback.c {
    public static ChangeQuickRedirect a;
    public FrameLayout b;
    com.meituan.android.mtplayer.video.callback.a c;
    d d;
    com.meituan.android.mtplayer.video.b e;
    public View.OnClickListener f;
    int g;
    int h;
    int i;
    int j;
    j k;
    public c l;
    d.g m;
    private int n;
    private boolean o;
    private boolean p;
    private com.meituan.android.mtplayer.video.callback.e q;
    private int r;
    private int s;
    private int t;
    private final i u;
    private String v;
    private com.meituan.android.mtplayer.video.c w;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface c {
        void a(View view, int i, int i2);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public enum a {
        TYPE_TEXTURE,
        TYPE_SURFACE;
        
        public static ChangeQuickRedirect a;

        a() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4278622c2d3a48f4a18f1c5a2bb11655", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4278622c2d3a48f4a18f1c5a2bb11655");
            }
        }

        public static a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "47d7c9c47cd7cf93bb5586a2a3b17a41", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "47d7c9c47cd7cf93bb5586a2a3b17a41") : (a) Enum.valueOf(a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9cdb11cdf61e4e1b9e08a01e4957ea47", RobustBitConfig.DEFAULT_VALUE) ? (a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9cdb11cdf61e4e1b9e08a01e4957ea47") : (a[]) values().clone();
        }
    }

    public MTVideoPlayerView(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "053b17e3d626f3b0e7ce8b9a7903cab3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "053b17e3d626f3b0e7ce8b9a7903cab3");
            return;
        }
        this.n = 0;
        this.o = true;
        this.f = new View.OnClickListener() { // from class: com.meituan.android.mtplayer.video.MTVideoPlayerView.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "805cc11270ebb20f1d81c019dde29fc8", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "805cc11270ebb20f1d81c019dde29fc8");
                }
            }
        };
        this.u = new i();
        this.m = new d.g() { // from class: com.meituan.android.mtplayer.video.MTVideoPlayerView.6
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.mtplayer.video.player.d.g
            public final void a(com.meituan.android.mtplayer.video.player.d dVar, int i, int i2, int i3, int i4) {
                Object[] objArr2 = {dVar, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "28c4585cecc108734e5ece3e86276266", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "28c4585cecc108734e5ece3e86276266");
                    return;
                }
                com.meituan.android.mtplayer.video.utils.c.b("MTPlayer", "Media video size has changed");
                MTVideoPlayerView.this.g = i;
                MTVideoPlayerView.this.h = i2;
                MTVideoPlayerView.this.i = i3;
                MTVideoPlayerView.this.j = i4;
                if (MTVideoPlayerView.this.g <= 0 || MTVideoPlayerView.this.h <= 0 || MTVideoPlayerView.this.d == null) {
                    return;
                }
                if (MTVideoPlayerView.this.l != null) {
                    MTVideoPlayerView.this.l.a(MTVideoPlayerView.this.d.getView(), i, i2);
                }
                MTVideoPlayerView.this.d.a(MTVideoPlayerView.this.g, MTVideoPlayerView.this.h);
                if (MTVideoPlayerView.this.i <= 0 || MTVideoPlayerView.this.j <= 0) {
                    return;
                }
                MTVideoPlayerView.this.d.b(i3, i4);
            }
        };
        this.w = new com.meituan.android.mtplayer.video.c() { // from class: com.meituan.android.mtplayer.video.MTVideoPlayerView.7
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.mtplayer.video.c
            public final void a(com.meituan.android.mtplayer.video.b bVar, int i, int i2) {
                Object[] objArr2 = {bVar, Integer.valueOf(i), Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "64735db62f2e8742996b6941482120a2", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "64735db62f2e8742996b6941482120a2");
                    return;
                }
                com.meituan.android.mtplayer.video.utils.c.b("MTPlayer", "Media display has been created");
                if (MTVideoPlayerView.this.e == null) {
                    MTVideoPlayerView.this.e = bVar;
                }
                MTVideoPlayerView.this.k.a(MTVideoPlayerView.this.e);
            }

            @Override // com.meituan.android.mtplayer.video.c
            public final void a(com.meituan.android.mtplayer.video.b bVar, int i, int i2, int i3) {
                Object[] objArr2 = {bVar, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "85ef017ebbc0b5302f96ec84318d480e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "85ef017ebbc0b5302f96ec84318d480e");
                    return;
                }
                com.meituan.android.mtplayer.video.utils.c.b("MTPlayer", "Media display has been updated----surfaceWidth:" + i2 + ",surfaceHeight:" + i3);
                MTVideoPlayerView.this.r = i2;
                MTVideoPlayerView.this.s = i3;
                if (MTVideoPlayerView.this.d.a() && MTVideoPlayerView.this.g == MTVideoPlayerView.this.r && MTVideoPlayerView.this.h == MTVideoPlayerView.this.s && MTVideoPlayerView.this.k.o()) {
                    MTVideoPlayerView.this.c();
                }
            }

            @Override // com.meituan.android.mtplayer.video.c
            public final void a(com.meituan.android.mtplayer.video.b bVar) {
                Object[] objArr2 = {bVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7daa8d500c20b7796bff0d74701cc20e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7daa8d500c20b7796bff0d74701cc20e");
                    return;
                }
                com.meituan.android.mtplayer.video.utils.c.b("MTPlayer", "Media display has been destroyed");
                MTVideoPlayerView.this.s = MTVideoPlayerView.this.r = 0;
                MTVideoPlayerView.this.e = null;
                if (Build.VERSION.SDK_INT < 21 || MTVideoPlayerView.this.d.a()) {
                    MTVideoPlayerView.this.k.q();
                }
            }
        };
        b(context);
    }

    public MTVideoPlayerView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f9a6740bbbe010eb8f021cf5dcd66f65", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f9a6740bbbe010eb8f021cf5dcd66f65");
            return;
        }
        this.n = 0;
        this.o = true;
        this.f = new View.OnClickListener() { // from class: com.meituan.android.mtplayer.video.MTVideoPlayerView.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "805cc11270ebb20f1d81c019dde29fc8", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "805cc11270ebb20f1d81c019dde29fc8");
                }
            }
        };
        this.u = new i();
        this.m = new d.g() { // from class: com.meituan.android.mtplayer.video.MTVideoPlayerView.6
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.mtplayer.video.player.d.g
            public final void a(com.meituan.android.mtplayer.video.player.d dVar, int i, int i2, int i3, int i4) {
                Object[] objArr2 = {dVar, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "28c4585cecc108734e5ece3e86276266", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "28c4585cecc108734e5ece3e86276266");
                    return;
                }
                com.meituan.android.mtplayer.video.utils.c.b("MTPlayer", "Media video size has changed");
                MTVideoPlayerView.this.g = i;
                MTVideoPlayerView.this.h = i2;
                MTVideoPlayerView.this.i = i3;
                MTVideoPlayerView.this.j = i4;
                if (MTVideoPlayerView.this.g <= 0 || MTVideoPlayerView.this.h <= 0 || MTVideoPlayerView.this.d == null) {
                    return;
                }
                if (MTVideoPlayerView.this.l != null) {
                    MTVideoPlayerView.this.l.a(MTVideoPlayerView.this.d.getView(), i, i2);
                }
                MTVideoPlayerView.this.d.a(MTVideoPlayerView.this.g, MTVideoPlayerView.this.h);
                if (MTVideoPlayerView.this.i <= 0 || MTVideoPlayerView.this.j <= 0) {
                    return;
                }
                MTVideoPlayerView.this.d.b(i3, i4);
            }
        };
        this.w = new com.meituan.android.mtplayer.video.c() { // from class: com.meituan.android.mtplayer.video.MTVideoPlayerView.7
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.mtplayer.video.c
            public final void a(com.meituan.android.mtplayer.video.b bVar, int i, int i2) {
                Object[] objArr2 = {bVar, Integer.valueOf(i), Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "64735db62f2e8742996b6941482120a2", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "64735db62f2e8742996b6941482120a2");
                    return;
                }
                com.meituan.android.mtplayer.video.utils.c.b("MTPlayer", "Media display has been created");
                if (MTVideoPlayerView.this.e == null) {
                    MTVideoPlayerView.this.e = bVar;
                }
                MTVideoPlayerView.this.k.a(MTVideoPlayerView.this.e);
            }

            @Override // com.meituan.android.mtplayer.video.c
            public final void a(com.meituan.android.mtplayer.video.b bVar, int i, int i2, int i3) {
                Object[] objArr2 = {bVar, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "85ef017ebbc0b5302f96ec84318d480e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "85ef017ebbc0b5302f96ec84318d480e");
                    return;
                }
                com.meituan.android.mtplayer.video.utils.c.b("MTPlayer", "Media display has been updated----surfaceWidth:" + i2 + ",surfaceHeight:" + i3);
                MTVideoPlayerView.this.r = i2;
                MTVideoPlayerView.this.s = i3;
                if (MTVideoPlayerView.this.d.a() && MTVideoPlayerView.this.g == MTVideoPlayerView.this.r && MTVideoPlayerView.this.h == MTVideoPlayerView.this.s && MTVideoPlayerView.this.k.o()) {
                    MTVideoPlayerView.this.c();
                }
            }

            @Override // com.meituan.android.mtplayer.video.c
            public final void a(com.meituan.android.mtplayer.video.b bVar) {
                Object[] objArr2 = {bVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7daa8d500c20b7796bff0d74701cc20e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7daa8d500c20b7796bff0d74701cc20e");
                    return;
                }
                com.meituan.android.mtplayer.video.utils.c.b("MTPlayer", "Media display has been destroyed");
                MTVideoPlayerView.this.s = MTVideoPlayerView.this.r = 0;
                MTVideoPlayerView.this.e = null;
                if (Build.VERSION.SDK_INT < 21 || MTVideoPlayerView.this.d.a()) {
                    MTVideoPlayerView.this.k.q();
                }
            }
        };
        b(context);
    }

    public MTVideoPlayerView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aff5960d4923f2246007770493085c1b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aff5960d4923f2246007770493085c1b");
            return;
        }
        this.n = 0;
        this.o = true;
        this.f = new View.OnClickListener() { // from class: com.meituan.android.mtplayer.video.MTVideoPlayerView.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "805cc11270ebb20f1d81c019dde29fc8", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "805cc11270ebb20f1d81c019dde29fc8");
                }
            }
        };
        this.u = new i();
        this.m = new d.g() { // from class: com.meituan.android.mtplayer.video.MTVideoPlayerView.6
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.mtplayer.video.player.d.g
            public final void a(com.meituan.android.mtplayer.video.player.d dVar, int i2, int i22, int i3, int i4) {
                Object[] objArr2 = {dVar, Integer.valueOf(i2), Integer.valueOf(i22), Integer.valueOf(i3), Integer.valueOf(i4)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "28c4585cecc108734e5ece3e86276266", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "28c4585cecc108734e5ece3e86276266");
                    return;
                }
                com.meituan.android.mtplayer.video.utils.c.b("MTPlayer", "Media video size has changed");
                MTVideoPlayerView.this.g = i2;
                MTVideoPlayerView.this.h = i22;
                MTVideoPlayerView.this.i = i3;
                MTVideoPlayerView.this.j = i4;
                if (MTVideoPlayerView.this.g <= 0 || MTVideoPlayerView.this.h <= 0 || MTVideoPlayerView.this.d == null) {
                    return;
                }
                if (MTVideoPlayerView.this.l != null) {
                    MTVideoPlayerView.this.l.a(MTVideoPlayerView.this.d.getView(), i2, i22);
                }
                MTVideoPlayerView.this.d.a(MTVideoPlayerView.this.g, MTVideoPlayerView.this.h);
                if (MTVideoPlayerView.this.i <= 0 || MTVideoPlayerView.this.j <= 0) {
                    return;
                }
                MTVideoPlayerView.this.d.b(i3, i4);
            }
        };
        this.w = new com.meituan.android.mtplayer.video.c() { // from class: com.meituan.android.mtplayer.video.MTVideoPlayerView.7
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.mtplayer.video.c
            public final void a(com.meituan.android.mtplayer.video.b bVar, int i2, int i22) {
                Object[] objArr2 = {bVar, Integer.valueOf(i2), Integer.valueOf(i22)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "64735db62f2e8742996b6941482120a2", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "64735db62f2e8742996b6941482120a2");
                    return;
                }
                com.meituan.android.mtplayer.video.utils.c.b("MTPlayer", "Media display has been created");
                if (MTVideoPlayerView.this.e == null) {
                    MTVideoPlayerView.this.e = bVar;
                }
                MTVideoPlayerView.this.k.a(MTVideoPlayerView.this.e);
            }

            @Override // com.meituan.android.mtplayer.video.c
            public final void a(com.meituan.android.mtplayer.video.b bVar, int i2, int i22, int i3) {
                Object[] objArr2 = {bVar, Integer.valueOf(i2), Integer.valueOf(i22), Integer.valueOf(i3)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "85ef017ebbc0b5302f96ec84318d480e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "85ef017ebbc0b5302f96ec84318d480e");
                    return;
                }
                com.meituan.android.mtplayer.video.utils.c.b("MTPlayer", "Media display has been updated----surfaceWidth:" + i22 + ",surfaceHeight:" + i3);
                MTVideoPlayerView.this.r = i22;
                MTVideoPlayerView.this.s = i3;
                if (MTVideoPlayerView.this.d.a() && MTVideoPlayerView.this.g == MTVideoPlayerView.this.r && MTVideoPlayerView.this.h == MTVideoPlayerView.this.s && MTVideoPlayerView.this.k.o()) {
                    MTVideoPlayerView.this.c();
                }
            }

            @Override // com.meituan.android.mtplayer.video.c
            public final void a(com.meituan.android.mtplayer.video.b bVar) {
                Object[] objArr2 = {bVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7daa8d500c20b7796bff0d74701cc20e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7daa8d500c20b7796bff0d74701cc20e");
                    return;
                }
                com.meituan.android.mtplayer.video.utils.c.b("MTPlayer", "Media display has been destroyed");
                MTVideoPlayerView.this.s = MTVideoPlayerView.this.r = 0;
                MTVideoPlayerView.this.e = null;
                if (Build.VERSION.SDK_INT < 21 || MTVideoPlayerView.this.d.a()) {
                    MTVideoPlayerView.this.k.q();
                }
            }
        };
        b(context);
    }

    private void b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "46b495f75e39b7a55e9da9625490ad6b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "46b495f75e39b7a55e9da9625490ad6b");
            return;
        }
        this.b = new b(context);
        addView(this.b, new FrameLayout.LayoutParams(-1, -1));
        setDisplayView(a.TYPE_TEXTURE);
        this.k = new j(context, this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public class b extends FrameLayout {
        public static ChangeQuickRedirect a;

        public b(@NonNull Context context) {
            super(context);
            Object[] objArr = {MTVideoPlayerView.this, context};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b5948fcd2294ddf3de3662a652f9b06b", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b5948fcd2294ddf3de3662a652f9b06b");
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        public final void onAttachedToWindow() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5621909e0faefea914595584cb5e7de9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5621909e0faefea914595584cb5e7de9");
                return;
            }
            super.onAttachedToWindow();
            if (MTVideoPlayerView.this.e()) {
                MTVideoPlayerView.this.k.m();
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        public final void onDetachedFromWindow() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d0143b4e0005962e00ef84b8cd827c47", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d0143b4e0005962e00ef84b8cd827c47");
                return;
            }
            super.onDetachedFromWindow();
            MTVideoPlayerView.this.k.n();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f120fe6b7598b90e0637e3c02bc022e3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f120fe6b7598b90e0637e3c02bc022e3");
            return;
        }
        super.onAttachedToWindow();
        this.p = true;
        com.meituan.android.mtplayer.video.utils.c.b("MTPlayer", "MTVideoPlayerView attach to window");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d2fd57a5d1ff8d2525c8c146198b0131", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d2fd57a5d1ff8d2525c8c146198b0131");
            return;
        }
        super.onDetachedFromWindow();
        this.p = false;
        com.meituan.android.mtplayer.video.utils.c.b("MTPlayer", "MTVideoPlayerView detach from window");
    }

    public final void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8895652a7207baa85e180022e88d9c78", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8895652a7207baa85e180022e88d9c78");
        } else if (this.c != null) {
            this.c.a(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "97f33a1ac7d9103a1438d21bacef8a2a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "97f33a1ac7d9103a1438d21bacef8a2a")).booleanValue();
        }
        if (this.d.a()) {
            return (this.g == this.r && this.h == this.s) ? false : true;
        }
        return false;
    }

    public Activity a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "def695b8b678dcd0a6d1dd012ea60765", RobustBitConfig.DEFAULT_VALUE)) {
            return (Activity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "def695b8b678dcd0a6d1dd012ea60765");
        }
        if (context == null) {
            return null;
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            Context baseContext = ((ContextWrapper) context).getBaseContext();
            if (baseContext instanceof Activity) {
                return (Activity) baseContext;
            }
        }
        return null;
    }

    public final void setPlayerType(l lVar) {
        Object[] objArr = {lVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cf1259d1505c26af6803494bdb947886", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cf1259d1505c26af6803494bdb947886");
        } else {
            this.k.a(lVar);
        }
    }

    public final l getPlayerType() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d155491f7fce9f48054bb66fbcd7458a", RobustBitConfig.DEFAULT_VALUE) ? (l) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d155491f7fce9f48054bb66fbcd7458a") : this.k.k();
    }

    public final void setDisplayView(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e7a251afb4ee67c7f63087f0af1d547", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e7a251afb4ee67c7f63087f0af1d547");
            return;
        }
        if (this.d != null) {
            this.k.q();
            View view = this.d.getView();
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.d.b(this.w);
            com.meituan.android.mtplayer.video.utils.c.b("MTPlayer", "remove last video view");
            this.d = null;
        }
        if (aVar == null) {
            aVar = a.TYPE_TEXTURE;
        }
        if (AnonymousClass5.a[aVar.ordinal()] == 1) {
            this.d = new SurfaceDisplayView(getContext());
        } else {
            this.d = new TextureDisplayView(getContext());
        }
        if (this.g > 0 && this.h > 0) {
            this.d.a(this.g, this.h);
        }
        if (this.j > 0 && this.i > 0) {
            this.d.b(this.i, this.j);
        }
        this.d.a(this.w);
        this.d.setVideoRotation(this.t);
        setDisplayMode(this.n);
        setDisplayOpaque(this.o);
        d dVar = this.d;
        Object[] objArr2 = {dVar};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d1c9d20fbc779094a07a771d7ba96d60", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d1c9d20fbc779094a07a771d7ba96d60");
        } else if (dVar == null) {
            com.meituan.android.mtplayer.video.utils.c.c("MTPlayer", "cann't add display view to parent");
        } else {
            View view2 = dVar.getView();
            ViewParent parent = view2.getParent();
            if (parent != null && !parent.equals(this.b)) {
                ((ViewGroup) parent).removeView(view2);
            }
            if (parent == null) {
                view2.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
                this.b.addView(view2, 0);
                com.meituan.android.mtplayer.video.utils.c.b("MTPlayer", "add video view");
            }
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.android.mtplayer.video.MTVideoPlayerView$5  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass5 {
        public static final /* synthetic */ int[] a = new int[a.valuesCustom().length];

        static {
            try {
                a[a.TYPE_SURFACE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[a.TYPE_TEXTURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public final void setDisplayOpaque(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5972244e88d94c6d357fdea674df94fb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5972244e88d94c6d357fdea674df94fb");
            return;
        }
        this.o = z;
        if (this.d != null) {
            this.d.setDisplayOpaque(z);
        }
    }

    public final View getDisplayView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "18559a361eea71243500d56f26205c7b", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "18559a361eea71243500d56f26205c7b");
        }
        if (this.d != null) {
            return this.d.getView();
        }
        return null;
    }

    public final void setCoverView(@Nullable com.meituan.android.mtplayer.video.callback.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e9880939618b41120b58ea02f6ef189a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e9880939618b41120b58ea02f6ef189a");
            return;
        }
        if (this.c != null) {
            View view = this.c.getView();
            if (view.getParent() != null) {
                this.b.removeView(view);
                com.meituan.android.mtplayer.video.utils.c.b("MTPlayer", "remove last cover view");
            }
            this.c = null;
        }
        if (aVar != null) {
            aVar.setPlayerController(this);
            View view2 = aVar.getView();
            if (view2.getParent() == null) {
                this.b.addView(view2);
                com.meituan.android.mtplayer.video.utils.c.b("MTPlayer", "add cover view");
            }
            this.c = aVar;
        }
    }

    public final void setDisplayMode(@DisplayMode int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8151459120f0362eaae790d944197b2a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8151459120f0362eaae790d944197b2a");
            return;
        }
        this.n = i;
        if (this.d != null) {
            this.d.setVideoDisplayMode(i);
        }
    }

    public final void setPlayStateCallback(IPlayerStateCallback iPlayerStateCallback) {
        Object[] objArr = {iPlayerStateCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e8f0eb144fde2887b17c33782c40851e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e8f0eb144fde2887b17c33782c40851e");
        } else {
            this.k.a(iPlayerStateCallback);
        }
    }

    public final void setMultiPlayerManager(h hVar) {
        Object[] objArr = {hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ce153edf3df7d76a7d93a557d03801a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ce153edf3df7d76a7d93a557d03801a");
        } else {
            this.k.a(hVar);
        }
    }

    public final void setWindowStateCallback(com.meituan.android.mtplayer.video.callback.e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d157dcff9ca102098dad7c09617e8c97", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d157dcff9ca102098dad7c09617e8c97");
        } else {
            this.q = eVar;
        }
    }

    public final void setDataSource(VideoPlayerParam videoPlayerParam) {
        Object[] objArr = {videoPlayerParam};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b015430c7528b5527fc5c5ed8a57ca7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b015430c7528b5527fc5c5ed8a57ca7");
        } else {
            this.k.a(videoPlayerParam);
        }
    }

    @Override // com.meituan.android.mtplayer.video.callback.b
    public final synchronized void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "09eb55b3482209c54f9d6963ab10ffd1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "09eb55b3482209c54f9d6963ab10ffd1");
        } else {
            this.u.a(new Runnable() { // from class: com.meituan.android.mtplayer.video.MTVideoPlayerView.8
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7eca83351d300288b4cc078642be239a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7eca83351d300288b4cc078642be239a");
                        return;
                    }
                    com.meituan.android.mtplayer.video.utils.c.a("MTPlayer", "run prepare");
                    MTVideoPlayerView.this.k.b();
                }
            }, this);
        }
    }

    @Override // com.meituan.android.mtplayer.video.callback.b
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "839119aa2b6bce006a15f44fd3fcd694", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "839119aa2b6bce006a15f44fd3fcd694");
        } else {
            this.u.a(new Runnable() { // from class: com.meituan.android.mtplayer.video.MTVideoPlayerView.9
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2f266f75bcd7db2b3d1a30afb6c7badc", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2f266f75bcd7db2b3d1a30afb6c7badc");
                        return;
                    }
                    com.meituan.android.mtplayer.video.utils.c.a("MTPlayer", "run start");
                    MTVideoPlayerView.this.k.c();
                }
            }, this);
        }
    }

    @Override // com.meituan.android.mtplayer.video.callback.b
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "09dca51b834aa3292d640da94686550c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "09dca51b834aa3292d640da94686550c");
        } else {
            this.u.a(new Runnable() { // from class: com.meituan.android.mtplayer.video.MTVideoPlayerView.10
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6039ce1d1789222bf164fe3436a542c6", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6039ce1d1789222bf164fe3436a542c6");
                        return;
                    }
                    com.meituan.android.mtplayer.video.utils.c.a("MTPlayer", "run pause");
                    MTVideoPlayerView.this.k.d();
                }
            }, this);
        }
    }

    @Override // com.meituan.android.mtplayer.video.callback.b
    public final void a(final int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a72a3de78143b750a5f0629624cf5b2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a72a3de78143b750a5f0629624cf5b2");
        } else {
            this.u.a(new Runnable() { // from class: com.meituan.android.mtplayer.video.MTVideoPlayerView.11
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2b333272c810f3d648727f35e74ed701", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2b333272c810f3d648727f35e74ed701");
                        return;
                    }
                    com.meituan.android.mtplayer.video.utils.c.a("MTPlayer", "run seekTo (int)");
                    MTVideoPlayerView.this.k.a(i);
                }
            }, this);
        }
    }

    @Override // com.meituan.android.mtplayer.video.callback.b
    public final void a(@FloatRange(from = 0.0d, to = 1.0d) final float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6cef885c7fafccfdb307167bb6317c59", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6cef885c7fafccfdb307167bb6317c59");
        } else {
            this.u.a(new Runnable() { // from class: com.meituan.android.mtplayer.video.MTVideoPlayerView.12
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1357c4c61c3a4f7e63000723787885c2", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1357c4c61c3a4f7e63000723787885c2");
                        return;
                    }
                    com.meituan.android.mtplayer.video.utils.c.a("MTPlayer", "run seekTo (float)");
                    MTVideoPlayerView.this.k.a(f);
                }
            }, this);
        }
    }

    @Override // com.meituan.android.mtplayer.video.callback.b
    public final boolean e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "51ba3c48095b1a34d92a1ac8ce312222", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "51ba3c48095b1a34d92a1ac8ce312222")).booleanValue() : this.k.e();
    }

    @Override // com.meituan.android.mtplayer.video.callback.b
    public final void setPlaySpeed(@FloatRange(from = 0.0d, to = 6.0d) final float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c2e0bed3bf821eae48743005fe1bfd1a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c2e0bed3bf821eae48743005fe1bfd1a");
        } else {
            this.u.a(new Runnable() { // from class: com.meituan.android.mtplayer.video.MTVideoPlayerView.13
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "358cfe2959bed553efb8699aabde038c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "358cfe2959bed553efb8699aabde038c");
                        return;
                    }
                    com.meituan.android.mtplayer.video.utils.c.a("MTPlayer", "run setPlaySpeed");
                    MTVideoPlayerView.this.k.setPlaySpeed(f);
                }
            }, this);
        }
    }

    @Override // com.meituan.android.mtplayer.video.callback.b
    public final void a(final float f, final float f2) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b24f3e1fdef75c62612ffae144a85ffd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b24f3e1fdef75c62612ffae144a85ffd");
        } else {
            this.u.a(new Runnable() { // from class: com.meituan.android.mtplayer.video.MTVideoPlayerView.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "acf19dc6a9dd27fbecd87a6f9d139660", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "acf19dc6a9dd27fbecd87a6f9d139660");
                        return;
                    }
                    com.meituan.android.mtplayer.video.utils.c.a("MTPlayer", "run setVolume");
                    MTVideoPlayerView.this.k.a(f, f2);
                }
            }, this);
        }
    }

    @Override // com.meituan.android.mtplayer.video.callback.c
    public final void setBrightness(@FloatRange(from = 0.0d, to = 1.0d) float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "449ba0146195f674ff5d8f338fcc5bef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "449ba0146195f674ff5d8f338fcc5bef");
            return;
        }
        com.meituan.android.mtplayer.video.utils.c.b("MTPlayer", "Method call: MTVideoPlayerView.setBrightness()");
        Activity a2 = a(getContext());
        if (a2 == null || a2.isFinishing()) {
            return;
        }
        Window window = a2.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.screenBrightness = f;
        if (attributes.screenBrightness > 1.0f) {
            attributes.screenBrightness = 1.0f;
        } else if (attributes.screenBrightness < 0.1d) {
            attributes.screenBrightness = 0.1f;
        }
        window.setAttributes(attributes);
    }

    @Override // com.meituan.android.mtplayer.video.callback.b
    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d373328ed92636be6e724118b63e09e5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d373328ed92636be6e724118b63e09e5");
        } else {
            this.u.a(new Runnable() { // from class: com.meituan.android.mtplayer.video.MTVideoPlayerView.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "917cac25eb82de9e60849b389634b371", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "917cac25eb82de9e60849b389634b371");
                        return;
                    }
                    com.meituan.android.mtplayer.video.utils.c.a("MTPlayer", "run reset");
                    MTVideoPlayerView.this.k.f();
                }
            }, this);
        }
    }

    @Override // com.meituan.android.mtplayer.video.callback.b
    public final void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b8de8ce564f7a7f0f27e4fc47c970aa8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b8de8ce564f7a7f0f27e4fc47c970aa8");
        } else {
            this.u.a(new Runnable() { // from class: com.meituan.android.mtplayer.video.MTVideoPlayerView.4
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b888bc5aa5fbf4a09276e81ea3ced382", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b888bc5aa5fbf4a09276e81ea3ced382");
                        return;
                    }
                    com.meituan.android.mtplayer.video.utils.c.a("MTPlayer", "run release");
                    MTVideoPlayerView.this.k.g();
                    if (MTVideoPlayerView.this.e != null) {
                        MTVideoPlayerView.this.e.a();
                        MTVideoPlayerView.this.e = null;
                    }
                    i iVar = MTVideoPlayerView.this.u;
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = i.a;
                    if (PatchProxy.isSupport(objArr3, iVar, changeQuickRedirect3, false, "bb73de4697ae03d3bdeb2dbcd985d3b1", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, iVar, changeQuickRedirect3, false, "bb73de4697ae03d3bdeb2dbcd985d3b1");
                    } else {
                        iVar.b.shutdown();
                    }
                }
            }, this);
        }
    }

    @Override // com.meituan.android.mtplayer.video.callback.b
    public final void setLooping(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "939a1ee8d791dfb1ed440ba7b3b2ee66", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "939a1ee8d791dfb1ed440ba7b3b2ee66");
        } else {
            this.k.setLooping(z);
        }
    }

    @Override // com.meituan.android.mtplayer.video.callback.b
    public final int getDuration() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4468c3de6604680e6309ac5f550295ff", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4468c3de6604680e6309ac5f550295ff")).intValue() : this.k.getDuration();
    }

    @Override // com.meituan.android.mtplayer.video.callback.b
    public final int getCurrentPosition() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2b41b86f469c89ebec9f0a65e880d506", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2b41b86f469c89ebec9f0a65e880d506")).intValue() : this.k.getCurrentPosition();
    }

    @Nullable
    public final Bitmap getVideoBitmap() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "376664f135162168102648e0f8ba282c", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bitmap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "376664f135162168102648e0f8ba282c");
        }
        if (this.d != null) {
            try {
                return this.d.getVideoBitmap();
            } catch (OutOfMemoryError unused) {
                return null;
            }
        }
        return null;
    }

    @Nullable
    public final String getBusiness() {
        return this.v;
    }

    public final void setBusiness(String str) {
        this.v = str;
    }
}

package com.meituan.mmp.lib.api.video;

import android.app.Activity;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.meituan.mmp.lib.api.video.b;
import com.meituan.mmp.lib.utils.ba;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.smtt.sdk.TbsListener;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class d extends FrameLayout implements TextureView.SurfaceTextureListener, c, com.meituan.msi.view.e {
    public static ChangeQuickRedirect a;
    private b.a A;
    private boolean B;
    private boolean C;
    private boolean D;
    private int E;
    int b;
    b c;
    e d;
    @Nullable
    public com.meituan.mmp.lib.page.coverview.a e;
    private int f;
    private int g;
    private Context h;
    private AudioManager i;
    private FrameLayout j;
    private g k;
    private SurfaceTexture l;
    private Surface m;
    private String n;
    private Map<String, String> o;
    private int p;
    private long q;
    private boolean r;
    private boolean s;
    private boolean t;
    private int u;
    private b.e v;
    private b.g w;
    private b.InterfaceC0400b x;
    private b.c y;
    private b.d z;

    public long getTcpSpeed() {
        return 0L;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public void setSpeed(float f) {
    }

    public d(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da735c2820d4c35282a2be62f5ad2b51", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da735c2820d4c35282a2be62f5ad2b51");
        }
    }

    private d(Context context, AttributeSet attributeSet) {
        super(context, null);
        Object[] objArr = {context, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a7c54edab3b59f74da8172d88af9f8f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a7c54edab3b59f74da8172d88af9f8f");
            return;
        }
        this.f = TbsListener.ErrorCode.UNLZMA_FAIURE;
        this.b = 0;
        this.g = 10;
        this.r = false;
        this.s = false;
        this.t = false;
        this.v = new b.e() { // from class: com.meituan.mmp.lib.api.video.d.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.mmp.lib.api.video.b.e
            public final void a(b bVar) {
                Object[] objArr2 = {bVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3a03aaaa1a507f9185005b57c2b20c88", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3a03aaaa1a507f9185005b57c2b20c88");
                } else if (d.this.b == 4) {
                } else {
                    d.this.b = 2;
                    d.this.d.a(d.this.b);
                    if (!d.this.D) {
                        if (!d.this.t) {
                            if (d.this.q != 0) {
                                bVar.a(d.this.q);
                            } else {
                                bVar.a(1L);
                            }
                            TextView textView = d.this.getController().d;
                            if (textView != null) {
                                textView.setText(ba.a(d.this.getDuration()));
                                return;
                            }
                            return;
                        }
                        bVar.b();
                        if (d.this.q != 0) {
                            bVar.a(d.this.q);
                            return;
                        }
                        return;
                    }
                    bVar.b();
                    if (d.this.q != 0) {
                        bVar.a(d.this.q);
                    }
                }
            }
        };
        this.w = new b.g() { // from class: com.meituan.mmp.lib.api.video.d.2
            public static ChangeQuickRedirect a;

            @Override // com.meituan.mmp.lib.api.video.b.g
            public final void a(b bVar, int i, int i2, int i3, int i4) {
                Object[] objArr2 = {bVar, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4ccb18193a8e94b0c58004ad445c1c5e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4ccb18193a8e94b0c58004ad445c1c5e");
                    return;
                }
                g gVar = d.this.k;
                Object[] objArr3 = {Integer.valueOf(i), Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect3 = g.a;
                if (PatchProxy.isSupport(objArr3, gVar, changeQuickRedirect3, false, "b72dc2348085e2436ee071cb216f3d61", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, gVar, changeQuickRedirect3, false, "b72dc2348085e2436ee071cb216f3d61");
                } else if (gVar.c == i || gVar.b == i2) {
                } else {
                    gVar.c = i;
                    gVar.b = i2;
                    gVar.requestLayout();
                }
            }
        };
        this.x = new b.InterfaceC0400b() { // from class: com.meituan.mmp.lib.api.video.d.3
            public static ChangeQuickRedirect a;

            @Override // com.meituan.mmp.lib.api.video.b.InterfaceC0400b
            public final void a(b bVar) {
                Object[] objArr2 = {bVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "77e4ba81bf7d674496cb2eb31e99dbf8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "77e4ba81bf7d674496cb2eb31e99dbf8");
                    return;
                }
                d.this.b = 7;
                d.this.d.a(d.this.b);
                d.this.j.setKeepScreenOn(false);
            }
        };
        this.y = new b.c() { // from class: com.meituan.mmp.lib.api.video.d.4
            public static ChangeQuickRedirect a;

            @Override // com.meituan.mmp.lib.api.video.b.c
            public final boolean a(b bVar, int i, int i2) {
                Object[] objArr2 = {bVar, Integer.valueOf(i), Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "af786f65317cee1d3e6c547f456b7644", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "af786f65317cee1d3e6c547f456b7644")).booleanValue();
                }
                if (d.this.b != 4 && i != -38 && i != Integer.MIN_VALUE && i2 != -38 && i2 != Integer.MIN_VALUE) {
                    if (i == -1004 || i == -110 || i == -1010) {
                        d.this.d.a("onVideoResourceError", new JSONObject());
                    }
                    String str = i != -1024 ? (i == -1010 || i == -1007) ? "MEDIA_ERR_SRC_NOT_SUPPORTED" : i != -1004 ? i != -110 ? "MEDIA_ERROR_UNKNOWN" : "MEDIA_ERR_NETWORK" : "MEDIA_ERR_DECODE" : "VIDEO_ERROR";
                    d.this.b = -1;
                    d.this.d.a(d.this.b);
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("errMsg", String.format(Locale.US, "%s(%d,%d)", str, Integer.valueOf(i), Integer.valueOf(i2)));
                    } catch (JSONException unused) {
                    }
                    d.this.d.a("onVideoError", jSONObject);
                }
                return true;
            }
        };
        this.z = new b.d() { // from class: com.meituan.mmp.lib.api.video.d.5
            public static ChangeQuickRedirect a;

            @Override // com.meituan.mmp.lib.api.video.b.d
            public final boolean a(b bVar, int i, int i2) {
                Object[] objArr2 = {bVar, Integer.valueOf(i), Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9e05514af297c58ba9fe35ae306ea833", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9e05514af297c58ba9fe35ae306ea833")).booleanValue();
                }
                if (i == 3) {
                    d.this.b = 3;
                    d.this.d.a(d.this.b);
                } else if (i != 701 && i != 702 && i == 10001 && d.this.k != null) {
                    d.this.k.setRotation(i2);
                }
                return true;
            }
        };
        this.A = new b.a() { // from class: com.meituan.mmp.lib.api.video.d.6
            public static ChangeQuickRedirect a;

            @Override // com.meituan.mmp.lib.api.video.b.a
            public final void a(b bVar, int i) {
                Object[] objArr2 = {bVar, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4f627afded35fd78407bf7f0c79ee0ec", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4f627afded35fd78407bf7f0c79ee0ec");
                } else if (d.this.b == 4) {
                } else {
                    d.this.p = i;
                    JSONObject jSONObject = new JSONObject();
                    try {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("buffered", i);
                        jSONObject.put("data", jSONObject2);
                    } catch (JSONException unused) {
                    }
                    d.this.d.a("onVideoProgress", jSONObject);
                }
            }
        };
        this.B = false;
        this.C = false;
        this.D = false;
        this.h = context;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9107f63bd7318a69d0e10eab7a8549c7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9107f63bd7318a69d0e10eab7a8549c7");
            return;
        }
        this.j = new FrameLayout(this.h);
        this.j.setBackgroundColor(-16777216);
        addView(this.j, new FrameLayout.LayoutParams(-1, -1));
    }

    public final void a(String str, boolean z) {
        boolean z2 = true;
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d52159a94f06adce8fa4489a620b080c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d52159a94f06adce8fa4489a620b080c");
            return;
        }
        this.D = z;
        z2 = (TextUtils.isEmpty(this.n) || TextUtils.equals(str, this.n)) ? false : false;
        String str2 = this.n;
        this.n = str;
        if (z2 || TextUtils.isEmpty(str2)) {
            u();
            v();
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c0626e090f722af7058485459914deca", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c0626e090f722af7058485459914deca");
            } else if (this.k == null) {
                this.k = new g(this.h);
                this.k.setSurfaceTextureListener(this);
            }
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "1bb40c718fa75a1aa809705c02da09e2", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "1bb40c718fa75a1aa809705c02da09e2");
            } else {
                this.j.removeView(this.k);
                this.j.addView(this.k, 0, new FrameLayout.LayoutParams(-1, -1, 17));
            }
            d();
            getController().a();
            w();
        }
    }

    public f getController() {
        return (f) this.d;
    }

    public void setController(e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1cb52e65df9c1f1db96c2ed0d87038e9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1cb52e65df9c1f1db96c2ed0d87038e9");
            return;
        }
        this.j.removeView(this.d);
        this.d = eVar;
        this.d.a();
        this.d.setVideoPlayer(this);
        this.j.addView(this.d, new FrameLayout.LayoutParams(-1, -1));
    }

    public void setPlayerType(int i) {
        this.f = i;
    }

    @Override // com.meituan.mmp.lib.api.video.c
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "60a0e928a96dbc844f6c2e1c01e757d0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "60a0e928a96dbc844f6c2e1c01e757d0");
        } else if (this.b == 0) {
            this.t = true;
        } else if (this.b == 4) {
            this.c.b();
            this.b = 3;
            this.d.a(this.b);
        } else if (this.b == 2) {
            this.c.b();
        } else if (this.b == 1) {
            this.t = true;
        }
    }

    @Override // android.view.View
    public void onAnimationStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f09ceb20edb04ac525a87581afc71118", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f09ceb20edb04ac525a87581afc71118");
        } else {
            super.onAnimationStart();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d2957777e45481b3c0b1c12cea98338", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d2957777e45481b3c0b1c12cea98338");
            return;
        }
        this.d.a(false);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "78cce87bb861b5bd91423183979ec957", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "78cce87bb861b5bd91423183979ec957");
        } else {
            if (this.s) {
                if (o()) {
                    b(true);
                }
                if (p()) {
                    s();
                }
            }
            this.g = 10;
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "1d68c6f9ba350b1e961d68de9e99ce4d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "1d68c6f9ba350b1e961d68de9e99ce4d");
            } else {
                if (this.i != null) {
                    this.i.abandonAudioFocus(null);
                    this.i = null;
                }
                if (this.c != null) {
                    this.c.f();
                    this.c = null;
                }
                this.j.removeView(this.k);
                if (this.m != null) {
                    this.m.release();
                    this.m = null;
                }
                if (this.l != null) {
                    this.l.release();
                    this.l = null;
                }
                this.b = 0;
            }
            if (this.d != null) {
                this.d.a();
            }
            Runtime.getRuntime().gc();
        }
        super.onDetachedFromWindow();
        this.e = null;
    }

    @Override // com.meituan.mmp.lib.api.video.c
    public final void a(boolean z) {
        Object[] objArr = {(byte) 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e1cd8809179479c8f658ba4ff630949", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e1cd8809179479c8f658ba4ff630949");
        } else if (this.b == 4) {
            this.c.b();
            this.b = 3;
            this.d.a(this.b);
        } else if (this.b == 6) {
            this.c.b();
            this.b = 5;
            this.d.a(this.b);
        } else if (this.b == -1) {
            this.c.g();
            w();
        } else if (this.b == 7) {
            this.b = 2;
            this.d.a(this.b);
            this.c.a(0L);
            this.c.b();
            this.b = 3;
            this.d.a(this.b);
        } else if (this.b == 8) {
            this.b = 3;
            this.c.b();
            this.d.b();
            this.d.a(this.b);
        } else if (this.c == null) {
            a();
        } else {
            w();
            a();
        }
    }

    @Override // com.meituan.mmp.lib.api.video.c
    public final boolean d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5fd9e99cfef33c00008c1e18f881af6d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5fd9e99cfef33c00008c1e18f881af6d")).booleanValue();
        }
        if (this.c == null) {
            return false;
        }
        if (this.b == 3) {
            this.c.c();
            this.b = 4;
            this.d.a(this.b);
        }
        if (this.b == 1) {
            this.b = 4;
            this.c.c();
            this.d.a(this.b);
        }
        if (this.b == 5) {
            this.c.c();
            this.b = 6;
            this.d.a(this.b);
        }
        return true;
    }

    @Override // com.meituan.mmp.lib.api.video.c
    public final void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "53b621ff8f6919167b0abd42c20cc8fc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "53b621ff8f6919167b0abd42c20cc8fc");
        } else if (this.c != null) {
            this.c.a(j);
        }
    }

    @Override // com.meituan.mmp.lib.api.video.c
    public final boolean e() {
        return this.b == 0;
    }

    @Override // com.meituan.mmp.lib.api.video.c
    public final boolean f() {
        return this.b == 1;
    }

    @Override // com.meituan.mmp.lib.api.video.c
    public final boolean g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f2d6d56046075e694fbd71e232e35e44", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f2d6d56046075e694fbd71e232e35e44")).booleanValue() : this.b == 2 || h();
    }

    @Override // com.meituan.mmp.lib.api.video.c
    public final boolean l() {
        return this.b == 8;
    }

    @Override // com.meituan.mmp.lib.api.video.c
    public final boolean h() {
        return this.b == 5;
    }

    @Override // com.meituan.mmp.lib.api.video.c
    public final boolean i() {
        return this.b == 6;
    }

    @Override // com.meituan.mmp.lib.api.video.c
    public final boolean j() {
        return this.b == 3;
    }

    @Override // com.meituan.mmp.lib.api.video.c
    public final boolean k() {
        return this.b == 4;
    }

    @Override // com.meituan.mmp.lib.api.video.c
    public final boolean m() {
        return this.b == -1;
    }

    @Override // com.meituan.mmp.lib.api.video.c
    public final boolean n() {
        return this.b == 7;
    }

    @Override // com.meituan.mmp.lib.api.video.c
    public final boolean o() {
        return this.g == 11;
    }

    @Override // com.meituan.mmp.lib.api.video.c
    public final boolean p() {
        return this.g == 12;
    }

    @Override // com.meituan.mmp.lib.api.video.c
    public final boolean q() {
        return this.g == 10;
    }

    @Override // com.meituan.mmp.lib.api.video.c
    public int getMaxVolume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be7237d2ad682bd6f04479cea8568720", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be7237d2ad682bd6f04479cea8568720")).intValue();
        }
        if (this.i != null) {
            return this.i.getStreamMaxVolume(3);
        }
        return 0;
    }

    @Override // com.meituan.mmp.lib.api.video.c
    public int getVolume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c6eddd55e6218c780b3d512bb2fff9e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c6eddd55e6218c780b3d512bb2fff9e")).intValue();
        }
        if (this.i != null) {
            return this.i.getStreamVolume(3);
        }
        return 0;
    }

    @Override // com.meituan.mmp.lib.api.video.c
    public void setVolume(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6806a74fea82421b1224562eca50315b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6806a74fea82421b1224562eca50315b");
        } else if (this.i != null) {
            this.i.setStreamVolume(3, i, 0);
        }
    }

    @Override // com.meituan.mmp.lib.api.video.c
    public long getDuration() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1cf1cfd33c9461fac0f338fccd9eb679", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1cf1cfd33c9461fac0f338fccd9eb679")).longValue();
        }
        if (this.c != null) {
            return this.c.e();
        }
        return 0L;
    }

    @Override // com.meituan.mmp.lib.api.video.c
    public long getCurrentPosition() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "db806d8cf5538f8987d2bcc0caf28fc4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "db806d8cf5538f8987d2bcc0caf28fc4")).longValue();
        }
        if (this.c != null) {
            return this.c.d();
        }
        return 0L;
    }

    @Override // com.meituan.mmp.lib.api.video.c
    public int getBufferPercentage() {
        return this.p;
    }

    private void u() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "45797e502d35aac33ef5a7c730574758", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "45797e502d35aac33ef5a7c730574758");
        } else if (this.i == null) {
            this.i = (AudioManager) getContext().getSystemService("audio");
            this.i.requestAudioFocus(null, 3, 1);
        }
    }

    private void v() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff8a7840f2c9dfe9852601df6c806678", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff8a7840f2c9dfe9852601df6c806678");
        } else if (this.c == null) {
            this.c = new a();
            this.c.a(3);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        Object[] objArr = {surfaceTexture, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a0725a89f4409d054dac6eb6cc2e818", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a0725a89f4409d054dac6eb6cc2e818");
        } else if (this.l == null) {
            this.l = surfaceTexture;
            w();
        } else {
            this.k.setSurfaceTexture(this.l);
        }
    }

    private void w() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c0437604c4bbf4b15d8b5bc2bb68e42", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c0437604c4bbf4b15d8b5bc2bb68e42");
            return;
        }
        this.j.setKeepScreenOn(true);
        setLoop(this.C);
        this.c.a(this.v);
        this.c.a(this.w);
        this.c.a(this.x);
        this.c.a(this.y);
        this.c.a(this.z);
        this.c.a(this.A);
        if (TextUtils.isEmpty(this.n)) {
            this.b = -1;
            this.d.a(this.b);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("errMsg", "MEDIA_ERR_PATH(0,0)");
            } catch (JSONException unused) {
            }
            this.d.a("onVideoError", jSONObject);
            return;
        }
        try {
            this.c.a(this.h.getApplicationContext(), Uri.parse(this.n), this.o);
            if (this.l == null) {
                this.b = -1;
                this.d.a(this.b);
                return;
            }
            if (this.m == null) {
                this.m = new Surface(this.l);
            }
            this.c.a(this.m);
            this.c.a();
            this.b = 1;
            this.d.a(this.b);
        } catch (Exception e) {
            com.meituan.mmp.lib.trace.b.a(e);
            this.b = -1;
            this.d.a(this.b);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        return this.l == null;
    }

    @Override // com.meituan.mmp.lib.api.video.c
    public final void r() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4933d9dac2ddc148eb7d2edd511c21ea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4933d9dac2ddc148eb7d2edd511c21ea");
        } else if (this.g == 11) {
        } else {
            if (this.e != null) {
                this.e.a();
            }
            if (this.k == null) {
                com.meituan.mmp.lib.trace.b.d("video can't enter fullScreen");
                return;
            }
            this.u = getMeasuredWidth();
            int i = getController().g;
            if (i == 0) {
                ((Activity) this.h).setRequestedOrientation(1);
            } else {
                if (i != 90) {
                    if (i == -90) {
                        ((Activity) this.h).setRequestedOrientation(8);
                    } else if (this.k.getMeasuredWidth() < this.k.getMeasuredHeight()) {
                        ((Activity) this.h).setRequestedOrientation(1);
                    }
                }
                ((Activity) this.h).setRequestedOrientation(0);
            }
            ViewGroup viewGroup = (ViewGroup) ((Activity) this.h).findViewById(16908290);
            if (this.g == 12) {
                viewGroup.removeView(this.j);
            } else {
                removeView(this.j);
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            if (this.j.getParent() != null) {
                ((ViewGroup) this.j.getParent()).removeView(this.j);
            }
            viewGroup.addView(this.j, layoutParams);
            if (this.r) {
                a();
            }
            this.g = 11;
            this.d.b(this.g);
            View decorView = ((Activity) this.h).getWindow().getDecorView();
            if (Build.VERSION.SDK_INT < 19) {
                decorView.setSystemUiVisibility(8);
                return;
            }
            this.E = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(5126);
        }
    }

    @Override // com.meituan.mmp.lib.api.video.c
    public final boolean b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a3ec7c355e2a10c41a19a0b069e35457", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a3ec7c355e2a10c41a19a0b069e35457")).booleanValue();
        }
        if (this.g == 11) {
            ((Activity) this.h).setRequestedOrientation(1);
            if (Build.VERSION.SDK_INT > 19) {
                ((Activity) this.h).getWindow().getDecorView().setSystemUiVisibility(this.E);
            }
            ((ViewGroup) ((Activity) this.h).findViewById(16908290)).removeView(this.j);
            addView(this.j, new FrameLayout.LayoutParams(-1, -1));
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            layoutParams.width = this.u;
            setLayoutParams(layoutParams);
            this.g = 10;
            this.d.b(this.g);
            if (z && this.e != null) {
                this.e.b();
            }
            return true;
        }
        return false;
    }

    @Override // com.meituan.mmp.lib.api.video.c
    public final boolean s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "528b7f65ab2887ee1038f4c76959cb3e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "528b7f65ab2887ee1038f4c76959cb3e")).booleanValue();
        }
        if (this.g == 12) {
            ((ViewGroup) ((Activity) this.h).findViewById(16908290)).removeView(this.j);
            addView(this.j, new FrameLayout.LayoutParams(-1, -1));
            this.g = 10;
            this.d.b(this.g);
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d1696e19aea7c98168589cd02d9f109b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d1696e19aea7c98168589cd02d9f109b");
            return;
        }
        super.onAttachedToWindow();
        this.d.a(true);
    }

    public void setMute(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6cd798fb673edb207c33cc90a5730e81", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6cd798fb673edb207c33cc90a5730e81");
            return;
        }
        this.B = z;
        if (this.c == null) {
            u();
            v();
        }
        this.c.a(z);
    }

    public void setLoop(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "24998fb14a309999e3b1a7e30cc2213c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "24998fb14a309999e3b1a7e30cc2213c");
            return;
        }
        this.C = z;
        if (this.c != null) {
            this.c.b(z);
        }
    }

    @Override // com.meituan.msi.view.e
    public final boolean c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e0c4bb5e1a6900051264fa7ab425db6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e0c4bb5e1a6900051264fa7ab425db6")).booleanValue();
        }
        if (o()) {
            b(false);
            return true;
        }
        return false;
    }

    @Override // com.meituan.msi.view.e
    public final boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd57a6a9f4045735c1a45ea8e3ee6af1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd57a6a9f4045735c1a45ea8e3ee6af1")).booleanValue();
        }
        if (o()) {
            b(true);
            return true;
        }
        return false;
    }

    @Override // com.meituan.msi.view.e
    public final void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa21f08569d9d1bbd6062d384fd32198", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa21f08569d9d1bbd6062d384fd32198");
        } else if (this.b == 3 || this.b == 5) {
            if (o()) {
                b(false);
            }
            this.r = d();
        } else {
            this.r = false;
        }
    }

    @Override // com.meituan.msi.view.e
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b4455a0e5f59433f23cc77f8e9e32b0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b4455a0e5f59433f23cc77f8e9e32b0");
        } else if (this.r) {
            a();
            this.r = false;
        }
    }

    public void setPlayCalled(boolean z) {
        this.t = z;
    }

    @Override // com.meituan.mmp.lib.api.video.c
    public final boolean t() {
        return (this.D || this.t) ? false : true;
    }
}

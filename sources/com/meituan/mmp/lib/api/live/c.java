package com.meituan.mmp.lib.api.live;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.widget.FrameLayout;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.dianping.titans.js.JsBridgeResult;
import com.meituan.mmp.lib.AppBrandHeraActivity;
import com.meituan.mmp.lib.pip.d;
import com.meituan.mmp.lib.pip.g;
import com.meituan.mmp.lib.utils.bc;
import com.meituan.msi.view.e;
import com.meituan.passport.api.AbsApiFactory;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtlive.player.library.a;
import java.math.BigDecimal;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class c extends FrameLayout implements e, com.sankuai.meituan.mtlive.player.library.b {
    public static ChangeQuickRedirect a;
    protected boolean A;
    protected b B;
    private d C;
    private float D;
    private float E;
    private int F;
    private String G;
    public String b;
    public String c;
    public String d;
    public int e;
    public String f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public com.meituan.mmp.lib.pip.a q;
    public boolean r;
    public int s;
    public com.sankuai.meituan.mtlive.player.library.view.a t;
    public com.sankuai.meituan.mtlive.player.library.d u;
    protected com.meituan.mmp.lib.interfaces.c v;
    protected String w;
    protected String x;
    protected int y;
    protected String z;

    @Override // com.meituan.msi.view.e
    public final boolean b() {
        return false;
    }

    @Override // com.meituan.msi.view.e
    public final boolean c(String str) {
        return false;
    }

    public c(Context context, @NonNull com.meituan.mmp.lib.interfaces.c cVar, String str, int i) {
        super(context);
        Object[] objArr = {context, cVar, str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f71a28e3759b711af8b9e01dd73b20b7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f71a28e3759b711af8b9e01dd73b20b7");
            return;
        }
        this.b = "vertical";
        this.c = "contain";
        this.d = "speaker";
        this.f = null;
        this.D = 1.0f;
        this.E = 3.0f;
        this.A = false;
        this.v = cVar;
        this.F = i;
        a(context);
        this.u = new com.sankuai.meituan.mtlive.player.library.d();
        this.w = str;
        a();
    }

    private void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "843a655aea32e80206402f1aebd72a33", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "843a655aea32e80206402f1aebd72a33");
            return;
        }
        if (this.t == null) {
            this.t = new com.sankuai.meituan.mtlive.player.library.view.a(getContext().getApplicationContext());
            this.t.setBackgroundColor(-16777216);
        }
        d();
        if (this.B == null) {
            this.B = new b(context.getApplicationContext(), this.F);
            this.B.b(true);
            this.B.a(this.t);
            this.B.a(this);
        }
    }

    private void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "59af413941cd7defa92c509c1f1bf189", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "59af413941cd7defa92c509c1f1bf189");
        } else if (this.t.getParent() == this) {
        } else {
            addView(bc.a(this.t), new FrameLayout.LayoutParams(-1, -1));
        }
    }

    public final c a(String str) {
        this.x = str;
        return this;
    }

    public final c a(int i) {
        this.y = i;
        return this;
    }

    public final c b(String str) {
        this.z = str;
        return this;
    }

    public void setToken(String str) {
        this.G = str;
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7089d0cbe86231d848fda6d47b025d3b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7089d0cbe86231d848fda6d47b025d3b");
        } else {
            this.B.a(new a.b() { // from class: com.meituan.mmp.lib.api.live.c.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.meituan.mtlive.player.library.a.b
                public final void a(int i) {
                    Object[] objArr2 = {Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c54d374e05021ffea75dd6c26baf820c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c54d374e05021ffea75dd6c26baf820c");
                        return;
                    }
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("livePlayerId", c.this.w);
                        jSONObject.put("volume", i);
                    } catch (JSONException unused) {
                    }
                    c.this.v.a("onLivePlayerAudioVolume", jSONObject, c.this.y);
                }
            });
        }
    }

    @Override // com.meituan.msi.view.e
    public final void b(final int i) {
        boolean z;
        d dVar;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2cb1e053b7438a21de7534ecf8a5c630", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2cb1e053b7438a21de7534ecf8a5c630");
        } else if (this.B == null) {
        } else {
            com.meituan.mmp.lib.trace.b.a("LivePlayerView", "onPagePaused", Integer.valueOf(i));
            if (256 != i && this.B.a() && 3 != i) {
                Object[] objArr2 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "831b454effe2d609695401291371238f", RobustBitConfig.DEFAULT_VALUE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "831b454effe2d609695401291371238f")).booleanValue();
                } else {
                    boolean a2 = com.meituan.mmp.lib.pip.a.a(i);
                    if (this.B != null && this.B.a() && com.meituan.mmp.lib.pip.a.a(a2, this.q)) {
                        Object[] objArr3 = {Integer.valueOf(i)};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "623e42cdc391be52dffd475b995065fd", RobustBitConfig.DEFAULT_VALUE)) {
                            z = ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "623e42cdc391be52dffd475b995065fd")).booleanValue();
                        } else {
                            if (getContext() instanceof Activity) {
                                Activity activity = (Activity) getContext();
                                Object[] objArr4 = {Integer.valueOf(i)};
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "5e27ba1fa52c7fbc4de1b06d8d9d513c", RobustBitConfig.DEFAULT_VALUE)) {
                                    dVar = (d) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "5e27ba1fa52c7fbc4de1b06d8d9d513c");
                                } else {
                                    if (this.C == null) {
                                        this.C = new d();
                                        this.C.a = this.x;
                                        this.C.b = this.y;
                                        this.C.d = this.w;
                                        this.C.c = getContext() instanceof Activity ? ((Activity) getContext()).getIntent() : null;
                                        this.C.f = this.t;
                                        this.C.h = getContext() instanceof AppBrandHeraActivity;
                                        this.C.g = new g() { // from class: com.meituan.mmp.lib.api.live.c.2
                                            public static ChangeQuickRedirect a;

                                            @Override // com.meituan.mmp.lib.pip.g
                                            public final boolean a(com.meituan.mmp.lib.pip.b bVar) {
                                                Object[] objArr5 = {bVar};
                                                ChangeQuickRedirect changeQuickRedirect5 = a;
                                                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "bf0ebc044e67c685690091c921e48b51", RobustBitConfig.DEFAULT_VALUE)) {
                                                    return ((Boolean) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "bf0ebc044e67c685690091c921e48b51")).booleanValue();
                                                }
                                                c.this.r = false;
                                                if (i == 2) {
                                                    c.this.a(true);
                                                } else if (bVar != com.meituan.mmp.lib.pip.b.PAGE_RE_ENTER) {
                                                    c.this.e();
                                                }
                                                Object[] objArr6 = new Object[3];
                                                objArr6[0] = Boolean.valueOf(c.this.B != null && c.this.B.a());
                                                objArr6[1] = Integer.valueOf(i);
                                                objArr6[2] = bVar;
                                                com.meituan.mmp.lib.trace.b.a("onLeavePipMode", objArr6);
                                                return false;
                                            }
                                        };
                                        this.C.e = this.z;
                                    }
                                    dVar = this.C;
                                }
                                this.r = com.meituan.mmp.lib.pip.e.a(activity, dVar);
                            }
                            z = this.r;
                        }
                    } else {
                        z = false;
                    }
                }
                if (z) {
                    return;
                }
            }
            if (i == 1 || i == 2 || i == 3) {
                if (this.m) {
                    e();
                    com.meituan.mmp.lib.trace.b.a("LivePlayerView", "autoPauseIfNavigate pause", Integer.valueOf(i));
                }
            } else if ((i == 16 || i == 17) && this.n) {
                e();
                com.meituan.mmp.lib.trace.b.a("LivePlayerView", "autoPauseIfOpenNative pause", Integer.valueOf(i));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "519535c0419511298f6b6051b8b2706e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "519535c0419511298f6b6051b8b2706e");
        } else if (this.B == null || !this.B.a()) {
        } else {
            this.B.c();
            this.A = true;
        }
    }

    @Override // com.meituan.msi.view.e
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9067dec3b97b954c0be012afd68f312c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9067dec3b97b954c0be012afd68f312c");
        } else if (this.B == null) {
        } else {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9864d9fc74c6439c9382b109f8a5f9c8", RobustBitConfig.DEFAULT_VALUE)) {
                ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9864d9fc74c6439c9382b109f8a5f9c8")).booleanValue();
            } else {
                if (this.r) {
                    com.meituan.mmp.lib.pip.b bVar = com.meituan.mmp.lib.pip.b.PAGE_RE_ENTER;
                    Object[] objArr3 = {bVar};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ca041acca68c4b5d049ffb36a08b5441", RobustBitConfig.DEFAULT_VALUE)) {
                        ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "ca041acca68c4b5d049ffb36a08b5441")).booleanValue();
                    } else {
                        this.r = false;
                        com.meituan.mmp.lib.pip.e.a(bVar);
                    }
                } else if (this.A) {
                    com.meituan.mmp.lib.pip.e.c();
                }
                a(getContext());
            }
            if (this.A) {
                b bVar2 = this.B;
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = b.a;
                if (PatchProxy.isSupport(objArr4, bVar2, changeQuickRedirect4, false, "01f6949524f3e68c2d0aeaf317d8ac03", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, bVar2, changeQuickRedirect4, false, "01f6949524f3e68c2d0aeaf317d8ac03");
                } else {
                    bVar2.d.d();
                }
                this.A = false;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d60785f3d5d471ff709ba25be0b74c53", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d60785f3d5d471ff709ba25be0b74c53");
            return;
        }
        super.onDetachedFromWindow();
        a(!this.r);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7f975087a3d06cec374a799d226f0f3e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7f975087a3d06cec374a799d226f0f3e");
        } else if (this.B == null || !z) {
        } else {
            this.B.a((com.sankuai.meituan.mtlive.player.library.b) null);
            this.B.b();
            this.B.a((com.sankuai.meituan.mtlive.player.library.view.a) null);
            this.B.d();
            this.B = null;
        }
    }

    @Override // com.sankuai.meituan.mtlive.player.library.b
    public final void a(int i, Bundle bundle) {
        Object[] objArr = {Integer.valueOf(i), bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fcaf13707b3a076c65844a6938778938", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fcaf13707b3a076c65844a6938778938");
        } else if (this.k) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("errCode", i);
                if (bundle != null) {
                    jSONObject.put("errMsg", bundle.getString("EVT_MSG"));
                    JSONObject jSONObject2 = new JSONObject();
                    for (String str : bundle.keySet()) {
                        jSONObject2.put(str, bundle.get(str));
                    }
                    jSONObject.put("info", jSONObject2);
                }
                jSONObject.put("livePlayerId", this.w);
            } catch (JSONException unused) {
            }
            this.v.a("onLivePlayerEvent", jSONObject, this.y);
        }
    }

    @Override // com.sankuai.meituan.mtlive.player.library.b
    public final void a(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "113ac54af0cd3fdbfc11d4502469e627", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "113ac54af0cd3fdbfc11d4502469e627");
        } else if (this.l) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("livePlayerId", this.w);
                JSONObject jSONObject2 = new JSONObject();
                if (bundle != null) {
                    for (String str : bundle.keySet()) {
                        jSONObject2.put(str, bundle.get(str));
                    }
                }
                jSONObject.put("info", jSONObject2);
            } catch (JSONException unused) {
            }
            this.v.a("onLivePlayerNetStatus", jSONObject, this.y);
        }
    }

    public final void a(Bundle bundle, boolean z) {
        Object[] objArr = {bundle, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e4dd1980c4498cff8b709a76f14314da", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e4dd1980c4498cff8b709a76f14314da");
            return;
        }
        boolean z2 = this.g;
        b bVar = this.B;
        if (bundle.keySet().contains("muteAudio")) {
            z2 = bundle.getBoolean("muteAudio");
        } else if (bundle.keySet().contains("muted")) {
            z2 = bundle.getBoolean("muted");
        }
        if (z || z2 != this.g) {
            bVar.a(z2);
        }
        this.g = z2;
        boolean z3 = bundle.getBoolean("muteVideo", this.h);
        if (z || z3 != this.h) {
            this.B.c = this.h;
        }
        this.h = z3;
        String string = bundle.getString(DMKeys.KEY_GRADIENT_COLOR_INFO_ORIENTATION, this.b);
        if (z || !string.equalsIgnoreCase(this.b)) {
            if (string.equalsIgnoreCase("horizontal")) {
                bVar.b(270);
            } else if (string.equalsIgnoreCase("vertical")) {
                bVar.b(0);
            }
        }
        this.b = string;
        String string2 = bundle.getString("objectFit", this.c);
        if (z || !string2.equalsIgnoreCase(this.c)) {
            if (string2.equalsIgnoreCase("fillCrop")) {
                bVar.a(0);
            } else if (string2.equalsIgnoreCase("contain")) {
                bVar.a(1);
            }
        }
        this.c = string2;
        if (bundle.keySet().contains("soundMode")) {
            this.d = bundle.getString("soundMode", this.d);
            if (this.d.equalsIgnoreCase("speaker")) {
                bVar.c(0);
            } else if (this.d.equalsIgnoreCase("ear")) {
                bVar.c(1);
            }
        }
        this.D = bundle.getFloat("minCache", this.D);
        this.E = bundle.getFloat("maxCache", this.E);
        float min = Math.min(this.D, this.E);
        this.E = Math.max(this.D, this.E);
        this.D = min;
        this.u.a(true);
        this.u.a(this.D);
        this.u.c(this.D);
        this.u.b(this.E);
        this.p = bundle.getBoolean("enableRecvMessage", this.p);
        this.u.b(this.p);
        b bVar2 = this.B;
        com.sankuai.meituan.mtlive.player.library.d dVar = this.u;
        Object[] objArr2 = {dVar};
        ChangeQuickRedirect changeQuickRedirect2 = b.a;
        if (PatchProxy.isSupport(objArr2, bVar2, changeQuickRedirect2, false, "38638f04fc1d27280e21b82bb1d3d5eb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, bVar2, changeQuickRedirect2, false, "38638f04fc1d27280e21b82bb1d3d5eb");
        } else {
            bVar2.d.a(dVar);
        }
        this.k = bundle.getBoolean("needEvent", this.k);
        this.l = bundle.getBoolean("needNetStatus", this.l);
        this.m = bundle.getBoolean("autoPauseIfNavigate", this.m);
        this.n = bundle.getBoolean("autoPauseIfOpenNative", this.n);
        if (bundle.keySet().contains("pictureInPictureMode")) {
            this.q = com.meituan.mmp.lib.pip.a.a(bundle.getString("pictureInPictureMode", ""));
        }
        if (bundle.keySet().contains("enableHardwareDecode")) {
            this.B.b(bundle.getBoolean("enableHardwareDecode"));
        }
        boolean z4 = bundle.getBoolean("needAudioVolume", this.o);
        if (z4 != this.o) {
            Object[] objArr3 = {300};
            ChangeQuickRedirect changeQuickRedirect3 = b.a;
            if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "1aa4f84be1404760b8c5b706d8b6c4ee", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "1aa4f84be1404760b8c5b706d8b6c4ee");
            } else {
                bVar.b = 300;
                bVar.d.d(300);
            }
        }
        this.o = z4;
        boolean z5 = bundle.getBoolean("debug", this.i);
        if (z5 != this.i) {
            Object[] objArr4 = {Byte.valueOf(z5 ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect4 = b.a;
            if (PatchProxy.isSupport(objArr4, bVar, changeQuickRedirect4, false, "7098947871425654bce9df282c3b7bf8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, bVar, changeQuickRedirect4, false, "7098947871425654bce9df282c3b7bf8");
            } else {
                bVar.d.a(z5);
            }
        }
        this.i = z5;
    }

    public static Bundle a(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8c6427bf31210ee45d7bb5202e964f8d", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bundle) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8c6427bf31210ee45d7bb5202e964f8d");
        }
        Bundle bundle = new Bundle();
        if (jSONObject.has("playUrl")) {
            bundle.putString("playUrl", jSONObject.optString("playUrl"));
        }
        if (jSONObject.has(JsBridgeResult.ARG_KEY_LOCATION_MODE)) {
            bundle.putInt(JsBridgeResult.ARG_KEY_LOCATION_MODE, jSONObject.optInt(JsBridgeResult.ARG_KEY_LOCATION_MODE));
        }
        if (jSONObject.has("autoplay")) {
            bundle.putBoolean("autoplay", jSONObject.optBoolean("autoplay"));
        }
        if (jSONObject.has("muted")) {
            bundle.putBoolean("muted", jSONObject.optBoolean("muted"));
        }
        if (jSONObject.has("muteAudio")) {
            bundle.putBoolean("muteAudio", jSONObject.optBoolean("muteAudio"));
        }
        if (jSONObject.has("muteVideo")) {
            bundle.putBoolean("muteVideo", jSONObject.optBoolean("muteVideo"));
        }
        if (jSONObject.has(DMKeys.KEY_GRADIENT_COLOR_INFO_ORIENTATION)) {
            bundle.putString(DMKeys.KEY_GRADIENT_COLOR_INFO_ORIENTATION, jSONObject.optString(DMKeys.KEY_GRADIENT_COLOR_INFO_ORIENTATION));
        }
        if (jSONObject.has("objectFit")) {
            bundle.putString("objectFit", jSONObject.optString("objectFit"));
        }
        if (jSONObject.has("backgroundMute")) {
            bundle.putBoolean("backgroundMute", jSONObject.optBoolean("backgroundMute"));
        }
        if (jSONObject.has("minCache")) {
            bundle.putFloat("minCache", BigDecimal.valueOf(jSONObject.optDouble("minCache")).floatValue());
        }
        if (jSONObject.has("maxCache")) {
            bundle.putFloat("maxCache", BigDecimal.valueOf(jSONObject.optDouble("maxCache")).floatValue());
        }
        if (jSONObject.has("enableRecvMessage")) {
            bundle.putBoolean("enableRecvMessage", jSONObject.optBoolean("enableRecvMessage"));
        }
        if (jSONObject.has("needEvent")) {
            bundle.putBoolean("needEvent", jSONObject.optBoolean("needEvent"));
        }
        if (jSONObject.has("needNetStatus")) {
            bundle.putBoolean("needNetStatus", jSONObject.optBoolean("needNetStatus"));
        }
        if (jSONObject.has("needAudioVolume")) {
            bundle.putBoolean("needAudioVolume", jSONObject.optBoolean("needAudioVolume"));
        }
        if (jSONObject.has("debug")) {
            bundle.putBoolean("debug", jSONObject.optBoolean("debug"));
        }
        if (jSONObject.has("soundMode")) {
            bundle.putString("soundMode", jSONObject.optString("soundMode"));
        }
        if (jSONObject.has("autoPauseIfNavigate")) {
            bundle.putBoolean("autoPauseIfNavigate", jSONObject.optBoolean("autoPauseIfNavigate"));
        }
        if (jSONObject.has("autoPauseIfOpenNative")) {
            bundle.putBoolean("autoPauseIfOpenNative", jSONObject.optBoolean("autoPauseIfOpenNative"));
        }
        if (jSONObject.has("pictureInPictureMode")) {
            bundle.putString("pictureInPictureMode", jSONObject.optString("pictureInPictureMode"));
        }
        if (jSONObject.has("enableHardwareDecode")) {
            bundle.putBoolean("enableHardwareDecode", jSONObject.optBoolean("enableHardwareDecode"));
        }
        return bundle;
    }

    public final int b(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "66a598d689cb0585e183bd057820de21", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "66a598d689cb0585e183bd057820de21")).intValue();
        }
        this.e = bundle.getInt(JsBridgeResult.ARG_KEY_LOCATION_MODE, this.e);
        if (this.e != 1) {
            return 5;
        }
        return (this.f == null || !((this.f.startsWith(AbsApiFactory.HTTP) || this.f.startsWith(AbsApiFactory.HTTPS)) && this.f.contains(".flv"))) ? 0 : 1;
    }
}

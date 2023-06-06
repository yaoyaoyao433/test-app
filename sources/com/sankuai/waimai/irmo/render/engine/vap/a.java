package com.sankuai.waimai.irmo.render.engine.vap;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.animplayer.e;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.waimai.irmo.mach.c;
import com.sankuai.waimai.irmo.mach.vap.VapAnimLoadManager;
import com.sankuai.waimai.irmo.mach.vap.f;
import com.sankuai.waimai.irmo.render.a;
import com.sankuai.waimai.irmo.render.engine.g;
import com.sankuai.waimai.irmo.utils.d;
import com.squareup.picasso.PicassoGifDrawable;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends e implements e.a, VapAnimLoadManager.a {
    public static ChangeQuickRedirect b;
    public com.sankuai.waimai.irmo.mach.vap.e c;
    public boolean d;
    public g e;
    public com.sankuai.waimai.irmo.render.a f;
    public boolean g;
    public VapAnimLoadManager h;
    private long i;
    private boolean j;
    private boolean k;
    private boolean l;
    private boolean m;
    private ImageView n;
    private ImageView o;
    private ImageView p;
    private com.sankuai.waimai.irmo.mach.b q;

    public static /* synthetic */ boolean a(a aVar, boolean z) {
        aVar.k = true;
        return true;
    }

    public a(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ce66dd431fe37a150d63c9c47c05b93", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ce66dd431fe37a150d63c9c47c05b93");
            return;
        }
        this.o = null;
        this.p = null;
        this.g = false;
    }

    private void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2750a3b3895fd4fe582c354a0b0f9587", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2750a3b3895fd4fe582c354a0b0f9587");
        } else if (this.c == null) {
        } else {
            com.sankuai.meituan.animplayer.b bVar = new com.sankuai.meituan.animplayer.b(null);
            bVar.c = false;
            bVar.e = false;
            bVar.d = false;
            setConfig(bVar);
            setPlayCount(this.c.a);
            setContentMode(this.c.e);
            setAnimPlayerListener(this);
        }
    }

    private void setPlayCount(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8989e8a356f4cb141891f486fd2eff03", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8989e8a356f4cb141891f486fd2eff03");
            return;
        }
        if (i < 0) {
            i = -1;
        }
        setLoopCount(i);
    }

    private void setContentMode(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "120a7713d78fb66e93e9ce1f79349485", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "120a7713d78fb66e93e9ce1f79349485");
        } else if (i == 0) {
            setScaleType(com.sankuai.meituan.animplayer.utils.a.ScaleToFill);
            d.b("IrmoVapVideoView_Irmo 设置ContentMode 0 : " + com.sankuai.meituan.animplayer.utils.a.ScaleToFill, new Object[0]);
        } else {
            switch (i) {
                case 2:
                    setScaleType(com.sankuai.meituan.animplayer.utils.a.ScaleAspectFill);
                    d.b("IrmoVapVideoView_Irmo 设置ContentMode 2 : " + com.sankuai.meituan.animplayer.utils.a.ScaleAspectFill, new Object[0]);
                    return;
                case 3:
                    setScaleType(com.sankuai.meituan.animplayer.utils.a.ScaleWidthFit);
                    d.b("IrmoVapVideoView_Irmo 设置ContentMode 3 : " + com.sankuai.meituan.animplayer.utils.a.ScaleWidthFit, new Object[0]);
                    return;
                case 4:
                    setScaleType(com.sankuai.meituan.animplayer.utils.a.ScaleHeightFit);
                    d.b("IrmoVapVideoView_Irmo 设置ContentMode 4 : " + com.sankuai.meituan.animplayer.utils.a.ScaleHeightFit, new Object[0]);
                    return;
                default:
                    setScaleType(com.sankuai.meituan.animplayer.utils.a.ScaleAspectFitCenter);
                    d.b("IrmoVapVideoView_Irmo 设置ContentMode  1:  " + com.sankuai.meituan.animplayer.utils.a.ScaleAspectFitCenter, new Object[0]);
                    return;
            }
        }
    }

    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "25a97a07a04a1df671674f3bf1f238d7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "25a97a07a04a1df671674f3bf1f238d7");
        } else if (this.c == null || TextUtils.isEmpty(this.c.p)) {
        } else {
            i();
            this.i = SystemClock.elapsedRealtime();
            j();
            k();
            this.q.a(this.c, new File(this.c.p));
            com.sankuai.waimai.foundation.utils.log.a.a("IrmoVapVideoView_Irmo", "startPlay() 播放视频路径:" + this.c.p, new Object[0]);
            a(this.c.p);
        }
    }

    @Override // com.sankuai.meituan.animplayer.e
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a6624ec0e85d0d8a0023fd48523c40d6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a6624ec0e85d0d8a0023fd48523c40d6");
            return;
        }
        super.a();
        a(a.EnumC0973a.effect_stop, (Map<String, Object>) null);
    }

    @Override // com.sankuai.meituan.animplayer.e
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe84f8f23f01b074d5a0f71a206283fd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe84f8f23f01b074d5a0f71a206283fd");
            return;
        }
        d.b("IrmoVapVideoView_Irmo release()  , this: " + this, new Object[0]);
        super.b();
        this.m = true;
        d.b("IrmoVapVideoView_Irmo set Release : " + this.m + " this: " + this, new Object[0]);
    }

    private void j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4114d4a137aa1e8d1a4eb29c0c3c203a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4114d4a137aa1e8d1a4eb29c0c3c203a");
        } else if (!this.j || this.o == null) {
        } else {
            ViewParent parent = this.o.getParent();
            if (parent instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) parent;
                int indexOfChild = viewGroup.indexOfChild(this.o);
                viewGroup.removeViewAt(indexOfChild);
                this.o = null;
                this.j = false;
                d.a("IrmoVapVideoView_Irmo 移除最后一帧 " + this, new Object[0]);
                if (getParent() == null) {
                    viewGroup.addView(this, indexOfChild);
                    d.a("IrmoVapVideoView_Irmo 添加视频播放器View " + this, new Object[0]);
                }
            }
        }
    }

    private void k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "204846ec37fd47fe2c9628aa149f6248", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "204846ec37fd47fe2c9628aa149f6248");
        } else if (!this.k || this.p == null) {
        } else {
            ViewParent parent = this.p.getParent();
            if (parent instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) parent;
                int indexOfChild = viewGroup.indexOfChild(this.p);
                viewGroup.removeViewAt(indexOfChild);
                this.p = null;
                this.k = false;
                d.a("IrmoVapVideoView_Irmo 移除错误图片 " + this, new Object[0]);
                if (getParent() == null) {
                    viewGroup.addView(this, indexOfChild);
                    d.a("IrmoVapVideoView_Irmo 添加视频View " + this, new Object[0]);
                }
            }
        }
    }

    @Override // com.sankuai.meituan.animplayer.e.a
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a9c03942db93058e90e3ac3e34cd9356", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a9c03942db93058e90e3ac3e34cd9356");
            return;
        }
        StringBuilder sb = new StringBuilder("onVideoStart, count: ");
        sb.append(i);
        sb.append(" url: ");
        sb.append(this.c != null ? this.c.p : "");
        com.sankuai.waimai.foundation.utils.log.a.a("IrmoVapVideoView_Irmo", sb.toString(), new Object[0]);
        setStarting(true);
        if (!this.l) {
            this.m = false;
        }
        if (this.n != null && i == 1) {
            postDelayed(new Runnable() { // from class: com.sankuai.waimai.irmo.render.engine.vap.a.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f17f5f0dd842c64b463e8a772a3e66c3", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f17f5f0dd842c64b463e8a772a3e66c3");
                        return;
                    }
                    a.this.n.setVisibility(8);
                    d.b("IrmoVapVideoView_Irmo 隐藏首帧图", new Object[0]);
                }
            }, 40L);
        }
        HashMap hashMap = new HashMap();
        hashMap.put("count", Integer.valueOf(i));
        a(a.EnumC0973a.effect_start, hashMap);
        if (i == 1) {
            c.a(c.a(this.c), 1, "EffectPrepareTime", Float.valueOf(((float) (SystemClock.elapsedRealtime() - this.i)) / 1000.0f), this.d);
            c.a(c.a(this.c), 1, "EffectRenderSuccess", (Number) 1, this.d);
            if (this.e != null) {
                this.e.a(this.c != null ? this.c.j : null, true);
                this.e = null;
            }
        }
    }

    @Override // com.sankuai.meituan.animplayer.e.a
    public final void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac26fb615e9d78e3d09d7b9a6d76a109", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac26fb615e9d78e3d09d7b9a6d76a109");
            return;
        }
        com.sankuai.waimai.foundation.utils.log.a.a("IrmoVapVideoView_Irmo", "onVideoEnd, remain: " + i, new Object[0]);
        if (i == 0) {
            setStarting(false);
            if ((this.c == null || this.c.f) ? false : true) {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = b;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "808c1375942ec979a255fad26c4005b8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "808c1375942ec979a255fad26c4005b8");
                } else {
                    Bitmap a = f.a(this);
                    this.o = l();
                    if (this.o != null) {
                        d.a("IrmoVapVideoView_Irmo 添加最后一帧 " + this, new Object[0]);
                        this.o.setImageBitmap(a);
                        this.j = true;
                    }
                }
            }
        }
        HashMap hashMap = new HashMap();
        hashMap.put("remain", Integer.valueOf(i));
        a(a.EnumC0973a.effect_finished, hashMap);
    }

    @Override // com.sankuai.meituan.animplayer.e.a
    public final void a(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dcc1e97409e189c5fd86e0c15e4daccf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dcc1e97409e189c5fd86e0c15e4daccf");
        } else {
            com.sankuai.waimai.foundation.utils.log.a.a("IrmoVapVideoView_Irmo", "onComplete", new Object[0]);
        }
    }

    @Override // com.sankuai.meituan.animplayer.e.a
    public final void a(boolean z, Map<String, Object> map) {
        String str;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), map};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4cf4ace2498a7e1f286894fd5b673f66", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4cf4ace2498a7e1f286894fd5b673f66");
            return;
        }
        d.b("IrmoVapVideoView_Irmo onError--started-" + z + ",extra-" + map, new Object[0]);
        setStarting(false);
        if (this.n != null && this.n.getVisibility() == 0) {
            postDelayed(new Runnable() { // from class: com.sankuai.waimai.irmo.render.engine.vap.a.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f9c0fb7cb7e434076c82a7b0ada602fe", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f9c0fb7cb7e434076c82a7b0ada602fe");
                        return;
                    }
                    a.this.n.setVisibility(8);
                    d.b("IrmoVapVideoView_Irmo 隐藏首帧图", new Object[0]);
                }
            }, 40L);
        }
        a(a.EnumC0973a.effect_failed, (Map<String, Object>) null);
        if (map != null) {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                try {
                    jSONObject.put(entry.getKey(), entry.getValue());
                } catch (Exception e) {
                    com.sankuai.waimai.foundation.utils.log.a.a("IrmoVapVideoView_Irmo", "collect error info fail", e);
                }
            }
            str = jSONObject.toString();
        } else {
            str = null;
        }
        c.a(c.a(this.c), "EffectRenderSuccess", (Number) 0, str, this.d);
        b();
        g();
        if (this.e != null) {
            this.e.a(this.c != null ? this.c.j : null, false);
            this.e = null;
        }
    }

    public final void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "37637a032a6ad11faa1b4d2f1b8fbaf6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "37637a032a6ad11faa1b4d2f1b8fbaf6");
        } else if (this.c == null || TextUtils.isEmpty(this.c.o)) {
        } else {
            d.b("IrmoVapVideoView_Irmo 添加错误图 path:" + this.c.o, new Object[0]);
            b.C0608b b2 = b(this.c.o);
            b2.b = getContext();
            b2.a(new com.sankuai.meituan.mtimageloader.utils.b() { // from class: com.sankuai.waimai.irmo.render.engine.vap.a.3
                public static ChangeQuickRedirect a;

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.sankuai.meituan.mtimageloader.utils.b, com.sankuai.meituan.mtimageloader.utils.d
                public final void a(Drawable drawable) {
                    Object[] objArr2 = {drawable};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fb6b94aa870373b7f6f3ab025417e46d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fb6b94aa870373b7f6f3ab025417e46d");
                        return;
                    }
                    ImageView l = a.this.l();
                    if (l != null) {
                        l.setImageDrawable(drawable);
                        if (drawable instanceof PicassoGifDrawable) {
                            ((PicassoGifDrawable) drawable).start();
                        }
                        a.a(a.this, true);
                        a.this.p = l;
                        d.b("IrmoVapVideoView_Irmo  展示错误图ing ", new Object[0]);
                    }
                }

                @Override // com.sankuai.meituan.mtimageloader.utils.b, com.sankuai.meituan.mtimageloader.utils.d
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "05249c147c56f9c838d4a0e016200f28", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "05249c147c56f9c838d4a0e016200f28");
                    } else {
                        d.b("IrmoVapVideoView_Irmo addErrorImg onFailed", new Object[0]);
                    }
                }
            });
        }
    }

    public final void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc1e11aca23ebfaddee9fbcadd716b77", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc1e11aca23ebfaddee9fbcadd716b77");
        } else if (this.c == null || TextUtils.isEmpty(this.c.q)) {
        } else {
            if (this.c.e == 1 || this.c.e == 2) {
                d.b("IrmoVapVideoView_Irmo 添加首帧图 path:" + this.c.q, new Object[0]);
                b.C0608b b2 = b(this.c.q);
                b2.b = getContext();
                b2.a(new com.sankuai.meituan.mtimageloader.utils.b() { // from class: com.sankuai.waimai.irmo.render.engine.vap.a.4
                    public static ChangeQuickRedirect a;

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.sankuai.meituan.mtimageloader.utils.b, com.sankuai.meituan.mtimageloader.utils.d
                    public final void a(Drawable drawable) {
                        Object[] objArr2 = {drawable};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6d5cfeb10546a47cd82e7752d3175c2d", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6d5cfeb10546a47cd82e7752d3175c2d");
                        } else if (drawable == null || a.this.getParent() == null) {
                        } else {
                            if (a.this.n == null) {
                                a.this.n = new ImageView(a.this.getContext());
                                a.this.n.setLayoutParams(a.this.getLayoutParams());
                                ViewGroup viewGroup = (ViewGroup) a.this.getParent();
                                viewGroup.addView(a.this.n, viewGroup.indexOfChild(a.this));
                            }
                            a.this.n.setImageDrawable(drawable);
                            if (drawable instanceof PicassoGifDrawable) {
                                ((PicassoGifDrawable) drawable).start();
                            }
                            if (a.this.c != null) {
                                if (a.this.c.e == 2) {
                                    a.this.n.setScaleType(ImageView.ScaleType.CENTER_CROP);
                                } else {
                                    a.this.n.setScaleType(ImageView.ScaleType.FIT_CENTER);
                                }
                            }
                            if (a.this.g) {
                                a.this.n.setVisibility(8);
                                d.b("IrmoVapVideoView_Irmo 视频播放中 不添加首帧图", new Object[0]);
                                return;
                            }
                            a.this.n.setVisibility(0);
                            d.b("IrmoVapVideoView_Irmo  展示首帧图ing , 裁切模式: " + a.this.n.getScaleType(), new Object[0]);
                        }
                    }

                    @Override // com.sankuai.meituan.mtimageloader.utils.b, com.sankuai.meituan.mtimageloader.utils.d
                    public final void a() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "45dc962b60ca6431245057447d110951", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "45dc962b60ca6431245057447d110951");
                            return;
                        }
                        d.b("IrmoVapVideoView_Irmo addFirstFrameImg onFailed", new Object[0]);
                        if (a.this.n != null) {
                            a.this.n.setVisibility(8);
                        }
                    }
                });
            }
        }
    }

    private b.C0608b b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a7d4c4ea26e75ef02c8f7539e092cd8e", RobustBitConfig.DEFAULT_VALUE)) {
            return (b.C0608b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a7d4c4ea26e75ef02c8f7539e092cd8e");
        }
        if (com.sankuai.meituan.mtimageloader.loader.a.a() == null) {
            d.b("IrmoVapVideoView_Irmo getImgBuilder() actualLoader==null", new Object[0]);
            com.sankuai.meituan.mtimageloader.config.a.a(getContext());
            com.sankuai.meituan.mtimageloader.config.a.a(5);
            com.sankuai.meituan.mtimageloader.config.a.c(720);
            com.sankuai.meituan.mtimageloader.config.a.b(true);
            com.sankuai.meituan.mtimageloader.config.a.a(new com.sankuai.waimai.picasso_loader.b());
        }
        b.C0608b c = com.sankuai.meituan.mtimageloader.loader.a.c();
        if (!str.startsWith("http") && !str.startsWith("https")) {
            return c.b(str);
        }
        c.c = str;
        return c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ImageView l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "633977bedc547e5794f8b1ff87b3e033", RobustBitConfig.DEFAULT_VALUE)) {
            return (ImageView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "633977bedc547e5794f8b1ff87b3e033");
        }
        ViewParent parent = getParent();
        if (parent instanceof ViewGroup) {
            ImageView imageView = new ImageView(getContext());
            ViewGroup viewGroup = (ViewGroup) parent;
            int indexOfChild = viewGroup.indexOfChild(this);
            viewGroup.removeViewAt(indexOfChild);
            viewGroup.addView(imageView, indexOfChild);
            return imageView;
        }
        return null;
    }

    @Override // com.sankuai.waimai.irmo.mach.vap.VapAnimLoadManager.a
    public final void a(@NonNull File file) {
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ecf2ffd3ea91189ce5347e6113dfca2f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ecf2ffd3ea91189ce5347e6113dfca2f");
        } else if (this.c == null) {
        } else {
            this.c.p = file.getAbsolutePath();
            d.b("IrmoVapVideoView_Irmo startPlay() 使用Url下载资源播放 ", new Object[0]);
            e();
        }
    }

    @Override // com.sankuai.waimai.irmo.mach.vap.VapAnimLoadManager.a
    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d009058ac4a98bfcee3ab7fcaa58bae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d009058ac4a98bfcee3ab7fcaa58bae");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("error_type", "download error");
        a(false, (Map<String, Object>) hashMap);
    }

    @Override // com.sankuai.meituan.animplayer.e, android.view.TextureView, android.view.View
    public final void onAttachedToWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a071fcf09a6d92f8e6678f31e4a7c41", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a071fcf09a6d92f8e6678f31e4a7c41");
            return;
        }
        super.onAttachedToWindow();
        d.b("IrmoVapVideoView_Irmo onAttachedToWindow mIsDetached: " + this.l + "  mIsRelease: " + this.m + " mIsStarting: " + this.g + "  this: " + this, new Object[0]);
        if (this.l) {
            this.l = false;
            if (this.m && this.g) {
                d.b("IrmoVapVideoView_Irmo startPlay() resume重启播放", new Object[0]);
                e();
            }
        }
    }

    @Override // com.sankuai.meituan.animplayer.e, android.view.View
    public final void onDetachedFromWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "801cf5507ebc8b3e2bf121ace67bf9b2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "801cf5507ebc8b3e2bf121ace67bf9b2");
            return;
        }
        d.b("IrmoVapVideoView_Irmo onDetachedFromWindow  ,this: " + this, new Object[0]);
        super.onDetachedFromWindow();
        this.l = true;
    }

    public final void setPlaySuccessBlock(g gVar) {
        this.e = gVar;
    }

    private void a(a.EnumC0973a enumC0973a, Map<String, Object> map) {
        Object[] objArr = {enumC0973a, map};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a5ea76b90dacfa6284c7fbfe6c098d0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a5ea76b90dacfa6284c7fbfe6c098d0");
        } else if (this.f == null) {
        } else {
            this.f.a(enumC0973a, map);
        }
    }

    public final void setVolumeControlUtil(com.sankuai.waimai.irmo.mach.b bVar) {
        this.q = bVar;
    }

    public final void setStarting(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "19af1bd99b03222a3ddfb39673d53b44", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "19af1bd99b03222a3ddfb39673d53b44");
            return;
        }
        this.g = z;
        com.sankuai.waimai.foundation.utils.log.a.a("IrmoVapVideoView_Irmo", "set Starting: " + z, new Object[0]);
    }
}

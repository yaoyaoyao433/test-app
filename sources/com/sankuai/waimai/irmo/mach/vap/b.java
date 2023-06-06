package com.sankuai.waimai.irmo.mach.vap;

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
import com.sankuai.waimai.irmo.mach.vap.VapAnimLoadManager;
import com.sankuai.waimai.irmo.render.a;
import com.sankuai.waimai.mach.Mach;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b extends com.sankuai.meituan.animplayer.e implements e.a, VapAnimLoadManager.a {
    public static ChangeQuickRedirect b;
    e c;
    WeakReference<Mach> d;
    boolean e;
    boolean f;
    boolean g;
    public List<com.sankuai.waimai.irmo.render.a> h;
    private long i;
    private String j;
    private boolean k;
    private boolean l;
    private ImageView m;
    private ImageView n;

    @Override // com.sankuai.meituan.animplayer.e.a
    public final void a(Map<String, Object> map) {
    }

    public static /* synthetic */ boolean a(b bVar, boolean z) {
        bVar.f = true;
        return true;
    }

    public b(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf2f88bd991bf68931fbf9f5639cc087", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf2f88bd991bf68931fbf9f5639cc087");
            return;
        }
        this.l = false;
        this.n = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setPlayCount(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7834058508bf2c1820ebd8d6c35fe16a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7834058508bf2c1820ebd8d6c35fe16a");
            return;
        }
        if (i < 0) {
            i = -1;
        }
        setLoopCount(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setContentMode(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "350e1ab107da67aa0f50f9f9382cd951", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "350e1ab107da67aa0f50f9f9382cd951");
        } else if (i == 0) {
            setScaleType(com.sankuai.meituan.animplayer.utils.a.ScaleToFill);
        } else {
            switch (i) {
                case 2:
                    setScaleType(com.sankuai.meituan.animplayer.utils.a.ScaleAspectFill);
                    return;
                case 3:
                    setScaleType(com.sankuai.meituan.animplayer.utils.a.ScaleWidthFit);
                    return;
                case 4:
                    setScaleType(com.sankuai.meituan.animplayer.utils.a.ScaleHeightFit);
                    return;
                default:
                    setScaleType(com.sankuai.meituan.animplayer.utils.a.ScaleAspectFitCenter);
                    return;
            }
        }
    }

    private void a(String str, int i) {
        Mach mach;
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "85ed468513592d4a2e7524386e982350", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "85ed468513592d4a2e7524386e982350");
        } else if (this.c == null || this.c.n == null || this.d == null || (mach = this.d.get()) == null || mach.getV8JSEngine() == null) {
        } else {
            LinkedList linkedList = new LinkedList();
            linkedList.add(str);
            HashMap hashMap = new HashMap();
            hashMap.put("count", Integer.valueOf(i));
            hashMap.put("url", this.c.m);
            linkedList.add(hashMap);
            mach.asyncCallJSMethod(this.c.n.b, linkedList);
        }
    }

    @Override // com.sankuai.meituan.animplayer.e
    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8389637e04c03334cb146a129ec78582", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8389637e04c03334cb146a129ec78582");
            return;
        }
        this.j = str;
        super.a(str);
    }

    private void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "759fc102ebf899f215d1b472915ce58f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "759fc102ebf899f215d1b472915ce58f");
        } else if (TextUtils.isEmpty(this.j)) {
            com.sankuai.waimai.foundation.utils.log.a.e("MachAnimVideoView", "startPlay error: mMp4FilePath is empty", new Object[0]);
        } else {
            this.i = SystemClock.elapsedRealtime();
            try {
                a(this.j);
            } catch (Throwable th) {
                com.sankuai.waimai.foundation.utils.log.a.a("MachAnimVideoView", "startPlay error:", th);
            }
        }
    }

    @Override // com.sankuai.meituan.animplayer.e
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f5309641c4a18cb6cc66f4682d89896", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f5309641c4a18cb6cc66f4682d89896");
            return;
        }
        try {
            super.c();
        } catch (Throwable th) {
            com.sankuai.waimai.foundation.utils.log.a.a("MachAnimVideoView", "pause error:", th);
        }
    }

    @Override // com.sankuai.meituan.animplayer.e
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "618c2905d33d6e47bd45266491595de5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "618c2905d33d6e47bd45266491595de5");
            return;
        }
        try {
            super.a();
        } catch (Throwable th) {
            com.sankuai.waimai.foundation.utils.log.a.a("MachAnimVideoView", "stopPlay error:", th);
        }
    }

    @Override // com.sankuai.meituan.animplayer.e
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f1bee093ad3360c5345b5d011ab29223", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f1bee093ad3360c5345b5d011ab29223");
        } else if (this.k) {
            g();
        } else {
            try {
                super.d();
            } catch (Throwable th) {
                com.sankuai.waimai.foundation.utils.log.a.a("MachAnimVideoView", "resume error:", th);
            }
        }
    }

    @Override // com.sankuai.meituan.animplayer.e
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dde1edc2898398132cc9eaea041dcbc7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dde1edc2898398132cc9eaea041dcbc7");
            return;
        }
        super.b();
        this.k = true;
    }

    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "45d9e319c16027d3f9224124430506d7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "45d9e319c16027d3f9224124430506d7");
        } else if (!this.e || this.n == null) {
        } else {
            ViewParent parent = this.n.getParent();
            if (parent instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) parent;
                int indexOfChild = viewGroup.indexOfChild(this.n);
                viewGroup.removeViewAt(indexOfChild);
                this.n = null;
                this.e = false;
                if (getParent() == null) {
                    viewGroup.addView(this, indexOfChild);
                }
            }
        }
    }

    @Override // com.sankuai.meituan.animplayer.e.a
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "45be9bc4a02e60a0f2a7fa0be821cc27", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "45be9bc4a02e60a0f2a7fa0be821cc27");
            return;
        }
        if (this.m != null && i == 1) {
            postDelayed(new Runnable() { // from class: com.sankuai.waimai.irmo.mach.vap.b.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "20ec1018703d246d820b317f0e7ae547", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "20ec1018703d246d820b317f0e7ae547");
                    } else {
                        b.this.m.setVisibility(8);
                    }
                }
            }, 40L);
        }
        com.sankuai.waimai.irmo.utils.d.e("VideoTime onVideoStart,count" + i + ",url:" + this.j, new Object[0]);
        a("start", i);
        a(a.EnumC0973a.effect_start);
        if (i == 1) {
            com.sankuai.waimai.irmo.mach.c.a(com.sankuai.waimai.irmo.mach.c.a(this.c), 1, "EffectPrepareTime", Float.valueOf(((float) (SystemClock.elapsedRealtime() - this.i)) / 1000.0f), this.l);
            com.sankuai.waimai.irmo.mach.c.a(com.sankuai.waimai.irmo.mach.c.a(this.c), 1, "EffectRenderSuccess", (Number) 1, this.l);
        }
    }

    @Override // com.sankuai.meituan.animplayer.e.a
    public final void a(boolean z, Map<String, Object> map) {
        Mach mach;
        com.sankuai.waimai.mach.node.a rootNode;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), map};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d0008e76cac178172087deb96f1a4806", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d0008e76cac178172087deb96f1a4806");
            return;
        }
        com.sankuai.waimai.foundation.utils.log.a.e("MachAnimVideoView", "onError--started-" + z + ",extra-" + map, new Object[0]);
        a("failed", 0);
        a(a.EnumC0973a.effect_failed);
        String str = null;
        if (map != null) {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                try {
                    jSONObject.put(entry.getKey(), entry.getValue());
                } catch (JSONException e) {
                    com.sankuai.waimai.foundation.utils.log.a.a("MachAnimVideoView", "collect error info fail", e);
                }
            }
            str = jSONObject.toString();
        }
        com.sankuai.waimai.irmo.mach.c.a(com.sankuai.waimai.irmo.mach.c.a(this.c), "EffectRenderSuccess", (Number) 0, str, this.l);
        b();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = b;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6b6f165e4e16bb16c8605ba79e67ef57", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6b6f165e4e16bb16c8605ba79e67ef57");
        } else if (this.c != null) {
            String str2 = this.c.o;
            if (TextUtils.isEmpty(str2) || this.d == null || (mach = this.d.get()) == null || (rootNode = mach.getRootNode()) == null) {
                return;
            }
            String a = rootNode.a();
            if (str2.startsWith("assets://")) {
                if (a == null) {
                    a = "";
                }
                str2 = str2.replaceFirst("assets://", a);
            }
            com.sankuai.waimai.foundation.utils.log.a.c("MachAnimVideoView", "addErrorImg path:" + str2, new Object[0]);
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = b;
            b.C0608b c = PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "d677f9be53e4726adf844add8034dea8", RobustBitConfig.DEFAULT_VALUE) ? (b.C0608b) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "d677f9be53e4726adf844add8034dea8") : com.sankuai.meituan.mtimageloader.loader.a.c();
            if (!str2.startsWith("http")) {
                c = c.b(str2);
            } else {
                c.c = str2;
            }
            c.b = getContext();
            c.a(new com.sankuai.meituan.mtimageloader.utils.b() { // from class: com.sankuai.waimai.irmo.mach.vap.b.2
                public static ChangeQuickRedirect a;

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.sankuai.meituan.mtimageloader.utils.b, com.sankuai.meituan.mtimageloader.utils.d
                public final void a(Drawable drawable) {
                    Object[] objArr4 = {drawable};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "e8cc0319fcfcfc68a7818005a55ae683", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "e8cc0319fcfcfc68a7818005a55ae683");
                        return;
                    }
                    ImageView h = b.this.h();
                    if (h != null) {
                        h.setImageDrawable(drawable);
                        b.a(b.this, true);
                    }
                }

                @Override // com.sankuai.meituan.mtimageloader.utils.b, com.sankuai.meituan.mtimageloader.utils.d
                public final void a() {
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "26a2391f5c0892415bcdf231c827b592", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "26a2391f5c0892415bcdf231c827b592");
                    } else {
                        com.sankuai.waimai.foundation.utils.log.a.c("MachAnimVideoView", "addErrorImg onFailed", new Object[0]);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ImageView h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "39c9ec2b3d8326cceebb135c0b4b1e02", RobustBitConfig.DEFAULT_VALUE)) {
            return (ImageView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "39c9ec2b3d8326cceebb135c0b4b1e02");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "db539900be6b0e18cf50ead2f217196f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "db539900be6b0e18cf50ead2f217196f");
        } else if ((this.c == null || this.c.a != 0) && file != null) {
            this.i = SystemClock.elapsedRealtime();
            this.j = file.getAbsolutePath();
            this.l = false;
            g();
        }
    }

    @Override // com.sankuai.waimai.irmo.mach.vap.VapAnimLoadManager.a
    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ccc0ab1bb895de7be1f1ae315af039e2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ccc0ab1bb895de7be1f1ae315af039e2");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e8bf7e155fe154953d30590e5021517", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e8bf7e155fe154953d30590e5021517");
            return;
        }
        super.onAttachedToWindow();
        com.sankuai.waimai.foundation.utils.log.a.c("MachAnimVideoView", "onAttachedToWindow mIsDetached: " + this.g, new Object[0]);
        if (this.g) {
            d();
            this.g = false;
        }
    }

    @Override // com.sankuai.meituan.animplayer.e, android.view.View
    public final void onDetachedFromWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f9e1a23b461d2c34a7dbf0649d7d091", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f9e1a23b461d2c34a7dbf0649d7d091");
            return;
        }
        super.onDetachedFromWindow();
        com.sankuai.waimai.foundation.utils.log.a.c("MachAnimVideoView", "onDetachedFromWindow pause", new Object[0]);
        c();
        if (this.m != null) {
            this.m.setVisibility(0);
        }
        this.g = true;
    }

    private void a(a.EnumC0973a enumC0973a) {
        Object[] objArr = {enumC0973a};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c4b33ff5d5111cbffe7a9b126410fcdf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c4b33ff5d5111cbffe7a9b126410fcdf");
        } else if (this.h != null) {
            for (com.sankuai.waimai.irmo.render.a aVar : this.h) {
                aVar.a(enumC0973a, null);
            }
        }
    }

    @Override // com.sankuai.meituan.animplayer.e.a
    public final void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "13f67f963444d7d93e03b7f4aaa0c459", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "13f67f963444d7d93e03b7f4aaa0c459");
            return;
        }
        if (i == 0) {
            if ((this.c == null || this.c.f) ? false : true) {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = b;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6b2893e98779d26f8131722d91ecc814", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6b2893e98779d26f8131722d91ecc814");
                } else {
                    Bitmap a = f.a(this);
                    this.n = h();
                    if (this.n != null) {
                        this.n.setImageBitmap(a);
                        this.e = true;
                    }
                }
            }
        }
        a("finish", i);
        a(a.EnumC0973a.effect_finished);
    }
}

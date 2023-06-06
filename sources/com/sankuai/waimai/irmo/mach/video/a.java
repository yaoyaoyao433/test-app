package com.sankuai.waimai.irmo.mach.video;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import com.meituan.android.mtplayer.video.MTVideoPlayerView;
import com.meituan.android.mtplayer.video.callback.IPlayerStateCallback;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.irmo.mach.b;
import com.sankuai.waimai.mach.Mach;
import com.sankuai.waimai.mach.widget.MachViewGroup;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.LinkedList;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a extends MachViewGroup implements IPlayerStateCallback, b.a {
    public static ChangeQuickRedirect a;
    MTVideoPlayerView b;
    c c;
    WeakReference<Mach> d;
    boolean e;
    int f;
    boolean g;
    com.sankuai.waimai.irmo.mach.b h;
    private long i;
    private int j;
    private int l;

    @Override // com.meituan.android.mtplayer.video.callback.IPlayerStateCallback
    public final void a(int i, int i2, int i3) {
    }

    public a(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "57035834913c8193c1be301abce6d833", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "57035834913c8193c1be301abce6d833");
            return;
        }
        this.f = 1;
        this.l = 0;
        this.b = new MTVideoPlayerView(context);
        this.b.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        addView(this.b);
        this.h = new com.sankuai.waimai.irmo.mach.b(this, this);
    }

    public final void setPlayCount(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb3b4b06a05210b87c23470f876ce504", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb3b4b06a05210b87c23470f876ce504");
            return;
        }
        if (i < 0) {
            i = -1;
        }
        this.b.setLooping(i == -1);
        this.f = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(String str, int i) {
        Mach mach;
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "01e55b006cf0c433f81f31a2828aab42", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "01e55b006cf0c433f81f31a2828aab42");
        } else if (this.c == null || this.c.l == null || this.d == null || (mach = this.d.get()) == null || mach.getV8JSEngine() == null) {
        } else {
            LinkedList linkedList = new LinkedList();
            linkedList.add(str);
            HashMap hashMap = new HashMap();
            hashMap.put("count", Integer.valueOf(i));
            hashMap.put("url", this.c.k);
            linkedList.add(hashMap);
            mach.asyncCallJSMethod(this.c.l.b, linkedList);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be8c3cf05c8df2967ed2908abfa5024f", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be8c3cf05c8df2967ed2908abfa5024f")).booleanValue() : (this.c == null || TextUtils.isEmpty(this.c.k)) ? false : true;
    }

    private void setImageScaleType(ImageView imageView) {
        Object[] objArr = {imageView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f1f5a73e69b1e7d87491ae79aa53fcf1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f1f5a73e69b1e7d87491ae79aa53fcf1");
        } else if (this.c == null || imageView == null) {
        } else {
            int i = this.c.e;
            if (i == 0) {
                imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            } else if (i == 2) {
                imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            } else {
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            }
        }
    }

    @Override // com.meituan.android.mtplayer.video.callback.IPlayerStateCallback
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4007ea8397bc6f8a2fc34f0dc239738b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4007ea8397bc6f8a2fc34f0dc239738b");
            return;
        }
        com.sankuai.waimai.foundation.utils.log.a.c("MTVideoPlayerViewGroup", "state: " + i, new Object[0]);
        this.j = i;
        if (i == -1) {
            a("failed", 0);
            com.sankuai.waimai.irmo.mach.c.a(com.sankuai.waimai.irmo.mach.c.a(this.c), "EffectRenderSuccess", (Number) 0);
            return;
        }
        if (i != 5) {
            if (i != 7) {
                switch (i) {
                    case 1:
                        this.i = SystemClock.elapsedRealtime();
                        return;
                    case 2:
                        float elapsedRealtime = ((float) (SystemClock.elapsedRealtime() - this.i)) / 1000.0f;
                        com.sankuai.waimai.foundation.utils.log.a.e("MTVideoPlayerViewGroup", "prepare time: " + elapsedRealtime, new Object[0]);
                        com.sankuai.waimai.irmo.mach.c.a(com.sankuai.waimai.irmo.mach.c.a(this.c), "EffectPrepareTime", Float.valueOf(elapsedRealtime));
                        return;
                    case 3:
                        break;
                    default:
                        return;
                }
            } else {
                this.l++;
                int i2 = this.f - this.l;
                if (i2 == 0) {
                    if ((this.c == null || this.c.f) ? false : true) {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4e06b23274904c7a30e1d4eb3912a2bf", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4e06b23274904c7a30e1d4eb3912a2bf");
                        } else {
                            Bitmap videoBitmap = this.b.getVideoBitmap();
                            ImageView imageView = new ImageView(this.b.getContext());
                            imageView.setLayoutParams(this.b.getLayoutParams());
                            imageView.setImageBitmap(videoBitmap);
                            setImageScaleType(imageView);
                            ViewParent parent = this.b.getParent();
                            if (parent instanceof ViewGroup) {
                                ViewGroup viewGroup = (ViewGroup) parent;
                                int indexOfChild = viewGroup.indexOfChild(this.b);
                                viewGroup.removeViewAt(indexOfChild);
                                viewGroup.addView(imageView, indexOfChild);
                                this.e = true;
                            }
                        }
                    }
                }
                if (i2 > 0) {
                    this.b.c();
                }
                a("finish", i2);
                return;
            }
        }
        a("start", this.l + 1);
        com.sankuai.waimai.irmo.mach.c.a(com.sankuai.waimai.irmo.mach.c.a(this.c), "EffectRenderSuccess", (Number) 1);
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7866b3011dd555477f06f72b3236b626", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7866b3011dd555477f06f72b3236b626");
        } else if (a()) {
            if (this.c.c == 1 || this.c.c == 3) {
                this.b.d();
            }
        }
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c82b40f738a6bbd4fd5fb0f27a2386ab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c82b40f738a6bbd4fd5fb0f27a2386ab");
        } else if (!a() || this.j == 7 || this.j == 0) {
        } else {
            if (this.c.c == 1 || this.c.c == 3) {
                this.b.c();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "10e9e900238c37e115af3b50acabfcbf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "10e9e900238c37e115af3b50acabfcbf");
            return;
        }
        super.onAttachedToWindow();
        if (this.g) {
            com.sankuai.waimai.foundation.utils.log.a.c("MTVideoPlayerViewGroup", "onAttachedToWindow resume", new Object[0]);
            c();
            this.g = false;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "692a68e776253574529f93f8185b96a5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "692a68e776253574529f93f8185b96a5");
            return;
        }
        super.onDetachedFromWindow();
        b();
        this.g = true;
    }

    @Override // com.sankuai.waimai.irmo.mach.b.a
    public final void setVolume(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c8425345f79e8a5efd7f80a6a986c75", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c8425345f79e8a5efd7f80a6a986c75");
        } else if (this.b != null) {
            this.b.a(f, f);
        }
    }
}

package com.meituan.android.mtplayer.video;

import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class j extends g {
    public static ChangeQuickRedirect a;
    private final MTVideoPlayerView r;

    @Override // com.meituan.android.mtplayer.video.g
    public final boolean j() {
        return false;
    }

    public j(@NonNull Context context, @NonNull MTVideoPlayerView mTVideoPlayerView) {
        super(context);
        Object[] objArr = {context, mTVideoPlayerView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6e3a6b2a1a4690923af80a9f7c1e505f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6e3a6b2a1a4690923af80a9f7c1e505f");
        } else {
            this.r = mTVideoPlayerView;
        }
    }

    @Override // com.meituan.android.mtplayer.video.g
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8a47ca98ce9fd5bd59420ece770857f4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8a47ca98ce9fd5bd59420ece770857f4");
            return;
        }
        MTVideoPlayerView mTVideoPlayerView = this.r;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = MTVideoPlayerView.a;
        if (PatchProxy.isSupport(objArr2, mTVideoPlayerView, changeQuickRedirect2, false, "63c0dd81518b13b2842cbb869d8ba00c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, mTVideoPlayerView, changeQuickRedirect2, false, "63c0dd81518b13b2842cbb869d8ba00c");
            return;
        }
        a a2 = a.a();
        Context context = mTVideoPlayerView.getContext();
        int hashCode = mTVideoPlayerView.hashCode();
        Object[] objArr3 = {context, Integer.valueOf(hashCode)};
        ChangeQuickRedirect changeQuickRedirect3 = a.a;
        if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "ef84ecbbe30fc7426e2fc999c03209ab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "ef84ecbbe30fc7426e2fc999c03209ab");
            return;
        }
        if (a2.b == null) {
            a2.b = (AudioManager) context.getSystemService("audio");
        }
        if (a2.f.contains(Integer.valueOf(hashCode))) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            a2.b.requestAudioFocus(a2.c);
        } else {
            a2.b.requestAudioFocus(null, 3, 2);
        }
        a2.f.add(Integer.valueOf(hashCode));
    }

    @Override // com.meituan.android.mtplayer.video.g
    public final void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e9cf849cc2f60ec28f09c9c13b3297a2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e9cf849cc2f60ec28f09c9c13b3297a2");
            return;
        }
        MTVideoPlayerView mTVideoPlayerView = this.r;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = MTVideoPlayerView.a;
        if (PatchProxy.isSupport(objArr2, mTVideoPlayerView, changeQuickRedirect2, false, "f08b8ee1848ea8e114da02ea3adefa94", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, mTVideoPlayerView, changeQuickRedirect2, false, "f08b8ee1848ea8e114da02ea3adefa94");
            return;
        }
        a a2 = a.a();
        int hashCode = mTVideoPlayerView.hashCode();
        Object[] objArr3 = {Integer.valueOf(hashCode)};
        ChangeQuickRedirect changeQuickRedirect3 = a.a;
        if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "e3cf4ee7e7d198a899297c8aea42f64e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "e3cf4ee7e7d198a899297c8aea42f64e");
        } else if (a2.b == null || !a2.f.contains(Integer.valueOf(hashCode))) {
        } else {
            a2.f.remove(Integer.valueOf(hashCode));
            if (a2.f.isEmpty()) {
                if (Build.VERSION.SDK_INT >= 26) {
                    a2.b.abandonAudioFocusRequest(a2.c);
                } else {
                    a2.b.abandonAudioFocus(null);
                }
            }
        }
    }

    @Override // com.meituan.android.mtplayer.video.g
    public final void a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c7e35961ce9d08ab3cf25f67a7e3cfa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c7e35961ce9d08ab3cf25f67a7e3cfa");
            return;
        }
        MTVideoPlayerView mTVideoPlayerView = this.r;
        Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = MTVideoPlayerView.a;
        if (PatchProxy.isSupport(objArr2, mTVideoPlayerView, changeQuickRedirect2, false, "ffd2e64c8d5394f104bcb516ff43924e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, mTVideoPlayerView, changeQuickRedirect2, false, "ffd2e64c8d5394f104bcb516ff43924e");
            return;
        }
        mTVideoPlayerView.g = i;
        mTVideoPlayerView.h = i2;
        if (mTVideoPlayerView.g > 0 && mTVideoPlayerView.h > 0) {
            if (mTVideoPlayerView.d == null) {
                return;
            }
            mTVideoPlayerView.d.a(mTVideoPlayerView.g, mTVideoPlayerView.h);
            mTVideoPlayerView.d.b(mTVideoPlayerView.i, mTVideoPlayerView.j);
            if (mTVideoPlayerView.a()) {
                return;
            }
        }
        mTVideoPlayerView.c();
    }

    @Override // com.meituan.android.mtplayer.video.g
    public final void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc46bd97c807be994306eb694ba08686", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc46bd97c807be994306eb694ba08686");
            return;
        }
        MTVideoPlayerView mTVideoPlayerView = this.r;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = MTVideoPlayerView.a;
        if (PatchProxy.isSupport(objArr2, mTVideoPlayerView, changeQuickRedirect2, false, "9117ebeefb90a43437baf4f05cec55c4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, mTVideoPlayerView, changeQuickRedirect2, false, "9117ebeefb90a43437baf4f05cec55c4");
        } else if (mTVideoPlayerView.a()) {
        } else {
            mTVideoPlayerView.c();
        }
    }

    @Override // com.meituan.android.mtplayer.video.g
    public final void l() throws Throwable {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d9bf91f71f0b7bf01fca7a9bfb9fad38", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d9bf91f71f0b7bf01fca7a9bfb9fad38");
            return;
        }
        super.l();
        MTVideoPlayerView mTVideoPlayerView = this.r;
        com.meituan.android.mtplayer.video.player.d dVar = this.d;
        Object[] objArr2 = {dVar};
        ChangeQuickRedirect changeQuickRedirect2 = MTVideoPlayerView.a;
        if (PatchProxy.isSupport(objArr2, mTVideoPlayerView, changeQuickRedirect2, false, "2dfbcc53a1ea8d69be07e310e9d6121e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, mTVideoPlayerView, changeQuickRedirect2, false, "2dfbcc53a1ea8d69be07e310e9d6121e");
            return;
        }
        dVar.setOnVideoSizeChangedListener(mTVideoPlayerView.m);
        mTVideoPlayerView.k.a(mTVideoPlayerView.e);
    }

    @Override // com.meituan.android.mtplayer.video.g
    public final void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "84ebd3a4e7f8d7bf176a331223116527", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "84ebd3a4e7f8d7bf176a331223116527");
            return;
        }
        super.b(i);
        this.r.b(i);
    }

    @Override // com.meituan.android.mtplayer.video.g
    public final void a(int i, Bundle bundle) {
        Object[] objArr = {Integer.valueOf(i), bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "60e357dfcf5e99d007f8ea6a9c837917", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "60e357dfcf5e99d007f8ea6a9c837917");
            return;
        }
        super.a(i, bundle);
        this.r.b(i);
    }

    @Override // com.meituan.android.mtplayer.video.g
    public final void c(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fdc8584f4809cdca5cd702d1070fceef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fdc8584f4809cdca5cd702d1070fceef");
            return;
        }
        super.c(i, i2);
        MTVideoPlayerView mTVideoPlayerView = this.r;
        int i3 = this.i;
        Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect2 = MTVideoPlayerView.a;
        if (PatchProxy.isSupport(objArr2, mTVideoPlayerView, changeQuickRedirect2, false, "fcc9634fe486cf56bd782481294de4a5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, mTVideoPlayerView, changeQuickRedirect2, false, "fcc9634fe486cf56bd782481294de4a5");
        } else if (mTVideoPlayerView.c != null) {
            mTVideoPlayerView.c.a(i, i2, i3);
        }
    }

    @Override // com.meituan.android.mtplayer.video.g
    public final boolean p() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "edf7b714682375050520edc0072252e8", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "edf7b714682375050520edc0072252e8")).booleanValue() : super.p() || this.r.getVisibility() != 0;
    }

    public final void a(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d6633a097aa9a6a0eab0a67955033ef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d6633a097aa9a6a0eab0a67955033ef");
        } else if (this.d == null) {
        } else {
            if (bVar == null) {
                this.d.setDisplay(null);
            } else {
                bVar.a(this.d);
            }
        }
    }

    public final void q() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d65e63d4414a2bfbc8065e36e195eec5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d65e63d4414a2bfbc8065e36e195eec5");
        } else if (this.d != null) {
            this.d.setDisplay(null);
        }
    }
}

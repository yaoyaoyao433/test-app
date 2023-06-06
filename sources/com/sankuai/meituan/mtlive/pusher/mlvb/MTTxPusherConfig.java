package com.sankuai.meituan.mtlive.pusher.mlvb;

import android.graphics.Bitmap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtlive.pusher.library.f;
import com.tencent.rtmp.TXLivePushConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class MTTxPusherConfig extends f {
    public static ChangeQuickRedirect a;
    TXLivePushConfig b;

    public MTTxPusherConfig() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8cea904330e13a1d4accc867bd2b4144", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8cea904330e13a1d4accc867bd2b4144");
        } else {
            this.b = new TXLivePushConfig();
        }
    }

    @Override // com.sankuai.meituan.mtlive.pusher.library.f
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "293d915ec3632480fed4b7f6cda15427", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "293d915ec3632480fed4b7f6cda15427");
        } else {
            this.b.setHomeOrientation(i);
        }
    }

    @Override // com.sankuai.meituan.mtlive.pusher.library.f
    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e516efe1f35dc75cee5591a70592b2f1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e516efe1f35dc75cee5591a70592b2f1");
        } else {
            this.b.setTouchFocus(z);
        }
    }

    @Override // com.sankuai.meituan.mtlive.pusher.library.f
    public final void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d9b6b00be613ba304d0ef62526144701", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d9b6b00be613ba304d0ef62526144701");
        } else {
            this.b.setEnableZoom(z);
        }
    }

    @Override // com.sankuai.meituan.mtlive.pusher.library.f
    public final void a(Bitmap bitmap, int i, int i2) {
        Object[] objArr = {bitmap, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "088f45cc6a4ec5a5e1ff224f741ca3d0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "088f45cc6a4ec5a5e1ff224f741ca3d0");
        } else {
            this.b.setWatermark(bitmap, i, i2);
        }
    }

    @Override // com.sankuai.meituan.mtlive.pusher.library.f
    public final void a(Bitmap bitmap, float f, float f2, float f3) {
        Object[] objArr = {bitmap, Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "230e071fccab997c0b205987f5200f4d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "230e071fccab997c0b205987f5200f4d");
        } else {
            this.b.setWatermark(bitmap, f, f2, f3);
        }
    }

    @Override // com.sankuai.meituan.mtlive.pusher.library.f
    public final void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4bf0e61c85d801941abf482b0322093c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4bf0e61c85d801941abf482b0322093c");
        } else {
            this.b.setLocalVideoMirrorType(i);
        }
    }

    @Override // com.sankuai.meituan.mtlive.pusher.library.f
    public final void a(Bitmap bitmap) {
        Object[] objArr = {bitmap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "679952d0f6e585589e576dd0c941e0de", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "679952d0f6e585589e576dd0c941e0de");
        } else {
            this.b.setPauseImg(bitmap);
        }
    }

    @Override // com.sankuai.meituan.mtlive.pusher.library.f
    public final void a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a26f6d133aa02c20acfb0c2b4be71a4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a26f6d133aa02c20acfb0c2b4be71a4");
        } else {
            this.b.setPauseImg(i, i2);
        }
    }

    @Override // com.sankuai.meituan.mtlive.pusher.library.f
    public final void c(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "28b9d5fc85cd385cc6b9f353c90e21a5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "28b9d5fc85cd385cc6b9f353c90e21a5");
        } else {
            this.b.setPauseFlag(i);
        }
    }

    @Override // com.sankuai.meituan.mtlive.pusher.library.f
    public final void d(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "564970636d6adf21c22060754068adee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "564970636d6adf21c22060754068adee");
            return;
        }
        super.d(i);
        this.b.setVideoResolution(i);
    }

    @Override // com.sankuai.meituan.mtlive.pusher.library.f
    public final void e(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "225430fa38ce6c9d0015a9dae59bef37", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "225430fa38ce6c9d0015a9dae59bef37");
            return;
        }
        super.e(i);
        this.b.setVideoFPS(i);
    }

    @Override // com.sankuai.meituan.mtlive.pusher.library.f
    public final void f(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d6864aabaebeb3d255666c1ccd8ba9e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d6864aabaebeb3d255666c1ccd8ba9e");
        } else {
            this.b.setVideoEncodeGop(i);
        }
    }

    @Override // com.sankuai.meituan.mtlive.pusher.library.f
    public final void g(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "787dfab5a6cf02bb0709a3336ffe53bd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "787dfab5a6cf02bb0709a3336ffe53bd");
            return;
        }
        super.g(i);
        this.b.setVideoBitrate(i);
    }

    @Override // com.sankuai.meituan.mtlive.pusher.library.f
    public final void h(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1bb5e5a4da31aa0b25c7a6687c8e56c4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1bb5e5a4da31aa0b25c7a6687c8e56c4");
        } else {
            this.b.setMaxVideoBitrate(i);
        }
    }

    @Override // com.sankuai.meituan.mtlive.pusher.library.f
    public final void i(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1cd99c23f050cd6c99cece7743ba7897", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1cd99c23f050cd6c99cece7743ba7897");
        } else {
            this.b.setMinVideoBitrate(i);
        }
    }

    @Override // com.sankuai.meituan.mtlive.pusher.library.f
    public final void j(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "57a17c7502e9cf4199428aca7e8e3f4b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "57a17c7502e9cf4199428aca7e8e3f4b");
        } else {
            this.b.setAudioSampleRate(i);
        }
    }

    @Override // com.sankuai.meituan.mtlive.pusher.library.f
    public final void k(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "209825eff10bfd96515b303e94230d7c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "209825eff10bfd96515b303e94230d7c");
        } else {
            this.b.setAudioChannels(i);
        }
    }

    @Override // com.sankuai.meituan.mtlive.pusher.library.f
    public final void c(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1cb8da3b31c14e4e115c892e1e7ae132", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1cb8da3b31c14e4e115c892e1e7ae132");
        } else {
            this.b.enablePureAudioPush(z);
        }
    }

    @Override // com.sankuai.meituan.mtlive.pusher.library.f
    public final void d(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c32fff239642e52bbfcf24577b0bc1c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c32fff239642e52bbfcf24577b0bc1c");
        } else {
            this.b.setVideoEncoderXMirror(z);
        }
    }

    @Override // com.sankuai.meituan.mtlive.pusher.library.f
    public final void e(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5314bbdae7a0afe68183859b5a26f7f3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5314bbdae7a0afe68183859b5a26f7f3");
        } else {
            this.b.enableAEC(z);
        }
    }

    @Override // com.sankuai.meituan.mtlive.pusher.library.f
    public final void f(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ecaf9da7b7641815c4627e169891bc2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ecaf9da7b7641815c4627e169891bc2");
        } else {
            this.b.enableAGC(z);
        }
    }

    @Override // com.sankuai.meituan.mtlive.pusher.library.f
    public final void g(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9097dd02d8f80475abfad07961a87fbf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9097dd02d8f80475abfad07961a87fbf");
        } else {
            this.b.enableANS(z);
        }
    }

    @Override // com.sankuai.meituan.mtlive.pusher.library.f
    public final void l(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bccd660f72df29a5d16a6ac4d766051c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bccd660f72df29a5d16a6ac4d766051c");
        } else {
            this.b.setVolumeType(i);
        }
    }

    @Override // com.sankuai.meituan.mtlive.pusher.library.f
    public final void m(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0baa97d89bf2836cd2a54c7b5c1f4096", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0baa97d89bf2836cd2a54c7b5c1f4096");
            return;
        }
        super.m(i);
        this.b.setHardwareAcceleration(i);
    }

    @Override // com.sankuai.meituan.mtlive.pusher.library.f
    public final void h(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "96aed19d2adcc8183b3974e56f97a661", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "96aed19d2adcc8183b3974e56f97a661");
        } else {
            this.b.setFrontCamera(z);
        }
    }

    @Override // com.sankuai.meituan.mtlive.pusher.library.f
    public final void i(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b289c77149b61a7c5b00c0d5221548f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b289c77149b61a7c5b00c0d5221548f");
        } else {
            this.b.enableNearestIP(z);
        }
    }
}

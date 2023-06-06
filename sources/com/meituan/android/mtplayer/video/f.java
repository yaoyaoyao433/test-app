package com.meituan.android.mtplayer.video;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import android.support.annotation.FloatRange;
import android.support.annotation.NonNull;
import com.meituan.android.mtplayer.video.callback.IPlayerStateCallback;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class f extends g {
    public static ChangeQuickRedirect a;
    private a r;

    @Override // com.meituan.android.mtplayer.video.g
    public final boolean j() {
        return true;
    }

    @Override // com.meituan.android.mtplayer.video.g, com.meituan.android.mtplayer.video.callback.b
    public final /* bridge */ /* synthetic */ void a(@FloatRange(from = 0.0d, to = 1.0d) float f) {
        super.a(f);
    }

    @Override // com.meituan.android.mtplayer.video.g, com.meituan.android.mtplayer.video.callback.b
    public final /* bridge */ /* synthetic */ void a(float f, float f2) {
        super.a(f, f2);
    }

    @Override // com.meituan.android.mtplayer.video.g, com.meituan.android.mtplayer.video.callback.b
    public final /* bridge */ /* synthetic */ void a(int i) {
        super.a(i);
    }

    @Override // com.meituan.android.mtplayer.video.g
    public final /* bridge */ /* synthetic */ void a(BasePlayerParam basePlayerParam) {
        super.a(basePlayerParam);
    }

    @Override // com.meituan.android.mtplayer.video.g
    public final /* bridge */ /* synthetic */ void a(IPlayerStateCallback iPlayerStateCallback) {
        super.a(iPlayerStateCallback);
    }

    @Override // com.meituan.android.mtplayer.video.g
    public final /* bridge */ /* synthetic */ void a(h hVar) {
        super.a(hVar);
    }

    @Override // com.meituan.android.mtplayer.video.g
    public final /* bridge */ /* synthetic */ void a(l lVar) {
        super.a(lVar);
    }

    @Override // com.meituan.android.mtplayer.video.g, com.meituan.android.mtplayer.video.callback.b
    public final /* bridge */ /* synthetic */ void b() {
        super.b();
    }

    @Override // com.meituan.android.mtplayer.video.g, com.meituan.android.mtplayer.video.callback.b
    public final /* bridge */ /* synthetic */ void c() {
        super.c();
    }

    @Override // com.meituan.android.mtplayer.video.g, com.meituan.android.mtplayer.video.callback.b
    public final /* bridge */ /* synthetic */ void d() {
        super.d();
    }

    @Override // com.meituan.android.mtplayer.video.g, com.meituan.android.mtplayer.video.callback.b
    public final /* bridge */ /* synthetic */ boolean e() {
        return super.e();
    }

    @Override // com.meituan.android.mtplayer.video.g, com.meituan.android.mtplayer.video.callback.b
    public final /* bridge */ /* synthetic */ void f() {
        super.f();
    }

    @Override // com.meituan.android.mtplayer.video.g, com.meituan.android.mtplayer.video.callback.b
    public final /* bridge */ /* synthetic */ void g() {
        super.g();
    }

    @Override // com.meituan.android.mtplayer.video.g, com.meituan.android.mtplayer.video.callback.b
    public final /* bridge */ /* synthetic */ int getCurrentPosition() {
        return super.getCurrentPosition();
    }

    @Override // com.meituan.android.mtplayer.video.g, com.meituan.android.mtplayer.video.callback.b
    public final /* bridge */ /* synthetic */ int getDuration() {
        return super.getDuration();
    }

    @Override // com.meituan.android.mtplayer.video.g
    public final /* bridge */ /* synthetic */ l k() {
        return super.k();
    }

    @Override // com.meituan.android.mtplayer.video.g, com.meituan.android.mtplayer.video.callback.b
    public final /* bridge */ /* synthetic */ void setLooping(boolean z) {
        super.setLooping(z);
    }

    @Override // com.meituan.android.mtplayer.video.g, com.meituan.android.mtplayer.video.callback.b
    public final /* bridge */ /* synthetic */ void setPlaySpeed(@FloatRange(from = 0.0d, to = 6.0d) float f) {
        super.setPlaySpeed(f);
    }

    public f(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f3e540cd59f4c55a10e692b7a5e0342", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f3e540cd59f4c55a10e692b7a5e0342");
        } else {
            this.r = new a();
        }
    }

    @Override // com.meituan.android.mtplayer.video.g
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "52c2e14cf30c221e23485159c8ff9be2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "52c2e14cf30c221e23485159c8ff9be2");
            return;
        }
        com.meituan.android.mtplayer.video.a a2 = com.meituan.android.mtplayer.video.a.a();
        Context context = this.c;
        a aVar = this.r;
        Object[] objArr2 = {context, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.mtplayer.video.a.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "373dc00d4489d6bf45e1566014771381", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "373dc00d4489d6bf45e1566014771381");
            return;
        }
        if (a2.b == null) {
            a2.b = (AudioManager) context.getSystemService("audio");
        }
        if (Build.VERSION.SDK_INT >= 26) {
            if (a2.d != null) {
                a2.b.abandonAudioFocusRequest(a2.d);
            }
            a2.d = new AudioFocusRequest.Builder(1).setAudioAttributes(a2.e).setOnAudioFocusChangeListener(aVar).build();
            a2.b.requestAudioFocus(a2.d);
            return;
        }
        a2.b.requestAudioFocus(aVar, 3, 1);
    }

    @Override // com.meituan.android.mtplayer.video.g
    public final void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a2d54f5e746b782123af8fe786f4dd1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a2d54f5e746b782123af8fe786f4dd1");
            return;
        }
        com.meituan.android.mtplayer.video.a a2 = com.meituan.android.mtplayer.video.a.a();
        a aVar = this.r;
        Object[] objArr2 = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.mtplayer.video.a.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "ff991aef44bf35bd914e4200d7ce73ef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "ff991aef44bf35bd914e4200d7ce73ef");
        } else if (a2.b != null) {
            if (Build.VERSION.SDK_INT >= 26) {
                if (a2.d != null) {
                    a2.b.abandonAudioFocusRequest(a2.d);
                    a2.d = null;
                    return;
                }
                return;
            }
            a2.b.abandonAudioFocus(aVar);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class a implements AudioManager.OnAudioFocusChangeListener {
        public static ChangeQuickRedirect a;
        private final WeakReference<f> b;
        private boolean c;

        private a(f fVar) {
            Object[] objArr = {fVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d9e4c7b3ad9eebf48d2254db847d284a", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d9e4c7b3ad9eebf48d2254db847d284a");
                return;
            }
            this.c = false;
            this.b = new WeakReference<>(fVar);
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public final void onAudioFocusChange(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ddb06761f018ec9ec54d45e0491b3f11", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ddb06761f018ec9ec54d45e0491b3f11");
                return;
            }
            f fVar = this.b.get();
            if (fVar != null) {
                if (i == 1) {
                    if (this.c && f.a(fVar)) {
                        fVar.c();
                        return;
                    }
                    return;
                }
                switch (i) {
                    case -2:
                    case -1:
                        if (fVar.e()) {
                            this.c = i == -2;
                            fVar.a(!this.c);
                            return;
                        }
                        return;
                    default:
                        return;
                }
            }
        }
    }

    @Override // com.meituan.android.mtplayer.video.g
    public final void a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c93009917f0185cfa657e2e476eb351a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c93009917f0185cfa657e2e476eb351a");
        } else {
            super.c();
        }
    }

    @Override // com.meituan.android.mtplayer.video.g
    public final void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "96faa181fc4f29445db2946be26b87bc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "96faa181fc4f29445db2946be26b87bc");
        } else {
            super.c();
        }
    }

    public static /* synthetic */ boolean a(f fVar) {
        return fVar.f < 7 && fVar.f > 0;
    }
}

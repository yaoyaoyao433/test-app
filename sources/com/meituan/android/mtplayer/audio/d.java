package com.meituan.android.mtplayer.audio;

import android.content.Context;
import android.os.Bundle;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class d implements com.meituan.android.mtplayer.audio.callback.a, Observer {
    public static ChangeQuickRedirect a;
    public static final List<Observer> b = new ArrayList();
    private static volatile d e;
    public Context c;
    public final b d;
    private int f;
    private int g;
    private int h;

    public static d a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d7b22289b5e996bcff26c5a2ba5718ba", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d7b22289b5e996bcff26c5a2ba5718ba");
        }
        if (e == null) {
            synchronized (d.class) {
                if (e == null) {
                    e = new d();
                }
            }
        }
        return e;
    }

    public d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e4f1bbdcf97cdd6a2da39dc0606e63a5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e4f1bbdcf97cdd6a2da39dc0606e63a5");
            return;
        }
        this.f = 0;
        this.g = 0;
        this.h = 0;
        this.d = b.a();
    }

    @Override // com.meituan.android.mtplayer.video.callback.b
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c6665c27ed799cfec4ced839d1e436a9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c6665c27ed799cfec4ced839d1e436a9");
        } else {
            a.a(this.c, "MUSIC_ACTICON_START_PREPARE");
        }
    }

    @Override // com.meituan.android.mtplayer.video.callback.b
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "21a7c699cecbba0c9d4003caa47411c4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "21a7c699cecbba0c9d4003caa47411c4");
        } else {
            a.a(this.c, "MUSIC_ACTICON_START");
        }
    }

    @Override // com.meituan.android.mtplayer.video.callback.b
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a0b825dd2d1a784d9550833c43a72feb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a0b825dd2d1a784d9550833c43a72feb");
        } else {
            a.a(this.c, "MUSIC_ACTICON_PAUSE");
        }
    }

    @Override // com.meituan.android.mtplayer.video.callback.b
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "76dddee79c6cc17af72a15afba80a380", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "76dddee79c6cc17af72a15afba80a380");
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("extra_key_seek_integer", i);
        a.a(this.c, "MUSIC_ACTICON_SEEK", bundle);
    }

    @Override // com.meituan.android.mtplayer.video.callback.b
    public final void a(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fef38a44e35055de7834b2cb0df35a00", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fef38a44e35055de7834b2cb0df35a00");
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putFloat("extra_key_seek_percent", f);
        a.a(this.c, "MUSIC_ACTICON_SEEK", bundle);
    }

    @Override // com.meituan.android.mtplayer.video.callback.b
    public final boolean e() {
        return this.f == 5 || this.f == 3;
    }

    @Override // com.meituan.android.mtplayer.video.callback.b
    public final void a(float f, float f2) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d77e3d1eaf4c7ee3d6edeb03cd20005a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d77e3d1eaf4c7ee3d6edeb03cd20005a");
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putFloat("extra_key_set_volumn_left", f);
        bundle.putFloat("extra_key_set_volumn_right", f2);
        a.a(this.c, "MUSIC_ACTICON_SET_VOLUMN", bundle);
    }

    @Override // com.meituan.android.mtplayer.video.callback.b
    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b6efa79b719436d89ddf12064089f8a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b6efa79b719436d89ddf12064089f8a");
            return;
        }
        this.f = 0;
        this.g = 0;
        this.h = 0;
        a.a(this.c, "MUSIC_ACTICON_PLAY_RESET");
    }

    @Override // com.meituan.android.mtplayer.video.callback.b
    public final void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "21ff5730801011b6156a086a16252c33", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "21ff5730801011b6156a086a16252c33");
            return;
        }
        for (Observer observer : b) {
            this.d.deleteObserver(observer);
        }
        b.clear();
        a.a(this.c, "MUSIC_ACTICON_PLAY_RELEASE");
    }

    @Override // com.meituan.android.mtplayer.video.callback.b
    public final void setLooping(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "824d4834cb054c8ebe0591356f8404cd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "824d4834cb054c8ebe0591356f8404cd");
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("extra_key_set_looping", z);
        a.a(this.c, "MUSIC_ACTICON_SET_LOOPING", bundle);
    }

    @Override // com.meituan.android.mtplayer.video.callback.b
    public final int getDuration() {
        return this.h;
    }

    @Override // com.meituan.android.mtplayer.video.callback.b
    public final int getCurrentPosition() {
        return this.g;
    }

    @Override // com.meituan.android.mtplayer.video.callback.b
    public final void setPlaySpeed(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bfb20ef9f4017d735c64d482240717e3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bfb20ef9f4017d735c64d482240717e3");
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putFloat("extra_key_set_speed", f);
        a.a(this.c, "MUSIC_ACTICON_SET_SPEED", bundle);
    }

    @Override // java.util.Observer
    public final void update(Observable observable, Object obj) {
        Object[] objArr = {observable, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "56a92a7ead085f4e29070df408fb62ed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "56a92a7ead085f4e29070df408fb62ed");
            return;
        }
        com.meituan.android.mtplayer.audio.audioplayercallback.a aVar = (com.meituan.android.mtplayer.audio.audioplayercallback.a) obj;
        if (aVar instanceof com.meituan.android.mtplayer.audio.audioplayercallback.b) {
            com.meituan.android.mtplayer.audio.audioplayercallback.b bVar = (com.meituan.android.mtplayer.audio.audioplayercallback.b) aVar;
            this.g = bVar.b;
            this.h = bVar.c;
        } else if (aVar instanceof com.meituan.android.mtplayer.audio.audioplayercallback.c) {
            this.f = ((com.meituan.android.mtplayer.audio.audioplayercallback.c) aVar).b;
        }
    }
}

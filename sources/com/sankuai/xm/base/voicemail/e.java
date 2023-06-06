package com.sankuai.xm.base.voicemail;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class e extends com.sankuai.xm.base.service.a implements com.sankuai.xm.base.service.b {
    public static ChangeQuickRedirect a;
    private static a b;
    private d c;
    private MediaPlayer d;
    private boolean e;
    private String f;
    private b j;
    private AudioManager k;
    private AudioManager.OnAudioFocusChangeListener l;
    private final Context m;

    public e(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b49092eee2520042cfda40394b5ecb35", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b49092eee2520042cfda40394b5ecb35");
            return;
        }
        this.c = null;
        this.d = null;
        this.e = true;
        this.f = null;
        this.j = null;
        this.m = context;
        this.c = new d(context);
    }

    @Override // com.sankuai.xm.base.service.b
    public final void a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "76f9a6246e57900dba1f78e8483464f0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "76f9a6246e57900dba1f78e8483464f0");
            return;
        }
        Object[] objArr2 = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "d9e076d822824dcb29720212cead2404", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "d9e076d822824dcb29720212cead2404");
            return;
        }
        b = aVar;
        if (aVar != null) {
            d.a(aVar.b);
            d.a(aVar.a);
        }
    }

    @Override // com.sankuai.xm.base.service.b
    public final a bT_() {
        return b;
    }

    @Override // com.sankuai.xm.base.service.b
    public final synchronized void a(String str, c cVar) {
        Object[] objArr = {str, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2680978236c12b1ec6797afb1acb7ce7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2680978236c12b1ec6797afb1acb7ce7");
        } else if (this.c == null) {
        } else {
            int g = g();
            if (g != 1) {
                com.sankuai.xm.log.c.b("audio", "requestAudioFocus:" + g, new Object[0]);
            } else {
                this.c.c = cVar;
                this.c.d = str;
                d dVar = this.c;
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = d.a;
                if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "8ae4532d2bc8021ba83e058c63007a14", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "8ae4532d2bc8021ba83e058c63007a14");
                } else if (dVar.a(dVar.f)) {
                    if (!dVar.b(dVar.f)) {
                        com.sankuai.xm.log.c.c("SoundMeterImpl", "start: openSco failed, use phone mic.", new Object[0]);
                        dVar.b(false);
                    }
                } else {
                    dVar.b(false);
                }
            }
        }
    }

    @Override // com.sankuai.xm.base.service.b
    public final synchronized void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "947b971aee74c759aef8a55c96e359c3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "947b971aee74c759aef8a55c96e359c3");
        } else if (this.c == null) {
        } else {
            h();
            this.c.c(false);
        }
    }

    @Override // com.sankuai.xm.base.service.b
    public final synchronized void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "420f102f9e9c8afc26619d9ffdf26e25", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "420f102f9e9c8afc26619d9ffdf26e25");
            return;
        }
        if (this.c != null) {
            h();
            this.c.cancel();
        }
    }

    @Override // com.sankuai.xm.base.service.b
    public final synchronized int e() {
        double d;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "577fceadbbd15c00d1dbb2c6236b6f86", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "577fceadbbd15c00d1dbb2c6236b6f86")).intValue();
        } else if (this.c != null) {
            d dVar = this.c;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = d.a;
            if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "75fff50e3b5b603773a096dfad2c2906", 6917529027641081856L)) {
                d = ((Double) PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "75fff50e3b5b603773a096dfad2c2906")).doubleValue();
            } else if (dVar.b == null) {
                d = 0.0d;
            } else {
                int f = (dVar.b.f() * 11) / 32768;
                if (f >= 11) {
                    f = 10;
                }
                if (f >= dVar.e) {
                    dVar.e = f;
                } else if (dVar.e > 0) {
                    dVar.e--;
                }
                int i = 0;
                for (int i2 = 0; i2 < 11 && (i2 <= f || i2 == dVar.e); i2++) {
                    i++;
                }
                d = i;
            }
            return (int) d;
        } else {
            return 0;
        }
    }

    @Override // com.sankuai.xm.base.service.b
    public final synchronized void a(String str, b bVar, int i) {
        Object[] objArr = {str, bVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6386f91d26f1735676b4884af635682a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6386f91d26f1735676b4884af635682a");
            return;
        }
        com.sankuai.xm.log.c.b("audio", "VoiceMailEngine.playVoiceMail, file=" + str + ",speakPhone=" + this.e + ",seekTo:" + i, new Object[0]);
        int g = g();
        if (g != 1) {
            com.sankuai.xm.log.c.c("audio", "requestAudioFocus2:" + g, new Object[0]);
            return;
        }
        this.f = str;
        this.j = bVar;
        if (this.d == null) {
            this.d = new MediaPlayer();
        }
        this.d.reset();
        this.d.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: com.sankuai.xm.base.voicemail.e.1
            public static ChangeQuickRedirect a;

            @Override // android.media.MediaPlayer.OnPreparedListener
            public final void onPrepared(MediaPlayer mediaPlayer) {
                Object[] objArr2 = {mediaPlayer};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "11bb80816d4d1bf8614450bae896febd", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "11bb80816d4d1bf8614450bae896febd");
                    return;
                }
                mediaPlayer.start();
                if (e.this.j != null) {
                    e.this.j.onPrepared(mediaPlayer);
                }
            }
        });
        this.d.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: com.sankuai.xm.base.voicemail.e.2
            public static ChangeQuickRedirect a;

            @Override // android.media.MediaPlayer.OnCompletionListener
            public final void onCompletion(MediaPlayer mediaPlayer) {
                Object[] objArr2 = {mediaPlayer};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "46716cb718d4480fefaf78aefe615a18", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "46716cb718d4480fefaf78aefe615a18");
                    return;
                }
                e.this.h();
                if (e.this.j != null) {
                    e.this.j.onCompletion(mediaPlayer);
                }
            }
        });
        this.d.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: com.sankuai.xm.base.voicemail.e.3
            public static ChangeQuickRedirect a;

            @Override // android.media.MediaPlayer.OnErrorListener
            public final boolean onError(MediaPlayer mediaPlayer, int i2, int i3) {
                Object[] objArr2 = {mediaPlayer, Integer.valueOf(i2), Integer.valueOf(i3)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e48d83995ac7c1806750d3a4c7574813", 6917529027641081856L)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e48d83995ac7c1806750d3a4c7574813")).booleanValue();
                }
                if (e.this.j != null) {
                    e.this.j.onError(mediaPlayer, i2, i3);
                }
                return false;
            }
        });
        if (!this.e) {
            this.d.setAudioStreamType(0);
        } else {
            this.d.setAudioStreamType(3);
        }
        this.d.setDataSource(str);
        if (str.startsWith("http")) {
            this.d.prepareAsync();
            return;
        }
        this.d.prepare();
        this.d.seekTo(i);
    }

    @Override // com.sankuai.xm.base.service.b
    public final synchronized void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "98ab6f1a713c519893ea4c0cc94109d3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "98ab6f1a713c519893ea4c0cc94109d3");
            return;
        }
        this.f = null;
        this.j = null;
        h();
        f();
    }

    private synchronized void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "efd018d452256e1d3004977fd40fd752", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "efd018d452256e1d3004977fd40fd752");
            return;
        }
        if (this.d != null) {
            this.d.stop();
            this.d.release();
            this.d = null;
        }
    }

    @Override // com.sankuai.xm.base.service.b
    public final synchronized void a(boolean z, boolean z2) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d30773820d071d0895c8b6e3b994ee7b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d30773820d071d0895c8b6e3b994ee7b");
            return;
        }
        this.e = z;
        if (this.d != null && this.d.isPlaying() && this.j != null) {
            int currentPosition = z2 ? 0 : this.d.getCurrentPosition();
            f();
            a(this.f, this.j, currentPosition);
        }
    }

    private int g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac9ad7269bb831c8a7d2afaea215b576", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac9ad7269bb831c8a7d2afaea215b576")).intValue();
        }
        if (this.k == null) {
            this.k = (AudioManager) this.m.getSystemService("audio");
        }
        if (this.l == null) {
            this.l = new AudioManager.OnAudioFocusChangeListener() { // from class: com.sankuai.xm.base.voicemail.e.4
                public static ChangeQuickRedirect a;

                @Override // android.media.AudioManager.OnAudioFocusChangeListener
                public final void onAudioFocusChange(int i) {
                    Object[] objArr2 = {Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f3b83769451add8679a5cd87ed2c8991", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f3b83769451add8679a5cd87ed2c8991");
                    } else {
                        com.sankuai.xm.log.c.b("audio", "AudioFocusManager::onAudioFocusChange,%d", Integer.valueOf(i));
                    }
                }
            };
        }
        return this.k.requestAudioFocus(this.l, 3, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "04a370ff9acb8c7fe2da0f1a1df98d9d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "04a370ff9acb8c7fe2da0f1a1df98d9d");
        } else if (this.k == null || this.l == null) {
        } else {
            this.k.abandonAudioFocus(this.l);
        }
    }
}

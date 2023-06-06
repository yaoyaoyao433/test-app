package com.sankuai.xm.im.message.voice;

import android.media.MediaPlayer;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.service.m;
import com.sankuai.xm.base.util.k;
import com.sankuai.xm.base.voicemail.c;
import com.sankuai.xm.integration.crypto.CryptoProxy;
import java.io.File;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public final com.sankuai.xm.base.service.b b;
    public com.sankuai.xm.base.voicemail.b c;
    public String d;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a3ff9a1e109263083930a6b57d7948d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a3ff9a1e109263083930a6b57d7948d");
        } else {
            this.b = (com.sankuai.xm.base.service.b) m.a(com.sankuai.xm.base.service.b.class);
        }
    }

    public void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "106ecf35ffdf04a463125fec2ff019ff", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "106ecf35ffdf04a463125fec2ff019ff");
        } else if (TextUtils.isEmpty(str) || !CryptoProxy.c().a() || CryptoProxy.c().d(str)) {
        } else {
            k.t(str);
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.xm.im.message.voice.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public final class C1393a implements com.sankuai.xm.base.voicemail.b {
        public static ChangeQuickRedirect a;
        public com.sankuai.xm.base.voicemail.b b;
        public String c;

        public C1393a(com.sankuai.xm.base.voicemail.b bVar, String str) {
            Object[] objArr = {a.this, bVar, str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "213bb704be7b0893878a96143f6300c2", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "213bb704be7b0893878a96143f6300c2");
                return;
            }
            this.b = bVar;
            this.c = str;
        }

        @Override // com.sankuai.xm.base.voicemail.b, android.media.MediaPlayer.OnPreparedListener
        public final void onPrepared(MediaPlayer mediaPlayer) {
            Object[] objArr = {mediaPlayer};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac9f56864523271252ad159dd3d9d202", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac9f56864523271252ad159dd3d9d202");
            } else if (this.b != null) {
                this.b.onPrepared(mediaPlayer);
            }
        }

        @Override // com.sankuai.xm.base.voicemail.b, android.media.MediaPlayer.OnCompletionListener
        public final void onCompletion(MediaPlayer mediaPlayer) {
            Object[] objArr = {mediaPlayer};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "792a1f6035c5a27aee9d1168c54c4b26", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "792a1f6035c5a27aee9d1168c54c4b26");
                return;
            }
            a.this.a(this.c);
            if (this.b != null) {
                this.b.onCompletion(mediaPlayer);
            }
        }

        @Override // com.sankuai.xm.base.voicemail.b, android.media.MediaPlayer.OnErrorListener
        public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            Object[] objArr = {mediaPlayer, Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f06e110cfdf9008e4254fdd4aaada2f", 6917529027641081856L)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f06e110cfdf9008e4254fdd4aaada2f")).booleanValue();
            }
            a.this.a(this.c);
            if (this.b != null) {
                return this.b.onError(mediaPlayer, i, i2);
            }
            return false;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public final class b implements c {
        public static ChangeQuickRedirect a;
        public c b;

        public b(c cVar) {
            Object[] objArr = {a.this, cVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7b35d499f516fcd9294c7d85aa69ba5d", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7b35d499f516fcd9294c7d85aa69ba5d");
            } else {
                this.b = cVar;
            }
        }

        @Override // com.sankuai.xm.base.voicemail.c
        public final void a(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "59ec4aab938f0d24746092431165b145", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "59ec4aab938f0d24746092431165b145");
            } else if (this.b != null) {
                this.b.a(str);
            }
        }

        @Override // com.sankuai.xm.base.voicemail.c
        public final void b(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0cf6b31e392ef6cd5478b5fca42bb53b", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0cf6b31e392ef6cd5478b5fca42bb53b");
            } else if (this.b != null) {
                this.b.b(str);
            }
        }

        @Override // com.sankuai.xm.base.voicemail.c
        public final void a(long j, long j2, File file) {
            Object[] objArr = {new Long(j), new Long(j2), file};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c8ba5324bfeacbaaa02a6123844c0b43", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c8ba5324bfeacbaaa02a6123844c0b43");
                return;
            }
            String absolutePath = file.getAbsolutePath();
            CryptoProxy c = CryptoProxy.c();
            if (c.c(absolutePath)) {
                String a2 = CryptoProxy.c().a(absolutePath);
                if (!k.b(absolutePath, a2) || c.a(a2, absolutePath, 2) != 0) {
                    b(absolutePath);
                    return;
                }
            }
            if (this.b != null) {
                this.b.a(j, j2, file);
            }
        }
    }
}

package com.sankuai.xm.integration.knb.publish;

import android.media.MediaPlayer;
import com.dianping.titans.js.JsHost;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class a extends c implements com.sankuai.xm.base.voicemail.b {
    public static ChangeQuickRedirect a;
    private com.sankuai.xm.base.voicemail.b h;

    @Override // com.sankuai.xm.integration.knb.publish.c
    public final void b() {
    }

    public a(JsHost jsHost, short s, String str) {
        super(jsHost, "dxsdk.audioPlay", s, str);
        Object[] objArr = {jsHost, Short.valueOf(s), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "14a0d27b6f6af736f23f28a3c2381bc8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "14a0d27b6f6af736f23f28a3c2381bc8");
        } else {
            this.h = null;
        }
    }

    @Override // com.sankuai.xm.base.voicemail.b, android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        Object[] objArr = {mediaPlayer};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "54cff6f1b455a7a7204c761a8db61317", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "54cff6f1b455a7a7204c761a8db61317");
        } else {
            this.h.onPrepared(mediaPlayer);
        }
    }

    @Override // com.sankuai.xm.base.voicemail.b, android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        Object[] objArr = {mediaPlayer};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b3fc590ed7417b776533ad0fe7ce32ca", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b3fc590ed7417b776533ad0fe7ce32ca");
        } else {
            this.h.onCompletion(mediaPlayer);
        }
    }

    @Override // com.sankuai.xm.base.voicemail.b, android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        Object[] objArr = {mediaPlayer, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f63a7ccb1e3caea03c39024fc3550be4", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f63a7ccb1e3caea03c39024fc3550be4")).booleanValue() : this.h.onError(mediaPlayer, i, i2);
    }

    @Override // com.sankuai.xm.integration.knb.publish.c
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb3bcd0c386c1049c4ce3eac8d81973d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb3bcd0c386c1049c4ce3eac8d81973d");
            return;
        }
        final com.sankuai.xm.im.bridge.base.bridge_impl.proto_result.a aVar = this.g;
        Object[] objArr2 = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.xm.im.bridge.business.proto.im.a.a;
        this.h = PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "26097ddafecf0cac2751593038f1f9f0", 6917529027641081856L) ? (com.sankuai.xm.base.voicemail.b) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "26097ddafecf0cac2751593038f1f9f0") : new com.sankuai.xm.base.voicemail.b() { // from class: com.sankuai.xm.im.bridge.business.proto.im.a.12
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.xm.base.voicemail.b, android.media.MediaPlayer.OnPreparedListener
            public final void onPrepared(MediaPlayer mediaPlayer) {
                Object[] objArr3 = {mediaPlayer};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "43666c27d9055d753c15f224da6a92b5", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "43666c27d9055d753c15f224da6a92b5");
                    return;
                }
                try {
                    HashMap hashMap = new HashMap();
                    hashMap.put("status", 1);
                    a.a(aVar, hashMap);
                } catch (Throwable th) {
                    com.sankuai.xm.im.bridge.base.util.a.c("audioPlay::onPrepared exception:" + th, new Object[0]);
                }
            }

            @Override // com.sankuai.xm.base.voicemail.b, android.media.MediaPlayer.OnCompletionListener
            public final void onCompletion(MediaPlayer mediaPlayer) {
                Object[] objArr3 = {mediaPlayer};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e00b74e5bfe0a8f7d3fe71f020c18971", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e00b74e5bfe0a8f7d3fe71f020c18971");
                    return;
                }
                try {
                    HashMap hashMap = new HashMap();
                    hashMap.put("status", 2);
                    a.a(aVar, hashMap);
                } catch (Throwable th) {
                    com.sankuai.xm.im.bridge.base.util.a.c("audioPlay::onCompletion exception:" + th, new Object[0]);
                }
            }

            @Override // com.sankuai.xm.base.voicemail.b, android.media.MediaPlayer.OnErrorListener
            public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
                Object[] objArr3 = {mediaPlayer, Integer.valueOf(i), Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b516b0eacabeaa62d509c61e1287b8be", 6917529027641081856L)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b516b0eacabeaa62d509c61e1287b8be")).booleanValue();
                }
                try {
                    HashMap hashMap = new HashMap();
                    hashMap.put("status", 3);
                    a.a(aVar, hashMap);
                } catch (Throwable th) {
                    com.sankuai.xm.im.bridge.base.util.a.c("audioPlay::onError exception:" + th, new Object[0]);
                }
                return false;
            }
        };
    }
}

package com.meituan.mmp.lib.api.audio;

import android.media.MediaPlayer;
import com.meituan.mmp.lib.api.ServiceApi;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.SoftReference;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class AudioPlayerApi extends ServiceApi {
    public static ChangeQuickRedirect a;
    private HashMap<String, SoftReference<a>> h;

    public AudioPlayerApi() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "755345ad588c7d5bc6d190d3bce220f4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "755345ad588c7d5bc6d190d3bce220f4");
        } else {
            this.h = new HashMap<>();
        }
    }

    @Override // com.meituan.mmp.lib.api.InternalApi
    public final String[] b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "240b217eb6a65ac2746f97e0b2226c20", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "240b217eb6a65ac2746f97e0b2226c20") : new String[]{"createAudioInstance", "setAudioState", "operateAudio", "getAudioState", "destroyAudioInstance"};
    }

    @Override // com.meituan.mmp.lib.api.InternalApi
    public final String[] c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "443d157660dc9e08cc59571c4198b2f6", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "443d157660dc9e08cc59571c4198b2f6") : new String[]{"createAudioInstance", "setAudioState", "operateAudio", "getAudioState", "destroyAudioInstance", "onAudioCanplay.onCanplay", "onAudioPlay.onPlay", "onAudioPause.onPause", "onAudioStop.onStop", "onAudioError.onError", "onAudioWaiting.onWaiting", "onAudioSeeking.onSeeking", "onAudioSeeked.onSeeked", "operateAudio.play", "operateAudio.pause", "operateAudio.stop", "operateAudio.seek", "destroyAudioInstance.destroy", "innerAudioContext"};
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0180, code lost:
        if (r2.equals("stop") != false) goto L60;
     */
    @Override // com.meituan.mmp.lib.api.AbsApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void invoke(java.lang.String r19, org.json.JSONObject r20, com.meituan.mmp.main.IApiCallback r21) {
        /*
            Method dump skipped, instructions count: 870
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.mmp.lib.api.audio.AudioPlayerApi.invoke(java.lang.String, org.json.JSONObject, com.meituan.mmp.main.IApiCallback):void");
    }

    private MediaPlayer a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae48dc1ae208b59fc75a03a7e3ea71ac", RobustBitConfig.DEFAULT_VALUE)) {
            return (MediaPlayer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae48dc1ae208b59fc75a03a7e3ea71ac");
        }
        a d = d(str);
        if (d != null) {
            return d.d;
        }
        return null;
    }

    private a d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "89de01027649610c5a958f02ca786970", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "89de01027649610c5a958f02ca786970");
        }
        SoftReference<a> softReference = this.h.get(str);
        if (softReference == null || softReference.get() == null) {
            return null;
        }
        return softReference.get();
    }

    @Override // com.meituan.mmp.lib.api.ServiceApi
    public final void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c507193cd55c7696c92775fd8f3cdfe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c507193cd55c7696c92775fd8f3cdfe");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d689a4add8120ecf8d154fd3387b90fe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d689a4add8120ecf8d154fd3387b90fe");
        } else if (!this.h.isEmpty()) {
            for (SoftReference<a> softReference : this.h.values()) {
                a aVar = softReference.get();
                if (aVar != null && aVar.d != null) {
                    aVar.d.stop();
                    aVar.d.release();
                }
            }
            this.h.clear();
        }
    }
}

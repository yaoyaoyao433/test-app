package com.meituan.msi.api.audio;

import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.PlaybackParams;
import android.os.Build;
import android.text.TextUtils;
import com.google.gson.JsonElement;
import com.meituan.msi.annotations.MsiApiMethod;
import com.meituan.msi.api.IMsiApi;
import com.meituan.msi.api.audio.AudioWrapper;
import com.meituan.msi.bean.MsiContext;
import com.meituan.msi.bean.ResponseWithInnerData;
import com.meituan.msi.util.ae;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class AudioApi implements IMsiApi, com.meituan.msi.lifecycle.a {
    public static ChangeQuickRedirect a;
    private final Map<String, AudioWrapper> b;
    private AudioManager c;
    private AudioManager.OnAudioFocusChangeListener d;
    private boolean e;
    private boolean f;
    private a g;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface a {
        boolean a();
    }

    @Override // com.meituan.msi.lifecycle.a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "51c8f575c9617b1606364340b2f572a7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "51c8f575c9617b1606364340b2f572a7");
        }
    }

    @MsiApiMethod(name = "InnerAudioContext.offCanplay")
    public void offCanplay(MsiContext msiContext) {
    }

    @MsiApiMethod(name = "InnerAudioContext.offEnded")
    public void offEnded(MsiContext msiContext) {
    }

    @MsiApiMethod(name = "InnerAudioContext.offError")
    public void offError(MsiContext msiContext) {
    }

    @MsiApiMethod(name = "InnerAudioContext.offPause")
    public void offPause(MsiContext msiContext) {
    }

    @MsiApiMethod(name = "InnerAudioContext.offPlay")
    public void offPlay(MsiContext msiContext) {
    }

    @MsiApiMethod(name = "InnerAudioContext.offSeeked")
    public void offSeeked(MsiContext msiContext) {
    }

    @MsiApiMethod(name = "InnerAudioContext.offSeeking")
    public void offSeeking(MsiContext msiContext) {
    }

    @MsiApiMethod(name = "InnerAudioContext.offStop")
    public void offStop(MsiContext msiContext) {
    }

    @MsiApiMethod(name = "InnerAudioContext.offTimeUpdate")
    public void offTimeUpdate(MsiContext msiContext) {
    }

    @MsiApiMethod(name = "InnerAudioContext.offWaiting")
    public void offWaiting(MsiContext msiContext) {
    }

    @MsiApiMethod(isCallback = true, name = "InnerAudioContext.onCanplay")
    public void onCanplay(MsiContext msiContext) {
    }

    @MsiApiMethod(isCallback = true, name = "InnerAudioContext.onEnded")
    public void onEnded(MsiContext msiContext) {
    }

    @MsiApiMethod(isCallback = true, name = "InnerAudioContext.onPause")
    public void onMsiPause(MsiContext msiContext) {
    }

    @MsiApiMethod(isCallback = true, name = "InnerAudioContext.onPlay")
    public void onPlay(MsiContext msiContext) {
    }

    @MsiApiMethod(isCallback = true, name = "InnerAudioContext.onSeeked")
    public void onSeeked(MsiContext msiContext) {
    }

    @MsiApiMethod(isCallback = true, name = "InnerAudioContext.onSeeking")
    public void onSeeking(MsiContext msiContext) {
    }

    @MsiApiMethod(isCallback = true, name = "InnerAudioContext.onStop")
    public void onStop(MsiContext msiContext) {
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d889b6a3bb7340f3f8e7054ade36041b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d889b6a3bb7340f3f8e7054ade36041b");
        }
    }

    @MsiApiMethod(isCallback = true, name = "InnerAudioContext.onTimeUpdate")
    public void onTimeUpdate(MsiContext msiContext) {
    }

    @MsiApiMethod(isCallback = true, name = "InnerAudioContext.onWaiting")
    public void onWaiting(MsiContext msiContext) {
    }

    public AudioApi() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "388c06f49f385245452e1eb22bdc7fed", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "388c06f49f385245452e1eb22bdc7fed");
            return;
        }
        this.b = new ConcurrentHashMap();
        this.e = true;
        this.f = true;
        this.g = new a() { // from class: com.meituan.msi.api.audio.AudioApi.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.msi.api.audio.AudioApi.a
            public final boolean a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "41411e5b03d0176429f5c92c26ef5c2c", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "41411e5b03d0176429f5c92c26ef5c2c")).booleanValue() : AudioApi.this.e();
            }
        };
    }

    public static /* synthetic */ void b(AudioApi audioApi) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, audioApi, changeQuickRedirect, false, "dc5ec965552daf9bf394fceb1d506b42", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, audioApi, changeQuickRedirect, false, "dc5ec965552daf9bf394fceb1d506b42");
            return;
        }
        for (Map.Entry<String, AudioWrapper> entry : audioApi.b.entrySet()) {
            AudioWrapper value = entry.getValue();
            if (value != null) {
                value.stop();
            }
        }
    }

    @MsiApiMethod(name = "setInnerAudioOption", onSerializedThread = true, request = AudioOptionRequest.class)
    public void setInnerAudioOption(AudioOptionRequest audioOptionRequest, MsiContext msiContext) {
        Object[] objArr = {audioOptionRequest, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "67e908a00bc2f56f7ad47b4d036f34be", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "67e908a00bc2f56f7ad47b4d036f34be");
            return;
        }
        this.e = audioOptionRequest.mixWithOther;
        this.f = audioOptionRequest.speakerOn;
        if (this.c == null) {
            this.c = (AudioManager) com.meituan.msi.a.f().getSystemService("audio");
        }
        if (audioOptionRequest.speakerOn) {
            this.c.setSpeakerphoneOn(true);
        } else {
            this.c.setMode(3);
            this.c.setSpeakerphoneOn(false);
        }
        if (!audioOptionRequest.mixWithOther && audioOptionRequest.speakerOn) {
            if (this.d == null) {
                this.d = new AudioManager.OnAudioFocusChangeListener() { // from class: com.meituan.msi.api.audio.AudioApi.2
                    public static ChangeQuickRedirect a;

                    @Override // android.media.AudioManager.OnAudioFocusChangeListener
                    public final void onAudioFocusChange(int i) {
                        Object[] objArr2 = {Integer.valueOf(i)};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3096a60a5efb96ee7da6ddb6acd3503e", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3096a60a5efb96ee7da6ddb6acd3503e");
                            return;
                        }
                        switch (i) {
                            case -2:
                            case -1:
                                AudioApi.b(AudioApi.this);
                                if (AudioApi.this.c != null) {
                                    AudioApi.this.c.abandonAudioFocus(this);
                                    return;
                                }
                                return;
                            default:
                                return;
                        }
                    }
                };
            }
        } else {
            this.d = null;
        }
        msiContext.onSuccess(null);
    }

    @MsiApiMethod(name = "createInnerAudioContext", onSerializedThread = true)
    public void createInnerAudioContext(MsiContext msiContext) {
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2b3ef2a89d8aca0627c2896ea616082f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2b3ef2a89d8aca0627c2896ea616082f");
            return;
        }
        String b = b(msiContext);
        if (TextUtils.isEmpty(b)) {
            msiContext.onError(500, "taskId is empty");
        } else if (this.b.containsKey(b)) {
            msiContext.onError(500, "taskId is exist");
        } else {
            MediaPlayer mediaPlayer = new MediaPlayer();
            if (Build.VERSION.SDK_INT >= 26) {
                mediaPlayer.setAudioAttributes(new AudioAttributes.Builder().setUsage(14).setContentType(2).build());
            } else {
                mediaPlayer.setAudioStreamType(3);
            }
            this.b.put(b, new AudioWrapper(mediaPlayer, msiContext.getEventDispatcher(), b(msiContext), this.g));
            msiContext.onSuccess(null);
        }
    }

    @MsiApiMethod(name = "InnerAudioContext.getAudioProperties", onSerializedThread = true, response = GetAudioProperty.class)
    public void getAudioProperties(MsiContext msiContext) {
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "221fec26d60d23490e832cb1779207c3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "221fec26d60d23490e832cb1779207c3");
            return;
        }
        AudioWrapper a2 = a(msiContext);
        if (a2 == null) {
            msiContext.onError(500, "get AudioWrapper is null");
        } else if (a2.mediaPlayer != null) {
            GetAudioProperty audioProperty = a2.getAudioProperty();
            if (audioProperty == null) {
                msiContext.onError(500, "mediaPlayer is not prepared");
            } else {
                msiContext.onSuccess(audioProperty);
            }
        } else {
            msiContext.onError(500, "mediaPlayer is null");
        }
    }

    @MsiApiMethod(name = "InnerAudioContext.setAudioProperties", onSerializedThread = true, request = SetAudioProperty.class)
    public void setAudioProperties(SetAudioProperty setAudioProperty, MsiContext msiContext) {
        boolean z;
        boolean z2 = false;
        Object[] objArr = {setAudioProperty, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "80f37cd2ce90d0032c5f59ca0cf26119", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "80f37cd2ce90d0032c5f59ca0cf26119");
            return;
        }
        AudioWrapper a2 = a(msiContext);
        if (a2 == null || a2.mediaPlayer == null) {
            msiContext.onError(500, "audioWrapper or mediaPlayer is null");
            return;
        }
        MediaPlayer mediaPlayer = a2.mediaPlayer;
        String a3 = msiContext.getFileProvider().a(setAudioProperty.src);
        if (TextUtils.isEmpty(a3)) {
            msiContext.onError(500, "src is null!");
            return;
        }
        if (!TextUtils.equals(a2.currentSrc, setAudioProperty.src)) {
            a2.reset();
            a2.setAudioProperty(setAudioProperty);
            try {
                mediaPlayer.setDataSource(a3);
                a2.setInitialized(true);
                a2.setListener();
                mediaPlayer.prepare();
                a2.setPlayingPrepared(true);
            } catch (IOException e) {
                com.meituan.msi.log.a.a(ae.a("AudioApi setAudioProperties", e));
                msiContext.onError(500, "setAudioProperties error!");
                a2.setInitialized(false);
                return;
            }
        }
        Object[] objArr2 = {a2};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "04d39e6888fb5d1ee457af87d835d6f1", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "04d39e6888fb5d1ee457af87d835d6f1")).booleanValue();
        } else {
            z = (a2 == null || a2.getPlayStatus() == AudioWrapper.a.ERROR) ? false : true;
        }
        if (z) {
            mediaPlayer.setVolume(setAudioProperty.volume, setAudioProperty.volume);
            mediaPlayer.setLooping(setAudioProperty.loop);
        } else {
            com.meituan.msi.log.a.a("fail to set volume and loop");
        }
        Object[] objArr3 = {a2};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "aa6fc455425d77b4e146d390a75cb9aa", RobustBitConfig.DEFAULT_VALUE)) {
            z2 = ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "aa6fc455425d77b4e146d390a75cb9aa")).booleanValue();
        } else if (a2 != null && a2.getPlayStatus() != AudioWrapper.a.STOP && a2.getPlayStatus() != AudioWrapper.a.IDLE) {
            z2 = true;
        }
        if (z2 && setAudioProperty.playbackRate >= 0.0f) {
            if (Build.VERSION.SDK_INT >= 23) {
                PlaybackParams playbackParams = new PlaybackParams();
                playbackParams.setSpeed(setAudioProperty.playbackRate);
                mediaPlayer.setPlaybackParams(playbackParams);
            }
        } else {
            com.meituan.msi.log.a.a("fail to setPlaybackParams");
        }
        msiContext.onSuccess(null);
    }

    @MsiApiMethod(name = "InnerAudioContext.destroy", onSerializedThread = true)
    public void destroy(MsiContext msiContext) {
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc39060c5bb2d1d462b1c2f8cce30268", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc39060c5bb2d1d462b1c2f8cce30268");
            return;
        }
        String b = b(msiContext);
        AudioWrapper a2 = a(msiContext);
        if (a2 == null) {
            msiContext.onError(500, "not found the audioWrapper");
        } else if (!a2.isInitialized()) {
            msiContext.onError(500, "audioWrapper is not initialized");
            this.b.remove(b);
        } else {
            a2.destroy();
            this.b.remove(b);
            msiContext.onSuccess(null);
        }
    }

    @MsiApiMethod(name = "InnerAudioContext.pause", onSerializedThread = true)
    public void pause(MsiContext msiContext) {
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f7a16c4b738d68b201c88392d9695869", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f7a16c4b738d68b201c88392d9695869");
            return;
        }
        AudioWrapper a2 = a(msiContext);
        if (a2 == null) {
            msiContext.onError(500, "not found the audioWrapper");
        } else if (!a2.isInitialized()) {
            msiContext.onError(500, "audioWrapper is not initialized");
        } else {
            a2.pause();
            msiContext.onSuccess(null);
        }
    }

    @MsiApiMethod(name = "InnerAudioContext.play", onSerializedThread = true)
    public void play(MsiContext msiContext) {
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "39ca03a150660297b9da2a1eac213284", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "39ca03a150660297b9da2a1eac213284");
            return;
        }
        AudioWrapper a2 = a(msiContext);
        if (a2 == null) {
            msiContext.onError(500, "not found the audioWrapper");
        } else if (!a2.isInitialized()) {
            msiContext.onError(500, "audioWrapper is not initialized");
        } else if (e()) {
            a2.start();
            msiContext.onSuccess(null);
        } else {
            msiContext.onError(500, "create AudioManager failed or cant get audio focus!");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a11d5689805cf55acd91e87993fe736f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a11d5689805cf55acd91e87993fe736f")).booleanValue();
        }
        if (!this.e || this.f) {
            if (this.c == null) {
                this.c = (AudioManager) com.meituan.msi.a.f().getSystemService("audio");
            }
            if (this.c == null) {
                return false;
            }
            if (Build.VERSION.SDK_INT < 26) {
                return this.c.requestAudioFocus(this.d, 3, 1) == 1;
            }
            AudioFocusRequest.Builder builder = new AudioFocusRequest.Builder(1);
            builder.setAudioAttributes(new AudioAttributes.Builder().setUsage(14).setContentType(2).build());
            return this.c.requestAudioFocus(builder.build()) == 1;
        }
        return true;
    }

    @MsiApiMethod(name = "InnerAudioContext.seek", onSerializedThread = true, request = SeekRequest.class)
    public void seek(SeekRequest seekRequest, MsiContext msiContext) {
        Object[] objArr = {seekRequest, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7179017244d6c8f3eeeb50c6cdc940d8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7179017244d6c8f3eeeb50c6cdc940d8");
            return;
        }
        AudioWrapper a2 = a(msiContext);
        if (a2 == null) {
            msiContext.onError(500, "not found the audioWrapper");
        } else if (!a2.isInitialized()) {
            msiContext.onError(500, "audioWrapper is not initialized");
        } else {
            a2.seekTo((int) (seekRequest.position * 1000.0f));
            msiContext.onSuccess(null);
        }
    }

    @MsiApiMethod(name = "InnerAudioContext.stop", onSerializedThread = true)
    public void stop(MsiContext msiContext) {
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d0d5e607c34a7a1adc9bb2ff84376fd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d0d5e607c34a7a1adc9bb2ff84376fd");
            return;
        }
        AudioWrapper a2 = a(msiContext);
        if (a2 == null) {
            msiContext.onError(500, "not found the audioWrapper");
        } else if (!a2.isInitialized()) {
            msiContext.onError(500, "audioWrapper is not initialized");
        } else {
            a2.stop();
            msiContext.onSuccess(null);
        }
    }

    private AudioWrapper a(MsiContext msiContext) {
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4324290a38ad593afc29545e16cd7655", RobustBitConfig.DEFAULT_VALUE)) {
            return (AudioWrapper) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4324290a38ad593afc29545e16cd7655");
        }
        String b = b(msiContext);
        if (b == null) {
            return null;
        }
        return this.b.get(b);
    }

    private String b(MsiContext msiContext) {
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "074923c0e58db714f6e089c8a7537c81", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "074923c0e58db714f6e089c8a7537c81");
        }
        JsonElement jsonElement = msiContext.getInnerArgs().get(ResponseWithInnerData.TASK_ID);
        if (jsonElement != null) {
            String asString = jsonElement.getAsString();
            if (TextUtils.isEmpty(asString)) {
                return null;
            }
            return asString;
        }
        return null;
    }

    private void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3621d51e22b5350402b4bdd1a02f004f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3621d51e22b5350402b4bdd1a02f004f");
            return;
        }
        for (Map.Entry<String, AudioWrapper> entry : this.b.entrySet()) {
            AudioWrapper value = entry.getValue();
            if (value != null) {
                if (z) {
                    value.onContainerResume();
                } else {
                    value.onContainerPause();
                }
            }
        }
    }

    @Override // com.meituan.msi.lifecycle.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b7dce2b40722ea5e02d8894a0ef41a54", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b7dce2b40722ea5e02d8894a0ef41a54");
        } else {
            a(true);
        }
    }

    @Override // com.meituan.msi.lifecycle.a
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cf4de210cfed9efa9424007739c130ad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cf4de210cfed9efa9424007739c130ad");
        } else {
            a(false);
        }
    }

    @Override // com.meituan.msi.lifecycle.a
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5db2d1ed07ceb66d2f81258794dca8dd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5db2d1ed07ceb66d2f81258794dca8dd");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "16be5d3e1f4555c61b660ba46c1511fb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "16be5d3e1f4555c61b660ba46c1511fb");
            return;
        }
        for (Map.Entry<String, AudioWrapper> entry : this.b.entrySet()) {
            AudioWrapper value = entry.getValue();
            if (value != null) {
                value.destroy();
            }
        }
        this.b.clear();
    }
}

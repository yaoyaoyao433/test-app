package com.sankuai.xm.imui.session.presenter;

import android.app.Activity;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.View;
import com.meituan.android.privacy.interfaces.MtSensorManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.util.k;
import com.sankuai.xm.im.IMClient;
import com.sankuai.xm.im.message.bean.AudioMessage;
import com.sankuai.xm.im.message.bean.IMMessage;
import com.sankuai.xm.imui.IMUIManager;
import com.sankuai.xm.imui.common.util.d;
import com.sankuai.xm.imui.common.util.e;
import com.sankuai.xm.imui.common.util.i;
import com.sankuai.xm.imui.session.SessionFragment;
import com.sankuai.xm.imui.session.c;
import com.sankuai.xm.imui.session.view.AudioMsgView;
import com.sankuai.xm.imui.session.view.adapter.IAudioMsgAdapter;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class a implements SensorEventListener, com.sankuai.xm.base.voicemail.b {
    public static ChangeQuickRedirect a;
    public Context b;
    public AudioManager c;
    public MtSensorManager d;
    public i e;
    public Sensor f;
    public WeakReference<AudioMsgView> g;
    public String h;
    public WeakReference<View> i;
    private final Object j;
    private ArrayList<String> k;
    private int l;
    private boolean m;
    private boolean n;
    private c.a o;
    private IAudioMsgAdapter p;

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public a(c.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d3965237368f63a27889b61676ae03eb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d3965237368f63a27889b61676ae03eb");
            return;
        }
        this.j = new Object();
        this.k = new ArrayList<>();
        this.l = -1;
        this.m = false;
        this.n = true;
        this.i = null;
        this.o = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(AudioMsgView audioMsgView) {
        Object[] objArr = {audioMsgView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a8a4f7276598db44368a670143d4ab34", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a8a4f7276598db44368a670143d4ab34");
            return;
        }
        a(a(), false);
        this.p = (IAudioMsgAdapter) audioMsgView.getExtraAdapter();
        this.g = new WeakReference<>(audioMsgView);
        b((AudioMessage) audioMsgView.getMessage().b);
    }

    private void b(AudioMessage audioMessage) {
        Object[] objArr = {audioMessage};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f97c48e08e81edfaa45d295db7dd8bc6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f97c48e08e81edfaa45d295db7dd8bc6");
        } else if (audioMessage != null) {
            d.b("AudioMsgViewPresenter::startPlay msgUuid = " + audioMessage.getMsgUuid(), new Object[0]);
            if (a(audioMessage)) {
                if (this.c != null) {
                    this.c.requestAudioFocus(null, 3, 2);
                }
                a(true);
                this.h = audioMessage.getMsgUuid();
                IMClient.a().a(audioMessage.getMsgUuid(), audioMessage.getPath(), this);
                a((IMMessage) audioMessage);
            }
        }
    }

    public final void b(AudioMsgView audioMsgView) {
        Object[] objArr = {audioMsgView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f5643df16cf6835569d8c93272423ed7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f5643df16cf6835569d8c93272423ed7");
            return;
        }
        if (audioMsgView == null) {
            audioMsgView = a();
        }
        a(audioMsgView, true);
    }

    private void a(AudioMsgView audioMsgView, boolean z) {
        Object[] objArr = {audioMsgView, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "16acc7514172d2751112197bff5ebf42", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "16acc7514172d2751112197bff5ebf42");
            return;
        }
        if (audioMsgView != null) {
            audioMsgView.b();
        }
        d.b("AudioMsgViewPresenter::stopPlay msgUuid = " + this.h, new Object[0]);
        this.g = null;
        this.h = null;
        if (z) {
            IMClient.a().x();
            if (this.c != null) {
                this.c.abandonAudioFocus(null);
            }
            a(true, false);
            a(false);
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        boolean z = false;
        Object[] objArr = {sensorEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ecdd14236bda44194874375c53f3d64f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ecdd14236bda44194874375c53f3d64f");
        } else if (a() == null || sensorEvent.sensor.getType() != 8) {
        } else {
            float f = sensorEvent.values[0];
            if (f >= 0.0d && f < 5.0f && f < this.f.getMaximumRange()) {
                z = true;
            }
            a(!z, true);
        }
    }

    @Override // com.sankuai.xm.base.voicemail.b, android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        Object[] objArr = {mediaPlayer};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a8c8cfbfdba0f25cdbfd341700346699", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a8c8cfbfdba0f25cdbfd341700346699");
            return;
        }
        AudioMsgView a2 = a();
        if (a2 == null || ((IAudioMsgAdapter) a2.getExtraAdapter()).onPlayerEvent(3, a2.getMessage())) {
            return;
        }
        a2.a();
        a(a2.getMessage().b);
    }

    @Override // com.sankuai.xm.base.voicemail.b, android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        AudioMsgView audioMsgView;
        Object[] objArr = {mediaPlayer};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a46a46d9add863727db2bc6df305698f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a46a46d9add863727db2bc6df305698f");
            return;
        }
        d.b("AudioMsgViewPresenter::onCompletion msgUuid = " + this.h, new Object[0]);
        String str = this.h;
        AudioMsgView a2 = a();
        a(a2, false);
        if (a2 != null && !((IAudioMsgAdapter) a2.getExtraAdapter()).onPlayerEvent(5, a2.getMessage()) && a2.getVisibility() == 0 && !e.a(a2.getMessage())) {
            List<T> a3 = a2.a(AudioMsgView.class);
            int indexOf = a3.indexOf(a2);
            if (indexOf >= 0) {
                for (int i = indexOf + 1; i < a3.size(); i++) {
                    audioMsgView = (AudioMsgView) a3.get(i);
                    if (audioMsgView != null && a(audioMsgView.getMessage())) {
                        break;
                    }
                }
            }
            audioMsgView = null;
            if (audioMsgView != null) {
                a(audioMsgView);
                return;
            }
        }
        if (a(str)) {
            return;
        }
        b((AudioMsgView) null);
    }

    @Override // com.sankuai.xm.base.voicemail.b, android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        Object[] objArr = {mediaPlayer, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "47e7726060f48f29d83b29265aa6ce7b", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "47e7726060f48f29d83b29265aa6ce7b")).booleanValue();
        }
        d.b("AudioMsgViewPresenter::onError msgUuid = " + this.h, new Object[0]);
        AudioMsgView a2 = a();
        if (a2 != null && !((IAudioMsgAdapter) a2.getExtraAdapter()).onPlayerEvent(4, a2.getMessage())) {
            b(a2);
        }
        return false;
    }

    private boolean a(String str) {
        com.sankuai.xm.imui.session.entity.b<AudioMessage> bVar;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c5724d000d80c7c73b20e45e800e68d2", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c5724d000d80c7c73b20e45e800e68d2")).booleanValue();
        }
        List<com.sankuai.xm.imui.session.entity.b> c = this.o.c();
        if (!com.sankuai.xm.base.util.b.a(c)) {
            int i = 0;
            while (true) {
                if (i >= c.size()) {
                    break;
                }
                com.sankuai.xm.imui.session.entity.b bVar2 = c.get(i);
                if (bVar2 == null || !TextUtils.equals(bVar2.b(), str)) {
                    i++;
                } else if (e.a(bVar2)) {
                    return false;
                }
            }
            for (int i2 = i + 1; i2 < c.size(); i2++) {
                bVar = c.get(i2);
                if (a(bVar)) {
                    break;
                }
            }
        }
        bVar = null;
        if (bVar == null || (this.p != null && this.p.onPlayerEvent(5, bVar))) {
            return false;
        }
        d.b("AudioMsgViewPresenter::playNextAudioMessage msgUuid = " + bVar.b(), new Object[0]);
        b(bVar.b);
        return true;
    }

    private void a(IMMessage iMMessage) {
        Object[] objArr = {iMMessage};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a82b58f90e11629f2bd345167722d83", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a82b58f90e11629f2bd345167722d83");
        } else if (iMMessage == null || iMMessage.getFromUid() == IMUIManager.a().e() || iMMessage.getMsgStatus() == 11) {
        } else {
            iMMessage.setMsgStatus(11);
            IMClient.a().a(iMMessage.getMsgUuid(), iMMessage.getMsgStatus(), iMMessage.getCategory(), (IMClient.g<Boolean>) null);
        }
    }

    public void a(boolean z, boolean z2) {
        SessionFragment a2;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "19df808f5e76b11d3e2ca7cbf4efdca3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "19df808f5e76b11d3e2ca7cbf4efdca3");
        } else if (this.n == z) {
        } else {
            try {
                if (z) {
                    if (this.c != null) {
                        if (this.l != -1) {
                            this.c.setStreamVolume(3, this.l, 8);
                            this.l = -1;
                        }
                        this.c.setMode(0);
                        this.c.setSpeakerphoneOn(true);
                    }
                    if (z2 && (this.b instanceof Activity)) {
                        Activity activity = (Activity) this.b;
                        com.sankuai.meituan.android.ui.widget.a.a(activity, activity.getString(R.string.xm_sdk_msg_audio_speakerphone_on), -1).e(49).a();
                    }
                    if (this.e != null) {
                        this.e.a();
                    }
                } else {
                    if (this.c != null) {
                        this.c.setSpeakerphoneOn(false);
                        this.c.setMode(3);
                        this.l = this.c.getStreamVolume(3);
                        this.c.setStreamVolume(3, (this.c.getStreamMaxVolume(3) * 4) / 5, 8);
                    }
                    if (this.e != null && (this.b instanceof Activity)) {
                        if (this.i == null && (a2 = com.sankuai.xm.imui.session.b.a(this.b)) != null) {
                            this.i = new WeakReference<>(a2.getView());
                        }
                        View view = this.i.get();
                        if (view != null) {
                            this.e.a(view);
                        }
                    }
                }
                IMClient.a().b(z, false);
            } catch (Exception e) {
                com.sankuai.xm.monitor.statistics.a.a("imui", "AudioMsgViewPresenter::setSpeakerphone", e);
                d.a(e, "AudioMsgViewPresenter::setSpeakerphone.", new Object[0]);
            }
            this.n = z;
        }
    }

    public final boolean a(AudioMessage audioMessage) {
        Object[] objArr = {audioMessage};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e695d4b72a26dea1074ce5267b5d03f8", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e695d4b72a26dea1074ce5267b5d03f8")).booleanValue();
        }
        if (audioMessage == null) {
            d.d("AudioMsgViewPresenter::checkVoiceFileExist: msg is null", new Object[0]);
            return false;
        }
        String url = audioMessage.getUrl();
        String path = audioMessage.getPath();
        if (TextUtils.isEmpty(path)) {
            path = k.f(IMClient.a().b(2), k.c(url));
            audioMessage.setPath(path);
        }
        if (k.f(path)) {
            this.k.remove(url);
            return true;
        }
        if (!TextUtils.isEmpty(url) && !this.k.contains(url)) {
            d.c("AudioMsgViewPresenter::checkVoiceFileExist : url= %s, path= %s,没有音频文件，重新下载", url, path);
            this.k.add(url);
            IMClient.a().a(audioMessage, url, path, 4);
        }
        return false;
    }

    public void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d3980eceabbb88bfd7862aa4bc0301e8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d3980eceabbb88bfd7862aa4bc0301e8");
        } else if (this.d != null) {
            synchronized (this.j) {
                if (!this.m && z) {
                    this.d.registerListener(this, this.f, 3);
                    this.m = true;
                    d.b("AudioMsgViewPresenter::registerSensorListener 注册sensor listener", new Object[0]);
                } else if (this.m && !z) {
                    this.d.unregisterListener(this, this.f);
                    d.b("AudioMsgViewHelper::registerSensorListener 反注册sensor listener", new Object[0]);
                    this.m = false;
                }
            }
        }
    }

    private AudioMsgView a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d77658e4d9977f155201a5f98448704f", 6917529027641081856L)) {
            return (AudioMsgView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d77658e4d9977f155201a5f98448704f");
        }
        if (this.g == null) {
            return null;
        }
        return this.g.get();
    }

    private boolean a(com.sankuai.xm.imui.session.entity.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "607e750d8bb3d314ee5ef581c6d2290e", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "607e750d8bb3d314ee5ef581c6d2290e")).booleanValue() : (bVar == null || bVar.b == 0 || !(bVar.b instanceof AudioMessage) || bVar.b.getFromUid() == IMUIManager.a().e() || bVar.b.getMsgStatus() == 11) ? false : true;
    }
}

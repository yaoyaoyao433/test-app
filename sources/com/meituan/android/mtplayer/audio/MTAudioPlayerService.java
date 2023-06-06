package com.meituan.android.mtplayer.audio;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.support.v4.app.NotificationCompat;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.android.mtplayer.video.callback.IPlayerStateCallback;
import com.meituan.android.mtplayer.video.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class MTAudioPlayerService extends Service {
    public static ChangeQuickRedirect a;
    private f b;
    private IPlayerStateCallback c;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    public MTAudioPlayerService() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "61d16147b619254603f782f3c2662b1c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "61d16147b619254603f782f3c2662b1c");
        } else {
            this.c = new IPlayerStateCallback() { // from class: com.meituan.android.mtplayer.audio.MTAudioPlayerService.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.mtplayer.video.callback.IPlayerStateCallback
                public final void a(int i) {
                    Object[] objArr2 = {Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d89e86ad7102458231e04e88eb48c9a4", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d89e86ad7102458231e04e88eb48c9a4");
                        return;
                    }
                    com.meituan.android.mtplayer.audio.audioplayercallback.c a2 = com.meituan.android.mtplayer.audio.audioplayercallback.c.a(i);
                    b.a().a(a2);
                    com.meituan.android.mtplayer.audio.audioplayercallback.c.a(a2);
                }

                @Override // com.meituan.android.mtplayer.video.callback.IPlayerStateCallback
                public final void a(int i, int i2, int i3) {
                    Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "34c780dd1449d12aa96d15367733a6bf", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "34c780dd1449d12aa96d15367733a6bf");
                        return;
                    }
                    com.meituan.android.mtplayer.audio.audioplayercallback.b a2 = com.meituan.android.mtplayer.audio.audioplayercallback.b.a(i, i2);
                    b.a().a(a2);
                    com.meituan.android.mtplayer.audio.audioplayercallback.b.a(a2);
                }
            };
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f0096677fe647799836d5aa5f8397d13", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f0096677fe647799836d5aa5f8397d13");
            return;
        }
        com.sankuai.waimai.foundation.core.lifecycle.c.a(this);
        super.onCreate();
        Object[] objArr2 = {this};
        ChangeQuickRedirect changeQuickRedirect2 = c.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "015ce443d224f29bb194e96ccf4edde0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "015ce443d224f29bb194e96ccf4edde0");
        } else {
            try {
                if (Build.VERSION.SDK_INT >= 26) {
                    NotificationChannel notificationChannel = new NotificationChannel("com.meituan.android.mtplayer.video.MUSIC_CHANNEL_ID", "notification_channel", 2);
                    notificationChannel.setDescription("notification_channel_description");
                    ((NotificationManager) getSystemService(RemoteMessageConst.NOTIFICATION)).createNotificationChannel(notificationChannel);
                    startForeground(-37201, new NotificationCompat.Builder(this, "com.meituan.android.mtplayer.video.MUSIC_CHANNEL_ID").setContentTitle("").setContentText("").setChannelId("com.meituan.android.mtplayer.video.MUSIC_CHANNEL_ID").build());
                }
            } catch (Throwable unused) {
            }
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "da55325439bd2c146b867b588f3f485a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "da55325439bd2c146b867b588f3f485a");
            return;
        }
        this.b = new f(this);
        this.b.a(this.c);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d7, code lost:
        if (r0.equals("MUSIC_ACTICON_PAUSE") != false) goto L19;
     */
    @Override // android.app.Service
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int onStartCommand(android.content.Intent r16, int r17, int r18) {
        /*
            Method dump skipped, instructions count: 658
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.mtplayer.audio.MTAudioPlayerService.onStartCommand(android.content.Intent, int, int):int");
    }

    @Override // android.app.Service
    public final void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d4d6b1f03c7a50b434274c5ad7a6706", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d4d6b1f03c7a50b434274c5ad7a6706");
            return;
        }
        com.sankuai.waimai.foundation.core.lifecycle.c.b(this);
        super.onDestroy();
        if (this.b != null) {
            this.b.g();
            this.b = null;
        }
    }
}

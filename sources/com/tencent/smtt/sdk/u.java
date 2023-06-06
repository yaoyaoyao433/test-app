package com.tencent.smtt.sdk;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;
import com.tencent.smtt.export.external.DexLoader;
/* loaded from: classes6.dex */
public class u extends FrameLayout implements MediaPlayer.OnErrorListener {
    private Object a;
    private w b;
    private VideoView c;
    private Context d;
    private String e;

    public u(Context context) {
        super(context.getApplicationContext());
        this.d = null;
        this.d = context;
    }

    private void b(Bundle bundle, Object obj) {
        boolean z;
        a();
        if (b()) {
            bundle.putInt("callMode", bundle.getInt("callMode"));
            z = this.b.a(this.a, bundle, this, obj);
        } else {
            z = false;
        }
        if (z) {
            return;
        }
        if (this.c != null) {
            this.c.stopPlayback();
        }
        if (this.c == null) {
            this.c = new VideoView(getContext());
        }
        this.e = bundle.getString("videoUrl");
        this.c.setVideoURI(Uri.parse(this.e));
        this.c.setOnErrorListener(this);
        Intent intent = new Intent("com.tencent.smtt.tbs.video.PLAY");
        intent.addFlags(com.tencent.mapsdk.internal.y.a);
        Context applicationContext = getContext().getApplicationContext();
        intent.setPackage(applicationContext.getPackageName());
        applicationContext.startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        setBackgroundColor(-16777216);
        if (this.b == null) {
            g.a(true).a(getContext().getApplicationContext(), false, false);
            v a = g.a(true).a();
            DexLoader b = a != null ? a.b() : null;
            if (b != null && QbSdk.canLoadVideo(getContext())) {
                this.b = new w(b);
            }
        }
        if (this.b == null || this.a != null) {
            return;
        }
        this.a = this.b.a(getContext().getApplicationContext());
    }

    public void a(Activity activity) {
        if (b() || this.c == null) {
            return;
        }
        if (this.c.getParent() == null) {
            Window window = activity.getWindow();
            FrameLayout frameLayout = (FrameLayout) window.getDecorView();
            window.addFlags(1024);
            window.addFlags(128);
            frameLayout.setBackgroundColor(-16777216);
            MediaController mediaController = new MediaController(activity);
            mediaController.setMediaPlayer(this.c);
            this.c.setMediaController(mediaController);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            layoutParams.gravity = 17;
            frameLayout.addView(this.c, layoutParams);
        }
        if (Build.VERSION.SDK_INT >= 8) {
            this.c.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Activity activity, int i) {
        if (i == 3 && !b() && this.c != null) {
            this.c.pause();
        }
        if (i == 4) {
            this.d = null;
            if (!b() && this.c != null) {
                this.c.stopPlayback();
                this.c = null;
            }
        }
        if (i == 2 && !b()) {
            this.d = activity;
            a(activity);
        }
        if (b()) {
            this.b.a(this.a, activity, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Bundle bundle, Object obj) {
        b(bundle, obj);
    }

    public boolean b() {
        return (this.b == null || this.a == null) ? false : true;
    }

    public void c() {
        if (b()) {
            this.b.a(this.a);
        }
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        try {
            if (this.d instanceof Activity) {
                Activity activity = (Activity) this.d;
                if (!activity.isFinishing()) {
                    activity.finish();
                }
            }
            Context context = getContext();
            if (context != null) {
                Toast.makeText(context, "播放失败，请选择其它播放器播放", 1).show();
                Context applicationContext = context.getApplicationContext();
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.addFlags(com.tencent.mapsdk.internal.y.a);
                intent.setDataAndType(Uri.parse(this.e), "video/*");
                applicationContext.startActivity(intent);
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}

package com.sankuai.xm.video;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.constraint.R;
import android.support.v7.app.AlertDialog;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.meituan.android.mtplayer.video.MTVideoPlayerView;
import com.meituan.android.mtplayer.video.VideoPlayerParam;
import com.meituan.android.mtplayer.video.callback.IPlayerStateCallback;
import com.meituan.android.privacy.interfaces.PermissionGuard;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.xm.base.util.ActivityUtils;
import com.sankuai.xm.base.util.ad;
import com.sankuai.xm.base.util.k;
import com.sankuai.xm.base.util.v;
import com.sankuai.xm.integration.crypto.CryptoProxy;
import com.tencent.connect.share.QzonePublish;
import com.tencent.smtt.sdk.TbsListener;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class PlayVideoActivity extends BaseActivity implements View.OnClickListener {
    public static ChangeQuickRedirect b;
    private IPlayerStateCallback A;
    private Handler B;
    private RelativeLayout c;
    private MTVideoPlayerView d;
    private View e;
    private ImageView f;
    private TextView g;
    private TextView h;
    private TextView i;
    private ImageView j;
    private ProgressBar k;
    private ProgressBar l;
    private AudioManager m;
    private int n;
    private String o;
    private String p;
    private String q;
    private String r;
    private Bundle s;
    private String t;
    private boolean u;
    private boolean v;
    private boolean w;
    private AlertDialog x;
    private BroadcastReceiver y;
    private AtomicBoolean z;

    public PlayVideoActivity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "46d020d8b72d07c2e3802264d27adeee", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "46d020d8b72d07c2e3802264d27adeee");
            return;
        }
        this.n = 0;
        this.v = true;
        this.z = new AtomicBoolean(false);
        this.A = new IPlayerStateCallback() { // from class: com.sankuai.xm.video.PlayVideoActivity.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.mtplayer.video.callback.IPlayerStateCallback
            public final void a(int i) {
                Object[] objArr2 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "87a5fd46bcacbb316a37f3016450b2e9", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "87a5fd46bcacbb316a37f3016450b2e9");
                } else if (i == -1) {
                    Object[] objArr3 = {1, -1};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "485fdd9e8b0bb3bf041fd514d4fc575e", 6917529027641081856L)) {
                        ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "485fdd9e8b0bb3bf041fd514d4fc575e")).booleanValue();
                        return;
                    }
                    com.sankuai.xm.recorder.b.d("PlayVideoActivity,PlayerControllerCallback.onError=1,-1", new Object[0]);
                    com.sankuai.meituan.android.ui.widget.a.a(PlayVideoActivity.this, PlayVideoActivity.this.getString(R.string.xm_sdk_video_load_error_try_again), -1).a();
                    if (f.a().c != null) {
                        StringBuilder sb = new StringBuilder("加载失败:");
                        sb.append(1);
                        sb.append(",-1");
                    }
                    PlayVideoActivity.this.finish();
                } else if (i != 7) {
                    switch (i) {
                        case 1:
                            PlayVideoActivity.this.c(1);
                            com.sankuai.xm.recorder.b.b("PlayVideoActivity,IPlayerStateCallback.STATE_PREPARING", new Object[0]);
                            return;
                        case 2:
                            com.sankuai.xm.recorder.b.b("PlayVideoActivity,IPlayerStateCallback.STATE_PREPARED", new Object[0]);
                            return;
                        case 3:
                            Object[] objArr4 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "508690d736929d70105bb00a47dcf327", 6917529027641081856L)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "508690d736929d70105bb00a47dcf327");
                            } else {
                                com.sankuai.xm.recorder.b.b("PlayVideoActivity,IPlayerStateCallback.onStartPlay", new Object[0]);
                                PlayVideoActivity.a(PlayVideoActivity.this);
                                if (PlayVideoActivity.this.v) {
                                    PlayVideoActivity.this.a(TbsListener.ErrorCode.EXCEED_UNZIP_RETRY_NUM, 4000, true);
                                    PlayVideoActivity.this.g.setVisibility(8);
                                    if (!TextUtils.isEmpty(PlayVideoActivity.this.q)) {
                                        PlayVideoActivity.this.h.setText(PlayVideoActivity.this.q);
                                        PlayVideoActivity.this.h.setVisibility(0);
                                    }
                                    PlayVideoActivity.a(PlayVideoActivity.this, false);
                                }
                            }
                            a(true);
                            return;
                        case 4:
                            a(false);
                            return;
                        case 5:
                            PlayVideoActivity.this.c(3);
                            return;
                        default:
                            return;
                    }
                } else {
                    Object[] objArr5 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect5 = a;
                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "38de576af700be5866b600dcd06fb437", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "38de576af700be5866b600dcd06fb437");
                        return;
                    }
                    com.sankuai.xm.recorder.b.b("PlayVideoActivity,IPlayerStateCallback.onCompletion", new Object[0]);
                    PlayVideoActivity.this.d.c();
                }
            }

            @Override // com.meituan.android.mtplayer.video.callback.IPlayerStateCallback
            public final void a(int i, int i2, int i3) {
                Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e928b64a5104a5d86bc9f8a2b7bb9f85", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e928b64a5104a5d86bc9f8a2b7bb9f85");
                    return;
                }
                Object[] objArr3 = {Integer.valueOf(i), Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "057ba2bd2ad5867d8add854dfc03564f", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "057ba2bd2ad5867d8add854dfc03564f");
                    return;
                }
                PlayVideoActivity.this.k.setVisibility(8);
                PlayVideoActivity.this.k.setMax(i2);
                PlayVideoActivity.this.k.setProgress(i);
                PlayVideoActivity.this.k.postInvalidate();
            }

            private void a(boolean z) {
                Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d1c17707490b7b71eaa7559b5769d76e", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d1c17707490b7b71eaa7559b5769d76e");
                    return;
                }
                com.sankuai.xm.recorder.b.b("PlayVideoActivity,IPlayerStateCallback.onPlayOrPause,isPlaying=" + z, new Object[0]);
                if (!z || PlayVideoActivity.this.n == 2) {
                    return;
                }
                PlayVideoActivity.this.c(2);
            }
        };
        this.B = new Handler(Looper.getMainLooper()) { // from class: com.sankuai.xm.video.PlayVideoActivity.2
            public static ChangeQuickRedirect a;

            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                Object[] objArr2 = {message};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "936b7dbfb30443f458f5f998bffb601d", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "936b7dbfb30443f458f5f998bffb601d");
                } else if (message.what == 1) {
                    PlayVideoActivity.this.a();
                } else {
                    super.handleMessage(message);
                }
            }
        };
    }

    public static /* synthetic */ void a(PlayVideoActivity playVideoActivity) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, playVideoActivity, changeQuickRedirect, false, "0875c4fe9186405b3c62a8119b0839b4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, playVideoActivity, changeQuickRedirect, false, "0875c4fe9186405b3c62a8119b0839b4");
            return;
        }
        com.sankuai.xm.recorder.b.d("PlayVideoActivity,playing", new Object[0]);
        playVideoActivity.c(2);
        f.a();
    }

    public static /* synthetic */ boolean a(PlayVideoActivity playVideoActivity, boolean z) {
        playVideoActivity.v = false;
        return false;
    }

    public static /* synthetic */ void b(PlayVideoActivity playVideoActivity, String str) {
        String str2;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, playVideoActivity, changeQuickRedirect, false, "602a8d2049fe303c923dfd76523207fb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, playVideoActivity, changeQuickRedirect, false, "602a8d2049fe303c923dfd76523207fb");
        } else if (!v.b(playVideoActivity, true)) {
            com.sankuai.xm.recorder.b.c("PlayVideoActivity::saveVideo no permission, we trigger request.", new Object[0]);
        } else if (TextUtils.isEmpty(str)) {
            com.sankuai.xm.recorder.b.d("PlayVideoActivity::saveVideo dir is empty.", new Object[0]);
            ad.a(playVideoActivity, playVideoActivity.getString(R.string.xm_sdk_message_save_video_failed), -1, 81);
        } else {
            String str3 = playVideoActivity.o;
            String b2 = com.sankuai.xm.file.util.c.b(str3);
            StringBuilder sb = new StringBuilder("xm_");
            sb.append(System.currentTimeMillis());
            if (TextUtils.isEmpty(b2)) {
                str2 = "";
            } else {
                str2 = CommonConstant.Symbol.DOT + b2;
            }
            sb.append(str2);
            String a = com.sankuai.xm.file.util.c.a(str, sb.toString());
            com.sankuai.xm.recorder.b.b("PlayVideoActivity::saveVideo:: path = %s, savePath = %s", str3, a);
            if (com.sankuai.xm.file.util.c.a(str3, a, true)) {
                ad.a(playVideoActivity, playVideoActivity.getString(R.string.xm_sdk_message_save_video_success, new Object[]{a}), 0, 81);
            } else {
                ad.a(playVideoActivity, playVideoActivity.getString(R.string.xm_sdk_message_save_video_failed), -1, 81);
            }
        }
    }

    public static /* synthetic */ boolean b(PlayVideoActivity playVideoActivity, boolean z) {
        playVideoActivity.u = true;
        return true;
    }

    public static /* synthetic */ void l(PlayVideoActivity playVideoActivity) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, playVideoActivity, changeQuickRedirect, false, "c37890ca7bb80414361047e3b84ae029", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, playVideoActivity, changeQuickRedirect, false, "c37890ca7bb80414361047e3b84ae029");
        } else if (playVideoActivity.x == null || !playVideoActivity.x.isShowing()) {
            AlertDialog.a b2 = new AlertDialog.a(playVideoActivity, 2131558928).b(R.string.xm_sdk_video_play_allow_to_use_sdcard).a(R.string.xm_sdk_video_play_request_permission_ok, new DialogInterface.OnClickListener() { // from class: com.sankuai.xm.video.PlayVideoActivity.9
                public static ChangeQuickRedirect a;

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    Object[] objArr2 = {dialogInterface, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cb92d73aeeae6a06d9d894e6ca0232ca", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cb92d73aeeae6a06d9d894e6ca0232ca");
                        return;
                    }
                    PlayVideoActivity.b(PlayVideoActivity.this, true);
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + PlayVideoActivity.this.getPackageName()));
                    PlayVideoActivity.this.startActivity(intent);
                }
            }).b(R.string.xm_sdk_video_play_request_permission_cancel, new DialogInterface.OnClickListener() { // from class: com.sankuai.xm.video.PlayVideoActivity.8
                public static ChangeQuickRedirect a;

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    Object[] objArr2 = {dialogInterface, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4a352d3304b0692049d8773f9972eaf2", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4a352d3304b0692049d8773f9972eaf2");
                    } else {
                        PlayVideoActivity.this.f();
                    }
                }
            });
            b2.a.p = new DialogInterface.OnCancelListener() { // from class: com.sankuai.xm.video.PlayVideoActivity.7
                public static ChangeQuickRedirect a;

                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    Object[] objArr2 = {dialogInterface};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "dc1c21a57586e946016b02bcb7778995", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "dc1c21a57586e946016b02bcb7778995");
                    } else {
                        PlayVideoActivity.this.f();
                    }
                }
            };
            playVideoActivity.x = b2.a();
            com.sankuai.xm.base.util.g.b(playVideoActivity.x, playVideoActivity);
        }
    }

    @Override // com.sankuai.xm.video.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "daf213ac5580c99cb198171abbe5e858", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "daf213ac5580c99cb198171abbe5e858");
            return;
        }
        super.onCreate(bundle);
        setContentView(R.layout.xm_sdk_activity_video_play);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = b;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4c8bac4631b7b662e68186f9bbff67ea", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4c8bac4631b7b662e68186f9bbff67ea");
        } else {
            this.d = (MTVideoPlayerView) findViewById(R.id.videolib_videoview_play_video);
            this.c = (RelativeLayout) findViewById(R.id.videolib_rl_play_video);
            this.e = findViewById(R.id.videolib_img_play_screenshot);
            this.f = (ImageView) findViewById(R.id.videolib_img_download_bg);
            this.g = (TextView) findViewById(R.id.videolib_tv_play_touch);
            this.h = (TextView) findViewById(R.id.videolib_tv_play_disclaimer);
            this.i = (TextView) findViewById(R.id.videolib_tv_play_choose);
            this.j = (ImageView) findViewById(R.id.videolib_tv_play_return);
            this.k = (ProgressBar) findViewById(R.id.videolib_progress_play);
            this.l = (ProgressBar) findViewById(R.id.videolib_progress_play_download);
            this.d.setPlayStateCallback(this.A);
            this.d.setLooping(true);
        }
        this.m = (AudioManager) getApplicationContext().getSystemService("audio");
        this.o = com.sankuai.waimai.platform.utils.f.a(getIntent(), QzonePublish.PUBLISH_TO_QZONE_VIDEO_PATH);
        this.p = com.sankuai.waimai.platform.utils.f.a(getIntent(), "videoUrl");
        this.r = com.sankuai.waimai.platform.utils.f.a(getIntent(), "screenShotUrl");
        this.q = com.sankuai.waimai.platform.utils.f.a(getIntent(), "msg");
        this.t = com.sankuai.waimai.platform.utils.f.a(getIntent(), "nextClass");
        this.s = getIntent().getExtras();
        if (!TextUtils.isEmpty(this.t)) {
            this.i.setVisibility(0);
            this.i.setOnClickListener(this);
            this.j.setVisibility(0);
            this.j.setOnClickListener(this);
        } else {
            this.c.setOnClickListener(this);
            this.d.setOnClickListener(this);
        }
        this.d.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.sankuai.xm.video.PlayVideoActivity.3
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                Object[] objArr3 = {view};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "d4cc567f14d493d2a9bd27de2400aa11", 6917529027641081856L)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "d4cc567f14d493d2a9bd27de2400aa11")).booleanValue();
                }
                if (PlayVideoActivity.this.d.isShown() && k.f(PlayVideoActivity.this.o)) {
                    final PlayVideoActivity playVideoActivity = PlayVideoActivity.this;
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = PlayVideoActivity.b;
                    if (PatchProxy.isSupport(objArr4, playVideoActivity, changeQuickRedirect4, false, "68d3beb797547f5fe61441c2633acc11", 6917529027641081856L)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr4, playVideoActivity, changeQuickRedirect4, false, "68d3beb797547f5fe61441c2633acc11")).booleanValue();
                    }
                    if (com.sankuai.waimai.platform.utils.f.a(playVideoActivity.getIntent(), "video_save_enable", false)) {
                        com.sankuai.xm.base.util.g.a(playVideoActivity.getResources().getStringArray(R.array.xm_sdk_play_video_sub_page_menu), "", new DialogInterface.OnClickListener() { // from class: com.sankuai.xm.video.PlayVideoActivity.6
                            public static ChangeQuickRedirect a;

                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i) {
                                Object[] objArr5 = {dialogInterface, Integer.valueOf(i)};
                                ChangeQuickRedirect changeQuickRedirect5 = a;
                                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "8f54aa6215d7cbe9ae9ac7369467760d", 6917529027641081856L)) {
                                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "8f54aa6215d7cbe9ae9ac7369467760d");
                                } else if (i != 0) {
                                } else {
                                    PlayVideoActivity.b(PlayVideoActivity.this, com.sankuai.waimai.platform.utils.f.a(PlayVideoActivity.this.getIntent(), "video_save_dir"));
                                }
                            }
                        });
                        return true;
                    }
                    return false;
                }
                return false;
            }
        });
        c(0);
        if (CryptoProxy.c().d(this.o)) {
            final WeakReference weakReference = new WeakReference(this);
            com.sankuai.xm.threadpool.scheduler.a.b().a(24, 3, new Runnable() { // from class: com.sankuai.xm.video.PlayVideoActivity.4
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "7546d93012623253cdd3432195026592", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "7546d93012623253cdd3432195026592");
                    } else if (ActivityUtils.a((Activity) weakReference.get())) {
                        String a2 = CryptoProxy.c().a(PlayVideoActivity.this.o);
                        CryptoProxy.c().a(PlayVideoActivity.this.o, a2, 1);
                        PlayVideoActivity.this.o = a2;
                        PlayVideoActivity.this.B.sendEmptyMessage(1);
                    }
                }
            });
            return;
        }
        a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e7f30bddc3ebd7004fbc06062961192c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e7f30bddc3ebd7004fbc06062961192c");
        } else if (ActivityUtils.a((Activity) this)) {
            this.w = !b();
            if (this.w) {
                c();
            }
        }
    }

    private boolean b() {
        VideoPlayerParam videoPlayerParam;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8dbad0281b2eea906fa786df7124fe48", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8dbad0281b2eea906fa786df7124fe48")).booleanValue();
        }
        if (TextUtils.isEmpty(this.o) || !k.o(this.o)) {
            return false;
        }
        c(2);
        if (Build.VERSION.SDK_INT > 29) {
            videoPlayerParam = new VideoPlayerParam(k.b(this.o));
        } else {
            videoPlayerParam = new VideoPlayerParam(this.o);
        }
        this.d.setDataSource(videoPlayerParam);
        this.d.c();
        return true;
    }

    private void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d02da1b1e6dbaff9ca00d92fd7b223de", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d02da1b1e6dbaff9ca00d92fd7b223de");
        } else if (!TextUtils.isEmpty(this.p)) {
            d();
        } else {
            com.sankuai.meituan.android.ui.widget.a.a(this, getString(R.string.xm_sdk_video_error_cant_not_load), -1).a();
            f.a();
            finish();
        }
    }

    private void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "13771cb2e7eb303a542bb3272846af1c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "13771cb2e7eb303a542bb3272846af1c");
            return;
        }
        String str = f.a().d;
        if (TextUtils.isEmpty(this.o) && !TextUtils.isEmpty(this.p) && !TextUtils.isEmpty(str)) {
            this.o = str + this.p.substring(this.p.lastIndexOf(47)) + ".mp4";
        }
        if ((TextUtils.isEmpty(this.o) || !k.o(this.o)) && !com.sankuai.xm.base.util.net.d.d(this)) {
            f.a();
            com.sankuai.meituan.android.ui.widget.a.a(this, getString(R.string.xm_sdk_video_net_error_try_again), -1).a();
            finish();
            return;
        }
        com.meituan.android.privacy.interfaces.e createPermissionGuard = Privacy.createPermissionGuard();
        if (createPermissionGuard == null) {
            com.sankuai.xm.recorder.b.c("PlayVideoActivity::downloadVideo perm is null.", new Object[0]);
        } else if (createPermissionGuard.a(this, PermissionGuard.PERMISSION_STORAGE_WRITE, "jcyf-e4b399808a333f25") > 0) {
            e();
        } else {
            createPermissionGuard.a((Activity) this, PermissionGuard.PERMISSION_STORAGE_WRITE, "jcyf-e4b399808a333f25", (com.meituan.android.privacy.interfaces.d) new com.meituan.android.privacy.interfaces.g() { // from class: com.sankuai.xm.video.PlayVideoActivity.5
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.privacy.interfaces.d
                public final void onResult(String str2, int i) {
                    Object[] objArr2 = {str2, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b7f2c63c596e2874e5bf60b44c9be1b6", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b7f2c63c596e2874e5bf60b44c9be1b6");
                    } else if (i > 0) {
                        PlayVideoActivity.this.e();
                    } else {
                        PlayVideoActivity.l(PlayVideoActivity.this);
                    }
                }
            });
        }
    }

    @Override // com.sankuai.xm.video.BaseActivity
    public final void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "60fb78d9e9bbc39c4f6ce2f441da4cdc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "60fb78d9e9bbc39c4f6ce2f441da4cdc");
            return;
        }
        super.b(i);
        if (i != 201) {
            return;
        }
        this.g.setVisibility(8);
        this.h.setVisibility(8);
        a(TbsListener.ErrorCode.EXCEED_UNZIP_RETRY_NUM);
    }

    @Override // com.sankuai.xm.video.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d77cd8b7a9a29c4dd274c60fb4acd3bb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d77cd8b7a9a29c4dd274c60fb4acd3bb");
            return;
        }
        super.onResume();
        if (this.u) {
            this.u = false;
            if (!v.b(this, false)) {
                f();
                return;
            } else {
                d();
                return;
            }
        }
        this.m.requestAudioFocus(null, 3, 2);
        this.d.c();
    }

    @Override // com.sankuai.xm.video.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "589b6f657502832dbf3a0db961e77686", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "589b6f657502832dbf3a0db961e77686");
            return;
        }
        super.onPause();
        this.d.d();
        if (this.m != null) {
            this.m.abandonAudioFocus(null);
        }
    }

    @Override // com.sankuai.xm.video.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ec91038cd8a6eb2118551da5730fbac", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ec91038cd8a6eb2118551da5730fbac");
            return;
        }
        this.m = null;
        a(TbsListener.ErrorCode.EXCEED_UNZIP_RETRY_NUM);
        this.d.setPlayStateCallback(null);
        this.A = null;
        this.d.g();
        this.d = null;
        if (this.y != null && this.z.get()) {
            unregisterReceiver(this.y);
            this.y = null;
            this.z.set(false);
        }
        com.sankuai.xm.base.util.g.a((Dialog) this.x);
        this.x = null;
        if (CryptoProxy.c().a() && !CryptoProxy.c().d(this.o)) {
            k.e(this.o);
        }
        super.onDestroy();
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        Object[] objArr = {configuration};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4abbc3fd52c91d09caeb7d366669cd4e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4abbc3fd52c91d09caeb7d366669cd4e");
            return;
        }
        super.onConfigurationChanged(configuration);
        if (configuration.orientation == 2) {
            MTVideoPlayerView mTVideoPlayerView = this.d;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = MTVideoPlayerView.a;
            if (PatchProxy.isSupport(objArr2, mTVideoPlayerView, changeQuickRedirect2, false, "7b116aa263174010b4f356514a7d38cd", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, mTVideoPlayerView, changeQuickRedirect2, false, "7b116aa263174010b4f356514a7d38cd");
            } else {
                Activity a = mTVideoPlayerView.a(mTVideoPlayerView.getContext());
                if (a != null && !a.isFinishing()) {
                    if (mTVideoPlayerView.b.getParent() instanceof ViewGroup) {
                        ((ViewGroup) mTVideoPlayerView.b.getParent()).removeView(mTVideoPlayerView.b);
                    }
                    ActionBar actionBar = a.getActionBar();
                    if (actionBar != null) {
                        actionBar.hide();
                    }
                    a.setRequestedOrientation(0);
                    a.getWindow().addFlags(1024);
                    ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
                    mTVideoPlayerView.b.setBackgroundColor(-16777216);
                    mTVideoPlayerView.b.setOnClickListener(mTVideoPlayerView.f);
                    ((ViewGroup) a.getWindow().getDecorView()).addView(mTVideoPlayerView.b, layoutParams);
                }
            }
        } else {
            MTVideoPlayerView mTVideoPlayerView2 = this.d;
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = MTVideoPlayerView.a;
            if (PatchProxy.isSupport(objArr3, mTVideoPlayerView2, changeQuickRedirect3, false, "13ca3dd8f4466520471c4b52e41e68e0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, mTVideoPlayerView2, changeQuickRedirect3, false, "13ca3dd8f4466520471c4b52e41e68e0");
            } else {
                Activity a2 = mTVideoPlayerView2.a(mTVideoPlayerView2.getContext());
                if (a2 != null && !a2.isFinishing()) {
                    if (mTVideoPlayerView2.b.getParent() instanceof ViewGroup) {
                        ((ViewGroup) mTVideoPlayerView2.b.getParent()).removeView(mTVideoPlayerView2.b);
                    }
                    ActionBar actionBar2 = a2.getActionBar();
                    if (actionBar2 != null) {
                        actionBar2.show();
                    }
                    a2.getWindow().clearFlags(1024);
                    a2.setRequestedOrientation(7);
                    ViewGroup.LayoutParams layoutParams2 = new ViewGroup.LayoutParams(-1, -1);
                    mTVideoPlayerView2.b.setBackgroundColor(0);
                    mTVideoPlayerView2.b.setOnClickListener(null);
                    mTVideoPlayerView2.b.setClickable(false);
                    mTVideoPlayerView2.addView(mTVideoPlayerView2.b, layoutParams2);
                }
            }
        }
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = b;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "27a99444efaf3eec41a4387d79307844", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "27a99444efaf3eec41a4387d79307844");
        } else if (getResources().getConfiguration().orientation == 1) {
            RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) this.g.getLayoutParams();
            layoutParams3.addRule(3, R.id.videolib_videoview_play_video);
            layoutParams3.addRule(12, 0);
            layoutParams3.topMargin = getResources().getDimensionPixelOffset(R.dimen.videolib_play_text_touch_margin_top);
            this.g.setLayoutParams(layoutParams3);
            this.g.setTextColor(getResources().getColor(R.color.videolib_main_color));
            this.g.setBackgroundResource(R.color.videolib_transparent);
            RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) this.h.getLayoutParams();
            layoutParams4.addRule(12, -1);
            layoutParams4.addRule(14, -1);
            layoutParams4.addRule(11, 0);
            layoutParams4.bottomMargin = getResources().getDimensionPixelOffset(R.dimen.videolib_play_text_disclaimer_margin_bottom);
            this.h.setLayoutParams(layoutParams4);
        } else {
            RelativeLayout.LayoutParams layoutParams5 = (RelativeLayout.LayoutParams) this.g.getLayoutParams();
            layoutParams5.addRule(12, -1);
            layoutParams5.addRule(3, 0);
            layoutParams5.bottomMargin = getResources().getDimensionPixelOffset(R.dimen.videolib_play_text_touch_margin_bottom);
            this.g.setLayoutParams(layoutParams5);
            this.g.setBackgroundResource(R.drawable.videolib_play_video_touch_bg);
            this.g.setTextColor(getResources().getColor(R.color.videolib_text_color_white));
            RelativeLayout.LayoutParams layoutParams6 = (RelativeLayout.LayoutParams) this.h.getLayoutParams();
            layoutParams6.addRule(12, -1);
            layoutParams6.addRule(11, -1);
            layoutParams6.addRule(14, 0);
            layoutParams6.bottomMargin = getResources().getDimensionPixelOffset(R.dimen.videolib_play_text_disclaimer_margin_bottom);
            layoutParams6.rightMargin = getResources().getDimensionPixelOffset(R.dimen.videolib_play_text_disclaimer_margin_right);
            this.h.setLayoutParams(layoutParams6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d57329e180d1ffb1ac4a650dd02d5ef", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d57329e180d1ffb1ac4a650dd02d5ef");
            return;
        }
        if (!TextUtils.isEmpty(this.r)) {
            com.sankuai.xm.integration.imageloader.b.a(com.sankuai.xm.integration.imageloader.utils.a.b(this.r)).a(0).a(this.e);
        }
        c(1);
        if (this.d != null) {
            VideoPlayerParam videoPlayerParam = new VideoPlayerParam(this.p);
            if (!TextUtils.isEmpty(this.o)) {
                videoPlayerParam.a(this, this.o);
            }
            this.d.setDataSource(videoPlayerParam);
            this.d.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3fb3d2696595f04f9d3f51bcec2021fb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3fb3d2696595f04f9d3f51bcec2021fb");
        } else {
            f.a();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0fbf1e30e18a4f83344580251b23ba2d", 6917529027641081858L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0fbf1e30e18a4f83344580251b23ba2d");
            return;
        }
        int id = view.getId();
        if (id == R.id.videolib_tv_play_choose) {
            try {
                startActivity(new Intent(this, Class.forName(this.t)).putExtras(this.s));
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        } else if (id == R.id.videolib_tv_play_return || id == R.id.videolib_rl_play_video || id == R.id.videolib_videoview_play_video) {
            if (!this.d.e()) {
                f.a();
            }
            finish();
        }
    }

    public final void c(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "97dcc55bbe4f0b9382f28ac2660e5ef8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "97dcc55bbe4f0b9382f28ac2660e5ef8");
            return;
        }
        this.n = i;
        switch (this.n) {
            case 0:
                this.l.setVisibility(8);
                this.e.setVisibility(8);
                this.f.setVisibility(8);
                this.d.setVisibility(4);
                return;
            case 1:
                this.l.setVisibility(0);
                this.e.setVisibility(0);
                this.f.setVisibility(0);
                this.d.setVisibility(4);
                return;
            case 2:
                this.l.setVisibility(8);
                this.e.setVisibility(8);
                this.f.setVisibility(8);
                this.d.setVisibility(0);
                return;
            case 3:
                this.l.setVisibility(0);
                this.e.setVisibility(8);
                this.f.setVisibility(8);
                this.d.setVisibility(0);
                return;
            default:
                return;
        }
    }
}

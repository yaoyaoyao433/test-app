package com.sankuai.titans.widget.media.widget;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.media.MediaPlayer;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.constraint.R;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.VideoView;
import com.dianping.shield.entity.ExposeAction;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class TitansSystemVideoView extends FrameLayout {
    public static final boolean DEBUG = true;
    public static final String TAG = "TitansSystemVideoView";
    public static ChangeQuickRedirect changeQuickRedirect;
    public VideoViewHandler handler;
    public MediaPlayer mediaPlayer;
    public View videoClose;
    public ProgressView videoDuration;
    public Animation videoLoadingAnimation;
    public View videoPP;
    public VideoParam videoParam;
    public View videoSound;
    public VideoView videoView;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class VideoParam {
        public static ChangeQuickRedirect changeQuickRedirect;
        public boolean autoPlay;
        public boolean autoSound;
        public String path;
        public int volume;
        public boolean looping = true;
        public volatile boolean targetPlay = false;
        public boolean prepared = false;
        public boolean hasError = false;
    }

    public TitansSystemVideoView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f686a1d83fa1af75cd8c9df068e9ffa5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f686a1d83fa1af75cd8c9df068e9ffa5");
            return;
        }
        this.videoLoadingAnimation = null;
        this.handler = new VideoViewHandler(Looper.getMainLooper());
        initVideoView(context);
        initFloatView(context);
    }

    private void initFloatView(final Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e049a9ff90130c54cded7c30a45b71c1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e049a9ff90130c54cded7c30a45b71c1");
            return;
        }
        FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.titans_preview_video_float, (ViewGroup) null);
        addView(frameLayout);
        this.videoClose = frameLayout.findViewById(R.id.titans_preview_video_close);
        this.videoClose.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.titans.widget.media.widget.TitansSystemVideoView.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "0822ab60a0623fa00f2662fbee7790cf", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "0822ab60a0623fa00f2662fbee7790cf");
                    return;
                }
                TitansSystemVideoView.this.videoView.stopPlayback();
                if (!(context instanceof Activity) || ((Activity) context).isFinishing()) {
                    return;
                }
                ((Activity) context).onBackPressed();
            }
        });
        this.videoPP = frameLayout.findViewById(R.id.titans_preview_video_float_p_p);
        this.videoPP.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.titans.widget.media.widget.TitansSystemVideoView.2
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "07235199f160c4d98bd09642c440743f", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "07235199f160c4d98bd09642c440743f");
                } else if (!TitansSystemVideoView.this.videoParam.hasError || !TitansSystemVideoView.this.videoPP.isActivated()) {
                    TitansSystemVideoView.this.changeVideoPlay(false);
                } else if (TitansSystemVideoView.this.videoLoadingAnimation == null || TitansSystemVideoView.this.videoLoadingAnimation.hasEnded()) {
                    TitansSystemVideoView.this.videoParam.hasError = false;
                    TitansSystemVideoView.this.setVideoParam(TitansSystemVideoView.this.videoParam);
                    TitansSystemVideoView.this.startLoadingDelay(10);
                }
            }
        });
        this.videoSound = frameLayout.findViewById(R.id.titans_preview_video_float_sound);
        this.videoSound.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.titans.widget.media.widget.TitansSystemVideoView.3
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "7b038c4e8d9d3ef4d58499053643b06a", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "7b038c4e8d9d3ef4d58499053643b06a");
                } else {
                    TitansSystemVideoView.this.changeVideoSound(false);
                }
            }
        });
        this.videoDuration = new ProgressView(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, (int) ((context.getResources().getDisplayMetrics().density * 3.0f) + 0.5f), 80);
        this.videoDuration.setBackgroundColor(1157627903);
        this.videoDuration.setProgressColor(context.getResources().getColor(R.color.__picker_item_photo_border_selected));
        frameLayout.addView(this.videoDuration, layoutParams);
    }

    public void onShow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "39f8253150281ebb8d86f8e8e62eb27b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "39f8253150281ebb8d86f8e8e62eb27b");
            return;
        }
        if (this.videoParam.autoPlay) {
            play();
        }
        startLoadingDelay(1000);
    }

    public void onHide() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f536cef797db87332779aecac752490b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f536cef797db87332779aecac752490b");
        } else {
            pause();
        }
    }

    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "177c215fab603f5d26df152cfba5c4cf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "177c215fab603f5d26df152cfba5c4cf");
        } else {
            destroy();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimeoutHideFloatView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2c5b4addef6bd6c7eaaf487c92dc3de7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2c5b4addef6bd6c7eaaf487c92dc3de7");
            return;
        }
        this.handler.removeMessages(1);
        this.handler.sendEmptyMessageDelayed(1, ExposeAction.DEFAULT_DELAY_FOR_AUTO_EXPOSE);
    }

    public void play() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "02ede1cca1d5504530243f4637ee2c65", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "02ede1cca1d5504530243f4637ee2c65");
            return;
        }
        this.videoParam.targetPlay = true;
        if (!this.videoParam.prepared || this.mediaPlayer == null || this.mediaPlayer.isPlaying()) {
            return;
        }
        changeVideoPlay(false);
    }

    public void pause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cb5d703b302706706ba21108a0338957", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cb5d703b302706706ba21108a0338957");
            return;
        }
        this.videoParam.targetPlay = false;
        if (this.videoParam.prepared && this.mediaPlayer != null && this.mediaPlayer.isPlaying()) {
            changeVideoPlay(false);
        }
    }

    public void startLoadingDelay(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1082ac63411f736d4c1f47a8692f8d88", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1082ac63411f736d4c1f47a8692f8d88");
            return;
        }
        Log.e("VideoView", "startLoadingDelay mediaplayer=" + this.mediaPlayer + ";this=" + this);
        this.handler.sendEmptyMessageDelayed(3, (long) i);
    }

    public void stopLoading() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "adef9fd2bbca4632c995ce0516d4a029", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "adef9fd2bbca4632c995ce0516d4a029");
            return;
        }
        Log.e("VideoView", "stopLoading mediaplayer=" + this.mediaPlayer + ";this=" + this);
        this.handler.sendEmptyMessage(4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void changeVideoSound(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "eaae2da47d22ff7a8397ffb87d88d963", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "eaae2da47d22ff7a8397ffb87d88d963");
        } else if (this.mediaPlayer != null) {
            try {
                if (this.videoParam.volume == 1 && !z) {
                    this.videoParam.volume = 0;
                    this.mediaPlayer.setVolume(this.videoParam.volume, this.videoParam.volume);
                    this.videoSound.setSelected(false);
                    return;
                }
                this.videoParam.volume = 1;
                this.mediaPlayer.setVolume(this.videoParam.volume, this.videoParam.volume);
                this.videoSound.setSelected(true);
            } catch (Exception e) {
                String str = TAG;
                Log.e(str, "changeVideoSound " + e.getClass().getName());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void changeVideoPlay(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6b13132dee9921c3024fee2b994287e1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6b13132dee9921c3024fee2b994287e1");
        } else if (!this.videoParam.prepared || this.mediaPlayer == null) {
        } else {
            try {
                if (this.mediaPlayer.isPlaying() && !z) {
                    this.mediaPlayer.pause();
                    this.videoPP.setSelected(false);
                    this.handler.removeMessages(1);
                    this.handler.removeMessages(2);
                    this.videoPP.setVisibility(0);
                    return;
                }
                this.mediaPlayer.start();
                this.handler.sendEmptyMessageDelayed(2, 16L);
                this.handler.sendEmptyMessageDelayed(1, ExposeAction.DEFAULT_DELAY_FOR_AUTO_EXPOSE);
                this.videoPP.setSelected(true);
            } catch (Exception e) {
                String str = TAG;
                Log.e(str, "changeVideoPlay " + e.getClass().getName());
            }
        }
    }

    private void initVideoView(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a265c997a21b82b849b1d4a4c6989c89", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a265c997a21b82b849b1d4a4c6989c89");
            return;
        }
        this.videoView = new VideoView(context.getApplicationContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        addView(this.videoView, layoutParams);
        setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.titans.widget.media.widget.TitansSystemVideoView.4
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "d723c518bb3b58e6343f92dd74fee03c", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "d723c518bb3b58e6343f92dd74fee03c");
                    return;
                }
                TitansSystemVideoView.this.videoPP.setVisibility(TitansSystemVideoView.this.videoPP.getVisibility() == 8 ? 0 : 8);
                if (TitansSystemVideoView.this.videoPP.isActivated()) {
                    return;
                }
                TitansSystemVideoView.this.setTimeoutHideFloatView();
            }
        });
        resetVideo();
    }

    private void resetVideo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b6752354b85e62da3481f83e84e81d0a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b6752354b85e62da3481f83e84e81d0a");
            return;
        }
        VideoViewListener videoViewListener = new VideoViewListener();
        this.videoView.setOnPreparedListener(videoViewListener);
        this.videoView.setOnErrorListener(videoViewListener);
        this.videoView.setOnCompletionListener(videoViewListener);
    }

    public void setVideoParam(VideoParam videoParam) {
        Object[] objArr = {videoParam};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aba3a5b620507077e9f895c88122913a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aba3a5b620507077e9f895c88122913a");
            return;
        }
        this.videoParam = videoParam;
        this.videoView.setVideoPath(videoParam.path);
    }

    public void destroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "669f016ec9d285d3d68090cff636ed9d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "669f016ec9d285d3d68090cff636ed9d");
            return;
        }
        if (this.videoView != null) {
            try {
                this.videoView.stopPlayback();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        this.handler.removeMessages(2);
        this.handler.removeMessages(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public class VideoViewListener implements MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnPreparedListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
        }

        public VideoViewListener() {
            Object[] objArr = {TitansSystemVideoView.this};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4fd1e3d1e94a291dcf247cfac5ace1a8", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4fd1e3d1e94a291dcf247cfac5ace1a8");
            }
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
            Object[] objArr = {mediaPlayer};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ee2b77a34cbb5cc1dad87bc74de5b085", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ee2b77a34cbb5cc1dad87bc74de5b085");
                return;
            }
            String str = TitansSystemVideoView.TAG;
            Log.e(str, "onPrepared mp=" + mediaPlayer + ";this=" + TitansSystemVideoView.this);
            TitansSystemVideoView.this.mediaPlayer = mediaPlayer;
            TitansSystemVideoView.this.videoParam.hasError = false;
            TitansSystemVideoView.this.stopLoading();
            TitansSystemVideoView.this.mediaPlayer.setLooping(TitansSystemVideoView.this.videoParam.looping);
            TitansSystemVideoView.this.videoParam.volume = !TitansSystemVideoView.this.videoParam.autoSound ? 1 : 0;
            TitansSystemVideoView.this.videoParam.prepared = true;
            TitansSystemVideoView.this.changeVideoSound(TitansSystemVideoView.this.videoParam.autoSound);
            if (TitansSystemVideoView.this.videoParam.targetPlay) {
                TitansSystemVideoView.this.changeVideoPlay(false);
            } else {
                TitansSystemVideoView.this.videoPP.setVisibility(0);
            }
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            Object[] objArr = {mediaPlayer, Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c617b0530280d9f20cf87461b2b66d2c", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c617b0530280d9f20cf87461b2b66d2c")).booleanValue();
            }
            TitansSystemVideoView.this.videoParam.hasError = true;
            Log.e("VideoView", "onError mp=" + mediaPlayer + ";this=" + TitansSystemVideoView.this);
            TitansSystemVideoView.this.stopLoading();
            return true;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public class VideoViewHandler extends Handler {
        public static final int AUTO_HIDE_TIME = 2000;
        public static final int AUTO_UPDATE_DURATION = 16;
        public static final int HIDE_VIDEO_PP = 1;
        public static final int PREPARE_VIDEO_LOADING = 3;
        public static final int STOP_PREPARE_VIDEO_LOADING = 4;
        public static final int UPDATE_DURATION = 2;
        public static ChangeQuickRedirect changeQuickRedirect;

        public VideoViewHandler(Looper looper) {
            super(looper);
            Object[] objArr = {TitansSystemVideoView.this, looper};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6e85b7c26e81195a85af7d26943908c6", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6e85b7c26e81195a85af7d26943908c6");
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Object[] objArr = {message};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "52b38955489e352b59c7c1b4e9b2e64a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "52b38955489e352b59c7c1b4e9b2e64a");
                return;
            }
            switch (message.what) {
                case 1:
                    TitansSystemVideoView.this.videoPP.setVisibility(8);
                    return;
                case 2:
                    if (TitansSystemVideoView.this.mediaPlayer != null) {
                        try {
                            TitansSystemVideoView.this.videoDuration.setProgress((TitansSystemVideoView.this.mediaPlayer.getCurrentPosition() * 100) / TitansSystemVideoView.this.mediaPlayer.getDuration());
                            TitansSystemVideoView.this.videoDuration.invalidate();
                        } catch (Exception e) {
                            String str = TitansSystemVideoView.TAG;
                            Log.e(str, "case UPDATE_DURATION " + e.getClass().getName());
                        }
                    }
                    sendEmptyMessageDelayed(2, 16L);
                    return;
                case 3:
                    if (TitansSystemVideoView.this.videoParam.prepared || TitansSystemVideoView.this.videoParam.hasError) {
                        return;
                    }
                    TitansSystemVideoView.this.videoPP.setActivated(true);
                    TitansSystemVideoView.this.videoPP.setVisibility(0);
                    TitansSystemVideoView.this.videoLoadingAnimation = AnimationUtils.loadAnimation(TitansSystemVideoView.this.getContext(), R.anim.titans_preview_video_loading);
                    TitansSystemVideoView.this.videoPP.startAnimation(TitansSystemVideoView.this.videoLoadingAnimation);
                    return;
                case 4:
                    removeMessages(3);
                    if (TitansSystemVideoView.this.videoLoadingAnimation != null) {
                        TitansSystemVideoView.this.videoPP.setActivated(TitansSystemVideoView.this.mediaPlayer == null);
                        TitansSystemVideoView.this.videoPP.clearAnimation();
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public class ProgressView extends View {
        public static ChangeQuickRedirect changeQuickRedirect;
        public Paint paint;
        public int progress;
        public int progressColor;

        public ProgressView(Context context) {
            super(context);
            Object[] objArr = {TitansSystemVideoView.this, context};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5fe253b174092251b4dd28f32dde004d", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5fe253b174092251b4dd28f32dde004d");
            } else {
                this.paint = new Paint();
            }
        }

        public void setProgressColor(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7c74662c3cc824b4c4288dc0e20a6a16", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7c74662c3cc824b4c4288dc0e20a6a16");
                return;
            }
            this.progressColor = i;
            this.paint.setColor(this.progressColor);
        }

        public void setProgress(int i) {
            this.progress = i;
        }

        @Override // android.view.View
        public void onDraw(Canvas canvas) {
            Object[] objArr = {canvas};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dbb1280d8cb867fabb2df36fb0b5b672", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dbb1280d8cb867fabb2df36fb0b5b672");
                return;
            }
            super.onDraw(canvas);
            canvas.drawRect(0.0f, 0.0f, (this.progress * getMeasuredWidth()) / 100, getHeight(), this.paint);
        }
    }
}

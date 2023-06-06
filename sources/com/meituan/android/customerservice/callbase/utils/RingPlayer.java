package com.meituan.android.customerservice.callbase.utils;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class RingPlayer implements MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener {
    public static ChangeQuickRedirect changeQuickRedirect;
    private AudioManager mAudioManager;
    private final Class<?> mClass;
    private Context mContext;
    private boolean mEnd;
    private boolean mLooping;
    private OnCompletionListener mOnCompletionListener;
    private int mPlayedTime;
    private MediaPlayer mPlayer;
    private Ring mRing;
    private boolean mSpeakerOn;
    private int mStreamType;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface OnCompletionListener {
        void onCompletion(RingPlayer ringPlayer);
    }

    public RingPlayer(Context context, Builder builder) {
        Object[] objArr = {context, builder};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1f6c9d39dacb1a728d99efc2dd0c1e7a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1f6c9d39dacb1a728d99efc2dd0c1e7a");
            return;
        }
        this.mClass = RingPlayer.class;
        this.mEnd = false;
        this.mStreamType = 2;
        this.mContext = context;
        this.mSpeakerOn = builder.speakerOn;
        this.mRing = builder.ring;
        this.mOnCompletionListener = builder.onCompletionListener;
        this.mAudioManager = (AudioManager) this.mContext.getSystemService("audio");
        this.mStreamType = builder.streamType;
        this.mLooping = builder.loop;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00ba A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean createPlayer() {
        /*
            r12 = this;
            r0 = 0
            java.lang.Object[] r8 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r9 = com.meituan.android.customerservice.callbase.utils.RingPlayer.changeQuickRedirect
            java.lang.String r10 = "520a808b2a82bf2949bd47621905f91f"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r2 = r12
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1f
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r8, r12, r9, r0, r10)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L1f:
            r1 = 0
            android.content.Context r2 = r12.mContext     // Catch: java.lang.Throwable -> L90 java.lang.Exception -> L93
            android.content.res.Resources r2 = r2.getResources()     // Catch: java.lang.Throwable -> L90 java.lang.Exception -> L93
            com.meituan.android.customerservice.callbase.utils.Ring r3 = r12.mRing     // Catch: java.lang.Throwable -> L90 java.lang.Exception -> L93
            int r3 = r3.resid     // Catch: java.lang.Throwable -> L90 java.lang.Exception -> L93
            android.content.res.AssetFileDescriptor r2 = r2.openRawResourceFd(r3)     // Catch: java.lang.Throwable -> L90 java.lang.Exception -> L93
            if (r2 != 0) goto L36
            if (r2 == 0) goto L35
            r2.close()     // Catch: java.io.IOException -> L35
        L35:
            return r0
        L36:
            android.media.MediaPlayer r1 = new android.media.MediaPlayer     // Catch: java.lang.Exception -> L8e java.lang.Throwable -> Lb7
            r1.<init>()     // Catch: java.lang.Exception -> L8e java.lang.Throwable -> Lb7
            r12.mPlayer = r1     // Catch: java.lang.Exception -> L8e java.lang.Throwable -> Lb7
            android.media.MediaPlayer r3 = r12.mPlayer     // Catch: java.lang.Exception -> L8e java.lang.Throwable -> Lb7
            java.io.FileDescriptor r4 = r2.getFileDescriptor()     // Catch: java.lang.Exception -> L8e java.lang.Throwable -> Lb7
            long r5 = r2.getStartOffset()     // Catch: java.lang.Exception -> L8e java.lang.Throwable -> Lb7
            long r7 = r2.getLength()     // Catch: java.lang.Exception -> L8e java.lang.Throwable -> Lb7
            r3.setDataSource(r4, r5, r7)     // Catch: java.lang.Exception -> L8e java.lang.Throwable -> Lb7
            android.media.MediaPlayer r1 = r12.mPlayer     // Catch: java.lang.Exception -> L8e java.lang.Throwable -> Lb7
            int r3 = r12.mStreamType     // Catch: java.lang.Exception -> L8e java.lang.Throwable -> Lb7
            r1.setAudioStreamType(r3)     // Catch: java.lang.Exception -> L8e java.lang.Throwable -> Lb7
            android.media.MediaPlayer r1 = r12.mPlayer     // Catch: java.lang.Exception -> L8e java.lang.Throwable -> Lb7
            boolean r3 = r12.mLooping     // Catch: java.lang.Exception -> L8e java.lang.Throwable -> Lb7
            r1.setLooping(r3)     // Catch: java.lang.Exception -> L8e java.lang.Throwable -> Lb7
            java.lang.Class r1 = r12.getClass()     // Catch: java.lang.Exception -> L8e java.lang.Throwable -> Lb7
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L8e java.lang.Throwable -> Lb7
            java.lang.String r4 = "createPlayer "
            r3.<init>(r4)     // Catch: java.lang.Exception -> L8e java.lang.Throwable -> Lb7
            int r4 = r12.mStreamType     // Catch: java.lang.Exception -> L8e java.lang.Throwable -> Lb7
            r3.append(r4)     // Catch: java.lang.Exception -> L8e java.lang.Throwable -> Lb7
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Exception -> L8e java.lang.Throwable -> Lb7
            com.meituan.android.customerservice.callbase.utils.CallLog.debug(r1, r3)     // Catch: java.lang.Exception -> L8e java.lang.Throwable -> Lb7
            android.media.MediaPlayer r1 = r12.mPlayer     // Catch: java.lang.Exception -> L8e java.lang.Throwable -> Lb7
            r1.setOnCompletionListener(r12)     // Catch: java.lang.Exception -> L8e java.lang.Throwable -> Lb7
            android.media.MediaPlayer r1 = r12.mPlayer     // Catch: java.lang.Exception -> L8e java.lang.Throwable -> Lb7
            r1.setOnErrorListener(r12)     // Catch: java.lang.Exception -> L8e java.lang.Throwable -> Lb7
            android.media.MediaPlayer r1 = r12.mPlayer     // Catch: java.lang.Exception -> L8e java.lang.Throwable -> Lb7
            r1.prepare()     // Catch: java.lang.Exception -> L8e java.lang.Throwable -> Lb7
            android.media.MediaPlayer r1 = r12.mPlayer     // Catch: java.lang.Exception -> L8e java.lang.Throwable -> Lb7
            r1.start()     // Catch: java.lang.Exception -> L8e java.lang.Throwable -> Lb7
            if (r2 == 0) goto L8c
            r2.close()     // Catch: java.io.IOException -> L8c
        L8c:
            r0 = 1
            return r0
        L8e:
            r1 = move-exception
            goto L97
        L90:
            r0 = move-exception
            r2 = r1
            goto Lb8
        L93:
            r2 = move-exception
            r11 = r2
            r2 = r1
            r1 = r11
        L97:
            java.lang.Class<?> r3 = r12.mClass     // Catch: java.lang.Throwable -> Lb7
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r5 = "createPlayer error:"
            r4.<init>(r5)     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r1 = r1.getMessage()     // Catch: java.lang.Throwable -> Lb7
            r4.append(r1)     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r1 = r4.toString()     // Catch: java.lang.Throwable -> Lb7
            com.meituan.android.customerservice.callbase.utils.CallLog.error(r3, r1)     // Catch: java.lang.Throwable -> Lb7
            r12.stopPlay()     // Catch: java.lang.Throwable -> Lb7
            if (r2 == 0) goto Lb6
            r2.close()     // Catch: java.io.IOException -> Lb6
        Lb6:
            return r0
        Lb7:
            r0 = move-exception
        Lb8:
            if (r2 == 0) goto Lbd
            r2.close()     // Catch: java.io.IOException -> Lbd
        Lbd:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.customerservice.callbase.utils.RingPlayer.createPlayer():boolean");
    }

    public boolean startPlay() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cc5ab12870fa48b1117553facdd77f1f", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cc5ab12870fa48b1117553facdd77f1f")).booleanValue() : startPlay(false);
    }

    private synchronized boolean startPlay(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a1decdb2c5b4f3581463c1deffb8a169", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a1decdb2c5b4f3581463c1deffb8a169")).booleanValue();
        } else if (this.mEnd) {
            return false;
        } else {
            if (createPlayer()) {
                if (z && this.mPlayedTime > 0) {
                    try {
                        this.mPlayer.seekTo(this.mPlayedTime);
                    } catch (Exception e) {
                        Class<?> cls = this.mClass;
                        CallLog.error(cls, "startPlay:" + e.getMessage());
                    }
                }
                return true;
            }
            return false;
        }
    }

    public boolean stopPlay() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ec1d619c725ecc8cc68d88d383716445", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ec1d619c725ecc8cc68d88d383716445")).booleanValue() : stopPlay(false);
    }

    private synchronized boolean stopPlay(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "279302b3b5363a7268340a01b86285b9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "279302b3b5363a7268340a01b86285b9")).booleanValue();
        }
        if (this.mPlayer != null && !this.mEnd) {
            if (!z) {
                this.mEnd = true;
            }
            release();
            return true;
        }
        return false;
    }

    public synchronized boolean setSpeakerOn(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9ed9c0d3f717ec55357dd5fb19f9f4cb", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9ed9c0d3f717ec55357dd5fb19f9f4cb")).booleanValue();
        }
        if (this.mSpeakerOn != z && !this.mEnd) {
            this.mSpeakerOn = z;
            return true;
        }
        return false;
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        Object[] objArr = {mediaPlayer, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e0762a4c6c654a786bb9b53a95cf5a65", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e0762a4c6c654a786bb9b53a95cf5a65")).booleanValue();
        }
        Class<?> cls = this.mClass;
        CallLog.error(cls, "onError:" + i);
        stopPlay();
        return true;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(MediaPlayer mediaPlayer) {
        Object[] objArr = {mediaPlayer};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b8845b23a6ce6971712bee5cf55ddf4f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b8845b23a6ce6971712bee5cf55ddf4f");
            return;
        }
        synchronized (this) {
            stopPlay();
            if (this.mRing.next != null) {
                this.mRing = this.mRing.next;
                this.mEnd = false;
                startPlay(false);
            } else if (this.mOnCompletionListener != null) {
                this.mOnCompletionListener.onCompletion(this);
            }
        }
    }

    private synchronized void release() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "963e802f7bbbb0a7b28d86905fdff8f0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "963e802f7bbbb0a7b28d86905fdff8f0");
            return;
        }
        if (this.mPlayer != null) {
            try {
                this.mPlayer.reset();
                this.mPlayer.release();
            } catch (Exception unused) {
            }
            this.mPlayer = null;
        }
    }

    private void _setSpeakerOn(boolean z) {
        if (!z) {
            this.mAudioManager.setMode(3);
        } else {
            this.mAudioManager.setMode(0);
        }
        this.mAudioManager.setSpeakerphoneOn(z);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class Builder {
        public static ChangeQuickRedirect changeQuickRedirect;
        private boolean loop;
        private OnCompletionListener onCompletionListener;
        private Ring ring;
        private boolean speakerOn;
        private int streamType;

        public Builder() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ae24fec80369c50849e23320d68b06a5", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ae24fec80369c50849e23320d68b06a5");
                return;
            }
            this.speakerOn = true;
            this.streamType = 2;
        }

        public Builder setSpeakerOn(boolean z) {
            this.speakerOn = z;
            return this;
        }

        public Builder setLooping(boolean z) {
            this.loop = z;
            return this;
        }

        public Builder setAudioResid(Ring ring) {
            this.ring = ring;
            return this;
        }

        public Builder setAudioStreamType(int i) {
            this.streamType = i;
            return this;
        }

        public Builder setOnCompletionListener(OnCompletionListener onCompletionListener) {
            this.onCompletionListener = onCompletionListener;
            return this;
        }

        public RingPlayer create(Context context) {
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "19ef7167495e17a3087d63dea685b5dc", RobustBitConfig.DEFAULT_VALUE) ? (RingPlayer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "19ef7167495e17a3087d63dea685b5dc") : new RingPlayer(context, this);
        }
    }
}

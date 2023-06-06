package com.tencent.liteav.audio;

import android.text.TextUtils;
import com.meituan.robust.common.CommonConstant;
import com.tencent.liteav.audio.TXAudioEffectManager;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.util.TXCCommonUtil;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class TXCSoundEffectPlayer implements TXAudioEffectManager.TXMusicPlayObserver {
    private static final String TAG = "AudioCenter:TXCSoundEffectPlayer";
    private static WeakReference<c> mWeakSoundEffectListener;
    private List<Integer> mShortEffectorIDList = new ArrayList();

    @Override // com.tencent.liteav.audio.TXAudioEffectManager.TXMusicPlayObserver
    public void onPlayProgress(int i, long j, long j2) {
    }

    static {
        com.tencent.liteav.basic.util.g.f();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class a {
        private static final TXCSoundEffectPlayer a = new TXCSoundEffectPlayer();
    }

    public static TXCSoundEffectPlayer getInstance() {
        return a.a;
    }

    public boolean playEffectWithId(int i, String str, boolean z, int i2) {
        TXCLog.i(TAG, "playEffectWithId -> effect id = " + i + ", path = " + str + ", loop = " + i2);
        TXAudioEffectManager.AudioMusicParam audioMusicParam = new TXAudioEffectManager.AudioMusicParam(i, checkIfAssetsFile(str));
        audioMusicParam.publish = z;
        audioMusicParam.loopCount = i2;
        audioMusicParam.isShortFile = true;
        boolean startPlayMusic = TXAudioEffectManagerImpl.getCacheInstance().startPlayMusic(audioMusicParam);
        TXAudioEffectManagerImpl.getCacheInstance().setMusicObserver(i, this);
        this.mShortEffectorIDList.add(Integer.valueOf(i));
        TXCLog.i(TAG, "playEffectWithId ->effect id = " + i + ", startPlayMusic result = " + startPlayMusic);
        return startPlayMusic;
    }

    public void stopEffectWithId(int i) {
        TXCLog.i(TAG, "stopEffectWithId -> effect id = " + i);
        TXAudioEffectManagerImpl.getCacheInstance().setMusicObserver(i, null);
        TXAudioEffectManagerImpl.getCacheInstance().stopPlayMusic(i);
        int indexOf = this.mShortEffectorIDList.indexOf(Integer.valueOf(i));
        if (indexOf >= 0) {
            this.mShortEffectorIDList.remove(indexOf);
        }
    }

    public void stopAllEffect() {
        TXCLog.i(TAG, "stopAllEffect -> start");
        for (Integer num : this.mShortEffectorIDList) {
            TXAudioEffectManagerImpl.getCacheInstance().stopPlayMusic(num.intValue());
        }
        this.mShortEffectorIDList.clear();
        TXCLog.i(TAG, "stopAllEffect -> finish");
    }

    public void setEffectsVolume(float f) {
        TXCLog.i(TAG, "setEffectsVolume -> volume = " + f);
        for (Integer num : this.mShortEffectorIDList) {
            TXAudioEffectManagerImpl.getCacheInstance().setMusicVolume(num.intValue(), (int) (100.0f * f));
        }
    }

    public void setVolumeOfEffect(int i, float f) {
        TXCLog.i(TAG, "setVolumeOfEffect -> effect id = " + i + ", volume = " + f);
        TXAudioEffectManagerImpl.getCacheInstance().setMusicVolume(i, (int) (f * 100.0f));
    }

    public void pauseEffectWithId(int i) {
        TXCLog.i(TAG, "pauseEffectWithId -> effect id = " + i);
        TXAudioEffectManagerImpl.getCacheInstance().pausePlayMusic(i);
    }

    public void resumeEffectWithId(int i) {
        TXCLog.i(TAG, "resumeEffectWithId -> effect id = " + i);
        TXAudioEffectManagerImpl.getCacheInstance().resumePlayMusic(i);
    }

    public void setSoundEffectListener(c cVar) {
        if (cVar == null) {
            mWeakSoundEffectListener = null;
        } else {
            mWeakSoundEffectListener = new WeakReference<>(cVar);
        }
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager.TXMusicPlayObserver
    public void onStart(int i, int i2) {
        TXCLog.i(TAG, "onStart -> effect id = " + i + ", errCode = " + i2);
        if (mWeakSoundEffectListener == null || mWeakSoundEffectListener.get() == null) {
            return;
        }
        mWeakSoundEffectListener.get().onEffectPlayStart(i, i2);
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager.TXMusicPlayObserver
    public void onComplete(int i, int i2) {
        TXCLog.i(TAG, "onMusicPlayFinish -> effect id = " + i);
        if (mWeakSoundEffectListener == null || mWeakSoundEffectListener.get() == null) {
            return;
        }
        mWeakSoundEffectListener.get().onEffectPlayFinish(i);
    }

    public void clearCache() {
        if (TXCCommonUtil.getAppContext() == null) {
            return;
        }
        try {
            File file = new File(getEffectCachePath());
            if (file.exists() && file.isDirectory() && com.tencent.liteav.basic.util.d.a(file) > 52428800) {
                for (File file2 : file.listFiles()) {
                    file2.delete();
                }
            }
        } catch (Exception e) {
            TXCLog.w(TAG, "clearCache error " + e.toString());
        }
    }

    private String getEffectCachePath() {
        if (TXCCommonUtil.getAppContext() == null) {
            return "";
        }
        return TXCCommonUtil.getAppContext().getCacheDir() + File.separator + "liteav_effect";
    }

    private String checkIfAssetsFile(String str) {
        long j;
        int lastIndexOf;
        String str2;
        if (TextUtils.isEmpty(str) || TXCCommonUtil.getAppContext() == null || !str.startsWith("/assets/")) {
            return str;
        }
        String substring = str.substring(8);
        try {
            try {
                j = TXCCommonUtil.getAppContext().getAssets().openFd(substring).getLength();
            } catch (Exception e) {
                TXCLog.e(TAG, "playAudioEffect openFd error " + e.toString());
                j = 0;
            }
            String effectCachePath = getEffectCachePath();
            File file = new File(effectCachePath);
            if (!file.exists()) {
                file.mkdirs();
            } else if (file.isFile()) {
                file.delete();
                file.mkdirs();
            }
            if (substring.lastIndexOf(File.separatorChar) != -1) {
                str2 = effectCachePath + File.separator + j + CommonConstant.Symbol.UNDERLINE + substring.substring(lastIndexOf + 1);
            } else {
                str2 = effectCachePath + File.separator + j + CommonConstant.Symbol.UNDERLINE + substring;
            }
            str = str2;
            if (!com.tencent.liteav.basic.util.d.a(str)) {
                com.tencent.liteav.basic.util.d.a(TXCCommonUtil.getAppContext(), substring, str);
            }
        } catch (Exception e2) {
            TXCLog.e(TAG, "playAudioEffect error " + e2.toString());
        }
        return str;
    }
}

package com.speech.vadsdk.vad;

import android.content.Context;
import android.support.annotation.Keep;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes6.dex */
public class VadManager {
    private static volatile VadManager instance;
    private VadAudioHelper mAudioHelper;

    private VadManager() {
    }

    public static VadManager getInstance() {
        if (instance == null) {
            synchronized (VadManager.class) {
                if (instance == null) {
                    instance = new VadManager();
                }
            }
        }
        return instance;
    }

    public void init(Context context, String str) {
        this.mAudioHelper = new VadAudioHelper();
        this.mAudioHelper.initVADInstance(context, str);
    }

    public int[] processVadAudioData(short[] sArr) {
        if (this.mAudioHelper == null || sArr == null) {
            return null;
        }
        return this.mAudioHelper.processVadAudioData(sArr);
    }

    public void stopProcessVadAudioData() {
        if (this.mAudioHelper != null) {
            this.mAudioHelper.stopProcessVadAudioData();
        }
    }
}

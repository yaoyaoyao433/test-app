package io.agora.rtc;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public interface IAudioEffectManager {
    double getEffectsVolume();

    int pauseAllEffects();

    int pauseEffect(int i);

    @Deprecated
    int playEffect(int i, String str, int i2, double d, double d2, double d3);

    int playEffect(int i, String str, int i2, double d, double d2, double d3, boolean z);

    int preloadEffect(int i, String str);

    int resumeAllEffects();

    int resumeEffect(int i);

    int setEffectsVolume(double d);

    int setVolumeOfEffect(int i, double d);

    int stopAllEffects();

    int stopEffect(int i);

    int unloadEffect(int i);
}

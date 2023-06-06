package com.sankuai.common.utils;

import android.content.Context;
import android.media.SoundPool;
import android.util.SparseIntArray;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class SoundPlayer {
    private static final boolean DEBUG = false;
    private static final int MAX_STREAMS = 5;
    private static final String TAG = "SoundPlayer";
    public static ChangeQuickRedirect changeQuickRedirect;
    private SoundPool mSoundPool;
    private SparseIntArray mSoundPoolCache;

    public SoundPlayer() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "11921df22fbf5ffe1c6f8e88c0285bb7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "11921df22fbf5ffe1c6f8e88c0285bb7");
            return;
        }
        this.mSoundPool = new SoundPool(5, 3, 0);
        this.mSoundPoolCache = new SparseIntArray();
    }

    public final void play(Context context, int i) {
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "979560a47c1ad377ff203333a4b6ede9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "979560a47c1ad377ff203333a4b6ede9");
        } else {
            play(context, i, 0);
        }
    }

    public final void play(Context context, int i, final int i2) {
        Object[] objArr = {context, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "03ed373e811fdcf566e8116527ec2c84", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "03ed373e811fdcf566e8116527ec2c84");
            return;
        }
        int i3 = this.mSoundPoolCache.get(i);
        if (i3 == 0) {
            final int load = this.mSoundPool.load(context, i, 1);
            this.mSoundPoolCache.put(i, load);
            this.mSoundPool.setOnLoadCompleteListener(new SoundPool.OnLoadCompleteListener() { // from class: com.sankuai.common.utils.SoundPlayer.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // android.media.SoundPool.OnLoadCompleteListener
                public void onLoadComplete(SoundPool soundPool, int i4, int i5) {
                    Object[] objArr2 = {soundPool, Integer.valueOf(i4), Integer.valueOf(i5)};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "47f1506c84d0ca40cebc828d82488a08", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "47f1506c84d0ca40cebc828d82488a08");
                    } else if (i5 == 0 && load == i4) {
                        SoundPlayer.this.mSoundPool.play(load, 1.0f, 1.0f, 5, i2, 1.0f);
                    }
                }
            });
            return;
        }
        this.mSoundPool.play(i3, 1.0f, 1.0f, 5, i2, 1.0f);
    }

    public final void release() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "72d5d01d947533aedfc78f37cb0e0553", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "72d5d01d947533aedfc78f37cb0e0553");
            return;
        }
        if (this.mSoundPoolCache != null) {
            int size = this.mSoundPoolCache.size();
            for (int i = 0; i < size; i++) {
                this.mSoundPool.unload(this.mSoundPoolCache.valueAt(i));
            }
            this.mSoundPoolCache.clear();
            this.mSoundPoolCache = null;
        }
        if (this.mSoundPool != null) {
            this.mSoundPool.release();
            this.mSoundPool = null;
        }
    }
}

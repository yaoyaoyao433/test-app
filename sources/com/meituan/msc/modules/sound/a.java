package com.meituan.msc.modules.sound;

import android.media.AudioManager;
import com.facebook.react.modules.sound.SoundManagerModule;
import com.meituan.msc.extern.MSCEnvHelper;
import com.meituan.msc.modules.manager.MSCMethod;
import com.meituan.msc.modules.manager.ModuleName;
import com.meituan.msc.modules.manager.k;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@ModuleName(name = SoundManagerModule.NAME)
/* loaded from: classes3.dex */
public class a extends k {
    public static ChangeQuickRedirect a;

    @MSCMethod
    public void playTouchSound() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5eb204bb87b15d6ea2268f574771a108", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5eb204bb87b15d6ea2268f574771a108");
            return;
        }
        AudioManager audioManager = (AudioManager) MSCEnvHelper.getContext().getSystemService("audio");
        if (audioManager != null) {
            audioManager.playSoundEffect(0);
        }
    }
}

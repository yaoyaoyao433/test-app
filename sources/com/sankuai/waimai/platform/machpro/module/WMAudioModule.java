package com.sankuai.waimai.platform.machpro.module;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.meituan.android.mtplayer.audio.a;
import com.meituan.android.mtplayer.audio.d;
import com.meituan.android.mtplayer.video.AudioPlayerParam;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.resource.APKStructure;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.manager.cache.c;
import com.sankuai.waimai.machpro.base.JSMethod;
import com.sankuai.waimai.machpro.base.MachMap;
import com.sankuai.waimai.machpro.instance.MPContext;
import com.sankuai.waimai.machpro.module.MPModule;
import com.sankuai.waimai.machpro.util.b;
import java.io.File;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class WMAudioModule extends MPModule {
    private static final String PATH_PREFIX_LOCAL = "assets://";
    public static ChangeQuickRedirect changeQuickRedirect;
    private d mAudioPlayerManager;

    public WMAudioModule(MPContext mPContext) {
        super(mPContext);
        Object[] objArr = {mPContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cb7150c6ba7667ddbf665f658a1b0eba", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cb7150c6ba7667ddbf665f658a1b0eba");
            return;
        }
        this.mAudioPlayerManager = d.a();
        d dVar = this.mAudioPlayerManager;
        Context applicationContext = mPContext.getContext().getApplicationContext();
        Object[] objArr2 = {applicationContext};
        ChangeQuickRedirect changeQuickRedirect3 = d.a;
        if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect3, false, "ae5c92a802619f270303d9a3a36e1c37", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect3, false, "ae5c92a802619f270303d9a3a36e1c37");
            return;
        }
        if (dVar.c == null) {
            if (applicationContext == null) {
                throw new NullPointerException("MTAudioPlayerManager init with null context");
            }
            dVar.c = applicationContext.getApplicationContext();
        }
        Object[] objArr3 = {dVar};
        ChangeQuickRedirect changeQuickRedirect4 = d.a;
        if (PatchProxy.isSupport(objArr3, dVar, changeQuickRedirect4, false, "522466bbd0b3d9a705bbcfea4f1d2a88", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, dVar, changeQuickRedirect4, false, "522466bbd0b3d9a705bbcfea4f1d2a88");
        } else if (d.b.contains(dVar)) {
        } else {
            d.b.add(dVar);
            dVar.d.addObserver(dVar);
        }
    }

    @JSMethod(methodName = "playSound")
    public void playSound(MachMap machMap) {
        c bundle;
        Object[] objArr = {machMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "92771b03e89d01d116f7490c83b5f240", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "92771b03e89d01d116f7490c83b5f240");
        } else if (machMap == null || this.mAudioPlayerManager == null) {
        } else {
            String a = b.a(machMap.get("url"), "");
            if (TextUtils.isEmpty(a)) {
                return;
            }
            if (a.startsWith(PATH_PREFIX_LOCAL)) {
                MPContext machContext = getMachContext();
                if (machContext == null || (bundle = machContext.getBundle()) == null) {
                    return;
                }
                a = bundle.g + File.separator + APKStructure.Assets_Type + File.separator + a.substring(9);
            }
            AudioPlayerParam audioPlayerParam = new AudioPlayerParam(a);
            d dVar = this.mAudioPlayerManager;
            Object[] objArr2 = {audioPlayerParam};
            ChangeQuickRedirect changeQuickRedirect3 = d.a;
            if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect3, false, "90cf449564eb1744f739060abe710b3e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect3, false, "90cf449564eb1744f739060abe710b3e");
            } else {
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable("extra_key_set_datasource", audioPlayerParam);
                a.a(dVar.c, "MUSIC_ACTICON_SET_DATASOURCE", bundle2);
            }
            this.mAudioPlayerManager.c();
        }
    }

    @JSMethod(methodName = "release")
    public void release(MachMap machMap) {
        Object[] objArr = {machMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4b430d6717182084d66e87fc437fdbfd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4b430d6717182084d66e87fc437fdbfd");
        } else if (this.mAudioPlayerManager != null) {
            this.mAudioPlayerManager.d();
            this.mAudioPlayerManager.g();
            this.mAudioPlayerManager = null;
        }
    }
}

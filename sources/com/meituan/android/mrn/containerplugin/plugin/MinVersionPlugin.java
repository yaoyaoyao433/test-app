package com.meituan.android.mrn.containerplugin.plugin;

import android.support.annotation.Keep;
import android.text.TextUtils;
import com.meituan.android.mrn.containerplugin.annotation.PluginConfig;
import com.meituan.android.mrn.containerplugin.plugincore.a;
import com.meituan.android.mrn.containerplugin.stage.IContainerLifeCycleStage;
import com.meituan.android.mrn.router.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class MinVersionPlugin extends a<Config> implements IContainerLifeCycleStage.IContainerCreateStage {
    @Keep
    public static final String NAME = "MinVersionPlugin";
    public static ChangeQuickRedirect a;

    /* compiled from: ProGuard */
    @Keep
    @PluginConfig
    /* loaded from: classes2.dex */
    public static class Config {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String minVersion;
    }

    @Override // com.meituan.android.mrn.containerplugin.plugincore.a
    public final String a() {
        return NAME;
    }

    @Override // com.meituan.android.mrn.containerplugin.stage.IContainerLifeCycleStage.IContainerCreateStage
    public final void a(IContainerLifeCycleStage.IContainerCreateStage.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "96afb4069fdd82c9273c538e17c52a44", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "96afb4069fdd82c9273c538e17c52a44");
        } else if (aVar.d == null || this.c == 0 || TextUtils.isEmpty(((Config) this.c).minVersion)) {
        } else {
            d dVar = aVar.d;
            String str = ((Config) this.c).minVersion;
            Object[] objArr2 = {str};
            ChangeQuickRedirect changeQuickRedirect2 = d.a;
            if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "6c0b3be0ef22a7ac7465789b7efb8185", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "6c0b3be0ef22a7ac7465789b7efb8185");
                return;
            }
            com.facebook.common.logging.a.b("[MRNURL@setConfigMinVersion]", dVar.i + ": " + str);
            dVar.o = str;
        }
    }
}

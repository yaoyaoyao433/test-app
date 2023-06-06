package com.meituan.android.mrn.containerplugin.stage;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public interface IContainerLifeCycleStage {

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface IContainerAppearedStage {
        @Keep
        public static final String NAME = "onContainerAppeared";
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface IContainerDisappearStage {
        @Keep
        public static final String NAME = "onContainerDisappear";
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface IContainerReleasedStage {
        @Keep
        public static final String NAME = "onContainerReleased";
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface IContainerStopStage {
        @Keep
        public static final String NAME = "onContainerStop";
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface IContainerCreateStage {
        @Keep
        public static final String NAME = "onContainerCreate";

        /* compiled from: ProGuard */
        /* loaded from: classes2.dex */
        public static class a extends com.meituan.android.mrn.containerplugin.plugincore.b {
        }

        void a(a aVar);

        /* compiled from: ProGuard */
        /* loaded from: classes2.dex */
        public static class b implements com.meituan.android.mrn.containerplugin.event.a<IContainerCreateStage, a> {
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.mrn.containerplugin.event.a
            public final String a() {
                return IContainerCreateStage.NAME;
            }

            @Override // com.meituan.android.mrn.containerplugin.event.a
            public final /* synthetic */ void a(String str, IContainerCreateStage iContainerCreateStage, a aVar) {
                IContainerCreateStage iContainerCreateStage2 = iContainerCreateStage;
                a aVar2 = aVar;
                Object[] objArr = {str, iContainerCreateStage2, aVar2};
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9538cd9304ff1f9ba550485eb26bd5d4", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9538cd9304ff1f9ba550485eb26bd5d4");
                } else {
                    iContainerCreateStage2.a(aVar2);
                }
            }
        }
    }
}

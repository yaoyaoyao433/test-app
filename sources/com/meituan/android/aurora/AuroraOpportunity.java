package com.meituan.android.aurora;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public interface AuroraOpportunity {
    Set<AuroraOpportunityFeature> getFeature();

    String getName();

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public enum AuroraOpportunityFeature {
        ;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        AuroraOpportunityFeature() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bbd2cc94035e5d7b83cf5f6b3788db60", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bbd2cc94035e5d7b83cf5f6b3788db60");
            }
        }

        public static AuroraOpportunityFeature valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5478b03cb7f47520f6099c4d6bd075e1", RobustBitConfig.DEFAULT_VALUE) ? (AuroraOpportunityFeature) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5478b03cb7f47520f6099c4d6bd075e1") : (AuroraOpportunityFeature) Enum.valueOf(AuroraOpportunityFeature.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static AuroraOpportunityFeature[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0bbcee01693278477bf3c3c4565383e2", RobustBitConfig.DEFAULT_VALUE) ? (AuroraOpportunityFeature[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0bbcee01693278477bf3c3c4565383e2") : (AuroraOpportunityFeature[]) values().clone();
        }
    }
}

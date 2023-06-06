package com.meituan.android.mrn.component.list.item;

import android.content.Context;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.views.view.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b extends f {
    public static ChangeQuickRedirect a;

    public final void setRepeat(Dynamic dynamic) {
    }

    public b(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "917ce898a9b65998c63afba767b895d3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "917ce898a9b65998c63afba767b895d3");
        }
    }

    public final void setCondition(Dynamic dynamic) {
        Object[] objArr = {dynamic};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b814e61aa5070fc70ef1249d0b202fe5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b814e61aa5070fc70ef1249d0b202fe5");
        } else {
            setVisibility(MListExpressionManager.converseDynamicToBoolean(dynamic) ? 0 : 8);
        }
    }

    public final void setInversion(Dynamic dynamic) {
        Object[] objArr = {dynamic};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "40e15540827e5b6e2d48565adcfaf1e5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "40e15540827e5b6e2d48565adcfaf1e5");
        } else {
            setVisibility(MListExpressionManager.converseDynamicToBoolean(dynamic) ^ true ? 0 : 8);
        }
    }

    @Override // com.facebook.react.views.view.f, android.view.View
    public final void onMeasure(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b183d6f2b89a5bd1373d5a3b264145fe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b183d6f2b89a5bd1373d5a3b264145fe");
        } else {
            super.onMeasure(i, i2);
        }
    }

    @Override // com.facebook.react.views.view.f, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c7d75a5d4c159196ea6805a6fe87080", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c7d75a5d4c159196ea6805a6fe87080");
        } else {
            super.onLayout(z, i, i2, i3, i4);
        }
    }
}

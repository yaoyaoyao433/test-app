package com.meituan.android.ptcommonim.video.record;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.widget.IMediaWidgetCallback;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class f implements IMediaWidgetCallback {
    public static ChangeQuickRedirect a;
    private final PTIMRecordFragment b;

    private f(PTIMRecordFragment pTIMRecordFragment) {
        this.b = pTIMRecordFragment;
    }

    public static IMediaWidgetCallback a(PTIMRecordFragment pTIMRecordFragment) {
        Object[] objArr = {pTIMRecordFragment};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "33c6c46636b6daa0204543d7b9e63225", RobustBitConfig.DEFAULT_VALUE) ? (IMediaWidgetCallback) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "33c6c46636b6daa0204543d7b9e63225") : new f(pTIMRecordFragment);
    }

    @Override // com.sankuai.titans.widget.IMediaWidgetCallback
    public final void onResult(ArrayList arrayList, int i) {
        Object[] objArr = {arrayList, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "07ff992da219f404c9e24ce705c78f2b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "07ff992da219f404c9e24ce705c78f2b");
        } else {
            PTIMRecordFragment.a(this.b, arrayList, i);
        }
    }
}

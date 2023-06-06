package com.meituan.msc.modules.api.msi.components.coverview;

import android.content.Context;
import android.view.View;
import com.meituan.msc.common.utils.n;
import com.meituan.msc.modules.api.msi.components.coverview.params.MSCCoverScrollParams;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class f extends k implements com.meituan.msc.modules.api.msi.b {
    public static ChangeQuickRedirect a;
    public com.meituan.msc.modules.api.msi.e b;

    public f(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "841cff28766a017349c4e7665e2ced68", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "841cff28766a017349c4e7665e2ced68");
        }
    }

    @Override // com.meituan.msc.modules.api.msi.b
    public final void setViewContext(com.meituan.msc.modules.api.msi.e eVar) {
        this.b = eVar;
    }

    public final com.meituan.msc.modules.api.msi.e getViewContext() {
        return this.b;
    }

    public final void setUpScroll(MSCCoverScrollParams mSCCoverScrollParams) {
        Object[] objArr = {mSCCoverScrollParams};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7aefbbe7fff6bc7d1fce1a1156c8b7ff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7aefbbe7fff6bc7d1fce1a1156c8b7ff");
            return;
        }
        if (mSCCoverScrollParams.needScrollEvent != null) {
            if (mSCCoverScrollParams.needScrollEvent.booleanValue()) {
                this.e = new d() { // from class: com.meituan.msc.modules.api.msi.components.coverview.f.1
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.msc.modules.api.msi.components.coverview.d
                    public final void a(View view, int i, int i2) {
                        Object[] objArr2 = {view, Integer.valueOf(i), Integer.valueOf(i2)};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5e0b97af225c4141b541e034809fa82f", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5e0b97af225c4141b541e034809fa82f");
                            return;
                        }
                        HashMap hashMap = new HashMap();
                        hashMap.put("scrollLeft", Integer.valueOf((int) n.d(i)));
                        hashMap.put("scrollTop", Integer.valueOf((int) n.d(i2)));
                        hashMap.put("scrollWidth", Integer.valueOf((int) n.d(view.getWidth())));
                        hashMap.put("scrollHeight", Integer.valueOf((int) n.d(view.getHeight())));
                        f.this.b.a("onScrollViewScroll", hashMap);
                    }
                };
            } else {
                this.e = null;
            }
        }
        if (mSCCoverScrollParams.scrollX != null) {
            setScrollHorizontal(mSCCoverScrollParams.scrollX.booleanValue());
        }
        if (mSCCoverScrollParams.scrollY != null) {
            setScrollVertical(mSCCoverScrollParams.scrollY.booleanValue());
        }
        if (mSCCoverScrollParams.scrollTop != null) {
            final int a2 = n.a(mSCCoverScrollParams.scrollTop.doubleValue());
            postDelayed(new Runnable() { // from class: com.meituan.msc.modules.api.msi.components.coverview.f.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "eb92ca0caf3f77188c2e9aae01db84bd", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "eb92ca0caf3f77188c2e9aae01db84bd");
                    } else {
                        f.this.scrollTo(f.this.getScrollX(), a2);
                    }
                }
            }, 100L);
        }
    }
}

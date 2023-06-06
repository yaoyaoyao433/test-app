package com.sankuai.waimai.irmo.canvas.component;

import android.support.annotation.Keep;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.irmo.canvas.instance.INFContext;
import com.sankuai.waimai.irmo.canvas.view.a;
import com.sankuai.waimai.irmo.canvas.view.c;
import com.sankuai.waimai.irmo.utils.d;
import java.util.UUID;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes3.dex */
public class INFComponent {
    public static ChangeQuickRedirect changeQuickRedirect;
    protected INFContext mInfContext;
    protected long mNativeNodePtr;
    protected a mView;

    public INFComponent(INFContext iNFContext) {
        Object[] objArr = {iNFContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ddac957db080f7c0a4a28e50dc320cc9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ddac957db080f7c0a4a28e50dc320cc9");
            return;
        }
        this.mInfContext = iNFContext;
        this.mView = new c(this.mInfContext.getContext(), !TextUtils.isEmpty(this.mInfContext.id) ? this.mInfContext.id : UUID.randomUUID().toString());
        a aVar = this.mView;
        com.sankuai.waimai.irmo.canvas.data.a aVar2 = new com.sankuai.waimai.irmo.canvas.data.a() { // from class: com.sankuai.waimai.irmo.canvas.component.INFComponent.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.irmo.canvas.data.a
            public final Object invoke(Object obj) {
                Object[] objArr2 = {obj};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "7cfc44877d22eb1bba8f518be9cdaa72", RobustBitConfig.DEFAULT_VALUE)) {
                    return PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "7cfc44877d22eb1bba8f518be9cdaa72");
                }
                d.a("Java inf_canvas_log:  view ready:" + INFComponent.this.mView.hashCode(), new Object[0]);
                INFComponent.this.mInfContext.getInstance().a("created", null);
                return null;
            }
        };
        Object[] objArr2 = {aVar2};
        ChangeQuickRedirect changeQuickRedirect3 = a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect3, false, "137f21bcab012b601f6eb208bfae09f9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect3, false, "137f21bcab012b601f6eb208bfae09f9");
        } else if (aVar.b) {
            aVar2.invoke(null);
        } else {
            aVar.c = aVar2;
        }
    }

    public void setNativeNodePtr(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d8152d65208700652b1dd72af1f1f831", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d8152d65208700652b1dd72af1f1f831");
        } else {
            this.mNativeNodePtr = j;
        }
    }

    public a getView() {
        return this.mView;
    }

    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cb6bf726e7eda68067ed87b9cc4a99b3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cb6bf726e7eda68067ed87b9cc4a99b3");
        } else if (this.mView != null) {
            this.mView.a();
        }
    }
}

package com.sankuai.waimai.platform.widget.dial.injection;

import android.content.Context;
import android.support.v4.app.FragmentActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.platform.widget.dial.domain.repository.b;
import com.sankuai.waimai.platform.widget.dial.presenter.DialContract;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class a {
    public static ChangeQuickRedirect a;
    private static com.sankuai.waimai.platform.widget.dial.storage.a b;

    private static b a(FragmentActivity fragmentActivity) {
        Object[] objArr = {fragmentActivity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fcb90f9906bfd8b669d0be8a785119bf", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fcb90f9906bfd8b669d0be8a785119bf");
        }
        if (b == null) {
            synchronized (a.class) {
                if (b == null) {
                    b = new com.sankuai.waimai.platform.widget.dial.storage.a(fragmentActivity);
                }
            }
        }
        com.sankuai.waimai.platform.widget.dial.storage.a aVar = b;
        Object[] objArr2 = {fragmentActivity};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.platform.widget.dial.storage.a.b;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "ce89089d3cc1ecb43bf2b51da0563f9f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "ce89089d3cc1ecb43bf2b51da0563f9f");
        } else {
            aVar.c = new WeakReference<>(fragmentActivity);
        }
        return b;
    }

    public static DialContract.Presenter a(final Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "173bacea72cd7763220b4cc66b2c1748", RobustBitConfig.DEFAULT_VALUE)) {
            return (DialContract.Presenter) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "173bacea72cd7763220b4cc66b2c1748");
        }
        com.sankuai.waimai.platform.widget.dial.presenter.a aVar = new com.sankuai.waimai.platform.widget.dial.presenter.a(new com.sankuai.waimai.platform.widget.dial.view.a(context), a((FragmentActivity) context));
        aVar.c = new DialContract.b() { // from class: com.sankuai.waimai.platform.widget.dial.injection.a.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.platform.widget.dial.presenter.DialContract.b
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4974073a4614f0e6a7183e0c5db82178", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4974073a4614f0e6a7183e0c5db82178");
                } else {
                    JudasManualManager.b("b_x9orohoj").a(context).a();
                }
            }

            @Override // com.sankuai.waimai.platform.widget.dial.presenter.DialContract.b
            public final void a(boolean z, int i) {
                Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "61c395867af57308957f177a320ddb38", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "61c395867af57308957f177a320ddb38");
                } else if (z) {
                    JudasManualManager.a a2 = JudasManualManager.a("b_oyzn2r6j").a(context);
                    HashMap hashMap = new HashMap();
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("receive_user_type", Integer.valueOf(i));
                    hashMap.put("custom", hashMap2);
                    a2.a((Map<String, Object>) hashMap).a();
                } else {
                    JudasManualManager.a("b_qv7wbi2r").a(context).a();
                }
            }

            @Override // com.sankuai.waimai.platform.widget.dial.presenter.DialContract.b
            public final void b() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ec546fa5e17b4f02503f68e10e6d6e56", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ec546fa5e17b4f02503f68e10e6d6e56");
                } else {
                    JudasManualManager.a("b_fsstxdst").a(context).a();
                }
            }

            @Override // com.sankuai.waimai.platform.widget.dial.presenter.DialContract.b
            public final void a(boolean z) {
                Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5de9848c4441c399c2309dcd90aa95b8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5de9848c4441c399c2309dcd90aa95b8");
                } else if (z) {
                    JudasManualManager.b("b_io6vlyna").a(context).a();
                } else {
                    JudasManualManager.b("b_b8ooywk9").a(context).a();
                }
            }

            @Override // com.sankuai.waimai.platform.widget.dial.presenter.DialContract.b
            public final void a(boolean z, boolean z2, int i) {
                Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f1e379b591301105a90bf9e5fe05dac9", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f1e379b591301105a90bf9e5fe05dac9");
                } else if (!z) {
                    if (z2) {
                        JudasManualManager.a("b_6jn85yym").a(context).a();
                    } else {
                        JudasManualManager.a("b_bnii9auz").a(context).a();
                    }
                } else if (z2) {
                    HashMap hashMap = new HashMap();
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("receive_user_type", Integer.valueOf(i));
                    hashMap.put("custom", hashMap2);
                    JudasManualManager.a("b_td5gezbe").a((Map<String, Object>) hashMap).a(context).a();
                } else {
                    JudasManualManager.a("b_2115a5nb").a(context).a();
                }
            }
        };
        return aVar;
    }
}

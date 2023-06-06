package com.dianping.shield.dynamic.diff.view;

import android.content.Context;
import android.text.TextUtils;
import com.dianping.shield.dynamic.model.extra.MidasInfo;
import com.dianping.shield.dynamic.model.view.BaseViewInfo;
import com.dianping.shield.dynamic.objects.DynamicModuleViewItemData;
import com.dianping.shield.dynamic.protocols.LoadItemListener;
import com.dianping.shield.dynamic.utils.DMUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.midas.ad.feedback.b;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.functions.a;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.i;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\u0004\b\u0001\u0010\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/dianping/shield/dynamic/protocols/LoadItemListener;", "T", "Lcom/dianping/shield/dynamic/model/view/BaseViewInfo;", "V", "invoke"}, k = 3, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class BaseViewInfoDiff$loadItemListener$2 extends i implements a<LoadItemListener> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ BaseViewInfoDiff this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseViewInfoDiff$loadItemListener$2(BaseViewInfoDiff baseViewInfoDiff) {
        super(0);
        this.this$0 = baseViewInfoDiff;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.a
    @NotNull
    public final LoadItemListener invoke() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "60fab41ae4ae5e9945873d8221a5f0ad", RobustBitConfig.DEFAULT_VALUE) ? (LoadItemListener) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "60fab41ae4ae5e9945873d8221a5f0ad") : new LoadItemListener() { // from class: com.dianping.shield.dynamic.diff.view.BaseViewInfoDiff$loadItemListener$2.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.dianping.shield.dynamic.protocols.LoadItemListener
            public final void onItemLoad(DynamicModuleViewItemData dynamicModuleViewItemData) {
                BaseViewInfo baseViewInfo;
                MidasInfo midasInfo;
                Object[] objArr2 = {dynamicModuleViewItemData};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "644be1cf4d3e1bc73e01bb6d8c991ea9", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "644be1cf4d3e1bc73e01bb6d8c991ea9");
                } else if (dynamicModuleViewItemData == null || (baseViewInfo = dynamicModuleViewItemData.newViewInfo) == null || (midasInfo = baseViewInfo.getMidasInfo()) == null) {
                } else {
                    Context hostContext = BaseViewInfoDiff$loadItemListener$2.this.this$0.getHostChassis().getHostContext();
                    String moduleName = DMUtils.getModuleName(BaseViewInfoDiff$loadItemListener$2.this.this$0.getHostChassis());
                    h.a((Object) moduleName, "DMUtils.getModuleName(hostChassis)");
                    if (midasInfo == null || TextUtils.isEmpty(midasInfo.getFeedback())) {
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    HashMap<String, String> extra = midasInfo.getExtra();
                    if (extra == null) {
                        extra = new HashMap<>();
                    }
                    HashMap<String, String> hashMap = extra;
                    hashMap.put("adsdktype", "4");
                    hashMap.put("modulename", moduleName);
                    if (hostContext != null) {
                        new b(hostContext).a(midasInfo.getFeedback(), 1, arrayList, midasInfo.getExtra());
                    }
                }
            }
        };
    }
}

package com.sankuai.waimai.store.drug.home.refactor.generator;

import android.arch.lifecycle.f;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.waimai.store.assembler.component.BaseCard;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class e extends c<List<BaseCard>> {
    public static ChangeQuickRedirect a;

    public e(@NonNull f fVar, @NonNull FragmentActivity fragmentActivity) {
        super(fVar, fragmentActivity);
        Object[] objArr = {fVar, fragmentActivity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b9ac73481ed8afdf8a5964840246eda", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b9ac73481ed8afdf8a5964840246eda");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0124, code lost:
        if (r11.equals(com.sankuai.waimai.store.repository.model.ConfigInfo.MODULE_ACROSS_BANNER) != false) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x014d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.sankuai.waimai.store.assembler.component.BaseCard> a(@android.support.annotation.NonNull com.sankuai.waimai.store.repository.model.PoiVerticalityDataResponse r24) {
        /*
            Method dump skipped, instructions count: 414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.store.drug.home.refactor.generator.e.a(com.sankuai.waimai.store.repository.model.PoiVerticalityDataResponse):java.util.List");
    }
}

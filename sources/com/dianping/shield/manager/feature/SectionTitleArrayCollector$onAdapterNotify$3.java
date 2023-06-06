package com.dianping.shield.manager.feature;

import android.os.Parcelable;
import com.dianping.agentsdk.framework.ar;
import com.dianping.shield.consts.ShieldConst;
import com.dianping.shield.entity.SectionTitleInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.v;
import kotlin.jvm.functions.a;
import kotlin.jvm.internal.i;
import kotlin.k;
import kotlin.r;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class SectionTitleArrayCollector$onAdapterNotify$3 extends i implements a<r> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ SectionTitleArrayCollector this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SectionTitleArrayCollector$onAdapterNotify$3(SectionTitleArrayCollector sectionTitleArrayCollector) {
        super(0);
        this.this$0 = sectionTitleArrayCollector;
    }

    @Override // kotlin.jvm.functions.a
    public final /* bridge */ /* synthetic */ r invoke() {
        invoke2();
        return r.a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ar arVar;
        SectionTitleInfo sectionTitleInfo;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6bd340ed5b05a3ba57501d00c7f2e5fc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6bd340ed5b05a3ba57501d00c7f2e5fc");
            return;
        }
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        HashMap<k<String, Integer>, SectionTitleInfo> sectionTitleMap = this.this$0.getSectionTitleMap();
        LinkedHashMap linkedHashMap = new LinkedHashMap(v.a(sectionTitleMap.size()));
        Iterator<T> it = sectionTitleMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            if (entry == null || (sectionTitleInfo = (SectionTitleInfo) entry.getValue()) == null) {
                sectionTitleInfo = null;
            } else {
                arrayList.add(sectionTitleInfo);
            }
            linkedHashMap.put(key, sectionTitleInfo);
        }
        arVar = this.this$0.whiteBoard;
        if (arVar != null) {
            arVar.a(ShieldConst.SECTION_TITLE_LIST_KEY, arrayList);
        }
    }
}

package com.dianping.shield.lifecycle;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/dianping/shield/lifecycle/PageDisappearType;", "", "id", "", "(Ljava/lang/String;II)V", "getId", "()I", "GO_AHEAD", "GO_BACK", "RESIGN_ACTIVE", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public enum PageDisappearType {
    GO_AHEAD(1),
    GO_BACK(2),
    RESIGN_ACTIVE(7);
    
    public static ChangeQuickRedirect changeQuickRedirect;
    private final int id;

    public static PageDisappearType valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return (PageDisappearType) (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "cb9c6eda065c4145e85cdf9fcd2d29e2", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "cb9c6eda065c4145e85cdf9fcd2d29e2") : Enum.valueOf(PageDisappearType.class, str));
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static PageDisappearType[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return (PageDisappearType[]) (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2e298e08917da70e5cc9be9cd2803e25", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2e298e08917da70e5cc9be9cd2803e25") : values().clone());
    }

    PageDisappearType(int i) {
        Object[] objArr = {r10, Integer.valueOf(r11), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1f4b6508d6f40e07bd350dae0f4b2e9e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1f4b6508d6f40e07bd350dae0f4b2e9e");
        } else {
            this.id = i;
        }
    }

    public final int getId() {
        return this.id;
    }
}

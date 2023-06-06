package com.dianping.shield.agent;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/dianping/shield/agent/AgentLoadedObservableType;", "", "type", "", "(Ljava/lang/String;II)V", "getType", "()I", "AND", "OR", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public enum AgentLoadedObservableType {
    AND(0),
    OR(1);
    
    public static ChangeQuickRedirect changeQuickRedirect;
    private final int type;

    public static AgentLoadedObservableType valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return (AgentLoadedObservableType) (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "97f718605e002aca77118855e1c74464", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "97f718605e002aca77118855e1c74464") : Enum.valueOf(AgentLoadedObservableType.class, str));
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static AgentLoadedObservableType[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return (AgentLoadedObservableType[]) (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "019daea064dfa8af6490a99c5d15c539", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "019daea064dfa8af6490a99c5d15c539") : values().clone());
    }

    AgentLoadedObservableType(int i) {
        Object[] objArr = {r10, Integer.valueOf(r11), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fc13ece04f09b0c5e49d623723fcfeb3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fc13ece04f09b0c5e49d623723fcfeb3");
        } else {
            this.type = i;
        }
    }

    public final int getType() {
        return this.type;
    }
}

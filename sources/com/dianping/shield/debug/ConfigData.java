package com.dianping.shield.debug;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.Serializable;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class ConfigData implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String agentList;
    public boolean isVisibile;
    public String key;

    public ConfigData(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "75eab0b43894d1c7876821ef8f9f1d97", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "75eab0b43894d1c7876821ef8f9f1d97");
            return;
        }
        this.isVisibile = false;
        this.key = str;
        this.agentList = str2;
    }

    public void setVisibile(boolean z) {
        this.isVisibile = z;
    }

    public boolean getVisible() {
        return this.isVisibile;
    }
}

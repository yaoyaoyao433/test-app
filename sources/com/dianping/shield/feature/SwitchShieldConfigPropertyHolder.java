package com.dianping.shield.feature;

import com.dianping.portal.feature.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class SwitchShieldConfigPropertyHolder implements g {
    public static ChangeQuickRedirect changeQuickRedirect;
    public CopyOnWriteArrayList<String> configswitch;

    public SwitchShieldConfigPropertyHolder() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cc5bc08a7a1c5d7b39df67a8ccd6e0a0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cc5bc08a7a1c5d7b39df67a8ccd6e0a0");
        } else {
            this.configswitch = new CopyOnWriteArrayList<>();
        }
    }

    @Override // com.dianping.portal.feature.g
    public void notifyConfigDataChange(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1bff3f8e08281f3afdd4056cac451fcd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1bff3f8e08281f3afdd4056cac451fcd");
            return;
        }
        this.configswitch.clear();
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i = 0; i < jSONArray.length(); i++) {
                this.configswitch.add(jSONArray.get(i).toString());
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}

package com.meituan.android.recce.views.anim.node;

import android.view.View;
import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class RecceAnimNode {
    public static ChangeQuickRedirect changeQuickRedirect;
    public List<RecceAnimNode> children;
    public RecceAnimConfig config;
    public View targetView;

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a442f2afa2b565b281f22a29ff0c1981", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a442f2afa2b565b281f22a29ff0c1981") : new Gson().toJson(this);
    }
}

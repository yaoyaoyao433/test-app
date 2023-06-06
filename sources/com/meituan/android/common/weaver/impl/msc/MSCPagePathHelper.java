package com.meituan.android.common.weaver.impl.msc;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import com.meituan.android.common.weaver.impl.natives.NativeFFPEvent;
import com.meituan.android.common.weaver.impl.natives.PagePathHelper;
import com.meituan.android.common.weaver.interfaces.ffp.FFPTags;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class MSCPagePathHelper extends PagePathHelper {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final MSCParam startParam;

    @Override // com.meituan.android.common.weaver.impl.natives.PagePathHelper
    public boolean hasSpecialPagePath() {
        return true;
    }

    public MSCPagePathHelper(@NonNull MSCParam mSCParam, String str) {
        super(mSCParam.activity);
        Object[] objArr = {mSCParam, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a12ba3aab079b89aa74ffdc829f7b605", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a12ba3aab079b89aa74ffdc829f7b605");
            return;
        }
        this.startParam = mSCParam;
        this.pagePath = str;
    }

    @Override // com.meituan.android.common.weaver.impl.natives.PagePathHelper
    public void fillFFPTags(@NonNull NativeFFPEvent nativeFFPEvent) {
        Object[] objArr = {nativeFFPEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7f5e88d1b6a118eefa5cbb4128383e28", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7f5e88d1b6a118eefa5cbb4128383e28");
            return;
        }
        View view = this.startParam.rootView.get();
        if (view instanceof FFPTags) {
            try {
                Map<String, Object> ffpTags = ((FFPTags) view).ffpTags();
                for (String str : ffpTags.keySet()) {
                    nativeFFPEvent.with(str, ffpTags.get(str));
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        super.fillFFPTags(nativeFFPEvent);
    }

    @Override // com.meituan.android.common.weaver.impl.natives.PagePathHelper
    public void fillPagePathInfo(@NonNull NativeFFPEvent nativeFFPEvent) {
        Object[] objArr = {nativeFFPEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "23019b9768196f590a1a8e099e21df69", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "23019b9768196f590a1a8e099e21df69");
            return;
        }
        super.fillPagePathInfo(nativeFFPEvent);
        this.startParam.fillExtra(nativeFFPEvent.getExtra());
    }

    @Override // com.meituan.android.common.weaver.impl.natives.PagePathHelper
    public void fillBlankPagePathInfo(@NonNull Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bc2107f451bb0bdc1cb21ccdb8aa6d69", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bc2107f451bb0bdc1cb21ccdb8aa6d69");
            return;
        }
        this.startParam.fillExtra(map);
        super.fillBlankPagePathInfo(map);
    }

    @Override // com.meituan.android.common.weaver.impl.natives.PagePathHelper
    public boolean fullPage() {
        return !this.startParam.isWidget;
    }

    @Override // com.meituan.android.common.weaver.impl.natives.PagePathHelper
    public String getConfigPagePath() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "82c509fc53f41addad7c2b132b08c387", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "82c509fc53f41addad7c2b132b08c387");
        }
        return this.startParam.appId + "/" + this.pagePath;
    }

    @Override // com.meituan.android.common.weaver.impl.natives.PagePathHelper
    @Nullable
    public View getRootView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c2035634affa2c8f7078960764118f90", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c2035634affa2c8f7078960764118f90");
        }
        if (fullPage()) {
            return super.getRootView();
        }
        return this.startParam.rootView.get();
    }

    @NonNull
    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a0c8d11abb70593bb359a5d43260ad4e", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a0c8d11abb70593bb359a5d43260ad4e");
        }
        return "MSC(" + this.pagePath + CommonConstant.Symbol.BRACKET_RIGHT;
    }
}

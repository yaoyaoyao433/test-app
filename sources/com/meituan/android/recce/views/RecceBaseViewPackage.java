package com.meituan.android.recce.views;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.facebook.infer.annotation.a;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.meituan.android.recce.ReccePackage;
import com.meituan.android.recce.b;
import com.meituan.android.recce.bridge.RecceCustomApi;
import com.meituan.android.recce.views.base.RecceInstanceUtils;
import com.meituan.android.recce.views.image.RecceImageManager;
import com.meituan.android.recce.views.modal.RecceModalManager;
import com.meituan.android.recce.views.progressdialog.RecceProgressDialogManager;
import com.meituan.android.recce.views.scroll.RecceHorizonScrollViewManager;
import com.meituan.android.recce.views.scroll.RecceScrollContentViewManager;
import com.meituan.android.recce.views.scroll.RecceVerticalScrollViewManager;
import com.meituan.android.recce.views.text.RecceRawTextManager;
import com.meituan.android.recce.views.text.RecceTextViewManager;
import com.meituan.android.recce.views.textinput.RecceTextInputManager;
import com.meituan.android.recce.views.view.RecceViewManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class RecceBaseViewPackage implements ReccePackage {
    public static ChangeQuickRedirect changeQuickRedirect;
    public static List<RecceViewManagerProvider> viewManagerProviders = new ArrayList();

    @Override // com.meituan.android.recce.ReccePackage
    public Map<String, RecceCustomApi> getCustomApis() {
        return null;
    }

    @Override // com.meituan.android.recce.ReccePackage
    @NonNull
    public List<ViewManager> registerViewManagers(@NonNull b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "37f5117f0424218c6727159e053a86ad", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "37f5117f0424218c6727159e053a86ad");
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new RecceViewManager());
        arrayList.add(new RecceTextViewManager());
        arrayList.add(new RecceRawTextManager());
        arrayList.add(new RecceImageManager(bVar, true, 2.0f, true, true));
        arrayList.add(new ReactProgressBarViewManager());
        arrayList.add(new RecceVerticalScrollViewManager());
        arrayList.add(new RecceHorizonScrollViewManager());
        arrayList.add(new RecceScrollContentViewManager());
        arrayList.add(new RecceProgressDialogManager());
        arrayList.add(new RecceTextInputManager());
        arrayList.add(new RecceModalManager());
        for (RecceViewManagerProvider recceViewManagerProvider : viewManagerProviders) {
            List<ViewManager> viewManagers = recceViewManagerProvider.getViewManagers(bVar);
            String collidedViewManager = RecceInstanceUtils.getCollidedViewManager(arrayList, viewManagers);
            if (TextUtils.isEmpty(collidedViewManager)) {
                arrayList.addAll(viewManagers);
            } else {
                a.a("view manager '" + collidedViewManager + "' is collision");
            }
        }
        return arrayList;
    }

    public static void registerViewManagers(RecceViewManagerProvider recceViewManagerProvider) {
        Object[] objArr = {recceViewManagerProvider};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5efee0a00165f77cae920ea32b78e92a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5efee0a00165f77cae920ea32b78e92a");
        } else if (recceViewManagerProvider != null) {
            viewManagerProviders.add(recceViewManagerProvider);
        }
    }
}

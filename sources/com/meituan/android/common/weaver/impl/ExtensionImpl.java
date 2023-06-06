package com.meituan.android.common.weaver.impl;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import com.meituan.android.common.weaver.impl.ffp.CustomTagsEvent;
import com.meituan.android.common.weaver.impl.ffp.CustomTagsEventWithActivity;
import com.meituan.android.common.weaver.impl.natives.ActivityInfoHolder;
import com.meituan.android.common.weaver.impl.natives.NativeEndPointManager;
import com.meituan.android.common.weaver.interfaces.Weaver;
import com.meituan.android.common.weaver.interfaces.ffp.ContainerEvent;
import com.meituan.android.common.weaver.interfaces.ffp.IExtension;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class ExtensionImpl implements IExtension {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.meituan.android.common.weaver.interfaces.ffp.IExtension
    public void addCustomTags(@Nullable String str, @Nullable Activity activity, @NonNull String str2, @NonNull Object obj) {
        Object[] objArr = {str, activity, str2, obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1c9a57e38d37d225ed246cc576558ec6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1c9a57e38d37d225ed246cc576558ec6");
            return;
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put(str2, obj);
        addCustomTags(str, activity, hashMap);
    }

    @Override // com.meituan.android.common.weaver.interfaces.ffp.IExtension
    public void addCustomTags(@Nullable String str, @Nullable Activity activity, @NonNull Map<String, Object> map) {
        CustomTagsEvent customTagsEventWithActivity;
        Object[] objArr = {str, activity, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fc8dbc01cc3126ec04d1dd5f1ba00216", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fc8dbc01cc3126ec04d1dd5f1ba00216");
            return;
        }
        if (activity == null) {
            customTagsEventWithActivity = new CustomTagsEvent(str);
        } else {
            customTagsEventWithActivity = new CustomTagsEventWithActivity(str, activity);
        }
        customTagsEventWithActivity.withExtra(map);
        Weaver.getWeaver().weave(customTagsEventWithActivity);
    }

    @Override // com.meituan.android.common.weaver.interfaces.ffp.IExtension
    public void clickJump2Fragment(@NonNull Activity activity, @NonNull Object obj) {
        Object[] objArr = {activity, obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "00f6303655d2f844a07b08d37f58eee8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "00f6303655d2f844a07b08d37f58eee8");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("eType", "start");
        Weaver.getWeaver().weave(ContainerEvent.of(ContainerEvent.CONTAINER_NAME_FRAGMENT, activity, obj, hashMap));
        NativeEndPointManager.getInstance().holder(activity, false).appendClickJump2Fragment(obj);
    }

    @Override // com.meituan.android.common.weaver.interfaces.ffp.IExtension
    public void onFragmentCreateView(@NonNull Activity activity, @NonNull Object obj, @NonNull View view) {
        Object[] objArr = {activity, obj, view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c92418b2abfd6fe0ec992f91b6ac6b46", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c92418b2abfd6fe0ec992f91b6ac6b46");
            return;
        }
        ActivityInfoHolder holder = NativeEndPointManager.getInstance().holder(activity, true);
        if (holder != null && holder.shouldConsumer(obj)) {
            NativeEndPointManager.getInstance().mscOrFragmentStartDetectFFP(activity, Inner.shell.fragmentPathHelper(activity, obj, view));
        }
    }
}

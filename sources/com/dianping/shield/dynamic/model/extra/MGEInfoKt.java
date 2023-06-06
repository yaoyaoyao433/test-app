package com.dianping.shield.dynamic.model.extra;

import android.app.Activity;
import android.content.Context;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0019\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0080\b\u001a\u0019\u0010\u0005\u001a\u00020\u0001*\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0080\b¨\u0006\b"}, d2 = {"click", "", "Lcom/dianping/shield/dynamic/model/extra/MGEInfo;", PushConstants.INTENT_ACTIVITY_NAME, "Landroid/app/Activity;", "expose", "context", "Landroid/content/Context;", "shieldDynamic_release"}, k = 2, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class MGEInfoKt {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static final void expose(@Nullable MGEInfo mGEInfo, @Nullable Context context) {
        Object[] objArr = {mGEInfo, context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "aae07db0a2b90a8df4b2290a97aa0c61", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "aae07db0a2b90a8df4b2290a97aa0c61");
        } else if (mGEInfo != null) {
            Statistics.getChannel(mGEInfo.getCategory()).writeModelView(AppUtil.generatePageInfoKey(context), mGEInfo.getBid(), mGEInfo.getLabs(), mGEInfo.getCid());
        }
    }

    public static final void click(@Nullable MGEInfo mGEInfo, @Nullable Activity activity) {
        Object[] objArr = {mGEInfo, activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "61ebcef6963faac3d9857af24239509b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "61ebcef6963faac3d9857af24239509b");
        } else if (mGEInfo != null) {
            Statistics.getChannel(mGEInfo.getCategory()).writeModelClick(AppUtil.generatePageInfoKey(activity), mGEInfo.getBid(), mGEInfo.getLabs(), mGEInfo.getCid());
        }
    }
}

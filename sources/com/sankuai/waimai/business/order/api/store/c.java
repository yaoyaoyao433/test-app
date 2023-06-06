package com.sankuai.waimai.business.order.api.store;

import android.app.Activity;
import android.support.annotation.NonNull;
import com.sankuai.waimai.business.order.api.detail.common.IDynamicDialogCallback;
import com.sankuai.waimai.business.order.api.detail.common.IDynamicDialogController;
import com.sankuai.waimai.platform.mach.dialog.AlertInfo;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface c {
    IDynamicDialogController createDynamicDialog(Activity activity, AlertInfo alertInfo, @NonNull Map<String, Object> map, boolean z, IDynamicDialogCallback iDynamicDialogCallback);
}

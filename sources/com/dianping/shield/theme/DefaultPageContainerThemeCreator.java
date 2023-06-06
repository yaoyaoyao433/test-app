package com.dianping.shield.theme;

import android.support.constraint.R;
import com.dianping.shield.component.utils.PageContainerThemeCreator;
import com.dianping.shield.component.utils.PageContainerViewResCreater;
import com.meituan.robust.ChangeQuickRedirect;
import kotlin.Metadata;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/dianping/shield/theme/DefaultPageContainerThemeCreator;", "Lcom/dianping/shield/component/utils/PageContainerThemeCreator;", "()V", "shieldComponent_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class DefaultPageContainerThemeCreator extends PageContainerThemeCreator {
    public static ChangeQuickRedirect changeQuickRedirect;

    public DefaultPageContainerThemeCreator() {
        setLoadingResId(R.drawable.shielddc_default_loading_animation);
        setLoadingDefaultResId(R.drawable.shielddc_loading_default_image);
        setLoadingHeaderAnimId(R.drawable.shielddc_default_loading_animation);
        setDropDownArray(new int[]{R.drawable.shielddc_pull_mt_new_image, R.drawable.shielddc_progress_loading_image_01, R.drawable.shielddc_progress_loading_image_02, R.drawable.shielddc_progress_loading_image_03});
        setLoadErrorEmptyLayoutId(R.layout.shielddc_load_error_empty_view);
        setDefaultErrorMessage("请检查网络后点击重新加载");
        setPageContainerViewResCreate(new PageContainerViewResCreater());
        setLeftMargin(12);
        setRightMargin(12);
        setHeaderSize(30);
        setRefreshHeight(55);
        setLoadingCreatorNeedContext(LoadingDefaultCreator.INSTANCE);
    }
}

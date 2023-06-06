package com.sankuai.waimai.store.poi.list.widget;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.UiThread;
import android.support.constraint.R;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.shangou.stone.util.ImageQualityUtil;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.waimai.store.repository.model.VerticalityAcrossBanner;
import com.sankuai.waimai.store.router.d;
import com.sankuai.waimai.store.util.j;
import com.sankuai.waimai.store.util.m;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class VerticalityAcrossBannerView extends LinearLayout {
    public static ChangeQuickRedirect a;
    private com.sankuai.waimai.store.expose.v2.entity.b b;
    private com.sankuai.waimai.store.base.statistic.a c;

    public VerticalityAcrossBannerView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4bd4abaf1daac3b5959e96a96b0ecd78", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4bd4abaf1daac3b5959e96a96b0ecd78");
        } else {
            a();
        }
    }

    public VerticalityAcrossBannerView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef71108a711546b91f8f524b20b1e095", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef71108a711546b91f8f524b20b1e095");
        } else {
            a();
        }
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e56c8e0a84e56f0908cf109d7ca16d96", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e56c8e0a84e56f0908cf109d7ca16d96");
        } else {
            setOrientation(0);
        }
    }

    public void setOnEntityStatisticsListener(com.sankuai.waimai.store.base.statistic.a aVar) {
        this.c = aVar;
    }

    @UiThread
    public void setData(List<VerticalityAcrossBanner> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bad38c4ce5ecc9b569912d54e2c8374d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bad38c4ce5ecc9b569912d54e2c8374d");
        } else if (list != null && !com.sankuai.shangou.stone.util.a.b(list)) {
            removeAllViewsInLayout();
            final VerticalityAcrossBanner verticalityAcrossBanner = list.get(0);
            Object[] objArr2 = {verticalityAcrossBanner};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "40302184b54d6a6ae0ad79fd3913a140", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "40302184b54d6a6ae0ad79fd3913a140");
                return;
            }
            if (this.b == null && this.c != null) {
                this.b = this.c.a(this);
            }
            Context context = getContext();
            if (verticalityAcrossBanner == null || context == null) {
                return;
            }
            int dimension = (int) context.getResources().getDimension(R.dimen.wm_sc_common_dimen_100);
            ImageView imageView = new ImageView(context);
            ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            imageView.setAdjustViewBounds(true);
            imageView.setMinimumHeight(dimension);
            imageView.setMaxHeight(dimension * 2);
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            addView(imageView, layoutParams);
            if (TextUtils.isEmpty(verticalityAcrossBanner.picUrl)) {
                imageView.setImageResource(R.drawable.wm_st_page_main_home_img_banner_default);
            } else {
                b.C0608b a2 = m.a(verticalityAcrossBanner.picUrl, h.a(getContext()), ImageQualityUtil.a());
                a2.j = R.drawable.wm_st_page_main_home_img_banner_default;
                a2.i = R.drawable.wm_st_page_main_home_img_banner_default;
                a2.a(imageView);
            }
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.poi.list.widget.VerticalityAcrossBannerView.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Map map;
                    Object[] objArr3 = {view};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "8cb79a5b372c2115a322c8cdc226353a", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "8cb79a5b372c2115a322c8cdc226353a");
                        return;
                    }
                    Context context2 = VerticalityAcrossBannerView.this.getContext();
                    if (TextUtils.isEmpty(verticalityAcrossBanner.h5Url)) {
                        return;
                    }
                    if (VerticalityAcrossBannerView.this.c != null) {
                        VerticalityAcrossBannerView.this.c.a(VerticalityAcrossBannerView.this.a(verticalityAcrossBanner));
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append(verticalityAcrossBanner.id);
                    String sb2 = sb.toString();
                    long j = verticalityAcrossBanner.activityId;
                    Object[] objArr4 = {"b_mfxdj7wg", sb2, 0, new Long(j)};
                    ChangeQuickRedirect changeQuickRedirect4 = j.a;
                    if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "205e20161d8cfe8b4d3ffb042d794821", RobustBitConfig.DEFAULT_VALUE)) {
                        map = (Map) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "205e20161d8cfe8b4d3ffb042d794821");
                    } else {
                        HashMap hashMap = new HashMap();
                        hashMap.put("entry_id", "b_mfxdj7wg");
                        hashMap.put("entry_item_id", sb2);
                        hashMap.put("entry_index", "0");
                        hashMap.put("activity_id", String.valueOf(j));
                        map = hashMap;
                    }
                    d.a(context2, verticalityAcrossBanner.h5Url, map, context2.getString(R.string.wm_sc_common_activity_info));
                }
            });
            setVisibility(0);
            if (this.c != null) {
                this.c.a(this.b, 0, a(verticalityAcrossBanner));
            }
        } else {
            setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public Map<String, Object> a(@NonNull VerticalityAcrossBanner verticalityAcrossBanner) {
        Object[] objArr = {verticalityAcrossBanner};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e3775e33d2f41bef26b4b023e7be894", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e3775e33d2f41bef26b4b023e7be894");
        }
        HashMap hashMap = new HashMap();
        hashMap.put("entry_item_id", Integer.valueOf(verticalityAcrossBanner.id));
        hashMap.put("activity_id", Integer.valueOf(verticalityAcrossBanner.activityId));
        hashMap.put("target_type", Integer.valueOf(verticalityAcrossBanner.targetType));
        hashMap.put("entry_index", 0);
        hashMap.put("index", 0);
        return hashMap;
    }
}

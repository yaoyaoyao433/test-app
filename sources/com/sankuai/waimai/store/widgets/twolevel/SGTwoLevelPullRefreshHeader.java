package com.sankuai.waimai.store.widgets.twolevel;

import android.annotation.TargetApi;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.newwidgets.twolevel.SGRefreshHeaderHelper;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SGTwoLevelPullRefreshHeader extends FrameLayout {
    public static ChangeQuickRedirect a;
    public SGRefreshHeaderHelper.b b;
    private ImageView c;
    private boolean d;
    private int e;

    public SGTwoLevelPullRefreshHeader(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3269b845044100a5edc9b6c6bba0ec40", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3269b845044100a5edc9b6c6bba0ec40");
            return;
        }
        this.d = false;
        this.e = 0;
        this.b = new SGRefreshHeaderHelper.b() { // from class: com.sankuai.waimai.store.widgets.twolevel.SGTwoLevelPullRefreshHeader.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.newwidgets.twolevel.SGRefreshHeaderHelper.b
            public final void a() {
            }

            @Override // com.sankuai.waimai.store.newwidgets.twolevel.SGRefreshHeaderHelper.b
            public final void a(int i, float f, int i2, int i3, boolean z) {
            }

            @Override // com.sankuai.waimai.store.newwidgets.twolevel.SGRefreshHeaderHelper.b
            public final void b() {
            }

            @Override // com.sankuai.waimai.store.newwidgets.twolevel.SGRefreshHeaderHelper.b
            public final void c() {
            }

            @Override // com.sankuai.waimai.store.newwidgets.twolevel.SGRefreshHeaderHelper.b
            public final void d() {
            }

            @Override // com.sankuai.waimai.store.newwidgets.twolevel.SGRefreshHeaderHelper.b
            public final void a(int i) {
                Object[] objArr2 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ae39c8adf8330a3c4e3fdd92edd1b023", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ae39c8adf8330a3c4e3fdd92edd1b023");
                } else if (SGTwoLevelPullRefreshHeader.this.e == i) {
                } else {
                    try {
                        if (i == 0) {
                            SGTwoLevelPullRefreshHeader.this.c.setImageDrawable(null);
                        } else {
                            SGTwoLevelPullRefreshHeader.this.c.setImageResource(R.drawable.wm_sc_refreshing_header_animation);
                        }
                    } catch (Exception e) {
                        com.sankuai.waimai.foundation.utils.log.a.a(e);
                    }
                    if (i != 1 && i != 2 && i != 3 && i != 6) {
                        SGTwoLevelPullRefreshHeader.this.setVisibility(4);
                        SGTwoLevelPullRefreshHeader.this.e = i;
                    }
                    SGTwoLevelPullRefreshHeader.this.setVisibility(0);
                    SGTwoLevelPullRefreshHeader.this.e = i;
                }
            }
        };
        a(context);
    }

    public SGTwoLevelPullRefreshHeader(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c41e2c82c3f9344106464a1afc2998f8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c41e2c82c3f9344106464a1afc2998f8");
            return;
        }
        this.d = false;
        this.e = 0;
        this.b = new SGRefreshHeaderHelper.b() { // from class: com.sankuai.waimai.store.widgets.twolevel.SGTwoLevelPullRefreshHeader.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.newwidgets.twolevel.SGRefreshHeaderHelper.b
            public final void a() {
            }

            @Override // com.sankuai.waimai.store.newwidgets.twolevel.SGRefreshHeaderHelper.b
            public final void a(int i, float f, int i2, int i3, boolean z) {
            }

            @Override // com.sankuai.waimai.store.newwidgets.twolevel.SGRefreshHeaderHelper.b
            public final void b() {
            }

            @Override // com.sankuai.waimai.store.newwidgets.twolevel.SGRefreshHeaderHelper.b
            public final void c() {
            }

            @Override // com.sankuai.waimai.store.newwidgets.twolevel.SGRefreshHeaderHelper.b
            public final void d() {
            }

            @Override // com.sankuai.waimai.store.newwidgets.twolevel.SGRefreshHeaderHelper.b
            public final void a(int i) {
                Object[] objArr2 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ae39c8adf8330a3c4e3fdd92edd1b023", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ae39c8adf8330a3c4e3fdd92edd1b023");
                } else if (SGTwoLevelPullRefreshHeader.this.e == i) {
                } else {
                    try {
                        if (i == 0) {
                            SGTwoLevelPullRefreshHeader.this.c.setImageDrawable(null);
                        } else {
                            SGTwoLevelPullRefreshHeader.this.c.setImageResource(R.drawable.wm_sc_refreshing_header_animation);
                        }
                    } catch (Exception e) {
                        com.sankuai.waimai.foundation.utils.log.a.a(e);
                    }
                    if (i != 1 && i != 2 && i != 3 && i != 6) {
                        SGTwoLevelPullRefreshHeader.this.setVisibility(4);
                        SGTwoLevelPullRefreshHeader.this.e = i;
                    }
                    SGTwoLevelPullRefreshHeader.this.setVisibility(0);
                    SGTwoLevelPullRefreshHeader.this.e = i;
                }
            }
        };
        a(context);
    }

    public SGTwoLevelPullRefreshHeader(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f47767fb86af765e8969245dfbdd3c62", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f47767fb86af765e8969245dfbdd3c62");
            return;
        }
        this.d = false;
        this.e = 0;
        this.b = new SGRefreshHeaderHelper.b() { // from class: com.sankuai.waimai.store.widgets.twolevel.SGTwoLevelPullRefreshHeader.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.newwidgets.twolevel.SGRefreshHeaderHelper.b
            public final void a() {
            }

            @Override // com.sankuai.waimai.store.newwidgets.twolevel.SGRefreshHeaderHelper.b
            public final void a(int i2, float f, int i22, int i3, boolean z) {
            }

            @Override // com.sankuai.waimai.store.newwidgets.twolevel.SGRefreshHeaderHelper.b
            public final void b() {
            }

            @Override // com.sankuai.waimai.store.newwidgets.twolevel.SGRefreshHeaderHelper.b
            public final void c() {
            }

            @Override // com.sankuai.waimai.store.newwidgets.twolevel.SGRefreshHeaderHelper.b
            public final void d() {
            }

            @Override // com.sankuai.waimai.store.newwidgets.twolevel.SGRefreshHeaderHelper.b
            public final void a(int i2) {
                Object[] objArr2 = {Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ae39c8adf8330a3c4e3fdd92edd1b023", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ae39c8adf8330a3c4e3fdd92edd1b023");
                } else if (SGTwoLevelPullRefreshHeader.this.e == i2) {
                } else {
                    try {
                        if (i2 == 0) {
                            SGTwoLevelPullRefreshHeader.this.c.setImageDrawable(null);
                        } else {
                            SGTwoLevelPullRefreshHeader.this.c.setImageResource(R.drawable.wm_sc_refreshing_header_animation);
                        }
                    } catch (Exception e) {
                        com.sankuai.waimai.foundation.utils.log.a.a(e);
                    }
                    if (i2 != 1 && i2 != 2 && i2 != 3 && i2 != 6) {
                        SGTwoLevelPullRefreshHeader.this.setVisibility(4);
                        SGTwoLevelPullRefreshHeader.this.e = i2;
                    }
                    SGTwoLevelPullRefreshHeader.this.setVisibility(0);
                    SGTwoLevelPullRefreshHeader.this.e = i2;
                }
            }
        };
        a(context);
    }

    @TargetApi(21)
    public SGTwoLevelPullRefreshHeader(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b8de41fd862ca1e9cb29d3b9e9d6e68", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b8de41fd862ca1e9cb29d3b9e9d6e68");
            return;
        }
        this.d = false;
        this.e = 0;
        this.b = new SGRefreshHeaderHelper.b() { // from class: com.sankuai.waimai.store.widgets.twolevel.SGTwoLevelPullRefreshHeader.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.newwidgets.twolevel.SGRefreshHeaderHelper.b
            public final void a() {
            }

            @Override // com.sankuai.waimai.store.newwidgets.twolevel.SGRefreshHeaderHelper.b
            public final void a(int i22, float f, int i222, int i3, boolean z) {
            }

            @Override // com.sankuai.waimai.store.newwidgets.twolevel.SGRefreshHeaderHelper.b
            public final void b() {
            }

            @Override // com.sankuai.waimai.store.newwidgets.twolevel.SGRefreshHeaderHelper.b
            public final void c() {
            }

            @Override // com.sankuai.waimai.store.newwidgets.twolevel.SGRefreshHeaderHelper.b
            public final void d() {
            }

            @Override // com.sankuai.waimai.store.newwidgets.twolevel.SGRefreshHeaderHelper.b
            public final void a(int i22) {
                Object[] objArr2 = {Integer.valueOf(i22)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ae39c8adf8330a3c4e3fdd92edd1b023", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ae39c8adf8330a3c4e3fdd92edd1b023");
                } else if (SGTwoLevelPullRefreshHeader.this.e == i22) {
                } else {
                    try {
                        if (i22 == 0) {
                            SGTwoLevelPullRefreshHeader.this.c.setImageDrawable(null);
                        } else {
                            SGTwoLevelPullRefreshHeader.this.c.setImageResource(R.drawable.wm_sc_refreshing_header_animation);
                        }
                    } catch (Exception e) {
                        com.sankuai.waimai.foundation.utils.log.a.a(e);
                    }
                    if (i22 != 1 && i22 != 2 && i22 != 3 && i22 != 6) {
                        SGTwoLevelPullRefreshHeader.this.setVisibility(4);
                        SGTwoLevelPullRefreshHeader.this.e = i22;
                    }
                    SGTwoLevelPullRefreshHeader.this.setVisibility(0);
                    SGTwoLevelPullRefreshHeader.this.e = i22;
                }
            }
        };
        a(context);
    }

    public SGRefreshHeaderHelper.b getOnSGTwoLevelListener() {
        return this.b;
    }

    private void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4fb6fb78f74df90163306b315bc30b60", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4fb6fb78f74df90163306b315bc30b60");
            return;
        }
        u.b(this, 0, 0, 0, 0);
        this.c = (ImageView) LayoutInflater.from(context).inflate(R.layout.wm_sg_common_ptr_layout_header, (ViewGroup) this, true).findViewById(R.id.refresh_img);
    }
}

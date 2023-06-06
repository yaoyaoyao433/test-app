package com.sankuai.waimai.business.search.ui.result.view;

import android.support.constraint.R;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.waimai.business.search.datatype.ForbiddenInfo;
import com.sankuai.waimai.business.search.datatype.NoResultRemindInfoData;
import com.sankuai.waimai.business.search.ui.GlobalSearchActivity;
import com.sankuai.waimai.foundation.utils.ImageQualityUtil;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.platform.widget.emptylayout.d;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends d {
    public static ChangeQuickRedirect a;

    public a(View view, int i) {
        super(view, (int) R.id.search_abnormal_view);
        Object[] objArr = {view, Integer.valueOf((int) R.id.search_abnormal_view)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0524bb0f8c94dae9c34f01ba0bbeb17b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0524bb0f8c94dae9c34f01ba0bbeb17b");
            return;
        }
        Object[] objArr2 = {view.getContext()};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e04a6febf8beb7738c1b27eca0264f94", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e04a6febf8beb7738c1b27eca0264f94");
        } else {
            a(2, 3);
        }
    }

    public final void a(final NoResultRemindInfoData noResultRemindInfoData, final boolean z) {
        Object[] objArr = {noResultRemindInfoData, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0911c03c2a291a53d99cd69585c1ced4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0911c03c2a291a53d99cd69585c1ced4");
        } else if (noResultRemindInfoData != null) {
            b.C0608b a2 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
            a2.b = a().getContext();
            a2.c = noResultRemindInfoData.noResultRemindIcon;
            a2.f = ImageQualityUtil.b();
            a2.i = R.drawable.wm_common_default_empty_icon;
            a2.j = R.drawable.wm_common_default_empty_icon;
            a2.a(new b.d() { // from class: com.sankuai.waimai.business.search.ui.result.view.a.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.meituan.mtimageloader.config.b.d
                public final void a() {
                    String str;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7394bcfbd48343d051cf37c0fc391d17", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7394bcfbd48343d051cf37c0fc391d17");
                        return;
                    }
                    a aVar = a.this;
                    d.b bVar = d.b.EMPTY;
                    if (TextUtils.isEmpty(noResultRemindInfoData.noResultRemindContext)) {
                        str = a.this.d(z ? R.string.wm_nox_search_no_filter_result : R.string.wm_nox_search_default_noresult_text);
                    } else {
                        str = noResultRemindInfoData.noResultRemindContext;
                    }
                    aVar.a(bVar, 0, str, noResultRemindInfoData.noResultRemindAdditionalContext, null, null);
                    a.this.l();
                    a.this.z.setVisibility(0);
                }

                @Override // com.sankuai.meituan.mtimageloader.config.b.d
                public final void a(int i, Exception exc) {
                    String str;
                    Object[] objArr2 = {Integer.valueOf(i), exc};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "220d2e40d9eb17ed1e37e0504ac22b96", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "220d2e40d9eb17ed1e37e0504ac22b96");
                        return;
                    }
                    a aVar = a.this;
                    d.b bVar = d.b.EMPTY;
                    if (TextUtils.isEmpty(noResultRemindInfoData.noResultRemindContext)) {
                        str = a.this.d(z ? R.string.wm_nox_search_no_filter_result : R.string.wm_nox_search_default_noresult_text);
                    } else {
                        str = noResultRemindInfoData.noResultRemindContext;
                    }
                    aVar.a(bVar, 0, str, noResultRemindInfoData.noResultRemindAdditionalContext, null, null);
                    a.this.l();
                    a.this.z.setVisibility(0);
                }
            }).a(this.z);
        } else {
            a(d.b.EMPTY, R.drawable.wm_common_default_empty_icon, d(z ? R.string.wm_nox_search_no_filter_result : R.string.wm_nox_search_default_noresult_text), d(R.string.wm_nox_search_default_noresult_text), null, null);
            l();
        }
    }

    public final void a(final ForbiddenInfo forbiddenInfo) {
        Object[] objArr = {forbiddenInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b41a5009bda291ddc68db536dbb97494", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b41a5009bda291ddc68db536dbb97494");
        } else if (forbiddenInfo != null) {
            b.C0608b a2 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
            a2.b = a().getContext();
            a2.c = forbiddenInfo.forbiddenIcon;
            a2.f = ImageQualityUtil.b();
            a2.i = R.drawable.wm_nox_search_forbidden_icon;
            a2.j = R.drawable.wm_nox_search_forbidden_icon;
            a2.a(new b.d() { // from class: com.sankuai.waimai.business.search.ui.result.view.a.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.meituan.mtimageloader.config.b.d
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6d9338f6d5f45be0b38dfe6b5f466e98", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6d9338f6d5f45be0b38dfe6b5f466e98");
                        return;
                    }
                    a.this.a(d.b.DATA_ERROR, 0, TextUtils.isEmpty(forbiddenInfo.forbiddenRemindContext) ? a.this.d(R.string.wm_nox_search_default_forbidden_text) : forbiddenInfo.forbiddenRemindContext, forbiddenInfo.forbiddenAdditionalContext, null, null);
                    a.this.l();
                    a.this.z.setVisibility(0);
                }

                @Override // com.sankuai.meituan.mtimageloader.config.b.d
                public final void a(int i, Exception exc) {
                    Object[] objArr2 = {Integer.valueOf(i), exc};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "487c2e185613b5b96c021430fecc2838", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "487c2e185613b5b96c021430fecc2838");
                        return;
                    }
                    a.this.a(d.b.DATA_ERROR, 0, TextUtils.isEmpty(forbiddenInfo.forbiddenRemindContext) ? a.this.d(R.string.wm_nox_search_default_forbidden_text) : forbiddenInfo.forbiddenRemindContext, forbiddenInfo.forbiddenAdditionalContext, null, null);
                    a.this.l();
                    a.this.z.setVisibility(0);
                }
            }).a(this.z);
        } else {
            a(d.b.DATA_ERROR, R.drawable.wm_nox_search_forbidden_icon, d(R.string.wm_nox_search_default_forbidden_text), d(R.string.wm_nox_search_default_abnormal_view_sub_text), null, null);
            l();
        }
    }

    public final void a(View.OnClickListener onClickListener, Throwable th) {
        Object[] objArr = {onClickListener, th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2b6b9aaa8b8f7481c5c67088998712fd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2b6b9aaa8b8f7481c5c67088998712fd");
            return;
        }
        a(d(R.string.wm_nox_search_loading_fail_try_afterwhile), new com.sankuai.waimai.platform.widget.emptylayout.b(th, true));
        l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d5f7df4abcaacf0651fcfb8c46d28470", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d5f7df4abcaacf0651fcfb8c46d28470");
            return;
        }
        m();
        if (this.u instanceof GlobalSearchActivity) {
            if (((GlobalSearchActivity) this.u).b()) {
                o();
            } else {
                n();
            }
        }
        this.v.postInvalidate();
    }

    private void m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9017369d6fe2e56742740e8afdcca194", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9017369d6fe2e56742740e8afdcca194");
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.z.getLayoutParams();
        layoutParams.width = g.a(this.u, 200.0f);
        layoutParams.height = g.a(this.u, 150.0f);
        this.z.setLayoutParams(layoutParams);
    }

    private void n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a95a74ab768edcfabbead9057899960", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a95a74ab768edcfabbead9057899960");
            return;
        }
        this.A.setTextSize(13.0f);
        this.A.setTextColor(this.u.getResources().getColor(R.color.wm_nox_search_575859));
        this.B.setTextSize(11.0f);
    }

    private void o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea2fdda07be96f7dbb14c997c1b93b95", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea2fdda07be96f7dbb14c997c1b93b95");
            return;
        }
        this.A.setTextSize(24.0f);
        this.A.setTextColor(this.u.getResources().getColor(R.color.wm_nox_search_222426));
        this.B.setTextSize(20.0f);
    }
}

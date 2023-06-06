package com.sankuai.waimai.business.search.ui.result.noresult;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.search.datatype.d;
import javax.annotation.Nullable;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c extends com.sankuai.waimai.platform.base.a<d, Nullable> {
    public static ChangeQuickRedirect a;
    private TextView b;

    @Override // com.sankuai.waimai.platform.base.a
    public final /* synthetic */ void a(int i, @NonNull d dVar) {
        d dVar2 = dVar;
        Object[] objArr = {Integer.valueOf(i), dVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "458599cc8c9b084369ac5494d9a04f9c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "458599cc8c9b084369ac5494d9a04f9c");
        } else if (TextUtils.isEmpty(dVar2.a)) {
            this.b.setText(this.y.getResources().getString(R.string.wm_nox_search_no_result));
        } else {
            this.b.setText(dVar2.a);
        }
    }

    public c(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3040e6e9de4d78521469dd9a1f48365c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3040e6e9de4d78521469dd9a1f48365c");
        }
    }

    @Override // com.sankuai.waimai.platform.base.b
    public final View a(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "94735802edbc93a19dc15555457253fd", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "94735802edbc93a19dc15555457253fd");
        }
        View inflate = layoutInflater.inflate(R.layout.wm_nox_search_nonresult_item, viewGroup, false);
        this.b = (TextView) inflate.findViewById(R.id.nonresult_text);
        return inflate;
    }
}
